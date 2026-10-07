package defpackage;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class v31 implements vaa, Closeable {
    public ByteBuffer a;
    public final int b;
    public final long c = System.identityHashCode(this);

    public v31(int i) {
        this.a = ByteBuffer.allocateDirect(i);
        this.b = i;
    }

    @Override // defpackage.vaa
    public final synchronized int A(int i, int i2, int i3, byte[] bArr) {
        int iD;
        oc9.r(!isClosed());
        this.a.getClass();
        iD = oc9.d(i, i3, this.b);
        oc9.l(i, bArr.length, i2, iD, this.b);
        this.a.position(i);
        this.a.put(bArr, i2, iD);
        return iD;
    }

    @Override // defpackage.vaa
    public final void E(vaa vaaVar, int i) {
        if (vaaVar.l() == this.c) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(this.c) + " to BufferMemoryChunk " + Long.toHexString(vaaVar.l()) + " which are the same ");
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
        if (i >= this.b) {
            z = false;
        }
        oc9.i(Boolean.valueOf(z));
        this.a.getClass();
        return this.a.get(i);
    }

    @Override // defpackage.vaa
    public final long K() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    public final void b(vaa vaaVar, int i) {
        if (!(vaaVar instanceof v31)) {
            ore.p("Cannot copy two incompatible MemoryChunks");
            return;
        }
        oc9.r(!isClosed());
        v31 v31Var = (v31) vaaVar;
        oc9.r(!v31Var.isClosed());
        this.a.getClass();
        oc9.l(0, v31Var.b, 0, i, this.b);
        this.a.position(0);
        ByteBuffer byteBufferO = v31Var.o();
        byteBufferO.getClass();
        byteBufferO.position(0);
        byte[] bArr = new byte[i];
        this.a.get(bArr, 0, i);
        byteBufferO.put(bArr, 0, i);
    }

    @Override // defpackage.vaa, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a = null;
    }

    @Override // defpackage.vaa
    public final int getSize() {
        return this.b;
    }

    @Override // defpackage.vaa
    public final synchronized boolean isClosed() {
        return this.a == null;
    }

    @Override // defpackage.vaa
    public final long l() {
        return this.c;
    }

    @Override // defpackage.vaa
    public final synchronized ByteBuffer o() {
        return this.a;
    }

    @Override // defpackage.vaa
    public final synchronized int y(int i, int i2, int i3, byte[] bArr) {
        int iD;
        bArr.getClass();
        oc9.r(!isClosed());
        this.a.getClass();
        iD = oc9.d(i, i3, this.b);
        oc9.l(i, bArr.length, i2, iD, this.b);
        this.a.position(i);
        this.a.get(bArr, i2, iD);
        return iD;
    }
}
