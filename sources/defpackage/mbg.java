package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes2.dex */
public final class mbg extends Drawable implements Animatable, eph {
    public final Context a;
    public final xk1 b;
    public int f;
    public int g;
    public boolean i;
    public float j;
    public final Integer[] c = {3, 1, 2};
    public final Paint d = new Paint(1);
    public final RectF e = new RectF();
    public final rda h = new rda(13, this);

    public mbg(Context context, kbc kbcVar, xk1 xk1Var) {
        this.a = context;
        this.b = xk1Var;
        onThemeChanged(kbcVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float fWidth = bounds.width() / 2.0f;
        float fHeight = bounds.height() / 2.0f;
        int i = this.f;
        Integer[] numArr = this.c;
        float length = fWidth - ((((numArr.length - 1) * gm0.K(yl5.d().getDisplayMetrics().density * 2.0f)) + (i * numArr.length)) / 2);
        int length2 = numArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            int i4 = i3 + 1;
            int iIntValue = numArr[i2].intValue();
            float fK = ((gm0.K(yl5.d().getDisplayMetrics().density * 2.0f) + this.f) * i3) + length;
            RectF rectF = this.e;
            rectF.left = fK;
            int i5 = this.g;
            rectF.top = fHeight - (i5 / 2);
            rectF.right = fK + this.f;
            rectF.bottom = (i5 / 2) + fHeight;
            float fHeight2 = rectF.height() * Math.max(0.5f, (((float) Math.sin(this.j + ((numArr.length - iIntValue) + 1))) + 1.0f) / 2.0f);
            canvas.drawRoundRect(rectF.left, fHeight - fHeight2, rectF.right, fHeight + fHeight2, yl5.d().getDisplayMetrics().density * 4.0f, yl5.d().getDisplayMetrics().density * 4.0f, this.d);
            i2++;
            i3 = i4;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iK = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        Integer[] numArr = this.c;
        this.f = (int) (((iWidth - ((numArr.length - 1) * iK)) / numArr.length) * 0.7f);
        this.g = (int) (bounds.height() * 0.5f);
        invalidateSelf();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.d.setColor(((Number) this.b.invoke(pq3.j.k(this.a).b)).intValue());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (z) {
            start();
        } else {
            stop();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.i) {
            return;
        }
        this.i = true;
        scheduleSelf(this.h, SystemClock.uptimeMillis() + 3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.i) {
            this.i = false;
            unscheduleSelf(this.h);
        }
    }
}
