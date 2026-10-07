package defpackage;

import android.animation.ObjectAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ir3 extends f2 {
    public static final int[] k = {0, 1350, 2700, 4050};
    public static final int[] l = {667, 2017, 3367, 4717};
    public static final int[] m = {1000, 2350, 3700, 5050};
    public static final cp2 n = new cp2(5, Float.class, "animationFraction");
    public static final cp2 o = new cp2(6, Float.class, "completeEndFraction");
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final ll6 e;
    public final mr3 f;
    public int g;
    public float h;
    public float i;
    public gi j;

    public ir3(mr3 mr3Var) {
        super(1);
        this.g = 0;
        this.j = null;
        this.f = mr3Var;
        this.e = new ll6();
    }

    @Override // defpackage.f2
    public final void c() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.f2
    public final void g() {
        this.g = 0;
        ((gu5) ((ArrayList) this.b).get(0)).c = this.f.c[0];
        this.i = 0.0f;
    }

    @Override // defpackage.f2
    public final void i(hs0 hs0Var) {
        this.j = hs0Var;
    }

    @Override // defpackage.f2
    public final void j() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((yc8) this.a).isVisible()) {
            this.d.start();
        } else {
            c();
        }
    }

    @Override // defpackage.f2
    public final void k() {
        if (this.c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, n, 0.0f, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new hr3(this, 0));
        }
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, o, 0.0f, 1.0f);
            this.d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.d.setInterpolator(this.e);
            this.d.addListener(new hr3(this, 1));
        }
        this.g = 0;
        ((gu5) ((ArrayList) this.b).get(0)).c = this.f.c[0];
        this.i = 0.0f;
        this.c.start();
    }

    @Override // defpackage.f2
    public final void l() {
        this.j = null;
    }
}
