package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gwl {
    public static Object a(Task task) throws InterruptedException {
        yab.r("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            ore.k("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        yab.t(task, "Task must not be null");
        if (task.i()) {
            return g(task);
        }
        yki ykiVar = new yki(7);
        Executor executor = vjh.b;
        task.e(executor, ykiVar);
        task.d(executor, ykiVar);
        task.a(executor, ykiVar);
        ((CountDownLatch) ykiVar.a).await();
        return g(task);
    }

    public static Object b(Task task, long j) throws TimeoutException {
        yab.r("Must not be called on the main application thread");
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper != null && Objects.equals(looperMyLooper.getThread().getName(), "GoogleApiHandler")) {
            ore.k("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        yab.t(task, "Task must not be null");
        TimeUnit timeUnit = TimeUnit.SECONDS;
        yab.t(timeUnit, "TimeUnit must not be null");
        if (task.i()) {
            return g(task);
        }
        yki ykiVar = new yki(7);
        Executor executor = vjh.b;
        task.e(executor, ykiVar);
        task.d(executor, ykiVar);
        task.a(executor, ykiVar);
        if (((CountDownLatch) ykiVar.a).await(j, timeUnit)) {
            return g(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static kam c(Callable callable, Executor executor) {
        yab.t(executor, "Executor must not be null");
        kam kamVar = new kam();
        executor.execute(new txj(kamVar, 6, callable));
        return kamVar;
    }

    public static kam d(Exception exc) {
        kam kamVar = new kam();
        kamVar.n(exc);
        return kamVar;
    }

    public static kam e(Object obj) {
        kam kamVar = new kam();
        kamVar.o(obj);
        return kamVar;
    }

    public static String f(Context context, int i) {
        if (context == null) {
            return "";
        }
        if (i == 1) {
            return context.getString(R.string.fingerprint_error_hw_not_available);
        }
        if (i != 7) {
            switch (i) {
                case 9:
                    break;
                case 10:
                    return context.getString(R.string.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(R.string.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(R.string.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i);
                    return context.getString(R.string.default_error_msg);
            }
        }
        return context.getString(R.string.fingerprint_error_lockout);
    }

    public static Object g(Task task) throws ExecutionException {
        if (task.j()) {
            return task.h();
        }
        if (((kam) task).d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.g());
    }
}
