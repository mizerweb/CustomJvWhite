package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class szh {
    public final int a;
    public final int b;

    public szh(int i, int i2) {
        this.a = i;
        this.b = i2;
        if (i <= 0) {
            c.o(zo5.h(i, "Frame width must be positive, current: "));
            throw null;
        }
        if (i2 > 0) {
            return;
        }
        c.o(zo5.h(i2, "Frame height must be positive, current: "));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof szh)) {
            return false;
        }
        szh szhVar = (szh) obj;
        return this.a == szhVar.a && this.b == szhVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nbh.u("Exact(width=", this.a, ", height=", this.b, ")");
    }
}
