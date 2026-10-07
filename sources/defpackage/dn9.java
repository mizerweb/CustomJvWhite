package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public final class dn9 extends FrameLayout {
    public final GradientDrawable a;
    public final cs b;

    public dn9(Context context) {
        super(context, null);
        float f = yl5.d().getDisplayMetrics().density * 20.0f;
        GradientDrawable gradientDrawableU = qyj.U(null, null, null, new float[]{f, f, f, f, f, f, f, f});
        this.a = gradientDrawableU;
        cs csVar = new cs(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        csVar.setLayoutParams(layoutParams);
        this.b = csVar;
        setBackground(gradientDrawableU);
        setLayoutParams(new ViewGroup.LayoutParams(gm0.K(yl5.d().getDisplayMetrics().density * 24.0f), gm0.K(24.0f * yl5.d().getDisplayMetrics().density)));
        csVar.setForegroundGravity(17);
    }

    @Override // android.view.View
    public Drawable getBackground() {
        Drawable background = super.getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        return gradientDrawable != null ? gradientDrawable : this.a;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable instanceof GradientDrawable) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.a.setColor(ColorStateList.valueOf(i));
    }

    public final void setIcon(int i) {
        setIcon(getContext().getDrawable(i).mutate());
    }

    public final void setIconColor(int i) {
        this.b.setImageTintList(ColorStateList.valueOf(i));
    }

    public final void setIcon(Drawable drawable) {
        cs csVar = this.b;
        csVar.setImageDrawable(drawable);
        addView(csVar);
    }
}
