package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class y5a {
    public final int a;

    public y5a(int i) {
        this.a = i;
    }

    public final boolean a(int... iArr) {
        for (int i : iArr) {
            if (wk8.w(this.a, i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        return wk8.w(this.a, 0);
    }

    public final boolean c() {
        return wk8.w(this.a, 1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y5a) && this.a == ((y5a) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "MediaTransformFallbackOptions(value=", ")");
    }
}
