package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class v3g implements vpa {
    public final long a;

    public v3g(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3g) && this.a == ((v3g) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "ShowUnpinCancelableSnackbar(messageId=", ")");
    }
}
