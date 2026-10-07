package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class utc {
    public final luc a;
    public final boolean b;

    public utc(luc lucVar, boolean z) {
        this.a = lucVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof utc)) {
            return false;
        }
        utc utcVar = (utc) obj;
        return cqk.d(this.a, utcVar.a) && this.b == utcVar.b;
    }

    public final int hashCode() {
        luc lucVar = this.a;
        return Boolean.hashCode(this.b) + ((lucVar == null ? 0 : lucVar.hashCode()) * 31);
    }

    public final String toString() {
        return "PhoneModel(number=" + this.a + ", isValid=" + this.b + ")";
    }
}
