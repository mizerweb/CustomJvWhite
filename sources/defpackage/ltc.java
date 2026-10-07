package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ltc {
    public final String a;
    public final long b;

    public ltc(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final String a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ltc)) {
            return false;
        }
        ltc ltcVar = (ltc) obj;
        return cqk.d(this.a, ltcVar.a) && this.b == ltcVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sbB = nbh.B(this.b, "PhoneAndServerPhone(phone=", this.a, ", serverPhone=");
        sbB.append(")");
        return sbB.toString();
    }
}
