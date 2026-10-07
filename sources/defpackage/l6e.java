package defpackage;

import android.transition.Transition;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class l6e implements Transition.TransitionListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ float b;

    public l6e(View view, float f) {
        this.a = view;
        this.b = f;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        this.a.setAlpha(this.b);
    }
}
