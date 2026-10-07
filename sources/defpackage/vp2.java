package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vp2 {
    public final jq2 a;
    public final List b;

    public vp2(jq2 jq2Var, List list) {
        this.a = jq2Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp2)) {
            return false;
        }
        vp2 vp2Var = (vp2) obj;
        return cqk.d(this.a, vp2Var.a) && cqk.d(this.b, vp2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "State(screenState=" + this.a + ", items=" + this.b + ")";
    }
}
