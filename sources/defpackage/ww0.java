package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class ww0 implements Executor {
    public static volatile ww0 c;
    public final /* synthetic */ int a;
    public final Object b;

    public ww0(int i) {
        this.a = i;
        switch (i) {
            case 3:
                this.b = Executors.newFixedThreadPool(2, new f80(0));
                break;
            default:
                this.b = new Handler(Looper.getMainLooper());
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Handler) obj).post(runnable);
                break;
            case 1:
                Handler handler = (Handler) obj;
                if (!handler.post(runnable)) {
                    o75.g(handler);
                    break;
                }
                break;
            case 2:
                ((Handler) obj).post(runnable);
                break;
            default:
                ((ExecutorService) obj).execute(runnable);
                break;
        }
    }

    public /* synthetic */ ww0(Handler handler, int i) {
        this.a = i;
        this.b = handler;
    }
}
