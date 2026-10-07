package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes4.dex */
public final class y19 extends is0 {
    @Override // defpackage.is0
    public final js0 a(Context context) {
        z19 z19Var = new z19(R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, context);
        ch3.d(context, null, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr = k3e.o;
        ch3.f(context, null, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        z19Var.h = typedArrayObtainStyledAttributes.getInt(0, 1);
        z19Var.i = typedArrayObtainStyledAttributes.getInt(1, 0);
        z19Var.k = Math.min(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, 0), z19Var.a);
        typedArrayObtainStyledAttributes.recycle();
        z19Var.a();
        z19Var.j = z19Var.i == 1;
        return z19Var;
    }

    @Override // defpackage.is0
    public final void b(int i, boolean z) {
        js0 js0Var = this.a;
        if (js0Var != null && ((z19) js0Var).h == 0 && isIndeterminate()) {
            return;
        }
        super.b(i, z);
    }

    public int getIndeterminateAnimationType() {
        return ((z19) this.a).h;
    }

    public int getIndicatorDirection() {
        return ((z19) this.a).i;
    }

    public int getTrackStopIndicatorSize() {
        return ((z19) this.a).k;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        js0 js0Var = this.a;
        z19 z19Var = (z19) js0Var;
        boolean z2 = true;
        if (((z19) js0Var).i != 1) {
            WeakHashMap weakHashMap = i7j.a;
            if ((getLayoutDirection() != 1 || ((z19) js0Var).i != 2) && (getLayoutDirection() != 0 || ((z19) js0Var).i != 3)) {
                z2 = false;
            }
        }
        z19Var.j = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        yc8 indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        dj5 progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        js0 js0Var = this.a;
        if (((z19) js0Var).h == i) {
            return;
        }
        if (c() && isIndeterminate()) {
            ore.k("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        ((z19) js0Var).h = i;
        ((z19) js0Var).a();
        if (i == 0) {
            yc8 indeterminateDrawable = getIndeterminateDrawable();
            q19 q19Var = new q19((z19) js0Var);
            indeterminateDrawable.m = q19Var;
            q19Var.a = indeterminateDrawable;
        } else {
            yc8 indeterminateDrawable2 = getIndeterminateDrawable();
            s19 s19Var = new s19(getContext(), (z19) js0Var);
            indeterminateDrawable2.m = s19Var;
            s19Var.a = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // defpackage.is0
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((z19) this.a).a();
    }

    public void setIndicatorDirection(int i) {
        js0 js0Var = this.a;
        ((z19) js0Var).i = i;
        z19 z19Var = (z19) js0Var;
        boolean z = true;
        if (i != 1) {
            WeakHashMap weakHashMap = i7j.a;
            if ((getLayoutDirection() != 1 || ((z19) js0Var).i != 2) && (getLayoutDirection() != 0 || i != 3)) {
                z = false;
            }
        }
        z19Var.j = z;
        invalidate();
    }

    @Override // defpackage.is0
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((z19) this.a).a();
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        js0 js0Var = this.a;
        if (((z19) js0Var).k != i) {
            ((z19) js0Var).k = Math.min(i, ((z19) js0Var).a);
            ((z19) js0Var).a();
            invalidate();
        }
    }
}
