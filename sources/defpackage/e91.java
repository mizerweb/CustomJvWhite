package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e91 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o91 b;

    public /* synthetic */ e91(o91 o91Var, int i) {
        this.a = i;
        this.b = o91Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        o91 o91Var = this.b;
        switch (i) {
            case 0:
                o91Var.n0.A((wig) obj);
                break;
            default:
                o91Var.n0.S((jkg) obj);
                break;
        }
        return sbiVar;
    }
}
