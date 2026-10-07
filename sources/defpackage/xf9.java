package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xf9 extends yf9 {
    public final ynh d;
    public final ynh e;

    public xf9(ynh ynhVar, ynh ynhVar2) {
        super(ynhVar, null);
        this.d = ynhVar;
        this.e = ynhVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf9)) {
            return false;
        }
        xf9 xf9Var = (xf9) obj;
        return this.d.equals(xf9Var.d) && this.e.equals(xf9Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "SmsCountExceeded(title=" + this.d + ", description=" + this.e + ")";
    }
}
