package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ali {
    public final String a;
    public final boolean b;

    public ali(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ali)) {
            return false;
        }
        ali aliVar = (ali) obj;
        return cqk.d(this.a, aliVar.a) && this.b == aliVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UrlState(url=" + this.a + ", isRestored=" + this.b + ")";
    }
}
