package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class loe {
    public final long a;

    public loe(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof loe) && this.a == ((loe) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "RestrictionsInfo(expiration=", ")");
    }
}
