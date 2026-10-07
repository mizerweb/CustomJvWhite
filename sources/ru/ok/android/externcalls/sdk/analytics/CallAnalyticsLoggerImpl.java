package ru.ok.android.externcalls.sdk.analytics;

import defpackage.af7;
import defpackage.y3e;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\fJ'\u0010\u000e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u000e\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\fJ'\u0010\u0012\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\fJ'\u0010\u0014\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/analytics/CallAnalyticsLoggerImpl;", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "Lkotlin/Function0;", "Ly3e;", "loggerProvider", "<init>", "(Laf7;)V", "", "tag", "message", "Lsbi;", "d", "(Ljava/lang/String;Ljava/lang/String;)V", "i", "w", "", "throwable", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "e", "v", "report", "Laf7;", "getLogger", "()Ly3e;", "logger", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CallAnalyticsLoggerImpl implements CallAnalyticsLogger {
    private final af7 loggerProvider;

    public CallAnalyticsLoggerImpl(af7 af7Var) {
        this.loggerProvider = af7Var;
    }

    private final y3e getLogger() {
        return (y3e) this.loggerProvider.invoke();
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void d(String tag, String message) {
        getLogger().log(tag, message);
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void e(String tag, String message) {
        getLogger().log(tag, message);
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void i(String tag, String message) {
        getLogger().log(tag, message);
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void report(String tag, String message, Throwable throwable) {
        getLogger().reportException(tag, message, throwable);
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void v(String tag, String message) {
        getLogger().log(tag, message);
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void w(String tag, String message) {
        getLogger().log(tag, message);
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void e(String tag, String message, Throwable throwable) {
        getLogger().logException(tag, message, throwable);
    }

    @Override // ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger
    public void w(String tag, String message, Throwable throwable) {
        getLogger().logException(tag, message, throwable);
    }
}
