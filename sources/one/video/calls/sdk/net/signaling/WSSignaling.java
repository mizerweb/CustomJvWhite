package one.video.calls.sdk.net.signaling;

import defpackage.af7;
import defpackage.ag5;
import defpackage.b6g;
import defpackage.cf7;
import defpackage.d71;
import defpackage.dle;
import defpackage.esh;
import defpackage.ex8;
import defpackage.g5g;
import defpackage.gve;
import defpackage.h4i;
import defpackage.i9e;
import defpackage.ifh;
import defpackage.il1;
import defpackage.j0i;
import defpackage.j95;
import defpackage.l9e;
import defpackage.lc6;
import defpackage.m4g;
import defpackage.mtj;
import defpackage.n96;
import defpackage.ny8;
import defpackage.ore;
import defpackage.p3c;
import defpackage.pkh;
import defpackage.psb;
import defpackage.pt2;
import defpackage.q5g;
import defpackage.qsb;
import defpackage.r5g;
import defpackage.twd;
import defpackage.uqi;
import defpackage.v5g;
import defpackage.vbi;
import defpackage.w5g;
import defpackage.wxe;
import defpackage.x5g;
import defpackage.xd5;
import defpackage.xp9;
import defpackage.y3e;
import defpackage.y5g;
import defpackage.y8e;
import defpackage.z3e;
import java.net.ProtocolException;
import java.security.KeyManagementException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import one.video.calls.sdk_private.wss.a;
import one.video.calls.sdk_private.wss.b;
import org.apache.http.HttpHost;
import org.apache.http.protocol.HTTP;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001PB§\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u000f\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J)\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\"2\u0006\u0010&\u001a\u00020%H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\"H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020'H\u0014¢\u0006\u0004\b-\u0010.J#\u00101\u001a\u00020'2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020'0/H\u0014¢\u0006\u0004\b1\u00102J\u001f\u00106\u001a\u00020\u000f2\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\"H\u0014¢\u0006\u0004\b6\u00107R\u001d\u0010=\u001a\u0004\u0018\u0001088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001d\u0010B\u001a\u0004\u0018\u00010>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010AR\u001d\u0010G\u001a\u0004\u0018\u00010C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u0010:\u001a\u0004\bE\u0010FR\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010:\u001a\u0004\bJ\u0010KR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006Q"}, d2 = {"Lone/video/calls/sdk/net/signaling/WSSignaling;", "Ly5g;", "", "timeoutMS", "Lm4g;", "connectFailureListener", "Lr5g;", "signalingStat", "Ljava/util/concurrent/ExecutorService;", "executor", "Ly3e;", "log", "Lz3e;", "logConfiguration", "serverPingTimeoutMs", "", "isFastRecoverEnabled", "Ln96;", "endpointParameters", "isReplaceParametersInEndpointEnabled", "Lesh;", "timeProvider", "Lx5g;", "timeouts", "isSummaryStatsEnabled", "isSignalingLogThrottlingEnabled", "isUseOfIPEnabled", "isSNIEnabled", "Lwxe;", "sslProvider", "Lkotlin/Function0;", "peerIdGenerator", "<init>", "(JLm4g;Lr5g;Ljava/util/concurrent/ExecutorService;Ly3e;Lz3e;JZLn96;ZLesh;Lx5g;ZZZZLwxe;Laf7;)V", "", ApiProtocol.KEY_ENDPOINT, "hostname", "Lw5g;", "listener", "Lsbi;", "safelyCreateNewSocket", "(Ljava/lang/String;Ljava/lang/String;Lw5g;)V", "cmd", "safelySendSocketMessage", "(Ljava/lang/String;)Z", "safelyResetSocketReference", "()V", "Lkotlin/Function1;", "action", "safelyDoIfSocketExists", "(Lcf7;)V", "", "code", "reason", "safelyCloseSocketWithCodeAndReason", "(ILjava/lang/String;)Z", "Ljavax/net/ssl/X509TrustManager;", "trustManager$delegate", "Lny8;", "getTrustManager", "()Ljavax/net/ssl/X509TrustManager;", "trustManager", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory$delegate", "getSslSocketFactory", "()Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Lone/video/calls/sdk_private/wss/a;", "sniProvider$delegate", "getSniProvider", "()Lone/video/calls/sdk_private/wss/a;", "sniProvider", "Lqsb;", "http$delegate", "getHttp", "()Lqsb;", HttpHost.DEFAULT_SCHEME_NAME, "Lmtj;", "socket", "Lmtj;", "Builder", "wssignaling"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WSSignaling extends y5g {

    /* JADX INFO: renamed from: http$delegate, reason: from kotlin metadata */
    private final ny8 org.apache.http.HttpHost.DEFAULT_SCHEME_NAME java.lang.String;

    /* JADX INFO: renamed from: sniProvider$delegate, reason: from kotlin metadata */
    private final ny8 sniProvider;
    private mtj socket;

    /* JADX INFO: renamed from: sslSocketFactory$delegate, reason: from kotlin metadata */
    private final ny8 sslSocketFactory;

    /* JADX INFO: renamed from: trustManager$delegate, reason: from kotlin metadata */
    private final ny8 trustManager;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/video/calls/sdk/net/signaling/WSSignaling$Builder;", "Lb6g;", "<init>", "()V", "Lone/video/calls/sdk/net/signaling/WSSignaling;", "build", "()Lone/video/calls/sdk/net/signaling/WSSignaling;", "wssignaling"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends b6g {
        @Override // defpackage.b6g
        public WSSignaling build() {
            Objects.requireNonNull(getSignalingStat(), "Signaling statistics is required");
            Objects.requireNonNull(getExecutor(), "executor is required");
            Objects.requireNonNull(getLog(), "log is required");
            Objects.requireNonNull(getTimeProvider(), "time provider is required");
            Objects.requireNonNull(getLogConfiguration(), "log configuration is required");
            Objects.requireNonNull(getEndpointParameters(), "endpoing parameters are required");
            long timeoutMS = getTimeoutMS();
            m4g connectFailureListener = getConnectFailureListener();
            r5g signalingStat = getSignalingStat();
            signalingStat.getClass();
            ExecutorService executor = getExecutor();
            executor.getClass();
            y3e log = getLog();
            log.getClass();
            z3e logConfiguration = getLogConfiguration();
            logConfiguration.getClass();
            long serverPingTimeoutMs = getServerPingTimeoutMs();
            boolean zIsFastRecoverEnabled = isFastRecoverEnabled();
            n96 endpointParameters = getEndpointParameters();
            endpointParameters.getClass();
            boolean zIsReplaceParametersInEndpointEnabled = isReplaceParametersInEndpointEnabled();
            esh timeProvider = getTimeProvider();
            timeProvider.getClass();
            boolean zIsSummaryStatsEnabled = isSummaryStatsEnabled();
            boolean zIsSignalingLogThrottlingEnabled = isSignalingLogThrottlingEnabled();
            boolean zIsUseOfIPEnabled = isUseOfIPEnabled();
            boolean zIsSNIEnabled = isSNIEnabled();
            af7 peerIdGenerator = getPeerIdGenerator();
            WSSignaling wSSignaling = new WSSignaling(timeoutMS, connectFailureListener, signalingStat, executor, log, logConfiguration, serverPingTimeoutMs, zIsFastRecoverEnabled, endpointParameters, zIsReplaceParametersInEndpointEnabled, timeProvider, getTimeouts(), zIsSummaryStatsEnabled, zIsSignalingLogThrottlingEnabled, zIsUseOfIPEnabled, zIsSNIEnabled, getSslProvider(), peerIdGenerator, null);
            wSSignaling.init();
            return wSSignaling;
        }
    }

    private WSSignaling(long j, m4g m4gVar, r5g r5gVar, ExecutorService executorService, y3e y3eVar, z3e z3eVar, long j2, boolean z, n96 n96Var, boolean z2, esh eshVar, x5g x5gVar, boolean z3, boolean z4, boolean z5, boolean z6, wxe wxeVar, af7 af7Var) {
        super(h4i.a, j, m4gVar, r5gVar, executorService, y3eVar, z3eVar, j2, z, n96Var, z2, new q5g("websocket_restart", "websocket_connected", "websocket_reconnected", "websocket_failed_pings", "websocket_failed_exception", "websocket_timeout"), eshVar, z3, z4, null, x5gVar, z5, z6, wxeVar, af7Var);
        this.trustManager = new ifh(new vbi(19, wxeVar));
        this.sslSocketFactory = new ifh(new j0i(wxeVar, 15, this));
        this.sniProvider = new ifh(new il1(z6, y3eVar, this));
        this.org.apache.http.HttpHost.DEFAULT_SCHEME_NAME java.lang.String = new ifh(new j0i(x5gVar, 16, this));
    }

    private final qsb getHttp() {
        return (qsb) this.org.apache.http.HttpHost.DEFAULT_SCHEME_NAME java.lang.String.getValue();
    }

    private final a getSniProvider() {
        return (a) this.sniProvider.getValue();
    }

    private final SSLSocketFactory getSslSocketFactory() {
        return (SSLSocketFactory) this.sslSocketFactory.getValue();
    }

    private final X509TrustManager getTrustManager() {
        return (X509TrustManager) this.trustManager.getValue();
    }

    public static final qsb http_delegate$lambda$0(x5g x5gVar, WSSignaling wSSignaling) {
        psb psbVar = new psb();
        psbVar.v = uqi.b(x5gVar != null ? x5gVar.a : 10000L, TimeUnit.MILLISECONDS);
        v5g hostnameVerifier = wSSignaling.getHostnameVerifier();
        if (!hostnameVerifier.equals(psbVar.s)) {
            psbVar.z = null;
        }
        psbVar.s = hostnameVerifier;
        a sniProvider = wSSignaling.getSniProvider();
        if (sniProvider != null) {
            psbVar.a(sniProvider, sniProvider.b);
        } else {
            SSLSocketFactory sslSocketFactory = wSSignaling.getSslSocketFactory();
            X509TrustManager trustManager = wSSignaling.getTrustManager();
            if (sslSocketFactory != null && trustManager != null) {
                psbVar.a(sslSocketFactory, trustManager);
            }
        }
        return new qsb(psbVar);
    }

    public static final a sniProvider_delegate$lambda$0(boolean z, y3e y3eVar, WSSignaling wSSignaling) {
        if (z) {
            try {
                return new a(y3eVar, wSSignaling.getSslSocketFactory(), wSSignaling.getTrustManager());
            } catch (Throwable th) {
                g5g signalingLogger = wSSignaling.getSignalingLogger();
                signalingLogger.getClass();
                signalingLogger.a.logException(signalingLogger.d, "Can't create SNI provider", th);
            }
        }
        return null;
    }

    public static final SSLSocketFactory sslSocketFactory_delegate$lambda$0(wxe wxeVar, WSSignaling wSSignaling) throws KeyManagementException {
        if (wxeVar == null) {
            return null;
        }
        SSLContext sSLContext = (SSLContext) ((xd5) ((ex8) wxeVar).b).h.getValue();
        sSLContext.init(null, new X509TrustManager[]{wSSignaling.getTrustManager()}, null);
        return sSLContext.getSocketFactory();
    }

    public static final X509TrustManager trustManager_delegate$lambda$0(wxe wxeVar) {
        if (wxeVar != null) {
            return ((xd5) ((ex8) wxeVar).b).b();
        }
        return null;
    }

    @Override // defpackage.y5g
    public boolean safelyCloseSocketWithCodeAndReason(int code, String reason) {
        reason.getClass();
        mtj mtjVar = this.socket;
        this.socket = null;
        if (mtjVar == null) {
            return false;
        }
        ((l9e) mtjVar).b(code, reason);
        return true;
    }

    @Override // defpackage.y5g
    public void safelyCreateNewSocket(String str, String hostname, w5g listener) {
        str.getClass();
        listener.getClass();
        ag5 ag5Var = new ag5(3);
        ag5Var.h(str);
        dle dleVarA = ag5Var.a();
        a sniProvider = getSniProvider();
        if (sniProvider != null) {
            sniProvider.d = hostname;
        }
        qsb http = getHttp();
        b bVar = new b(listener);
        http.getClass();
        l9e l9eVar = new l9e(pkh.h, dleVarA, bVar, new Random(), 0L, http.y);
        if (dleVarA.c.a("Sec-WebSocket-Extensions") != null) {
            l9eVar.c(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null);
        } else {
            psb psbVarA = http.a();
            byte[] bArr = uqi.a;
            psbVarA.e = new gve(lc6.a);
            ArrayList arrayList = new ArrayList(l9e.x);
            twd twdVar = twd.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(twdVar) && !arrayList.contains(twd.HTTP_1_1)) {
                ore.e(arrayList, "protocols must contain h2_prior_knowledge or http/1.1: ");
                return;
            }
            if (arrayList.contains(twdVar) && arrayList.size() > 1) {
                ore.e(arrayList, "protocols containing h2_prior_knowledge cannot use other protocols: ");
                return;
            }
            if (arrayList.contains(twd.HTTP_1_0)) {
                ore.e(arrayList, "protocols must not contain http/1.0: ");
                return;
            }
            if (arrayList.contains(null)) {
                ore.p("protocols must not contain null");
                return;
            }
            arrayList.remove(twd.SPDY_3);
            if (!arrayList.equals(psbVarA.r)) {
                psbVarA.z = null;
            }
            psbVarA.r = Collections.unmodifiableList(arrayList);
            qsb qsbVar = new qsb(psbVarA);
            ag5 ag5VarA = dleVarA.a();
            ((p3c) ag5VarA.c).s("Upgrade", "websocket");
            ((p3c) ag5VarA.c).s(HTTP.CONN_DIRECTIVE, "Upgrade");
            ((p3c) ag5VarA.c).s("Sec-WebSocket-Key", l9eVar.g);
            ((p3c) ag5VarA.c).s("Sec-WebSocket-Version", "13");
            ((p3c) ag5VarA.c).s("Sec-WebSocket-Extensions", "permessage-deflate");
            dle dleVarA2 = ag5VarA.a();
            y8e y8eVar = new y8e(qsbVar, dleVarA2, true);
            l9eVar.h = y8eVar;
            y8eVar.e(new xp9(l9eVar, 28, dleVarA2));
        }
        this.socket = l9eVar;
    }

    @Override // defpackage.y5g
    public void safelyDoIfSocketExists(cf7 action) {
        action.getClass();
        mtj mtjVar = this.socket;
        if (mtjVar != null) {
            action.invoke(((l9e) mtjVar).a.toString());
        }
    }

    @Override // defpackage.y5g
    public void safelyResetSocketReference() {
        this.socket = null;
    }

    @Override // defpackage.y5g
    public boolean safelySendSocketMessage(String cmd) {
        cmd.getClass();
        mtj mtjVar = this.socket;
        if (mtjVar == null) {
            return false;
        }
        l9e l9eVar = (l9e) mtjVar;
        byte[] bytes = cmd.getBytes(pt2.a);
        d71 d71Var = new d71(bytes);
        d71Var.c = cmd;
        synchronized (l9eVar) {
            if (!l9eVar.u && !l9eVar.r) {
                long j = l9eVar.q;
                if (((long) bytes.length) + j > 16777216) {
                    l9eVar.b(1001, null);
                    return true;
                }
                l9eVar.q = j + ((long) bytes.length);
                l9eVar.p.add(new i9e(d71Var));
                l9eVar.f();
                return true;
            }
            return true;
        }
    }

    public /* synthetic */ WSSignaling(long j, m4g m4gVar, r5g r5gVar, ExecutorService executorService, y3e y3eVar, z3e z3eVar, long j2, boolean z, n96 n96Var, boolean z2, esh eshVar, x5g x5gVar, boolean z3, boolean z4, boolean z5, boolean z6, wxe wxeVar, af7 af7Var, j95 j95Var) {
        this(j, m4gVar, r5gVar, executorService, y3eVar, z3eVar, j2, z, n96Var, z2, eshVar, x5gVar, z3, z4, z5, z6, wxeVar, af7Var);
    }
}
