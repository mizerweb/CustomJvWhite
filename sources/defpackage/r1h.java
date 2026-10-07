package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r1h implements t1h {
    public final Throwable a;

    public r1h(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r1h) && cqk.d(this.a, ((r1h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return x05.h("NetworkError(exception=", ")", this.a);
    }
}
