package defpackage;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import one.me.rlottie.RLottieDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s3e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ RLottieDrawable b;

    public /* synthetic */ s3e(RLottieDrawable rLottieDrawable, int i) {
        this.a = i;
        this.b = rLottieDrawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        RLottieDrawable rLottieDrawable = this.b;
        switch (i) {
            case 0:
                rLottieDrawable.invalidateInternal();
                break;
            default:
                Gson gson = RLottieDrawable.gson;
                Iterator it = new ArrayList(rLottieDrawable.S1).iterator();
                while (it.hasNext()) {
                    ((RLottieDrawable.DrawableLoadListener) it.next()).onLoaded(rLottieDrawable);
                }
                break;
        }
    }
}
