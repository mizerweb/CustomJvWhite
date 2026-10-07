package defpackage;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class jfa {
    public final wmi a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final String e = jfa.class.getName();
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public final ConcurrentHashMap g = new ConcurrentHashMap();
    public final ConcurrentHashMap h = new ConcurrentHashMap();
    public final ConcurrentHashMap i = new ConcurrentHashMap();

    public jfa(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, wmi wmiVar) {
        this.a = wmiVar;
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
    }

    public final void a(rt2 rt2Var, String str) {
        Set set = (Set) this.h.get(Long.valueOf(rt2Var.A()));
        if (set == null) {
            set = c76.a;
        }
        if (!set.isEmpty()) {
            c(rt2Var, set, str);
            return;
        }
        String str2 = this.e;
        a4c a4cVar = gm0.f;
        if (a4cVar == null) {
            return;
        }
        je9 je9Var = je9.d;
        if (a4cVar.b(je9Var)) {
            a4cVar.c(je9Var, str2, nbh.s(rt2Var.A(), "can't restart viewport polling for chat#", ": no last viewport post ids"), null);
        }
    }

    public final void b(long j) {
        this.g.remove(Long.valueOf(j));
        this.f.remove(Long.valueOf(j));
        vo8 vo8Var = (vo8) this.i.remove(Long.valueOf(j));
        if (vo8Var != null) {
            vo8Var.b(null);
        }
    }

    public final void c(rt2 rt2Var, Set set, String str) {
        long jA = rt2Var.A();
        boolean zQ = ((f5d) ((wo6) this.c.getValue())).q();
        ConcurrentHashMap concurrentHashMap = this.h;
        if (!zQ || !rt2Var.d0() || set.isEmpty()) {
            b(jA);
            concurrentHashMap.remove(Long.valueOf(jA));
            return;
        }
        concurrentHashMap.put(Long.valueOf(jA), set);
        this.g.put(Long.valueOf(jA), rt2Var);
        this.f.put(Long.valueOf(jA), set);
        this.i.compute(Long.valueOf(jA), new mw1(2, new ifa(this, jA, str, 0)));
    }
}
