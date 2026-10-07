package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class d28 extends e2m {
    public final int a;

    public d28(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d28) && this.a == ((d28) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "ReadingFixedBody(remaining=", ")");
    }
}
