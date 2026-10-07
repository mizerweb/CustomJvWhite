package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p93 {
    public final long a;
    public final long b;

    public p93(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p93)) {
            return false;
        }
        p93 p93Var = (p93) obj;
        return this.a == p93Var.a && this.b == p93Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return c0a.m(this.b, ")", qt4.s(this.a, "ChatPollUpdate(messageId=", ", pollId="));
    }
}
