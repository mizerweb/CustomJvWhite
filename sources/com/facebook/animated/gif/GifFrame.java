package com.facebook.animated.gif;

import android.graphics.Bitmap;
import defpackage.fj;

/* JADX INFO: loaded from: classes2.dex */
public class GifFrame implements fj {
    private long mNativeContext;

    public GifFrame(long j) {
        this.mNativeContext = j;
    }

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDisposalMode();

    private native int nativeGetDurationMs();

    private native int nativeGetHeight();

    private native int nativeGetTransparentPixelColor();

    private native int nativeGetWidth();

    private native int nativeGetXOffset();

    private native int nativeGetYOffset();

    private native boolean nativeHasTransparency();

    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

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

    public final int d() {
        return nativeGetDisposalMode();
    }

    @Override // defpackage.fj
    public final void dispose() {
        nativeDispose();
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
