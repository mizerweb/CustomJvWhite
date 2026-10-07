package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rwj {
    public final int a;
    public float b;
    public final Interpolator c;
    public final long d;

    public rwj(int i, Interpolator interpolator, long j) {
        this.a = i;
        this.c = interpolator;
        this.d = j;
    }

    public long a() {
        return this.d;
    }

    public float b() {
        float f = this.b;
        Interpolator interpolator = this.c;
        return interpolator != null ? interpolator.getInterpolation(f) : f;
    }

    public int c() {
        return this.a;
    }

    public void d(float f) {
        this.b = f;
    }
}
