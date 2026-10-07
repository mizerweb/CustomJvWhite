package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class ljh {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public volatile roe c;

    public static void f(Executor executor, af7 af7Var) {
        if (executor != null) {
            executor.execute(new eq0(12, af7Var));
        } else {
            ((Handler) skh.b.getValue()).post(new eq0(13, af7Var));
        }
    }

    public final void a(ptb ptbVar, Executor executor) {
        synchronized (this) {
            try {
                roe roeVar = this.c;
                if (roeVar == null) {
                    this.b.add(new t64(ptbVar, executor));
                } else {
                    f(executor, new kr0(ptbVar, 6, roe.a(roeVar.a)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(bub bubVar, stb stbVar) {
        synchronized (this) {
            try {
                roe roeVar = this.c;
                if (roeVar == null) {
                    this.a.add(new o89(bubVar, stbVar));
                } else {
                    Object obj = roeVar.a;
                    Object obj2 = obj instanceof poe ? null : obj;
                    Throwable thA = roe.a(obj);
                    if (obj2 != null && bubVar != null) {
                        f(null, new hjh(bubVar, obj2, 0));
                    }
                    if (thA != null && stbVar != null) {
                        f(null, new ijh(stbVar, thA, 0));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(stb stbVar) {
        b(null, stbVar);
    }

    public final void d(bub bubVar) {
        b(bubVar, null);
    }

    public final Object e() throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (this.c != null) {
            countDownLatch.countDown();
        } else {
            a(new vuf(11, countDownLatch), (ExecutorService) skh.a.getValue());
        }
        countDownLatch.await();
        roe roeVar = this.c;
        if (roeVar == null) {
            ore.p("Required value was null.");
            return null;
        }
        Object obj = roeVar.a;
        ch3.d0(obj);
        return obj;
    }

    public final void g(Throwable th) {
        synchronized (this) {
            if (this.c != null) {
                return;
            }
            this.c = new roe(new poe(th));
            awl.a(this.a, new jjh(this, th, 1));
            awl.a(this.b, new jjh(this, th, 0));
        }
    }
}
