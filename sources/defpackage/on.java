package defpackage;

import java.util.LinkedHashSet;
import one.me.rlottie.ImageReceiver;
import one.me.rlottie.RLottieDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final class on implements RLottieDrawable.DrawableLoadListener {
    public final /* synthetic */ qn a;
    public final /* synthetic */ yl b;
    public final /* synthetic */ RLottieDrawable c;

    public on(qn qnVar, yl ylVar, RLottieDrawable rLottieDrawable) {
        this.a = qnVar;
        this.b = ylVar;
        this.c = rLottieDrawable;
    }

    @Override // one.me.rlottie.RLottieDrawable.DrawableLoadListener
    public final void onError(Throwable th) {
        String str = this.a.f;
        yl ylVar = this.b;
        a4c a4cVar = gm0.f;
        if (a4cVar != null) {
            je9 je9Var = je9.f;
            if (a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, "Animoji lottie " + ylVar + " download. Fail", th);
            }
        }
        String str2 = this.b.b;
        if (str2 == null || str2.length() == 0) {
            this.a.o(mn.a);
        } else {
            this.a.l(this.b.b);
        }
        RLottieDrawable rLottieDrawable = this.a.o;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(null);
        }
        qn qnVar = this.a;
        qnVar.o = null;
        qnVar.r.clear();
        this.c.removeDrawableLoadListener(this);
    }

    @Override // one.me.rlottie.RLottieDrawable.DrawableLoadListener
    public final void onLoaded(RLottieDrawable rLottieDrawable) {
        qn qnVar = this.a;
        ny8 ny8Var = qnVar.q;
        LinkedHashSet<ImageReceiver> linkedHashSet = qnVar.r;
        rLottieDrawable.setCallback(qnVar.l);
        qnVar.o = rLottieDrawable;
        if (!rLottieDrawable.isRunning() && cqk.x(qnVar.g)) {
            rLottieDrawable.start();
        }
        rLottieDrawable.invalidateInternal();
        for (ImageReceiver imageReceiver : linkedHashSet) {
            RLottieDrawable rLottieDrawable2 = qnVar.o;
            if (rLottieDrawable2 != null) {
                rLottieDrawable2.addParentView(imageReceiver);
            }
        }
        linkedHashSet.clear();
        if (rLottieDrawable.getBounds().isEmpty()) {
            rLottieDrawable.setBounds(qnVar.getBounds());
        }
        if (rLottieDrawable.getRenderingBitmap() != null) {
            qnVar.o(mn.e);
        } else {
            qnVar.o(mn.d);
            if (!rLottieDrawable.hasOnNextFrameRenderedListener((pn) ny8Var.getValue())) {
                rLottieDrawable.addOnNextFrameRenderedListener((pn) ny8Var.getValue());
            }
            qnVar.invalidateSelf();
        }
        rLottieDrawable.removeDrawableLoadListener(this);
    }
}
