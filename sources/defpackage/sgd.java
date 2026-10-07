package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class sgd implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ int c;
    public final /* synthetic */ tp2 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ rcc f;
    public final /* synthetic */ xa3 g;
    public final /* synthetic */ tgd h;

    public sgd(View view, ViewGroup viewGroup, int i, tp2 tp2Var, int i2, rcc rccVar, xa3 xa3Var, tgd tgdVar) {
        this.a = view;
        this.b = viewGroup;
        this.c = i;
        this.d = tp2Var;
        this.e = i2;
        this.f = rccVar;
        this.g = xa3Var;
        this.h = tgdVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, InvocationTargetException {
        View view = this.a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            p51.d();
            return;
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
        view.setLayoutParams(layoutParams);
        view.setClipToOutline(false);
        view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        ViewGroup viewGroup = this.b;
        viewGroup.setPadding(viewGroup.getPaddingLeft(), this.c, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
        tp2 tp2Var = this.d;
        tp2Var.setPadding(tp2Var.getPaddingLeft(), tp2Var.getPaddingTop(), tp2Var.getPaddingRight(), this.e);
        this.f.setAlpha(1.0f);
        this.g.invoke();
        this.h.b = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
