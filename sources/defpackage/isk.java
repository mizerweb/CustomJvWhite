package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class isk {
    public static final void a(c79 c79Var, View view, boolean z) {
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        float f3 = z ? -(yl5.d().getDisplayMetrics().density * 50.0f) : 0.0f;
        float f4 = z ? 0.0f : -(yl5.d().getDisplayMetrics().density * 50.0f);
        view.setTranslationY(f3);
        c79Var.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f, f2));
        c79Var.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, f3, f4));
    }

    public static final ObjectAnimator b(View view, boolean z, float f, float f2, long j) {
        view.setAlpha(f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, f, f2);
        objectAnimatorOfFloat.setStartDelay(z ? j - 50 : 0L);
        objectAnimatorOfFloat.setDuration(50L);
        return objectAnimatorOfFloat;
    }

    public static final void c(View view, boolean z, long j, cf7 cf7Var) {
        Object tag = view.getTag(R.id.call_animation_fade);
        if (tag == null) {
            if ((view.getVisibility() == 0) == z) {
                if (cf7Var != null) {
                    cf7Var.invoke(Boolean.valueOf(view.getVisibility() == 0));
                    return;
                }
                return;
            }
        }
        boolean zD = cqk.d(tag, "fade_in");
        boolean zD2 = cqk.d(tag, "fade_out");
        if (zD && z) {
            return;
        }
        if (!zD2 || z) {
            String str = z ? "fade_in" : "fade_out";
            view.animate().cancel();
            view.clearAnimation();
            Animation animation = view.getAnimation();
            if (animation != null) {
                animation.setAnimationListener(null);
            }
            float f = z ? 0.0f : 1.0f;
            float f2 = z ? 1.0f : 0.0f;
            view.animate().setDuration(j).alpha(f2).setInterpolator(z ? new DecelerateInterpolator() : new AccelerateInterpolator()).setListener(new nk(view, str, f, f2, z, cf7Var)).start();
        }
    }

    public static /* synthetic */ void d(View view, boolean z, long j, cf7 cf7Var, int i) {
        if ((i & 2) != 0) {
            j = 150;
        }
        if ((i & 4) != 0) {
            cf7Var = null;
        }
        c(view, z, j, cf7Var);
    }

    public static void e(View view, boolean z, tc tcVar, int i) {
        tc tcVar2 = (i & 4) != 0 ? null : tcVar;
        Object tag = view.getTag(R.id.call_animation_fade);
        if (tag == null) {
            if ((view.getVisibility() == 0) == z) {
                if (tcVar2 != null) {
                    tcVar2.invoke(Boolean.valueOf(view.getVisibility() == 0));
                    return;
                }
                return;
            }
        }
        boolean zD = cqk.d(tag, "fade_in");
        boolean zD2 = cqk.d(tag, "fade_out");
        if (zD && z) {
            return;
        }
        if (!zD2 || z) {
            String str = z ? "fade_in" : "fade_out";
            view.animate().cancel();
            view.clearAnimation();
            Animation animation = view.getAnimation();
            if (animation != null) {
                animation.setAnimationListener(null);
            }
            float f = z ? 0.0f : 1.0f;
            float f2 = z ? 1.0f : 0.0f;
            float f3 = z ? 0.0f : 1.0f;
            float f4 = z ? 1.0f : 0.0f;
            view.animate().setDuration(150L).alpha(f2).scaleX(f4).scaleY(f4).setInterpolator(z ? new DecelerateInterpolator() : new AccelerateInterpolator()).setListener(new ok(view, str, f3, f, f4, f2, z, tcVar2)).start();
        }
    }

    public static final ObjectAnimator f(View view, float f, float f2, AccelerateDecelerateInterpolator accelerateDecelerateInterpolator) {
        view.animate().cancel();
        view.clearAnimation();
        Animation animation = view.getAnimation();
        if (animation != null) {
            animation.setAnimationListener(null);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_X, f, f2);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(accelerateDecelerateInterpolator);
        return objectAnimatorOfFloat;
    }

    public static final boolean g(View view) {
        Object tag = view.getTag(R.id.call_animation_fade);
        boolean zD = cqk.d(tag, "fade_in");
        boolean zD2 = cqk.d(tag, "fade_out");
        if (tag == null) {
            return view.getVisibility() == 0;
        }
        if (zD) {
            return true;
        }
        return !zD2 && view.getVisibility() == 0;
    }

    public static final boolean h(View view, boolean z) {
        if (view != null && view.getVisibility() == 0) {
            return z || view.getAlpha() != 0.0f;
        }
        return false;
    }

    public static final int i(kbc kbcVar, Long l, int i) {
        if (l != null) {
            af7 af7Var = nk0.a;
            if (((Boolean) nk0.a.invoke()).booleanValue()) {
                int[] iArr = (int[]) nk0.c.computeIfAbsent(kbcVar, new am(1, new m(15, kbcVar)));
                return iArr[(int) Math.abs(l.longValue() % ((long) iArr.length))];
            }
        }
        return i;
    }

    public static AnimatorSet j(ViewGroup viewGroup, boolean z, float f, float f2) {
        if ((viewGroup.getVisibility() == 0) == z) {
            return null;
        }
        float f3 = z ? 0.0f : 1.0f;
        float f4 = z ? 1.0f : 0.0f;
        AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        ObjectAnimator objectAnimatorF = f(viewGroup, f, f2, accelerateDecelerateInterpolator);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) View.ALPHA, f3, f4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(accelerateDecelerateInterpolator);
        animatorSet.addListener(new qk(viewGroup, f3, f4, z));
        animatorSet.playTogether(objectAnimatorF, objectAnimatorOfFloat);
        return animatorSet;
    }
}
