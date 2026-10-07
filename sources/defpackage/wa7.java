package defpackage;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes4.dex */
public final class wa7 extends AnimationSet implements Runnable {
    public final ViewGroup a;
    public boolean b;
    public boolean c;
    public boolean d;

    public wa7(Animation animation, ViewGroup viewGroup) {
        super(false);
        this.d = true;
        this.a = viewGroup;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.d = true;
        if (this.b) {
            return !this.c;
        }
        if (!super.getTransformation(j, transformation)) {
            this.b = true;
            bdc.a(this.a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.b;
        ViewGroup viewGroup = this.a;
        if (z || !this.d) {
            viewGroup.endViewTransition(null);
            this.c = true;
        } else {
            this.d = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.d = true;
        if (this.b) {
            return !this.c;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.b = true;
            bdc.a(this.a, this);
        }
        return true;
    }
}
