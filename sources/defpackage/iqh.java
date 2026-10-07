package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class iqh implements af7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c70 b;
    public final /* synthetic */ qg2 c;

    public /* synthetic */ iqh(c70 c70Var, qg2 qg2Var, int i) {
        this.a = i;
        this.b = c70Var;
        this.c = qg2Var;
    }

    @Override // defpackage.af7
    public final Object invoke() {
        int i = this.a;
        qg2 qg2Var = this.c;
        c70 c70Var = this.b;
        switch (i) {
            case 0:
                ((jg2) c70Var.e).getClass();
                HandlerThread handlerThread = new HandlerThread("CXCP-Camera-H", c70Var.c);
                handlerThread.start();
                qg2Var.a(new hqh(handlerThread, 0), 3);
                return new Handler(handlerThread.getLooper());
            default:
                Executor executor = ((jg2) c70Var.e).a;
                if (executor != null) {
                    return executor;
                }
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1, new yh(c70Var.c, new zh(bi.b, "CXCP-Camera-E", gvk.b(0))));
                qg2Var.a(new f4g(10, executorServiceNewFixedThreadPool), 3);
                return executorServiceNewFixedThreadPool;
        }
    }
}
