package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class z1g extends vgd {
    public final Collection a;
    public final int b;

    public z1g(c79 c79Var, int i) {
        this.a = c79Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1g)) {
            return false;
        }
        z1g z1gVar = (z1g) obj;
        return cqk.d(this.a, z1gVar.a) && this.b == z1gVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowContextMenu(actions=" + this.a + ", id=" + this.b + ")";
    }
}
