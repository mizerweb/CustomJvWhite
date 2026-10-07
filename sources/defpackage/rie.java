package defpackage;

import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class rie {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;

    public rie(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.a = ny8Var3;
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, nq4 nq4Var) {
        qie qieVar;
        if (nq4Var instanceof qie) {
            qieVar = (qie) nq4Var;
            int i = qieVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                qieVar.g = i - Integer.MIN_VALUE;
            } else {
                qieVar = new qie(this, nq4Var);
            }
        } else {
            qieVar = new qie(this, nq4Var);
        }
        Object objD = qieVar.e;
        int i2 = qieVar.g;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(objD);
            ny8 ny8Var = this.a;
            ((xn3) ny8Var.getValue()).j().r(j, uw2.b);
            xn3 xn3Var = (xn3) ny8Var.getValue();
            c9 c9Var = new c9(2, lq4Var, 16);
            qieVar.d = j;
            qieVar.g = 1;
            objD = xn3Var.d(j, c9Var, qieVar);
            hu4 hu4Var = hu4.a;
            if (objD == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = qieVar.d;
            ch3.d0(objD);
        }
        long j2 = j;
        rt2 rt2Var = (rt2) objD;
        if (rt2Var == null) {
            return new Long(0L);
        }
        ((t51) this.c.getValue()).c(new wo3((Collection) c0a.s(j2), false, false, (mg5) null, (cid) null, (Set) null, 124));
        return new Long(((pvb) this.b.getValue()).i(j2, rt2Var.A(), null, "", null));
    }
}
