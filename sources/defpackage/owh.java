package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class owh {
    public final String a;

    public /* synthetic */ owh(String str) {
        this.a = str;
    }

    public static String a(String str) {
        return c0a.o("TraceId(value=", str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof owh) {
            return cqk.d(this.a, ((owh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a(this.a);
    }
}
