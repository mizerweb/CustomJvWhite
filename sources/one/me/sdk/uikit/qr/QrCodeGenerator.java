package one.me.sdk.uikit.qr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.text.TextPaint;
import defpackage.a8g;
import defpackage.b0e;
import defpackage.bs0;
import defpackage.ch3;
import defpackage.gm0;
import defpackage.hu4;
import defpackage.ju6;
import defpackage.kbc;
import defpackage.ky8;
import defpackage.l21;
import defpackage.m34;
import defpackage.n0c;
import defpackage.nbh;
import defpackage.noh;
import defpackage.nq4;
import defpackage.ore;
import defpackage.pq3;
import defpackage.q9i;
import defpackage.sb8;
import defpackage.szd;
import defpackage.t84;
import defpackage.uzd;
import defpackage.wk8;
import defpackage.wzd;
import defpackage.xhh;
import defpackage.xt4;
import defpackage.xzd;
import defpackage.yab;
import defpackage.yl5;
import defpackage.ylc;
import defpackage.yzd;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.collections.a;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.VectorPath;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0010\u0011J8\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0087 ¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005H\u0087 ¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lone/me/sdk/uikit/qr/QrCodeGenerator;", "", "", "content", "logo", "", "size", "", "coordinates", "nativeGenerateQR", "(Ljava/lang/String;Ljava/lang/String;I[I)[I", "svg", "width", "height", "nativeRenderSvg", "(Ljava/lang/String;II)[I", "xzd", "uzd", "qr"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class QrCodeGenerator {
    public static final QrCodeGenerator a = new QrCodeGenerator();
    public static final a8g b = wzd.a;
    public static final PorterDuffXfermode c = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
    public static final LinkedHashMap d = new LinkedHashMap();
    public static ylc e;

    public static void a(Canvas canvas, Bitmap bitmap, Paint paint, int i, int i2, float f, float f2, float f3, float f4) {
        float width = (bitmap.getWidth() * f) / 100.0f;
        float height = (bitmap.getHeight() * f2) / 100.0f;
        float width2 = (bitmap.getWidth() * f3) / 100.0f;
        float height2 = (bitmap.getHeight() * f4) / 100.0f;
        float fMax = Math.max(width2, height2);
        paint.setShader(new RadialGradient(width, height, fMax, i, i2, Shader.TileMode.CLAMP));
        float f5 = width2 / fMax;
        float f6 = height2 / fMax;
        int iSave = canvas.save();
        try {
            canvas.scale(f5, f6, width, height);
            canvas.drawCircle(width, height, fMax, paint);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static uzd b(xzd xzdVar, CharSequence charSequence, CharSequence charSequence2, ky8 ky8Var, Context context, kbc kbcVar) {
        Layout layoutA;
        int iD = xzdVar.d() + 2;
        int iC = ((xzdVar.c() * 2) + iD) - (xzdVar.f() * 2);
        TextPaint textPaint = new TextPaint(1);
        noh.d(q9i.f, context, textPaint, null, null, 12);
        textPaint.setColor(kbcVar.getText().b);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        Layout layoutA2 = ky8.a(ky8Var, charSequence, textPaint, iC, 2, false, null, 0.0f, false, 480);
        if (charSequence2 != null) {
            TextPaint textPaint2 = new TextPaint(1);
            noh.d(q9i.i, context, textPaint2, null, null, 12);
            textPaint2.setColor(kbcVar.getText().d);
            layoutA = ky8.a(ky8Var, charSequence2, textPaint2, iC, 1, false, null, 0.0f, false, 480);
        } else {
            layoutA = null;
        }
        int height = layoutA != null ? layoutA.getHeight() : 0;
        return new uzd(layoutA2, layoutA, height, height > 0 ? xzdVar.h() : 0, iD);
    }

    public static ylc c(QrCodeGenerator qrCodeGenerator, String str, int i, kbc kbcVar) {
        qrCodeGenerator.getClass();
        if (i <= 0) {
            ore.p("Failed requirement.");
            return null;
        }
        int i2 = i + 2;
        int i3 = i2 * 2;
        int[] iArr = new int[4];
        int[] iArrNativeGenerateQR = nativeGenerateQR(str, "", i3, iArr);
        if (iArrNativeGenerateQR == null) {
            ore.k(nbh.q(i3, "nativeGenerateQR returned null for size="));
            return null;
        }
        int i4 = ((t84) kbcVar.f().c).b;
        int length = iArrNativeGenerateQR.length;
        for (int i5 = 0; i5 < length; i5++) {
            iArrNativeGenerateQR[i5] = iArrNativeGenerateQR[i5] == -1 ? 0 : i4;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.setPixels(iArrNativeGenerateQR, 0, i3, 0, 0, i3, i3);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, i2, i2, true);
        bitmapCreateBitmap.recycle();
        float f = i2 / i3;
        int[] iArr2 = new int[4];
        for (int i6 = 0; i6 < 4; i6++) {
            iArr2[i6] = gm0.K(iArr[i6] * f);
        }
        return new ylc(bitmapCreateScaledBitmap, iArr2);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006e  */
    public static void d(Canvas canvas, Bitmap bitmap, Context context, int i, int i2, Layout layout, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        Path path;
        Integer numValueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = d;
        Path path2 = (Path) linkedHashMap.get(numValueOf);
        if (path2 == null) {
            VectorPath vectorPathFindPath = new EnhancedVectorDrawable(context, R.drawable.avatar_shape).findPath("avatar_shape");
            if (vectorPathFindPath == null || (path = vectorPathFindPath.getPath()) == null) {
                path2 = null;
            } else {
                path2 = new Path(path);
                RectF rectF = new RectF();
                path2.computeBounds(rectF, true);
                if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                    path2 = null;
                } else {
                    Matrix matrix = new Matrix();
                    matrix.postTranslate(-rectF.left, -rectF.top);
                    float f = i;
                    matrix.postScale(f / rectF.width(), f / rectF.height());
                    path2.transform(matrix);
                    linkedHashMap.put(Integer.valueOf(i), path2);
                }
            }
        }
        if (path2 == null) {
            return;
        }
        float height = (((((i6 - i7) - i8) - i9) - i5) - i3) - layout.getHeight();
        float f2 = i;
        float f3 = (i2 / 2.0f) - (f2 / 2.0f);
        float f4 = (height - i4) - f2;
        int iSave = canvas.save();
        try {
            canvas.translate(f3, f4);
            canvas.clipPath(path2);
            canvas.drawBitmap(bitmap, (Rect) null, new Rect(0, 0, i, i), (Paint) null);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    public static void e(Bitmap bitmap, Drawable drawable, Canvas canvas, int[] iArr, int i, int i2, int i3, int i4, kbc kbcVar) {
        int width = (i / 2) - (bitmap.getWidth() / 2);
        int height = ((i3 - i4) - i2) - bitmap.getHeight();
        Canvas canvas2 = new Canvas(bitmap);
        int i5 = (int) (((double) iArr[2]) * 0.9d);
        int i6 = (int) (((double) iArr[3]) * 0.9d);
        int width2 = (bitmap.getWidth() / 2) - (i5 / 2);
        int height2 = (bitmap.getHeight() / 2) - (i6 / 2);
        sb8.m0(((t84) kbcVar.f().c).b, drawable);
        drawable.setBounds(width2, height2, i5 + width2, i6 + height2);
        drawable.draw(canvas2);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setXfermode(c);
        int[] iArr2 = (int[]) ((t84) kbcVar.f().c).i;
        Integer numC1 = a.c1(0, iArr2);
        int iIntValue = numC1 != null ? numC1.intValue() : 0;
        Integer numC2 = a.c1(1, iArr2);
        a(canvas2, bitmap, paint, iIntValue, numC2 != null ? numC2.intValue() : 0, 4.33f, 102.75f, 53.7f, 101.94f);
        Integer numC3 = a.c1(2, iArr2);
        int iIntValue2 = numC3 != null ? numC3.intValue() : 0;
        Integer numC4 = a.c1(3, iArr2);
        a(canvas2, bitmap, paint, iIntValue2, numC4 != null ? numC4.intValue() : 0, 100.15f, 59.09f, 121.47f, 103.78f);
        canvas.drawBitmap(bitmap, width, height, (Paint) null);
    }

    public static void f(Canvas canvas, Layout layout, Layout layout2, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6) {
        int height = ((i3 - i5) - i6) - bitmap.getHeight();
        if (layout2 != null) {
            float width = (canvas.getWidth() / 2.0f) - (layout2.getWidth() / 2.0f);
            int iSave = canvas.save();
            canvas.translate(width, (height - i) - i2);
            try {
                layout2.draw(canvas);
                canvas.restoreToCount(iSave);
            } catch (Throwable th) {
                canvas.restoreToCount(iSave);
                throw th;
            }
        }
        float height2 = (((height - i) - i2) - i4) - layout.getHeight();
        float width2 = (canvas.getWidth() / 2.0f) - (layout.getWidth() / 2.0f);
        int iSave2 = canvas.save();
        canvas.translate(width2, height2);
        try {
            layout.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave2);
        }
    }

    public static final native int[] nativeGenerateQR(String content, String logo, int size, int[] coordinates);

    public static final native int[] nativeRenderSvg(String svg, int width, int height);

    /* JADX WARN: Code duplicated, block: B:103:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:109:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x0348  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    public final Object g(Context context, int i, ju6 ju6Var, xhh xhhVar, ky8 ky8Var, b0e b0eVar, String str, Drawable drawable, Bitmap bitmap, Drawable drawable2, CharSequence charSequence, CharSequence charSequence2, nq4 nq4Var) throws Throwable {
        yzd yzdVar;
        float fMin;
        String str2;
        String str3;
        Bitmap bitmap2;
        a8g a8gVar;
        Context context2;
        Bitmap bitmap3;
        Object obj;
        Bitmap bitmap4;
        String absolutePath;
        String str4 = str;
        String str5 = "QR generation failed for type: ";
        if (nq4Var instanceof yzd) {
            yzdVar = (yzd) nq4Var;
            int i2 = yzdVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yzdVar.l = i2 - Integer.MIN_VALUE;
            } else {
                yzdVar = new yzd(this, nq4Var);
            }
        } else {
            yzdVar = new yzd(this, nq4Var);
        }
        yzd yzdVar2 = yzdVar;
        Object obj2 = yzdVar2.j;
        int i3 = yzdVar2.l;
        a8g a8gVar2 = pq3.j;
        Bitmap bitmap5 = null;
        if (i3 == 0) {
            ch3.d0(obj2);
            if (drawable == null || bitmap == null || drawable2 == null) {
                gm0.Y(QrCodeGenerator.class.getName(), "Early return in encodeQR cuz of logo == null || avatar == null || background == null");
                return null;
            }
            kbc kbcVar = a8gVar2.k(context).a;
            xzd xzdVar = new xzd(gm0.K(132.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 20.0f), gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(8.0f * yl5.d().getDisplayMetrics().density), gm0.K(16.0f * yl5.d().getDisplayMetrics().density), gm0.K(20.0f * yl5.d().getDisplayMetrics().density), gm0.K(52.0f * yl5.d().getDisplayMetrics().density), gm0.K(192.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 2.0f));
            uzd uzdVarB = b(xzdVar, charSequence, charSequence2, ky8Var, context, kbcVar);
            int i4 = (xzdVar.i() * 2) + xzdVar.a(uzdVarB);
            int iT = wk8.t(context);
            if (i4 > iT) {
                float f = iT / i4;
                if (f < 0.6f) {
                    f = 0.6f;
                }
                fMin = Math.min(f, 1.0f);
            } else {
                fMin = 1.0f;
            }
            xzd xzdVarJ = xzdVar.j(fMin);
            uzd uzdVarB2 = fMin == 1.0f ? uzdVarB : b(xzdVarJ, charSequence, charSequence2, ky8Var, context, kbcVar);
            int[] iArr = new int[4];
            try {
                ylc ylcVarC = c(this, str4, xzdVarJ.d(), kbcVar);
                Bitmap bitmap6 = (Bitmap) ylcVarC.a;
                try {
                    try {
                        System.arraycopy((int[]) ylcVarC.b, 0, iArr, 0, 4);
                        int iC = (xzdVarJ.c() * 2) + bitmap6.getWidth();
                        int iA = xzdVarJ.a(uzd.a(uzdVarB2, bitmap6.getHeight()));
                        int i5 = (xzdVarJ.i() * 2) + iA;
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i5, Bitmap.Config.ARGB_8888);
                        uzd uzdVar = uzdVarB2;
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        drawable2.setBounds(0, 0, i, i5);
                        drawable2.draw(canvas);
                        Path path = new Path();
                        float f2 = i / 2.0f;
                        float f3 = iC / 2.0f;
                        path.addRoundRect(f2 - f3, xzdVarJ.i(), f2 + f3, xzdVarJ.i() + iA, gm0.K(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f) * fMin), gm0.K(gm0.K(24.0f * yl5.d().getDisplayMetrics().density) * fMin), Path.Direction.CW);
                        Paint paint = new Paint();
                        paint.setColor(kbcVar.b().f);
                        paint.setShadowLayer(gm0.K(4.0f * yl5.d().getDisplayMetrics().density), 0.0f, 0.0f, ((bs0) kbcVar.i().f).c);
                        canvas.drawPath(path, paint);
                        str2 = "Cache path: ";
                        try {
                            e(bitmap6, drawable, canvas, iArr, i, xzdVarJ.c(), i5, xzdVarJ.i(), kbcVar);
                            bitmap6 = bitmap6;
                            try {
                                f(canvas, uzdVar.d(), uzdVar.c(), bitmap6, xzdVarJ.e(), uzdVar.b(), i5, uzdVar.e(), xzdVarJ.i(), xzdVarJ.c());
                                int iB = xzdVarJ.b();
                                Layout layoutD = uzdVar.d();
                                int iB2 = uzdVar.b();
                                str5 = "QR generation failed for type: ";
                                str3 = "sharedQr";
                                a8gVar = a8gVar2;
                                try {
                                    d(canvas, bitmap, context, iB, i, layoutD, iB2, xzdVarJ.g(), xzdVarJ.e(), i5, xzdVarJ.i(), xzdVarJ.c(), bitmap6.getHeight());
                                    File fileJ = ju6.j(ju6Var.n().getPath(), str3);
                                    File file = new File(fileJ, l21.a(((Object) charSequence) + "_" + a8gVar.e(context).m().getName() + ".png"));
                                    xt4 xt4VarB = ((n0c) xhhVar).b();
                                    try {
                                        m34 m34Var = new m34(3, null, file, fileJ, ju6Var, context, bitmapCreateBitmap);
                                        context2 = context;
                                        yzdVar2.d = context2;
                                        ju6Var = ju6Var;
                                        try {
                                            yzdVar2.e = ju6Var;
                                            b0eVar = b0eVar;
                                            try {
                                                yzdVar2.f = b0eVar;
                                                str4 = str;
                                                try {
                                                    yzdVar2.g = str4;
                                                    bitmap2 = bitmap6;
                                                    try {
                                                        yzdVar2.h = bitmap2;
                                                        yzdVar2.i = bitmapCreateBitmap;
                                                        yzdVar2.l = 1;
                                                        Object objK0 = yab.K0(xt4VarB, m34Var, yzdVar2);
                                                        hu4 hu4Var = hu4.a;
                                                        if (objK0 == hu4Var) {
                                                            return hu4Var;
                                                        }
                                                        bitmap3 = bitmap2;
                                                        obj = objK0;
                                                        bitmap4 = bitmapCreateBitmap;
                                                        szd szdVar = new szd((Uri) obj, bitmap4, a8gVar.e(context2).m());
                                                        e = new ylc(b0eVar, szdVar);
                                                        if (bitmap3 != null) {
                                                            bitmap3.recycle();
                                                        }
                                                        return szdVar;
                                                    } catch (CancellationException e2) {
                                                        e = e2;
                                                        bitmap5 = bitmap2;
                                                        throw e;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        gm0.V(QrCodeGenerator.class.getName(), "encodeQR: failed", th);
                                                        a8g a8gVar3 = b;
                                                        a8gVar3.d(str5 + b0eVar + ", data: " + str4, th);
                                                        absolutePath = ju6.j(ju6Var.n().getPath(), str3).getAbsolutePath();
                                                        if (absolutePath == null) {
                                                            absolutePath = "null";
                                                        }
                                                        String strConcat = str2.concat(absolutePath);
                                                        a8gVar3.getClass();
                                                        gm0.Y("QrCodeGenerator", strConcat);
                                                        if (bitmap2 != null) {
                                                            bitmap2.recycle();
                                                        }
                                                        return null;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    bitmap2 = bitmap6;
                                                    gm0.V(QrCodeGenerator.class.getName(), "encodeQR: failed", th);
                                                    a8g a8gVar4 = b;
                                                    a8gVar4.d(str5 + b0eVar + ", data: " + str4, th);
                                                    absolutePath = ju6.j(ju6Var.n().getPath(), str3).getAbsolutePath();
                                                    if (absolutePath == null) {
                                                        absolutePath = "null";
                                                    }
                                                    String strConcat2 = str2.concat(absolutePath);
                                                    a8gVar4.getClass();
                                                    gm0.Y("QrCodeGenerator", strConcat2);
                                                    if (bitmap2 != null) {
                                                        bitmap2.recycle();
                                                    }
                                                    return null;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                str4 = str;
                                                bitmap2 = bitmap6;
                                                gm0.V(QrCodeGenerator.class.getName(), "encodeQR: failed", th);
                                                a8g a8gVar5 = b;
                                                a8gVar5.d(str5 + b0eVar + ", data: " + str4, th);
                                                absolutePath = ju6.j(ju6Var.n().getPath(), str3).getAbsolutePath();
                                                if (absolutePath == null) {
                                                    absolutePath = "null";
                                                }
                                                String strConcat3 = str2.concat(absolutePath);
                                                a8gVar5.getClass();
                                                gm0.Y("QrCodeGenerator", strConcat3);
                                                if (bitmap2 != null) {
                                                    bitmap2.recycle();
                                                }
                                                return null;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            b0eVar = b0eVar;
                                            str4 = str;
                                            bitmap2 = bitmap6;
                                            gm0.V(QrCodeGenerator.class.getName(), "encodeQR: failed", th);
                                            a8g a8gVar6 = b;
                                            a8gVar6.d(str5 + b0eVar + ", data: " + str4, th);
                                            absolutePath = ju6.j(ju6Var.n().getPath(), str3).getAbsolutePath();
                                            if (absolutePath == null) {
                                                absolutePath = "null";
                                            }
                                            String strConcat4 = str2.concat(absolutePath);
                                            a8gVar6.getClass();
                                            gm0.Y("QrCodeGenerator", strConcat4);
                                            if (bitmap2 != null) {
                                                bitmap2.recycle();
                                            }
                                            return null;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        b0eVar = b0eVar;
                                        str4 = str;
                                        ju6Var = ju6Var;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    ju6Var = ju6Var;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                bitmap2 = bitmap6;
                                str3 = "sharedQr";
                                gm0.V(QrCodeGenerator.class.getName(), "encodeQR: failed", th);
                                a8g a8gVar7 = b;
                                a8gVar7.d(str5 + b0eVar + ", data: " + str4, th);
                                absolutePath = ju6.j(ju6Var.n().getPath(), str3).getAbsolutePath();
                                if (absolutePath == null) {
                                    absolutePath = "null";
                                }
                                String strConcat5 = str2.concat(absolutePath);
                                a8gVar7.getClass();
                                gm0.Y("QrCodeGenerator", strConcat5);
                                if (bitmap2 != null) {
                                    bitmap2.recycle();
                                }
                                return null;
                            }
                        } catch (CancellationException e3) {
                            e = e3;
                            bitmap2 = bitmap6;
                        } catch (Throwable th8) {
                            th = th8;
                            b0eVar = b0eVar;
                            bitmap2 = bitmap6;
                            str4 = str4;
                            ju6Var = ju6Var;
                            str3 = "sharedQr";
                            gm0.V(QrCodeGenerator.class.getName(), "encodeQR: failed", th);
                            a8g a8gVar8 = b;
                            a8gVar8.d(str5 + b0eVar + ", data: " + str4, th);
                            absolutePath = ju6.j(ju6Var.n().getPath(), str3).getAbsolutePath();
                            if (absolutePath == null) {
                                absolutePath = "null";
                            }
                            String strConcat6 = str2.concat(absolutePath);
                            a8gVar8.getClass();
                            gm0.Y("QrCodeGenerator", strConcat6);
                            if (bitmap2 != null) {
                                bitmap2.recycle();
                            }
                            return null;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        str2 = "Cache path: ";
                    }
                } catch (CancellationException e4) {
                    e = e4;
                    bitmap2 = bitmap6;
                }
            } catch (CancellationException e5) {
                e = e5;
            } catch (Throwable th10) {
                th = th10;
                ju6Var = ju6Var;
                b0eVar = b0eVar;
                str4 = str4;
                str2 = "Cache path: ";
                str5 = "QR generation failed for type: ";
                str3 = "sharedQr";
                bitmap2 = null;
            }
        } else {
            if (i3 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bitmap4 = yzdVar2.i;
            Bitmap bitmap7 = yzdVar2.h;
            str4 = yzdVar2.g;
            b0e b0eVar2 = yzdVar2.f;
            ju6 ju6Var2 = yzdVar2.e;
            Context context3 = yzdVar2.d;
            try {
                ch3.d0(obj2);
                obj = obj2;
                ju6Var = ju6Var2;
                context2 = context3;
                bitmap3 = bitmap7;
                b0eVar = b0eVar2;
                a8gVar = a8gVar2;
                str2 = "Cache path: ";
                str5 = "QR generation failed for type: ";
                str3 = "sharedQr";
                try {
                    szd szdVar2 = new szd((Uri) obj, bitmap4, a8gVar.e(context2).m());
                    e = new ylc(b0eVar, szdVar2);
                    if (bitmap3 != null) {
                        bitmap3.recycle();
                    }
                    return szdVar2;
                } catch (CancellationException e6) {
                    e = e6;
                    bitmap5 = bitmap3;
                    try {
                        throw e;
                    } catch (Throwable th11) {
                        th = th11;
                        bitmap2 = bitmap5;
                    }
                } catch (Throwable th12) {
                    th = th12;
                    bitmap2 = bitmap3;
                    try {
                        gm0.V(QrCodeGenerator.class.getName(), "encodeQR: failed", th);
                        a8g a8gVar9 = b;
                        a8gVar9.d(str5 + b0eVar + ", data: " + str4, th);
                        absolutePath = ju6.j(ju6Var.n().getPath(), str3).getAbsolutePath();
                        if (absolutePath == null) {
                            absolutePath = "null";
                        }
                        String strConcat7 = str2.concat(absolutePath);
                        a8gVar9.getClass();
                        gm0.Y("QrCodeGenerator", strConcat7);
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                        }
                        return null;
                    } catch (Throwable th13) {
                        th = th13;
                    }
                }
            } catch (CancellationException e7) {
                e = e7;
                bitmap5 = bitmap7;
                throw e;
            } catch (Throwable th14) {
                th = th14;
                bitmap2 = bitmap7;
                b0eVar = b0eVar2;
                ju6Var = ju6Var2;
                str2 = "Cache path: ";
                str3 = "sharedQr";
                gm0.V(QrCodeGenerator.class.getName(), "encodeQR: failed", th);
                a8g a8gVar10 = b;
                a8gVar10.d(str5 + b0eVar + ", data: " + str4, th);
                absolutePath = ju6.j(ju6Var.n().getPath(), str3).getAbsolutePath();
                if (absolutePath == null) {
                    absolutePath = "null";
                }
                String strConcat8 = str2.concat(absolutePath);
                a8gVar10.getClass();
                gm0.Y("QrCodeGenerator", strConcat8);
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                return null;
            }
        }
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        throw th;
    }
}
