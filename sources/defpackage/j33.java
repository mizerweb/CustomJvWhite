package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j33 extends mk0 {
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;

    public j33(long j, long j2, String str, boolean z) {
        super(3);
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j33)) {
            return false;
        }
        j33 j33Var = (j33) obj;
        return this.b == j33Var.b && this.c == j33Var.c && cqk.d(this.d, j33Var.d) && this.e == j33Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + zo5.d(qt4.g(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.b, "OpenImage(chatId=", ", messageId=");
        qv1.s(this.c, ", attachLocalId=", this.d, sbS);
        return nbh.z(sbS, ", isSingleAttach=", this.e, ")");
    }
}
