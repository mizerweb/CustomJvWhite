package defpackage;

import android.animation.TimeInterpolator;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes3.dex */
public final class ki implements TimeInterpolator {
    public final PathInterpolator a;
    public final PathInterpolator b;

    public ki(PathInterpolator pathInterpolator, PathInterpolator pathInterpolator2) {
        this.a = pathInterpolator;
        this.b = pathInterpolator2;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float fU = oc9.u(f, 0.0f, 1.0f);
        if (fU < 0.316f) {
            return this.a.getInterpolation(fU / 0.316f) * 0.316f;
        }
        return (this.b.getInterpolation(tqk.b(0.316f, 1.0f, fU)) * 0.684f) + 0.316f;
    }
}
