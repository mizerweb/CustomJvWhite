package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class kt3 implements u0a, t0a {
    public final u0a a;
    public t0a b;
    public jt3[] c = new jt3[0];
    public long d;
    public long e;
    public long f;
    public long g;
    public ClippingMediaSource$IllegalClippingException h;

    public kt3(u0a u0aVar, boolean z, long j, long j2) {
        this.a = u0aVar;
        this.d = z ? j : -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = j;
        this.g = j2;
    }

    @Override // defpackage.t0a
    public final void C(u0a u0aVar) {
        if (this.h != null) {
            return;
        }
        t0a t0aVar = this.b;
        t0aVar.getClass();
        t0aVar.C(this);
    }

    @Override // defpackage.u0a
    public final long a(rg6[] rg6VarArr, boolean[] zArr, xye[] xyeVarArr, boolean[] zArr2, long j) {
        long j2;
        this.c = new jt3[xyeVarArr.length];
        xye[] xyeVarArr2 = new xye[xyeVarArr.length];
        for (int i = 0; i < xyeVarArr.length; i++) {
            jt3[] jt3VarArr = this.c;
            jt3 jt3Var = (jt3) xyeVarArr[i];
            jt3VarArr[i] = jt3Var;
            xyeVarArr2[i] = jt3Var != null ? jt3Var.a : null;
        }
        long jA = this.a.a(rg6VarArr, zArr, xyeVarArr2, zArr2, j);
        long j3 = this.g;
        long jMax = Math.max(jA, j);
        if (j3 != Long.MIN_VALUE) {
            jMax = Math.min(jMax, j3);
        }
        if (b()) {
            if (jA >= j) {
                if (jA != 0) {
                    int length = rg6VarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            rg6 rg6Var = rg6VarArr[i2];
                            if (rg6Var != null) {
                                b87 b87VarS = rg6Var.s();
                                if (!uya.a(b87VarS.n, b87VarS.k)) {
                                }
                            }
                            i2++;
                        }
                    }
                }
                j2 = -9223372036854775807L;
            }
            j2 = jMax;
        } else {
            j2 = -9223372036854775807L;
        }
        this.d = j2;
        for (int i3 = 0; i3 < xyeVarArr.length; i3++) {
            xye xyeVar = xyeVarArr2[i3];
            jt3[] jt3VarArr2 = this.c;
            if (xyeVar == null) {
                jt3VarArr2[i3] = null;
            } else {
                jt3 jt3Var2 = jt3VarArr2[i3];
                if (jt3Var2 == null || jt3Var2.a != xyeVar) {
                    jt3VarArr2[i3] = new jt3(this, xyeVar);
                }
            }
            xyeVarArr[i3] = jt3VarArr2[i3];
        }
        return jMax;
    }

    public final boolean b() {
        return this.d != -9223372036854775807L;
    }

    @Override // defpackage.u0a
    public final long c(long j, ybf ybfVar) {
        long j2 = this.f;
        if (j == j2) {
            return j2;
        }
        long jK = vqi.k(ybfVar.a, 0L, j - j2);
        long j3 = ybfVar.b;
        long j4 = this.g;
        long jK2 = vqi.k(j3, 0L, j4 == Long.MIN_VALUE ? BuildConfig.MAX_TIME_TO_UPLOAD : j4 - j);
        if (jK != ybfVar.a || jK2 != ybfVar.b) {
            ybfVar = new ybf(jK, jK2);
        }
        return this.a.c(j, ybfVar);
    }

    @Override // defpackage.vhf
    public final long e() {
        long jE = this.a.e();
        if (jE != Long.MIN_VALUE) {
            long j = this.g;
            if (j == Long.MIN_VALUE || jE < j) {
                return jE;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.u0a
    public final long g(long j) {
        this.d = -9223372036854775807L;
        for (jt3 jt3Var : this.c) {
            if (jt3Var != null) {
                jt3Var.b = false;
            }
        }
        long jG = this.a.g(j);
        long j2 = this.f;
        long j3 = this.g;
        long jMax = Math.max(jG, j2);
        return j3 != Long.MIN_VALUE ? Math.min(jMax, j3) : jMax;
    }

    @Override // defpackage.vhf
    public final boolean i() {
        return this.a.i();
    }

    @Override // defpackage.u0a
    public final List j(ArrayList arrayList) {
        return this.a.j(arrayList);
    }

    @Override // defpackage.u0a
    public final long k() {
        if (b()) {
            long j = this.d;
            this.d = -9223372036854775807L;
            this.e = j;
            long jK = k();
            return jK != -9223372036854775807L ? jK : j;
        }
        long jK2 = this.a.k();
        if (jK2 != -9223372036854775807L) {
            long j2 = this.f;
            long j3 = this.g;
            long jMax = Math.max(jK2, j2);
            if (j3 != Long.MIN_VALUE) {
                jMax = Math.min(jMax, j3);
            }
            if (jMax != this.e) {
                this.e = jMax;
                return jMax;
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.u0a
    public final void n() throws ClippingMediaSource$IllegalClippingException {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.h;
        if (clippingMediaSource$IllegalClippingException != null) {
            throw clippingMediaSource$IllegalClippingException;
        }
        this.a.n();
    }

    @Override // defpackage.uhf
    public final void q(vhf vhfVar) {
        t0a t0aVar = this.b;
        t0aVar.getClass();
        t0aVar.q(this);
    }

    @Override // defpackage.u0a
    public final void s(t0a t0aVar, long j) {
        this.b = t0aVar;
        this.a.s(this, j);
    }

    @Override // defpackage.u0a
    public final iyh t() {
        return this.a.t();
    }

    @Override // defpackage.vhf
    public final boolean u(fa9 fa9Var) {
        return this.a.u(fa9Var);
    }

    @Override // defpackage.vhf
    public final long v() {
        long jV = this.a.v();
        if (jV != Long.MIN_VALUE) {
            long j = this.g;
            if (j == Long.MIN_VALUE || jV < j) {
                return jV;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.u0a
    public final void w(long j, boolean z) {
        this.a.w(j, z);
    }

    @Override // defpackage.vhf
    public final void y(long j) {
        this.a.y(j);
    }
}
