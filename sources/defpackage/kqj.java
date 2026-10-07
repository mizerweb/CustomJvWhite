package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class kqj {
    public static final iqj Companion = new iqj();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ kqj(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
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
        if (!(obj instanceof kqj)) {
            return false;
        }
        kqj kqjVar = (kqj) obj;
        return cqk.d(this.a, kqjVar.a) && cqk.d(this.b, kqjVar.b) && cqk.d(this.c, kqjVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return zo5.w(qv1.q("WebAppShareRequest(url=", this.a, ", title=", this.b, ", text="), this.c, ")");
    }
}
