package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ni0 {
    public final Integer a;

    public ni0(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ni0) {
            return this.a.equals(((ni0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.a + "}";
    }
}
