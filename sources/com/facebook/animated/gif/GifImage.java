package com.facebook.animated.gif;

import android.graphics.Bitmap;
import defpackage.cj;
import defpackage.d68;
import defpackage.dj;
import defpackage.fj;
import defpackage.oc9;
import defpackage.ui;
import defpackage.yab;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class GifImage implements cj, dj {
    public static volatile boolean b;
    public Bitmap.Config a = null;
    private long mNativeContext;

    public GifImage(long j) {
        this.mNativeContext = j;
    }

    public static synchronized void j() {
        if (!b) {
            b = true;
            yab.m0("gifimage");
        }
    }

    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    private static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    private static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native GifFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    private native boolean nativeIsAnimated();

    @Override // defpackage.dj
    public final cj a(long j, int i, d68 d68Var) {
        j();
        oc9.i(Boolean.valueOf(j != 0));
        d68Var.getClass();
        GifImage gifImageNativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i, Integer.MAX_VALUE, false);
        gifImageNativeCreateFromNativeMemory.a = d68Var.b;
        return gifImageNativeCreateFromNativeMemory;
    }

    @Override // defpackage.cj
    public final int b() {
        return nativeGetFrameCount();
    }

    @Override // defpackage.dj
    public final cj c(ByteBuffer byteBuffer, d68 d68Var) {
        j();
        byteBuffer.rewind();
        d68Var.getClass();
        GifImage gifImageNativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, Integer.MAX_VALUE, false);
        gifImageNativeCreateFromDirectByteBuffer.a = d68Var.b;
        return gifImageNativeCreateFromDirectByteBuffer;
    }

    @Override // defpackage.cj
    public final boolean d() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:5:0x001d  */
    @Override // defpackage.cj
    public final ui e(int i) {
        int i2;
        GifFrame gifFrameNativeGetFrame = nativeGetFrame(i);
        try {
            int iB = gifFrameNativeGetFrame.b();
            int iC = gifFrameNativeGetFrame.c();
            int width = gifFrameNativeGetFrame.getWidth();
            int height = gifFrameNativeGetFrame.getHeight();
            int iD = gifFrameNativeGetFrame.d();
            if (iD == 0 || iD == 1) {
                i2 = 1;
            } else {
                i2 = 2;
                if (iD != 2) {
                    i2 = 3;
                    if (iD != 3) {
                        i2 = 1;
                    }
                }
            }
            return new ui(iB, iC, width, height, 1, i2);
        } finally {
            gifFrameNativeGetFrame.dispose();
        }
    }

    @Override // defpackage.cj
    public final int f() {
        int iNativeGetLoopCount = nativeGetLoopCount();
        if (iNativeGetLoopCount == -1) {
            return 1;
        }
        if (iNativeGetLoopCount != 0) {
            return iNativeGetLoopCount + 1;
        }
        return 0;
    }

    public final void finalize() {
        nativeFinalize();
    }

    @Override // defpackage.cj
    public final Bitmap.Config g() {
        return this.a;
    }

    @Override // defpackage.cj
    public final int getHeight() {
        return nativeGetHeight();
    }

    @Override // defpackage.cj
    public final int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    @Override // defpackage.cj
    public final int getWidth() {
        return nativeGetWidth();
    }

    @Override // defpackage.cj
    public final fj h(int i) {
        return nativeGetFrame(i);
    }

    @Override // defpackage.cj
    public final int[] i() {
        return nativeGetFrameDurations();
    }

    public GifImage() {
    }
}
