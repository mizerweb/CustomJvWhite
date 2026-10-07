package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class eh0 {
    public final ei0 a;
    public final ei0 b;

    public eh0(ei0 ei0Var, ei0 ei0Var2) {
        this.a = ei0Var;
        this.b = ei0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof eh0)) {
            return false;
        }
        eh0 eh0Var = (eh0) obj;
        return this.a.equals(eh0Var.a) && this.b.equals(eh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.a + ", secondaryOutConfig=" + this.b + "}";
    }
}
