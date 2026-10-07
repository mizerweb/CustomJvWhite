package defpackage;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c72 implements TimeInterpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (((float) Math.pow(9.0d, f)) - 1.0f) / 8.0f;
    }
}
