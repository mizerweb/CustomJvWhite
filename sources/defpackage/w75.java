package defpackage;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class w75 {
    public int b;
    public long h;
    public long j;
    public final SparseArray a = new SparseArray();
    public cb0 c = cb0.e;
    public int d = -1;
    public u75[] e = new u75[0];
    public long f = -9223372036854775807L;
    public long g = -1;
    public long i = BuildConfig.MAX_TIME_TO_UPLOAD;

    public final int a(cb0 cb0Var, long j) throws AudioProcessor$UnhandledAudioFormatException {
        c();
        c();
        cb0 cb0Var2 = this.c;
        if (cb0Var.a != cb0Var2.a || !twk.a(cb0Var) || !twk.a(cb0Var2)) {
            throw new AudioProcessor$UnhandledAudioFormatException("Can not add source. MixerFormat=" + this.c, cb0Var);
        }
        long jR = vqi.r(cb0Var.a, j - this.f);
        int i = this.b;
        this.b = i + 1;
        this.a.append(i, new v75(this, cb0Var, xr2.a(cb0Var.b, this.c.b), jR));
        LinkedHashMap linkedHashMap = g55.a;
        synchronized (g55.class) {
        }
        return i;
    }

    public final u75 b(long j) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(this.d * this.c.d).order(ByteOrder.nativeOrder());
        byteBufferOrder.mark();
        long j2 = ((long) this.d) + j;
        u75 u75Var = new u75();
        u75Var.c = byteBufferOrder;
        u75Var.a = j;
        u75Var.b = j2;
        return u75Var;
    }

    public final void c() {
        lvb.Z("Audio mixer is not configured.", !this.c.equals(cb0.e));
    }

    public final void d(cb0 cb0Var) throws AudioProcessor$UnhandledAudioFormatException {
        lvb.Z("Audio mixer already configured.", this.c.equals(cb0.e));
        if (!twk.a(cb0Var)) {
            throw new AudioProcessor$UnhandledAudioFormatException("Can not mix to this AudioFormat.", cb0Var);
        }
        this.c = cb0Var;
        this.d = (500 * cb0Var.a) / 1000;
        this.f = 0L;
        LinkedHashMap linkedHashMap = g55.a;
        synchronized (g55.class) {
        }
        this.e = new u75[]{b(0L), b(this.d)};
        this.g = Math.min(this.i, this.h + ((long) this.d));
    }

    public final boolean e() {
        c();
        long j = this.h;
        if (j < this.i) {
            return j >= this.j && this.a.size() == 0;
        }
        return true;
    }

    public final void f(int i, ByteBuffer byteBuffer) {
        c();
        if (byteBuffer.hasRemaining()) {
            SparseArray sparseArray = this.a;
            lvb.Z("Source not found.", vqi.l(sparseArray, i));
            v75 v75Var = (v75) sparseArray.get(i);
            long j = v75Var.a;
            xr2 xr2Var = v75Var.c;
            if (j >= this.g) {
                return;
            }
            long jMin = Math.min(v75Var.a + ((long) (byteBuffer.remaining() / v75Var.b.d)), this.g);
            if (xr2Var.d) {
                v75Var.a(jMin, byteBuffer);
                return;
            }
            long j2 = v75Var.a;
            long j3 = this.h;
            if (j2 < j3) {
                v75Var.a(Math.min(jMin, j3), byteBuffer);
                if (v75Var.a == jMin) {
                    return;
                }
            }
            for (u75 u75Var : this.e) {
                long j4 = v75Var.a;
                long j5 = u75Var.b;
                ByteBuffer byteBuffer2 = (ByteBuffer) u75Var.c;
                if (j4 < j5) {
                    byteBuffer2.position(byteBuffer2.position() + (((int) (j4 - u75Var.a)) * this.c.d));
                    long jMin2 = Math.min(jMin, u75Var.b);
                    cb0 cb0Var = this.c;
                    lvb.R(jMin2 >= v75Var.a);
                    int i2 = (int) (jMin2 - v75Var.a);
                    cb0 cb0Var2 = v75Var.b;
                    v75Var.d.getClass();
                    twk.d(byteBuffer, cb0Var2, byteBuffer2, cb0Var, xr2Var, i2, true);
                    v75Var.a = jMin2;
                    byteBuffer2.reset();
                    if (v75Var.a == jMin) {
                        return;
                    }
                }
            }
        }
    }
}
