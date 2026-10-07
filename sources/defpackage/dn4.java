package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface dn4 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    static Object a(dn4 dn4Var, nq4 nq4Var) {
        cn4 cn4Var;
        if (nq4Var instanceof cn4) {
            cn4Var = (cn4) nq4Var;
            int i = cn4Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                cn4Var.g = i - Integer.MIN_VALUE;
            } else {
                cn4Var = new cn4(dn4Var, nq4Var);
            }
        } else {
            cn4Var = new cn4(dn4Var, nq4Var);
        }
        Object obj = cn4Var.e;
        int i2 = cn4Var.g;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (i2 == 0) {
            ch3.d0(obj);
            cn4Var.d = dn4Var;
            cn4Var.g = 1;
            Object objI = ch3.I(cn4Var, ((in4) dn4Var).a, false, true, new w83(16));
            if (objI != hu4Var) {
                objI = sbiVar;
            }
            if (objI != hu4Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dn4Var = cn4Var.d;
        ch3.d0(obj);
        cn4Var.d = null;
        cn4Var.g = 2;
        Object objI2 = ch3.I(cn4Var, ((in4) dn4Var).a, false, true, new w83(15));
        if (objI2 != hu4Var) {
            objI2 = sbiVar;
        }
        return objI2 == hu4Var ? hu4Var : sbiVar;
    }
}
