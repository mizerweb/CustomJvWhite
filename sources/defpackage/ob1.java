package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ob1 {
    public final yt1 a;
    public final Long b;

    public ob1(yt1 yt1Var, Long l) {
        this.a = yt1Var;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob1)) {
            return false;
        }
        ob1 ob1Var = (ob1) obj;
        return this.a.equals(ob1Var.a) && cqk.d(this.b, ob1Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "CallAsrInfo(initiatorId=" + this.a + ", movieId=" + this.b + ")";
    }
}
