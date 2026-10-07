package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public final class g7e implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;

    public g7e(ogd ogdVar, int i, View view) {
        this.a = 2;
        this.b = ogdVar;
        this.d = i;
        this.c = view;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
        View view = this.c;
        Object obj = this.b;
        int i2 = this.d;
        switch (i) {
            case 0:
                RecyclerView recyclerView = ((v6e) obj).e;
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                if (layoutParams == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                } else {
                    layoutParams.height = i2;
                    recyclerView.setLayoutParams(layoutParams);
                    ViewGroup viewGroup = (ViewGroup) view;
                    ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                    if (layoutParams2 == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    } else {
                        layoutParams2.height = i2;
                        viewGroup.setLayoutParams(layoutParams2);
                    }
                }
                break;
            case 1:
                RecyclerView recyclerView2 = ((v6e) obj).e;
                ViewGroup.LayoutParams layoutParams3 = recyclerView2.getLayoutParams();
                if (layoutParams3 == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                } else {
                    layoutParams3.height = i2;
                    recyclerView2.setLayoutParams(layoutParams3);
                    ViewGroup viewGroup2 = (ViewGroup) view;
                    ViewGroup.LayoutParams layoutParams4 = viewGroup2.getLayoutParams();
                    if (layoutParams4 == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    } else {
                        layoutParams4.height = i2;
                        viewGroup2.setLayoutParams(layoutParams4);
                    }
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        View view = this.c;
        int i2 = this.d;
        Object obj = this.b;
        switch (i) {
            case 0:
                RecyclerView recyclerView = ((v6e) obj).e;
                ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
                if (layoutParams == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                } else {
                    layoutParams.height = i2;
                    recyclerView.setLayoutParams(layoutParams);
                    ViewGroup viewGroup = (ViewGroup) view;
                    ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                    if (layoutParams2 == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    } else {
                        layoutParams2.height = i2;
                        viewGroup.setLayoutParams(layoutParams2);
                    }
                }
                break;
            case 1:
                RecyclerView recyclerView2 = ((v6e) obj).e;
                ViewGroup.LayoutParams layoutParams3 = recyclerView2.getLayoutParams();
                if (layoutParams3 == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                } else {
                    layoutParams3.height = i2;
                    recyclerView2.setLayoutParams(layoutParams3);
                    ViewGroup viewGroup2 = (ViewGroup) view;
                    ViewGroup.LayoutParams layoutParams4 = viewGroup2.getLayoutParams();
                    if (layoutParams4 == null) {
                        ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    } else {
                        layoutParams4.height = i2;
                        viewGroup2.setLayoutParams(layoutParams4);
                    }
                }
                break;
            default:
                ((ogd) obj).m = i2;
                view.invalidateOutline();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
    }

    public /* synthetic */ g7e(v6e v6eVar, ViewGroup viewGroup, int i, int i2) {
        this.a = i2;
        this.b = v6eVar;
        this.c = viewGroup;
        this.d = i;
    }
}
