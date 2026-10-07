package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class wu9 implements gv9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jv9 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ wu9(jv9 jv9Var, boolean z, int i) {
        this.a = i;
        this.b = jv9Var;
        this.c = z;
    }

    @Override // defpackage.gv9
    public final void c(e38 e38Var, int i) {
        int i2 = this.a;
        boolean z = this.c;
        jv9 jv9Var = this.b;
        switch (i2) {
            case 0:
                e38Var.j0(jv9Var.c, i, z);
                break;
            default:
                e38Var.t(jv9Var.c, i, z);
                break;
        }
    }
}
