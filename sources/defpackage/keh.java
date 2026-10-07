package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class keh extends gr4 {
    public final yk d;
    public final String e;

    public keh(yk ykVar) {
        this.d = ykVar;
        this.e = keh.class.getName();
    }

    @Override // defpackage.gr4
    public final void a() {
        this.d.a();
    }

    @Override // defpackage.gr4
    public final void f(gr4 gr4Var, br4 br4Var) {
        this.d.f(gr4Var, br4Var);
    }

    @Override // defpackage.gr4
    public final void g(ViewGroup viewGroup, View view, View view2, boolean z, er4 er4Var) {
        je9 je9Var = je9.d;
        boolean z2 = view2 != null && view2.getHeight() > 0 && view2.getWidth() > 0;
        if (view == null && !z && z2) {
            String str = this.e;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Already swiped controller manually, skip performChange", null);
            }
            er4Var.a();
            return;
        }
        if (view != null || !z) {
            this.d.g(viewGroup, view, view2, z, er4Var);
            return;
        }
        String str2 = this.e;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "Showing controller without animation", null);
        }
        new r7g(true).g(viewGroup, view, view2, z, er4Var);
    }

    @Override // defpackage.gr4
    public final void h(Bundle bundle) {
        yk ykVar = this.d;
        if (ykVar instanceof no9) {
            Bundle bundle2 = new Bundle();
            long j = bundle.getLong("SWH.b");
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            bundle2.putLong("AnimatorChangeHandler.duration", i);
            bundle2.putBoolean("AnimatorChangeHandler.removesFromViewOnPush", i2 == 1);
            bundle = bundle2;
        }
        ykVar.h(bundle);
    }

    @Override // defpackage.gr4
    public final void i(Bundle bundle) {
        yk ykVar = this.d;
        if (!(ykVar instanceof no9)) {
            ykVar.i(bundle);
        } else {
            no9 no9Var = (no9) ykVar;
            bundle.putLong("SWH.b", bj8.a((int) no9Var.d, no9Var.j ? 1 : 0));
        }
    }

    public static final class a extends yk {
        public static final /* synthetic */ int l = 0;
        public final Integer k;

        public a(Integer num) {
            super(200L, true);
            this.k = num;
        }

        @Override // defpackage.yk
        public final Animator l(final ViewGroup viewGroup, final View view, final View view2, final boolean z, boolean z2) {
            ValueAnimator valueAnimatorOfFloat = z ? ValueAnimator.ofFloat(1.0f, 0.0f) : ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ieh
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i = keh.a.l;
                    boolean z3 = z;
                    View view3 = view;
                    View view4 = view2;
                    View view5 = z3 ? view3 : view4;
                    View view6 = z3 ? view4 : view3;
                    ViewGroup viewGroup2 = viewGroup;
                    ksk.b(viewGroup2, view5, view6, viewGroup2.findViewById(R.id.swipe_fade), ((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
                }
            });
            valueAnimatorOfFloat.addListener(new jeh(viewGroup, z, view2, view, this));
            valueAnimatorOfFloat.addListener(new li(19, viewGroup));
            return valueAnimatorOfFloat;
        }

        @Override // defpackage.yk
        public final void n(View view) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }

        public a() {
            this(null);
        }
    }

    public keh() {
        this(0);
    }

    public /* synthetic */ keh(int i) {
        this(new no9(1, true));
    }
}
