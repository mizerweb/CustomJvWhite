package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l33 extends mk0 {
    public final long b;
    public final long c;

    public l33(long j, long j2) {
        super(3);
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l33)) {
            return false;
        }
        l33 l33Var = (l33) obj;
        return this.b == l33Var.b && this.c == l33Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return c0a.m(this.c, ")", qt4.s(this.b, "OpenMessage(chatId=", ", messageId="));
    }
}
