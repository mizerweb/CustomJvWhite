package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class jui extends kih {
    public final String c;
    public final String d;
    public final List e;
    public final long f;

    public jui(String str, String str2, List list, long j) {
        this.c = str;
        this.d = str2;
        this.e = list;
        this.f = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jui)) {
            return false;
        }
        jui juiVar = (jui) obj;
        return cqk.d(this.c, juiVar.c) && cqk.d(this.d, juiVar.d) && cqk.d(this.e, juiVar.e) && this.f == juiVar.f;
    }

    public final int hashCode() {
        String str = this.c;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.e;
        return Long.hashCode(this.f) + ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    @Override // defpackage.sq0
    public final String toString() {
        String strS = nbh.s(this.f, "Flags(rawValue=", ")");
        StringBuilder sbQ = qv1.q("Response(conversationId=", this.c, ", internalCallerParams=", this.d, ", error=");
        sbQ.append(this.e);
        sbQ.append(", flags=");
        sbQ.append(strS);
        sbQ.append(")");
        return sbQ.toString();
    }
}
