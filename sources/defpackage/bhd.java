package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;

/* JADX INFO: loaded from: classes2.dex */
public final class bhd {
    public Size a;
    public Rect b;
    public int c;
    public Matrix d;
    public int e;
    public boolean f;
    public boolean g;
    public ehd h;

    public final Matrix a(Size size, int i, Rect rect) {
        Matrix matrix = null;
        if (!f()) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        if (f()) {
            matrix = new Matrix(this.d);
            matrix.postConcat(c(i, size));
        }
        matrix.invert(matrix2);
        Matrix matrix3 = new Matrix();
        matrix3.setRectToRect(new RectF(0.0f, 0.0f, rect.width(), rect.height()), new RectF(0.0f, 0.0f, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
        matrix2.postConcat(matrix3);
        return matrix2;
    }

    public final Size b() {
        return y1i.c(this.c) ? new Size(this.b.height(), this.b.width()) : new Size(this.b.width(), this.b.height());
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x007b  */
    /* JADX WARN: Code duplicated, block: B:19:0x007e  */
    public final Matrix c(int i, Size size) {
        Matrix.ScaleToFit scaleToFit;
        RectF rectF;
        qyj.l(null, f());
        if (y1i.d(size, true, b())) {
            rectF = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
        } else {
            RectF rectF2 = new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight());
            Size sizeB = b();
            RectF rectF3 = new RectF(0.0f, 0.0f, sizeB.getWidth(), sizeB.getHeight());
            Matrix matrix = new Matrix();
            ehd ehdVar = this.h;
            int iOrdinal = ehdVar.ordinal();
            if (iOrdinal == 0) {
                scaleToFit = Matrix.ScaleToFit.START;
            } else if (iOrdinal == 1) {
                scaleToFit = Matrix.ScaleToFit.CENTER;
            } else if (iOrdinal == 2) {
                scaleToFit = Matrix.ScaleToFit.END;
            } else if (iOrdinal == 3) {
                scaleToFit = Matrix.ScaleToFit.START;
            } else if (iOrdinal == 4) {
                scaleToFit = Matrix.ScaleToFit.CENTER;
            } else if (iOrdinal != 5) {
                tvj.c("PreviewTransform", "Unexpected crop rect: " + ehdVar);
                scaleToFit = Matrix.ScaleToFit.FILL;
            } else {
                scaleToFit = Matrix.ScaleToFit.END;
            }
            if (ehdVar == ehd.FIT_CENTER || ehdVar == ehd.FIT_START || ehdVar == ehd.FIT_END) {
                matrix.setRectToRect(rectF3, rectF2, scaleToFit);
            } else {
                matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                matrix.invert(matrix);
            }
            matrix.mapRect(rectF3);
            if (i == 1) {
                float width = size.getWidth() / 2.0f;
                float f = width + width;
                rectF = new RectF(f - rectF3.right, rectF3.top, f - rectF3.left, rectF3.bottom);
            } else {
                rectF = rectF3;
            }
        }
        Matrix matrixA = y1i.a(new RectF(this.b), rectF, this.c, false);
        if (this.f && this.g) {
            boolean zC = y1i.c(this.c);
            Rect rect = this.b;
            if (zC) {
                matrixA.preScale(1.0f, -1.0f, rect.centerX(), this.b.centerY());
                return matrixA;
            }
            matrixA.preScale(-1.0f, 1.0f, rect.centerX(), this.b.centerY());
        }
        return matrixA;
    }

    public final Matrix d() {
        qyj.l(null, f());
        RectF rectF = new RectF(0.0f, 0.0f, this.a.getWidth(), this.a.getHeight());
        return y1i.a(rectF, rectF, !this.g ? this.c : -njl.c(this.e), false);
    }

    public final RectF e(int i, Size size) {
        qyj.l(null, f());
        Matrix matrixC = c(i, size);
        RectF rectF = new RectF(0.0f, 0.0f, this.a.getWidth(), this.a.getHeight());
        matrixC.mapRect(rectF);
        return rectF;
    }

    public final boolean f() {
        return (this.b == null || this.a == null || !(!this.g || this.e != -1)) ? false : true;
    }
}
