package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final class gx0 implements Executor {
    public static volatile gx0 c;
    public final /* synthetic */ int a;
    public final Object b;

    public gx0(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = Executors.newSingleThreadExecutor(new ov7(0));
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
                runnable.getClass();
                if (!handler.post(runnable)) {
                    o75.g(handler);
                    break;
                }
                break;
            default:
                ((ExecutorService) obj).execute(runnable);
                break;
        }
    }

    public gx0(Handler handler) {
        this.a = 1;
        this.b = handler;
    }
}
