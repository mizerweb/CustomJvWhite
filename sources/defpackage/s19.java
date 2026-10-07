package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class s19 extends f2 {
    public static final int[] k = {533, 567, 850, 750};
    public static final int[] l = {1267, 1000, 333, 0};
    public static final p19 m = new p19(1, Float.class, "animationFraction");
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final Interpolator[] e;
    public final z19 f;
    public int g;
    public boolean h;
    public float i;
    public gi j;

    public s19(Context context, z19 z19Var) {
        super(2);
        this.g = 0;
        this.j = null;
        this.f = z19Var;
        this.e = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
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
        this.j = hs0Var;
    }

    @Override // defpackage.f2
    public final void j() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        c();
        if (((yc8) this.a).isVisible()) {
            this.d.setFloatValues(this.i, 1.0f);
            this.d.setDuration((long) ((1.0f - this.i) * 1800.0f));
            this.d.start();
        }
    }

    @Override // defpackage.f2
    public final void k() {
        ObjectAnimator objectAnimator = this.c;
        p19 p19Var = m;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, p19Var, 0.0f, 1.0f);
            this.c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new r19(this, 0));
        }
        if (this.d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, p19Var, 1.0f);
            this.d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.d.setInterpolator(null);
            this.d.addListener(new r19(this, 1));
        }
        m();
        this.c.start();
    }

    @Override // defpackage.f2
    public final void l() {
        this.j = null;
    }

    public final void m() {
        this.g = 0;
        Iterator it = ((ArrayList) this.b).iterator();
        while (it.hasNext()) {
            ((gu5) it.next()).c = this.f.c[0];
        }
    }
}
