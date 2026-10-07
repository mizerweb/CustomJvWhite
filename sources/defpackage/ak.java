package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.ColorDrawable;
import android.view.ViewGroup;
import android.widget.Space;
import one.me.profile.ProfileScreen;
import org.apache.http.conn.params.ConnManagerParams;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ak implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ak(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                o7j.g((Space) obj, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 1:
                v50 v50Var = (v50) obj;
                v50Var.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                v50Var.invalidateSelf();
                break;
            case 2:
                k70 k70Var = (k70) obj;
                k70Var.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                k70Var.invalidateSelf();
                break;
            case 3:
                mc0 mc0Var = (mc0) obj;
                mc0Var.k = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mc0Var.invalidateSelf();
                break;
            case 4:
                yc0 yc0Var = (yc0) obj;
                yc0Var.n = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yc0Var.postInvalidateOnAnimation();
                break;
            case 5:
                sk0 sk0Var = (sk0) obj;
                sk0Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sk0Var.invalidateSelf();
                break;
            case 6:
                hn1 hn1Var = (hn1) obj;
                Object animatedValue = valueAnimator.getAnimatedValue();
                Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
                float fFloatValue = f != null ? f.floatValue() : 1.0f;
                hn1Var.s.setAlpha(fFloatValue);
                hn1Var.t.setAlpha(fFloatValue);
                hn1Var.u.setAlpha(fFloatValue);
                hn1Var.v.setAlpha(fFloatValue);
                hn1Var.w.setAlpha(fFloatValue);
                break;
            case 7:
                zk2 zk2Var = (zk2) obj;
                float f2 = zk2Var.y;
                zk2Var.x = (valueAnimator.getAnimatedFraction() * (zk2Var.z - f2)) + f2;
                zk2Var.invalidate();
                break;
            case 8:
                in2 in2Var = (in2) obj;
                Object[] objArr = in2Var.e;
                if (objArr[1] != null) {
                    objArr[1] = valueAnimator.getAnimatedValue();
                    in2Var.a.invoke();
                }
                break;
            case 9:
                nu4 nu4Var = (nu4) obj;
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int i2 = (int) ((nu4Var.h * ((fFloatValue2 * 100.0f) / 360.0f)) / 100.0f);
                kr3 kr3Var = nu4Var.j;
                kr3Var.b = fFloatValue2;
                kr3Var.invalidateSelf();
                nu4Var.setText(String.valueOf((i2 / 1000) + 1));
                break;
            case 10:
                mx4 mx4Var = (mx4) obj;
                mx4Var.I1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mx4Var.invalidate();
                break;
            case 11:
                ((ColorDrawable) obj).setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 12:
                ju5 ju5Var = (ju5) obj;
                ju5Var.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jj2 jj2Var = ju5Var.f;
                if (jj2Var != null) {
                    jj2Var.run();
                }
                break;
            case 13:
                xg6 xg6Var = (xg6) obj;
                xg6Var.o = (Integer) valueAnimator.getAnimatedValue();
                ViewGroup.LayoutParams layoutParams = xg6Var.getLayoutParams();
                if (layoutParams == null) {
                    ore.n("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                } else {
                    layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    xg6Var.setLayoutParams(layoutParams);
                }
                break;
            case 14:
                ol6 ol6Var = (ol6) obj;
                float interpolation = ol6Var.l.getInterpolation(((Float) valueAnimator.getAnimatedValue()).floatValue());
                float f3 = 1.0f - interpolation;
                ol6Var.f = f3;
                ol6Var.g = f3;
                ol6Var.h = esk.b(18.354f, 25.539501f, interpolation);
                ol6Var.i = esk.b(7.606f, 18.354f, interpolation);
                ol6Var.j = interpolation;
                ol6Var.k = interpolation;
                ol6Var.invalidateSelf();
                break;
            case 15:
                ls7 ls7Var = (ls7) obj;
                ls7Var.A = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ls7Var.invalidate();
                break;
            case 16:
                ((tp3) obj).g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                break;
            case 17:
                ((da9) obj).invalidateSelf();
                break;
            case 18:
                eu9 eu9Var = (eu9) obj;
                eu9Var.k = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                eu9Var.invalidateSelf();
                break;
            case 19:
                ((tea) obj).y.getForeground().setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                ydb ydbVar = (ydb) obj;
                ydbVar.g = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ydbVar.invalidateSelf();
                break;
            case 21:
                v0c v0cVar = (v0c) obj;
                v0cVar.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v0cVar.invalidate();
                break;
            case 22:
                ((l9c) obj).setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 23:
                rcc rccVar = (rcc) obj;
                rccVar.D = (Integer) valueAnimator.getAnimatedValue();
                rccVar.requestLayout();
                break;
            case 24:
                a6d.a((a6d) obj, valueAnimator);
                break;
            case 25:
                ku8 ku8Var = ProfileScreen.B;
                ((kwb) obj).setStoriesStrokeAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            case 26:
                w5e w5eVar = (w5e) obj;
                w5eVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w5eVar.invalidate();
                break;
            case 27:
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                num.getClass();
                ((e7e) obj).invoke(num);
                break;
            case 28:
                nqe nqeVar = (nqe) obj;
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nqeVar.c = tqk.c(yl5.d().getDisplayMetrics().density * 16.0f, yl5.d().getDisplayMetrics().density * 320.0f, fFloatValue3) / 2.0f;
                nqeVar.d = tqk.c(yl5.d().getDisplayMetrics().density * 16.0f, yl5.d().getDisplayMetrics().density * 400.0f, fFloatValue3) / 2.0f;
                nqeVar.e = tqk.c(0.7f, 0.0f, fFloatValue3);
                nqeVar.a();
                nqeVar.invalidateSelf();
                break;
            default:
                tvj.a("ScreenFlashView", "animateToFullOpacity: value = " + ((Float) valueAnimator.getAnimatedValue()).floatValue());
                ((h4f) obj).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
