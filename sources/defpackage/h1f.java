package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class h1f extends t97 {
    public cqk e;
    public int f;
    public int g;
    public Matrix h;
    public final Matrix i;

    public h1f(Drawable drawable, cqk cqkVar) {
        super(drawable);
        this.i = new Matrix();
        this.e = cqkVar;
    }

    @Override // defpackage.t97, defpackage.x1i
    public final void c(Matrix matrix) {
        n(matrix);
        Drawable drawable = this.a;
        if (drawable != null && (this.f != drawable.getIntrinsicWidth() || this.g != drawable.getIntrinsicHeight())) {
            p();
        }
        Matrix matrix2 = this.h;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
    }

    @Override // defpackage.t97, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null && (this.f != drawable.getIntrinsicWidth() || this.g != drawable.getIntrinsicHeight())) {
            p();
        }
        if (this.h == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.h);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // defpackage.t97
    public final Drawable o(Drawable drawable) {
        Drawable drawableO = super.o(drawable);
        p();
        return drawableO;
    }

    @Override // defpackage.t97, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        p();
    }

    public final void p() {
        Drawable drawable = this.a;
        if (drawable == null) {
            this.g = 0;
            this.f = 0;
            this.h = null;
            return;
        }
        Rect bounds = getBounds();
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        this.f = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.g = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(bounds);
            this.h = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            drawable.setBounds(bounds);
            this.h = null;
            return;
        }
        if (this.e == i1f.o) {
            drawable.setBounds(bounds);
            this.h = null;
            return;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        Matrix matrix = this.i;
        matrix.reset();
        cqk cqkVar = this.e;
        cqkVar.getClass();
        cqkVar.v(matrix, bounds, intrinsicWidth, intrinsicHeight, 0.5f, 0.5f, bounds.width() / intrinsicWidth, bounds.height() / intrinsicHeight);
        this.h = matrix;
    }

    public final void q(cqk cqkVar) {
        if (qdl.b(this.e, cqkVar)) {
            return;
        }
        this.e = cqkVar;
        p();
        invalidateSelf();
    }
}
