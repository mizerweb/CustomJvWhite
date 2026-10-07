package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jx6 {
    public final int a;

    static {
        xw3.P0(new jx6(0), new jx6(1), new jx6(2));
    }

    public /* synthetic */ jx6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jx6) {
            return this.a == ((jx6) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return nbh.t("FlashMode(value=", this.a, ')');
    }
}
