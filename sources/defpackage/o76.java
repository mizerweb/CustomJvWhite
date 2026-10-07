package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class o76 implements n76 {
    public final MediaCodec a;
    public final MediaCodec.BufferInfo b;
    public final int c;
    public final ByteBuffer d;
    public final u72 e;
    public final r72 f;
    public final AtomicBoolean g = new AtomicBoolean(false);

    public o76(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        this.a = mediaCodec;
        this.c = i;
        this.d = mediaCodec.getOutputBuffer(i);
        this.b = bufferInfo;
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
        this.e = u72Var;
        r72 r72Var2 = (r72) atomicReference.get();
        r72Var2.getClass();
        this.f = r72Var2;
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
        r72 r72Var = this.f;
        if (this.g.getAndSet(true)) {
            return;
        }
        try {
            this.a.releaseOutputBuffer(this.c, false);
            r72Var.b(null);
        } catch (IllegalStateException e) {
            r72Var.d(e);
        }
    }

    @Override // defpackage.n76
    public final ByteBuffer o() {
        if (this.g.get()) {
            ore.k("encoded data is closed.");
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = this.b;
        int i = bufferInfo.offset;
        ByteBuffer byteBuffer = this.d;
        byteBuffer.position(i);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return byteBuffer;
    }

    @Override // defpackage.n76
    public final long size() {
        return this.b.size;
    }
}
