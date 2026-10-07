package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class ovc {
    public final Uri a;
    public final int b;
    public final int c;
    public volatile fm0 d;

    public ovc(Uri uri, int i, int i2) {
        this.a = uri;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Resources resources, xhh xhhVar, nq4 nq4Var) {
        nvc nvcVar;
        if (nq4Var instanceof nvc) {
            nvcVar = (nvc) nq4Var;
            int i = nvcVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                nvcVar.f = i - Integer.MIN_VALUE;
            } else {
                nvcVar = new nvc(this, nq4Var);
            }
        } else {
            nvcVar = new nvc(this, nq4Var);
        }
        Object objK0 = nvcVar.d;
        hu4 hu4Var = hu4.a;
        int i2 = nvcVar.f;
        lq4 lq4Var = null;
        if (i2 == 0) {
            ch3.d0(objK0);
            fm0 fm0Var = this.d;
            if (fm0Var != null) {
                return fm0Var;
            }
            if (this.a == null) {
                fm0 fm0Var2 = new fm0(this.c, new ColorDrawable(this.b));
                this.d = fm0Var2;
                return fm0Var2;
            }
            xt4 xt4VarB = ((n0c) xhhVar).b();
            awa awaVar = new awa(this, resources, lq4Var, 18);
            nvcVar.f = 1;
            objK0 = yab.K0(xt4VarB, awaVar, nvcVar);
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objK0);
        }
        fm0 fm0Var3 = (fm0) objK0;
        this.d = fm0Var3;
        return fm0Var3;
    }
}
