package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hd0 {
    public final String a;
    public final Long b;

    public hd0(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd0)) {
            return false;
        }
        hd0 hd0Var = (hd0) obj;
        return this.a.equals(hd0Var.a) && cqk.d(this.b, hd0Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Long l = this.b;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "TokenAttributes(token=" + this.a + ", tokenTtl=" + this.b + ")";
    }
}
