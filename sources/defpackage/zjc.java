package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zjc {
    public final int a;

    public static String a(int i) {
        return nbh.t("MirrorMode(value=", i, ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zjc) {
            return this.a == ((zjc) obj).a;
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
