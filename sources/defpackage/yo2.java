package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yo2 implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler a;
    public final Thread.UncaughtExceptionHandler b;

    public yo2(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread.UncaughtExceptionHandler uncaughtExceptionHandler2) {
        this.a = uncaughtExceptionHandler;
        this.b = uncaughtExceptionHandler2;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        try {
            this.a.uncaughtException(thread, th);
        } finally {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
