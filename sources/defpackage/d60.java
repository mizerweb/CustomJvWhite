package defpackage;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class d60 implements yb0 {
    public int a = 1;
    public int b = 1;
    public long c;
    public Serializable d;
    public Serializable e;
    public Object f;

    public e60 a() {
        if (((List) this.f) == null) {
            this.f = Collections.EMPTY_LIST;
        }
        return new e60(this);
    }

    public void b() {
        qyj.l("AudioStream has been released.", !((AtomicBoolean) this.e).get());
    }

    public void c(int i) {
        this.a = i;
    }

    public void d(List list) {
        this.f = list;
    }

    public void e(String str) {
        this.d = str;
    }

    public void f(long j) {
        this.c = j;
    }

    public void g(int i) {
        this.b = i;
    }

    public void h(String str) {
        this.e = str;
    }

    @Override // defpackage.yb0
    public tg0 read(ByteBuffer byteBuffer) {
        b();
        qyj.l("AudioStream has not been started.", ((AtomicBoolean) this.d).get());
        long jRemaining = byteBuffer.remaining();
        int i = this.a;
        long jC = wwk.c(i, jRemaining);
        long j = i;
        qyj.h("bytesPerFrame must be greater than 0.", j > 0);
        int i2 = (int) (j * jC);
        if (i2 <= 0) {
            return new tg0(0, this.c);
        }
        long jA = this.c + wwk.a(this.b, jC);
        long jNanoTime = jA - System.nanoTime();
        if (jNanoTime > 0) {
            try {
                Thread.sleep(jNanoTime / 1000000);
            } catch (InterruptedException e) {
                tvj.i("SilentAudioStream", "Ignore interruption", e);
            }
        }
        qyj.l(null, i2 <= byteBuffer.remaining());
        byte[] bArr = (byte[]) this.f;
        if (bArr == null || bArr.length < i2) {
            this.f = new byte[i2];
        }
        int iPosition = byteBuffer.position();
        byteBuffer.put((byte[]) this.f, 0, i2).limit(iPosition + i2).position(iPosition);
        tg0 tg0Var = new tg0(i2, this.c);
        this.c = jA;
        return tg0Var;
    }
}
