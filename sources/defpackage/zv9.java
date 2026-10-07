package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zv9 extends bw9 {
    public final String b;
    public final String c;

    public zv9(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv9)) {
            return false;
        }
        zv9 zv9Var = (zv9) obj;
        return this.b.equals(zv9Var.b) && cqk.d(this.c, zv9Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return nbh.w("OpenCropScreen(uriAsString=", this.b, ", path=", this.c, ")");
    }
}
