package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class nkj {
    public static final mkj Companion = new mkj();
    public static final ny8[] c = {null, rx8.P(2, new o0j(16))};
    public final String a;
    public final pqj b;

    public /* synthetic */ nkj(int i, String str, pqj pqjVar) {
        if (3 != (i & 3)) {
            shl.b(i, 3, lkj.a.d());
            throw null;
        }
        this.a = str;
        this.b = pqjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkj)) {
            return false;
        }
        nkj nkjVar = (nkj) obj;
        return cqk.d(this.a, nkjVar.a) && this.b == nkjVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppMaxShareResponse(requestId=" + this.a + ", status=" + this.b + ")";
    }

    public nkj(String str, pqj pqjVar) {
        this.a = str;
        this.b = pqjVar;
    }
}
