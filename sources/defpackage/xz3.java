package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xz3 implements c04 {
    public final long a;

    public xz3(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xz3) && this.a == ((xz3) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "OpenProfile(userId=", ")");
    }
}
