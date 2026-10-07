package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class kyg implements myg {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public kyg(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public static kyg a(kyg kygVar, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = kygVar.a;
        }
        if ((i & 2) != 0) {
            z2 = kygVar.b;
        }
        if ((i & 4) != 0) {
            z3 = kygVar.c;
        }
        return new kyg(z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kyg)) {
            return false;
        }
        kyg kygVar = (kyg) obj;
        return this.a == kygVar.a && this.b == kygVar.b && this.c == kygVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return qt4.r(zo5.B("Dragging(isSnapHorizontal=", this.a, ", isSnapVertical=", this.b, ", isDeleteHovered="), this.c, ")");
    }
}
