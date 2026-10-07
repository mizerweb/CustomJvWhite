package ru.ok.android.externcalls.sdk.log;

import defpackage.y3e;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0005\u0010\fJ'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0010R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ok/android/externcalls/sdk/log/GlobalRTCLogger;", "", "<init>", "()V", "Ly3e;", "log", "Lsbi;", "setLog", "(Ly3e;)V", "", "tag", "msg", "(Ljava/lang/String;Ljava/lang/String;)V", "", "throwable", "logException", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "reportException", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GlobalRTCLogger {
    public static final GlobalRTCLogger INSTANCE = new GlobalRTCLogger();
    private static WeakReference<y3e> log = new WeakReference<>(null);

    private GlobalRTCLogger() {
    }

    public static final void log(String tag, String msg) {
        y3e y3eVar = log.get();
        if (y3eVar != null) {
            y3eVar.log(tag, msg);
        }
    }

    public static final void logException(String tag, String msg, Throwable throwable) {
        y3e y3eVar = log.get();
        if (y3eVar != null) {
            y3eVar.logException(tag, msg, throwable);
        }
    }

    public static final void reportException(String tag, String msg, Throwable throwable) {
        y3e y3eVar = log.get();
        if (y3eVar != null) {
            y3eVar.reportException(tag, msg, throwable);
        }
    }

    public static final void setLog(y3e log2) {
        log = new WeakReference<>(log2);
    }
}
