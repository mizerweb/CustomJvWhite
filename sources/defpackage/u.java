package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class u extends rbb {
    public final long b;

    public u(long j) {
        super(sbi.a);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && this.b == ((u) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return nbh.s(this.b, "OpenChat(chatId=", ")");
    }
}
