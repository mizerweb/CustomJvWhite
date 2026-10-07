package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g9a implements m9a {
    public final int a;
    public final long b;

    public g9a(int i, long j) {
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9a)) {
            return false;
        }
        g9a g9aVar = (g9a) obj;
        return this.a == g9aVar.a && this.b == g9aVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sbX = zo5.x(this.a, this.b, "OnContextActionClicked(actionId=", ", memberId=");
        sbX.append(")");
        return sbX.toString();
    }
}
