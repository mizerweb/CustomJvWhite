package defpackage;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class xv9 {
    public final wwd a;
    public final ny8 c;
    public final String b = xv9.class.getName();
    public final ze4 d = new ze4(this);

    public xv9(wwd wwdVar, ny8 ny8Var) {
        this.a = wwdVar;
        this.c = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object a(Uri uri, cf7 cf7Var, nq4 nq4Var) {
        wv9 wv9Var;
        cf7 cf7Var2;
        if (nq4Var instanceof wv9) {
            wv9Var = (wv9) nq4Var;
            int i = wv9Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                wv9Var.g = i - Integer.MIN_VALUE;
            } else {
                wv9Var = new wv9(this, nq4Var);
            }
        } else {
            wv9Var = new wv9(this, nq4Var);
        }
        Object objK0 = wv9Var.e;
        int i2 = wv9Var.g;
        lq4 lq4Var = null;
        Object obj = hu4.a;
        if (i2 == 0) {
            ch3.d0(objK0);
            wv9Var.d = (mdh) cf7Var;
            wv9Var.g = 1;
            objK0 = yab.K0(((n0c) ((xhh) this.c.getValue())).b(), new el6(this, uri, lq4Var, 26), wv9Var);
            if (objK0 != obj) {
            }
            cf7Var2 = cf7Var;
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ch3.d0(objK0);
                return objK0;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        cf7 cf7Var3 = (cf7) wv9Var.d;
        ch3.d0(objK0);
        cf7Var2 = cf7Var3;
        cf7Var2 = cf7Var;
        Long l = (Long) objK0;
        if (l != null) {
            return new Long(l.longValue());
        }
        wv9Var.d = null;
        wv9Var.g = 2;
        Object objInvoke = cf7Var2.invoke(wv9Var);
        if (objInvoke != obj) {
            return objInvoke;
        }
        cf7Var2 = cf7Var;
        return obj;
    }
}
