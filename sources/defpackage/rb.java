package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class rb implements tb {
    public final String a;
    public final String b;

    public rb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rb)) {
            return false;
        }
        rb rbVar = (rb) obj;
        return this.a.equals(rbVar.a) && cqk.d(this.b, rbVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return nbh.w("Submit(url=", this.a, ", title=", this.b, ")");
    }
}
