package defpackage;

import androidx.recyclerview.widget.a;
import one.me.calls.ui.ui.call.CallScreen;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xw1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallScreen b;

    public /* synthetic */ xw1(CallScreen callScreen, int i) {
        this.a = i;
        this.b = callScreen;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        sbi sbiVar = sbi.a;
        final int i2 = 0;
        final int i3 = 1;
        final CallScreen callScreen = this.b;
        switch (i) {
            case 0:
                l6m l6mVar = CallScreen.D1;
                return new fx1(callScreen);
            case 1:
                l6m l6mVar2 = CallScreen.D1;
                return f55.o(callScreen.getContext());
            case 2:
                i02 i02Var = (i02) callScreen.h.getAccessor().c(855);
                return new h02((k4f) callScreen.m.getValue(), i02Var.a, i02Var.b, i02Var.c, i02Var.d, i02Var.e, i02Var.f, i02Var.g, i02Var.h, i02Var.i, i02Var.j, i02Var.k, i02Var.l, i02Var.m, i02Var.n, i02Var.o, i02Var.p, i02Var.q, i02Var.r);
            case 3:
                l6m l6mVar3 = CallScreen.D1;
                es4 es4Var = new es4();
                es4Var.h = new cf7() { // from class: ax1
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj) {
                        int i4 = i2;
                        sbi sbiVar2 = sbi.a;
                        CallScreen callScreen2 = callScreen;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        switch (i4) {
                            case 0:
                                if (!zBooleanValue) {
                                    l6m l6mVar4 = CallScreen.D1;
                                } else if (!callScreen2.u) {
                                    callScreen2.R1().M(true);
                                }
                                callScreen2.P1().c();
                                break;
                            default:
                                l6m l6mVar5 = CallScreen.D1;
                                if (!zBooleanValue) {
                                    callScreen2.R1().M(false);
                                }
                                break;
                        }
                        return sbiVar2;
                    }
                };
                es4Var.i = new cf7() { // from class: ax1
                    @Override // defpackage.cf7
                    public final Object invoke(Object obj) {
                        int i4 = i3;
                        sbi sbiVar2 = sbi.a;
                        CallScreen callScreen2 = callScreen;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        switch (i4) {
                            case 0:
                                if (!zBooleanValue) {
                                    l6m l6mVar4 = CallScreen.D1;
                                } else if (!callScreen2.u) {
                                    callScreen2.R1().M(true);
                                }
                                callScreen2.P1().c();
                                break;
                            default:
                                l6m l6mVar5 = CallScreen.D1;
                                if (!zBooleanValue) {
                                    callScreen2.R1().M(false);
                                }
                                break;
                        }
                        return sbiVar2;
                    }
                };
                return es4Var;
            case 4:
                return new fs4(callScreen.E, new xw1(callScreen, 6));
            case 5:
                return new qq7(callScreen.o);
            case 6:
                l6m l6mVar4 = CallScreen.D1;
                Boolean bool = (Boolean) callScreen.R1().z.a.getValue();
                bool.getClass();
                return bool;
            case 7:
                l6m l6mVar5 = CallScreen.D1;
                callScreen.R1().M(true);
                return sbiVar;
            case 8:
                l6m l6mVar6 = CallScreen.D1;
                callScreen.R1().M(true);
                return sbiVar;
            case 9:
                l6m l6mVar7 = CallScreen.D1;
                return new px1(callScreen);
            case 10:
                l6m l6mVar8 = CallScreen.D1;
                return new hx1(callScreen);
            case 11:
                l6m l6mVar9 = CallScreen.D1;
                return new nx1(callScreen);
            case 12:
                l6m l6mVar10 = CallScreen.D1;
                return new zw1(i2, callScreen);
            case 13:
                l6m l6mVar11 = CallScreen.D1;
                c1d c1dVarP1 = callScreen.P1();
                px1 px1Var = (px1) callScreen.r1.getValue();
                hx1 hx1Var = (hx1) callScreen.s1.getValue();
                ny8 ny8Var = callScreen.u1;
                ny8 ny8Var2 = callScreen.E;
                return new mr1(c1dVarP1, px1Var, hx1Var, (nx1) callScreen.t1.getValue(), (o22) callScreen.n.getValue(), ny8Var, ny8Var2, ((a2c) callScreen.h.getAccessor().d(27).getValue()).a(), (s32) callScreen.R1().X.getValue(), (lxi) callScreen.R1().E.getValue(), (a) callScreen.R1().K.getValue(), (qq7) callScreen.G.getValue(), (a9j) callScreen.D.getValue(), callScreen.f.b());
            default:
                l6m l6mVar12 = CallScreen.D1;
                return new gx1(callScreen);
        }
    }
}
