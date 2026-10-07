package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* JADX INFO: loaded from: classes.dex */
public final class h95 extends hq0 implements CloseableStaticBitmap {
    public static final /* synthetic */ int i = 0;
    public au3 d;
    public volatile Bitmap e;
    public final i1e f;
    public final int g;
    public final int h;

    public h95(Bitmap bitmap, ine ineVar, i1e i1eVar, int i2, int i3) {
        bitmap.getClass();
        this.e = bitmap;
        Bitmap bitmap2 = this.e;
        ineVar.getClass();
        this.d = au3.k0(bitmap2, ineVar, au3.f);
        this.f = i1eVar;
        this.g = i2;
        this.h = i3;
    }

    @Override // com.facebook.imagepipeline.image.CloseableStaticBitmap
    public final synchronized au3 cloneUnderlyingBitmapReference() {
        return au3.A(this.d);
    }

    @Override // defpackage.xt3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        au3 au3Var;
        synchronized (this) {
            au3Var = this.d;
            this.d = null;
            this.e = null;
        }
        if (au3Var != null) {
            au3Var.close();
        }
    }

    @Override // com.facebook.imagepipeline.image.CloseableStaticBitmap
    public final synchronized au3 convertToBitmapReference() {
        au3 au3Var;
        oc9.q(this.d, "Cannot convert a closed static bitmap");
        synchronized (this) {
            au3Var = this.d;
            this.d = null;
            this.e = null;
        }
        return au3Var;
        return au3Var;
    }

    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        pj6.l("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", h95.class.getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // com.facebook.imagepipeline.image.CloseableStaticBitmap
    public final int getExifOrientation() {
        return this.h;
    }

    @Override // defpackage.xt3, defpackage.l68
    public final int getHeight() {
        int i2;
        if (this.g % 180 != 0 || (i2 = this.h) == 5 || i2 == 7) {
            Bitmap bitmap = this.e;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getWidth();
        }
        Bitmap bitmap2 = this.e;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getHeight();
    }

    @Override // defpackage.hq0, defpackage.xt3
    public final i1e getQualityInfo() {
        return this.f;
    }

    @Override // com.facebook.imagepipeline.image.CloseableStaticBitmap
    public final int getRotationAngle() {
        return this.g;
    }

    @Override // defpackage.xt3
    public final int getSizeInBytes() {
        return oy0.d(this.e);
    }

    @Override // com.facebook.imagepipeline.image.CloseableStaticBitmap
    public final Bitmap getUnderlyingBitmap() {
        return this.e;
    }

    @Override // defpackage.xt3, defpackage.l68
    public final int getWidth() {
        int i2;
        if (this.g % 180 != 0 || (i2 = this.h) == 5 || i2 == 7) {
            Bitmap bitmap = this.e;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getHeight();
        }
        Bitmap bitmap2 = this.e;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getWidth();
    }

    @Override // defpackage.xt3
    public final synchronized boolean isClosed() {
        return this.d == null;
    }

    public h95(au3 au3Var, i1e i1eVar, int i2, int i3) {
        au3 au3VarY = au3Var.y();
        au3VarY.getClass();
        this.d = au3VarY;
        this.e = (Bitmap) au3VarY.K();
        this.f = i1eVar;
        this.g = i2;
        this.h = i3;
    }
}
