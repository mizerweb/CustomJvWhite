package defpackage;

import android.content.Context;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import one.me.sdk.richvector.VectorPath;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes3.dex */
public final class oi extends u96 {
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;

    public oi(Context context) {
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = new EnhancedAnimatedVectorDrawable(context, R.drawable.ic_animated_clock);
        super(enhancedAnimatedVectorDrawable);
        this.d = rx8.P(3, new ni(enhancedAnimatedVectorDrawable, 0));
        this.e = rx8.P(3, new ni(enhancedAnimatedVectorDrawable, 1));
        this.f = rx8.P(3, new ni(enhancedAnimatedVectorDrawable, 2));
    }

    public final void c(int i) {
        VectorPath vectorPath = (VectorPath) this.d.getValue();
        if (vectorPath != null) {
            vectorPath.setStrokeColor(i);
        }
        VectorPath vectorPath2 = (VectorPath) this.e.getValue();
        if (vectorPath2 != null) {
            vectorPath2.setStrokeColor(i);
        }
        VectorPath vectorPath3 = (VectorPath) this.f.getValue();
        if (vectorPath3 != null) {
            vectorPath3.setStrokeColor(i);
        }
        this.b.invalidatePath();
    }

    public final void d(int i, int i2) {
        int iB = mx3.b(i2, ((i >> 24) & 255) / 255.0f, tre.I0(i, 1.0f));
        VectorPath vectorPath = (VectorPath) this.d.getValue();
        if (vectorPath != null) {
            vectorPath.setStrokeColor(iB);
        }
        VectorPath vectorPath2 = (VectorPath) this.e.getValue();
        if (vectorPath2 != null) {
            vectorPath2.setStrokeColor(iB);
        }
        VectorPath vectorPath3 = (VectorPath) this.f.getValue();
        if (vectorPath3 != null) {
            vectorPath3.setStrokeColor(iB);
        }
        this.b.invalidatePath();
    }
}
