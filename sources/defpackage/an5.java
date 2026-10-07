package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class an5 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dn5 b;

    public /* synthetic */ an5(dn5 dn5Var, int i) {
        this.a = i;
        this.b = dn5Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        dn5 dn5Var = this.b;
        switch (i) {
            case 0:
                return new cn5(dn5Var);
            case 1:
                return dn5Var.a.l(dn5Var.e);
            default:
                return dn5Var.a.l(dn5Var.f);
        }
    }
}
