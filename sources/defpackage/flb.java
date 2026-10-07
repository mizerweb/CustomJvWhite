package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import java.net.UnknownHostException;
import java.util.concurrent.CancellationException;
import javax.net.ssl.SSLHandshakeException;
import kotlinx.coroutines.TimeoutCancellationException;
import one.me.sdk.fresco.FrescoHttpDownloadException;

/* JADX INFO: loaded from: classes.dex */
public final class flb {
    public final ny8 a;
    public final ifh b;
    public final String c = flb.class.getName();

    public flb(ny8 ny8Var, ifh ifhVar) {
        this.a = ny8Var;
        this.b = ifhVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object a(b78 b78Var, v78 v78Var, nq4 nq4Var) {
        blb blbVar;
        if (nq4Var instanceof blb) {
            blbVar = (blb) nq4Var;
            int i = blbVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                blbVar.f = i - Integer.MIN_VALUE;
            } else {
                blbVar = new blb(this, nq4Var);
            }
        } else {
            blbVar = new blb(this, nq4Var);
        }
        blb blbVar2 = blbVar;
        Object objS = blbVar2.d;
        int i2 = blbVar2.f;
        String str = this.c;
        try {
            if (i2 == 0) {
                ch3.d0(objS);
                blbVar2.f = 1;
                objS = vd7.s(b78Var, v78Var, 200L, blbVar2, 28);
                hu4 hu4Var = hu4.a;
                if (objS == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objS);
            }
            Bitmap bitmap = (Bitmap) objS;
            if (bitmap == null || bitmap.isRecycled()) {
                return null;
            }
            return bitmap;
        } catch (UnknownHostException e) {
            gm0.V(str, "fail to fetch bitmap due to network issues", e);
        } catch (SSLHandshakeException e2) {
            gm0.V(str, "fail to fetch bitmap, network", e2);
        } catch (TimeoutCancellationException e3) {
            gm0.V(str, "fail to fetch bitmap", new IllegalStateException("fetch bitmap has timed out", e3));
        } catch (CancellationException e4) {
            throw e4;
        } catch (FrescoHttpDownloadException e5) {
            FrescoHttpDownloadException frescoHttpDownloadException = e5;
            int i3 = frescoHttpDownloadException.a;
            Throwable albVar = frescoHttpDownloadException;
            if (i3 != 404) {
                albVar = new alb(frescoHttpDownloadException);
            }
            gm0.V(str, "fail to fetch bitmap, http exception", albVar);
        } catch (Throwable th) {
            gm0.V(str, "fail to fetch bitmap", new alb(th));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(rt2 rt2Var, nq4 nq4Var) {
        clb clbVar;
        if (nq4Var instanceof clb) {
            clbVar = (clb) nq4Var;
            int i = clbVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                clbVar.g = i - Integer.MIN_VALUE;
            } else {
                clbVar = new clb(this, nq4Var);
            }
        } else {
            clbVar = new clb(this, nq4Var);
        }
        Object objE = clbVar.e;
        Object obj = hu4.a;
        int i2 = clbVar.g;
        if (i2 == 0) {
            ch3.d0(objE);
            String strR = rt2Var.r(vs0.d.b);
            clbVar.d = rt2Var;
            clbVar.g = 1;
            objE = e(strR, clbVar);
            if (objE == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rt2Var = clbVar.d;
            ch3.d0(objE);
        }
        Bitmap bitmap = (Bitmap) objE;
        if (bitmap != null) {
            return bitmap;
        }
        rt2Var.K0();
        rt2Var.L0();
        return f(rt2Var.m, Long.valueOf(rt2Var.q()));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(vg4 vg4Var, nq4 nq4Var) {
        dlb dlbVar;
        if (nq4Var instanceof dlb) {
            dlbVar = (dlb) nq4Var;
            int i = dlbVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                dlbVar.g = i - Integer.MIN_VALUE;
            } else {
                dlbVar = new dlb(this, nq4Var);
            }
        } else {
            dlbVar = new dlb(this, nq4Var);
        }
        Object objE = dlbVar.e;
        int i2 = dlbVar.g;
        if (i2 == 0) {
            ch3.d0(objE);
            String strX = vg4Var.x(vs0.d.b);
            dlbVar.d = vg4Var;
            dlbVar.g = 1;
            objE = e(strX, dlbVar);
            Object obj = hu4.a;
            if (objE == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vg4Var = dlbVar.d;
            ch3.d0(objE);
        }
        Bitmap bitmap = (Bitmap) objE;
        return bitmap == null ? f(vg4Var.u(), Long.valueOf(vg4Var.v())) : bitmap;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, CharSequence charSequence, Long l, nq4 nq4Var) {
        elb elbVar;
        if (nq4Var instanceof elb) {
            elbVar = (elb) nq4Var;
            int i = elbVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                elbVar.h = i - Integer.MIN_VALUE;
            } else {
                elbVar = new elb(this, nq4Var);
            }
        } else {
            elbVar = new elb(this, nq4Var);
        }
        Object objE = elbVar.f;
        int i2 = elbVar.h;
        if (i2 == 0) {
            ch3.d0(objE);
            elbVar.d = charSequence;
            elbVar.e = l;
            elbVar.h = 1;
            objE = e(str, elbVar);
            Object obj = hu4.a;
            if (objE == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            l = elbVar.e;
            charSequence = elbVar.d;
            ch3.d0(objE);
        }
        Bitmap bitmap = (Bitmap) objE;
        return bitmap == null ? f(charSequence, l) : bitmap;
    }

    public final Object e(String str, nq4 nq4Var) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ((zwb) this.b.getValue()).getClass();
        int iK = gm0.K(104.0f * yl5.d().getDisplayMetrics().density);
        awb awbVar = awb.a;
        Uri uriC = f55.c(str);
        if (uriC == null) {
            uriC = Uri.EMPTY;
        }
        w78 w78VarH = ghb.h(uriC, awbVar, iK, iK);
        w78VarH.j = whd.c;
        return a((b78) this.a.getValue(), w78VarH.a(), nq4Var);
    }

    public final Bitmap f(CharSequence charSequence, Long l) {
        if (charSequence == null || r5h.X0(charSequence) || l == null) {
            return null;
        }
        ifh ifhVar = this.b;
        ((zwb) ifhVar.getValue()).getClass();
        int iK = gm0.K(104.0f * yl5.d().getDisplayMetrics().density);
        Context context = (Context) ((zwb) ifhVar.getValue()).a.c(7);
        sj0 sj0Var = new sj0(context, awb.a, gm0.a(charSequence, l), pq3.j.e(context).m());
        sj0Var.setBounds(0, 0, iK, iK);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iK, iK, Bitmap.Config.ARGB_8888);
        sj0Var.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }
}
