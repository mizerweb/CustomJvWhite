package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class m06 implements cf7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p26 b;

    public /* synthetic */ m06(p26 p26Var, int i) {
        this.a = i;
        this.b = p26Var;
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 3;
        lq4 lq4Var = null;
        p26 p26Var = this.b;
        switch (i) {
            case 0:
                Float f = (Float) obj;
                float fFloatValue = f.floatValue();
                String str = p26Var.j;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "downloadVideo story progress: " + fFloatValue, null);
                    }
                }
                mjg mjgVar = p26Var.Q1;
                mjgVar.getClass();
                mjgVar.j(null, f);
                break;
            case 1:
                p26Var.A.B(p26Var, p26.W1[5], yab.h0(p26Var.b, ((n0c) p26Var.H()).a(), 2, new o06(p26Var, lq4Var, i2)));
                break;
            case 2:
                sgg sggVar = p26Var.Z;
                if (sggVar == null || !sggVar.isActive()) {
                    p26Var.s.b();
                    p26Var.Z = a8j.t(p26Var, null, new i26(p26Var, lq4Var, 0), 3);
                }
                break;
            case 3:
                oyg oygVar = p26Var.s;
                boolean z = oygVar.h.a.getValue() instanceof nmh;
                boolean z2 = p26Var.C1.a.getValue() instanceof o16;
                if (z) {
                    oygVar.a();
                } else if (oygVar.f.a.getValue() != null) {
                    oygVar.b();
                } else if (z2) {
                    p26Var.V();
                }
                break;
            default:
                a8j.x(p26Var.F1, a16.a);
                break;
        }
        return sbi.a;
    }
}
