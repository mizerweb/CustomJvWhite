package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dz0 implements ez0 {
    public final long a;

    public dz0(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dz0) && this.a == ((dz0) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "Error(requestId=", ")");
    }
}
