package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cdf implements edf {
    public final nh7 a;

    public cdf(nh7 nh7Var) {
        this.a = nh7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdf) && this.a.equals(((cdf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnAlbumSelected(album=" + this.a + ")";
    }
}
