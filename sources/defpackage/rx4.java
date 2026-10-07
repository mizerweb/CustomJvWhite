package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.File;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class rx4 extends a8j {
    public static final /* synthetic */ zv8[] C;
    public final mjg A;
    public final r8e B;
    public final jx4 c;
    public final Uri d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;
    public final ic6 i = new ic6(null);
    public final ic6 j = new ic6(null);
    public volatile long k = qx6.a(-1.0f, -1.0f);
    public final Matrix l = new Matrix();
    public final ifh m = new ifh(new zn3(28));
    public final Matrix n = new Matrix();
    public final Paint o;
    public final String p;
    public volatile ux4 q;
    public final ifh r;
    public volatile boolean s;
    public final p3c t;
    public final l9b u;
    public sgg v;
    public zw4 w;
    public float x;
    public final zv y;
    public final mjg z;

    static {
        z8b z8bVar = new z8b(rx4.class, "finishCropJob", "getFinishCropJob()Lkotlinx/coroutines/Job;");
        zfe.a.getClass();
        C = new zv8[]{z8bVar};
    }

    public rx4(jx4 jx4Var, Uri uri, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4) {
        this.c = jx4Var;
        this.d = uri;
        this.e = ny8Var;
        this.f = ny8Var2;
        this.g = ny8Var3;
        this.h = ny8Var4;
        Paint paint = new Paint(1);
        paint.setFilterBitmap(true);
        this.o = paint;
        this.p = rx4.class.getName();
        this.r = new ifh(new pe3(23, this));
        this.t = qyj.S();
        this.u = new l9b();
        this.y = new zv();
        mjg mjgVarA = p90.a(Boolean.TRUE);
        this.z = mjgVarA;
        mjg mjgVarA2 = p90.a(Boolean.FALSE);
        this.A = mjgVarA2;
        r07 r07Var = new r07(mjgVarA, mjgVarA2, new ad1(3, null, 3), 0);
        wx4 wx4Var = new wx4(false, false);
        this.B = e9i.G0(r07Var, this.b, j0g.a, wx4Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:81:0x017c  */
    /* JADX WARN: Code duplicated, block: B:82:0x017d A[Catch: all -> 0x0033, TryCatch #2 {all -> 0x0033, blocks: (B:13:0x002e, B:79:0x0174, B:92:0x01cc, B:94:0x01dc, B:97:0x01e4, B:101:0x01ed, B:105:0x01fc, B:82:0x017d, B:84:0x0185, B:86:0x018d, B:89:0x019a, B:91:0x01a5), top: B:118:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:84:0x0185 A[Catch: all -> 0x0033, TryCatch #2 {all -> 0x0033, blocks: (B:13:0x002e, B:79:0x0174, B:92:0x01cc, B:94:0x01dc, B:97:0x01e4, B:101:0x01ed, B:105:0x01fc, B:82:0x017d, B:84:0x0185, B:86:0x018d, B:89:0x019a, B:91:0x01a5), top: B:118:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:86:0x018d A[Catch: all -> 0x0033, TryCatch #2 {all -> 0x0033, blocks: (B:13:0x002e, B:79:0x0174, B:92:0x01cc, B:94:0x01dc, B:97:0x01e4, B:101:0x01ed, B:105:0x01fc, B:82:0x017d, B:84:0x0185, B:86:0x018d, B:89:0x019a, B:91:0x01a5), top: B:118:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0197  */
    /* JADX WARN: Code duplicated, block: B:89:0x019a A[Catch: all -> 0x0033, TryCatch #2 {all -> 0x0033, blocks: (B:13:0x002e, B:79:0x0174, B:92:0x01cc, B:94:0x01dc, B:97:0x01e4, B:101:0x01ed, B:105:0x01fc, B:82:0x017d, B:84:0x0185, B:86:0x018d, B:89:0x019a, B:91:0x01a5), top: B:118:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:90:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:94:0x01dc A[Catch: all -> 0x0033, TryCatch #2 {all -> 0x0033, blocks: (B:13:0x002e, B:79:0x0174, B:92:0x01cc, B:94:0x01dc, B:97:0x01e4, B:101:0x01ed, B:105:0x01fc, B:82:0x017d, B:84:0x0185, B:86:0x018d, B:89:0x019a, B:91:0x01a5), top: B:118:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e4 A[Catch: all -> 0x0033, TryCatch #2 {all -> 0x0033, blocks: (B:13:0x002e, B:79:0x0174, B:92:0x01cc, B:94:0x01dc, B:97:0x01e4, B:101:0x01ed, B:105:0x01fc, B:82:0x017d, B:84:0x0185, B:86:0x018d, B:89:0x019a, B:91:0x01a5), top: B:118:0x002e }] */
    public static final Serializable B(rx4 rx4Var, ux4 ux4Var, nv4 nv4Var, nq4 nq4Var) {
        ox4 ox4Var;
        au3 au3Var;
        Bitmap bitmapC;
        File file;
        Rect rect;
        Rect rect2;
        String str;
        a4c a4cVar;
        je9 je9Var;
        Integer num;
        Integer num2;
        int iL;
        int iWidth;
        if (nq4Var instanceof ox4) {
            ox4Var = (ox4) nq4Var;
            int i = ox4Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                ox4Var.j = i - Integer.MIN_VALUE;
            } else {
                ox4Var = new ox4(rx4Var, nq4Var);
            }
        } else {
            ox4Var = new ox4(rx4Var, nq4Var);
        }
        Object objK = ox4Var.h;
        hu4 hu4Var = hu4.a;
        int i2 = ox4Var.j;
        try {
            if (i2 == 0) {
                ch3.d0(objK);
                rx4Var.q = ux4Var;
                w78 w78VarD = w78.d(rx4Var.d);
                w78VarD.k = (px4) rx4Var.r.getValue();
                v78 v78VarA = w78VarD.a();
                b78 b78VarA = vd7.A();
                ox4Var.d = ux4Var;
                ox4Var.e = nv4Var;
                ox4Var.j = 1;
                objK = cqk.k(new qob(new qn6(b78VarA.b(v78VarA, null), (lq4) null, 16), (lq4) null, 24), ox4Var);
                if (objK == hu4Var) {
                }
                return hu4Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                file = ox4Var.g;
                au3Var = ox4Var.f;
                try {
                    ch3.d0(objK);
                    rect2 = (Rect) objK;
                    str = rx4Var.p;
                    a4cVar = gm0.f;
                    if (a4cVar == null) {
                        je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            String strB = qx6.b(rx4Var.k);
                            if (rect2 != null) {
                                num = new Integer(rect2.width());
                            } else {
                                num = null;
                            }
                            if (rect2 != null) {
                                num2 = new Integer(rect2.height());
                            } else {
                                num2 = null;
                            }
                            a4cVar.c(je9Var, str, "image crop finished, image size: " + strB + ", cropped bounds: " + rect2 + ", cropped width: " + num + ", cropped height: " + num2, null);
                        }
                    }
                    iL = ((g5d) ((gjf) rx4Var.f.getValue())).l();
                    if (rect2 != null) {
                        iWidth = rect2.width();
                    } else {
                        iWidth = 0;
                    }
                    int iHeight = rect2 != null ? rect2.height() : 0;
                    if (iWidth >= iL && iHeight >= iL) {
                        ylc ylcVar = new ylc(Uri.fromFile(file), rect2);
                        rx8.n(au3Var, null);
                        rx4Var.q = null;
                        return ylcVar;
                    }
                    a8j.x(rx4Var.i, lk0.b);
                    rx8.n(au3Var, null);
                    rx4Var.q = null;
                    return null;
                } catch (Throwable th) {
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        rx8.n(au3Var, th);
                        throw th2;
                    }
                }
            }
            nv4Var = ox4Var.e;
            ux4Var = ox4Var.d;
            ch3.d0(objK);
            au3 au3Var2 = (au3) objK;
            if (au3Var2 == null) {
                gm0.Y(rx4Var.p, "Early return in applyImageTransformationsAndCrop cuz of imagePipeline is null");
                rx4Var.q = null;
                return null;
            }
            try {
                xt3 xt3Var = (xt3) au3Var2.K();
                if (xt3Var instanceof CloseableStaticBitmap) {
                    bitmapC = ((CloseableStaticBitmap) xt3Var).getUnderlyingBitmap();
                } else if (xt3Var instanceof wt3) {
                    Bitmap bitmapD = rx4Var.D((wt3) xt3Var);
                    if (bitmapD == null) {
                        au3Var2.close();
                        rx4Var.q = null;
                        return null;
                    }
                    try {
                        bitmapC = rx4Var.C(bitmapD, ux4Var);
                        bitmapD.recycle();
                    } catch (Throwable th3) {
                        bitmapD.recycle();
                        throw th3;
                    }
                } else {
                    bitmapC = null;
                }
                if (bitmapC == null) {
                    au3Var2.close();
                    rx4Var.q = null;
                    return null;
                }
                boolean zF = q3m.f(((Context) rx4Var.h.getValue()).getContentResolver(), rx4Var.d);
                Bitmap.CompressFormat compressFormat = zF ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
                ju6 ju6Var = (ju6) rx4Var.g.getValue();
                String str2 = zF ? "png" : "jpg";
                ju6Var.getClass();
                File fileP = ju6Var.p(null, str2);
                q3m.g(fileP.getAbsolutePath(), bitmapC, ((g5d) ((gjf) rx4Var.f.getValue())).n(), compressFormat);
                if (rx4Var.q != null) {
                    Uri uriFromFile = Uri.fromFile(fileP);
                    int width = bitmapC.getWidth();
                    int height = bitmapC.getHeight();
                    int iL2 = ((g5d) ((gjf) rx4Var.f.getValue())).l();
                    if (width < iL2 || height < iL2) {
                        a8j.x(rx4Var.i, lk0.b);
                        rect = null;
                    } else {
                        rect = new Rect(0, 0, width, height);
                    }
                    ylc ylcVar2 = new ylc(uriFromFile, rect);
                    au3Var2.close();
                    rx4Var.q = null;
                    return ylcVar2;
                }
                lk9 lk9VarC = ((n0c) rx4Var.E()).c();
                ke3 ke3Var = new ke3(nv4Var, bitmapC, null, 15);
                ox4Var.d = null;
                ox4Var.e = null;
                ox4Var.f = au3Var2;
                ox4Var.g = fileP;
                ox4Var.j = 2;
                Object objK0 = yab.K0(lk9VarC, ke3Var, ox4Var);
                if (objK0 != hu4Var) {
                    au3Var = au3Var2;
                    objK = objK0;
                    file = fileP;
                    rect2 = (Rect) objK;
                    str = rx4Var.p;
                    a4cVar = gm0.f;
                    if (a4cVar == null) {
                        je9Var = je9.d;
                        if (a4cVar.b(je9Var)) {
                            String strB2 = qx6.b(rx4Var.k);
                            if (rect2 != null) {
                                num = new Integer(rect2.width());
                            } else {
                                num = null;
                            }
                            if (rect2 != null) {
                                num2 = new Integer(rect2.height());
                            } else {
                                num2 = null;
                            }
                            a4cVar.c(je9Var, str, "image crop finished, image size: " + strB2 + ", cropped bounds: " + rect2 + ", cropped width: " + num + ", cropped height: " + num2, null);
                        }
                    }
                    iL = ((g5d) ((gjf) rx4Var.f.getValue())).l();
                    if (rect2 != null) {
                        iWidth = rect2.width();
                    } else {
                        iWidth = 0;
                    }
                    if (rect2 != null) {
                    }
                    if (iWidth >= iL) {
                        ylc ylcVar3 = new ylc(Uri.fromFile(file), rect2);
                        rx8.n(au3Var, null);
                        rx4Var.q = null;
                        return ylcVar3;
                    }
                    a8j.x(rx4Var.i, lk0.b);
                    rx8.n(au3Var, null);
                    rx4Var.q = null;
                    return null;
                }
                return hu4Var;
            } catch (Throwable th4) {
                th = th4;
                au3Var = au3Var2;
                throw th;
            }
        } catch (Throwable th5) {
            rx4Var.q = null;
            throw th5;
        }
    }

    public final Bitmap C(Bitmap bitmap, ux4 ux4Var) {
        RectF rectF = ux4Var.b;
        int iL = ((g5d) ((gjf) this.f.getValue())).l();
        int iK = gm0.K(rectF.width());
        if (iK < 1) {
            iK = 1;
        }
        int iK2 = gm0.K(rectF.height());
        float f = iL;
        float f2 = iK;
        float f3 = iK2 >= 1 ? iK2 : 1;
        float fMax = Math.max(1.0f, Math.max(f / f2, f / f3));
        int iK3 = gm0.K(f2 * fMax);
        int iK4 = gm0.K(f3 * fMax);
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = ds0.a;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iK3, iK4, config);
        float[] fArr = ux4Var.a;
        Matrix matrix = this.n;
        matrix.setValues(fArr);
        Canvas canvasF = F();
        canvasF.setBitmap(bitmapCreateBitmap);
        int iSave = canvasF.save();
        try {
            canvasF.scale(fMax, fMax);
            canvasF.translate(-rectF.left, -rectF.top);
            canvasF.concat(matrix);
            canvasF.drawBitmap(bitmap, (Rect) null, ux4Var.c, this.o);
            return bitmapCreateBitmap;
        } finally {
            canvasF.restoreToCount(iSave);
        }
    }

    public final Bitmap D(wt3 wt3Var) {
        cj cjVarL = wt3Var.l();
        String str = this.p;
        if (cjVarL == null) {
            gm0.Y(str, "Has no image, on extract first frame");
            return null;
        }
        if (cjVarL.b() <= 0) {
            gm0.Y(str, "Animated image has no frames");
            return null;
        }
        int width = cjVarL.getWidth();
        int height = cjVarL.getHeight();
        fj fjVarH = cjVarL.h(0);
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, ds0.a);
            fjVarH.a(width, height, bitmapCreateBitmap);
            return bitmapCreateBitmap;
        } catch (Exception e) {
            gm0.V(str, "Failed to render first frame", e);
            return null;
        } finally {
            fjVarH.dispose();
        }
    }

    public final xhh E() {
        return (xhh) this.e.getValue();
    }

    public final Canvas F() {
        return (Canvas) this.m.getValue();
    }

    public final void G(tx4 tx4Var) {
        I(tx4Var);
        if (this.c == jx4.b) {
            a8j.x(this.j, hw4.a);
        }
        this.s = false;
        this.l.reset();
        mjg mjgVar = this.z;
        Boolean bool = Boolean.TRUE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
        a8j.x(this.j, jw4.a);
    }

    public final void H() {
        if (this.c == jx4.b) {
            a8j.x(this.j, qw4.a);
        }
    }

    public final void I(tx4 tx4Var) {
        if (tx4Var == null) {
            return;
        }
        mjg mjgVar = this.z;
        Boolean bool = Boolean.FALSE;
        mjgVar.getClass();
        mjgVar.j(null, bool);
        float[] fArr = new float[9];
        this.l.getValues(fArr);
        a8j.t(this, ((n0c) E()).a(), new t20(this, new kbi(tx4Var, new nx4(fArr, this.s, this.x)), (lq4) null, 11), 2);
    }

    public final void J() {
        boolean zIsEmpty = this.y.isEmpty();
        qt4.C(zIsEmpty, this.z, null);
        qt4.C(!zIsEmpty, this.A, null);
    }
}
