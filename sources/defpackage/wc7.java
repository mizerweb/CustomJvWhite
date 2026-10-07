package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.webrtc.EncodedImage;

/* JADX INFO: loaded from: classes3.dex */
public final class wc7 implements bwe {
    public volatile boolean a;
    public volatile f25 b;
    public final ConcurrentLinkedQueue c;
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicInteger e;
    public final nsh f;
    public volatile s3k g;
    public volatile boolean h;

    public wc7() {
        new AtomicLong();
        this.e = new AtomicInteger();
        this.c = new ConcurrentLinkedQueue();
        this.f = new nsh();
    }

    public static void b(s3k s3kVar) {
        if (s3kVar != null) {
            synchronized (s3kVar.a) {
                s3kVar.a.notify();
            }
        }
    }

    @Override // defpackage.bwe
    public final void a(f25 f25Var, byte[] bArr, int i) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.get();
        byte b = byteBufferWrap.get();
        byteBufferWrap.getShort();
        if (b == 1) {
            this.h = true;
        }
    }

    public final synchronized void c(boolean z) {
        try {
            if (this.a) {
                this.a = false;
                s3k s3kVar = this.g;
                if (s3kVar != null) {
                    s3kVar.d = true;
                    if (z) {
                        synchronized (s3kVar.b) {
                            s3kVar.c = null;
                        }
                    }
                }
                b(s3kVar);
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    EncodedImage encodedImage = (EncodedImage) it.next();
                    this.d.addAndGet(-encodedImage.buffer.remaining());
                    encodedImage.release();
                    it.remove();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(f25 f25Var) {
        try {
            if (this.b != null) {
                this.b.e.remove(this);
                this.b.c(this);
            }
            c(true);
            this.b = f25Var;
            if (this.b != null) {
                this.b.e.add(this);
                this.b.a(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e() {
        c(true);
        this.a = true;
        s3k s3kVar = new s3k(this, this.b);
        this.g = s3kVar;
        s3kVar.start();
    }
}
