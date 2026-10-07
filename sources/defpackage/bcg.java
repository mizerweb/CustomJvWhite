package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bcg implements grf {
    public final ynh a;
    public final int b;
    public final ynh c;
    public final int d;

    public bcg(ynh ynhVar, int i, ynh ynhVar2, int i2) {
        this.a = ynhVar;
        this.b = i;
        this.c = ynhVar2;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bcg)) {
            return false;
        }
        bcg bcgVar = (bcg) obj;
        return this.a.equals(bcgVar.a) && this.b == bcgVar.b && this.c.equals(bcgVar.c) && this.d == bcgVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + bc1.h(zo5.c(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "SnackbarShow(title=" + this.a + ", iconRes=" + this.b + ", caption=" + this.c + ", bottomMargin=" + this.d + ")";
    }
}
