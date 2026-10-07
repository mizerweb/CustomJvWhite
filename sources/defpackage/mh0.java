package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class mh0 {
    public static final mh0 c = new mh0(pi0.k, 0);
    public final pi0 a;
    public final int b;

    public mh0(pi0 pi0Var, int i) {
        if (pi0Var == null) {
            ore.n("Null fallbackQuality");
            throw null;
        }
        this.a = pi0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mh0)) {
            return false;
        }
        mh0 mh0Var = (mh0) obj;
        return this.a.equals(mh0Var.a) && this.b == mh0Var.b;
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RuleStrategy{fallbackQuality=");
        sb.append(this.a);
        sb.append(", fallbackRule=");
        return zo5.t(sb, this.b, "}");
    }
}
