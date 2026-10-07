package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nge extends Drawable implements eph {
    public final Paint a = new Paint();
    public final Drawable b;
    public int c;
    public float d;

    public nge(Context context) {
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
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fCenterX = getBounds().centerX();
        float fCenterY = getBounds().centerY();
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.a;
        paint.setStyle(style);
        paint.setColor(this.c);
        canvas.drawCircle(fCenterX, fCenterY, this.d, paint);
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
        this.d = Math.min(rect.width(), rect.height()) / 2.0f;
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setTint(kbcVar.getIcon().b);
        }
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
