package defpackage;

import java.nio.ByteBuffer;
import org.webrtc.EncodedImage;

/* JADX INFO: loaded from: classes3.dex */
public final class s3k extends Thread {
    public final Object a = new Object();
    public final Object b = new Object();
    public f25 c;
    public volatile boolean d;
    public ByteBuffer e;
    public EncodedImage f;
    public final /* synthetic */ wc7 g;

    public s3k(wc7 wc7Var, f25 f25Var) {
        this.g = wc7Var;
        this.c = f25Var;
        setName("SSFrameSender");
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long jBufferedAmount;
        boolean z;
        boolean z2;
        loop0: while (true) {
            if (!this.d || this.f != null) {
                synchronized (this.b) {
                    f25 f25Var = this.c;
                    jBufferedAmount = f25Var != null ? f25Var.a.bufferedAmount() : 0L;
                }
                while (true) {
                    if ((this.d && this.f == null) || (jBufferedAmount < 8000000 && (this.f != null || !this.g.c.isEmpty()))) {
                        break;
                    }
                    synchronized (this.a) {
                        try {
                            this.a.wait(50L);
                        } catch (InterruptedException unused) {
                        }
                    }
                    synchronized (this.b) {
                        try {
                            f25 f25Var2 = this.c;
                            if (f25Var2 != null) {
                                jBufferedAmount = f25Var2.a.bufferedAmount();
                            } else {
                                this.d = true;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    break loop0;
                }
                if (this.d && this.f == null) {
                    break;
                }
                boolean z3 = false;
                if (this.f == null) {
                    EncodedImage encodedImage = (EncodedImage) this.g.c.poll();
                    this.f = encodedImage;
                    if (encodedImage == null) {
                        continue;
                    } else {
                        this.e = encodedImage.buffer;
                        z = true;
                    }
                } else {
                    z = false;
                }
                if (8000000 - jBufferedAmount < 4000) {
                    continue;
                } else {
                    long jMin = Math.min(7999989 - jBufferedAmount, 8000L);
                    if (jMin >= this.e.remaining()) {
                        jMin = this.e.remaining();
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ByteBuffer byteBufferSlice = this.e.slice();
                    byteBufferSlice.limit((int) jMin);
                    ByteBuffer byteBuffer = this.e;
                    byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
                    g25 g25Var = new g25(this.g.e.incrementAndGet(), System.currentTimeMillis(), z, z2, this.f.frameType == EncodedImage.FrameType.VideoFrameKey, false, byteBufferSlice);
                    synchronized (this.b) {
                        try {
                            f25 f25Var3 = this.c;
                            if (f25Var3 != null) {
                                f25Var3.d(g25Var.a(), byteBufferSlice);
                            } else {
                                z3 = true;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    this.g.d.addAndGet((int) (-jMin));
                    if (z3) {
                        this.d = true;
                        break;
                    } else if (z2) {
                        this.g.f.a();
                        EncodedImage encodedImage2 = this.f;
                        if (encodedImage2 != null) {
                            encodedImage2.release();
                        }
                        this.f = null;
                        this.e = null;
                    }
                }
            } else {
                break;
            }
        }
        synchronized (this.b) {
            try {
                if (this.c != null) {
                    this.c.d(new g25(this.g.e.incrementAndGet(), System.currentTimeMillis(), true, true, false, true, null).a());
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        ByteBuffer byteBuffer2 = this.e;
        if (byteBuffer2 != null) {
            this.g.d.addAndGet(-byteBuffer2.remaining());
        }
        EncodedImage encodedImage3 = this.f;
        if (encodedImage3 != null) {
            encodedImage3.release();
        }
        this.f = null;
        this.e = null;
    }
}
