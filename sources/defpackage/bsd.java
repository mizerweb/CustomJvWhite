package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bsd extends mk0 {
    public final String b;
    public final String c;

    public bsd(String str, String str2) {
        super(14);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsd)) {
            return false;
        }
        bsd bsdVar = (bsd) obj;
        return this.b.equals(bsdVar.b) && this.c.equals(bsdVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return nbh.w("CropAvatar(uriAsString=", this.b, ", path=", this.c, ")");
    }
}
