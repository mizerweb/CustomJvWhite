package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class f59 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final TextPaint f;
    public final Paint g;
    public final Paint h;
    public final Drawable i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final float m;
    public final float n;
    public float o;
    public StaticLayout p;

    public f59(Context context, float f) {
        float f2 = 52.0f * f;
        this.a = f2;
        float f3 = 16.0f * f;
        this.b = f3;
        this.c = f3;
        float f4 = 24.0f * f;
        this.d = f4;
        float f5 = 8.0f * f;
        this.e = f5;
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(f * 20.0f);
        textPaint.setTypeface(h9i.a(context, Typeface.create("roboto", 0), 600));
        this.f = textPaint;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.g = paint;
        Paint paint2 = new Paint(1);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        this.h = paint2;
        Drawable drawableP = wk8.p(context, R.drawable.icon_link);
        this.i = drawableP;
        this.j = new RectF(0.0f, 0.0f, f4, f4);
        this.k = new RectF();
        this.l = new RectF();
        this.m = (f2 - f4) / 2.0f;
        this.n = f3 + f4 + f5;
        int i = (int) f4;
        drawableP.setBounds(0, 0, i, i);
    }

    public final void a(Canvas canvas) {
        RectF rectF = this.j;
        StaticLayout staticLayout = this.p;
        if (staticLayout == null) {
            return;
        }
        float f = this.b;
        canvas.drawRoundRect(this.l, f, f, this.g);
        int iSave = canvas.save();
        canvas.translate(this.c, this.m);
        try {
            int iSaveLayer = canvas.saveLayer(rectF, null);
            this.i.draw(canvas);
            canvas.drawRect(rectF, this.h);
            canvas.restoreToCount(iSaveLayer);
            canvas.restoreToCount(iSave);
            float f2 = this.o;
            int iSave2 = canvas.save();
            canvas.translate(this.n, f2);
            try {
                staticLayout.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave2);
            }
        } catch (Throwable th) {
            canvas.restoreToCount(iSave);
            throw th;
        }
    }

    public final void b(g59 g59Var, RectF rectF) {
        l59 l59Var = g59Var.d;
        CharSequence charSequence = g59Var.c;
        if (charSequence == null) {
            charSequence = g59Var.b;
        }
        float f = g59Var.e;
        float f2 = this.c;
        float f3 = ((f - (4.0f * f2)) - this.d) - this.e;
        TextPaint textPaint = this.f;
        StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, (int) Math.ceil(Math.min(Layout.getDesiredWidth(charSequence, textPaint), f3))).setIncludePad(false).setMaxLines(1).setEllipsize(TextUtils.TruncateAt.END).build();
        this.p = staticLayoutBuild;
        float lineWidth = staticLayoutBuild.getLineWidth(0);
        float f4 = this.n;
        float f5 = lineWidth + f4;
        RectF rectF2 = this.l;
        float f6 = this.a;
        rectF2.set(0.0f, 0.0f, f2 + f5, f6);
        rectF.set(rectF2);
        float height = (f6 - staticLayoutBuild.getHeight()) / 2.0f;
        this.o = height;
        float height2 = staticLayoutBuild.getHeight() + height;
        RectF rectF3 = this.k;
        rectF3.set(f4, height, f5, height2);
        l59Var.a.a(this.g, rectF2);
        l59Var.b.a(textPaint, rectF3);
        l59Var.c.a(this.h, this.j);
    }
}
