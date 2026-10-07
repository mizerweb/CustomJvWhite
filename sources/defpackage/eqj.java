package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eqj extends kih {
    public final String c;
    public final String d;
    public final long e;

    public eqj(long j, String str, String str2) {
        this.c = str;
        this.d = str2;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqj)) {
            return false;
        }
        eqj eqjVar = (eqj) obj;
        return cqk.d(this.c, eqjVar.c) && cqk.d(this.d, eqjVar.d) && this.e == eqjVar.e;
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.d;
        return Long.hashCode(this.e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // defpackage.sq0
    public final String toString() {
        return c0a.m(this.e, ")", qv1.q("Response(phone=", this.c, ", hash=", this.d, ", authDate="));
    }
}
