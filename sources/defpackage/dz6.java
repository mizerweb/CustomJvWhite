package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dz6 implements xx6 {
    public final /* synthetic */ xx6 a;
    public final /* synthetic */ tf7 b;

    public dz6(xx6 xx6Var, tf7 tf7Var) {
        this.a = xx6Var;
        this.b = tf7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xx6
    public final Object collect(yx6 yx6Var, lq4 lq4Var) {
        cz6 cz6Var;
        yxe yxeVar;
        yxe yxeVar2;
        if (lq4Var instanceof cz6) {
            cz6Var = (cz6) lq4Var;
            int i = cz6Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cz6Var.e = i - Integer.MIN_VALUE;
            } else {
                cz6Var = new cz6(this, lq4Var);
            }
        } else {
            cz6Var = new cz6(this, lq4Var);
        }
        Object obj = cz6Var.d;
        int i2 = cz6Var.e;
        hu4 hu4Var = hu4.a;
        try {
            try {
                if (i2 == 0) {
                    ch3.d0(obj);
                    xx6 xx6Var = this.a;
                    cz6Var.g = this;
                    cz6Var.h = yx6Var;
                    cz6Var.e = 1;
                    if (xx6Var.collect(yx6Var, cz6Var) != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        Throwable th = (Throwable) cz6Var.g;
                        ch3.d0(obj);
                        throw th;
                    }
                    if (i2 != 3) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yxeVar2 = (yxe) cz6Var.g;
                    try {
                        ch3.d0(obj);
                        yxeVar2.releaseIntercepted();
                        return sbi.a;
                    } catch (Throwable th2) {
                        th = th2;
                        yxeVar2.releaseIntercepted();
                        throw th;
                    }
                }
                yx6Var = cz6Var.h;
                this = (dz6) cz6Var.g;
                ch3.d0(obj);
                tf7 tf7Var = this.b;
                cz6Var.g = yxeVar;
                cz6Var.h = null;
                cz6Var.e = 3;
                if (tf7Var.i(yxeVar, null, cz6Var) != hu4Var) {
                    yxeVar2 = yxeVar;
                    yxeVar2.releaseIntercepted();
                    return sbi.a;
                }
                return hu4Var;
            } catch (Throwable th3) {
                th = th3;
                yxeVar2 = yxeVar;
                yxeVar2.releaseIntercepted();
                throw th;
            }
            yxeVar = new yxe(yx6Var, cz6Var.getContext());
        } catch (Throwable th4) {
            dz6 dz6Var = this;
            jrh jrhVar = new jrh(th4);
            tf7 tf7Var2 = dz6Var.b;
            cz6Var.g = th4;
            cz6Var.h = null;
            cz6Var.e = 2;
            if (cqk.b(jrhVar, tf7Var2, th4, cz6Var) != hu4Var) {
                throw th4;
            }
        }
    }
}
