package defpackage;

import android.transition.Transition;
import one.me.chats.forward.ForwardPickerScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class g97 implements Transition.TransitionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g97(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Transition transition) {
    }

    private final void b(Transition transition) {
    }

    private final void c(Transition transition) {
    }

    private final void d(Transition transition) {
    }

    private final void e(Transition transition) {
    }

    private final void f(Transition transition) {
    }

    private final void g(Transition transition) {
    }

    private final void h(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
        int i = this.a;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ForwardPickerScreen) obj).p.invoke();
                break;
            default:
                ((y5e) obj).f.invoke();
                break;
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
        int i = this.a;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
        int i = this.a;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        int i = this.a;
    }
}
