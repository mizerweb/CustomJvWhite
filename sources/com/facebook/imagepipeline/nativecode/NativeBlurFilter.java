package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import defpackage.yab;

/* JADX INFO: loaded from: classes.dex */
public class NativeBlurFilter {
    static {
        yab.m0("native-filters");
    }

    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
