package io.antmedia.rtmp_client;

import defpackage.zo5;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class RtmpClient {
    public long a;

    public static class RtmpIOException extends IOException {
        public RtmpIOException(int i) {
            super(zo5.h(i, "RTMP error: "));
        }
    }

    static {
        System.loadLibrary("rtmp-jni");
    }

    private native long nativeAlloc();

    private native void nativeClose(long j);

    private native int nativeOpen(String str, boolean z, long j, int i, int i2);

    private native int nativeRead(byte[] bArr, int i, int i2, long j) throws IllegalStateException;

    public final void a() {
        nativeClose(this.a);
        this.a = 0L;
    }

    public final void b(String str) throws RtmpIOException {
        long jNativeAlloc = nativeAlloc();
        this.a = jNativeAlloc;
        if (jNativeAlloc == 0) {
            throw new RtmpIOException(-2);
        }
        int iNativeOpen = nativeOpen(str, false, jNativeAlloc, 10000, 10000);
        if (iNativeOpen == 0) {
            return;
        }
        this.a = 0L;
        throw new RtmpIOException(iNativeOpen);
    }

    public final int c(byte[] bArr, int i, int i2) throws RtmpIOException {
        int iNativeRead = nativeRead(bArr, i, i2, this.a);
        if (iNativeRead >= 0 || iNativeRead == -1) {
            return iNativeRead;
        }
        throw new RtmpIOException(iNativeRead);
    }
}
