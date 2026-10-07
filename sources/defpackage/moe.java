package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class moe {
    public final long a;

    public moe(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof moe) && this.a == ((moe) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "RestrictionsInfo(expiration=", ")");
    }
}
