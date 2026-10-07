package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class y29 extends e39 {
    public final rbb a;
    public final String b;

    public y29(rbb rbbVar, String str) {
        this.a = rbbVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y29)) {
            return false;
        }
        y29 y29Var = (y29) obj;
        return this.a.equals(y29Var.a) && cqk.d(this.b, y29Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Navigation(navEvent=" + this.a + ", externalCallbackParam=" + this.b + ")";
    }
}
