package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class on1 extends FrameLayout implements wy1 {
    public int a;
    public final /* synthetic */ CallIndicatorWidget b;
    public final /* synthetic */ ViewGroup c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on1(CallIndicatorWidget callIndicatorWidget, ViewGroup viewGroup, Context context) {
        super(context);
        this.b = callIndicatorWidget;
        this.c = viewGroup;
        this.a = getTopInset();
        setId(R.id.call_indicator_panel_container);
        setBackground(new ColorDrawable(0));
        View view = new View(getContext());
        view.setId(R.id.call_indicator_panel_fake);
        view.setBackground(new ColorDrawable(pq3.j.l(view).b.b().c));
        addView(view, new ViewGroup.LayoutParams(-1, zo5.D(8.0f, yl5.d().getDisplayMetrics().density, zo5.b(64.0f, yl5.d().getDisplayMetrics().density, this.a))));
        zv8[] zv8VarArr = CallIndicatorWidget.g;
        addView(callIndicatorWidget.p1());
    }

    private final int getTopInset() {
        Integer numL = n7j.l(this.c);
        if (numL != null) {
            return numL.intValue();
        }
        return 0;
    }

    @Override // defpackage.wy1
    public final void b(boolean z) {
        CallIndicatorWidget callIndicatorWidget = this.b;
        CallIndicatorWidget.o1(callIndicatorWidget, true);
        int iK = gm0.K(64.0f * yl5.d().getDisplayMetrics().density) + getTopInset();
        if (callIndicatorWidget.p1().getHeight() != iK) {
            hn1 hn1VarP1 = callIndicatorWidget.p1();
            ViewGroup.LayoutParams layoutParams = hn1VarP1.getLayoutParams();
            if (layoutParams == null) {
                ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            } else {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.height = iK;
                hn1VarP1.setLayoutParams(marginLayoutParams);
            }
        }
        callIndicatorWidget.p1().b(true);
    }

    @Override // defpackage.wy1
    public final void c(boolean z) {
        CallIndicatorWidget callIndicatorWidget = this.b;
        CallIndicatorWidget.o1(callIndicatorWidget, true);
        callIndicatorWidget.p1().c(z);
    }

    @Override // defpackage.wy1
    public final void l(c79 c79Var, final boolean z, long j) {
        zv8[] zv8VarArr = CallIndicatorWidget.g;
        final CallIndicatorWidget callIndicatorWidget = this.b;
        callIndicatorWidget.p1().l(c79Var, z, j);
        int iK = gm0.K(64.0f * yl5.d().getDisplayMetrics().density) + getTopInset();
        int i = f55.o(callIndicatorWidget.p1().getContext()).a - iK;
        int i2 = z ? i : iK;
        if (!z) {
            iK = i;
        }
        hn1 hn1VarP1 = callIndicatorWidget.p1();
        ik ikVar = new ik("height", i2);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt((Object) null, ikVar, i2, iK);
        objectAnimatorOfInt.setDuration(j);
        objectAnimatorOfInt.addUpdateListener(new mk(hn1VarP1, 0, ikVar));
        c79Var.add(objectAnimatorOfInt);
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt((Object) null, new ik("backgroundChange", 0), 0);
        objectAnimatorOfInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: nn1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CallIndicatorWidget.o1(callIndicatorWidget, z);
            }
        });
        c79Var.add(objectAnimatorOfInt2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        CallIndicatorWidget callIndicatorWidget = this.b;
        j8e j8eVar = callIndicatorWidget.e;
        super.onLayout(z, i, i2, i3, i4);
        int topInset = getTopInset();
        if (topInset != this.a) {
            this.a = topInset;
            int iB = zo5.b(64.0f, yl5.d().getDisplayMetrics().density, topInset);
            int iD = zo5.D(8.0f, yl5.d().getDisplayMetrics().density, zo5.b(64.0f, yl5.d().getDisplayMetrics().density, topInset));
            zv8[] zv8VarArr = CallIndicatorWidget.g;
            if (callIndicatorWidget.p1().getHeight() != iB) {
                hn1 hn1VarP1 = callIndicatorWidget.p1();
                ViewGroup.LayoutParams layoutParams = hn1VarP1.getLayoutParams();
                if (layoutParams == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.height = iB;
                    hn1VarP1.setLayoutParams(marginLayoutParams);
                }
            }
            zv8[] zv8VarArr2 = CallIndicatorWidget.g;
            if (((View) j8eVar.m(callIndicatorWidget, zv8VarArr2[1])).getHeight() != iD) {
                View view = (View) j8eVar.m(callIndicatorWidget, zv8VarArr2[1]);
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (layoutParams2 == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.height = iD;
                view.setLayoutParams(marginLayoutParams2);
            }
        }
    }
}
