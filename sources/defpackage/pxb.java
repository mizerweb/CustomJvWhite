package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pxb implements qxb {
    public final int a;

    public pxb(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pxb) && this.a == ((pxb) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "Resource(iconRes=", ")");
    }
}
