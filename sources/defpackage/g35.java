package defpackage;

import android.os.Binder;
import android.os.Process;
import androidx.core.os.OperationCanceledException;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g35 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g35(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((af7) obj).invoke();
            case 1:
                ((k36) obj).run();
                return null;
            case 2:
                ((Runnable) obj).run();
                return null;
            case 3:
                o30 o30Var = (o30) obj;
                AtomicBoolean atomicBoolean = o30Var.d;
                o30Var.e.set(true);
                try {
                    Process.setThreadPriority(10);
                    try {
                        o30Var.g.c();
                        break;
                    } catch (OperationCanceledException e) {
                        if (!atomicBoolean.get()) {
                            throw e;
                        }
                    }
                    Binder.flushPendingCommands();
                    o30Var.a(null);
                    return null;
                } catch (Throwable th) {
                    try {
                        atomicBoolean.set(true);
                        throw th;
                    } catch (Throwable th2) {
                        o30Var.a(null);
                        throw th2;
                    }
                }
            case 4:
                return j09.c.a(((ysl) obj).g);
            default:
                return j09.c.a(((s5m) obj).g);
        }
    }
}
