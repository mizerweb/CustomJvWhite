package defpackage;

import android.view.animation.AccelerateInterpolator;

/* JADX INFO: loaded from: classes3.dex */
public final class ns6 {
    public long a = qx6.a(gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), gm0.K(yl5.d().getDisplayMetrics().density * 0.0f));
    public long b = qx6.a(gm0.K(yl5.d().getDisplayMetrics().density * 0.0f), gm0.K(yl5.d().getDisplayMetrics().density * 0.0f));
    public long c = qx6.a(gm0.K(yl5.d().getDisplayMetrics().density * 8.0f), gm0.K(yl5.d().getDisplayMetrics().density * 0.0f));
    public long d = qx6.a(gm0.K(8.0f * yl5.d().getDisplayMetrics().density), gm0.K(0.0f * yl5.d().getDisplayMetrics().density));
    public final float e = yl5.d().getDisplayMetrics().density * 1.5f;
    public long f = bj8.a(-1, -1);
    public final AccelerateInterpolator g = new AccelerateInterpolator();
    public float h = 1.0f;
    public float i;
    public float j;
    public final /* synthetic */ ps6 k;

    public ns6(ps6 ps6Var) {
        this.k = ps6Var;
    }

    public final String toString() {
        return uqi.i("(%.1f, %.1f, %.1f)", Float.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.h));
    }
}
