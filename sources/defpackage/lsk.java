package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lsk {
    public static final void a(Animator animator) {
        animator.removeAllListeners();
        animator.cancel();
    }

    public static void b(int i, int i2, int i3, int i4, int i5, int i6, dea deaVar) {
        int iMin = Math.min(i, i2);
        int i7 = iMin / 2;
        float f = i4;
        float f2 = i3;
        int i8 = (int) ((f / f2) * iMin);
        if (iMin >= i7 && i8 >= i5 && i8 <= i6) {
            c(iMin, i8, i3, i4, deaVar);
            return;
        }
        if (i8 < i5) {
            c(iMin, i5, i3, i4, deaVar);
            return;
        }
        int i9 = (int) ((f2 / f) * i6);
        if (i9 < i7 || i6 < i5) {
            c(i7, i6, i3, i4, deaVar);
        } else {
            c(i9, i6, i3, i4, deaVar);
        }
    }

    public static void c(int i, int i2, int i3, int i4, dea deaVar) {
        int i5;
        int i6;
        if (i3 > i4) {
            i6 = (int) ((i4 / i3) * i);
            i5 = i;
        } else {
            i5 = (int) ((i3 / i4) * i2);
            i6 = i2;
        }
        deaVar.a = i;
        deaVar.b = i2;
        deaVar.c = i5;
        deaVar.d = i6;
    }

    public static final void d(AnimatorSet animatorSet, af7 af7Var) {
        animatorSet.addListener(new bl(animatorSet, af7Var, 0));
    }

    public static final void e(ValueAnimator valueAnimator, af7 af7Var) {
        valueAnimator.addListener(new al(valueAnimator, 0, af7Var));
    }
}
