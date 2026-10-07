package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class ykj {
    public static final xkj Companion = new xkj();
    public final String a;
    public final String b;

    public /* synthetic */ ykj(int i, String str, String str2) {
        if (3 != (i & 3)) {
            shl.b(i, 3, wkj.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykj)) {
            return false;
        }
        ykj ykjVar = (ykj) obj;
        return cqk.d(this.a, ykjVar.a) && cqk.d(this.b, ykjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nbh.w("WebAppNfcEmulateNfcTagResponse(requestId=", this.a, ", status=", this.b, ")");
    }

    public ykj(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
