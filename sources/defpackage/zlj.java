package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class zlj {
    public static final ylj Companion = new ylj();
    public final String a;
    public final String b;

    public /* synthetic */ zlj(int i, String str, String str2) {
        if (3 != (i & 3)) {
            shl.b(i, 3, xlj.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zlj)) {
            return false;
        }
        zlj zljVar = (zlj) obj;
        return cqk.d(this.a, zljVar.a) && cqk.d(this.b, zljVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nbh.w("WebAppOpenCodeReaderResponse(requestId=", this.a, ", value=", this.b, ")");
    }

    public zlj(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
