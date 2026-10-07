package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class f86 {
    public final MediaCodec a;
    public final int b;
    public final ByteBuffer c;
    public final u72 d;
    public final r72 e;
    public final AtomicBoolean f = new AtomicBoolean(false);
    public long g = 0;
    public boolean h = false;
    public final /* synthetic */ m86 i;

    public f86(m86 m86Var, MediaCodec mediaCodec, int i) {
        this.i = m86Var;
        mediaCodec.getClass();
        this.a = mediaCodec;
        if (i < 0) {
            ore.a();
            throw null;
        }
        this.b = i;
        this.c = mediaCodec.getInputBuffer(i);
        AtomicReference atomicReference = new AtomicReference();
        r72 r72Var = new r72();
        r72Var.c = new gne();
        u72 u72Var = new u72(r72Var);
        r72Var.b = u72Var;
        r72Var.a = qt4.class;
        try {
            atomicReference.set(r72Var);
            r72Var.a = "Terminate InputBuffer";
        } catch (Exception e) {
            u72Var.c(e);
        }
        this.d = u72Var;
        r72 r72Var2 = (r72) atomicReference.get();
        r72Var2.getClass();
        this.e = r72Var2;
    }

    public final boolean a() {
        r72 r72Var = this.e;
        if (this.f.getAndSet(true)) {
            return false;
        }
        try {
            this.a.queueInputBuffer(this.b, 0, 0, 0L, 0);
            r72Var.b(null);
        } catch (IllegalStateException e) {
            r72Var.d(e);
        }
        return true;
    }

    public final void b(long j) {
        m86 m86Var = this.i;
        if (!m86Var.c) {
            j = m86Var.n(j);
        }
        if (this.f.get()) {
            ore.k("The buffer is submitted or canceled.");
        } else {
            qyj.i(j >= 0);
            this.g = j;
        }
    }

    public final boolean c() {
        r72 r72Var = this.e;
        ByteBuffer byteBuffer = this.c;
        if (this.f.getAndSet(true)) {
            return false;
        }
        try {
            this.a.queueInputBuffer(this.b, byteBuffer.position(), byteBuffer.limit(), this.g, this.h ? 4 : 0);
            r72Var.b(null);
            return true;
        } catch (IllegalStateException e) {
            r72Var.d(e);
            return false;
        }
    }
}
