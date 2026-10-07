package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class egj {
    public static final dgj Companion = new dgj();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ egj(int i, String str, String str2, String str3, String str4) {
        if (3 != (i & 3)) {
            shl.b(i, 3, cgj.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egj)) {
            return false;
        }
        egj egjVar = (egj) obj;
        return cqk.d(this.a, egjVar.a) && cqk.d(this.b, egjVar.b) && cqk.d(this.c, egjVar.c) && cqk.d(this.d, egjVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = zo5.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return nbh.y(qv1.q("WebAppBiometryUpdateTokenRequest(queryId=", this.a, ", requestId=", this.b, ", reason="), this.c, ", token=", this.d, ")");
    }
}
