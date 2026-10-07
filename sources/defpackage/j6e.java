package defpackage;

import android.transition.Transition;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class j6e implements Transition.TransitionListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ vw5 b;
    public final /* synthetic */ float c;

    public j6e(View view, vw5 vw5Var, float f) {
        this.a = view;
        this.b = vw5Var;
        this.c = f;
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
        View view = this.a;
        vw5 vw5Var = this.b;
        float f = this.c;
        ifg ifgVar = new ifg(view, vw5Var, f);
        ifgVar.a = 0.0f;
        jfg jfgVar = new jfg(f);
        jfgVar.b(400.0f);
        jfgVar.a(0.68f);
        ifgVar.m = jfgVar;
        ifgVar.g();
    }
}
