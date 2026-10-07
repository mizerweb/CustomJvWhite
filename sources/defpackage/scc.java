package defpackage;

import android.animation.Animator;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class scc implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ scc(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
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

    private final void h(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                tcc tccVar = (tcc) obj3;
                tccVar.setVisibility(8);
                tccVar.setAlpha(0.0f);
                af7 af7Var = (af7) obj2;
                if (af7Var != null) {
                    af7Var.invoke();
                }
                for (View view : (List) obj) {
                    if (view.getVisibility() == 0) {
                        view.setAlpha(0.0f);
                    }
                }
                break;
            case 1:
                r6e r6eVar = (r6e) obj;
                t6e t6eVar = (t6e) obj2;
                if (((sfe) obj3).a) {
                    v6e.d(t6eVar.a, t6eVar.b, null, new gb3(t6eVar, 3, r6eVar), 2);
                } else {
                    if (r6eVar != null) {
                        r6eVar.a();
                    }
                    t6eVar.k = null;
                }
                break;
            default:
                ((w5f) obj3).h.put((r5f) obj2, (Object) null);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
            case 1:
                break;
            default:
                View view = (View) this.d;
                view.setVisibility(0);
                if (view.getTranslationY() == 0.0f) {
                    view.setTranslationY(yl5.d().getDisplayMetrics().density * 4.0f);
                }
                break;
        }
    }
}
