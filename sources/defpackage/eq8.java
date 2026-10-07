package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eq8 {
    public final String a;
    public final boolean b;
    public final String c;

    public eq8(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq8)) {
            return false;
        }
        eq8 eq8Var = (eq8) obj;
        return cqk.d(this.a, eq8Var.a) && this.b == eq8Var.b && cqk.d(this.c, eq8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nbh.n(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return zo5.w(zo5.A("Params(joinLink=", this.a, ", isVideo=", ", internalParams=", this.b), this.c, ")");
    }
}
