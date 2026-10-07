package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class d1d {
    public final int a;
    public final int b;

    public d1d(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1d)) {
            return false;
        }
        d1d d1dVar = (d1d) obj;
        return this.a == d1dVar.a && this.b == d1dVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nbh.u("PipBoundariesOffset(topYOffset=", this.a, ", bottomYOffset=", this.b, ")");
    }
}
