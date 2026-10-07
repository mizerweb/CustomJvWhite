package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class bxc implements cxc {
    public final long a;

    public bxc(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bxc) && this.a == ((bxc) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "OpenChat(chatId=", ")");
    }
}
