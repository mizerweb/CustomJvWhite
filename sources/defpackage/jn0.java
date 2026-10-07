package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jn0 {
    public final in0 a;
    public final et3 b;
    public final mz7 c;
    public final gue d;

    public jn0(in0 in0Var, et3 et3Var, mz7 mz7Var, gue gueVar) {
        this.a = in0Var;
        this.b = et3Var;
        this.c = mz7Var;
        this.d = gueVar;
    }

    public static final boolean a(jn0 jn0Var, vm0 vm0Var) {
        jn0Var.getClass();
        long j = vm0Var.c * 60000;
        s7f s7fVar = (s7f) jn0Var.b;
        long jLongValue = ((Number) s7fVar.f0.m(s7fVar, s7f.j0[54])).longValue();
        return jn0Var.b() && jn0Var.d.e() && ((jLongValue > 0L ? 1 : (jLongValue == 0L ? 0 : -1)) <= 0 || ((System.currentTimeMillis() - jLongValue) > j ? 1 : ((System.currentTimeMillis() - jLongValue) == j ? 0 : -1)) >= 0);
    }

    public final boolean b() {
        xm0 xm0Var = (xm0) this.a.j.getValue();
        if (xm0Var instanceof vm0) {
            if (!this.a.e()) {
                return true;
            }
            gm0.n("KeepBackground", "shouldObserve: feature already enabled");
            return false;
        }
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, "KeepBackground", "shouldObserve: PMS disabled (config=" + xm0Var + ")", null);
            }
        }
        return false;
    }
}
