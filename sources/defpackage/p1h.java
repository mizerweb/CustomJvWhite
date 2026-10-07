package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class p1h implements t1h {
    public final Throwable a;

    public p1h(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1h) && cqk.d(this.a, ((p1h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return x05.h("Failure(exception=", ")", this.a);
    }
}
