package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ybf {
    public static final ybf c;
    public static final ybf d;
    public final long a;
    public final long b;

    static {
        ybf ybfVar = new ybf(0L, 0L);
        new ybf(BuildConfig.MAX_TIME_TO_UPLOAD, BuildConfig.MAX_TIME_TO_UPLOAD);
        c = new ybf(BuildConfig.MAX_TIME_TO_UPLOAD, 0L);
        new ybf(0L, BuildConfig.MAX_TIME_TO_UPLOAD);
        d = ybfVar;
    }

    public ybf(long j, long j2) {
        lvb.R(j >= 0);
        lvb.R(j2 >= 0);
        this.a = j;
        this.b = j2;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0065 A[RETURN] */
    public final long a(long j, long j2, long j3) {
        long j4 = this.a;
        long j5 = this.b;
        if (j4 == 0 && j5 == 0) {
            return j;
        }
        String str = vqi.a;
        long jI = yok.i(j, j4);
        if ((jI == Long.MIN_VALUE && j - j4 != Long.MIN_VALUE) || (jI == BuildConfig.MAX_TIME_TO_UPLOAD && j - j4 != BuildConfig.MAX_TIME_TO_UPLOAD)) {
            jI = Long.MIN_VALUE;
        }
        long jA = vqi.a(j, j5);
        boolean z = false;
        boolean z2 = jI <= j2 && j2 <= jA;
        if (jI <= j3 && j3 <= jA) {
            z = true;
        }
        if (z2 && z) {
            if (Math.abs(j2 - j) <= Math.abs(j3 - j)) {
                return j2;
            }
            return j3;
        }
        if (!z2) {
            if (z) {
                return j3;
            }
            return jI;
        }
        return j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ybf.class == obj.getClass()) {
            ybf ybfVar = (ybf) obj;
            if (this.a == ybfVar.a && this.b == ybfVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }
}
