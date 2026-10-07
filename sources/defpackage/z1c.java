package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z1c {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final cf7 h;
    public final cf7 i;
    public final yd6 j;

    public z1c(boolean z, boolean z2, boolean z3, long j, long j2, boolean z4, boolean z5, cf7 cf7Var, cf7 cf7Var2, yd6 yd6Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = j;
        this.e = j2;
        this.f = z4;
        this.g = z5;
        this.h = cf7Var;
        this.i = cf7Var2;
        this.j = yd6Var;
    }

    public final String toString() {
        String strT = ew5.t(this.d);
        String strT2 = ew5.t(this.e);
        StringBuilder sbB = zo5.B("WatchdogConfig(isEnabled=", this.a, ", idleSleepEnabled=", this.b, ", schedulerEnabled=");
        sbB.append(this.c);
        sbB.append(", stuckThreshold=");
        sbB.append(strT);
        sbB.append(", hangThreshold=");
        sbB.append(strT2);
        sbB.append(", saveStacktrace=");
        sbB.append(this.f);
        sbB.append(", useShortMeta=");
        return qt4.r(sbB, this.g, ")");
    }

    public /* synthetic */ z1c(boolean z, long j, long j2, cf7 cf7Var, cf7 cf7Var2, yd6 yd6Var, int i) {
        this(z, false, false, j, j2, false, true, cf7Var, cf7Var2, yd6Var);
    }
}
