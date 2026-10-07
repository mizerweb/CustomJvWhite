package defpackage;

import java.util.concurrent.ExecutorService;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b6g {

    @Deprecated
    public static final long MAX_RECONNECT_DELAY_MS = 10000;
    public long a;
    public m4g b;
    public r5g c;
    public ExecutorService d;
    public y3e e;
    public z3e f;
    public long g;
    public boolean h;
    public n96 i;
    public boolean j;
    public esh k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public af7 p;
    public x5g q;
    public wxe r;

    public abstract p4g build();

    public final m4g getConnectFailureListener() {
        return this.b;
    }

    public final n96 getEndpointParameters() {
        return this.i;
    }

    public final ExecutorService getExecutor() {
        return this.d;
    }

    public final y3e getLog() {
        return this.e;
    }

    public final z3e getLogConfiguration() {
        return this.f;
    }

    public final af7 getPeerIdGenerator() {
        return this.p;
    }

    public final long getServerPingTimeoutMs() {
        return this.g;
    }

    public final r5g getSignalingStat() {
        return this.c;
    }

    public final wxe getSslProvider() {
        return this.r;
    }

    public final esh getTimeProvider() {
        return this.k;
    }

    public final long getTimeoutMS() {
        return this.a;
    }

    public final x5g getTimeouts() {
        return this.q;
    }

    public final boolean isFastRecoverEnabled() {
        return this.h;
    }

    public final boolean isReplaceParametersInEndpointEnabled() {
        return this.j;
    }

    public final boolean isSNIEnabled() {
        return this.o;
    }

    public final boolean isSignalingLogThrottlingEnabled() {
        return this.l;
    }

    public final boolean isSummaryStatsEnabled() {
        return this.m;
    }

    public final boolean isUseOfIPEnabled() {
        return this.n;
    }

    /* JADX INFO: renamed from: setConnectFailureListener */
    public final void m0setConnectFailureListener(m4g m4gVar) {
        this.b = m4gVar;
    }

    /* JADX INFO: renamed from: setEndpointParameters */
    public final void m1setEndpointParameters(n96 n96Var) {
        this.i = n96Var;
    }

    /* JADX INFO: renamed from: setExecutor */
    public final void m2setExecutor(ExecutorService executorService) {
        this.d = executorService;
    }

    /* JADX INFO: renamed from: setFastRecoverEnabled */
    public final void m3setFastRecoverEnabled(boolean z) {
        this.h = z;
    }

    public final b6g setIsReplaceParametersInEndpointEnabled(boolean z) {
        this.j = z;
        return this;
    }

    public final b6g setIsSignalingLogThrottlingEnabled(boolean z) {
        this.l = z;
        return this;
    }

    public final b6g setIsSummaryStatsEnabled(boolean z) {
        this.m = z;
        return this;
    }

    /* JADX INFO: renamed from: setLog */
    public final void m4setLog(y3e y3eVar) {
        this.e = y3eVar;
    }

    /* JADX INFO: renamed from: setLogConfiguration */
    public final void m5setLogConfiguration(z3e z3eVar) {
        this.f = z3eVar;
    }

    /* JADX INFO: renamed from: setPeerIdGenerator */
    public final void m6setPeerIdGenerator(af7 af7Var) {
        this.p = af7Var;
    }

    public final void setReplaceParametersInEndpointEnabled(boolean z) {
        this.j = z;
    }

    /* JADX INFO: renamed from: setSNIEnabled */
    public final void m7setSNIEnabled(boolean z) {
        this.o = z;
    }

    public final b6g setSSLProvider(wxe wxeVar) {
        this.r = wxeVar;
        return this;
    }

    /* JADX INFO: renamed from: setServerPingTimeoutMs */
    public final void m8setServerPingTimeoutMs(long j) {
        this.g = j;
    }

    public final void setSignalingLogThrottlingEnabled(boolean z) {
        this.l = z;
    }

    /* JADX INFO: renamed from: setSignalingStat */
    public final void m9setSignalingStat(r5g r5gVar) {
        this.c = r5gVar;
    }

    public final void setSslProvider(wxe wxeVar) {
        this.r = wxeVar;
    }

    public final void setSummaryStatsEnabled(boolean z) {
        this.m = z;
    }

    public final b6g setTimeProvider(esh eshVar) {
        eshVar.getClass();
        this.k = eshVar;
        return this;
    }

    /* JADX INFO: renamed from: setTimeoutMS */
    public final void m11setTimeoutMS(long j) {
        this.a = j;
    }

    public final b6g setTimeouts(x5g x5gVar) {
        x5g x5gVar2;
        if (x5gVar != null) {
            x5gVar2 = new x5g(oc9.x(x5gVar.a, 0L, BuildConfig.MAX_TIME_TO_UPLOAD), oc9.x(x5gVar.b, 0L, Math.min(10000L, x5gVar.d)), oc9.u(x5gVar.c, 1.0f, 10.0f), oc9.x(x5gVar.d, 0L, 60000L));
        } else {
            x5gVar2 = null;
        }
        this.q = x5gVar2;
        return this;
    }

    /* JADX INFO: renamed from: setUseOfIPEnabled */
    public final void m13setUseOfIPEnabled(boolean z) {
        this.n = z;
    }

    public final b6g setConnectFailureListener(m4g m4gVar) {
        this.b = m4gVar;
        return this;
    }

    public final b6g setEndpointParameters(n96 n96Var) {
        this.i = n96Var;
        return this;
    }

    public final b6g setExecutor(ExecutorService executorService) {
        this.d = executorService;
        return this;
    }

    public final b6g setFastRecoverEnabled(boolean z) {
        this.h = z;
        return this;
    }

    public final b6g setLog(y3e y3eVar) {
        this.e = y3eVar;
        return this;
    }

    public final b6g setLogConfiguration(z3e z3eVar) {
        this.f = z3eVar;
        return this;
    }

    public final b6g setPeerIdGenerator(af7 af7Var) {
        this.p = af7Var;
        return this;
    }

    public final b6g setSNIEnabled(boolean z) {
        this.o = z;
        return this;
    }

    public final b6g setServerPingTimeoutMs(long j) {
        this.g = j;
        return this;
    }

    public final b6g setSignalingStat(r5g r5gVar) {
        this.c = r5gVar;
        return this;
    }

    public final b6g setTimeoutMS(long j) {
        this.a = j;
        return this;
    }

    public final b6g setUseOfIPEnabled(boolean z) {
        this.n = z;
        return this;
    }

    /* JADX INFO: renamed from: setTimeProvider */
    public final void m10setTimeProvider(esh eshVar) {
        this.k = eshVar;
    }

    /* JADX INFO: renamed from: setTimeouts */
    public final void m12setTimeouts(x5g x5gVar) {
        this.q = x5gVar;
    }
}
