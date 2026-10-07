package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qq3 {
    public final wrc a;
    public final rq3 b;

    public qq3(wrc wrcVar, rq3 rq3Var) {
        this.a = wrcVar;
        this.b = rq3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq3)) {
            return false;
        }
        qq3 qq3Var = (qq3) obj;
        return this.a.equals(qq3Var.a) && cqk.d(this.b, qq3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "EntryWithLane(entry=" + this.a + ", lane=" + this.b + ")";
    }
}
