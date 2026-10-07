package defpackage;

import com.google.gson.Gson;
import one.me.rlottie.RLottie;
import one.me.rlottie.RLottieDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t3e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RLottieDrawable b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ t3e(RLottieDrawable rLottieDrawable, Runnable runnable, int i) {
        this.a = i;
        this.b = rLottieDrawable;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.c;
        RLottieDrawable rLottieDrawable = this.b;
        switch (i) {
            case 0:
                Gson gson = RLottieDrawable.gson;
                try {
                    uy0 uy0Var = rLottieDrawable.G1;
                    if (uy0Var != null) {
                        uy0Var.b();
                    }
                } catch (Throwable th) {
                    RLottie.getLogger().h(th);
                }
                di.d(new t3e(rLottieDrawable, runnable, 1));
                break;
            default:
                Gson gson2 = RLottieDrawable.gson;
                runnable.run();
                if (rLottieDrawable.v != null) {
                    rLottieDrawable.v = null;
                    uy0.c();
                }
                break;
        }
    }
}
