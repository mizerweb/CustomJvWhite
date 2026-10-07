package defpackage;

import com.google.gson.Gson;
import one.me.rlottie.RLottieDrawable;
import org.webrtc.JniCommon;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v4a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ v4a(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        long j = this.b;
        switch (i) {
            case 0:
                JniCommon.nativeReleaseRef(j);
                break;
            case 1:
                if (j != 0) {
                    RLottieDrawable.destroy(j);
                }
                Gson gson = RLottieDrawable.gson;
                break;
            default:
                if (j != 0) {
                    RLottieDrawable.destroy(j);
                }
                Gson gson2 = RLottieDrawable.gson;
                break;
        }
    }
}
