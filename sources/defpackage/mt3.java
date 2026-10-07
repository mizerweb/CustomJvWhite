package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* JADX INFO: loaded from: classes2.dex */
public final class mt3 extends na7 {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public mt3(ush ushVar, long j, long j2, boolean z) throws ClippingMediaSource$IllegalClippingException {
        super(ushVar);
        if (j2 != Long.MIN_VALUE && j2 < j) {
            throw new ClippingMediaSource$IllegalClippingException(2, j, j2);
        }
        boolean z2 = false;
        if (ushVar.h() != 1) {
            throw new ClippingMediaSource$IllegalClippingException(0);
        }
        tsh tshVarM = ushVar.m(0, new tsh(), 0L);
        long jMax = Math.max(0L, j);
        if (!z && !tshVarM.j && jMax != 0 && !tshVarM.g) {
            throw new ClippingMediaSource$IllegalClippingException(1);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? tshVarM.l : Math.max(0L, j2);
        long j3 = tshVarM.l;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                jMax = jMax2;
            }
        }
        this.f = jMax;
        this.g = jMax2;
        this.h = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
        if (tshVarM.h && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z2 = true;
        }
        this.i = z2;
    }

    @Override // defpackage.na7, defpackage.ush
    public final rsh f(int i, rsh rshVar, boolean z) {
        this.e.f(0, rshVar, z);
        long j = rshVar.e - this.f;
        long j2 = this.h;
        rshVar.i(rshVar.a, rshVar.b, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, fa.f, false);
        return rshVar;
    }

    @Override // defpackage.na7, defpackage.ush
    public final tsh m(int i, tsh tshVar, long j) {
        this.e.m(0, tshVar, 0L);
        long j2 = tshVar.o;
        long j3 = this.f;
        tshVar.o = j2 + j3;
        tshVar.l = this.h;
        tshVar.h = this.i;
        long j4 = tshVar.k;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            tshVar.k = jMax;
            long j5 = this.g;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            tshVar.k = jMax - j3;
        }
        long jP0 = vqi.p0(j3);
        long j6 = tshVar.d;
        if (j6 != -9223372036854775807L) {
            tshVar.d = j6 + jP0;
        }
        long j7 = tshVar.e;
        if (j7 != -9223372036854775807L) {
            tshVar.e = j7 + jP0;
        }
        return tshVar;
    }
}
