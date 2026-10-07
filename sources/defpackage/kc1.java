package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kc1 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ny8 b;

    public /* synthetic */ kc1(ny8 ny8Var, int i) {
        this.a = i;
        this.b = ny8Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        ny8 ny8Var = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                xb9 xb9Var = (xb9) ((et3) ny8Var.getValue());
                xb9Var.G0.B(xb9Var, xb9.g1[23], bool);
                break;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                xb9 xb9Var2 = (xb9) ((et3) ny8Var.getValue());
                xb9Var2.H0.B(xb9Var2, xb9.g1[24], bool2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                xb9 xb9Var3 = (xb9) ((et3) ny8Var.getValue());
                xb9Var3.D0.B(xb9Var3, xb9.g1[20], bool3);
                break;
        }
        return sbiVar;
    }
}
