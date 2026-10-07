package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class gsj {
    public static final fsj Companion = new fsj();
    public final String a;
    public final String b;

    public /* synthetic */ gsj(int i, String str, String str2) {
        if (3 != (i & 3)) {
            shl.b(i, 3, esj.a.d());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsj)) {
            return false;
        }
        gsj gsjVar = (gsj) obj;
        return cqk.d(this.a, gsjVar.a) && cqk.d(this.b, gsjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nbh.w("WebAppVerifyMobileIdRequest(requestId=", this.a, ", url=", this.b, ")");
    }
}
