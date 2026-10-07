package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ydb extends Drawable implements eph {
    public final Paint a = new Paint();
    public final Drawable b;
    public int c;
    public int d;
    public float e;
    public float f;
    public float g;
    public final int h;
    public final int i;

    public ydb(Context context) {
        Drawable drawable = context.getDrawable(R.drawable.icon_camera_open);
        a8g a8gVar = pq3.j;
        if (drawable != null) {
            drawable.setTint(c0a.h(a8gVar, context).b);
            drawable.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 45.0f), gm0.K(45.0f * yl5.d().getDisplayMetrics().density));
        } else {
            drawable = null;
        }
        this.b = drawable;
        this.c = a8gVar.e(context).m().h().b;
        this.d = c0a.h(a8gVar, context).b;
        this.h = gm0.K(6.0f * yl5.d().getDisplayMetrics().density);
        this.i = gm0.K(3.0f * yl5.d().getDisplayMetrics().density);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 30.0f);
        valueAnimatorOfFloat.addUpdateListener(new ak(20, this));
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(4400L);
        valueAnimatorOfFloat.start();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fCenterX = getBounds().centerX();
        float fCenterY = getBounds().centerY();
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.a;
        paint.setStyle(style);
        paint.setColor(this.c);
        canvas.drawCircle(fCenterX, fCenterY, this.e, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.i);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(this.d);
        for (int i = 0; i < 12; i++) {
            float f = this.f;
            canvas.drawArc(fCenterX - f, fCenterY - f, fCenterX + f, fCenterY + f, (i * 30.0f) + this.g, 15.0f, false, paint);
        }
        Drawable drawable = this.b;
        if (drawable != null) {
            float fWidth = (getBounds().width() - drawable.getBounds().width()) / 2.0f;
            float fHeight = (getBounds().height() - drawable.getBounds().height()) / 2.0f;
            int iSave = canvas.save();
            canvas.translate(fWidth, fHeight);
            try {
                drawable.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float fMin = Math.min(rect.width(), rect.height()) / 2.0f;
        this.e = fMin;
        this.f = fMin - this.h;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setTint(kbcVar.getIcon().b);
        }
        this.d = kbcVar.getIcon().b;
        this.c = kbcVar.h().b;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        super.setTint(i);
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setTint(i);
        }
    }
}
