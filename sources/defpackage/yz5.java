package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yz5 {
    public final ind a;
    public final List b;

    public yz5(ind indVar, List list) {
        this.a = indVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz5)) {
            return false;
        }
        yz5 yz5Var = (yz5) obj;
        return cqk.d(this.a, yz5Var.a) && cqk.d(this.b, yz5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "State(appBarState=" + this.a + ", items=" + this.b + ")";
    }
}
