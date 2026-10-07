package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class sdj {
    public static final rdj Companion = new rdj();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ sdj(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            shl.b(i, 3, qdj.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
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
        if (!(obj instanceof sdj)) {
            return false;
        }
        sdj sdjVar = (sdj) obj;
        return cqk.d(this.a, sdjVar.a) && cqk.d(this.b, sdjVar.b) && cqk.d(this.c, sdjVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int iD = zo5.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return zo5.w(qv1.q("WebAppBiometryAuthRequest(queryId=", this.a, ", requestId=", this.b, ", reason="), this.c, ")");
    }
}
