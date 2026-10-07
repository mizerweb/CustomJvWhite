package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class uz0 implements jj6 {
    public final /* synthetic */ int a;
    public final n9g b;

    public uz0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new n9g(35152, 2, "image/png");
                break;
            default:
                this.b = new n9g(16973, 2, "image/bmp");
                break;
        }
    }

    private final void a() {
    }

    private final void c() {
    }

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        int i = this.a;
        n9g n9gVar = this.b;
        switch (i) {
            case 0:
                n9gVar.A(lj6Var);
                break;
            default:
                n9gVar.A(lj6Var);
                break;
        }
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        int i = this.a;
        n9g n9gVar = this.b;
        switch (i) {
            case 0:
                break;
        }
        return n9gVar.b(kj6Var);
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        int i = this.a;
        n9g n9gVar = this.b;
        switch (i) {
            case 0:
                n9gVar.g(j, j2);
                break;
            default:
                n9gVar.g(j, j2);
                break;
        }
    }

    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) {
        int i = this.a;
        n9g n9gVar = this.b;
        switch (i) {
            case 0:
                break;
        }
        return n9gVar.l(kj6Var, s8Var);
    }

    @Override // defpackage.jj6
    public final void release() {
        int i = this.a;
    }
}
