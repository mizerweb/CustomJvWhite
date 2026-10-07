package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uu4 {
    public final x0c a;
    public final int b;
    public final ynh c;

    public uu4(x0c x0cVar, int i, ynh ynhVar) {
        this.a = x0cVar;
        this.b = i;
        this.c = ynhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu4)) {
            return false;
        }
        uu4 uu4Var = (uu4) obj;
        return cqk.d(this.a, uu4Var.a) && this.b == uu4Var.b && cqk.d(this.c, uu4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + zo5.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CountryInfoModel(country=" + this.a + ", maxNumbersSize=" + this.b + ", hint=" + this.c + ")";
    }
}
