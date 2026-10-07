package defpackage;

/* JADX INFO: loaded from: classes3.dex */
@mif
public final class o8h {
    public static final l8h Companion = new l8h();
    public static final ny8[] c = {rx8.P(2, new yvg(8)), null};
    public final n8h a;
    public final String b;

    public /* synthetic */ o8h(int i, n8h n8hVar, String str) {
        if (1 != (i & 1)) {
            shl.b(i, 1, k8h.a.d());
            throw null;
        }
        this.a = n8hVar;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8h)) {
            return false;
        }
        o8h o8hVar = (o8h) obj;
        return this.a == o8hVar.a && cqk.d(this.b, o8hVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SuccessResponse(status=" + this.a + ", requestId=" + this.b + ")";
    }

    public o8h(n8h n8hVar, String str) {
        this.a = n8hVar;
        this.b = str;
    }
}
