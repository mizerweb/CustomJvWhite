package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class ig3 {
    public final ny8 a;
    public final ny8 b;

    public ig3(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, boolean z, nq4 nq4Var) {
        hg3 hg3Var;
        if (nq4Var instanceof hg3) {
            hg3Var = (hg3) nq4Var;
            int i = hg3Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                hg3Var.g = i - Integer.MIN_VALUE;
            } else {
                hg3Var = new hg3(this, nq4Var);
            }
        } else {
            hg3Var = new hg3(this, nq4Var);
        }
        Object objN = hg3Var.e;
        int i2 = hg3Var.g;
        if (i2 == 0) {
            ch3.d0(objN);
            r8e r8eVarK = ((xn3) this.b.getValue()).k(j);
            hg3Var.d = z;
            hg3Var.g = 1;
            objN = e9i.N(r8eVarK, hg3Var);
            hu4 hu4Var = hu4.a;
            if (objN == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = hg3Var.d;
            ch3.d0(objN);
        }
        rt2 rt2Var = (rt2) objN;
        if (rt2Var == null || !rt2Var.d0()) {
            return new Long(-9223372036854775807L);
        }
        return new Long(((pvb) this.a.getValue()).g(rt2Var.a, rt2Var.A(), 0, null, false, Collections.singletonMap("CONFIRM_BEFORE_SEND", Boolean.valueOf(z))));
    }
}
