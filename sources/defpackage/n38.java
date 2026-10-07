package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n38 {
    public final String a;
    public final int b;
    public final String c;

    public n38(String str, int i, String str2) {
        str2.getClass();
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n38)) {
            return false;
        }
        n38 n38Var = (n38) obj;
        return this.a.equals(n38Var.a) && this.b == n38Var.b && cqk.d(this.c, n38Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + spc.a(this.b, this.a.hashCode() * 31);
    }

    public final String toString() {
        return zo5.w(c0a.r(this.b, "IceCandidateAddFailedEvent(remoteIceCandidate=", this.a, ", code=", ", description="), this.c, ")");
    }
}
