package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes2.dex */
public final class l59 extends Enum {
    public static final l59 d;
    public static final /* synthetic */ l59[] e;
    public final l29 a;
    public final l29 b;
    public final l29 c;

    static {
        l59 l59Var = new l59("BLUE_ON_WHITE", 0, 30);
        d = l59Var;
        l59 l59Var2 = new l59("FANCY", 1, 28);
        l59 l59Var3 = new l59("TRANSLUCENT_WHITE", 2, 28);
        l59 l59Var4 = new l59("WHITE_ON_BLACK", 3, 30);
        l59 l59Var5 = new l59("BLACK_ON_WHITE", 4, 30);
        final int i = -6595338;
        final float f = 0.0f;
        final int i2 = -13730570;
        l29 l29Var = new l29(i2, f, i) { // from class: j29
            public final int a;
            public final int b;
            public final float c;

            {
                this.a = i2;
                this.b = i;
                this.c = f;
            }

            @Override // defpackage.l29
            public final void a(Paint paint, RectF rectF) {
                double radians = Math.toRadians(this.c);
                float fCos = (float) Math.cos(radians);
                float fSin = (float) Math.sin(radians);
                float fAbs = Math.abs((rectF.height() / 2.0f) * fSin) + Math.abs((rectF.width() / 2.0f) * fCos);
                float fCenterX = rectF.centerX();
                float fCenterY = rectF.centerY();
                float f2 = fCos * fAbs;
                float f3 = fSin * fAbs;
                paint.setShader(new LinearGradient(fCenterX - f2, fCenterY - f3, fCenterX + f2, fCenterY + f3, this.a, this.b, Shader.TileMode.CLAMP));
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j29)) {
                    return false;
                }
                j29 j29Var = (j29) obj;
                return this.a == j29Var.a && this.b == j29Var.b && Float.compare(this.c, j29Var.c) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.c) + zo5.c(this.b, Integer.hashCode(this.a) * 31, 31);
            }

            public final String toString() {
                StringBuilder sbP = qv1.p("Gradient(startColor=", this.a, ", endColor=", this.b, ", angleDegrees=");
                sbP.append(this.c);
                sbP.append(")");
                return sbP.toString();
            }
        };
        final int i3 = -65281;
        final float f2 = 90.0f;
        final int i4 = -16776961;
        l29 l29Var2 = new l29(i4, f2, i3) { // from class: j29
            public final int a;
            public final int b;
            public final float c;

            {
                this.a = i4;
                this.b = i3;
                this.c = f2;
            }

            @Override // defpackage.l29
            public final void a(Paint paint, RectF rectF) {
                double radians = Math.toRadians(this.c);
                float fCos = (float) Math.cos(radians);
                float fSin = (float) Math.sin(radians);
                float fAbs = Math.abs((rectF.height() / 2.0f) * fSin) + Math.abs((rectF.width() / 2.0f) * fCos);
                float fCenterX = rectF.centerX();
                float fCenterY = rectF.centerY();
                float f3 = fCos * fAbs;
                float f4 = fSin * fAbs;
                paint.setShader(new LinearGradient(fCenterX - f3, fCenterY - f4, fCenterX + f3, fCenterY + f4, this.a, this.b, Shader.TileMode.CLAMP));
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j29)) {
                    return false;
                }
                j29 j29Var = (j29) obj;
                return this.a == j29Var.a && this.b == j29Var.b && Float.compare(this.c, j29Var.c) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.c) + zo5.c(this.b, Integer.hashCode(this.a) * 31, 31);
            }

            public final String toString() {
                StringBuilder sbP = qv1.p("Gradient(startColor=", this.a, ", endColor=", this.b, ", angleDegrees=");
                sbP.append(this.c);
                sbP.append(")");
                return sbP.toString();
            }
        };
        final int i5 = -16711681;
        final float f3 = 270.0f;
        final int i6 = -16711936;
        e = new l59[]{l59Var, l59Var2, l59Var3, l59Var4, l59Var5, new l59("SUPER_FANCY", 5, l29Var, l29Var2, new l29(i6, f3, i5) { // from class: j29
            public final int a;
            public final int b;
            public final float c;

            {
                this.a = i6;
                this.b = i5;
                this.c = f3;
            }

            @Override // defpackage.l29
            public final void a(Paint paint, RectF rectF) {
                double radians = Math.toRadians(this.c);
                float fCos = (float) Math.cos(radians);
                float fSin = (float) Math.sin(radians);
                float fAbs = Math.abs((rectF.height() / 2.0f) * fSin) + Math.abs((rectF.width() / 2.0f) * fCos);
                float fCenterX = rectF.centerX();
                float fCenterY = rectF.centerY();
                float f4 = fCos * fAbs;
                float f5 = fSin * fAbs;
                paint.setShader(new LinearGradient(fCenterX - f4, fCenterY - f5, fCenterX + f4, fCenterY + f5, this.a, this.b, Shader.TileMode.CLAMP));
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j29)) {
                    return false;
                }
                j29 j29Var = (j29) obj;
                return this.a == j29Var.a && this.b == j29Var.b && Float.compare(this.c, j29Var.c) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.c) + zo5.c(this.b, Integer.hashCode(this.a) * 31, 31);
            }

            public final String toString() {
                StringBuilder sbP = qv1.p("Gradient(startColor=", this.a, ", endColor=", this.b, ", angleDegrees=");
                sbP.append(this.c);
                sbP.append(")");
                return sbP.toString();
            }
        }), new l59("BIMBO", 6, 28), new l59("SELLING_BUTTON", 7, 28), new l59("ECO", 8, 30)};
    }

    public /* synthetic */ l59(String str, int i, int i2) {
        this(str, i, xhc.a, xhc.b, xhc.c);
    }

    public static l59 valueOf(String str) {
        return (l59) Enum.valueOf(l59.class, str);
    }

    public static l59[] values() {
        return (l59[]) e.clone();
    }

    public l59(String str, int i, l29 l29Var, l29 l29Var2, l29 l29Var3) {
        super(str, i);
        this.a = l29Var;
        this.b = l29Var2;
        this.c = l29Var3;
    }
}
