package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes2.dex */
public final class axf extends Drawable implements eph {
    public final Drawable a;
    public final Drawable b;
    public final int c;
    public final fic d;
    public final fic e;

    public axf(Drawable drawable, Drawable drawable2, kbc kbcVar, int i, fic ficVar, fic ficVar2) {
        this.a = drawable;
        this.b = drawable2;
        this.c = i;
        this.d = ficVar;
        this.e = ficVar2;
        sb8.m0(((Number) ficVar.invoke(kbcVar)).intValue(), drawable);
        sb8.m0(((Number) ficVar2.invoke(kbcVar)).intValue(), drawable2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.a.draw(canvas);
        Drawable drawable = this.b;
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
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.a.setBounds(rect);
        int i = this.c;
        this.b.setBounds(0, 0, i, i);
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        fic ficVar = this.d;
        if (ficVar != null) {
            sb8.m0(((Number) ficVar.invoke(kbcVar)).intValue(), this.a);
        }
        fic ficVar2 = this.e;
        if (ficVar2 != null) {
            sb8.m0(((Number) ficVar2.invoke(kbcVar)).intValue(), this.b);
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
