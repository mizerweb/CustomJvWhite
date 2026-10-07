package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b2g implements vpa {
    public final long a;

    public b2g(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2g) && this.a == ((b2g) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "ShowEditMessage(messageId=", ")");
    }
}
