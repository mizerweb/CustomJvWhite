package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ojc {
    public final int a;

    public static String a(int i) {
        return zo5.h(i, "Output-");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ojc) {
            return this.a == ((ojc) obj).a;
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
