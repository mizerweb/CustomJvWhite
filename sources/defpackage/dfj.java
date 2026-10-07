package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class dfj {
    public static final cfj Companion = new cfj();
    public final String a;
    public final String b;

    public /* synthetic */ dfj(int i, String str, String str2) {
        if (3 != (i & 3)) {
            shl.b(i, 3, bfj.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfj)) {
            return false;
        }
        dfj dfjVar = (dfj) obj;
        return cqk.d(this.a, dfjVar.a) && cqk.d(this.b, dfjVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return nbh.w("WebAppBiometryGetInfoRequest(queryId=", this.a, ", requestId=", this.b, ")");
    }
}
