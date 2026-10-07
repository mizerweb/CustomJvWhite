package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class w96 {
    public final x96 a;
    public final AnimatorSet b;
    public final ifh c;
    public final ifh d;
    public float e;

    public w96(x96 x96Var, AnimatorSet animatorSet) {
        this.a = x96Var;
        this.b = animatorSet.clone();
        final int i = 0;
        this.c = new ifh(new af7(this) { // from class: v96
            public final /* synthetic */ w96 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                long totalDuration = 0;
                w96 w96Var = this.b;
                switch (i2) {
                    case 0:
                        AnimatorSet animatorSet2 = w96Var.b;
                        if (animatorSet2 != null && !animatorSet2.getChildAnimations().isEmpty()) {
                            Iterator<T> it = animatorSet2.getChildAnimations().iterator();
                            if (!it.hasNext()) {
                                qr7.d();
                                return null;
                            }
                            Animator animator = (Animator) it.next();
                            totalDuration = animator.getTotalDuration() + animator.getStartDelay();
                            while (it.hasNext()) {
                                Animator animator2 = (Animator) it.next();
                                long totalDuration2 = animator2.getTotalDuration() + animator2.getStartDelay();
                                if (totalDuration < totalDuration2) {
                                    totalDuration = totalDuration2;
                                }
                            }
                        }
                        return Long.valueOf(totalDuration);
                    default:
                        AnimatorSet animatorSet3 = w96Var.b;
                        ArrayList arrayList = new ArrayList();
                        w96.a(animatorSet3, arrayList, 0L);
                        List listM1 = ww3.M1(arrayList, new lv5(25));
                        ArrayList arrayList2 = new ArrayList(yw3.W0(listM1, 10));
                        Iterator it2 = listM1.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add((ValueAnimator) ((ylc) it2.next()).a);
                        }
                        return arrayList2;
                }
            }
        });
        final int i2 = 1;
        this.d = new ifh(new af7(this) { // from class: v96
            public final /* synthetic */ w96 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                long totalDuration = 0;
                w96 w96Var = this.b;
                switch (i3) {
                    case 0:
                        AnimatorSet animatorSet2 = w96Var.b;
                        if (animatorSet2 != null && !animatorSet2.getChildAnimations().isEmpty()) {
                            Iterator<T> it = animatorSet2.getChildAnimations().iterator();
                            if (!it.hasNext()) {
                                qr7.d();
                                return null;
                            }
                            Animator animator = (Animator) it.next();
                            totalDuration = animator.getTotalDuration() + animator.getStartDelay();
                            while (it.hasNext()) {
                                Animator animator2 = (Animator) it.next();
                                long totalDuration2 = animator2.getTotalDuration() + animator2.getStartDelay();
                                if (totalDuration < totalDuration2) {
                                    totalDuration = totalDuration2;
                                }
                            }
                        }
                        return Long.valueOf(totalDuration);
                    default:
                        AnimatorSet animatorSet3 = w96Var.b;
                        ArrayList arrayList = new ArrayList();
                        w96.a(animatorSet3, arrayList, 0L);
                        List listM1 = ww3.M1(arrayList, new lv5(25));
                        ArrayList arrayList2 = new ArrayList(yw3.W0(listM1, 10));
                        Iterator it2 = listM1.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add((ValueAnimator) ((ylc) it2.next()).a);
                        }
                        return arrayList2;
                }
            }
        });
    }

    public static final void a(Animator animator, ArrayList arrayList, long j) {
        if (!(animator instanceof AnimatorSet)) {
            if (animator instanceof ValueAnimator) {
                arrayList.add(new ylc(animator, Long.valueOf(((ValueAnimator) animator).getStartDelay() + j)));
            }
        } else {
            AnimatorSet animatorSet = (AnimatorSet) animator;
            long startDelay = animatorSet.getStartDelay() + j;
            Iterator<Animator> it = animatorSet.getChildAnimations().iterator();
            while (it.hasNext()) {
                a(it.next(), arrayList, startDelay);
            }
        }
    }
}
