package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ia1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ya1 b;

    public /* synthetic */ ia1(ya1 ya1Var, int i) {
        this.a = i;
        this.b = ya1Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        ya1 ya1Var = this.b;
        switch (i) {
            case 0:
                return new na1(ya1Var, 0);
            case 1:
                return new wa1(ya1Var);
            case 2:
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, "CallAdminSettingsController", "Low hands for all success.", null);
                    }
                }
                ya1Var.s.a(new pd(true));
                return sbi.a;
            case 3:
                a4c a4cVar2 = gm0.f;
                if (a4cVar2 != null) {
                    je9 je9Var2 = je9.d;
                    if (a4cVar2.b(je9Var2)) {
                        a4cVar2.c(je9Var2, "CallAdminSettingsController", "Disable cameras for all once was success", null);
                    }
                }
                ya1Var.s.a(new md(true));
                return sbi.a;
            default:
                a4c a4cVar3 = gm0.f;
                if (a4cVar3 != null) {
                    je9 je9Var3 = je9.d;
                    if (a4cVar3.b(je9Var3)) {
                        a4cVar3.c(je9Var3, "CallAdminSettingsController", "Disable microphone for all once was success", null);
                    }
                }
                ya1Var.s.a(new od(true));
                return sbi.a;
        }
    }
}
