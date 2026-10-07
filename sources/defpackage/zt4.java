package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zt4 extends n0 implements yt4 {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ yt4 c;
    public final /* synthetic */ uf7 d;

    /* JADX WARN: Illegal instructions before constructor call */
    public zt4(z00 z00Var, yt4 yt4Var) {
        nhb nhbVar = nhb.f;
        this.d = z00Var;
        this.c = yt4Var;
        super(nhbVar);
    }

    @Override // defpackage.yt4
    public final void r0(vt4 vt4Var, Throwable th) {
        int i = this.b;
        yt4 yt4Var = this.c;
        uf7 uf7Var = this.d;
        switch (i) {
            case 0:
                yt4Var.r0(vt4Var, (Throwable) ((cf7) uf7Var).invoke(th));
                break;
            default:
                ((z00) uf7Var).invoke(vt4Var, th);
                yt4Var.r0(vt4Var, th);
                break;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zt4(yt4 yt4Var, cf7 cf7Var) {
        nhb nhbVar = nhb.f;
        this.c = yt4Var;
        this.d = cf7Var;
        super(nhbVar);
    }
}
