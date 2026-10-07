package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class wlj {
    public static final vlj Companion = new vlj();
    public final String a;
    public final Boolean b;

    public /* synthetic */ wlj(int i, String str, Boolean bool) {
        if (3 != (i & 3)) {
            shl.b(i, 3, ulj.a.d());
            throw null;
        }
        this.a = str;
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlj)) {
            return false;
        }
        wlj wljVar = (wlj) obj;
        return cqk.d(this.a, wljVar.a) && cqk.d(this.b, wljVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "WebAppOpenCodeReaderRequest(requestId=" + this.a + ", fileSelect=" + this.b + ")";
    }
}
