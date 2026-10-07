package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kr8 {
    public final ynh a;
    public final int b;

    public kr8(int i, ynh ynhVar) {
        this.a = ynhVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr8)) {
            return false;
        }
        kr8 kr8Var = (kr8) obj;
        return this.a.equals(kr8Var.a) && this.b == kr8Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "JoinRequestsToolbarInfo(title=" + this.a + ", count=" + this.b + ")";
    }
}
