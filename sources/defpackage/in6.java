package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class in6 {
    public final long a;
    public final long b;
    public final long c;

    public in6(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in6)) {
            return false;
        }
        in6 in6Var = (in6) obj;
        return this.a == in6Var.a && this.b == in6Var.b && this.c == in6Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qt4.g(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbS = qt4.s(this.a, "FcmAnalyticsRemovedEntry(chatId=", ", messageId=");
        sbS.append(this.b);
        return zo5.k(this.c, ", postId=", ")", sbS);
    }
}
