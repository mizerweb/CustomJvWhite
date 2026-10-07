package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import defpackage.au3;
import defpackage.ayl;
import defpackage.c0a;
import defpackage.cba;
import defpackage.g78;
import defpackage.g95;
import defpackage.l2d;
import defpackage.oy0;
import defpackage.p76;
import defpackage.qv1;
import defpackage.qx0;
import defpackage.rx0;
import defpackage.yab;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class DalvikPurgeableDecoder implements l2d {
    public static final byte[] b;
    public final qx0 a = rx0.a();

    /* JADX INFO: loaded from: classes2.dex */
    public static class OreoUtils {
        public static void a(BitmapFactory.Options options, ColorSpace colorSpace) {
            if (colorSpace == null) {
                colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
            options.inPreferredColorSpace = colorSpace;
        }
    }

    static {
        int i = g78.a;
        yab.m0("imagepipeline");
        b = new byte[]{-1, -39};
    }

    public static boolean e(int i, au3 au3Var) {
        cba cbaVar = (cba) au3Var.K();
        return i >= 2 && cbaVar.A(i + (-2)) == -1 && cbaVar.A(i - 1) == -39;
    }

    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // defpackage.l2d
    public final au3 a(p76 p76Var, Bitmap.Config config) {
        int i = p76Var.g;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        options.inMutable = true;
        OreoUtils.a(options, null);
        au3 au3VarA = au3.A(p76Var.a);
        au3VarA.getClass();
        try {
            return f(c(au3VarA, options));
        } finally {
            au3VarA.close();
        }
    }

    @Override // defpackage.l2d
    public final au3 b(p76 p76Var, Bitmap.Config config, int i, ColorSpace colorSpace) {
        int i2 = p76Var.g;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i2;
        options.inMutable = true;
        OreoUtils.a(options, colorSpace);
        au3 au3VarA = au3.A(p76Var.a);
        au3VarA.getClass();
        try {
            return f(d(au3VarA, i, options));
        } finally {
            au3VarA.close();
        }
    }

    public abstract Bitmap c(au3 au3Var, BitmapFactory.Options options);

    public abstract Bitmap d(au3 au3Var, int i, BitmapFactory.Options options);

    public final g95 f(Bitmap bitmap) throws Throwable {
        bitmap.getClass();
        try {
            nativePinBitmap(bitmap);
            qx0 qx0Var = this.a;
            if (qx0Var.g(bitmap)) {
                return au3.k0(bitmap, qx0Var.e(), au3.f);
            }
            int iD = oy0.d(bitmap);
            bitmap.recycle();
            Locale locale = Locale.US;
            int iB = qx0Var.b();
            long jF = qx0Var.f();
            int iC = qx0Var.c();
            int iD2 = qx0Var.d();
            StringBuilder sbP = qv1.p("Attempted to pin a bitmap of size ", iD, " bytes. The current pool count is ", iB, ", the current pool size is ");
            c0a.w(sbP, jF, " bytes. The current pool max count is ", iC);
            throw new TooManyBitmapsException(qv1.o(sbP, ", the current pool max size is ", iD2, " bytes."));
        } catch (Exception e) {
            bitmap.recycle();
            ayl.b(e);
            throw null;
        }
    }
}
