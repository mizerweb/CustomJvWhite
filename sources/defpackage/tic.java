package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class tic extends t97 {
    public final Matrix e;
    public final int f;
    public final int g;
    public final Matrix h;
    public final RectF i;

    public tic(BitmapDrawable bitmapDrawable, int i, int i2) {
        super(bitmapDrawable);
        this.e = new Matrix();
        this.f = i - (i % 90);
        this.g = (i2 < 0 || i2 > 8) ? 0 : i2;
        this.h = new Matrix();
        this.i = new RectF();
    }

    @Override // defpackage.t97, defpackage.x1i
    public final void c(Matrix matrix) {
        n(matrix);
        Matrix matrix2 = this.e;
        if (matrix2.isIdentity()) {
            return;
        }
        matrix.preConcat(matrix2);
    }

    @Override // defpackage.t97, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        if (this.f <= 0 && ((i = this.g) == 0 || i == 1)) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.concat(this.e);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // defpackage.t97, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.g;
        return (i == 5 || i == 7 || this.f % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // defpackage.t97, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.g;
        return (i == 5 || i == 7 || this.f % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // defpackage.t97, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.a;
        if (drawable == null) {
            return;
        }
        int i = this.g;
        int i2 = this.f;
        if (i2 <= 0 && (i == 0 || i == 1)) {
            drawable.setBounds(rect);
            return;
        }
        Matrix matrix = this.e;
        if (i == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i == 7) {
            matrix.setRotate(270.0f, rect.centerX(), rect.centerY());
            matrix.postScale(-1.0f, 1.0f);
        } else if (i == 4) {
            matrix.setScale(1.0f, -1.0f);
        } else if (i != 5) {
            matrix.setRotate(i2, rect.centerX(), rect.centerY());
        } else {
            matrix.setRotate(270.0f, rect.centerX(), rect.centerY());
            matrix.postScale(1.0f, -1.0f);
        }
        Matrix matrix2 = this.h;
        matrix2.reset();
        matrix.invert(matrix2);
        RectF rectF = this.i;
        rectF.set(rect);
        matrix2.mapRect(rectF);
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
