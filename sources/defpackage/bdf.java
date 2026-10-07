package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bdf implements edf {
    public final int a;

    public bdf(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bdf) && this.a == ((bdf) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "AlbumHeightChanged(height=", ")");
    }
}
