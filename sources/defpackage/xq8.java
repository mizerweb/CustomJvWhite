package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xq8 implements cr8 {
    public final long a;

    public xq8(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xq8) && this.a == ((xq8) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "OpenProfile(userId=", ")");
    }
}
