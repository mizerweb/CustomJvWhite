package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xp8 implements aq8 {
    public final long a;

    public xp8(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xp8) && this.a == ((xp8) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "RequestSubmitted(chatId=", ")");
    }
}
