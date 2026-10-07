package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aod extends mk0 {
    public final String b;
    public final String c;

    public aod(String str, String str2) {
        super(12);
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aod)) {
            return false;
        }
        aod aodVar = (aod) obj;
        return this.b.equals(aodVar.b) && this.c.equals(aodVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return nbh.w("CropAvatar(uriAsString=", this.b, ", path=", this.c, ")");
    }
}
