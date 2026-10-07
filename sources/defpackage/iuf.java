package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class iuf extends mk0 {
    public final String b;
    public final String c;

    public iuf(String str, String str2) {
        super(18);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iuf)) {
            return false;
        }
        iuf iufVar = (iuf) obj;
        return this.b.equals(iufVar.b) && this.c.equals(iufVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return nbh.w("CropAvatar(uriAsString=", this.b, ", path=", this.c, ")");
    }
}
