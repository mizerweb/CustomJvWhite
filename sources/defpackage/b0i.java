package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class b0i implements e0i {
    public final Throwable a;

    public b0i(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0i) && this.a.equals(((b0i) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return x05.h("Failed(cause=", ")", this.a);
    }
}
