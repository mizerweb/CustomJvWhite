package defpackage;

import android.util.Range;
import android.util.Size;

/* JADX INFO: loaded from: classes4.dex */
public final class yi0 {
    public static final Range h = new Range(0, 0);
    public final Size a;
    public final Size b;
    public final fx5 c;
    public final int d;
    public final Range e;
    public final t94 f;
    public final boolean g;

    public yi0(Size size, Size size2, fx5 fx5Var, int i, Range range, t94 t94Var, boolean z) {
        this.a = size;
        this.b = size2;
        this.c = fx5Var;
        this.d = i;
        this.e = range;
        this.f = t94Var;
        this.g = z;
    }

    public static tw5 a(Size size) {
        tw5 tw5Var = new tw5();
        if (size == null) {
            ore.n("Null resolution");
            return null;
        }
        tw5Var.a = size;
        tw5Var.b = size;
        tw5Var.d = 0;
        Range range = h;
        if (range == null) {
            ore.n("Null expectedFrameRateRange");
            return null;
        }
        tw5Var.e = range;
        tw5Var.c = fx5.d;
        tw5Var.g = Boolean.FALSE;
        return tw5Var;
    }

    public final tw5 b() {
        tw5 tw5Var = new tw5();
        tw5Var.a = this.a;
        tw5Var.b = this.b;
        tw5Var.c = this.c;
        tw5Var.d = Integer.valueOf(this.d);
        tw5Var.e = this.e;
        tw5Var.f = this.f;
        tw5Var.g = Boolean.valueOf(this.g);
        return tw5Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yi0) {
            yi0 yi0Var = (yi0) obj;
            if (this.a.equals(yi0Var.a) && this.b.equals(yi0Var.b) && this.c.equals(yi0Var.c) && this.d == yi0Var.d && this.e.equals(yi0Var.e)) {
                t94 t94Var = yi0Var.f;
                t94 t94Var2 = this.f;
                if (t94Var2 != null ? t94Var2.equals(t94Var) : t94Var == null) {
                    if (this.g == yi0Var.g) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        t94 t94Var = this.f;
        return (this.g ? 1231 : 1237) ^ ((iHashCode ^ (t94Var == null ? 0 : t94Var.hashCode())) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamSpec{resolution=");
        sb.append(this.a);
        sb.append(", originalConfiguredResolution=");
        sb.append(this.b);
        sb.append(", dynamicRange=");
        sb.append(this.c);
        sb.append(", sessionType=");
        sb.append(this.d);
        sb.append(", expectedFrameRateRange=");
        sb.append(this.e);
        sb.append(", implementationOptions=");
        sb.append(this.f);
        sb.append(", zslDisabled=");
        return qt4.r(sb, this.g, "}");
    }
}
