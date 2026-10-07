package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ha9 {
    public static final ha9 b = new ha9(0);
    public static final ha9 c = new ha9(-1);
    public final int a;

    public ha9(int i) {
        this.a = i;
    }

    public final String a(String str, String str2) {
        String strH = equals(b) ? "" : zo5.h(this.a, "_");
        return str2 == null ? str.concat(strH) : nbh.v(str, strH, ".", str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ha9) && this.a == ((ha9) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return c0a.k(this.a, "LocalAccountId(raw=", ")");
    }
}
