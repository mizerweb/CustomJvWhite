package defpackage;

import android.animation.ObjectAnimator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class q19 extends f2 {
    public static final p19 i = new p19(0, Float.class, "animationFraction");
    public ObjectAnimator c;
    public final ll6 d;
    public final z19 e;
    public int f;
    public boolean g;
    public float h;

    public q19(z19 z19Var) {
        super(3);
        this.f = 1;
        this.e = z19Var;
        this.d = new ll6();
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
        m();
    }

    @Override // defpackage.f2
    public final void i(hs0 hs0Var) {
    }

    @Override // defpackage.f2
    public final void j() {
    }

    @Override // defpackage.f2
    public final void k() {
        if (this.c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, i, 0.0f, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new y7(5, this));
        }
        m();
        this.c.start();
    }

    @Override // defpackage.f2
    public final void l() {
    }

    public final void m() {
        this.g = true;
        this.f = 1;
        for (gu5 gu5Var : (ArrayList) this.b) {
            z19 z19Var = this.e;
            gu5Var.c = z19Var.c[0];
            gu5Var.d = z19Var.g / 2;
        }
    }
}
