package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mpf implements ppf {
    public final long a;
    public final yhh b;

    public mpf(long j, yhh yhhVar) {
        this.a = j;
        this.b = yhhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpf)) {
            return false;
        }
        mpf mpfVar = (mpf) obj;
        return this.a == mpfVar.a && cqk.d(this.b, mpfVar.b);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        yhh yhhVar = this.b;
        return iHashCode + (yhhVar == null ? 0 : yhhVar.hashCode());
    }

    public final String toString() {
        return "Error(requestId=" + this.a + ", error=" + this.b + ")";
    }
}
