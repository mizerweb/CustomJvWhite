package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class jlj {
    public static final ilj Companion = new ilj();
    public final String a;
    public final boolean b;
    public final boolean c;

    public /* synthetic */ jlj(int i, String str, boolean z, boolean z2) {
        if (7 != (i & 7)) {
            shl.b(i, 7, hlj.a.d());
            throw null;
        }
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlj)) {
            return false;
        }
        jlj jljVar = (jlj) obj;
        return cqk.d(this.a, jljVar.a) && this.b == jljVar.b && this.c == jljVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + nbh.n(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return qt4.r(zo5.A("WebAppNfcInfoResponse(requestId=", this.a, ", available=", ", enabled=", this.b), this.c, ")");
    }

    public jlj(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }
}
