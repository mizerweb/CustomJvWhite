package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vu7 implements jj6 {
    public final jj6 a;
    public final boolean b;

    public vu7(int i) {
        boolean z = (i & 1) != 0;
        this.b = z;
        if (z) {
            this.a = new n9g(-1, -1, "image/heif");
        } else {
            this.a = new uu7();
        }
    }

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        this.a.A(lj6Var);
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        return this.b ? z0m.b(kj6Var, false) : this.a.b(kj6Var);
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        this.a.g(j, j2);
    }

    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) {
        return this.a.l(kj6Var, s8Var);
    }

    @Override // defpackage.jj6
    public final void release() {
        this.a.release();
    }
}
