package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hwh {
    public final int a;

    public final boolean equals(Object obj) {
        if (obj instanceof hwh) {
            return this.a == ((hwh) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return nbh.t("TorchMode(value=", this.a, ')');
    }
}
