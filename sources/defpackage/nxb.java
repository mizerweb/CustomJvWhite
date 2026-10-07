package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nxb {
    public final int a;

    public nxb(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nxb) && this.a == ((nxb) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "Counter(counterValue=", ")");
    }
}
