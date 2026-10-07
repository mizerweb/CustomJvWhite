package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r23 implements s23 {
    public final long a;

    public r23(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r23) && this.a == ((r23) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "DownloadError(messageId=", ")");
    }
}
