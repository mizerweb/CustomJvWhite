package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class h3g implements vpa {
    public final long a;

    public h3g(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h3g) && this.a == ((h3g) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "ShowReply(messageId=", ")");
    }
}
