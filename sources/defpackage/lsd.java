package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lsd extends mk0 {
    public final long b;

    public lsd(long j) {
        super(14);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lsd) && this.b == ((lsd) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return nbh.s(this.b, "Search(chatId=", ")");
    }
}
