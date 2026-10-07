package defpackage;

import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class c6e implements RLottieDrawable.DrawableLoadListener {
    public boolean a;
    public final /* synthetic */ e6e b;
    public final /* synthetic */ RLottieImageView c;

    public c6e(e6e e6eVar, RLottieImageView rLottieImageView) {
        this.b = e6eVar;
        this.c = rLottieImageView;
    }

    @Override // one.me.rlottie.RLottieDrawable.DrawableLoadListener
    public final void onLoaded(RLottieDrawable rLottieDrawable) {
        gm0.n(this.b.a, "Reaction effect. OnLoaded, called:" + this.a);
        if (this.a) {
            return;
        }
        this.a = true;
        this.c.playAnimation();
    }
}
