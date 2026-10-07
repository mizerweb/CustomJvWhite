package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a4k {
    public final String a;
    public final boolean b;

    public a4k(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4k)) {
            return false;
        }
        a4k a4kVar = (a4k) obj;
        return cqk.d(this.a, a4kVar.a) && this.b == a4kVar.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MasterHostRequest(masterPackageName=");
        sb.append(this.a);
        sb.append(", isFromArbiter=");
        return c0a.p(sb, this.b, ')');
    }
}
