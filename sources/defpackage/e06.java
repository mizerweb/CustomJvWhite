package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e06 extends g06 {
    public final String b;
    public final Long c;

    public e06(String str, Long l) {
        this.b = str;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e06)) {
            return false;
        }
        e06 e06Var = (e06) obj;
        return this.b.equals(e06Var.b) && cqk.d(this.c, e06Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        Long l = this.c;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        return "OpenDrawScreen(uriAsString=" + this.b + ", mediaId=" + this.c + ")";
    }
}
