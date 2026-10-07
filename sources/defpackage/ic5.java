package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ic5 implements jj6 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public ic5(int i) {
        if ((i & 1) != 0) {
            this.b = new n9g(65496, 2, "image/jpeg");
        } else {
            this.b = new zr8();
        }
    }

    private final void a() {
    }

    private final void c(long j, long j2) {
    }

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                kyh kyhVarG = lj6Var.G(0, 3);
                lj6Var.r(new vk0(-9223372036854775807L));
                lj6Var.D();
                b87 b87Var = (b87) obj;
                a87 a87VarA = b87Var.a();
                a87VarA.m = uya.n("text/x-unknown");
                a87VarA.j = b87Var.n;
                ewi.n(a87VarA, kyhVarG);
                break;
            default:
                ((jj6) obj).A(lj6Var);
                break;
        }
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return ((jj6) this.b).b(kj6Var);
        }
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((jj6) this.b).g(j, j2);
                break;
        }
    }

    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) {
        switch (this.a) {
            case 0:
                return kj6Var.C(Integer.MAX_VALUE) == -1 ? -1 : 0;
            default:
                return ((jj6) this.b).l(kj6Var, s8Var);
        }
    }

    @Override // defpackage.jj6
    public final void release() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((jj6) this.b).release();
                break;
        }
    }

    public ic5(b87 b87Var) {
        this.b = b87Var;
    }
}
