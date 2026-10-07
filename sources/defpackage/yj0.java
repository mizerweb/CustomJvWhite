package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class yj0 {
    public final ny8 a;
    public final yo9 b = new yo9(0, (byte) 0);

    public yj0(ny8 ny8Var) {
        this.a = ny8Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(w73 w73Var, nq4 nq4Var) throws IOException {
        wj0 wj0Var;
        if (nq4Var instanceof wj0) {
            wj0Var = (wj0) nq4Var;
            int i = wj0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                wj0Var.g = i - Integer.MIN_VALUE;
            } else {
                wj0Var = new wj0(this, nq4Var);
            }
        } else {
            wj0Var = new wj0(this, nq4Var);
        }
        Object objB = wj0Var.e;
        int i2 = wj0Var.g;
        if (i2 == 0) {
            ch3.d0(objB);
            wj0Var.d = w73Var;
            wj0Var.g = 1;
            objB = b(w73Var, wj0Var);
            Object obj = hu4.a;
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w73Var = wj0Var.d;
            ch3.d0(objB);
        }
        ylc ylcVar = (ylc) objB;
        if (ylcVar != null) {
            this.b.put(new Long(w73Var.a), ylcVar);
        }
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(w73 w73Var, nq4 nq4Var) throws IOException {
        xj0 xj0Var;
        Uri uri;
        if (nq4Var instanceof xj0) {
            xj0Var = (xj0) nq4Var;
            int i = xj0Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                xj0Var.g = i - Integer.MIN_VALUE;
            } else {
                xj0Var = new xj0(this, nq4Var);
            }
        } else {
            xj0Var = new xj0(this, nq4Var);
        }
        Object objB = xj0Var.e;
        int i2 = xj0Var.g;
        if (i2 == 0) {
            ch3.d0(objB);
            Uri uri2 = w73Var.b;
            if (uri2 == null) {
                return null;
            }
            int iK = gm0.K(56.0f * yl5.d().getDisplayMetrics().density);
            w78 w78VarH = ghb.h(uri2, awb.a, iK, iK);
            w78VarH.j = whd.c;
            v78 v78VarA = w78VarH.a();
            hy0 hy0Var = (hy0) this.a.getValue();
            xj0Var.d = uri2;
            xj0Var.g = 1;
            objB = hy0Var.b(v78VarA, xj0Var);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            uri = uri2;
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uri = xj0Var.d;
            ch3.d0(objB);
        }
        byte[] bArr = (byte[]) objB;
        if (bArr != null && bArr.length != 0) {
            return new ylc(uri, bArr);
        }
        gm0.Y(yj0.class.getName(), "Early return in create cuz of bytes is null or empty");
        return null;
    }
}
