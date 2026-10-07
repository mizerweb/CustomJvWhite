package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ymd extends rbb {
    public final long b;

    public ymd(long j) {
        super(sbi.a);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ymd) && this.b == ((ymd) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return nbh.s(this.b, "BackToChat(chatId=", ")");
    }
}
