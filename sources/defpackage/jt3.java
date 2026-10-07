package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jt3 implements xye {
    public final xye a;
    public boolean b;
    public final /* synthetic */ kt3 c;

    public jt3(kt3 kt3Var, xye xyeVar) {
        this.c = kt3Var;
        this.a = xyeVar;
    }

    @Override // defpackage.xye
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.xye
    public final int f(v2a v2aVar, u55 u55Var, int i) {
        kt3 kt3Var = this.c;
        if (kt3Var.b()) {
            return -3;
        }
        if (this.b) {
            u55Var.a = 4;
            return -4;
        }
        long jV = kt3Var.v();
        int iF = this.a.f(v2aVar, u55Var, i);
        if (iF != -5) {
            long j = kt3Var.g;
            if (j == Long.MIN_VALUE || ((iF != -4 || u55Var.f < j) && !(iF == -3 && jV == Long.MIN_VALUE && !u55Var.e))) {
                return iF;
            }
            u55Var.q();
            u55Var.a = 4;
            this.b = true;
            return -4;
        }
        b87 b87Var = (b87) v2aVar.c;
        b87Var.getClass();
        int i2 = b87Var.J;
        int i3 = b87Var.I;
        if (i3 == 0 && i2 == 0) {
            return -5;
        }
        if (kt3Var.f != 0) {
            i3 = 0;
        }
        if (kt3Var.g != Long.MIN_VALUE) {
            i2 = 0;
        }
        a87 a87VarA = b87Var.a();
        a87VarA.H = i3;
        a87VarA.I = i2;
        v2aVar.c = new b87(a87VarA);
        return -5;
    }

    @Override // defpackage.xye
    public final boolean m() {
        return !this.c.b() && this.a.m();
    }

    @Override // defpackage.xye
    public final int o(long j) {
        if (this.c.b()) {
            return -3;
        }
        return this.a.o(j);
    }
}
