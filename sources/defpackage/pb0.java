package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class pb0 {
    public final dq4 a;
    public final ks9 b = new ks9(11);
    public final Object c = new Object();
    public final LinkedHashMap d = new LinkedHashMap();
    public final CopyOnWriteArrayList e = new CopyOnWriteArrayList();

    public pb0(zqh zqhVar, qg2 qg2Var, vo8 vo8Var) {
        this.a = cqk.a(lvb.x0(new nah(vo8Var), lvb.x0(zqhVar.h, new du4("CXCP-AudioRestrictionControllerImpl"))));
        qg2Var.a(new c3(10, this), 2);
    }

    public final qb0 a() {
        LinkedHashMap linkedHashMap = this.d;
        if (linkedHashMap.containsValue(new qb0(3))) {
            return new qb0(3);
        }
        synchronized (this.c) {
        }
        if (linkedHashMap.containsValue(new qb0(1))) {
            return new qb0(1);
        }
        synchronized (this.c) {
        }
        if (linkedHashMap.containsValue(new qb0(0))) {
            return new qb0(0);
        }
        synchronized (this.c) {
        }
        return null;
    }
}
