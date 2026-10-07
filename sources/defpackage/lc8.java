package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lc8 extends zq0 {
    public final long b;
    public final long c;
    public final boolean d;
    public final mg5 e;
    public final boolean f;
    public final long g;

    public lc8(long j, long j2, boolean z, mg5 mg5Var, boolean z2, long j3) {
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = mg5Var;
        this.f = z2;
        this.g = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc8)) {
            return false;
        }
        lc8 lc8Var = (lc8) obj;
        return this.b == lc8Var.b && this.c == lc8Var.c && this.d == lc8Var.d && this.e == lc8Var.e && this.f == lc8Var.f && this.g == lc8Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + nbh.n((this.e.hashCode() + nbh.n(qt4.g(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f);
    }

    @Override // defpackage.zq0
    public final String toString() {
        StringBuilder sbS = qt4.s(this.b, "IncomingMessageEvent(chatId=", ", messageId=");
        sbS.append(this.c);
        sbS.append(", isInvisiblePush=");
        sbS.append(this.d);
        sbS.append(", itemType=");
        sbS.append(this.e);
        sbS.append(", isControl=");
        sbS.append(this.f);
        return zo5.k(this.g, ", sender=", ")", sbS);
    }
}
