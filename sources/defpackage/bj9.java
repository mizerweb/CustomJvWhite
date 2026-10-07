package defpackage;

import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieFactory;
import one.me.rlottie.RLottieImageView;
import one.me.rlottie.RLottieImageViewUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class bj9 extends RLottieImageView implements RLottieDrawable.OnNextFrameRenderedListener, RLottieDrawable.DrawableLoadListener, cj9 {
    public String j;
    public boolean k;
    public aj9 l;
    public zi9 m;

    public final boolean a(int i, int i2, String str) {
        if (str == null || str.length() == 0) {
            f();
            return true;
        }
        String str2 = this.j;
        if (str2 != null && cqk.d(str2, str)) {
            return false;
        }
        this.k = true;
        this.j = str;
        RLottieDrawable rLottieDrawableCreate = RLottieFactory.create(new RLottieFactory.Config.Builder().setAutoStart(true).setAutoRepeat(true).setWay(new RLottieFactory.Way.Url.Builder().setUrl(str).setSize(i, i2).setNetworkFetchEnabled(true).build()).build());
        rLottieDrawableCreate.addDrawableLoadListener(this);
        rLottieDrawableCreate.addOnNextFrameRenderedListener(this);
        RLottieImageViewUtils.setLottieDrawable(this, rLottieDrawableCreate);
        return true;
    }

    @Override // defpackage.cj9
    public final void f() {
        RLottieImageViewUtils.release(this);
        this.j = null;
    }

    @Override // one.me.rlottie.RLottieDrawable.DrawableLoadListener
    public final void onError(Throwable th) {
        if (this.m != null) {
            gm0.V(fj9.class.getName(), "lottie set animation failed: ", th);
        }
    }

    @Override // one.me.rlottie.RLottieDrawable.DrawableLoadListener
    public final void onLoaded(RLottieDrawable rLottieDrawable) {
        gm0.m(bj9.class.getName(), "onLoaded %s", rLottieDrawable);
    }

    @Override // one.me.rlottie.RLottieDrawable.OnNextFrameRenderedListener
    public final void onNextFrameRendered(RLottieDrawable rLottieDrawable, int i) {
        if (this.k) {
            aj9 aj9Var = this.l;
            if (aj9Var != null) {
                aj9Var.c();
            }
            this.k = false;
        }
    }

    public final void setFailureListener(zi9 zi9Var) {
        this.m = zi9Var;
    }

    public final void setOnFirstFrameListener(aj9 aj9Var) {
        this.l = aj9Var;
        this.k = true;
    }
}
