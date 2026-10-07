package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nh7 {
    public final mh7 a;
    public int b;
    public boolean c;
    public final boolean d;

    public nh7(mh7 mh7Var, int i, boolean z, boolean z2) {
        this.a = mh7Var;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public static nh7 a(nh7 nh7Var, int i, int i2) {
        mh7 mh7Var = nh7Var.a;
        boolean z = (i2 & 4) != 0 ? nh7Var.c : true;
        boolean z2 = nh7Var.d;
        nh7Var.getClass();
        return new nh7(mh7Var, i, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh7)) {
            return false;
        }
        nh7 nh7Var = (nh7) obj;
        return cqk.d(this.a, nh7Var.a) && this.b == nh7Var.b && this.c == nh7Var.c && this.d == nh7Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + nbh.n(zo5.c(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        int i = this.b;
        boolean z = this.c;
        StringBuilder sb = new StringBuilder("GalleryAlbum(type=");
        sb.append(this.a);
        sb.append(", totalCount=");
        sb.append(i);
        sb.append(", isLoaded=");
        return bc1.m(", hasImages=", ")", sb, z, this.d);
    }
}
