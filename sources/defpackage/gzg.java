package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gzg implements jzg {
    public final Throwable a;

    public gzg(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gzg) && cqk.d(this.a, ((gzg) obj).a);
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
