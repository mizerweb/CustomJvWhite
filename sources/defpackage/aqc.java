package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class aqc {
    public final long a;

    public aqc(long j) {
        this.a = j;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aqc) && this.a == ((aqc) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "NavigateToRequestsList(chatId=", ")");
    }
}
