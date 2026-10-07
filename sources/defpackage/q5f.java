package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q5f implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cf7 b;

    public /* synthetic */ q5f(int i, cf7 cf7Var) {
        this.a = i;
        this.b = cf7Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        cf7 cf7Var = this.b;
        switch (i) {
            case 0:
                cf7Var.invoke(r5f.a);
                break;
            case 1:
                cf7Var.invoke(r5f.b);
                break;
            case 2:
                cf7Var.invoke(r5f.c);
                break;
            default:
                cf7Var.invoke(ohg.b);
                break;
        }
        return sbiVar;
    }
}
