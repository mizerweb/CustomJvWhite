package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dh1 implements lh1 {
    public final long a;

    public dh1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dh1) && this.a == ((dh1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "Error(requestId=", ")");
    }
}
