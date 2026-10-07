package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class n9g implements jj6 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public lj6 f;
    public kyh g;

    public n9g(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        this.f = lj6Var;
        kyh kyhVarG = lj6Var.G(1024, 4);
        this.g = kyhVarG;
        a87 a87Var = new a87();
        String str = this.c;
        a87Var.l = uya.n(str);
        a87Var.m = uya.n(str);
        ewi.n(a87Var, kyhVarG);
        this.f.D();
        this.f.r(new t9g());
        this.e = 1;
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        int i = this.b;
        int i2 = this.a;
        lvb.b0((i2 == -1 || i == -1) ? false : true);
        nmc nmcVar = new nmc(i);
        kj6Var.u(0, nmcVar.a, i);
        return nmcVar.H() == i2;
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            c.t();
            return 0;
        }
        kyh kyhVar = this.g;
        kyhVar.getClass();
        int iC = kyhVar.c(kj6Var, 1024, true);
        if (iC != -1) {
            this.d += iC;
            return 0;
        }
        this.e = 2;
        this.g.a(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // defpackage.jj6
    public final void release() {
    }
}
