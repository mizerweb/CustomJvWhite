package defpackage;

import android.os.Process;
import com.google.gson.Gson;
import one.me.rlottie.RLottieDrawable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ e80(aid aidVar, Runnable runnable) {
        this.a = 2;
        this.b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Runnable runnable = this.b;
        switch (i) {
            case 0:
                Process.setThreadPriority(-16);
                runnable.run();
                break;
            case 1:
                Process.setThreadPriority(-3);
                runnable.run();
                break;
            case 2:
                try {
                    Process.setThreadPriority(10);
                    break;
                } catch (Throwable unused) {
                }
                runnable.run();
                break;
            case 3:
                Gson gson = RLottieDrawable.gson;
                di.d(runnable);
                break;
            default:
                Gson gson2 = RLottieDrawable.gson;
                di.d(runnable);
                break;
        }
    }

    public /* synthetic */ e80(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }
}
