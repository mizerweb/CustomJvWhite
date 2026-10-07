package defpackage;

import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes2.dex */
public final class c5h implements eq4, AutoCloseable {
    public static final Logger b = Logger.getLogger(c5h.class.getName());
    public final b5h a;

    public c5h() {
        nqh nqhVar = nqh.a;
        this.a = new b5h(new ConcurrentHashMap());
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        b5h b5hVar;
        while (true) {
            b5hVar = this.a;
            Reference referencePoll = b5hVar.poll();
            if (referencePoll == null) {
                break;
            } else {
                b5hVar.a.remove(referencePoll);
            }
        }
        ConcurrentHashMap concurrentHashMap = b5hVar.b;
        List list = (List) concurrentHashMap.values().stream().filter(new e05(13)).collect(Collectors.toList());
        concurrentHashMap.clear();
        if (list.isEmpty()) {
            return;
        }
        if (list.size() > 1) {
            b.log(Level.SEVERE, "Multiple scopes leaked - first will be thrown as an error.");
            Iterator it = list.iterator();
            if (it.hasNext()) {
                throw qt4.h(it);
            }
        }
        list.get(0).getClass();
        ore.m();
    }

    @Override // defpackage.eq4
    public final lp4 current() {
        return nqh.a.current();
    }
}
