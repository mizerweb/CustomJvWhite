package defpackage;

import android.view.animation.AccelerateDecelerateInterpolator;

/* JADX INFO: loaded from: classes3.dex */
public final class os6 {
    public float c;
    public float d;
    public float f;
    public float g;
    public float h;
    public float k;
    public final /* synthetic */ ps6 m;
    public final float a = 1.0f / ((float) Math.sqrt(2.0d));
    public final int b = gm0.K(yl5.d().getDisplayMetrics().density * 2.0f);
    public final float e = gm0.K(2.0f * yl5.d().getDisplayMetrics().density);
    public float i = 1.0f;
    public int j = -1;
    public final AccelerateDecelerateInterpolator l = new AccelerateDecelerateInterpolator();

    public os6(ps6 ps6Var) {
        this.m = ps6Var;
    }

    public final String toString() {
        return uqi.i("(%.1f, %.1f, %.1f)", Float.valueOf(this.f), Float.valueOf(this.g), Float.valueOf(this.h));
    }
}
