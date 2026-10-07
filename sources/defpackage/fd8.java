package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fd8 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public fd8(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd8)) {
            return false;
        }
        fd8 fd8Var = (fd8) obj;
        return this.a == fd8Var.a && this.b == fd8Var.b && this.c == fd8Var.c && this.d == fd8Var.d && this.e == fd8Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + nbh.n(nbh.n(nbh.n(qt4.D(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndicatorState(mode=");
        sb.append(mw7.q(this.a));
        sb.append(", actionsAvailable=");
        sb.append(this.b);
        sb.append(", isTalking=");
        qt4.B(", isBadConnection=", ", isOnHold=", sb, this.c, this.d);
        return qt4.r(sb, this.e, ")");
    }
}
