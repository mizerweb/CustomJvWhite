package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bye implements xx6, fk2 {
    public final qf7 a;

    public bye(qf7 qf7Var) {
        this.a = qf7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        y0 y0Var;
        yxe yxeVar;
        if (lq4Var instanceof y0) {
            y0Var = (y0) lq4Var;
            int i = y0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                y0Var.g = i - Integer.MIN_VALUE;
            } else {
                y0Var = new y0(this, lq4Var);
            }
        } else {
            y0Var = new y0(this, lq4Var);
        }
        Object obj = y0Var.e;
        int i2 = y0Var.g;
        sbi sbiVar = sbi.a;
        if (i2 != 0) {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yxeVar = y0Var.d;
            try {
                ch3.d0(obj);
                yxeVar.releaseIntercepted();
                return sbiVar;
            } catch (Throwable th) {
                th = th;
                yxeVar.releaseIntercepted();
                throw th;
            }
        }
        ch3.d0(obj);
        yxe yxeVar2 = new yxe(yx6Var, y0Var.getContext());
        try {
            y0Var.d = yxeVar2;
            y0Var.g = 1;
            try {
                Object objInvoke = this.a.invoke(yxeVar2, y0Var);
                hu4 hu4Var = hu4.a;
                if (objInvoke != hu4Var) {
                    objInvoke = sbiVar;
                }
                if (objInvoke == hu4Var) {
                    return hu4Var;
                }
                yxeVar = yxeVar2;
                yxeVar.releaseIntercepted();
                return sbiVar;
            } catch (Throwable th2) {
                th = th2;
                yxeVar = yxeVar2;
                yxeVar.releaseIntercepted();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
