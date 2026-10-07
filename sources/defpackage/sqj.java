package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class sqj {
    public static final rqj Companion = new rqj();
    public final String a;
    public final String b;

    public /* synthetic */ sqj(int i, String str, String str2) {
        if (3 != (i & 3)) {
            shl.b(i, 3, qqj.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sqj)) {
            return false;
        }
        sqj sqjVar = (sqj) obj;
        return cqk.d(this.a, sqjVar.a) && cqk.d(this.b, sqjVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return nbh.w("WebAppStorageClearRequest(queryId=", this.a, ", requestId=", this.b, ")");
    }
}
