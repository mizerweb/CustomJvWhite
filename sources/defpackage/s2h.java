package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s2h implements x2h {
    public final Throwable a;

    public s2h(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s2h) && cqk.d(this.a, ((s2h) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return x05.h("Failed(exception=", ")", this.a);
    }
}
