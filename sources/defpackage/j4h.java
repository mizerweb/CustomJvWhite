package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class j4h {
    public final int a;

    public static String a(int i) {
        return zo5.h(i, "Stream-");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j4h) {
            return this.a == ((j4h) obj).a;
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
