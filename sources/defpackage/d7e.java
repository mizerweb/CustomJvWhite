package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d7e implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ v6e b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ d7e(v6e v6eVar, ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = v6eVar;
        this.c = viewGroup;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        ViewGroup viewGroup = this.c;
        v6e v6eVar = this.b;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                RecyclerView recyclerView = v6eVar.e;
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                if (layoutParams == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                } else {
                    layoutParams.height = iIntValue;
                    recyclerView.setLayoutParams(layoutParams);
                    ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                    if (layoutParams2 == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    } else {
                        layoutParams2.height = iIntValue;
                        viewGroup.setLayoutParams(layoutParams2);
                    }
                }
                break;
            default:
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                RecyclerView recyclerView2 = v6eVar.e;
                ViewGroup.LayoutParams layoutParams3 = recyclerView2.getLayoutParams();
                if (layoutParams3 == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                } else {
                    layoutParams3.height = iIntValue2;
                    recyclerView2.setLayoutParams(layoutParams3);
                    ViewGroup.LayoutParams layoutParams4 = viewGroup.getLayoutParams();
                    if (layoutParams4 == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    } else {
                        layoutParams4.height = iIntValue2;
                        viewGroup.setLayoutParams(layoutParams4);
                    }
                }
                break;
        }
    }
}
