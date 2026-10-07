package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gg3 {
    public final ny8 a;
    public final ny8 b;

    public gg3(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(long j, boolean z, nq4 nq4Var) {
        fg3 fg3Var;
        if (nq4Var instanceof fg3) {
            fg3Var = (fg3) nq4Var;
            int i = fg3Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                fg3Var.g = i - Integer.MIN_VALUE;
            } else {
                fg3Var = new fg3(this, nq4Var);
            }
        } else {
            fg3Var = new fg3(this, nq4Var);
        }
        Object objN = fg3Var.e;
        int i2 = fg3Var.g;
        if (i2 == 0) {
            ch3.d0(objN);
            r8e r8eVarK = ((xn3) this.b.getValue()).k(j);
            fg3Var.d = z;
            fg3Var.g = 1;
            objN = e9i.N(r8eVarK, fg3Var);
            hu4 hu4Var = hu4.a;
            if (objN == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = fg3Var.d;
            ch3.d0(objN);
        }
        rt2 rt2Var = (rt2) objN;
        if (rt2Var == null || !rt2Var.d0()) {
            return new Long(-9223372036854775807L);
        }
        return new Long(((pvb) this.a.getValue()).g(rt2Var.a, rt2Var.A(), 0, null, false, ouk.a(new ylc("COMMENTS", Boolean.valueOf(z)))));
    }
}
