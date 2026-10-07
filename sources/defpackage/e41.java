package defpackage;

import androidx.camera.video.internal.audio.AudioStream$AudioStreamException;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class e41 implements yb0 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final LinkedBlockingQueue c = new LinkedBlockingQueue();
    public final eif d;
    public final Object e;
    public d41 f;
    public final ac0 g;
    public final int h;
    public final int i;
    public final int j;
    public final AtomicBoolean k;
    public int l;

    public e41(ac0 ac0Var, rg0 rg0Var) {
        ww0 ww0Var;
        if (ww0.c != null) {
            ww0Var = ww0.c;
        } else {
            synchronized (ww0.class) {
                try {
                    if (ww0.c == null) {
                        ww0.c = new ww0(3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ww0Var = ww0.c;
        }
        this.d = new eif(ww0Var);
        this.e = new Object();
        this.f = null;
        this.k = new AtomicBoolean(false);
        this.g = ac0Var;
        int iA = rg0Var.a();
        this.h = iA;
        int i = rg0Var.b;
        this.i = i;
        qyj.h("mBytesPerFrame must be greater than 0.", ((long) iA) > 0);
        qyj.h("mSampleRate must be greater than 0.", ((long) i) > 0);
        this.j = 500;
        this.l = iA * 1024;
    }

    public final void a() {
        qyj.l("AudioStream has been released.", !this.b.get());
    }

    public final void b() {
        AtomicBoolean atomicBoolean = this.k;
        if (atomicBoolean.get()) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.l);
            d41 d41Var = new d41(byteBufferAllocateDirect, this.g.read(byteBufferAllocateDirect), this.h, this.i);
            LinkedBlockingQueue linkedBlockingQueue = this.c;
            if (!linkedBlockingQueue.offer(d41Var)) {
                tvj.g("BufferedAudioStream", "Failed to offer audio data to queue.");
            }
            while (linkedBlockingQueue.size() > this.j) {
                linkedBlockingQueue.poll();
                tvj.g("BufferedAudioStream", "Drop audio data due to full of queue.");
            }
            if (atomicBoolean.get()) {
                this.d.execute(new c41(this, 2));
            }
        }
    }

    public final void c() {
        a();
        AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        FutureTask futureTask = new FutureTask(new c41(this, 1), null);
        this.d.execute(futureTask);
        try {
            futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            atomicBoolean.set(false);
            throw new AudioStream$AudioStreamException(e);
        }
    }

    @Override // defpackage.yb0
    public final tg0 read(ByteBuffer byteBuffer) {
        d41 d41Var;
        int iRemaining;
        a();
        qyj.l("AudioStream has not been started.", this.a.get());
        this.d.execute(new ai(this, byteBuffer.remaining(), 2));
        synchronized (this.e) {
            d41Var = this.f;
            this.f = null;
        }
        if (d41Var == null) {
            while (this.a.get() && !this.b.get()) {
                try {
                    d41Var = (d41) this.c.poll(100L, TimeUnit.MILLISECONDS);
                    if (d41Var != null) {
                        break;
                    }
                } catch (InterruptedException e) {
                    tvj.i("BufferedAudioStream", "Interruption while waiting for audio data", e);
                    return new tg0(0, 0L);
                }
            }
        }
        if (d41Var == null) {
            return new tg0(0, 0L);
        }
        long j = d41Var.d;
        ByteBuffer byteBuffer2 = d41Var.c;
        int iPosition = byteBuffer2.position();
        int iPosition2 = byteBuffer.position();
        if (byteBuffer2.remaining() > byteBuffer.remaining()) {
            iRemaining = byteBuffer.remaining();
            d41Var.d += wwk.a(d41Var.b, wwk.c(d41Var.a, iRemaining));
            ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
            byteBufferDuplicate.position(iPosition).limit(iPosition + iRemaining);
            byteBuffer.put(byteBufferDuplicate).limit(iPosition2 + iRemaining).position(iPosition2);
        } else {
            iRemaining = byteBuffer2.remaining();
            byteBuffer.put(byteBuffer2).limit(iPosition2 + iRemaining).position(iPosition2);
        }
        byteBuffer2.position(iPosition + iRemaining);
        tg0 tg0Var = new tg0(iRemaining, j);
        if (d41Var.c.remaining() <= 0) {
            return tg0Var;
        }
        synchronized (this.e) {
            this.f = d41Var;
        }
        return tg0Var;
    }
}
