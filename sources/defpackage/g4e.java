package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class g4e {
    public static final g4e c = new g4e(ynh.b, null);
    public final ynh a;
    public final ynh b;

    public g4e(ynh ynhVar, vnh vnhVar) {
        this.a = ynhVar;
        this.b = vnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4e)) {
            return false;
        }
        g4e g4eVar = (g4e) obj;
        return this.a.equals(g4eVar.a) && cqk.d(this.b, g4eVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ynh ynhVar = this.b;
        return iHashCode + (ynhVar == null ? 0 : ynhVar.hashCode());
    }

    public final String toString() {
        return "RaiseHandState(title=" + this.a + ", subtitle=" + this.b + ")";
    }
}
