package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class w0c extends FrameLayout implements eph {
    public final v0c a;
    public final ImageView b;
    public kbc c;

    public w0c(Context context) {
        super(context);
        v0c v0cVar = new v0c(context);
        v0cVar.setBackground(null);
        this.a = v0cVar;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        setClipChildren(false);
        addView(v0cVar);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 32.0f), gm0.K(32.0f * yl5.d().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        addView(imageView, layoutParams);
        float f = yl5.d().getDisplayMetrics().density * 20.0f;
        Drawable drawableU = qyj.U(null, null, null, new float[]{f, f, f, f, f, f, f, f});
        getCurrentTheme().b();
        sb8.m0(-1728053248, drawableU);
        setBackground(drawableU);
        setPaddingRelative(gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f), gm0.K(6.0f * yl5.d().getDisplayMetrics().density), gm0.K(yl5.d().getDisplayMetrics().density * 6.0f));
    }

    private final kbc getCurrentTheme() {
        kbc kbcVar = this.c;
        return kbcVar == null ? pq3.j.h(this) : kbcVar;
    }

    public final kbc getCustomTheme() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView = this.b;
        boolean z2 = imageView.getVisibility() == 0;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int paddingStart = (measuredWidth - getPaddingStart()) - getPaddingEnd();
        int paddingTop = (measuredHeight - getPaddingTop()) - getPaddingBottom();
        v0c v0cVar = this.a;
        int measuredWidth2 = v0cVar.getMeasuredWidth();
        int measuredHeight2 = v0cVar.getMeasuredHeight();
        int measuredWidth3 = z2 ? imageView.getMeasuredWidth() : 0;
        int measuredHeight3 = z2 ? imageView.getMeasuredHeight() : 0;
        if (!z2) {
            measuredWidth3 = 0;
        }
        int paddingLeft = ((paddingStart - (measuredWidth3 + measuredWidth2)) / 2) + getPaddingLeft();
        qyj.M(v0cVar, paddingLeft, ((paddingTop / 2) + getPaddingTop()) - (measuredHeight2 / 2), 0, 12);
        if (z2) {
            qyj.M(imageView, zo5.D(6.0f, yl5.d().getDisplayMetrics().density, paddingLeft + measuredWidth2), (measuredHeight - measuredHeight3) / 2, 0, 12);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int size = View.MeasureSpec.getSize(i) - paddingRight;
        int size2 = View.MeasureSpec.getSize(i2) - paddingBottom;
        if (size < 0) {
            size = 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        if (size2 < 0) {
            size2 = 0;
        }
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE);
        v0c v0cVar = this.a;
        measureChild(v0cVar, iMakeMeasureSpec, iMakeMeasureSpec2);
        ImageView imageView = this.b;
        boolean z = imageView.getVisibility() == 0;
        if (imageView.getVisibility() == 0) {
            measureChild(imageView, iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        int measuredWidth = v0cVar.getMeasuredWidth();
        int measuredHeight = v0cVar.getMeasuredHeight();
        setMeasuredDimension(View.resolveSize(measuredWidth + paddingRight + (z ? zo5.D(6.0f, yl5.d().getDisplayMetrics().density, z ? imageView.getMeasuredWidth() : 0) : 0), i), View.resolveSize(Math.max(measuredHeight, z ? imageView.getMeasuredHeight() : 0) + paddingBottom, i2));
    }

    @Override // defpackage.eph
    public final void onThemeChanged(kbc kbcVar) {
        this.a.onThemeChanged(getCurrentTheme());
    }

    public final void setCounter(Number number) {
        pu4.c(this.a, number, false, 6);
    }

    public final void setCustomTheme(kbc kbcVar) {
        this.c = kbcVar;
    }

    public final void setEndDrawable(Drawable drawable) {
        ImageView imageView = this.b;
        imageView.setImageDrawable(drawable);
        imageView.setVisibility(drawable != null ? 0 : 8);
        invalidate();
        requestLayout();
    }

    public final void setNumberFormat(cf7 cf7Var) {
        this.a.setNumberFormatter(cf7Var);
    }

    public final void setTypography(noh nohVar) {
        this.a.setTypography(nohVar);
        invalidate();
    }
}
