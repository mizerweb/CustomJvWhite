package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class rk0 extends Drawable implements eph {
    public final Drawable a;
    public final dwb b;
    public final cf7 c;
    public final cf7 d;
    public final Paint e;
    public final ny8 f;

    public rk0(Drawable drawable, dwb dwbVar, kbc kbcVar, cf7 cf7Var, cf7 cf7Var2) {
        Paint paint;
        this.a = drawable;
        this.b = dwbVar;
        this.c = cf7Var;
        this.d = cf7Var2;
        if (cf7Var2 != null) {
            paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(((Number) cf7Var2.invoke(kbcVar)).intValue());
        } else {
            paint = null;
        }
        this.e = paint;
        ny8 ny8VarP = rx8.P(3, new b6(10));
        this.f = ny8VarP;
        if ((dwbVar instanceof cwb) && paint != null) {
            jxf.a((Path) ny8VarP.getValue(), 2.8d, getBounds());
        }
        if (cf7Var != null) {
            drawable.setTint(((Number) cf7Var.invoke(kbcVar)).intValue());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.e;
        if (paint != null) {
            dwb dwbVar = this.b;
            if (dwbVar instanceof awb) {
                canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), getBounds().width() / 2.0f, paint);
            } else if (dwbVar instanceof cwb) {
                canvas.drawPath((Path) this.f.getValue(), paint);
            } else if (!cqk.d(dwbVar, bwb.a)) {
                ore.o();
                return;
            }
        }
        Drawable drawable = this.a;
        float fWidth = drawable.getBounds().width() / 2.0f;
        float fExactCenterX = getBounds().exactCenterX() - fWidth;
        float fExactCenterY = getBounds().exactCenterY() - fWidth;
        int iSave = canvas.save();
        canvas.translate(fExactCenterX, fExactCenterY);
        try {
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        dwb dwbVar = this.b;
        boolean z = dwbVar instanceof cwb;
        Drawable drawable = this.a;
        Paint paint = this.e;
        if (z) {
            jxf.a((Path) this.f.getValue(), 2.8d, rect);
        } else if (dwbVar instanceof bwb) {
            int iMin = Math.min(rect.width(), rect.height());
            if (paint != null) {
                kwb.r1.getClass();
                iMin = ghb.j(iMin);
            }
            drawable.setBounds(0, 0, iMin, iMin);
        }
        int iMin2 = Math.min(rect.width(), rect.height());
        if (paint != null) {
            kwb.r1.getClass();
            iMin2 = ghb.j(iMin2);
        }
        drawable.setBounds(0, 0, iMin2, iMin2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        cf7 cf7Var;
        Paint paint = this.e;
        if (paint != null && (cf7Var = this.d) != null) {
            paint.setColor(((Number) cf7Var.invoke(kbcVar)).intValue());
        }
        Drawable drawable = this.a;
        cf7 cf7Var2 = this.c;
        if (cf7Var2 != null) {
            drawable.setTint(((Number) cf7Var2.invoke(kbcVar)).intValue());
        }
        if (paint == null && cf7Var2 == null) {
            eph ephVar = drawable instanceof eph ? (eph) drawable : null;
            if (ephVar != null) {
                ephVar.onThemeChanged(kbcVar);
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
