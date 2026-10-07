package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class rp9 implements Comparable {
    public final String a;
    public final long b;
    public final long c;
    public final String d;
    public final long e;

    public rp9(String str, long j, long j2, String str2, long j3) {
        this.a = str;
        this.b = j;
        this.c = j2;
        this.d = str2;
        this.e = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        rp9 rp9Var = (rp9) obj;
        int iJ = cqk.j(this.b + this.c, rp9Var.b + rp9Var.c);
        Integer numValueOf = Integer.valueOf(iJ);
        if (iJ == 0) {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : this.a.compareTo(rp9Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp9)) {
            return false;
        }
        rp9 rp9Var = (rp9) obj;
        return this.a.equals(rp9Var.a) && this.b == rp9Var.b && this.c == rp9Var.c && this.d.equals(rp9Var.d) && this.e == rp9Var.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + zo5.d((TimeUnit.NANOSECONDS.hashCode() + qt4.g(qt4.g(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sbB = nbh.B(this.b, "Measurement(taskName=", this.a, ", dependencyDuration=");
        qt4.z(this.c, ", executionDuration=", ", unit=", sbB);
        sbB.append(TimeUnit.NANOSECONDS);
        sbB.append(", threadName=");
        sbB.append(this.d);
        sbB.append(", startTime=");
        return c0a.m(this.e, ")", sbB);
    }
}
