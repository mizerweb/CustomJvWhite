package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d06 extends g06 {
    public final String b;
    public final String c;

    public d06(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d06)) {
            return false;
        }
        d06 d06Var = (d06) obj;
        return this.b.equals(d06Var.b) && cqk.d(this.c, d06Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return nbh.w("OpenCropScreen(uriAsString=", this.b, ", path=", this.c, ")");
    }
}
