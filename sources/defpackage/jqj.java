package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class jqj {
    public static final hqj Companion = new hqj();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ jqj(int i, String str, String str2, String str3) {
        if (1 != (i & 1)) {
            shl.b(i, 1, fqj.a.d());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqj)) {
            return false;
        }
        jqj jqjVar = (jqj) obj;
        return cqk.d(this.a, jqjVar.a) && cqk.d(this.b, jqjVar.b) && cqk.d(this.c, jqjVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return zo5.w(qv1.q("WebAppShareRequest(requestId=", this.a, ", text=", this.b, ", link="), this.c, ")");
    }
}
