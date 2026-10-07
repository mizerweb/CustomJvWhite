package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import one.me.sdk.media.ffmpeg.AnimatedFileDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class nuj extends ImageView implements AnimatedFileDrawable.OnNextFrameRenderedListener, cj9 {
    public String a;
    public boolean b;
    public muj c;
    public boolean d;
    public AnimatedFileDrawable e;
    public final gn f;

    public nuj(Context context) {
        super(context, null);
        this.f = new gn(7, this);
    }

    @Override // defpackage.cj9
    public final void b() {
        AnimatedFileDrawable animatedFileDrawable;
        if (this.e == null) {
            return;
        }
        this.d = false;
        if (!isAttachedToWindow() || (animatedFileDrawable = this.e) == null) {
            return;
        }
        animatedFileDrawable.stop();
    }

    @Override // defpackage.cj9
    public final void e() {
        AnimatedFileDrawable animatedFileDrawable;
        this.d = true;
        if (!isAttachedToWindow() || (animatedFileDrawable = this.e) == null) {
            return;
        }
        animatedFileDrawable.start();
    }

    @Override // defpackage.cj9
    public final void f() {
        AnimatedFileDrawable animatedFileDrawable;
        if (this.e != null) {
            this.d = false;
            if (isAttachedToWindow() && (animatedFileDrawable = this.e) != null) {
                animatedFileDrawable.stop();
            }
        }
        AnimatedFileDrawable animatedFileDrawable2 = this.e;
        if (animatedFileDrawable2 != null) {
            animatedFileDrawable2.recycle();
        }
        AnimatedFileDrawable animatedFileDrawable3 = this.e;
        if (animatedFileDrawable3 != null) {
            animatedFileDrawable3.stop();
        }
        this.e = null;
        setImageDrawable(null);
        this.a = null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        AnimatedFileDrawable animatedFileDrawable;
        super.onAttachedToWindow();
        AnimatedFileDrawable animatedFileDrawable2 = this.e;
        if (animatedFileDrawable2 != null) {
            animatedFileDrawable2.setCallback(this);
        }
        AnimatedFileDrawable animatedFileDrawable3 = this.e;
        if (animatedFileDrawable3 != null) {
            animatedFileDrawable3.addParent(this.f);
        }
        if (!this.d || (animatedFileDrawable = this.e) == null) {
            return;
        }
        animatedFileDrawable.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatedFileDrawable animatedFileDrawable = this.e;
        if (animatedFileDrawable != null) {
            animatedFileDrawable.stop();
        }
        AnimatedFileDrawable animatedFileDrawable2 = this.e;
        if (animatedFileDrawable2 != null) {
            animatedFileDrawable2.removeParent(this.f);
        }
    }

    @Override // one.me.sdk.media.ffmpeg.AnimatedFileDrawable.OnNextFrameRenderedListener
    public final void onNextFrameRendered(AnimatedFileDrawable animatedFileDrawable) {
        if (this.b) {
            muj mujVar = this.c;
            if (mujVar != null) {
                ouj oujVar = (ouj) ((atj) mujVar).b;
                ((l1c) oujVar.a.b).setVisibility(8);
                if (oujVar.c) {
                    oujVar.d = true;
                }
            }
            this.b = false;
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (drawable instanceof AnimatedFileDrawable) {
            AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
            this.e = animatedFileDrawable;
            gn gnVar = this.f;
            animatedFileDrawable.removeParent(gnVar);
            animatedFileDrawable.addParent(gnVar);
            this.d = true;
        } else {
            this.d = false;
        }
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        this.e = null;
    }

    public final void setOnFirstFrameListener(muj mujVar) {
        this.c = mujVar;
        this.b = true;
    }
}
