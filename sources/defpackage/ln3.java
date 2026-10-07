package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ln3 implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ln3(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        long j = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                qw2 qw2VarJ = ((xn3) obj).j();
                rt2 rt2VarQ = qw2VarJ.Q(j);
                if (rt2VarQ != null && (rt2VarQ.W() || rt2VarQ.o0())) {
                    return rt2VarQ;
                }
                return qw2VarJ.q(lx2.a, Collections.singletonList(Long.valueOf(j)), null, null);
            default:
                hre hreVar = (hre) obj;
                rre rreVar = hreVar.g().a;
                aa2 aa2Var = new aa2(j, 18);
                int i2 = 1;
                q0f q0fVar = (q0f) ch3.G(rreVar, true, false, aa2Var);
                if (q0fVar == null) {
                    return null;
                }
                gh3 gh3VarE = hreVar.e();
                ph3 ph3Var = (ph3) gh3VarE;
                jy2 jy2Var = (jy2) ch3.G(ph3Var.a, true, false, new hh3(q0fVar.b, ph3Var, i2));
                if (jy2Var != null) {
                    return hreVar.a(jy2Var);
                }
                return null;
        }
    }
}
