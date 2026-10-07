package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ru5 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ su5 b;

    public /* synthetic */ ru5(su5 su5Var, int i) {
        this.a = i;
        this.b = su5Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        su5 su5Var = this.b;
        float fFloatValue = ((Float) obj).floatValue();
        switch (i) {
            case 0:
                su5Var.d = fFloatValue;
                break;
            case 1:
                su5Var.f = fFloatValue;
                break;
            case 2:
                su5Var.e = fFloatValue;
                break;
            case 3:
                su5Var.c = fFloatValue;
                break;
            case 4:
                su5Var.h = fFloatValue;
                break;
            case 5:
                su5Var.g = fFloatValue;
                break;
            case 6:
                su5Var.f = fFloatValue;
                break;
            case 7:
                su5Var.e = fFloatValue;
                break;
            case 8:
                su5Var.d = fFloatValue;
                break;
            case 9:
                su5Var.c = fFloatValue;
                break;
            case 10:
                su5Var.h = fFloatValue;
                break;
            default:
                su5Var.g = fFloatValue;
                break;
        }
        return sbiVar;
    }
}
