package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class rp3 {
    public final String a = rp3.class.getName();
    public final ny8 b;
    public final ny8 c;

    public rp3(ny8 ny8Var, ny8 ny8Var2) {
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public final Object a(long j, nq4 nq4Var) {
        qp3 qp3Var;
        if (nq4Var instanceof qp3) {
            qp3Var = (qp3) nq4Var;
            int i = qp3Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                qp3Var.f = i - Integer.MIN_VALUE;
            } else {
                qp3Var = new qp3(this, nq4Var);
            }
        } else {
            qp3Var = new qp3(this, nq4Var);
        }
        qp3 qp3Var2 = qp3Var;
        Object objE = qp3Var2.d;
        int i2 = qp3Var2.f;
        String str = this.a;
        try {
            if (i2 == 0) {
                ch3.d0(objE);
                pvb pvbVar = (pvb) this.b.getValue();
                wy2 wy2Var = new wy2(new long[]{j}, (Long) null);
                onf onfVar = (onf) this.c.getValue();
                qp3Var2.f = 1;
                objE = qe7.E(pvbVar, wy2Var, str, 0L, 0, onfVar, null, qp3Var2, 92);
                hu4 hu4Var = hu4.a;
                if (objE == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objE);
            }
            rj4 rj4Var = (rj4) objE;
            if (rj4Var == null) {
                return Boolean.FALSE;
            }
            return Boolean.valueOf((((pj4) ww3.r1(rj4Var.h())).s.b & 16) != 0);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            gm0.V(str, "fail", th);
            return Boolean.FALSE;
        }
    }
}
