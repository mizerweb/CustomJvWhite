package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dd0 extends kih {
    public final cd0 c;

    public dd0(cd0 cd0Var) {
        this.c = cd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dd0) && this.c == ((dd0) obj).c;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.sq0
    public final String toString() {
        cd0 cd0Var = this.c;
        return s5h.y0("Response(enabled=" + cd0Var.a + ",\n                |hint='" + cd0Var.b + "',\n                |email='" + ch3.y(cd0Var.c) + "')\n                |");
    }
}
