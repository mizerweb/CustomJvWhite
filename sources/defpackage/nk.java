package defpackage;

import android.animation.Animator;
import android.view.View;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class nk implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ cf7 f;

    public nk(View view, String str, float f, float f2, boolean z, cf7 cf7Var) {
        this.a = view;
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = z;
        this.f = cf7Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        float f = this.d;
        View view = this.a;
        view.setAlpha(f);
        view.setVisibility(this.e ? 0 : 8);
        cf7 cf7Var = this.f;
        if (cf7Var != null) {
            cf7Var.invoke(Boolean.valueOf(view.getVisibility() == 0));
        }
        view.setTag(R.id.call_animation_fade, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f = this.d;
        View view = this.a;
        view.setAlpha(f);
        view.setVisibility(this.e ? 0 : 8);
        cf7 cf7Var = this.f;
        if (cf7Var != null) {
            cf7Var.invoke(Boolean.valueOf(view.getVisibility() == 0));
        }
        view.setTag(R.id.call_animation_fade, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        String str = this.b;
        View view = this.a;
        view.setTag(R.id.call_animation_fade, str);
        view.setAlpha(this.c);
        view.setVisibility(0);
    }
}
