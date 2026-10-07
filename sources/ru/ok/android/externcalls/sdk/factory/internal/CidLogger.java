package ru.ok.android.externcalls.sdk.factory.internal;

import defpackage.ps4;
import defpackage.qs4;
import defpackage.qv1;
import defpackage.r5h;
import defpackage.y3e;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0013\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/factory/internal/CidLogger;", "Ly3e;", "Lps4;", "cidProvider", "delegate", "<init>", "(Lps4;Ly3e;)V", "", "withCid", "(Ljava/lang/String;)Ljava/lang/String;", "tag", "msg", "Lsbi;", "log", "(Ljava/lang/String;Ljava/lang/String;)V", "", "throwable", "logException", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "reportException", "Lps4;", "Ly3e;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CidLogger implements y3e {
    private final ps4 cidProvider;
    private final y3e delegate;

    public CidLogger(ps4 ps4Var, y3e y3eVar) {
        this.cidProvider = ps4Var;
        this.delegate = y3eVar;
    }

    private final String withCid(String str) {
        return qv1.l("[", r5h.u1(4, ((qs4) this.cidProvider).b), "] ", str);
    }

    @Override // defpackage.y3e
    public void log(String tag, String msg) {
        this.delegate.log(tag, withCid(msg));
    }

    @Override // defpackage.y3e
    public void logException(String tag, String msg, Throwable throwable) {
        this.delegate.logException(tag, withCid(msg), throwable);
    }

    @Override // defpackage.y3e
    public void reportException(String tag, String msg, Throwable throwable) {
        this.delegate.reportException(tag, withCid(msg), throwable);
    }
}
