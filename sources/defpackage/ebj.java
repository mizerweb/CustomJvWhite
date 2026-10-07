package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import one.me.vpnconnectedwarning.VpnConnectedWarningBottomSheet;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ebj extends Drawable implements eph {
    public final float a = yl5.d().getDisplayMetrics().density * 38.0f;
    public final RectF b = new RectF();
    public final Paint c = new Paint();
    public final Drawable d;
    public int e;

    public ebj(VpnConnectedWarningBottomSheet vpnConnectedWarningBottomSheet) {
        Drawable drawable = vpnConnectedWarningBottomSheet.getContext().getDrawable(R.drawable.icon_weak_signal);
        a8g a8gVar = pq3.j;
        if (drawable != null) {
            drawable.setTint(a8gVar.e(vpnConnectedWarningBottomSheet.getContext()).m().getIcon().h);
            drawable.setBounds(0, 0, gm0.K(yl5.d().getDisplayMetrics().density * 36.0f), gm0.K(36.0f * yl5.d().getDisplayMetrics().density));
        } else {
            drawable = null;
        }
        this.d = drawable;
        this.e = tre.I0(a8gVar.e(vpnConnectedWarningBottomSheet.getContext()).m().h().a, 0.16f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint.Style style = Paint.Style.FILL;
        Paint paint = this.c;
        paint.setStyle(style);
        paint.setColor(this.e);
        RectF rectF = this.b;
        float f = this.a;
        canvas.drawRoundRect(rectF, f, f, paint);
        Drawable drawable = this.d;
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
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.b.set(rect);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setTint(kbcVar.getIcon().h);
        }
        this.e = tre.I0(kbcVar.h().a, 0.16f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setAlpha(getAlpha());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setColorFilter(getColorFilter());
        }
    }
}
