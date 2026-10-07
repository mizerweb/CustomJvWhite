package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z55 {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public z55() {
        boolean zBooleanValue = ((Boolean) ((ifh) x55.a.c).getValue()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) ((ifh) x55.b.c).getValue()).booleanValue();
        boolean zBooleanValue3 = ((Boolean) ((ifh) x55.c.c).getValue()).booleanValue();
        this.a = zBooleanValue;
        this.b = zBooleanValue2;
        this.c = zBooleanValue3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z55)) {
            return false;
        }
        z55 z55Var = (z55) obj;
        return this.a == z55Var.a && this.b == z55Var.b && this.c == z55Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + nbh.n(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return qt4.r(zo5.B("DecodersConfig(isVP9Supported=", this.a, ", isAV1Supported=", this.b, ", isOpusSupported="), this.c, ")");
    }
}
