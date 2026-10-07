package ru.ok.android.externcalls.sdk.signaling;

import androidx.work.WorkRequest;
import defpackage.a6g;
import defpackage.af7;
import defpackage.b6g;
import defpackage.esh;
import defpackage.j95;
import defpackage.m4g;
import defpackage.m96;
import defpackage.p4g;
import defpackage.r5g;
import defpackage.u5g;
import defpackage.wt1;
import defpackage.wxe;
import defpackage.x5g;
import defpackage.xt1;
import defpackage.y3e;
import defpackage.z3e;
import defpackage.zo5;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.video.calls.sdk.net.signaling.WSSignaling;
import one.video.calls.sdk.net.signaling.WTSignaling;
import ru.ok.android.externcalls.sdk.stat.ConversationStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u0000 82\u00020\u0001:\u00018Bµ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0012\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u001c\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010+R\u001c\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010/R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00100R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u00101R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u00102R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00103R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00104R\u001c\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00101R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00105R\u0016\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00106R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00107¨\u00069"}, d2 = {"Lru/ok/android/externcalls/sdk/signaling/SignalingTransportBuilder;", "", "Lm96;", "endpointParametersBuilder", "", "wtEndpointBaseUrl", "", "wtIps", "wsEndpointBaseUrl", "wsIps", "Lxt1;", "callParams", "Lm4g;", "connectFailureListener", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lru/ok/android/externcalls/sdk/stat/ConversationStats;", "conversationStats", "Lkotlin/Function0;", "", "isReplaceParametersInEndpointEnabled", "Lesh;", "timeProvider", "Lu5g;", "wtToWsFallbackParams", "Lz3e;", "logConfiguration", "", "peerIdGenerator", "Lx5g;", "timeouts", "Lwxe;", "sslProvider", "Ly3e;", "log", "<init>", "(Lm96;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lxt1;Lm4g;Ljava/util/concurrent/ExecutorService;Lru/ok/android/externcalls/sdk/stat/ConversationStats;Laf7;Lesh;Lu5g;Lz3e;Laf7;Lx5g;Lwxe;Ly3e;)V", "La6g;", "params", "Lp4g;", "build", "(La6g;)Lp4g;", "Lm96;", "Ljava/lang/String;", "Ljava/util/List;", "Lxt1;", "Lm4g;", "Ljava/util/concurrent/ExecutorService;", "Lru/ok/android/externcalls/sdk/stat/ConversationStats;", "Laf7;", "Lesh;", "Lu5g;", "Lz3e;", "Lx5g;", "Lwxe;", "Ly3e;", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SignalingTransportBuilder {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String TAG = "SignalingBuilder";
    private final xt1 callParams;
    private final m4g connectFailureListener;
    private final ConversationStats conversationStats;
    private final m96 endpointParametersBuilder;
    private final ExecutorService executorService;
    private final af7 isReplaceParametersInEndpointEnabled;
    private final y3e log;
    private final z3e logConfiguration;
    private final af7 peerIdGenerator;
    private final wxe sslProvider;
    private final esh timeProvider;
    private final x5g timeouts;
    private final String wsEndpointBaseUrl;
    private final List<String> wsIps;
    private final String wtEndpointBaseUrl;
    private final List<String> wtIps;
    private final u5g wtToWsFallbackParams;

    public SignalingTransportBuilder(m96 m96Var, String str, List<String> list, String str2, List<String> list2, xt1 xt1Var, m4g m4gVar, ExecutorService executorService, ConversationStats conversationStats, af7 af7Var, esh eshVar, u5g u5gVar, z3e z3eVar, af7 af7Var2, x5g x5gVar, wxe wxeVar, y3e y3eVar) {
        this.endpointParametersBuilder = m96Var;
        this.wtEndpointBaseUrl = str;
        this.wtIps = list;
        this.wsEndpointBaseUrl = str2;
        this.wsIps = list2;
        this.callParams = xt1Var;
        this.connectFailureListener = m4gVar;
        this.executorService = executorService;
        this.conversationStats = conversationStats;
        this.isReplaceParametersInEndpointEnabled = af7Var;
        this.timeProvider = eshVar;
        this.wtToWsFallbackParams = u5gVar;
        this.logConfiguration = z3eVar;
        this.peerIdGenerator = af7Var2;
        this.timeouts = x5gVar;
        this.sslProvider = wxeVar;
        this.log = y3eVar;
    }

    public final p4g build(a6g params) {
        b6g builder;
        String str;
        boolean z = params.a;
        boolean z2 = (z || (str = this.wtEndpointBaseUrl) == null || str.length() == 0) ? false : true;
        this.log.log(TAG, zo5.q("Build signaling transport. wt=", ", prefer_ws=", z2, z));
        m96 m96Var = this.endpointParametersBuilder;
        if (z2) {
            m96Var.e = this.wtEndpointBaseUrl;
            m96Var.f = this.wtIps;
        } else {
            m96Var.e = this.wsEndpointBaseUrl;
            m96Var.f = this.wsIps;
        }
        Long l = params.c;
        if (l != null) {
            this.endpointParametersBuilder.h = Long.valueOf(l.longValue());
        }
        String str2 = params.b;
        if (str2 != null) {
            this.endpointParametersBuilder.a = str2;
        }
        m96 m96Var2 = this.endpointParametersBuilder;
        m96Var2.q = params.d;
        if (z2) {
            m96Var2.r = WTSignaling.INSTANCE.getDefaultCompression();
            builder = new WTSignaling.Builder().setFallbackParams(this.wtToWsFallbackParams);
        } else {
            m96Var2.r = null;
            builder = new WSSignaling.Builder();
        }
        wt1 wt1Var = this.callParams.b;
        b6g logConfiguration = builder.setTimeoutMS(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).setConnectFailureListener(this.connectFailureListener).setSignalingStat((r5g) this.conversationStats.wsSignalingStat).setExecutor(this.executorService).setLog(this.log).setTimeProvider(this.timeProvider).setLogConfiguration(this.logConfiguration);
        wt1 wt1Var2 = this.callParams.b;
        return logConfiguration.setServerPingTimeoutMs(20000L).setFastRecoverEnabled(this.callParams.k).setEndpointParameters(this.endpointParametersBuilder.a()).setIsReplaceParametersInEndpointEnabled(((Boolean) this.isReplaceParametersInEndpointEnabled.invoke()).booleanValue()).setIsSummaryStatsEnabled(this.callParams.r.t).setIsSignalingLogThrottlingEnabled(this.callParams.r.u).setUseOfIPEnabled(this.callParams.r.H).setSNIEnabled(this.callParams.r.I).setPeerIdGenerator(this.peerIdGenerator).setTimeouts(this.timeouts).setSSLProvider(this.sslProvider).build();
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/signaling/SignalingTransportBuilder$Companion;", "", "<init>", "()V", "TAG", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }
}
