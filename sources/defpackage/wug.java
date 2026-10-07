package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wug extends mk0 {
    public final long b;

    public wug(long j) {
        super(21);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wug) && this.b == ((wug) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return nbh.s(this.b, "OpenChat(chatId=", ")");
    }
}
