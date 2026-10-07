package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import defpackage.g78;
import defpackage.oc9;
import defpackage.yab;

/* JADX INFO: loaded from: classes.dex */
public class Bitmaps {
    public static final /* synthetic */ int a = 0;

    static {
        int i = g78.a;
        yab.m0("imagepipeline");
    }

    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        oc9.i(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        oc9.i(Boolean.valueOf(bitmap.isMutable()));
        oc9.i(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        oc9.i(Boolean.valueOf(bitmap.getHeight() == bitmap2.getHeight()));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}
