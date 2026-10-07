package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class co0 {
    public static final co0 e = new co0(null, null, new bo0(false, false), new ao0(false, false));
    public final n81 a;
    public final vke b;
    public final bo0 c;
    public final ao0 d;

    public co0(n81 n81Var, vke vkeVar, bo0 bo0Var, ao0 ao0Var) {
        this.a = n81Var;
        this.b = vkeVar;
        this.c = bo0Var;
        this.d = ao0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof co0)) {
            return false;
        }
        co0 co0Var = (co0) obj;
        return cqk.d(this.a, co0Var.a) && cqk.d(this.b, co0Var.b) && this.c.equals(co0Var.c) && this.d.equals(co0Var.d);
    }

    public final int hashCode() {
        n81 n81Var = this.a;
        int iHashCode = (n81Var == null ? 0 : n81Var.hashCode()) * 31;
        vke vkeVar = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (vkeVar != null ? vkeVar.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "BadNetworkIndicatorConfig(calcNetworkStatusConfig=" + this.a + ", reportNetworkStatusConfig=" + this.b + ", signalingConfig=" + this.c + ", debugLoggingConfig=" + this.d + ")";
    }
}
