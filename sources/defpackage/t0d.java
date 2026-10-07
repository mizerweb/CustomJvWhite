package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t0d {
    public final long a;
    public final long b;

    public t0d(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0d)) {
            return false;
        }
        t0d t0dVar = (t0d) obj;
        return this.a == t0dVar.a && this.b == t0dVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return c0a.m(this.b, ")", qt4.s(this.a, "Update(chatId=", ", messageId="));
    }
}
