package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public final class s36 {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public s36(Context context) {
        Integer numValueOf;
        Integer numValueOf2;
        boolean zT0 = e9i.t0(R.attr.elevationOverlayEnabled, context, false);
        TypedValue typedValueS0 = e9i.s0(context, R.attr.elevationOverlayColor);
        Integer numValueOf3 = null;
        if (typedValueS0 != null) {
            int i = typedValueS0.resourceId;
            numValueOf = Integer.valueOf(i != 0 ? context.getColor(i) : typedValueS0.data);
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        TypedValue typedValueS1 = e9i.s0(context, R.attr.elevationOverlayAccentColor);
        if (typedValueS1 != null) {
            int i2 = typedValueS1.resourceId;
            numValueOf2 = Integer.valueOf(i2 != 0 ? context.getColor(i2) : typedValueS1.data);
        } else {
            numValueOf2 = null;
        }
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
        TypedValue typedValueS2 = e9i.s0(context, R.attr.colorSurface);
        if (typedValueS2 != null) {
            int i3 = typedValueS2.resourceId;
            numValueOf3 = Integer.valueOf(i3 != 0 ? context.getColor(i3) : typedValueS2.data);
        }
        int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : 0;
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = zT0;
        this.b = iIntValue;
        this.c = iIntValue2;
        this.d = iIntValue3;
        this.e = f2;
    }

    public final int a(int i, float f2) {
        int i2;
        if (!this.a || mx3.e(i, 255) != this.d) {
            return i;
        }
        float f3 = this.e;
        float fMin = (f3 <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / f3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iK = qyj.K(mx3.e(i, 255), fMin, this.b);
        if (fMin > 0.0f && (i2 = this.c) != 0) {
            iK = mx3.c(mx3.e(i2, f), iK);
        }
        return mx3.e(iK, iAlpha);
    }
}
