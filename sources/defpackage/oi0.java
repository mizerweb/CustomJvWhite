package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class oi0 {
    public final pi0 a;
    public final int b;

    public oi0(pi0 pi0Var, int i) {
        if (pi0Var == null) {
            ore.n("Null quality");
            throw null;
        }
        this.a = pi0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oi0) {
            oi0 oi0Var = (oi0) obj;
            if (this.a.equals(oi0Var.a) && this.b == oi0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QualityRatio{quality=");
        sb.append(this.a);
        sb.append(", aspectRatio=");
        return zo5.t(sb, this.b, "}");
    }
}
