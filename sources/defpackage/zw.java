package defpackage;

import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class zw implements vaa, Closeable {
    public SharedMemory a;
    public ByteBuffer b;
    public final long c;

    public zw(int i) {
        oc9.i(Boolean.valueOf(i > 0));
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i);
            this.a = sharedMemoryCreate;
            this.b = sharedMemoryCreate.mapReadWrite();
            this.c = System.identityHashCode(this);
        } catch (ErrnoException e) {
            ore.h("Fail to create AshmemMemory", e);
            throw null;
        }
    }

    @Override // defpackage.vaa
    public final synchronized int A(int i, int i2, int i3, byte[] bArr) {
        int iD;
        this.b.getClass();
        iD = oc9.d(i, i3, getSize());
        oc9.l(i, bArr.length, i2, iD, getSize());
        this.b.position(i);
        this.b.put(bArr, i2, iD);
        return iD;
    }

    @Override // defpackage.vaa
    public final void E(vaa vaaVar, int i) {
        if (vaaVar.l() == this.c) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(this.c) + " to AshmemMemoryChunk " + Long.toHexString(vaaVar.l()) + " which are the same ");
            oc9.i(Boolean.FALSE);
        }
        if (vaaVar.l() < this.c) {
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
        if (i >= getSize()) {
            z = false;
        }
        oc9.i(Boolean.valueOf(z));
        this.b.getClass();
        return this.b.get(i);
    }

    @Override // defpackage.vaa
    public final long K() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    public final void b(vaa vaaVar, int i) {
        if (!(vaaVar instanceof zw)) {
            ore.p("Cannot copy two incompatible MemoryChunks");
            return;
        }
        oc9.r(!isClosed());
        zw zwVar = (zw) vaaVar;
        oc9.r(!zwVar.isClosed());
        this.b.getClass();
        zwVar.b.getClass();
        oc9.l(0, zwVar.getSize(), 0, i, getSize());
        this.b.position(0);
        zwVar.b.position(0);
        byte[] bArr = new byte[i];
        this.b.get(bArr, 0, i);
        zwVar.b.put(bArr, 0, i);
    }

    @Override // defpackage.vaa, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.a;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.b;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.b = null;
                this.a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.vaa
    public final int getSize() {
        this.a.getClass();
        return this.a.getSize();
    }

    @Override // defpackage.vaa
    public final synchronized boolean isClosed() {
        return this.b == null || this.a == null;
    }

    @Override // defpackage.vaa
    public final long l() {
        return this.c;
    }

    @Override // defpackage.vaa
    public final ByteBuffer o() {
        return this.b;
    }

    @Override // defpackage.vaa
    public final synchronized int y(int i, int i2, int i3, byte[] bArr) {
        int iD;
        bArr.getClass();
        this.b.getClass();
        iD = oc9.d(i, i3, getSize());
        oc9.l(i, bArr.length, i2, iD, getSize());
        this.b.position(i);
        this.b.get(bArr, i2, iD);
        return iD;
    }
}
