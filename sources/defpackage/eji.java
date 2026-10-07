package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eji implements iji {
    public final long a;

    public eji(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eji) && this.a == ((eji) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "Completed(totalBytes=", ")");
    }
}
