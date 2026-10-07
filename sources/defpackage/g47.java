package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g47 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h47 b;

    public /* synthetic */ g47(h47 h47Var, int i) {
        this.a = i;
        this.b = h47Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        h47 h47Var = this.b;
        o47 o47Var = (o47) obj;
        switch (i) {
            case 0:
                t47 t47Var = (t47) h47Var.g;
                if (t47Var != null) {
                    ((gve) t47Var).e(o47Var);
                }
                break;
            default:
                t47 t47Var2 = (t47) h47Var.g;
                if (t47Var2 != null) {
                    ((gve) t47Var2).e(o47Var);
                }
                break;
        }
        return sbiVar;
    }
}
