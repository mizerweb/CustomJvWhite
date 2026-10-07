package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class cod extends mk0 {
    public final long b;

    public cod(long j) {
        super(12);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cod) && this.b == ((cod) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return nbh.s(this.b, "OpenChat(chatId=", ")");
    }
}
