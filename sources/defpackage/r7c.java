package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;

/* JADX INFO: loaded from: classes.dex */
public final class r7c implements Animator.AnimatorListener {
    public final /* synthetic */ t7c a;
    public final /* synthetic */ Context b;

    public r7c(t7c t7cVar, Context context) {
        this.a = t7cVar;
        this.b = context;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        t7c t7cVar = this.a;
        ny8 ny8Var = t7cVar.q;
        ViewGroup.LayoutParams layoutParams = t7cVar.getLayoutParams();
        if (layoutParams == null) {
            ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            return;
        }
        layoutParams.width = -2;
        layoutParams.height = -2;
        t7cVar.setMinimumHeight(0);
        t7cVar.setLayoutParams(layoutParams);
        int iOrdinal = t7cVar.f.ordinal();
        if (iOrdinal == 0) {
            ((View) t7cVar.s.getValue()).setVisibility(t7cVar.getShouldShowSearchIcon() ? 0 : 8);
        } else {
            if (iOrdinal != 1) {
                ore.o();
                return;
            }
            ((View) t7cVar.r.getValue()).setVisibility(t7cVar.getShouldShowSearchIcon() ? 0 : 8);
        }
        if (t7cVar.getShouldShowBackButton()) {
            ((View) t7cVar.p.getValue()).setVisibility(8);
        }
        ((View) t7cVar.t.getValue()).setVisibility(8);
        ((View) ny8Var.getValue()).setVisibility(8);
        ((p1c) ny8Var.getValue()).setText((CharSequence) null);
        t7cVar.o = q7c.a;
        p7c p7cVar = t7cVar.g;
        if (p7cVar != null) {
            p7cVar.X();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        t7c t7cVar = this.a;
        ny8 ny8Var = t7cVar.q;
        ((p1c) ny8Var.getValue()).setHint((CharSequence) null);
        InputMethodManager inputMethodManager = (InputMethodManager) this.b.getSystemService(InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(((p1c) ny8Var.getValue()).getWindowToken(), 0);
        }
        t7cVar.o = q7c.b;
    }
}
