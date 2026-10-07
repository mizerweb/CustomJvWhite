package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fxc implements gxc {
    public final long a;

    public fxc(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fxc) && this.a == ((fxc) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "Success(requestId=", ")");
    }
}
