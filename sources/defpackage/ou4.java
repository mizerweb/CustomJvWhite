package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ou4 {
    public static final ou4 b = new ou4(0);
    public final int a;

    public ou4(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ou4) && this.a == ((ou4) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "Counter(count=", ")");
    }
}
