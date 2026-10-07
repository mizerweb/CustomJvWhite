package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import defpackage.au3;
import defpackage.h95;
import defpackage.i1e;
import defpackage.ine;
import defpackage.l68;
import defpackage.xt3;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface CloseableStaticBitmap extends xt3 {
    static CloseableStaticBitmap of(Bitmap bitmap, ine ineVar, i1e i1eVar, int i, int i2) {
        int i3 = h95.i;
        return new h95(bitmap, ineVar, i1eVar, i, i2);
    }

    au3 cloneUnderlyingBitmapReference();

    @Override // defpackage.xt3, java.io.Closeable, java.lang.AutoCloseable
    /* synthetic */ void close();

    au3 convertToBitmapReference();

    int getExifOrientation();

    @Override // defpackage.l68, com.facebook.fresco.middleware.HasExtraData
    /* synthetic */ Map getExtras();

    @Override // defpackage.xt3, defpackage.l68
    /* synthetic */ int getHeight();

    @Override // defpackage.xt3
    /* synthetic */ l68 getImageInfo();

    @Override // defpackage.xt3
    /* synthetic */ i1e getQualityInfo();

    int getRotationAngle();

    @Override // defpackage.xt3
    /* synthetic */ int getSizeInBytes();

    Bitmap getUnderlyingBitmap();

    @Override // defpackage.xt3, defpackage.l68
    /* synthetic */ int getWidth();

    @Override // defpackage.xt3
    /* synthetic */ boolean isClosed();

    @Override // defpackage.xt3
    /* synthetic */ boolean isStateful();

    static CloseableStaticBitmap of(au3 au3Var, i1e i1eVar, int i) {
        return of(au3Var, i1eVar, i, 0);
    }

    static CloseableStaticBitmap of(Bitmap bitmap, ine ineVar, i1e i1eVar, int i) {
        return of(bitmap, ineVar, i1eVar, i, 0);
    }

    static CloseableStaticBitmap of(au3 au3Var, i1e i1eVar, int i, int i2) {
        int i3 = h95.i;
        return new h95(au3Var, i1eVar, i, i2);
    }
}
