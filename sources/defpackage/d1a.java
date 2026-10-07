package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d1a extends i1a {
    public final String b;
    public final String c;

    public d1a(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1a)) {
            return false;
        }
        d1a d1aVar = (d1a) obj;
        return this.b.equals(d1aVar.b) && cqk.d(this.c, d1aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return nbh.w("OpenCropScreen(uriAsString=", this.b, ", path=", this.c, ")");
    }
}
