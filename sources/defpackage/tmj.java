package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class tmj {
    public static final smj Companion = new smj();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ tmj(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            shl.b(i, 15, rmj.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmj)) {
            return false;
        }
        tmj tmjVar = (tmj) obj;
        return cqk.d(this.a, tmjVar.a) && cqk.d(this.b, tmjVar.b) && cqk.d(this.c, tmjVar.c) && cqk.d(this.d, tmjVar.d);
    }

    public final int hashCode() {
        int iD = zo5.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return nbh.y(qv1.q("WebAppRequestPhoneResponse(requestId=", this.a, ", phone=", this.b, ", hash="), this.c, ", authDate=", this.d, ")");
    }

    public tmj(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }
}
