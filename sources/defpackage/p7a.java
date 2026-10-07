package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class p7a extends View implements eph {
    public final int a;
    public final int b;
    public final float c;
    public final Drawable d;
    public final ny8 e;

    public p7a(Context context) {
        super(context);
        int iK = gm0.K(yl5.d().getDisplayMetrics().density * 16.0f);
        this.a = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
        this.b = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        this.c = yl5.d().getDisplayMetrics().density * 16.0f;
        Drawable drawableMutate = getContext().getDrawable(R.drawable.icon_gif_fill_mini).mutate();
        drawableMutate.setBounds(0, 0, iK, iK);
        drawableMutate.setTint(getDrawableColor());
        this.d = drawableMutate;
        this.e = rx8.P(3, new bh9(23));
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setTranslationZ(Float.MAX_VALUE);
    }

    private final int getBackgroundColor() {
        return pq3.j.h(this).h().i;
    }

    private final Paint getBackgroundPaint() {
        return (Paint) this.e.getValue();
    }

    private final int getDrawableColor() {
        pq3.j.h(this);
        return -1;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        getBackgroundPaint().setColor(getBackgroundColor());
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float f = this.c;
        canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, f, f, getBackgroundPaint());
        float f2 = this.b;
        float f3 = this.a;
        int iSave = canvas.save();
        canvas.translate(f2, f3);
        try {
            this.d.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Drawable drawable = this.d;
        setMeasuredDimension((this.b * 2) + drawable.getBounds().width(), (this.a * 2) + drawable.getBounds().height());
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.d.setTint(getDrawableColor());
    }
}
