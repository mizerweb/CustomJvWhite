package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vzf implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzf b;

    public /* synthetic */ vzf(zzf zzfVar, int i) {
        this.a = i;
        this.b = zzfVar;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        sbi sbiVar = sbi.a;
        int i2 = 20;
        zzf zzfVar = this.b;
        d80 d80Var = (d80) obj;
        switch (i) {
            case 0:
                zzfVar.a.execute(new yde(zzfVar, i2, d80Var));
                break;
            default:
                zzfVar.a.execute(new yde(zzfVar, i2, d80Var));
                break;
        }
        return sbiVar;
    }
}
