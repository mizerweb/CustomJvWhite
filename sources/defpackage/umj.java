package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class umj {
    public final String a;
    public final String b;
    public final Long c;

    public umj(Long l, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof umj)) {
            return false;
        }
        umj umjVar = (umj) obj;
        return cqk.d(this.a, umjVar.a) && cqk.d(this.b, umjVar.b) && cqk.d(this.c, umjVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("WebAppRequestPhoneSuccess(phone=", this.a, ", hash=", this.b, ", authDate=");
        sbQ.append(this.c);
        sbQ.append(")");
        return sbQ.toString();
    }
}
