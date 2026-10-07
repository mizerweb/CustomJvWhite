package defpackage;

import android.animation.Animator;
import android.view.View;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ok implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ cf7 h;

    public ok(View view, String str, float f, float f2, float f3, float f4, boolean z, cf7 cf7Var) {
        this.a = view;
        this.b = str;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = z;
        this.h = cf7Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.a;
        float f = this.e;
        view.setScaleX(f);
        view.setScaleY(f);
        view.setAlpha(this.f);
        view.setVisibility(this.g ? 0 : 8);
        cf7 cf7Var = this.h;
        if (cf7Var != null) {
            cf7Var.invoke(Boolean.valueOf(view.getVisibility() == 0));
        }
        view.setTag(R.id.call_animation_fade, null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        float f = this.e;
        view.setScaleX(f);
        view.setScaleY(f);
        view.setAlpha(this.f);
        view.setVisibility(this.g ? 0 : 8);
        cf7 cf7Var = this.h;
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
        float f = this.c;
        view.setScaleX(f);
        view.setScaleY(f);
        view.setAlpha(this.d);
        view.setVisibility(0);
    }
}
