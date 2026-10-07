package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mqa implements nqa {
    public final long a;

    public mqa(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mqa) && this.a == ((mqa) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "SetRepliedMessage(messageId=", ")");
    }
}
