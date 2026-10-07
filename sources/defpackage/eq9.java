package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class eq9 {
    public final cq9 a;
    public final dq9 b;

    public eq9() {
        cq9 cq9Var = new cq9();
        dq9 dq9Var = new dq9();
        this.a = cq9Var;
        this.b = dq9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq9)) {
            return false;
        }
        eq9 eq9Var = (eq9) obj;
        return this.a.equals(eq9Var.a) && this.b.equals(eq9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MediaAdaptationConfig(badNetwork=" + this.a + ", goodNetwork=" + this.b + ")";
    }
}
