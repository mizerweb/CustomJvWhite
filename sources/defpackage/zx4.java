package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zx4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ ay4 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ zx4(ay4 ay4Var, float f, Runnable runnable, int i) {
        this.a = i;
        this.b = ay4Var;
        this.c = f;
        this.d = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) throws IllegalAccessException, InvocationTargetException {
        int i = this.a;
        Runnable runnable = this.d;
        float f = this.c;
        ay4 ay4Var = this.b;
        switch (i) {
            case 0:
                if (!ay4Var.z) {
                    ay4Var.w = (-f) % 360.0f;
                    ay4Var.c();
                    ((hx4) runnable).run();
                    break;
                }
                break;
            default:
                if (!ay4Var.z) {
                    ay4Var.x = (f + 90.0f) % 360.0f;
                    ay4Var.c();
                    ((f92) runnable).run();
                    break;
                }
                break;
        }
    }
}
