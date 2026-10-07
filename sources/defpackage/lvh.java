package defpackage;

import android.animation.Animator;
import android.view.View;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class lvh implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ float f;
    public final /* synthetic */ af7 g;

    public lvh(View view, String str, float f, float f2, boolean z, float f3, af7 af7Var) {
        this.a = view;
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = z;
        this.f = f3;
        this.g = af7Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.e ? 0 : 8;
        View view = this.a;
        view.setVisibility(i);
        af7 af7Var = this.g;
        if (af7Var != null) {
            af7Var.invoke();
        }
        view.setTag(R.id.oneme_tooltip_animation_fade, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f = this.d;
        View view = this.a;
        view.setAlpha(f);
        view.setVisibility(this.e ? 0 : 8);
        view.setTranslationY(this.f);
        af7 af7Var = this.g;
        if (af7Var != null) {
            af7Var.invoke();
        }
        view.setTag(R.id.oneme_tooltip_animation_fade, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        String str = this.b;
        View view = this.a;
        view.setTag(R.id.oneme_tooltip_animation_fade, str);
        view.setAlpha(this.c);
        view.setVisibility(0);
    }
}
