package defpackage;

import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class d6e implements RLottieDrawable.OnAllFramesRenderedListener {
    public boolean a;
    public final /* synthetic */ e6e b;
    public final /* synthetic */ RLottieImageView c;

    public d6e(e6e e6eVar, RLottieImageView rLottieImageView) {
        this.b = e6eVar;
        this.c = rLottieImageView;
    }

    @Override // one.me.rlottie.RLottieDrawable.OnAllFramesRenderedListener
    public final void onAllFramesRendered(RLottieDrawable rLottieDrawable, boolean z) {
        e6e e6eVar = this.b;
        gm0.n(e6eVar.a, "Reaction effect. OnAllFramesRendered, called:" + this.a);
        if (this.a) {
            return;
        }
        e6eVar.post(new d86(this, e6eVar, this.c, 23));
    }
}
