package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class kkj {
    public static final jkj Companion = new jkj();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ kkj(String str, String str2, int i, String str3, String str4, String str5) {
        if (1 != (i & 1)) {
            shl.b(i, 1, ikj.a.d());
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kkj)) {
            return false;
        }
        kkj kkjVar = (kkj) obj;
        return cqk.d(this.a, kkjVar.a) && cqk.d(this.b, kkjVar.b) && cqk.d(this.c, kkjVar.c) && cqk.d(this.d, kkjVar.d) && cqk.d(this.e, kkjVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = qv1.q("WebAppMaxShareRequest(requestId=", this.a, ", text=", this.b, ", link=");
        nbh.G(sbQ, this.c, ", messageId=", this.d, ", chatId=");
        return zo5.w(sbQ, this.e, ")");
    }
}
