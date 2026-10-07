package defpackage;

import androidx.media3.exoplayer.ExoPlaybackException;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class ks0 implements e4d {
    public final int b;
    public mje d;
    public int e;
    public z3d f;
    public qt3 g;
    public int h;
    public xye i;
    public b87[] j;
    public long k;
    public long l;
    public boolean n;
    public boolean o;
    public x4a q;
    public ve5 r;
    public final Object a = new Object();
    public final v2a c = new v2a(28, false);
    public long m = Long.MIN_VALUE;
    public ush p = ush.a;

    public ks0(int i) {
        this.b = i;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | np0.m | i4;
    }

    public static boolean k(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            return z && i2 == 3;
        }
        return true;
    }

    public final void B(long j, boolean z, boolean z2) {
        this.n = false;
        this.l = j;
        this.m = j;
        if (!z2) {
            xye xyeVar = this.i;
            xyeVar.getClass();
            z2 = xyeVar.o(j - this.k) != 0;
        }
        p(j, z, z2);
    }

    public void C(float f, float f2) {
    }

    public abstract int D(b87 b87Var);

    public int E() {
        return 0;
    }

    public boolean F(long j) {
        return false;
    }

    @Override // defpackage.e4d
    public void a(int i, Object obj) {
    }

    public final ExoPlaybackException d(Exception exc, b87 b87Var, boolean z, int i) {
        int iD;
        if (b87Var == null || this.o) {
            iD = 4;
        } else {
            this.o = true;
            try {
                iD = D(b87Var) & 7;
                this.o = false;
            } catch (ExoPlaybackException unused) {
                this.o = false;
                iD = 4;
            } catch (Throwable th) {
                this.o = false;
                throw th;
            }
        }
        return new ExoPlaybackException(1, exc, i, h(), this.e, b87Var, b87Var == null ? 4 : iD, this.q, z);
    }

    public void e() {
    }

    public long f(long j, long j2) {
        if (this.h == 1) {
            return (l() || j()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public it9 g() {
        return null;
    }

    public abstract String h();

    public final boolean i() {
        return this.m == Long.MIN_VALUE;
    }

    public abstract boolean j();

    public abstract boolean l();

    public void m() {
    }

    public void n(boolean z, boolean z2) {
    }

    public void p(long j, boolean z, boolean z2) {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u(b87[] b87VarArr, long j, long j2, x4a x4aVar) {
    }

    public void v() {
    }

    public final int w(v2a v2aVar, u55 u55Var, int i) {
        xye xyeVar = this.i;
        xyeVar.getClass();
        int iF = xyeVar.f(v2aVar, u55Var, i);
        if (iF == -4) {
            if (u55Var.d(4)) {
                this.m = Long.MIN_VALUE;
                return this.n ? -4 : -3;
            }
            long j = u55Var.f + this.k;
            u55Var.f = j;
            this.m = Math.max(this.m, j);
            return iF;
        }
        if (iF == -5) {
            b87 b87Var = (b87) v2aVar.c;
            b87Var.getClass();
            long j2 = b87Var.s;
            if (j2 != BuildConfig.MAX_TIME_TO_UPLOAD) {
                a87 a87VarA = b87Var.a();
                a87VarA.u(j2 + this.k);
                v2aVar.c = a87VarA.a();
            }
        }
        return iF;
    }

    public abstract void y(long j, long j2);

    public final void z(b87[] b87VarArr, xye xyeVar, long j, long j2, x4a x4aVar) {
        lvb.b0(!this.n);
        this.i = xyeVar;
        this.q = x4aVar;
        if (this.m == Long.MIN_VALUE) {
            this.m = j;
        }
        this.j = b87VarArr;
        this.k = j2;
        u(b87VarArr, j, j2, x4aVar);
    }
}
