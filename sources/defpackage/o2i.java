package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o2i {
    public static long a(Animator animator) {
        return animator.getTotalDuration();
    }

    public static void b(Animator animator, long j) {
        ((AnimatorSet) animator).setCurrentPlayTime(j);
    }
}
