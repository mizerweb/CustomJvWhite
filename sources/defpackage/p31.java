package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class p31 implements n76 {
    public final ByteBuffer a;
    public final MediaCodec.BufferInfo b;
    public final r72 c;

    public p31(n76 n76Var) {
        MediaCodec.BufferInfo bufferInfoC = n76Var.C();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, bufferInfoC.size, bufferInfoC.presentationTimeUs, bufferInfoC.flags);
        this.b = bufferInfo;
        ByteBuffer byteBufferO = n76Var.o();
        MediaCodec.BufferInfo bufferInfoC2 = n76Var.C();
        byteBufferO.position(bufferInfoC2.offset);
        byteBufferO.limit(bufferInfoC2.offset + bufferInfoC2.size);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfoC2.size);
        byteBufferAllocate.order(byteBufferO.order());
        byteBufferAllocate.put(byteBufferO);
        byteBufferAllocate.flip();
        this.a = byteBufferAllocate;
        AtomicReference atomicReference = new AtomicReference();
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = qt4.class;
        try {
            atomicReference.set(r72Var);
            r72Var.a = "Data closed";
        } catch (Exception e) {
            u72Var.c(e);
        }
        r72 r72Var2 = (r72) atomicReference.get();
        r72Var2.getClass();
        this.c = r72Var2;
    }

    @Override // defpackage.n76
    public final MediaCodec.BufferInfo C() {
        return this.b;
    }

    @Override // defpackage.n76
    public final boolean H() {
        return (this.b.flags & 1) != 0;
    }

    @Override // defpackage.n76
    public final long U() {
        return this.b.presentationTimeUs;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.c.b(null);
    }

    @Override // defpackage.n76
    public final ByteBuffer o() {
        return this.a;
    }

    @Override // defpackage.n76
    public final long size() {
        return this.b.size;
    }
}
