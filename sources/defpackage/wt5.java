package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class wt5 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt5 b;

    public /* synthetic */ wt5(xt5 xt5Var, int i) {
        this.a = i;
        this.b = xt5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                xt5 xt5Var = this.b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = xt5Var.f;
                if (arrayList != null && !xt5Var.g) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((gi) it.next()).a(xt5Var);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                xt5 xt5Var = this.b;
                ArrayList arrayList = xt5Var.f;
                if (arrayList != null && !xt5Var.g) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((gi) it.next()).b(xt5Var);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
