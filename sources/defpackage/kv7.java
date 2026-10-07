package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kv7 implements vpa {
    public final long a;

    public kv7(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kv7) && this.a == ((kv7) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "HideMessageContextMenu(messageId=", ")");
    }
}
