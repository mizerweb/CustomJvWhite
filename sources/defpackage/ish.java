package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ish implements v44 {
    public final long a;

    public /* synthetic */ ish(long j) {
        this.a = j;
    }

    public static long a(long j) {
        return (1 | (j - 1)) == BuildConfig.MAX_TIME_TO_UPLOAD ? ew5.v(wk8.v(j)) : wk8.B(g1b.c(), j, lw5.NANOSECONDS);
    }

    @Override // defpackage.v44
    public final long c(v44 v44Var) {
        boolean z = v44Var instanceof ish;
        long j = this.a;
        if (z) {
            long j2 = ((ish) v44Var).a;
            int i = g1b.b;
            return wk8.C(j, j2, lw5.NANOSECONDS);
        }
        throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j + ')')) + " and " + v44Var);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ int compareTo(Object obj) {
        return pnl.c(this, (v44) obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ish) {
            return this.a == ((ish) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    @Override // defpackage.v44
    public final long j() {
        return a(this.a);
    }

    @Override // defpackage.v44
    public final v44 l(long j) {
        int i = g1b.b;
        return new ish(wk8.A(this.a, j, lw5.NANOSECONDS));
    }

    public final String toString() {
        return "ValueTimeMark(reading=" + this.a + ')';
    }
}
