package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xla implements ama {
    public final long a;

    public xla(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xla) && this.a == ((xla) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "ShowScheduledMessagesScreen(chatId=", ")");
    }
}
