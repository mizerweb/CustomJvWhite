package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class csh implements xye {
    public final xye a;
    public final long b;

    public csh(xye xyeVar, long j) {
        this.a = xyeVar;
        this.b = j;
    }

    @Override // defpackage.xye
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.xye
    public final int f(v2a v2aVar, u55 u55Var, int i) {
        int iF = this.a.f(v2aVar, u55Var, i);
        if (iF == -4) {
            u55Var.f += this.b;
        }
        return iF;
    }

    @Override // defpackage.xye
    public final boolean m() {
        return this.a.m();
    }

    @Override // defpackage.xye
    public final int o(long j) {
        return this.a.o(j - this.b);
    }
}
