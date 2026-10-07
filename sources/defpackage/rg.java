package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class rg implements Executor {
    public final /* synthetic */ int a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                new Handler(Looper.getMainLooper()).post(runnable);
                break;
            case 1:
                new Thread(runnable).start();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
