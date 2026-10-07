package ru.ok.android.externcalls.sdk.api.interceptor;

import android.os.SystemClock;
import defpackage.a9m;
import defpackage.esh;
import defpackage.gsh;
import defpackage.hsb;
import defpackage.isb;
import defpackage.j95;
import defpackage.ksb;
import defpackage.lsb;
import java.io.InterruptedIOException;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.stat.api.ApiStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/api/interceptor/ExecutionTimeInterceptor;", "Lisb;", "Lru/ok/android/externcalls/sdk/stat/api/ApiStats;", "apiStats", "Lesh;", "timeProvider", "<init>", "(Lru/ok/android/externcalls/sdk/stat/api/ApiStats;Lesh;)V", "Lhsb;", "okApiChain", "Llsb;", "intercept", "(Lhsb;)Llsb;", "Lsbi;", "release", "()V", "Lru/ok/android/externcalls/sdk/stat/api/ApiStats;", "getApiStats", "()Lru/ok/android/externcalls/sdk/stat/api/ApiStats;", "setApiStats", "(Lru/ok/android/externcalls/sdk/stat/api/ApiStats;)V", "Lesh;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ExecutionTimeInterceptor implements isb {
    private ApiStats apiStats;
    private final esh timeProvider;

    public ExecutionTimeInterceptor(ApiStats apiStats, esh eshVar, int i, j95 j95Var) {
        this((i & 1) != 0 ? null : apiStats, (i & 2) != 0 ? new gsh() : eshVar);
    }

    public final ApiStats getApiStats() {
        return this.apiStats;
    }

    @Override // defpackage.isb
    public lsb intercept(hsb okApiChain) throws InterruptedIOException {
        ApiStats apiStats;
        a9m a9mVar = (a9m) okApiChain;
        ksb ksbVar = (ksb) a9mVar.d;
        String method = InterceptorUtilsKt.getMethod(ksbVar.a);
        ((gsh) this.timeProvider).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        lsb lsbVarI = a9mVar.i(ksbVar);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
        if (method != null && (apiStats = this.apiStats) != null) {
            apiStats.reportExecutionTime(method, jElapsedRealtime2);
        }
        return lsbVarI;
    }

    public final void release() {
        this.apiStats = null;
    }

    public final void setApiStats(ApiStats apiStats) {
        this.apiStats = apiStats;
    }

    public ExecutionTimeInterceptor() {
        this(null, null, 3, null);
    }

    public ExecutionTimeInterceptor(ApiStats apiStats, esh eshVar) {
        this.apiStats = apiStats;
        this.timeProvider = eshVar;
    }
}
