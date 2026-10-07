package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ria {
    public final long a;

    public ria(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ria) && this.a == ((ria) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "ControlInfo(pinnedMessageId=", ")");
    }
}
