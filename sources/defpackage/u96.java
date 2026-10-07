package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class u96 extends zt5 implements Animatable {
    public final EnhancedAnimatedVectorDrawable b;
    public t96 c;

    public u96(EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable) {
        super(enhancedAnimatedVectorDrawable);
        this.b = enhancedAnimatedVectorDrawable;
    }

    public void a() {
    }

    public void b() {
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.c == null) {
            t96 t96Var = new t96(this, 0);
            this.c = t96Var;
            this.b.registerAnimationCallback(t96Var);
        }
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.b.isRunning();
    }

    public void start() {
        Drawable.Callback callback = getCallback();
        EnhancedAnimatedVectorDrawable enhancedAnimatedVectorDrawable = this.b;
        if (callback == null) {
            t96 t96Var = this.c;
            if (t96Var != null) {
                enhancedAnimatedVectorDrawable.unregisterAnimationCallback(t96Var);
            }
            this.c = null;
        }
        if (this.c != null) {
            enhancedAnimatedVectorDrawable.start();
        }
    }

    public void stop() {
        this.b.stop();
    }
}
