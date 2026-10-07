package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class w3g implements vpa {
    public final String a;
    public final boolean b;

    public w3g(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3g)) {
            return false;
        }
        w3g w3gVar = (w3g) obj;
        return cqk.d(this.a, w3gVar.a) && this.b == w3gVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowWarningLinkBottomSheet(link=" + this.a + ", blocked=" + this.b + ")";
    }
}
