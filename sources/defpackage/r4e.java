package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.Checkable;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class r4e extends TextView implements Checkable {
    public final GradientDrawable a;
    public boolean b;

    public r4e(Context context) {
        super(context, null, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(yl5.d().getDisplayMetrics().density * 20.0f);
        this.a = gradientDrawable;
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(((bs0) pq3.j.h(this).u().c.g).c), gradientDrawable, null);
        setPadding(gm0.K(yl5.d().getDisplayMetrics().density * 12.0f), gm0.K(yl5.d().getDisplayMetrics().density * 10.0f), gm0.K(12.0f * yl5.d().getDisplayMetrics().density), gm0.K(10.0f * yl5.d().getDisplayMetrics().density));
        setClickable(true);
        setFocusable(true);
        setBackground(rippleDrawable);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.b;
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.b) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, new int[]{R.attr.state_checked});
        }
        return iArrOnCreateDrawableState;
    }

    public final void setBackgroundColors(ColorStateList colorStateList) {
        this.a.setTintList(colorStateList);
        refreshDrawableState();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        this.b = z;
        refreshDrawableState();
    }

    public final void setTextColors(ColorStateList colorStateList) {
        setTextColor(colorStateList);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.b = !this.b;
    }
}
