package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rpl {
    /* JADX WARN: Multi-variable type inference failed */
    public static u72 a(xf5 xf5Var) {
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = qt4.class;
        try {
            ((up8) xf5Var).Y(new w14(r72Var, 9, xf5Var));
            r72Var.a = "Deferred.asListenableFuture";
            return u72Var;
        } catch (Exception e) {
            u72Var.c(e);
            return u72Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(xf5 xf5Var, long j, nq4 nq4Var) {
        rt4 rt4Var;
        if (nq4Var instanceof rt4) {
            rt4Var = (rt4) nq4Var;
            int i = rt4Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                rt4Var.e = i - Integer.MIN_VALUE;
            } else {
                rt4Var = new rt4(nq4Var);
            }
        } else {
            rt4Var = new rt4(nq4Var);
        }
        Object objL0 = rt4Var.d;
        int i2 = rt4Var.e;
        byte b = 0;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(objL0);
            st4 st4Var = new st4(xf5Var, lq4Var, b == true ? 1 : 0);
            rt4Var.e = 1;
            objL0 = lvb.L0(j, st4Var, rt4Var);
            hu4 hu4Var = hu4.a;
            if (objL0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objL0);
        }
        return Boolean.valueOf(objL0 != null);
    }

    public static vkf c(long j, long j2) {
        return new vkf(0, j, j2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(xf5 xf5Var, i64 i64Var) {
        ((up8) xf5Var).Y(new pt4(xf5Var, i64Var));
    }
}
