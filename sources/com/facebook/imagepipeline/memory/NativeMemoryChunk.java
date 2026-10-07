package com.facebook.imagepipeline.memory;

import android.util.Log;
import defpackage.oc9;
import defpackage.ore;
import defpackage.vaa;
import defpackage.yab;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class NativeMemoryChunk implements vaa, Closeable {
    public final long a;
    public final int b;
    public boolean c;

    static {
        yab.m0("imagepipeline");
    }

    public NativeMemoryChunk(int i) {
        oc9.i(Boolean.valueOf(i > 0));
        this.b = i;
        this.a = nativeAllocate(i);
        this.c = false;
    }

    private static native long nativeAllocate(int i);

    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    private static native void nativeFree(long j);

    private static native void nativeMemcpy(long j, long j2, int i);

    private static native byte nativeReadByte(long j);

    @Override // defpackage.vaa
    public final synchronized int A(int i, int i2, int i3, byte[] bArr) {
        int iD;
        oc9.r(!isClosed());
        iD = oc9.d(i, i3, this.b);
        oc9.l(i, bArr.length, i2, iD, this.b);
        nativeCopyFromByteArray(this.a + ((long) i), bArr, i2, iD);
        return iD;
    }

    @Override // defpackage.vaa
    public final void E(vaa vaaVar, int i) {
        if (vaaVar.l() == this.a) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(vaaVar)) + " which share the same address " + Long.toHexString(this.a));
            oc9.i(Boolean.FALSE);
        }
        if (vaaVar.l() < this.a) {
            synchronized (vaaVar) {
                synchronized (this) {
                    b(vaaVar, i);
                }
            }
        } else {
            synchronized (this) {
                synchronized (vaaVar) {
                    b(vaaVar, i);
                }
            }
        }
    }

    @Override // defpackage.vaa
    public final synchronized byte I(int i) {
        boolean z = true;
        oc9.r(!isClosed());
        oc9.i(Boolean.valueOf(i >= 0));
        if (i >= this.b) {
            z = false;
        }
        oc9.i(Boolean.valueOf(z));
        return nativeReadByte(this.a + ((long) i));
    }

    @Override // defpackage.vaa
    public final long K() {
        return this.a;
    }

    public final void b(vaa vaaVar, int i) {
        if (!(vaaVar instanceof NativeMemoryChunk)) {
            ore.p("Cannot copy two incompatible MemoryChunks");
            return;
        }
        oc9.r(!isClosed());
        NativeMemoryChunk nativeMemoryChunk = (NativeMemoryChunk) vaaVar;
        oc9.r(!nativeMemoryChunk.isClosed());
        oc9.l(0, nativeMemoryChunk.b, 0, i, this.b);
        nativeMemcpy(nativeMemoryChunk.a, this.a, i);
    }

    @Override // defpackage.vaa, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.c) {
            this.c = true;
            nativeFree(this.a);
        }
    }

    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // defpackage.vaa
    public final int getSize() {
        return this.b;
    }

    @Override // defpackage.vaa
    public final synchronized boolean isClosed() {
        return this.c;
    }

    @Override // defpackage.vaa
    public final long l() {
        return this.a;
    }

    @Override // defpackage.vaa
    public final ByteBuffer o() {
        return null;
    }

    @Override // defpackage.vaa
    public final synchronized int y(int i, int i2, int i3, byte[] bArr) {
        int iD;
        bArr.getClass();
        oc9.r(!isClosed());
        iD = oc9.d(i, i3, this.b);
        oc9.l(i, bArr.length, i2, iD, this.b);
        nativeCopyToByteArray(this.a + ((long) i), bArr, i2, iD);
        return iD;
    }
}
