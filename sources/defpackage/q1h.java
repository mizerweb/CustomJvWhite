package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class q1h implements t1h {
    public final Throwable a;

    public q1h(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q1h) && cqk.d(this.a, ((q1h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return x05.h("LimitExceeded(exception=", ")", this.a);
    }
}
