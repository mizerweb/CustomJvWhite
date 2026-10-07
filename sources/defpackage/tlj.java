package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class tlj {
    public static final slj Companion = new slj();
    public final String a;
    public final String b;

    public /* synthetic */ tlj(int i, String str, String str2) {
        if (3 != (i & 3)) {
            shl.b(i, 3, rlj.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tlj)) {
            return false;
        }
        tlj tljVar = (tlj) obj;
        return cqk.d(this.a, tljVar.a) && cqk.d(this.b, tljVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return nbh.w("WebAppNfcOpenSystemSettingsRequest(queryId=", this.a, ", requestId=", this.b, ")");
    }
}
