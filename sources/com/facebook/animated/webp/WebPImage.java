package com.facebook.animated.webp;

import android.graphics.Bitmap;
import defpackage.cj;
import defpackage.d68;
import defpackage.dj;
import defpackage.fj;
import defpackage.oc9;
import defpackage.ui;
import defpackage.xjg;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class WebPImage implements cj, dj {
    public Bitmap.Config a = null;
    private long mNativeContext;

    public WebPImage(long j) {
        this.mNativeContext = j;
    }

    public static WebPImage j(byte[] bArr, d68 d68Var) {
        xjg.b();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        byteBufferAllocateDirect.put(bArr);
        byteBufferAllocateDirect.rewind();
        WebPImage webPImageNativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBufferAllocateDirect);
        if (d68Var != null) {
            webPImageNativeCreateFromDirectByteBuffer.a = d68Var.b;
        }
        return webPImageNativeCreateFromDirectByteBuffer;
    }

    private static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    private static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    private native WebPFrame nativeGetFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    @Override // defpackage.dj
    public final cj a(long j, int i, d68 d68Var) {
        xjg.b();
        oc9.i(Boolean.valueOf(j != 0));
        WebPImage webPImageNativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i);
        if (d68Var != null) {
            webPImageNativeCreateFromNativeMemory.a = d68Var.b;
        }
        return webPImageNativeCreateFromNativeMemory;
    }

    @Override // defpackage.cj
    public final int b() {
        return nativeGetFrameCount();
    }

    @Override // defpackage.dj
    public final cj c(ByteBuffer byteBuffer, d68 d68Var) {
        xjg.b();
        byteBuffer.rewind();
        WebPImage webPImageNativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer);
        if (d68Var != null) {
            webPImageNativeCreateFromDirectByteBuffer.a = d68Var.b;
        }
        return webPImageNativeCreateFromDirectByteBuffer;
    }

    @Override // defpackage.cj
    public final boolean d() {
        return true;
    }

    @Override // defpackage.cj
    public final ui e(int i) {
        WebPFrame webPFrameNativeGetFrame = nativeGetFrame(i);
        try {
            int iB = webPFrameNativeGetFrame.b();
            int iC = webPFrameNativeGetFrame.c();
            int width = webPFrameNativeGetFrame.getWidth();
            int height = webPFrameNativeGetFrame.getHeight();
            int i2 = 2;
            if (webPFrameNativeGetFrame.d()) {
                i2 = 1;
            }
            return new ui(iB, iC, width, height, i2, webPFrameNativeGetFrame.e() ? 2 : 1);
        } finally {
            webPFrameNativeGetFrame.dispose();
        }
    }

    @Override // defpackage.cj
    public final int f() {
        return nativeGetLoopCount();
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

    public final void k() {
        nativeDispose();
    }

    public final WebPFrame l() {
        return nativeGetFrame(0);
    }

    public WebPImage() {
    }
}
