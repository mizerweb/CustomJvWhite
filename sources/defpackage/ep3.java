package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ep3 implements ip3 {
    public final Throwable a;

    public ep3(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ep3) && this.a.equals(((ep3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return x05.h("Common(exception=", ")", this.a);
    }
}
