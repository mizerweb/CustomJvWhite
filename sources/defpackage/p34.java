package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p34 implements r34 {
    public final long a;

    public p34(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p34) && this.a == ((p34) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "Add(chatId=", ")");
    }
}
