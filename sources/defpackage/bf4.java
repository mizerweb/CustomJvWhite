package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class bf4 {
    public final boolean a;
    public final double b;
    public final double c;

    public bf4(boolean z, Double d, Double d2) {
        double dDoubleValue = d != null ? d.doubleValue() : 0.01d;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 48000.0d;
        this.a = z;
        this.b = dDoubleValue;
        this.c = dDoubleValue2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf4)) {
            return false;
        }
        bf4 bf4Var = (bf4) obj;
        return this.a == bf4Var.a && Double.compare(this.b, bf4Var.b) == 0 && Double.compare(this.c, bf4Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + tfb.a(Boolean.hashCode(this.a) * 31, this.b);
    }

    public final String toString() {
        return "Config(isEnabled=" + this.a + ", maxLoss=" + this.b + ", minBandwidth=" + this.c + ")";
    }
}
