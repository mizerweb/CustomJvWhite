package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class cqh extends View implements eph {
    public static final /* synthetic */ zv8[] j = {new z8b(cqh.class, "themeName", "getThemeName()Ljava/lang/String;"), zo5.e(zfe.a, cqh.class, "patternDrawable", "getPatternDrawable()Landroid/graphics/drawable/Drawable;")};
    public final bqh a;
    public final GradientDrawable b;
    public final bqh c;
    public final Paint d;
    public final Paint e;
    public final RectF f;
    public final RectF g;
    public LinearGradient h;
    public LinearGradient i;

    public cqh(Context context) {
        super(context);
        this.a = new bqh(pq3.j.l(this).c, this, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 10.0f);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
        gradientDrawable.setColors((int[]) getTheme().C().a.f);
        this.b = gradientDrawable;
        this.c = new bqh(gradientDrawable, this, 1);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(yl5.d().getDisplayMetrics().density * 1.0f);
        paint.setColor(getTheme().B().b);
        this.d = paint;
        this.e = new Paint(1);
        this.f = new RectF();
        this.g = new RectF();
        setBackground(gradientDrawable);
        setClipToOutline(true);
        setOutlineProvider(new b7(4, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kbc getTheme() {
        Context context = getContext();
        a8g a8gVar = pq3.j;
        nbc nbcVarA = ((mbc) a8gVar.e(context).d).a(getThemeName());
        pq3 pq3VarE = a8gVar.e(getContext());
        return nbcVarA != null ? f55.l(nbcVarA, pq3VarE.n()) : pq3VarE.m();
    }

    public final void b() {
        float f = yl5.d().getDisplayMetrics().density * 8.0f;
        float f2 = yl5.d().getDisplayMetrics().density * 30.0f;
        float f3 = (yl5.d().getDisplayMetrics().density * 48.0f) + f;
        float f4 = (yl5.d().getDisplayMetrics().density * 24.0f) + f2;
        int[] incomingColors = getIncomingColors();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.h = new LinearGradient(f3, f2, f, f4, incomingColors, (float[]) null, tileMode);
        float f5 = yl5.d().getDisplayMetrics().density * 16.0f;
        this.i = new LinearGradient((yl5.d().getDisplayMetrics().density * 48.0f) + f5, (yl5.d().getDisplayMetrics().density * 4.0f) + f4, f5, getHeight() - (yl5.d().getDisplayMetrics().density * 30.0f), getOutgoingColors(), (float[]) null, tileMode);
    }

    public final int[] getIncomingColors() {
        return ((xac) getTheme().f().a).a.n.a;
    }

    public final int[] getOutgoingColors() {
        return ((xac) getTheme().f().b).a.n.a;
    }

    public final Drawable getPatternDrawable() {
        zv8 zv8Var = j[1];
        return (Drawable) this.c.b;
    }

    public final String getThemeName() {
        zv8 zv8Var = j[0];
        return (String) this.a.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f = (isSelected() ? yl5.d().getDisplayMetrics().density * 4.0f : yl5.d().getDisplayMetrics().density * 1.0f) / 2.0f;
        canvas.drawRoundRect(f, f, getWidth() - f, getHeight() - f, (yl5.d().getDisplayMetrics().density * 10.0f) - f, (yl5.d().getDisplayMetrics().density * 10.0f) - f, this.d);
        float f2 = yl5.d().getDisplayMetrics().density * 8.0f;
        float f3 = yl5.d().getDisplayMetrics().density * 30.0f;
        float f4 = (yl5.d().getDisplayMetrics().density * 48.0f) + (yl5.d().getDisplayMetrics().density * 8.0f);
        float f5 = (yl5.d().getDisplayMetrics().density * 24.0f) + (yl5.d().getDisplayMetrics().density * 30.0f);
        RectF rectF = this.f;
        rectF.set(f2, f3, f4, f5);
        LinearGradient linearGradient = this.h;
        Paint paint = this.e;
        paint.setShader(linearGradient);
        canvas.drawRoundRect(rectF, yl5.d().getDisplayMetrics().density * 8.0f, yl5.d().getDisplayMetrics().density * 8.0f, paint);
        float f6 = yl5.d().getDisplayMetrics().density * 16.0f;
        float f7 = (yl5.d().getDisplayMetrics().density * 4.0f) + rectF.bottom;
        float f8 = (yl5.d().getDisplayMetrics().density * 48.0f) + (yl5.d().getDisplayMetrics().density * 16.0f);
        float height = getHeight() - (yl5.d().getDisplayMetrics().density * 30.0f);
        RectF rectF2 = this.g;
        rectF2.set(f6, f7, f8, height);
        paint.setShader(this.i);
        canvas.drawRoundRect(rectF2, yl5.d().getDisplayMetrics().density * 8.0f, yl5.d().getDisplayMetrics().density * 8.0f, paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(gm0.K(72.0f * yl5.d().getDisplayMetrics().density), gm0.K(112.0f * yl5.d().getDisplayMetrics().density));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        b();
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.d.setColor(isSelected() ? getTheme().b().b : getTheme().B().b);
        this.b.setColors((int[]) getTheme().C().a.f);
        b();
        invalidate();
    }

    public final void setBackgroundPattern(Drawable drawable) {
        setBackground(drawable);
    }

    public final void setPatternDrawable(Drawable drawable) {
        this.c.B(this, j[1], drawable);
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        Paint paint = this.d;
        if (z) {
            paint.setColor(getTheme().b().b);
            paint.setStrokeWidth(yl5.d().getDisplayMetrics().density * 4.0f);
        } else {
            paint.setColor(getTheme().B().b);
            paint.setStrokeWidth(yl5.d().getDisplayMetrics().density * 1.0f);
        }
        super.setSelected(z);
    }

    public final void setThemeName(String str) {
        this.a.B(this, j[0], str);
    }
}
