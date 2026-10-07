package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lqa implements nqa {
    public final long a;

    public lqa(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqa) && this.a == ((lqa) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "SetEditedMessage(messageId=", ")");
    }
}
