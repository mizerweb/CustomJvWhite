package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class fk1 implements gk1 {
    public final long a;

    public fk1(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fk1) && this.a == ((fk1) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return nbh.s(this.a, "Error(requestId=", ")");
    }
}
