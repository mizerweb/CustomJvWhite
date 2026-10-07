package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class us1 extends xs1 {
    public final boolean a;
    public final fu1 b;

    public us1(fu1 fu1Var, boolean z) {
        this.a = z;
        this.b = fu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof us1)) {
            return false;
        }
        us1 us1Var = (us1) obj;
        return this.a == us1Var.a && cqk.d(this.b, us1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "HasOpenAction(hasAction=" + this.a + ", opponentId=" + this.b + ")";
    }
}
