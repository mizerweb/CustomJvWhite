package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jl5 implements tve {
    public final /* synthetic */ int a;
    public final /* synthetic */ kl5 b;

    public /* synthetic */ jl5(kl5 kl5Var, int i) {
        this.a = i;
        this.b = kl5Var;
    }

    public void a(pve pveVar, Throwable th) {
        int i = this.a;
        kl5 kl5Var = this.b;
        switch (i) {
            case 1:
                kl5Var.a.log("DisplayLayouts", "Resend next time after error");
                kl5Var.e = true;
                break;
            default:
                kl5Var.a.log("DisplayLayouts", "Stop stream on participant removed error: " + th.getMessage());
                break;
        }
    }

    @Override // defpackage.tve
    public void d(pve pveVar, yve yveVar) {
        int i = this.a;
        kl5 kl5Var = this.b;
        zei zeiVar = (zei) yveVar;
        switch (i) {
            case 0:
                if (!zeiVar.a.isEmpty()) {
                    kl5Var.a.log("DisplayLayouts", "Resend next time after response with errors");
                    kl5Var.e = true;
                }
                break;
            default:
                kl5Var.a.log("DisplayLayouts", "Stop stream on participant removed response: " + zeiVar);
                break;
        }
    }
}
