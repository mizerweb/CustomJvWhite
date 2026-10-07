package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class pk extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ af7 d;

    public /* synthetic */ pk(Object obj, Object obj2, af7 af7Var, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = af7Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        af7 af7Var = this.d;
        switch (i) {
            case 0:
                ((View) this.b).setTag(R.id.call_animation_fade, null);
                ((cz1) af7Var).invoke();
                break;
            case 1:
                ((ecd) obj).requestLayout();
                af7Var.invoke();
                break;
            default:
                ((reh) obj).requestLayout();
                af7Var.invoke();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.c;
        af7 af7Var = this.d;
        switch (i) {
            case 0:
                ((View) this.b).setTag(R.id.call_animation_fade, null);
                ((cz1) af7Var).invoke();
                break;
            case 1:
                ecd ecdVar = (ecd) obj;
                ecdVar.requestLayout();
                af7Var.invoke();
                ecdVar.e = null;
                break;
            default:
                reh rehVar = (reh) obj;
                rehVar.requestLayout();
                af7Var.invoke();
                rehVar.c = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                super.onAnimationStart(animator);
                ((View) obj).setTag(R.id.call_animation_fade, (String) this.c);
                break;
            case 1:
                ((af7) obj).invoke();
                break;
            default:
                ((af7) obj).invoke();
                break;
        }
    }
}
