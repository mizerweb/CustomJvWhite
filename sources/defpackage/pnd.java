package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pnd implements tnd {
    public final long a;

    public pnd(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pnd) && this.a == ((pnd) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "ChatUpdate(requestId=", ")");
    }
}
