package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ub1 implements wb1 {
    public final long a;
    public final boolean b;
    public final String c;

    public ub1(long j, String str, boolean z) {
        this.a = j;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub1)) {
            return false;
        }
        ub1 ub1Var = (ub1) obj;
        return this.a == ub1Var.a && this.b == ub1Var.b && cqk.d(this.c, ub1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + nbh.n(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return qt4.q(qt4.u(this.a, "Chat(chatId=", ", isVideo=", this.b), ", link=", this.c, ")");
    }
}
