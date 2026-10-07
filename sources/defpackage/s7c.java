package defpackage;

import android.animation.Animator;
import android.text.Editable;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class s7c implements Animator.AnimatorListener {
    public final /* synthetic */ t7c a;

    public s7c(t7c t7cVar) {
        this.a = t7cVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        t7c t7cVar = this.a;
        ((p1c) t7cVar.q.getValue()).setHint(t7cVar.e);
        t7cVar.o = q7c.c;
        p7c p7cVar = t7cVar.g;
        if (p7cVar != null) {
            p7cVar.n();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        t7c t7cVar = this.a;
        ny8 ny8Var = t7cVar.q;
        ny8 ny8Var2 = t7cVar.s;
        int i = 8;
        if (ny8Var2.d()) {
            ((ImageView) ny8Var2.getValue()).setVisibility(8);
        }
        ny8 ny8Var3 = t7cVar.r;
        if (ny8Var3.d()) {
            ((cs) ny8Var3.getValue()).setVisibility(8);
        }
        if (t7cVar.getShouldShowBackButton()) {
            ((View) t7cVar.p.getValue()).setVisibility(0);
        }
        View view = (View) t7cVar.t.getValue();
        Editable text = ((p1c) ny8Var.getValue()).getText();
        if (text != null && text.length() != 0) {
            i = 0;
        }
        view.setVisibility(i);
        ((View) ny8Var.getValue()).setVisibility(0);
        t7cVar.o = q7c.d;
    }
}
