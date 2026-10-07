package one.me.rlottie;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import defpackage.cs;
import defpackage.di;
import defpackage.zo5;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class RLottieImageView extends cs {
    public boolean cached;
    public HashMap d;
    public RLottieDrawable e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    public RLottieImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.i = false;
    }

    public void b() {
        stopAnimation();
    }

    public void clearAnimationDrawable() {
        RLottieDrawable rLottieDrawable = this.e;
        if (rLottieDrawable != null) {
            rLottieDrawable.stop();
        }
        this.e = null;
        setImageDrawable(null);
    }

    public void clearLayerColors() {
        this.d.clear();
    }

    public void e() {
        playAnimation();
    }

    public RLottieDrawable getAnimatedDrawable() {
        return this.e;
    }

    public ImageReceiver getImageReceiver() {
        return null;
    }

    public boolean isPlaying() {
        RLottieDrawable rLottieDrawable = this.e;
        return rLottieDrawable != null && rLottieDrawable.isRunning();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g = true;
        RLottieDrawable rLottieDrawable = this.e;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(this);
            if (this.h) {
                this.e.start();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g = false;
        RLottieDrawable rLottieDrawable = this.e;
        if (rLottieDrawable != null) {
            rLottieDrawable.stop();
        }
    }

    public void playAnimation() {
        RLottieDrawable rLottieDrawable = this.e;
        if (rLottieDrawable == null) {
            return;
        }
        this.h = true;
        if (!this.g || rLottieDrawable == null) {
            return;
        }
        rLottieDrawable.start();
    }

    public void replaceColors(int[] iArr) {
        RLottieDrawable rLottieDrawable = this.e;
        if (rLottieDrawable != null) {
            rLottieDrawable.replaceColors(iArr);
        }
    }

    public void setAnimation(RLottieDrawable rLottieDrawable) {
        if (this.e == rLottieDrawable) {
            return;
        }
        this.e = rLottieDrawable;
        rLottieDrawable.setMasterParent(this);
        if (this.f) {
            this.e.setAutoRepeat(1);
        }
        if (this.d != null) {
            this.e.beginApplyLayerColors();
            for (Map.Entry entry : this.d.entrySet()) {
                this.e.setLayerColor((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
            }
            this.e.commitApplyLayerColors();
        }
        this.e.setAllowDecodeSingleFrame(true);
        setImageDrawable(this.e);
    }

    public void setAutoRepeat(boolean z) {
        this.f = z;
        this.i = true;
        RLottieDrawable rLottieDrawable = this.e;
        if (rLottieDrawable == null || !z) {
            return;
        }
        rLottieDrawable.setAutoRepeat(1);
    }

    @Override // defpackage.cs, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (drawable instanceof RLottieDrawable) {
            RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
            this.e = rLottieDrawable;
            if (this.i) {
                if (this.f) {
                    rLottieDrawable.setAutoRepeat(1);
                } else {
                    rLottieDrawable.setAutoRepeat(0);
                }
            }
            this.e.setMasterParent(this);
            if (this.f) {
                this.e.setAutoRepeat(1);
            }
            if (this.d != null) {
                this.e.beginApplyLayerColors();
                for (Map.Entry entry : this.d.entrySet()) {
                    this.e.setLayerColor((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
                this.e.commitApplyLayerColors();
            }
            this.e.setAllowDecodeSingleFrame(true);
            this.h = this.e.p1;
        } else {
            this.h = false;
        }
        super.setImageDrawable(this.e);
    }

    @Override // defpackage.cs, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        this.e = null;
    }

    public void setLayerColor(String str, int i) {
        if (this.d == null) {
            this.d = new HashMap();
        }
        this.d.put(str, Integer.valueOf(i));
        RLottieDrawable rLottieDrawable = this.e;
        if (rLottieDrawable != null) {
            rLottieDrawable.setLayerColor(str, i);
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        RLottieDrawable rLottieDrawable = this.e;
        if (rLottieDrawable != null) {
            rLottieDrawable.setOnAnimationEndListener(runnable);
        }
    }

    public void setOnlyLastFrame(boolean z) {
    }

    public void setProgress(float f) {
        RLottieDrawable rLottieDrawable = this.e;
        if (rLottieDrawable != null) {
            rLottieDrawable.setProgress(f);
        }
    }

    public void setReverse() {
        RLottieDrawable rLottieDrawable = this.e;
        if (rLottieDrawable != null) {
            rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
            RLottieDrawable rLottieDrawable2 = this.e;
            rLottieDrawable2.setCurrentFrame(rLottieDrawable2.getFramesCount());
            this.e.setCustomEndFrame(0);
        }
    }

    public void stopAnimation() {
        RLottieDrawable rLottieDrawable = this.e;
        if (rLottieDrawable == null) {
            return;
        }
        this.h = false;
        if (!this.g || rLottieDrawable == null) {
            return;
        }
        rLottieDrawable.stop();
    }

    public RLottieImageView(Context context) {
        this(context, null);
    }

    public void setAnimation(int i, int i2, int i3, int[] iArr) {
        setAnimation(new RLottieDrawable(i, zo5.h(i, ""), di.a(i2), di.a(i3), false, iArr));
    }

    public void setAnimation(int i, int i2, int i3) {
        setAnimation(i, i2, i3, null);
    }
}
