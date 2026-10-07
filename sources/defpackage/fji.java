package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fji implements iji {
    public final Throwable a;

    public fji(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fji) && cqk.d(this.a, ((fji) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return x05.h("Failed(cause=", ")", this.a);
    }
}
