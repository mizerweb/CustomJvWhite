package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final class al extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ al(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ValueAnimator) obj2).removeListener(this);
                ((af7) obj).invoke();
                break;
            case 1:
                g36 g36Var = (g36) obj;
                Matrix matrix = g36Var.d;
                matrix.setValues((float[]) obj2);
                matrix.invert(g36Var.e);
                g36Var.invalidate();
                break;
            case 2:
                ((bhb) obj2).b((lfe) obj);
                break;
            case 3:
                ((amh) obj2).a = null;
                ((wre) obj).invoke();
                break;
            case 4:
                ((mw) obj2).remove(animator);
                ((r2i) obj).n.remove(animator);
                break;
            default:
                swj swjVar = (swj) obj2;
                swjVar.a.d(1.0f);
                owj.e((View) obj, swjVar);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 4:
                ((r2i) this.c).n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ al(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
