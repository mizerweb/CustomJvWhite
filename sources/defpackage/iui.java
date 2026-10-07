package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class iui {
    public final Long a;
    public final String b;

    public iui(String str, Long l) {
        this.a = l;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iui)) {
            return false;
        }
        iui iuiVar = (iui) obj;
        return cqk.d(this.a, iuiVar.a) && cqk.d(this.b, iuiVar.b);
    }

    public final int hashCode() {
        Long l = this.a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "RejectedParticipants(id=" + this.a + ", errorCode=" + this.b + ")";
    }
}
