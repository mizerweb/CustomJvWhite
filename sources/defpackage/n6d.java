package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n6d {
    public final vg4 a;
    public final long b;

    public n6d(vg4 vg4Var, long j) {
        this.a = vg4Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n6d) {
            n6d n6dVar = (n6d) obj;
            if (this.a == n6dVar.a && this.b == n6dVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PollAnswerVoterItem(contact=" + this.a + ", voteTimestamp=" + this.b + ")";
    }
}
