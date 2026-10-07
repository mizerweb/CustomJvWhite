package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class adf {
    public final boolean a;
    public final boolean b;
    public final lh7 c;

    public adf(boolean z, boolean z2, lh7 lh7Var) {
        this.a = z;
        this.b = z2;
        this.c = lh7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof adf)) {
            return false;
        }
        adf adfVar = (adf) obj;
        return this.a == adfVar.a && this.b == adfVar.b && cqk.d(this.c, adfVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbB = zo5.B("SelectAlbumMode(onlyPhotoAlbums=", this.a, ", showEmptyAlbums=", this.b, ", defaultAlbumType=");
        sbB.append(this.c);
        sbB.append(")");
        return sbB.toString();
    }
}
