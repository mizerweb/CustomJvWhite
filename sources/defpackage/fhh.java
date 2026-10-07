package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fhh {
    public final String a;
    public final long b;
    public final long c;

    public fhh(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final long a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fhh)) {
            return false;
        }
        fhh fhhVar = (fhh) obj;
        return cqk.d(this.a, fhhVar.a) && this.b == fhhVar.b && this.c == fhhVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qt4.g(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return zo5.k(this.c, ", bytes=", ")", nbh.B(this.b, "TableStat(name=", this.a, ", rows="));
    }
}
