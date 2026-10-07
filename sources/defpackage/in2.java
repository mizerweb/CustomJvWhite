package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class in2 implements Animatable {
    public final m9c a;
    public final lh9 b;
    public final m9c c;
    public final float d = (yl5.d().getDisplayMetrics().density * 28.0f) / (yl5.d().getDisplayMetrics().density * 24.0f);
    public final Float[] e;
    public AnimatorSet f;
    public boolean g;
    public final euc h;

    public in2(m9c m9cVar, lh9 lh9Var, m9c m9cVar2) {
        this.a = m9cVar;
        this.b = lh9Var;
        this.c = m9cVar2;
        Float[] fArr = new Float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = null;
        }
        this.e = fArr;
        this.h = new euc(1);
        float f = yl5.d().getDisplayMetrics().density;
        float f2 = yl5.d().getDisplayMetrics().density;
    }

    public static final void a(in2 in2Var, int i) {
        euc eucVar = in2Var.h;
        if (in2Var.e[i] != null) {
            AtomicInteger atomicInteger = (AtomicInteger) eucVar.b;
            if (atomicInteger.incrementAndGet() == 4) {
                atomicInteger.set(0);
                vj vjVar = (vj) eucVar.c;
                eucVar.d = vjVar != null ? Integer.valueOf(vjVar.g()) : null;
            }
            Integer num = (Integer) eucVar.d;
            if (num != null && num.intValue() == i) {
                in2Var.b.invoke(Integer.valueOf(i));
                eucVar.d = null;
            }
        }
    }

    public final ValueAnimator b(int i, int i2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setStartDelay(200L);
        valueAnimatorOfFloat.addUpdateListener(new lk1(this, i, i2, 1));
        valueAnimatorOfFloat.addListener(new ea0(this, i, 1));
        return valueAnimatorOfFloat;
    }

    public final void c(boolean z) {
        ValueAnimator valueAnimatorB;
        ArrayList arrayList = new ArrayList();
        if (z) {
            valueAnimatorB = ValueAnimator.ofFloat(1.0f, this.d);
            valueAnimatorB.setStartDelay(200L);
            valueAnimatorB.setDuration(200L);
            valueAnimatorB.setInterpolator(new LinearInterpolator());
            valueAnimatorB.addUpdateListener(new ak(8, this));
            valueAnimatorB.addListener(new li(5, this));
        } else {
            valueAnimatorB = b(1, 2);
        }
        arrayList.add(valueAnimatorB);
        arrayList.add(b(0, 1));
        arrayList.add(b(2, 0));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(arrayList);
        animatorSet.setDuration(1200L);
        animatorSet.addListener(new hn2(this));
        animatorSet.start();
        this.f = animatorSet;
    }

    public final void d(int i) {
        Object ldfVar;
        this.g = false;
        Float[] fArr = this.e;
        int length = fArr.length;
        int i2 = 0;
        while (true) {
            ldfVar = null;
            Float fValueOf = null;
            if (i2 >= length) {
                break;
            }
            if (i2 < i) {
                this.g = true;
                fValueOf = Float.valueOf(1.0f);
            }
            fArr[i2] = fValueOf;
            i2++;
        }
        euc eucVar = this.h;
        eucVar.d = null;
        if (i != 0) {
            if (i == 1) {
                ldfVar = new ldf(15);
            } else if (i == 2) {
                ww6 ww6Var = new ww6(3);
                ww6Var.b = 1;
                ldfVar = ww6Var;
            } else {
                if (i != 3) {
                    ore.k("avatars count must be in range 0..3");
                    return;
                }
                ldfVar = new wj(0);
            }
        }
        eucVar.c = ldfVar;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        AnimatorSet animatorSet = this.f;
        return animatorSet != null && animatorSet.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (isRunning()) {
            stop();
        }
        if (this.g) {
            c(true);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.f = null;
    }
}
