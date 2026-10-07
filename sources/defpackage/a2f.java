package defpackage;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a2f {
    public final Long a;
    public final String b;
    public final Object c;
    public final /* synthetic */ c2f d;

    public a2f(c2f c2fVar, String str, Long l, Object obj) {
        this.d = c2fVar;
        this.a = l;
        this.b = str;
        this.c = obj;
    }

    public final void a() {
        ConcurrentHashMap concurrentHashMap;
        c2f c2fVar = this.d;
        Long l = this.a;
        String str = this.b;
        Object obj = this.c;
        String str2 = c2fVar.g;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.e;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str2, "cancelScheduling owner=" + str + ", value=" + obj, null);
            }
        }
        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) c2fVar.k.get(l);
        Set set = concurrentHashMap2 != null ? (Set) concurrentHashMap2.computeIfPresent(obj, new mw1(14, new z1f(c2fVar, str, l, obj))) : null;
        if (set == null || !set.isEmpty() || (concurrentHashMap = (ConcurrentHashMap) c2fVar.k.get(l)) == null) {
            return;
        }
        concurrentHashMap.remove(obj, set);
    }
}
