package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class xrd extends mk0 {
    public final long b;

    public xrd(long j) {
        super(14);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xrd) && this.b == ((xrd) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return nbh.s(this.b, "ChatAttaches(chatId=", ")");
    }
}
