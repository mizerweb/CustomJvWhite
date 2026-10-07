package defpackage;

import one.me.calls.ui.ui.call.CallScreen;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nd1 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pd1 b;

    public /* synthetic */ nd1(pd1 pd1Var, int i) {
        this.a = i;
        this.b = pd1Var;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x013f  */
    @Override // defpackage.af7
    public final Object invoke() {
        Long l;
        int i = this.a;
        pd1 pd1Var = this.b;
        switch (i) {
            case 0:
                od1 od1Var = pd1Var.t;
                if (od1Var != null) {
                    CallScreen callScreen = ((fx1) od1Var).a;
                    l6m l6mVar = CallScreen.D1;
                    pi6 pi6Var = callScreen.R1().K().f;
                    hi6 hi6Var = pi6Var instanceof hi6 ? (hi6) pi6Var : null;
                    gi6 gi6Var = hi6Var != null ? hi6Var.a : null;
                    if (gi6Var == gi6.p || gi6Var == gi6.q) {
                        sa2 sa2Var = (sa2) callScreen.j.getValue();
                        String strA = ns4.a(callScreen.R1().K().a);
                        sa2Var.getClass();
                        sa2.c(sa2Var, "RECALL_ON_MOBILE", strA, "CLOSE", null, null, null, false, null, HttpStatus.SC_GATEWAY_TIMEOUT);
                    }
                    callScreen.K1(true);
                }
                break;
            case 1:
                od1 od1Var2 = pd1Var.t;
                if (od1Var2 != null) {
                    CallScreen callScreen2 = ((fx1) od1Var2).a;
                    l6m l6mVar2 = CallScreen.D1;
                    qe1 qe1Var = callScreen2.R1().K().g;
                    if (qe1Var == null || (l = qe1Var.i) == null) {
                        gm0.Y(fx1.class.getName(), "Early return in onCallByPhoneClick since phoneNumber is null");
                    } else {
                        Long l2 = l.longValue() > 0 ? l : null;
                        if (l2 != null) {
                            long jLongValue = l2.longValue();
                            sa2 sa2Var2 = (sa2) callScreen2.j.getValue();
                            String strA2 = ns4.a(callScreen2.R1().K().a);
                            sa2Var2.getClass();
                            sa2.c(sa2Var2, "RECALL_ON_MOBILE", strA2, "CALL", null, null, null, false, null, HttpStatus.SC_GATEWAY_TIMEOUT);
                            String str = sj8.a;
                            sj8.a(callScreen2.requireActivity(), zo5.j(jLongValue, "+"));
                        } else {
                            gm0.Y(fx1.class.getName(), "Early return in onCallByPhoneClick since phoneNumber is null");
                        }
                    }
                }
                break;
            case 2:
                od1 od1Var3 = pd1Var.t;
                if (od1Var3 != null) {
                    CallScreen callScreen3 = ((fx1) od1Var3).a;
                    l6m l6mVar3 = CallScreen.D1;
                    callScreen3.R1().O();
                }
                break;
            default:
                od1 od1Var4 = pd1Var.t;
                if (od1Var4 != null) {
                    fx1 fx1Var = (fx1) od1Var4;
                    String strA3 = ((os4) fx1Var.a.q.getValue()).a();
                    ((sa2) fx1Var.a.j.getValue()).e = 1;
                    ((sa2) fx1Var.a.j.getValue()).c = la2.a;
                    ((sa2) fx1Var.a.j.getValue()).j(strA3);
                    ((sa2) fx1Var.a.j.getValue()).g(na2.RECALL, false);
                    h02 h02VarR1 = fx1Var.a.R1();
                    yp9 yp9Var = yp9.b;
                    w82 w82Var = h02VarR1.e;
                    ao1 ao1VarK = h02VarR1.K();
                    phl m32Var = ao1VarK.c;
                    m32 m32Var2 = m32Var instanceof m32 ? (m32) m32Var : null;
                    if (m32Var2 != null) {
                        m32Var = new m32(m32Var2.a, strA3, m32Var2.c);
                    }
                    if (m32Var == null) {
                        gm0.Y(h02.class.getName(), "Early return in callBack cuz of target is null");
                    } else {
                        ((n42) h02VarR1.H()).d(new hhg(new fhg(m32Var), ao1VarK.s == yp9Var, ao1VarK.t == yp9Var, null, c32.RECALL));
                        w82Var.m(vmi.d);
                        w82Var.B.B(w82Var, w82.E[0], e9i.j0(w82Var.C, w82Var.g));
                        w82Var.k();
                        w82Var.l();
                    }
                }
                break;
        }
        return sbi.a;
    }
}
