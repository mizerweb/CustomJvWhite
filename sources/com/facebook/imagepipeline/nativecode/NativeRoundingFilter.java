package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import defpackage.yab;

/* JADX INFO: loaded from: classes.dex */
public class NativeRoundingFilter {
    static {
        yab.m0("native-filters");
    }

    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i, int i2, int i3, int i4);

    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z);

    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    public static void toCircle(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFilter(bitmap, z);
    }

    public static void toCircleFast(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFastFilter(bitmap, z);
    }
}
