package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p81 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o91 b;

    public /* synthetic */ p81(o91 o91Var, int i) {
        this.a = i;
        this.b = o91Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        int i2 = 1;
        o91 o91Var = this.b;
        switch (i) {
            case 0:
                return o91Var.n0;
            case 1:
                return o91Var.k;
            case 2:
                return o91Var.k;
            case 3:
                wl wlVar = o91Var.y0;
                zzf zzfVar = o91Var.e0;
                if (zzfVar != null) {
                    zzfVar.a(new y81(o91Var, i2, wlVar), new t81(0));
                }
                return sbi.a;
            case 4:
                return o91Var.n0;
            case 5:
                return Boolean.valueOf(o91Var.E0);
            case 6:
                return Boolean.valueOf(o91Var.u);
            case 7:
                return o91Var.F0;
            case 8:
                return o91Var.n0.w();
            case 9:
                return o91Var.M0.i;
            case 10:
                return o91Var.M0.i;
            default:
                if (o91Var.v && o91Var.n0.I(zvh.b) && !o91Var.f1) {
                    o91Var.f1 = true;
                    o91Var.l.post(new j91(o91Var, 4));
                }
                return sbi.a;
        }
    }
}
