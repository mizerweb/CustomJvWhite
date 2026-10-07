package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class t6c extends View {
    public Drawable a;
    public final int b;

    public t6c(Context context) {
        super(context);
        this.b = gm0.K(24.0f * yl5.d().getDisplayMetrics().density);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.b;
        setMeasuredDimension(i3, i3);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public final void setReaction(Drawable drawable) {
        Drawable drawableMutate;
        Drawable drawableNewDrawable;
        if (drawable == null && getVisibility() == 8) {
            return;
        }
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState == null || (drawableNewDrawable = constantState.newDrawable()) == null || (drawableMutate = drawableNewDrawable.mutate()) == null) {
                drawableMutate = drawable.mutate();
            }
            drawableMutate.setCallback(this);
            if (getWidth() > 0 && getHeight() > 0) {
                drawableMutate.setBounds(0, 0, getWidth(), getHeight());
            }
            this.a = drawableMutate;
            setVisibility(0);
        } else {
            this.a = null;
            setVisibility(8);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.a || super.verifyDrawable(drawable);
    }
}
