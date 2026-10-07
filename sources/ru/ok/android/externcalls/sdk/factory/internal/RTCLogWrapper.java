package ru.ok.android.externcalls.sdk.factory.internal;

import defpackage.af7;
import defpackage.y3e;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/internal/RTCLogWrapper;", "Ly3e;", "Lkotlin/Function0;", "logger", "<init>", "(Laf7;)V", "", "tag", "msg", "Lsbi;", "log", "(Ljava/lang/String;Ljava/lang/String;)V", "", "throwable", "logException", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "reportException", "Laf7;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RTCLogWrapper implements y3e {
    private final af7 logger;

    public RTCLogWrapper(af7 af7Var) {
        this.logger = af7Var;
    }

    @Override // defpackage.y3e
    public void log(String tag, String msg) {
        y3e y3eVar = (y3e) this.logger.invoke();
        if (y3eVar != null) {
            y3eVar.log(tag, msg);
        }
    }

    @Override // defpackage.y3e
    public void logException(String tag, String msg, Throwable throwable) {
        y3e y3eVar = (y3e) this.logger.invoke();
        if (y3eVar != null) {
            y3eVar.logException(tag, msg, throwable);
        }
    }

    @Override // defpackage.y3e
    public void reportException(String tag, String msg, Throwable throwable) {
        y3e y3eVar = (y3e) this.logger.invoke();
        if (y3eVar != null) {
            y3eVar.reportException(tag, msg, throwable);
        }
    }
}
