package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xs0 extends zs0 {
    public final int a;

    public xs0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xs0) && this.a == ((xs0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "Circle(color=", ")");
    }
}
