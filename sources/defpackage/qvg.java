package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qvg implements rvg {
    public final long a;

    public qvg(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qvg) && this.a == ((qvg) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "ShowReplySendSnackbar(chatId=", ")");
    }
}
