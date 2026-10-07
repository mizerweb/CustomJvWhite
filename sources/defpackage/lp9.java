package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lp9 extends dp9 {
    public final dp9 a;
    public final /* synthetic */ int b;
    public final Object c;

    public lp9(dp9 dp9Var, Object obj, int i) {
        this.b = i;
        this.a = dp9Var;
        this.c = obj;
    }

    @Override // defpackage.dp9
    public final void c(mp9 mp9Var) {
        int i = this.b;
        Object obj = this.c;
        int i2 = 0;
        dp9 dp9Var = this.a;
        switch (i) {
            case 0:
                dp9Var.a(new kp9(mp9Var, (z2f) obj, 0));
                break;
            case 1:
                o72 o72Var = new o72(mp9Var);
                mp9Var.c(o72Var);
                j66 j66Var = (j66) o72Var.b;
                ko5 ko5VarB = ((z2f) obj).b(new og7(o72Var, 10, dp9Var));
                j66Var.getClass();
                oo5.d(j66Var, ko5VarB);
                break;
            default:
                dp9Var.a(new np9(mp9Var, i2, this));
                break;
        }
    }
}
