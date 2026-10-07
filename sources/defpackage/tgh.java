package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class tgh extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public ValueAnimator a;
    public final /* synthetic */ xgh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tgh(xgh xghVar, Context context) {
        super(context);
        this.b = xghVar;
        setWillNotDraw(false);
    }

    public final void a(int i) {
        xgh xghVar = this.b;
        if (xghVar.o1 == 0 || (xghVar.getTabSelectedIndicator().getBounds().left == -1 && xghVar.getTabSelectedIndicator().getBounds().right == -1)) {
            View childAt = getChildAt(i);
            gp0 gp0Var = xghVar.H;
            Drawable drawable = xghVar.o;
            gp0Var.getClass();
            RectF rectFB = gp0.b(xghVar, childAt);
            drawable.setBounds((int) rectFB.left, drawable.getBounds().top, (int) rectFB.right, drawable.getBounds().bottom);
            xghVar.a = i;
        }
    }

    public final void b(int i) {
        xgh xghVar = this.b;
        Rect bounds = xghVar.o.getBounds();
        xghVar.o.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    public final void c(View view, View view2, float f) {
        xgh xghVar = this.b;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = xghVar.o;
            drawable.setBounds(-1, drawable.getBounds().top, -1, xghVar.o.getBounds().bottom);
        } else {
            xghVar.H.m(xghVar, view, view2, f, xghVar.o);
        }
        WeakHashMap weakHashMap = i7j.a;
        postInvalidateOnAnimation();
    }

    public final void d(int i, int i2, boolean z) {
        xgh xghVar = this.b;
        if (xghVar.a == i) {
            return;
        }
        View childAt = getChildAt(xghVar.getSelectedTabPosition());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            a(xghVar.getSelectedTabPosition());
            return;
        }
        xghVar.a = i;
        lq lqVar = new lq(this, childAt, childAt2, 1);
        if (!z) {
            this.a.removeAllUpdateListeners();
            this.a.addUpdateListener(lqVar);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.a = valueAnimator;
        valueAnimator.setInterpolator(xghVar.I);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(lqVar);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        xgh xghVar = this.b;
        int iHeight = xghVar.o.getBounds().height();
        if (iHeight < 0) {
            iHeight = xghVar.o.getIntrinsicHeight();
        }
        int i = xghVar.A;
        if (i == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                iHeight = i != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - iHeight) / 2;
            iHeight = (getHeight() + iHeight) / 2;
        }
        if (xghVar.o.getBounds().width() > 0) {
            Rect bounds = xghVar.o.getBounds();
            xghVar.o.setBounds(bounds.left, height, bounds.right, iHeight);
            xghVar.o.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.a;
        xgh xghVar = this.b;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(xghVar.getSelectedTabPosition(), -1, false);
            return;
        }
        if (xghVar.a == -1) {
            xghVar.a = xghVar.getSelectedTabPosition();
        }
        a(xghVar.a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        xgh xghVar = this.b;
        boolean z = true;
        if (xghVar.y == 1 || xghVar.B == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) e9i.J(getContext(), 16)) * 2)) {
                boolean z2 = false;
                for (int i4 = 0; i4 < childCount; i4++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i4).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z2 = true;
                    }
                }
                z = z2;
            } else {
                xghVar.y = 0;
                xghVar.p(false);
            }
            if (z) {
                super.onMeasure(i, i2);
            }
        }
    }
}
