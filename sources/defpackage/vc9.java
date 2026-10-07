package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class vc9 implements Serializable {
    public static final vc9 g = new vc9(1.401298464324817E-45d, 1.401298464324817E-45d, 0.0d, 0.0f, 0.0f, 0.0f);
    public final double a;
    public final double b;
    public final double c;
    public final float d;
    public final float e;
    public final float f;

    public vc9(double d, double d2) {
        this.a = d;
        this.b = d2;
        this.c = 0.0d;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vc9.class == obj.getClass()) {
            vc9 vc9Var = (vc9) obj;
            if (Double.compare(vc9Var.a, this.a) == 0 && Double.compare(vc9Var.b, this.b) == 0 && Double.compare(vc9Var.c, this.c) == 0 && Float.compare(vc9Var.d, this.d) == 0 && Float.compare(vc9Var.e, this.e) == 0 && Float.compare(vc9Var.f, this.f) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.a);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.b);
        int i = (((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32))) * 31) + ((int) (jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32)));
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.c);
        int i2 = ((i * 31) + ((int) ((jDoubleToLongBits3 >>> 32) ^ jDoubleToLongBits3))) * 31;
        float f = this.d;
        int iFloatToIntBits = (i2 + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.e;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.f;
        return iFloatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationData{latitude=");
        sb.append(this.a);
        sb.append(", longitude=");
        sb.append(this.b);
        sb.append(", altitude=");
        sb.append(this.c);
        sb.append(", accuracy=");
        c0a.u(sb, this.d, ", bearing=", this.e, ", speed=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }

    public vc9(double d, double d2, double d3, float f, float f2, float f3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = f;
        this.e = f2;
        this.f = f3;
    }
}
