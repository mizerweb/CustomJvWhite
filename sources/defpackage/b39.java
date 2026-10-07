package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class b39 extends e39 {
    public final long a;

    public b39(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b39) && this.a == ((b39) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "ScrollToMessage(localMessageId=", ")");
    }
}
