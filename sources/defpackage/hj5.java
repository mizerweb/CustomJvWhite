package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hj5 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ et3 b;

    public /* synthetic */ hj5(et3 et3Var, int i) {
        this.a = i;
        this.b = et3Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        et3 et3Var = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                xb9 xb9Var = (xb9) et3Var;
                xb9Var.x0.B(xb9Var, xb9.g1[14], bool);
                break;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                xb9 xb9Var2 = (xb9) et3Var;
                xb9Var2.y0.B(xb9Var2, xb9.g1[15], bool2);
                break;
            case 2:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                xb9 xb9Var3 = (xb9) et3Var;
                xb9Var3.w0.B(xb9Var3, xb9.g1[13], bool3);
                break;
            case 3:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                xb9 xb9Var4 = (xb9) et3Var;
                xb9Var4.R0.B(xb9Var4, xb9.g1[35], bool4);
                break;
            default:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                xb9 xb9Var5 = (xb9) et3Var;
                xb9Var5.z0.B(xb9Var5, xb9.g1[16], bool5);
                break;
        }
        return sbiVar;
    }
}
