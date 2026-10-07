package defpackage;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes3.dex */
public final class l0g implements Interpolator {
    public final float a;
    public final /* synthetic */ m0g b;

    public l0g(long j, long j2, m0g m0gVar) {
        this.b = m0gVar;
        this.a = j / j2;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        float fU = oc9.u(f, 0.0f, 1.0f);
        float f2 = this.a;
        Interpolator interpolator = this.b.p;
        return fU < f2 ? interpolator.getInterpolation(fU / f2) : interpolator.getInterpolation(1.0f);
    }
}
