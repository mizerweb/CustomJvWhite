package com.facebook.animated.webp;

import android.graphics.Bitmap;
import defpackage.fj;

/* JADX INFO: loaded from: classes2.dex */
public class WebPFrame implements fj {
    private long mNativeContext;

    public WebPFrame(long j) {
        this.mNativeContext = j;
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeIsBlendWithPreviousFrame();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    private native boolean nativeShouldDisposeToBackgroundColor();

    @Override // defpackage.fj
    public final void a(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }

    @Override // defpackage.fj
    public final int b() {
        return nativeGetXOffset();
    }

    @Override // defpackage.fj
    public final int c() {
        return nativeGetYOffset();
    }

    public final boolean d() {
        return nativeIsBlendWithPreviousFrame();
    }

    @Override // defpackage.fj
    public final void dispose() {
        nativeDispose();
    }

    public final boolean e() {
        return nativeShouldDisposeToBackgroundColor();
    }

    public final void finalize() {
        nativeFinalize();
    }

    @Override // defpackage.fj
    public final int getHeight() {
        return nativeGetHeight();
    }

    @Override // defpackage.fj
    public final int getWidth() {
        return nativeGetWidth();
    }
}
