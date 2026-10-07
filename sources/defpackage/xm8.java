package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes4.dex */
public final class xm8 implements Executor {
    public static volatile xm8 c;
    public final /* synthetic */ int a;
    public final Object b;

    public xm8() {
        this.a = 0;
        this.b = Executors.newFixedThreadPool(2, new f80(2));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ExecutorService) obj).execute(runnable);
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
                ((Executor) obj).execute(new kye(runnable, 0));
                break;
        }
    }

    public /* synthetic */ xm8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
