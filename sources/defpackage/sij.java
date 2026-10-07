package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class sij {
    public static final rij Companion = new rij();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ sij(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            shl.b(i, 7, qij.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sij)) {
            return false;
        }
        sij sijVar = (sij) obj;
        return cqk.d(this.a, sijVar.a) && cqk.d(this.b, sijVar.b) && cqk.d(this.c, sijVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return zo5.w(qv1.q("WebAppGetViewPortSizeResponse(requestId=", this.a, ", height=", this.b, ", width="), this.c, ")");
    }

    public sij(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
