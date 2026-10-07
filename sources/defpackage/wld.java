package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wld extends cmd {
    public final long b;

    public wld(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wld) && this.b == ((wld) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return nbh.s(this.b, "OpenAddSubscribersAndUpdateBackstack(id=", ")");
    }
}
