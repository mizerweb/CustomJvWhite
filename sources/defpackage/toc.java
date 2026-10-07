package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class toc {
    public final int a;

    public static String a(int i) {
        return c0a.k(i, "PauseReasons(mask=", ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof toc) {
            return this.a == ((toc) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
