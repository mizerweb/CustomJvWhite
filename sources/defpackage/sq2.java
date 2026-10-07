package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class sq2 {
    public final ynh a;
    public final Integer b;

    public sq2(ynh ynhVar, Integer num) {
        this.a = ynhVar;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sq2)) {
            return false;
        }
        sq2 sq2Var = (sq2) obj;
        return this.a.equals(sq2Var.a) && this.b.equals(sq2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSnackbar(title=" + this.a + ", iconRes=" + this.b + ")";
    }
}
