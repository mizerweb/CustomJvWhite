package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ds4 extends AnimatorListenerAdapter {
    public final /* synthetic */ View a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ View c;
    public final /* synthetic */ es4 d;
    public final /* synthetic */ float e;

    public ds4(tp2 tp2Var, boolean z, tp2 tp2Var2, es4 es4Var, float f) {
        this.a = tp2Var;
        this.b = z;
        this.c = tp2Var2;
        this.d = es4Var;
        this.e = f;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        es4 es4Var = this.d;
        yr4 yr4Var = es4Var.j;
        boolean z = this.b;
        float fFloatValue = ((Number) es4.d(z, yr4Var, 48).b).floatValue();
        View view = this.a;
        view.setTranslationY(fFloatValue);
        float fFloatValue2 = ((Number) es4.d(z, es4Var.k, 80).b).floatValue();
        View view2 = this.c;
        view2.setTranslationY(fFloatValue2);
        float f = this.e;
        view.setAlpha(f);
        view2.setAlpha(f);
        es4.a(es4Var, z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        es4.a(this.d, this.b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        boolean z = this.b;
        this.a.setTag(R.id.call_animation_fade, z ? "fade_in" : "fade_out");
        this.c.setTag(R.id.call_animation_fade, z ? "fade_in" : "fade_out");
        this.d.i.invoke(Boolean.valueOf(z));
    }
}
