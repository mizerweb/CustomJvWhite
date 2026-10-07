package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class ox5 extends View {
    public static final /* synthetic */ zv8[] g;
    public final zb a;
    public final Path b;
    public final Paint c;
    public final RectF d;
    public final Matrix e;
    public final Path f;

    static {
        z8b z8bVar = new z8b(ox5.class, "strokeWidthPx", "getStrokeWidthPx()F");
        zfe.a.getClass();
        g = new zv8[]{z8bVar};
    }

    public ox5(Context context) {
        super(context, null);
        this.a = new zb(Float.valueOf(yl5.d().getDisplayMetrics().density * 2.0f), 12, this);
        Path pathR = qyj.r("M1.22941 89.0036C0.460484 89.7346 0.0169656 90.7388 0.00055933 91.7996C-0.0160875 92.8603 0.395731 93.8906 1.14128 94.6598C1.88683 95.4289 2.90385 95.8726 3.96447 95.889C5.02533 95.9057 6.04289 95.4937 6.79745 94.7479C6.79745 94.7479 6.79745 94.7479 6.79745 94.7479C14.1912 87.5205 22.1676 80.1604 30.0367 73.1407C61.073 46.5739 93.0139 17.3059 131.746 5.72021C138.088 4.35618 144.902 4.19956 149.853 7.59567C154.137 10.2698 154.867 15.4253 153.258 20.5714C145.277 41.3804 127.436 58.0901 111.975 74.9993C94.0464 94.8411 72.536 112.222 61.1099 137.86C59.4044 142.435 59.9244 149.405 64.9517 152.419C69.9215 155.909 76.2832 156.184 81.7733 155.074C121.802 142.891 147.607 107.513 184.261 92.4779C188.413 91.2205 192.95 90.6938 196.322 92.9559C202.014 96.0842 201.74 103.389 198.427 108.823C190.616 122.196 177.94 132.218 168.515 145.035C166.771 147.514 165.047 150.19 164.182 153.311C163.124 156.398 164.36 160.579 167.303 162.335C167.303 162.335 167.303 162.335 167.303 162.335C171.048 164.993 175.647 166.454 180.228 166.366C191.513 165.977 200.971 159.113 208.379 151.525C208.466 151.427 208.513 151.299 208.508 151.167C208.503 151.036 208.447 150.912 208.351 150.822C208.255 150.733 208.128 150.685 207.996 150.688C207.865 150.692 207.74 150.748 207.648 150.842C207.648 150.842 207.648 150.842 207.648 150.842C200.102 157.949 190.57 164.281 180.216 164.451C176.007 164.47 171.901 163.137 168.449 160.696C168.449 160.696 168.449 160.696 168.449 160.696C163.266 157.5 166.883 150.68 170.143 146.197C179.313 133.679 192.01 123.713 200.184 109.778C201.762 106.831 203.185 103.567 203.102 99.9176C203.089 96.2314 200.702 92.7841 197.826 90.7965C193.465 87.6267 187.859 88.2561 183.396 89.6053C145.217 105.422 119.376 140.645 81.2011 152.129C76.1127 153.148 70.7518 152.828 66.6509 149.947C62.9319 147.609 62.5389 143.046 63.9745 138.752C74.5361 114.895 96.2615 96.7409 114.149 77.067C129.692 59.921 147.802 44.4668 157.088 21.7248C159.16 16.2036 158.389 7.76175 152.408 3.97364C145.911 -0.710266 137.697 -0.504692 130.753 0.819756C89.0283 12.5064 57.2201 41.326 25.1711 67.5754C17.0801 74.5233 8.95945 81.7374 1.22941 89.0036Z");
        this.b = pathR;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(yl5.d().getDisplayMetrics().density * 2.0f);
        this.c = paint;
        this.d = new RectF();
        this.e = new Matrix();
        this.f = new Path(pathR);
    }

    private static /* synthetic */ void getSvgPathData$annotations() {
    }

    public final float getStrokeWidthPx() {
        zv8 zv8Var = g[0];
        return ((Number) this.a.b).floatValue();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = this.b;
        RectF rectF = this.d;
        path.computeBounds(rectF, true);
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        float width = (getWidth() - getPaddingRight()) - paddingLeft;
        float height = (getHeight() - getPaddingBottom()) - paddingTop;
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        Matrix matrix = this.e;
        matrix.reset();
        Paint paint = this.c;
        if (fWidth > 0.0f && fHeight > 0.0f) {
            float fMin = Math.min((width - paint.getStrokeWidth()) / fWidth, (height - paint.getStrokeWidth()) / fHeight);
            matrix.setTranslate(-rectF.left, -rectF.top);
            matrix.postScale(fMin, fMin);
            matrix.postTranslate(((width - (fWidth * fMin)) / 2.0f) + paddingLeft, ((height - (fHeight * fMin)) / 2.0f) + paddingTop);
        }
        Path path2 = this.f;
        path.transform(matrix, path2);
        canvas.drawPath(path2, paint);
    }

    public final void setStrokeWidthPx(float f) {
        this.a.B(this, g[0], Float.valueOf(f));
    }
}
