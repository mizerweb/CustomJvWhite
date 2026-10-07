package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif(with = xqc.class)
public final class yqc {
    public static final xqc b = new xqc();
    public static final yqc c = new yqc(q1f.b);
    public static final xt7 d = new xt7(n5h.b, ij8.b);
    public final p1f a;

    public yqc(p1f p1fVar) {
        this.a = p1fVar;
    }

    public final int a(String str) {
        int iNumberOfTrailingZeros;
        wqc.Companion.getClass();
        int i = 0;
        Object wqcVar = new wqc(0);
        p1f p1fVar = this.a;
        p1fVar.getClass();
        int iHashCode = str.hashCode() * (-862048943);
        int i2 = iHashCode ^ (iHashCode << 16);
        int i3 = i2 & 127;
        int i4 = p1fVar.d;
        int i5 = i2 >>> 7;
        loop0: while (true) {
            int i6 = i5 & i4;
            long[] jArr = p1fVar.a;
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (((long) i3) * 72340172838076673L) ^ j;
            for (long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L); j3 != 0; j3 &= j3 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i4;
                if (cqk.d(p1fVar.b[iNumberOfTrailingZeros], str)) {
                    break loop0;
                }
            }
            if ((j & ((~j) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i += 8;
            i5 = i6 + i;
        }
        if (iNumberOfTrailingZeros >= 0) {
            wqcVar = p1fVar.c[iNumberOfTrailingZeros];
        }
        return ((wqc) wqcVar).a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yqc) && cqk.d(this.a, ((yqc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PerfEventsServerConfig(events=" + this.a + ")";
    }
}
