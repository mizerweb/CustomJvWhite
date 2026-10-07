package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class zj9 {
    private static final Object b = new Object();
    private static zj9 c;
    private final Handler a;

    private zj9(Looper looper) {
        z0b z0bVar = new z0b(looper, 1);
        Looper.getMainLooper();
        this.a = z0bVar;
    }

    public static zj9 b() {
        zj9 zj9Var;
        synchronized (b) {
            try {
                if (c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    c = new zj9(handlerThread.getLooper());
                }
                zj9Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zj9Var;
    }

    public static Executor g() {
        return acl.a;
    }

    public Handler a() {
        return this.a;
    }

    public <ResultT> Task c(final Callable<ResultT> callable) {
        final qjh qjhVar = new qjh();
        d(new Runnable() { // from class: j5l
            @Override // java.lang.Runnable
            public final void run() {
                Callable callable2 = callable;
                qjh qjhVar2 = qjhVar;
                try {
                    qjhVar2.b(callable2.call());
                } catch (MlKitException e) {
                    qjhVar2.a(e);
                } catch (Exception e2) {
                    qjhVar2.a(new MlKitException("Internal error has occurred when executing ML Kit tasks", 13, e2));
                }
            }
        });
        return qjhVar.a;
    }

    public void d(Runnable runnable) {
        g().execute(runnable);
    }

    public void e(Runnable runnable, long j) {
        this.a.postDelayed(runnable, j);
    }

    public <ResultT> Task f(Callable<Task> callable) {
        return c(callable).f(epk.a, new kq4() { // from class: t8l
            @Override // defpackage.kq4
            public final Object h(Task task) {
                return (Task) task.h();
            }
        });
    }
}
