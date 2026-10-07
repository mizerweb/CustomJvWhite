package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class t2e {
    public final ynh a;
    public final String b;

    public t2e(ynh ynhVar, String str) {
        this.a = ynhVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t2e)) {
            return false;
        }
        t2e t2eVar = (t2e) obj;
        return cqk.d(this.a, t2eVar.a) && cqk.d(this.b, t2eVar.b);
    }

    public final int hashCode() {
        ynh ynhVar = this.a;
        int iHashCode = (ynhVar == null ? 0 : ynhVar.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "QuoteContent(body=" + this.a + ", imageUri=" + this.b + ")";
    }
}
