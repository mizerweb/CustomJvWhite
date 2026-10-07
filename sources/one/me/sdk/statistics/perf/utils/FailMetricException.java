package one.me.sdk.statistics.perf.utils;

import defpackage.lrc;
import defpackage.qt4;
import kotlin.Metadata;
import ru.ok.tamtam.exception.IssueKeyException;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/sdk/statistics/perf/utils/FailMetricException;", "Lru/ok/tamtam/exception/IssueKeyException;", "", "event", "Llrc;", "errorType", "<init>", "(Ljava/lang/String;Llrc;)V", "perf-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FailMetricException extends IssueKeyException {
    public FailMetricException(String str, lrc lrcVar) {
        super(4, "perfsdk", qt4.j(lrcVar.a(), str, "="), null);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
