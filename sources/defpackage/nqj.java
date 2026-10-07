package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class nqj {
    public static final mqj Companion = new mqj();
    public static final ny8[] c = {null, rx8.P(2, new o0j(24))};
    public final String a;
    public final pqj b;

    public /* synthetic */ nqj(int i, String str, pqj pqjVar) {
        if (3 != (i & 3)) {
            shl.b(i, 3, lqj.a.d());
            throw null;
        }
        this.a = str;
        this.b = pqjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nqj)) {
            return false;
        }
        nqj nqjVar = (nqj) obj;
        return cqk.d(this.a, nqjVar.a) && this.b == nqjVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WebAppShareResponse(requestId=" + this.a + ", status=" + this.b + ")";
    }

    public nqj(String str) {
        pqj pqjVar = pqj.b;
        this.a = str;
        this.b = pqjVar;
    }
}
