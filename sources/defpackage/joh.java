package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class joh extends ViewGroup implements eph {
    public static final /* synthetic */ zv8[] f = {new z8b(joh.class, "themeName", "getThemeName()Ljava/lang/String;"), zo5.e(zfe.a, joh.class, "patternDrawable", "getPatternDrawable()Landroid/graphics/drawable/Drawable;")};
    public final ioh a;
    public final GradientDrawable b;
    public final ioh c;
    public final goh d;
    public final kw3 e;

    public joh(Context context) {
        super(context);
        this.a = new ioh(pq3.j.l(this).c, this, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BL_TR);
        gradientDrawable.setColors((int[]) getTheme().C().a.f);
        this.b = gradientDrawable;
        this.c = new ioh(gradientDrawable, this, 1);
        goh gohVar = new goh(context);
        gohVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.d = gohVar;
        kw3 kw3Var = new kw3();
        this.e = kw3Var;
        setOutlineProvider(kw3Var);
        setBackground(gradientDrawable);
        addView(gohVar);
    }

    public final kbc getTheme() {
        Context context = getContext();
        a8g a8gVar = pq3.j;
        nbc nbcVarA = ((mbc) a8gVar.e(context).d).a(getThemeName());
        return nbcVarA != null ? nbcVarA.a : a8gVar.e(getContext()).m();
    }

    public final Drawable getPatternDrawable() {
        zv8 zv8Var = f[1];
        return (Drawable) this.c.b;
    }

    public final String getThemeName() {
        zv8 zv8Var = f[0];
        return (String) this.a.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        goh gohVar = this.d;
        int measuredWidth = ((i3 - i) - gohVar.getMeasuredWidth()) / 2;
        int measuredHeight = ((i4 - i2) - gohVar.getMeasuredHeight()) / 2;
        gohVar.layout(measuredWidth, measuredHeight, gohVar.getMeasuredWidth() + measuredWidth, gohVar.getMeasuredHeight() + measuredHeight);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.d, i, i2);
        setMeasuredDimension(View.resolveSize(View.MeasureSpec.getSize(i), i), View.resolveSize(View.MeasureSpec.getSize(i2), i2));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.b.setColors((int[]) getTheme().C().a.f);
        invalidate();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        kw3 kw3Var = this.e;
        boolean z = y <= ((float) kw3Var.b);
        boolean z2 = motionEvent.getY() >= ((float) (getMeasuredHeight() - kw3Var.c));
        if (z || z2) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setBackgroundPattern(Drawable drawable) {
        setBackground(drawable);
    }

    public final void setIconLayout(foh fohVar) {
        this.d.setLayout(fohVar);
    }

    public final void setPatternDrawable(Drawable drawable) {
        this.c.B(this, f[1], drawable);
    }

    public final void setThemeName(String str) {
        this.a.B(this, f[0], str);
    }
}
