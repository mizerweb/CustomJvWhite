package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class iy9 {
    public static final iy9 f = new iy9(new hy9());
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        String str = vqi.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
    }

    public iy9(hy9 hy9Var) {
        long j2 = hy9Var.a;
        long j3 = hy9Var.b;
        long j4 = hy9Var.c;
        float f2 = hy9Var.d;
        float f3 = hy9Var.e;
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = f2;
        this.e = f3;
    }

    public static iy9 b(Bundle bundle) {
        hy9 hy9Var = new hy9();
        iy9 iy9Var = f;
        hy9Var.a = bundle.getLong(g, iy9Var.a);
        hy9Var.b = bundle.getLong(h, iy9Var.b);
        hy9Var.c = bundle.getLong(i, iy9Var.c);
        hy9Var.d = bundle.getFloat(j, iy9Var.d);
        hy9Var.e = bundle.getFloat(k, iy9Var.e);
        return new iy9(hy9Var);
    }

    public final hy9 a() {
        hy9 hy9Var = new hy9();
        hy9Var.a = this.a;
        hy9Var.b = this.b;
        hy9Var.c = this.c;
        hy9Var.d = this.d;
        hy9Var.e = this.e;
        return hy9Var;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        iy9 iy9Var = f;
        long j2 = iy9Var.a;
        long j3 = this.a;
        if (j3 != j2) {
            bundle.putLong(g, j3);
        }
        long j4 = iy9Var.b;
        long j5 = this.b;
        if (j5 != j4) {
            bundle.putLong(h, j5);
        }
        long j6 = iy9Var.c;
        long j7 = this.c;
        if (j7 != j6) {
            bundle.putLong(i, j7);
        }
        float f2 = iy9Var.d;
        float f3 = this.d;
        if (f3 != f2) {
            bundle.putFloat(j, f3);
        }
        float f4 = iy9Var.e;
        float f5 = this.e;
        if (f5 != f4) {
            bundle.putFloat(k, f5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iy9)) {
            return false;
        }
        iy9 iy9Var = (iy9) obj;
        return this.a == iy9Var.a && this.b == iy9Var.b && this.c == iy9Var.c && this.d == iy9Var.d && this.e == iy9Var.e;
    }

    public final int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        int i2 = ((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.c;
        int i3 = (i2 + ((int) ((j4 >>> 32) ^ j4))) * 31;
        float f2 = this.d;
        int iFloatToIntBits = (i3 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.e;
        return iFloatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0);
    }
}
