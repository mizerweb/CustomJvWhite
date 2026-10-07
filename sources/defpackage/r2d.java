package defpackage;

import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r2d {
    public static final x4a u = new x4a(new Object());
    public final ush a;
    public final x4a b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final iyh h;
    public final vyh i;
    public final List j;
    public final x4a k;
    public final boolean l;
    public final int m;
    public final int n;
    public final s2d o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public r2d(ush ushVar, x4a x4aVar, long j, long j2, int i, ExoPlaybackException exoPlaybackException, boolean z, iyh iyhVar, vyh vyhVar, List list, x4a x4aVar2, boolean z2, int i2, int i3, s2d s2dVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = ushVar;
        this.b = x4aVar;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = exoPlaybackException;
        this.g = z;
        this.h = iyhVar;
        this.i = vyhVar;
        this.j = list;
        this.k = x4aVar2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = s2dVar;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static r2d k(vyh vyhVar) {
        qsh qshVar = ush.a;
        iyh iyhVar = iyh.d;
        ghe gheVar = ghe.e;
        s2d s2dVar = s2d.d;
        x4a x4aVar = u;
        return new r2d(qshVar, x4aVar, -9223372036854775807L, 0L, 1, null, false, iyhVar, vyhVar, gheVar, x4aVar, false, 1, 0, s2dVar, 0L, 0L, 0L, 0L, false);
    }

    public final r2d a() {
        return new r2d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final r2d b(boolean z) {
        return new r2d(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final r2d c(x4a x4aVar) {
        return new r2d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, x4aVar, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final r2d d(x4a x4aVar, long j, long j2, long j3, long j4, iyh iyhVar, vyh vyhVar, List list) {
        return new r2d(this.a, x4aVar, j2, j3, this.e, this.f, this.g, iyhVar, vyhVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final r2d e(int i, int i2, boolean z) {
        return new r2d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final r2d f(ExoPlaybackException exoPlaybackException) {
        return new r2d(this.a, this.b, this.c, this.d, this.e, exoPlaybackException, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final r2d g(s2d s2dVar) {
        return new r2d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, s2dVar, this.q, this.r, this.s, this.t, this.p);
    }

    public final r2d h(int i) {
        return new r2d(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final r2d i(boolean z) {
        return new r2d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final r2d j(ush ushVar) {
        return new r2d(ushVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long l() {
        long j;
        long j2;
        if (!m()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return vqi.X(vqi.p0(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.a)));
    }

    public final boolean m() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
