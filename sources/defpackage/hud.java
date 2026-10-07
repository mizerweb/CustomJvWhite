package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class hud extends qud {
    public final ynh a;
    public final cf7 b;

    public hud(ynh ynhVar, cf7 cf7Var) {
        this.a = ynhVar;
        this.b = cf7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hud)) {
            return false;
        }
        hud hudVar = (hud) obj;
        return this.a.equals(hudVar.a) && this.b.equals(hudVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowAbortionSnackbar(titleRes=" + this.a + ", abortAction=" + this.b + ")";
    }
}
