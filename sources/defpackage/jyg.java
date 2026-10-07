package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class jyg {
    public final syg a;
    public final cy8 b;
    public final ys3 c;

    public jyg(syg sygVar, cy8 cy8Var, ys3 ys3Var) {
        this.a = sygVar;
        this.b = cy8Var;
        this.c = ys3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyg)) {
            return false;
        }
        jyg jygVar = (jyg) obj;
        return this.a == jygVar.a && this.b.equals(jygVar.b) && cqk.d(this.c, jygVar.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ys3 ys3Var = this.c;
        return iHashCode + (ys3Var == null ? 0 : ys3Var.hashCode());
    }

    public final String toString() {
        return "StoryLayerApi(type=" + this.a + ", coordinates=" + this.b + ", clickableLink=" + this.c + ")";
    }
}
