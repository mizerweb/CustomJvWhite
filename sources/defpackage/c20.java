package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c20 implements Executor {
    public final /* synthetic */ int a;
    public Object b;

    public c20(int i) {
        this.a = i;
        switch (i) {
            case 1:
                break;
            case 2:
            default:
                this.b = new Handler(Looper.getMainLooper());
                break;
            case 3:
                bmk bmkVar = new bmk(Looper.getMainLooper());
                Looper.getMainLooper();
                this.b = bmkVar;
                break;
        }
    }

    public void a() {
        ThreadLocal threadLocal = (ThreadLocal) this.b;
        Integer num = (Integer) threadLocal.get();
        if (num == null) {
            num = 0;
        }
        int iIntValue = num.intValue() - 1;
        if (iIntValue == 0) {
            threadLocal.remove();
        } else {
            threadLocal.set(Integer.valueOf(iIntValue));
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((Handler) this.b).post(runnable);
                return;
            case 1:
                ThreadLocal threadLocal = (ThreadLocal) this.b;
                Integer num = (Integer) threadLocal.get();
                if (num == null) {
                    num = 0;
                }
                int iIntValue = num.intValue() + 1;
                threadLocal.set(Integer.valueOf(iIntValue));
                try {
                    if (iIntValue <= 15) {
                        runnable.run();
                    } else {
                        wz0.d.a.execute(runnable);
                    }
                    a();
                    return;
                } catch (Throwable th) {
                    a();
                    throw th;
                }
            case 2:
                ((azj) this.b).c.post(runnable);
                return;
            default:
                ((bmk) this.b).post(runnable);
                return;
        }
    }

    public c20(azj azjVar) {
        this.a = 2;
        this.b = azjVar;
    }
}
