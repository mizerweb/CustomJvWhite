package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class bp2 extends lg7 implements Runnable {
    public u00 c;
    public final LinkedBlockingQueue d = new LinkedBlockingQueue(1);
    public final CountDownLatch e = new CountDownLatch(1);
    public e89 f;
    public volatile e89 g;

    public bp2(u00 u00Var, e89 e89Var) {
        this.c = u00Var;
        e89Var.getClass();
        this.f = e89Var;
    }

    public static Object d(LinkedBlockingQueue linkedBlockingQueue) {
        Object objTake;
        boolean z = false;
        while (true) {
            try {
                objTake = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return objTake;
    }

    @Override // defpackage.lg7, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.a.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.d.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        e89 e89Var = this.f;
        if (e89Var != null) {
            e89Var.cancel(z);
        }
        e89 e89Var2 = this.g;
        if (e89Var2 != null) {
            e89Var2.cancel(z);
        }
        return true;
    }

    @Override // defpackage.lg7, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.a.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            e89 e89Var = this.f;
            if (e89Var != null) {
                long jNanoTime = System.nanoTime();
                e89Var.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (!this.e.await(j, timeUnit)) {
                throw new TimeoutException();
            }
            j -= Math.max(0L, System.nanoTime() - jNanoTime2);
            e89 e89Var2 = this.g;
            if (e89Var2 != null) {
                e89Var2.get(j, timeUnit);
            }
        }
        return this.a.get(j, timeUnit);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [bp2, java.lang.Object, lg7] */
    /* JADX WARN: Type inference failed for: r5v1, types: [bp2] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v3, types: [lg7] */
    /* JADX WARN: Type inference failed for: r5v4, types: [bp2] */
    /* JADX WARN: Type inference failed for: r5v6, types: [lg7] */
    /* JADX WARN: Type inference failed for: r5v7, types: [lg7] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.concurrent.CountDownLatch] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            e89 r2 = r5.f     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39 java.util.concurrent.ExecutionException -> L49 java.util.concurrent.CancellationException -> L56
            java.lang.Object r2 = defpackage.o9b.e(r2)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39 java.util.concurrent.ExecutionException -> L49 java.util.concurrent.CancellationException -> L56
            u00 r3 = r5.c     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            e89 r2 = r3.apply(r2)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r5.g = r2     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            e89 r3 = r5.a     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            boolean r3 = r3.isCancelled()     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            if (r3 == 0) goto L3b
            java.util.concurrent.LinkedBlockingQueue r0 = r5.d     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            java.lang.Object r0 = d(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r2.cancel(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r5.g = r1     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
        L29:
            r5.c = r1
            r5.f = r1
            java.util.concurrent.CountDownLatch r5 = r5.e
            r5.countDown()
            return
        L33:
            r0 = move-exception
            goto L80
        L35:
            r0 = move-exception
            goto L5a
        L37:
            r0 = move-exception
            goto L6b
        L39:
            r0 = move-exception
            goto L73
        L3b:
            ng7 r3 = new ng7     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r4 = 4
            r3.<init>(r5, r2, r0, r4)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            jm5 r0 = defpackage.zjl.a()     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r2.b(r3, r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            goto L29
        L49:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            r72 r2 = r5.b     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            if (r2 == 0) goto L29
            r2.d(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            goto L29
        L56:
            r5.cancel(r0)     // Catch: java.lang.Throwable -> L33 java.lang.Error -> L35 java.lang.Exception -> L37 java.lang.reflect.UndeclaredThrowableException -> L39
            goto L29
        L5a:
            r72 r2 = r5.b     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L61
            r2.d(r0)     // Catch: java.lang.Throwable -> L33
        L61:
            r5.c = r1
            r5.f = r1
            java.util.concurrent.CountDownLatch r5 = r5.e
            r5.countDown()
            goto L7f
        L6b:
            r72 r2 = r5.b     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L61
            r2.d(r0)     // Catch: java.lang.Throwable -> L33
            goto L61
        L73:
            java.lang.Throwable r0 = r0.getCause()     // Catch: java.lang.Throwable -> L33
            r72 r2 = r5.b     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L61
            r2.d(r0)     // Catch: java.lang.Throwable -> L33
            goto L61
        L7f:
            return
        L80:
            r5.c = r1
            r5.f = r1
            java.util.concurrent.CountDownLatch r5 = r5.e
            r5.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp2.run():void");
    }

    @Override // defpackage.lg7, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (!this.a.isDone()) {
            e89 e89Var = this.f;
            if (e89Var != null) {
                e89Var.get();
            }
            this.e.await();
            e89 e89Var2 = this.g;
            if (e89Var2 != null) {
                e89Var2.get();
            }
        }
        return this.a.get();
    }
}
