package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jd9 {
    public final int a;

    public /* synthetic */ jd9(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jd9) {
            return this.a == ((jd9) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return nbh.t("Lock3ABehavior(value=", this.a, ')');
    }
}
