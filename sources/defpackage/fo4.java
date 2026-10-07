package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fo4 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ fo4(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        int i2 = 1;
        boolean z = this.b;
        di4 di4Var = (di4) obj;
        switch (i) {
            case 0:
                int i3 = di4Var.m;
                di4Var.m = z ? i3 | 1 : i3 & (-2);
                break;
            default:
                int i4 = di4Var.z.b;
                di4Var.z = new ix2(z ? i4 | 1024 : i4 & (-1025), i2);
                break;
        }
        return sbiVar;
    }
}
