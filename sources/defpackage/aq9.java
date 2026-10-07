package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aq9 {
    public final int a;
    public final bq9 b;
    public final vpc c;
    public final boolean d;

    public aq9(int i, bq9 bq9Var, vpc vpcVar, boolean z) {
        if (i == 0) {
            throw null;
        }
        bq9Var.getClass();
        this.a = i;
        this.b = bq9Var;
        this.c = vpcVar;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq9)) {
            return false;
        }
        aq9 aq9Var = (aq9) obj;
        return this.a == aq9Var.a && cqk.d(this.b, aq9Var.b) && cqk.d(this.c, aq9Var.c) && this.d == aq9Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (qt4.D(this.a) * 31)) * 31;
        vpc vpcVar = this.c;
        return Boolean.hashCode(this.d) + ((iHashCode + (vpcVar == null ? 0 : vpcVar.hashCode())) * 31);
    }

    public final String toString() {
        return "NetworkConditionChange(condition=" + mw7.n(this.a) + ", state=" + this.b + ", suggestedVideoSettings=" + this.c + ", preferHardwarePVXEncoder=" + this.d + ")";
    }
}
