package defpackage;

import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mm3 {
    public static final PathInterpolator a = new PathInterpolator(0.33f, 0.0f, 0.67f, 1.0f);
    public static final PathInterpolator b = new PathInterpolator(0.4f, 0.0f, 0.0f, 1.0f);

    public static PathInterpolator a() {
        return a;
    }

    public static PathInterpolator b() {
        return b;
    }
}
