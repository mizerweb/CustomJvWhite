package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class tbc extends Drawable {
    public static final /* synthetic */ zv8[] d = {new z8b(tbc.class, "position", "getPosition()F"), zo5.e(zfe.a, tbc.class, "colors", "getColors()Lone/me/sdk/uikit/common/views/switchcompat/SwitchHelper$ThumbColors;")};
    public final sbc b;
    public final sbc a = new sbc(this);
    public final Paint c = new Paint(1);

    public tbc(xeh xehVar) {
        this.b = new sbc(xehVar, this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        int i;
        Rect bounds = getBounds();
        int iK = gm0.K(20.0f * yl5.d().getDisplayMetrics().density);
        int iK2 = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
        zv8[] zv8VarArr = d;
        boolean z2 = false;
        zv8 zv8Var = zv8VarArr[0];
        sbc sbcVar = this.a;
        float fC = lk.c(iK, ((Number) sbcVar.b).floatValue(), iK2);
        float fB = zo5.b(5.0f, yl5.d().getDisplayMetrics().density, bounds.left);
        float f = r5a.f(5.0f, yl5.d().getDisplayMetrics().density, 2, bounds.width()) - fC;
        zv8 zv8Var2 = zv8VarArr[0];
        float f2 = fC / 2.0f;
        float fFloatValue = (((Number) sbcVar.b).floatValue() * f) + fB + f2;
        float fCenterY = bounds.centerY();
        int[] state = getState();
        int length = state.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            } else {
                if (state[i2] == 16842910) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        for (int i3 : getState()) {
            if (i3 == 16842912) {
                z2 = true;
                break;
            }
        }
        sbc sbcVar2 = this.b;
        if (!z) {
            zv8 zv8Var3 = zv8VarArr[1];
            i = ((xeh) sbcVar2.b).b;
        } else if (z2) {
            zv8 zv8Var4 = zv8VarArr[1];
            ((xeh) sbcVar2.b).getClass();
            i = -1;
        } else {
            zv8 zv8Var5 = zv8VarArr[1];
            i = ((xeh) sbcVar2.b).a;
        }
        Paint paint = this.c;
        paint.setColor(i);
        canvas.drawCircle(fFloatValue, fCenterY, f2, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
