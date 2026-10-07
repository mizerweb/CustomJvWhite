package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.WeakHashMap;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class is0 extends ProgressBar {
    public final js0 a;
    public int b;
    public boolean c;
    public final boolean d;
    public final int e;
    public zk f;
    public boolean g;
    public int h;
    public final gs0 i;
    public final gs0 j;
    public final hs0 k;
    public final hs0 l;

    public is0(int i, int i2, Context context) {
        super(p90.T(context, null, i, R.style.Widget_MaterialComponents_ProgressIndicator), null, i);
        this.g = false;
        this.h = 4;
        this.i = new gs0(this, 0);
        this.j = new gs0(this, 1);
        this.k = new hs0(this, 0);
        this.l = new hs0(this, 1);
        Context context2 = getContext();
        this.a = a(context2);
        TypedArray typedArrayB = ch3.B(context2, null, k3e.d, i, i2, new int[0]);
        typedArrayB.getInt(6, -1);
        this.e = Math.min(typedArrayB.getInt(4, -1), 1000);
        typedArrayB.recycle();
        this.f = new zk();
        this.d = true;
    }

    private hu5 getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().l;
        }
        if (getProgressDrawable() == null) {
            return null;
        }
        return getProgressDrawable().l;
    }

    public abstract js0 a(Context context);

    public void b(int i, boolean z) {
        if (!isIndeterminate()) {
            super.setProgress(i);
            if (getProgressDrawable() == null || z) {
                return;
            }
            getProgressDrawable().jumpToCurrentState();
            return;
        }
        if (getProgressDrawable() != null) {
            this.b = i;
            this.c = z;
            this.g = true;
            if (getIndeterminateDrawable().isVisible()) {
                zk zkVar = this.f;
                ContentResolver contentResolver = getContext().getContentResolver();
                zkVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().m.j();
                    return;
                }
            }
            this.k.a(getIndeterminateDrawable());
        }
    }

    public final boolean c() {
        WeakHashMap weakHashMap = i7j.a;
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.a.f;
    }

    @Override // android.widget.ProgressBar
    public yc8 getIndeterminateDrawable() {
        return (yc8) super.getIndeterminateDrawable();
    }

    public int[] getIndicatorColor() {
        return this.a.c;
    }

    public int getIndicatorTrackGapSize() {
        return this.a.g;
    }

    @Override // android.widget.ProgressBar
    public dj5 getProgressDrawable() {
        return (dj5) super.getProgressDrawable();
    }

    public int getShowAnimationBehavior() {
        return this.a.e;
    }

    public int getTrackColor() {
        return this.a.d;
    }

    public int getTrackCornerRadius() {
        return this.a.b;
    }

    public int getTrackThickness() {
        return this.a.a;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().m.i(this.k);
        }
        dj5 progressDrawable = getProgressDrawable();
        hs0 hs0Var = this.l;
        if (progressDrawable != null) {
            dj5 progressDrawable2 = getProgressDrawable();
            if (progressDrawable2.f == null) {
                progressDrawable2.f = new ArrayList();
            }
            if (!progressDrawable2.f.contains(hs0Var)) {
                progressDrawable2.f.add(hs0Var);
            }
        }
        if (getIndeterminateDrawable() != null) {
            yc8 indeterminateDrawable = getIndeterminateDrawable();
            if (indeterminateDrawable.f == null) {
                indeterminateDrawable.f = new ArrayList();
            }
            if (!indeterminateDrawable.f.contains(hs0Var)) {
                indeterminateDrawable.f.add(hs0Var);
            }
        }
        if (c()) {
            if (this.e > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.j);
        removeCallbacks(this.i);
        ((xt5) getCurrentDrawable()).c(false, false, false);
        yc8 indeterminateDrawable = getIndeterminateDrawable();
        hs0 hs0Var = this.l;
        if (indeterminateDrawable != null) {
            getIndeterminateDrawable().e(hs0Var);
            getIndeterminateDrawable().m.l();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().e(hs0Var);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        try {
            int iSave = canvas.save();
            if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
            }
            getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(iSave);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        try {
            hu5 currentDrawingDelegate = getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            setMeasuredDimension(currentDrawingDelegate.f() < 0 ? View.getDefaultSize(getSuggestedMinimumWidth(), i) : currentDrawingDelegate.f() + getPaddingLeft() + getPaddingRight(), currentDrawingDelegate.e() < 0 ? View.getDefaultSize(getSuggestedMinimumHeight(), i2) : currentDrawingDelegate.e() + getPaddingTop() + getPaddingBottom());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        boolean z = i == 0;
        if (this.d) {
            ((xt5) getCurrentDrawable()).c(c(), false, z);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.d) {
            ((xt5) getCurrentDrawable()).c(c(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(zk zkVar) {
        this.f = zkVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().c = zkVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().c = zkVar;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.a.f = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        try {
            if (z == isIndeterminate()) {
                return;
            }
            xt5 xt5Var = (xt5) getCurrentDrawable();
            if (xt5Var != null) {
                xt5Var.c(false, false, false);
            }
            super.setIndeterminate(z);
            xt5 xt5Var2 = (xt5) getCurrentDrawable();
            if (xt5Var2 != null) {
                xt5Var2.c(c(), false, false);
            }
            if ((xt5Var2 instanceof yc8) && c()) {
                ((yc8) xt5Var2).m.k();
            }
            this.g = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else if (!(drawable instanceof yc8)) {
            ore.p("Cannot set framework drawable as indeterminate drawable.");
        } else {
            ((xt5) drawable).c(false, false, false);
            super.setIndeterminateDrawable(drawable);
        }
    }

    public void setIndicatorColor(int... iArr) {
        Integer numValueOf;
        if (iArr.length == 0) {
            Context context = getContext();
            TypedValue typedValueS0 = e9i.s0(context, R.attr.colorPrimary);
            if (typedValueS0 != null) {
                int i = typedValueS0.resourceId;
                numValueOf = Integer.valueOf(i != 0 ? context.getColor(i) : typedValueS0.data);
            } else {
                numValueOf = null;
            }
            iArr = new int[]{numValueOf != null ? numValueOf.intValue() : -1};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.a.c = iArr;
        getIndeterminateDrawable().m.g();
        invalidate();
    }

    public void setIndicatorTrackGapSize(int i) {
        js0 js0Var = this.a;
        if (js0Var.g != i) {
            js0Var.g = i;
            js0Var.a();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        b(i, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
            return;
        }
        if (!(drawable instanceof dj5)) {
            ore.p("Cannot set framework drawable as progress drawable.");
            return;
        }
        dj5 dj5Var = (dj5) drawable;
        dj5Var.c(false, false, false);
        super.setProgressDrawable(dj5Var);
        dj5Var.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
    }

    public void setShowAnimationBehavior(int i) {
        this.a.e = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        js0 js0Var = this.a;
        if (js0Var.d != i) {
            js0Var.d = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        js0 js0Var = this.a;
        if (js0Var.b != i) {
            js0Var.b = Math.min(i, js0Var.a / 2);
            invalidate();
        }
    }

    public void setTrackThickness(int i) {
        js0 js0Var = this.a;
        if (js0Var.a != i) {
            js0Var.a = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i == 0 || i == 4 || i == 8) {
            this.h = i;
        } else {
            ore.p("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
    }
}
