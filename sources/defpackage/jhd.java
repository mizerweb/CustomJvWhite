package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jhd {
    public static final jhd e = new jhd(null, null, ki6.a, be1.n);
    public final String a;
    public final phl b;
    public final pi6 c;
    public final be1 d;

    public jhd(String str, phl phlVar, pi6 pi6Var, be1 be1Var) {
        this.a = str;
        this.b = phlVar;
        this.c = pi6Var;
        this.d = be1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhd)) {
            return false;
        }
        jhd jhdVar = (jhd) obj;
        return cqk.d(this.a, jhdVar.a) && cqk.d(this.b, jhdVar.b) && cqk.d(this.c, jhdVar.c) && cqk.d(this.d, jhdVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        phl phlVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (phlVar != null ? phlVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "PreviousCallState(callId=" + this.a + ", recallTarget=" + this.b + ", state=" + this.c + ", chatInfo=" + this.d + ")";
    }
}
