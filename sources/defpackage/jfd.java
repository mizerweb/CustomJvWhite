package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jfd {
    public final String a = jfd.class.getName();
    public final ny8 b;
    public final ny8 c;

    public jfd(ny8 ny8Var, ny8 ny8Var2) {
        this.b = ny8Var;
        this.c = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(Uri uri, List list, int i, int i2, i6a i6aVar, nq4 nq4Var) throws Throwable {
        ifd ifdVar;
        int i3;
        int i4;
        au3 au3Var;
        au3 au3Var2;
        if (nq4Var instanceof ifd) {
            ifdVar = (ifd) nq4Var;
            int i5 = ifdVar.i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                ifdVar.i = i5 - Integer.MIN_VALUE;
            } else {
                ifdVar = new ifd(this, nq4Var);
            }
        } else {
            ifdVar = new ifd(this, nq4Var);
        }
        Object objK0 = ifdVar.g;
        hu4 hu4Var = hu4.a;
        int i6 = ifdVar.i;
        au3 au3Var3 = null;
        byte b = 0;
        try {
            try {
                if (i6 == 0) {
                    ch3.d0(objK0);
                    dyg dygVar = (dyg) this.b.getValue();
                    ifdVar.e = i;
                    ifdVar.f = i2;
                    ifdVar.i = 1;
                    objK0 = yab.K0(((n0c) ((xhh) dygVar.d.getValue())).a(), new tm(dygVar, uri, list, i, i2, i6aVar, null), ifdVar);
                    if (objK0 != hu4Var) {
                        i3 = i;
                        i4 = i2;
                    }
                    return hu4Var;
                }
                if (i6 == 1) {
                    i4 = ifdVar.f;
                    i3 = ifdVar.e;
                    ch3.d0(objK0);
                } else {
                    if (i6 != 2) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    au3Var2 = ifdVar.d;
                    ch3.d0(objK0);
                }
                au3.E(au3Var2);
                return objK0;
                if (au3Var == null) {
                    String str = this.a;
                    a4c a4cVar = gm0.f;
                    if (a4cVar != null) {
                        je9 je9Var = je9.f;
                        if (a4cVar.b(je9Var)) {
                            a4cVar.c(je9Var, str, "prepare image: render failed", null);
                        }
                    }
                    au3.E(au3Var);
                    return null;
                }
                gze gzeVar = (gze) this.c.getValue();
                Bitmap bitmap = (Bitmap) au3Var.K();
                ifdVar.d = au3Var;
                ifdVar.e = i3;
                ifdVar.f = i4;
                ifdVar.i = 2;
                gzeVar.getClass();
                Object objK1 = yab.K0(lvb.x0(zhb.b, gzeVar.b), new fze((Object) bitmap, (Object) gzeVar, (lq4) (b == true ? 1 : 0), 0), ifdVar);
                if (objK1 != hu4Var) {
                    au3Var2 = au3Var;
                    objK0 = objK1;
                    au3.E(au3Var2);
                    return objK0;
                }
                return hu4Var;
            } catch (Throwable th) {
                th = th;
                au3Var3 = au3Var;
                au3.E(au3Var3);
                throw th;
            }
            au3Var = (au3) objK0;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
