package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eoi {
    public final String a;
    public final boolean b;

    public eoi(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eoi)) {
            return false;
        }
        eoi eoiVar = (eoi) obj;
        return this.a.equals(eoiVar.a) && this.b == eoiVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PendingLinkWarning(link=" + this.a + ", blocked=" + this.b + ")";
    }
}
