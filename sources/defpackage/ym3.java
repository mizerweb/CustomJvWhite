package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.util.Pair;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class ym3 {
    public final RecyclerView a;
    public final zh3 b;
    public final r84 c;
    public final tm3 d;
    public tp3 e;
    public b65 f;
    public AnimatorSet g;
    public boolean h;
    public int i = 1;

    public ym3(k96 k96Var, zh3 zh3Var, r84 r84Var, tm3 tm3Var) {
        this.a = k96Var;
        this.b = zh3Var;
        this.c = r84Var;
        this.d = tm3Var;
    }

    public final void a(tp3 tp3Var) {
        b();
        this.i = 2;
        h(false);
        g();
        f(tp3Var.k(), true);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(tp3Var.k(), 1.0f);
        valueAnimatorOfFloat.setDuration(500L);
        valueAnimatorOfFloat.setInterpolator(mm3.b());
        valueAnimatorOfFloat.addUpdateListener(new um3(tp3Var, true, this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorOfFloat);
        animatorSet.addListener(new wm3(this, animatorSet, 0));
        animatorSet.start();
        this.g = animatorSet;
    }

    public final void b() {
        AnimatorSet animatorSet = this.g;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.g;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.g = null;
        h(true);
    }

    public final void c() {
        RecyclerView recyclerView = this.a;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            xu2 xu2Var = childAt instanceof xu2 ? (xu2) childAt : null;
            if (xu2Var != null) {
                xu2Var.q1 = false;
            }
        }
    }

    public final void d() {
        b();
        c();
        tp3 tp3Var = this.e;
        RecyclerView recyclerView = this.a;
        if (tp3Var != null) {
            recyclerView.o0(tp3Var);
        }
        this.e = null;
        b65 b65Var = this.f;
        if (b65Var != null) {
            recyclerView.q0(b65Var);
        }
        this.f = null;
        recyclerView.X();
        recyclerView.requestLayout();
        recyclerView.invalidate();
        this.i = 1;
    }

    public final Integer e(int i) {
        Object obj = null;
        if (i < 0) {
            return null;
        }
        r84 r84Var = this.c;
        if (i >= r84Var.l()) {
            return null;
        }
        Pair pairG = r84Var.G(i);
        Object obj2 = pairG.second;
        Integer num = (Integer) obj2;
        Object obj3 = pairG.first;
        zh3 zh3Var = this.b;
        if (obj3 == zh3Var) {
            int iL = zh3Var.l();
            int iIntValue = num.intValue();
            if (iIntValue >= 0 && iIntValue < iL) {
                obj = obj2;
            }
        }
        return (Integer) obj;
    }

    public final void f(float f, boolean z) {
        int width;
        RecyclerView recyclerView = this.a;
        if (recyclerView.getChildCount() == 0) {
            return;
        }
        int iK = gm0.K(36.0f * yl5.d().getDisplayMetrics().density);
        int iK2 = gm0.K(oc9.u(f, 0.0f, 1.0f) * iK);
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            xu2 xu2Var = childAt instanceof xu2 ? (xu2) childAt : null;
            if (xu2Var != null && (width = xu2Var.getWidth()) > 0) {
                int i2 = width + iK2;
                if (i2 < 0) {
                    i2 = 0;
                }
                if (z && (i2 = i2 - iK) < 0) {
                    i2 = 0;
                }
                xu2Var.d(i2);
            }
        }
    }

    public final void g() {
        RecyclerView recyclerView = this.a;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            xu2 xu2Var = childAt instanceof xu2 ? (xu2) childAt : null;
            if (xu2Var != null) {
                xu2Var.setMultiselectAnimating(true);
            }
        }
    }

    public final void h(boolean z) {
        vee layoutManager = this.a.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        boolean z2 = this.h;
        if (z) {
            if (z2) {
                linearLayoutManager.h = true;
                this.h = false;
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        linearLayoutManager.h = false;
        this.h = true;
    }
}
