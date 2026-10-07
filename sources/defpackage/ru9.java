package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ru9 implements gv9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jv9 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ru9(jv9 jv9Var, int i, int i2) {
        this.a = i2;
        this.b = jv9Var;
        this.c = i;
    }

    @Override // defpackage.gv9
    public final void c(e38 e38Var, int i) {
        int i2 = this.a;
        int i3 = this.c;
        jv9 jv9Var = this.b;
        switch (i2) {
            case 0:
                e38Var.r(jv9Var.c, i, i3);
                break;
            case 1:
                e38Var.n(jv9Var.c, i, i3);
                break;
            default:
                e38Var.i0(jv9Var.c, i, i3);
                break;
        }
    }
}
