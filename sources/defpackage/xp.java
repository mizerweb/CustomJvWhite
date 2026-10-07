package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xp {
    public final String a;
    public final String b;

    public xp(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xp)) {
            return false;
        }
        xp xpVar = (xp) obj;
        return cqk.d(this.a, xpVar.a) && cqk.d(this.b, xpVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return nbh.w("SessionInfo(sessionKey=", this.a, ", apiEndpoint=", this.b, ")");
    }
}
