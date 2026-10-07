package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dl extends il {
    public final int a;

    public dl(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dl) && this.a == ((dl) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "Color(value=", ")");
    }
}
