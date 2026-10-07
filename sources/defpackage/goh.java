package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class goh extends View {
    public foh a;

    public static void a(Canvas canvas, Drawable drawable, float f) {
        float fExactCenterX = drawable.getBounds().exactCenterX();
        float fExactCenterY = drawable.getBounds().exactCenterY();
        int iSave = canvas.save();
        canvas.rotate(f, fExactCenterX, fExactCenterY);
        try {
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        foh fohVar = this.a;
        if (fohVar == null) {
            return;
        }
        RectF rectF = fohVar.d;
        int iSave = canvas.save();
        try {
            canvas.translate(((canvas.getWidth() - rectF.width()) / 2.0f) - rectF.left, ((canvas.getHeight() - rectF.height()) / 2.0f) - rectF.top);
            canvas.rotate(-5.56f, rectF.centerX(), rectF.centerY());
            canvas.drawPath(fohVar.c, fohVar.a);
            if (fohVar.g) {
                a(canvas, fohVar.h, 8.0f);
                a(canvas, fohVar.i, 14.0f);
            }
            fohVar.b.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        foh fohVar = this.a;
        if (fohVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        float f = fohVar.j;
        RectF rectF = fohVar.d;
        float f2 = f * 2.0f;
        float fWidth = rectF.width() + f2;
        float fHeight = rectF.height() + f2;
        setMeasuredDimension(View.resolveSize((int) Math.ceil((fHeight * 0.0969f) + (fWidth * 0.9953f)), i), View.resolveSize((int) Math.ceil((fHeight * 0.9953f) + (fWidth * 0.0969f)), i2));
    }

    public final void setLayout(foh fohVar) {
        this.a = fohVar;
        if (fohVar.g) {
            Drawable drawable = fohVar.h;
            RectF rectF = fohVar.d;
            float f = rectF.left;
            float f2 = fohVar.j;
            float f3 = fohVar.k;
            float f4 = rectF.top;
            float f5 = fohVar.l;
            drawable.setBounds((int) ((f - f2) + f3), (int) ((f4 - f2) - f5), (int) (f + f2 + f3), (int) ((f4 + f2) - f5));
            Drawable drawable2 = fohVar.i;
            float f6 = fohVar.e;
            float f7 = fohVar.m;
            float f8 = fohVar.n;
            float f9 = fohVar.f;
            float f10 = fohVar.o;
            drawable2.setBounds((int) ((f6 - f7) + f8), (int) ((f9 - f7) + f10), (int) (f6 + f7 + f8), (int) (f9 + f7 + f10));
        }
        requestLayout();
        invalidate();
    }
}
