package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yb8 {
    public final int a;
    public final wf5 b;
    public final ze2 c;

    public yb8(int i, wf5 wf5Var, ze2 ze2Var) {
        this.a = i;
        this.b = wf5Var;
        this.c = ze2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yb8) {
            yb8 yb8Var = (yb8) obj;
            return this.a == yb8Var.a && cqk.d(this.b, yb8Var.b) && this.c == yb8Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "ConfiguredOutput(streamId=" + ((Object) j4h.a(this.a)) + ", deferrableSurface=" + this.b + ", graph=" + this.c + ')';
    }
}
