package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s6d extends kjl {
    public final int a;

    public s6d(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s6d) && this.a == ((s6d) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "Count(count=", ")");
    }
}
