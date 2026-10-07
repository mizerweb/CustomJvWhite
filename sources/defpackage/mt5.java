package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class mt5 extends View implements eph {
    public final Paint a;
    public final RectF b;
    public float c;
    public kbc d;

    public mt5(Context context) {
        super(context);
        this.a = new Paint();
        this.b = new RectF();
        onThemeChanged(pq3.j.h(this));
        setClickable(false);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 49));
    }

    public final kbc getCustomTheme() {
        return this.d;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = this.c;
        canvas.drawRoundRect(this.b, f, f, this.a);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        float f = yl5.d().getDisplayMetrics().density * 40.0f;
        float f2 = yl5.d().getDisplayMetrics().density * 4.0f;
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, f, f2);
        this.c = rectF.centerY();
        setMeasuredDimension((int) rectF.width(), (int) rectF.height());
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        kbc kbcVar2 = this.d;
        if (kbcVar2 != null) {
            kbcVar = kbcVar2;
        }
        this.a.setColor(kbcVar.getIcon().e);
        invalidate();
    }

    public final void setCustomTheme(kbc kbcVar) {
        if (kbcVar != null) {
            onThemeChanged(kbcVar);
        }
        this.d = kbcVar;
    }
}
