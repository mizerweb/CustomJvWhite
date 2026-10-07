package defpackage;

import android.view.View;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class b6e implements View.OnAttachStateChangeListener {
    public final /* synthetic */ RLottieImageView a;
    public final /* synthetic */ e6e b;
    public final /* synthetic */ RLottieDrawable c;
    public final /* synthetic */ c6e d;
    public final /* synthetic */ d6e e;

    public b6e(RLottieImageView rLottieImageView, e6e e6eVar, RLottieDrawable rLottieDrawable, c6e c6eVar, d6e d6eVar) {
        this.a = rLottieImageView;
        this.b = e6eVar;
        this.c = rLottieDrawable;
        this.d = c6eVar;
        this.e = d6eVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.removeOnAttachStateChangeListener(this);
        gm0.n(this.b.a, "onDetach");
        c6e c6eVar = this.d;
        RLottieDrawable rLottieDrawable = this.c;
        rLottieDrawable.removeDrawableLoadListener(c6eVar);
        rLottieDrawable.removeOnAllFramesRenderedListener(this.e);
    }
}
