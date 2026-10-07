package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class erj {
    public static final drj Companion = new drj();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ erj(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            shl.b(i, 7, crj.a.d());
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
        if (!(obj instanceof erj)) {
            return false;
        }
        erj erjVar = (erj) obj;
        return cqk.d(this.a, erjVar.a) && cqk.d(this.b, erjVar.b) && cqk.d(this.c, erjVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return zo5.w(qv1.q("WebAppStorageGetKeyResponse(requestId=", this.a, ", key=", this.b, ", value="), this.c, ")");
    }

    public erj(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
