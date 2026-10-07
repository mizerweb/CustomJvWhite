package org.webrtc;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import defpackage.ore;
import defpackage.qr7;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class ThreadUtils {

    /* JADX INFO: renamed from: org.webrtc.ThreadUtils$1 */
    public class AnonymousClass1 implements BlockingOperation {
        final /* synthetic */ Thread val$thread;

        public AnonymousClass1() {
            thread = thread;
        }

        @Override // org.webrtc.ThreadUtils.BlockingOperation
        public void run() throws InterruptedException {
            thread.join();
        }
    }

    /* JADX INFO: renamed from: org.webrtc.ThreadUtils$1CaughtException */
    public class C1CaughtException {
        Exception e;
    }

    /* JADX INFO: renamed from: org.webrtc.ThreadUtils$1Result */
    public class C1Result {
        public V value;
    }

    /* JADX INFO: renamed from: org.webrtc.ThreadUtils$2 */
    public class AnonymousClass2 implements BlockingOperation {
        final /* synthetic */ CountDownLatch val$latch;

        public AnonymousClass2() {
            countDownLatch = countDownLatch;
        }

        @Override // org.webrtc.ThreadUtils.BlockingOperation
        public void run() throws InterruptedException {
            countDownLatch.await();
        }
    }

    /* JADX INFO: renamed from: org.webrtc.ThreadUtils$3 */
    public class AnonymousClass3 implements Runnable {
        final /* synthetic */ CountDownLatch val$barrier;
        final /* synthetic */ Callable val$callable;
        final /* synthetic */ C1CaughtException val$caughtException;

        public AnonymousClass3() {
            callable = callable;
            c1CaughtException = c1CaughtException;
            countDownLatch = countDownLatch;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [V, java.lang.Object] */
        @Override // java.lang.Runnable
        public void run() {
            try {
                c1Result.value = callable.call();
            } catch (Exception e) {
                c1CaughtException.e = e;
            }
            countDownLatch.countDown();
        }
    }

    /* JADX INFO: renamed from: org.webrtc.ThreadUtils$4 */
    public class AnonymousClass4 implements Callable<Void> {
        final /* synthetic */ Runnable val$runner;

        public AnonymousClass4() {
            runnable = runnable;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            runnable.run();
            return null;
        }
    }

    public interface BlockingOperation {
        void run() throws InterruptedException;
    }

    public static class ThreadChecker {
        private Thread thread = Thread.currentThread();

        public void checkIsOnValidThread() {
            if (this.thread == null) {
                this.thread = Thread.currentThread();
            }
            if (Thread.currentThread() == this.thread) {
                return;
            }
            ore.k("Wrong thread");
        }

        public void detachThread() {
            this.thread = null;
        }
    }

    public static boolean awaitUninterruptibly(CountDownLatch countDownLatch, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zAwait = false;
        long jElapsedRealtime2 = j;
        boolean z = false;
        while (true) {
            try {
                zAwait = countDownLatch.await(jElapsedRealtime2, TimeUnit.MILLISECONDS);
                break;
            } catch (InterruptedException unused) {
                jElapsedRealtime2 = j - (SystemClock.elapsedRealtime() - jElapsedRealtime);
                if (jElapsedRealtime2 <= 0) {
                    z = true;
                    break;
                }
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return zAwait;
    }

    public static void checkIsOnMainThread() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return;
        }
        ore.k("Not on main thread!");
    }

    public static StackTraceElement[] concatStackTraces(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[stackTraceElementArr.length + stackTraceElementArr2.length];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr3, 0, stackTraceElementArr.length);
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, stackTraceElementArr.length, stackTraceElementArr2.length);
        return stackTraceElementArr3;
    }

    public static void executeUninterruptibly(BlockingOperation blockingOperation) {
        boolean z = false;
        while (true) {
            try {
                blockingOperation.run();
                break;
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static <V> V invokeAtFrontUninterruptibly(Handler handler, Callable<V> callable) {
        if (handler.getLooper().getThread() == Thread.currentThread()) {
            try {
                return callable.call();
            } catch (Exception e) {
                qr7.o(e);
                return null;
            }
        }
        C1Result c1Result = new C1Result();
        C1CaughtException c1CaughtException = new C1CaughtException();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        handler.post(new Runnable() { // from class: org.webrtc.ThreadUtils.3
            final /* synthetic */ CountDownLatch val$barrier;
            final /* synthetic */ Callable val$callable;
            final /* synthetic */ C1CaughtException val$caughtException;

            public AnonymousClass3() {
                callable = callable;
                c1CaughtException = c1CaughtException;
                countDownLatch = countDownLatch;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [V, java.lang.Object] */
            @Override // java.lang.Runnable
            public void run() {
                try {
                    c1Result.value = callable.call();
                } catch (Exception e2) {
                    c1CaughtException.e = e2;
                }
                countDownLatch.countDown();
            }
        });
        awaitUninterruptibly(countDownLatch);
        Exception exc = c1CaughtException.e;
        if (exc == null) {
            return c1Result.value;
        }
        RuntimeException runtimeException = new RuntimeException(exc);
        runtimeException.setStackTrace(concatStackTraces(c1CaughtException.e.getStackTrace(), runtimeException.getStackTrace()));
        throw runtimeException;
    }

    public static boolean joinUninterruptibly(Thread thread, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = false;
        long jElapsedRealtime2 = j;
        while (jElapsedRealtime2 > 0) {
            try {
                thread.join(jElapsedRealtime2);
                break;
            } catch (InterruptedException unused) {
                jElapsedRealtime2 = j - (SystemClock.elapsedRealtime() - jElapsedRealtime);
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return !thread.isAlive();
    }

    public static void awaitUninterruptibly(CountDownLatch countDownLatch) {
        executeUninterruptibly(new BlockingOperation() { // from class: org.webrtc.ThreadUtils.2
            final /* synthetic */ CountDownLatch val$latch;

            public AnonymousClass2() {
                countDownLatch = countDownLatch;
            }

            @Override // org.webrtc.ThreadUtils.BlockingOperation
            public void run() throws InterruptedException {
                countDownLatch.await();
            }
        });
    }

    public static void joinUninterruptibly(Thread thread) {
        executeUninterruptibly(new BlockingOperation() { // from class: org.webrtc.ThreadUtils.1
            final /* synthetic */ Thread val$thread;

            public AnonymousClass1() {
                thread = thread;
            }

            @Override // org.webrtc.ThreadUtils.BlockingOperation
            public void run() throws InterruptedException {
                thread.join();
            }
        });
    }

    public static void invokeAtFrontUninterruptibly(Handler handler, Runnable runnable) {
        invokeAtFrontUninterruptibly(handler, new Callable<Void>() { // from class: org.webrtc.ThreadUtils.4
            final /* synthetic */ Runnable val$runner;

            public AnonymousClass4() {
                runnable = runnable;
            }

            @Override // java.util.concurrent.Callable
            public Void call() {
                runnable.run();
                return null;
            }
        });
    }
}
