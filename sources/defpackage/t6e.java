package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t6e implements jda {
    public final v6e a;
    public final List b;
    public final boolean c;
    public final int d;
    public final vx9 e;
    public final ww8 f;
    public final msa g;
    public int h;
    public int i;
    public float j;
    public r6e k;
    public ValueAnimator l;

    public t6e(v6e v6eVar, List list, boolean z, int i, vx9 vx9Var, ww8 ww8Var, msa msaVar) {
        this.a = v6eVar;
        this.b = list;
        this.c = z;
        this.d = i;
        this.e = vx9Var;
        this.f = ww8Var;
        this.g = msaVar;
    }

    public final ValueAnimator a(int i, int i2, s6e s6eVar) {
        ValueAnimator valueAnimator = this.l;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator(1.5f));
        valueAnimatorOfInt.addUpdateListener(new mk(this, 9, s6eVar));
        this.l = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
        return valueAnimatorOfInt;
    }

    public final void b() {
        RecyclerView recyclerView = this.a.e;
        int width = recyclerView.getWidth();
        if (width <= 0 || recyclerView.getLayoutParams().width == width) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        if (layoutParams == null) {
            ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        } else {
            layoutParams.width = width;
            recyclerView.setLayoutParams(layoutParams);
        }
    }
}
