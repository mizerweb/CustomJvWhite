package defpackage;

/* JADX INFO: loaded from: classes.dex */
@mif
public final class vm0 extends xm0 {
    public static final um0 Companion = new um0();
    public final long b;
    public final long c;
    public final long d;
    public final int e;

    public vm0(int i, int i2, long j, long j2, long j3) {
        if (7 != (i & 7)) {
            shl.b(i, 7, tm0.a.d());
            throw null;
        }
        this.b = j;
        this.c = j2;
        this.d = j3;
        if ((i & 8) == 0) {
            this.e = 0;
        } else {
            this.e = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vm0)) {
            return false;
        }
        vm0 vm0Var = (vm0) obj;
        return this.b == vm0Var.b && this.c == vm0Var.c && this.d == vm0Var.d && this.e == vm0Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + qt4.g(qt4.g(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.b, "Enabled(checkBackgroundIntervalMinutes=", ", suggestionIntervalMinutes=");
        sbS.append(this.c);
        qt4.z(this.d, ", checkForegroundIntervalSec=", ", suggestionType=", sbS);
        return zo5.t(sbS, this.e, ")");
    }
}
