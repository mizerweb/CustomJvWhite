package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class glj {
    public static final flj Companion = new flj();
    public final String a;
    public final String b;

    public /* synthetic */ glj(int i, String str, String str2) {
        if (3 != (i & 3)) {
            shl.b(i, 3, elj.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glj)) {
            return false;
        }
        glj gljVar = (glj) obj;
        return cqk.d(this.a, gljVar.a) && cqk.d(this.b, gljVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return nbh.w("WebAppNfcGetInfoRequest(queryId=", this.a, ", requestId=", this.b, ")");
    }
}
