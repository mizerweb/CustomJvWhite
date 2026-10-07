package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class odg extends sdg {
    public final long c;

    public odg(long j) {
        super(j, 3);
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof odg) && this.c == ((odg) obj).c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c);
    }

    public final String toString() {
        return nbh.s(this.c, "ChatId(chatId=", ")");
    }
}
