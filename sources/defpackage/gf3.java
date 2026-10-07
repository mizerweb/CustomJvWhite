package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gf3 extends mk0 {
    public final String b;
    public final String c;

    public gf3(String str, String str2) {
        super(4);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf3)) {
            return false;
        }
        gf3 gf3Var = (gf3) obj;
        return this.b.equals(gf3Var.b) && this.c.equals(gf3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return nbh.w("CropPhoto(uriAsString=", this.b, ", path=", this.c, ")");
    }
}
