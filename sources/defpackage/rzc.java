package defpackage;

import one.me.pinbars.PinBarsWidget;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rzc implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PinBarsWidget b;

    public /* synthetic */ rzc(PinBarsWidget pinBarsWidget, int i) {
        this.a = i;
        this.b = pinBarsWidget;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        e70 e70Var;
        d70 d70Var;
        int i = this.a;
        PinBarsWidget pinBarsWidget = this.b;
        switch (i) {
            case 0:
                zv8[] zv8VarArr = PinBarsWidget.z;
                i99 i99Var = pinBarsWidget.t1().C;
                if (i99Var != null) {
                    rt2 rt2Var = (rt2) i99Var.d.getValue();
                    if (rt2Var == null) {
                        String str = i99Var.e;
                        a4c a4cVar = gm0.f;
                        if (a4cVar != null) {
                            je9 je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "liveStream chat is null", null);
                            }
                        }
                    } else {
                        nx2 nx2Var = rt2Var.b;
                        gj2 gj2Var = nx2Var != null ? nx2Var.u0 : null;
                        String str2 = (gj2Var == null || (e70Var = (e70) gj2Var.c) == null || (d70Var = e70Var.d) == null) ? null : d70Var.i;
                        if (str2 == null || str2.length() == 0) {
                            String str3 = i99Var.e;
                            a4c a4cVar2 = gm0.f;
                            if (a4cVar2 != null) {
                                je9 je9Var2 = je9.g;
                                if (a4cVar2.b(je9Var2)) {
                                    a4cVar2.c(je9Var2, str3, qv1.k("liveStream url=", str2), null);
                                }
                            }
                        } else {
                            yab.i0(i99Var.b, ((n0c) i99Var.c).a(), 0, new zw9(i99Var, rt2Var.A(), str2, (lq4) null, 6), 2);
                            yab.i0(i99Var.a, null, 0, new h99(i99Var, rt2Var.a, str2, null, 0), 3);
                        }
                    }
                }
                return sbi.a;
            case 1:
                zv8[] zv8VarArr2 = PinBarsWidget.z;
                return pinBarsWidget.getRouter();
            default:
                zv8[] zv8VarArr3 = PinBarsWidget.z;
                cr7 cr7Var = pinBarsWidget.t1().m;
                if (cr7Var != null) {
                    rt2 rt2Var2 = (rt2) cr7Var.a.getValue();
                    mx2 mx2VarG = rt2Var2 != null ? rt2Var2.G() : null;
                    String str4 = mx2VarG != null ? mx2VarG.c : null;
                    if (str4 == null || str4.length() == 0) {
                        gm0.n(cr7.class.getName(), "Can't join to group call in chat because joinLink is empty");
                    } else {
                        cr7Var.g.a(new hr7(str4, mx2VarG.g == 2));
                    }
                }
                return sbi.a;
        }
    }
}
