package one.me.android.initialization;

import defpackage.gm0;
import defpackage.rg4;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;

/* JADX INFO: loaded from: classes.dex */
public final class a implements rg4 {
    public static final a a = new a();

    @Override // defpackage.rg4, defpackage.tg4
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        if ((th instanceof OnErrorNotImplementedException) || (th instanceof UndeliverableException)) {
            gm0.V("RxJavaErrorHandler", "rxjava undeliverable error", new AccountInitializer.a(th));
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = threadCurrentThread.getUncaughtExceptionHandler();
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(threadCurrentThread, th);
        }
    }
}
