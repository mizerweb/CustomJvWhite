package defpackage;

import one.me.rlottie.RLottieDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class pn implements RLottieDrawable.OnNextFrameRenderedListener {
    public final /* synthetic */ qn a;

    public pn(qn qnVar) {
        this.a = qnVar;
    }

    @Override // one.me.rlottie.RLottieDrawable.OnNextFrameRenderedListener
    public final void onNextFrameRendered(RLottieDrawable rLottieDrawable, int i) {
        mn mnVar = mn.e;
        qn qnVar = this.a;
        qnVar.o(mnVar);
        rLottieDrawable.removeOnNextFrameRenderedListener(this);
        qnVar.invalidateSelf();
    }
}
