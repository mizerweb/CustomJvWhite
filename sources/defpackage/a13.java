package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a13 {
    public final long a;
    public final l8b b;

    public a13(long j, l8b l8bVar) {
        this.a = j;
        this.b = l8bVar;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a13)) {
            return false;
        }
        a13 a13Var = (a13) obj;
        return this.a == a13Var.a && this.b.equals(a13Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TypingCacheKey(chatId=" + this.a + ", notifs=" + this.b + ")";
    }
}
