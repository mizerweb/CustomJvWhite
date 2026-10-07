package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class e29 {
    public final byte a;

    public static String a(byte b) {
        return c0a.k(b, "LinkCheckResultModel(value=", ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e29) {
            return this.a == ((e29) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
