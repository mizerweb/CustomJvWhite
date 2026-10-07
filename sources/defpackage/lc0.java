package defpackage;

import android.media.AudioTrack;
import android.os.Build;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class lc0 {
    public boolean A;
    public long B;
    public final c7k a;
    public final qt3 b;
    public final long[] c;
    public final AudioTrack d;
    public final int e;
    public final long f;
    public final boolean g;
    public final dc0 h;
    public float i;
    public long j;
    public long k;
    public long l;
    public Method m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public lc0(c7k c7kVar, qt3 qt3Var, AudioTrack audioTrack, int i, int i2, int i3) {
        this.a = c7kVar;
        this.b = qt3Var;
        this.d = audioTrack;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.c = new long[10];
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.h = new dc0(audioTrack, c7kVar);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean zO = vqi.O(i);
        this.g = zO;
        this.f = zO ? vqi.g0(sampleRate, i3 / i2) : -9223372036854775807L;
        this.q = 0L;
        this.r = 0L;
        this.A = false;
        this.B = 0L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.o = 0L;
        this.n = 0L;
        this.i = 1.0f;
        this.j = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0066  */
    /* JADX WARN: Code duplicated, block: B:27:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    public final long a() {
        long j;
        if (this.u != -9223372036854775807L) {
            return Math.min(this.x, c());
        }
        ((nfh) this.b).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.p >= 5) {
            AudioTrack audioTrack = this.d;
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (Build.VERSION.SDK_INT > 29) {
                    j = this.q;
                    if (j > playbackHeadPosition) {
                        if (this.A) {
                            this.B += j;
                            this.A = false;
                        } else {
                            this.r++;
                        }
                    }
                    this.q = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.q <= 0 || playState != 3) {
                    this.v = -9223372036854775807L;
                    j = this.q;
                    if (j > playbackHeadPosition) {
                        if (this.A) {
                            this.B += j;
                            this.A = false;
                        } else {
                            this.r++;
                        }
                    }
                    this.q = playbackHeadPosition;
                } else if (this.v == -9223372036854775807L) {
                    this.v = jElapsedRealtime;
                }
            }
            this.p = jElapsedRealtime;
        }
        return this.q + this.B + (this.r << 32);
    }

    public final long b(long j) {
        long jF;
        int i = this.t;
        int i2 = this.e;
        if (i == 0) {
            jF = this.u != -9223372036854775807L ? vqi.g0(i2, c()) : vqi.g0(i2, a());
        } else {
            jF = vqi.F(this.i, j + this.k);
        }
        long jMax = Math.max(0L, jF - this.n);
        return this.u != -9223372036854775807L ? Math.min(vqi.g0(i2, this.x), jMax) : jMax;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.w;
        }
        ((nfh) this.b).getClass();
        return this.w + vqi.r(this.e, vqi.F(this.i, vqi.X(SystemClock.elapsedRealtime()) - this.u));
    }

    public final void d(long j) {
        long j2 = this.j;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        long jI = vqi.I(this.i, j - j2);
        ((nfh) this.b).getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() - vqi.p0(jI);
        this.j = -9223372036854775807L;
        ((ic0) this.a.b).i.f(-1, new x50(jCurrentTimeMillis, 1));
    }
}
