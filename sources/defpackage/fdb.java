package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fdb {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public fdb(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdb)) {
            return false;
        }
        fdb fdbVar = (fdb) obj;
        return this.a == fdbVar.a && this.b == fdbVar.b && this.c == fdbVar.c && this.d == fdbVar.d && this.e == fdbVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + nbh.n(nbh.n(nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkState(isConnected=");
        sb.append(this.a);
        sb.append(", isValidated=");
        sb.append(this.b);
        sb.append(", isMetered=");
        sb.append(this.c);
        sb.append(", isNotRoaming=");
        sb.append(this.d);
        sb.append(", isBlocked=");
        return c0a.p(sb, this.e, ')');
    }
}
