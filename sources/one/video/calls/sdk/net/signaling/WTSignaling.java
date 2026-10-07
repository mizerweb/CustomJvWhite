package one.video.calls.sdk.net.signaling;

import defpackage.af7;
import defpackage.b6g;
import defpackage.cf7;
import defpackage.cp9;
import defpackage.esh;
import defpackage.ex8;
import defpackage.i4i;
import defpackage.j95;
import defpackage.m4g;
import defpackage.n96;
import defpackage.q5g;
import defpackage.r5g;
import defpackage.u5g;
import defpackage.w5g;
import defpackage.wxe;
import defpackage.x5g;
import defpackage.xd5;
import defpackage.y3e;
import defpackage.y5g;
import defpackage.z3e;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.video.calls.sdk.net.signaling.wt.nal.NAL;
import one.video.calls.sdk.net.signaling.wt.nal.NALSocket;
import one.video.calls.sdk_private.wts.a;
import one.video.calls.sdk_private.wts.b;
import one.video.calls.sdk_private.wts.c;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 B2\u00020\u0001:\u0002CBB±\u0001\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u000f\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u000fH\u0014¢\u0006\u0004\b$\u0010%J\u001f\u0010*\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0014¢\u0006\u0004\b*\u0010+J)\u00101\u001a\u0002002\u0006\u0010,\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010(2\u0006\u0010/\u001a\u00020.H\u0014¢\u0006\u0004\b1\u00102J#\u00105\u001a\u0002002\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020003H\u0014¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u000200H\u0014¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u000f2\u0006\u00109\u001a\u00020(H\u0014¢\u0006\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lone/video/calls/sdk/net/signaling/WTSignaling;", "Ly5g;", "", "timeoutMS", "Lm4g;", "connectFailureListener", "Lr5g;", "signalingStat", "Ljava/util/concurrent/ExecutorService;", "executor", "Ly3e;", "log", "Lz3e;", "logConfiguration", "serverPingTimeoutMs", "", "isFastRecoverEnabled", "Ln96;", "endpointParameters", "isReplaceParametersInEndpointEnabled", "Lesh;", "timeProvider", "Lu5g;", "fallbackParams", "Lx5g;", "timeouts", "isSummaryStatsEnabled", "isSignalingLogThrottlingEnabled", "isUseOfIPEnabled", "isSNIEnabled", "Lwxe;", "sslProvider", "Lkotlin/Function0;", "peerIdGenerator", "<init>", "(JLm4g;Lr5g;Ljava/util/concurrent/ExecutorService;Ly3e;Lz3e;JZLn96;ZLesh;Lu5g;Lx5g;ZZZZLwxe;Laf7;)V", "isFallbackSupported", "()Z", "", "code", "", "reason", "safelyCloseSocketWithCodeAndReason", "(ILjava/lang/String;)Z", ApiProtocol.KEY_ENDPOINT, "hostname", "Lw5g;", "listener", "Lsbi;", "safelyCreateNewSocket", "(Ljava/lang/String;Ljava/lang/String;Lw5g;)V", "Lkotlin/Function1;", "action", "safelyDoIfSocketExists", "(Lcf7;)V", "safelyResetSocketReference", "()V", "cmd", "safelySendSocketMessage", "(Ljava/lang/String;)Z", "Lone/video/calls/sdk/net/signaling/wt/nal/NAL;", "nal", "Lone/video/calls/sdk/net/signaling/wt/nal/NAL;", "Lone/video/calls/sdk/net/signaling/wt/nal/NALSocket;", "socket", "Lone/video/calls/sdk/net/signaling/wt/nal/NALSocket;", "Companion", "Builder", "wtsignaling"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WTSignaling extends y5g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TRANSPORT_TAG = "WebTransportNetworking";
    private final NAL nal;
    private NALSocket socket;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011¨\u0006\u0012"}, d2 = {"Lone/video/calls/sdk/net/signaling/WTSignaling$Builder;", "Lb6g;", "<init>", "()V", "", "isEnabled", "setDataCompressionEnabled", "(Z)Lone/video/calls/sdk/net/signaling/WTSignaling$Builder;", "Lu5g;", "fallbackParams", "setFallbackParams", "(Lu5g;)Lone/video/calls/sdk/net/signaling/WTSignaling$Builder;", "Lone/video/calls/sdk/net/signaling/WTSignaling;", "build", "()Lone/video/calls/sdk/net/signaling/WTSignaling;", "isDataCompressionEnabled", "Z", "Lu5g;", "wtsignaling"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Builder extends b6g {
        private u5g fallbackParams;
        private boolean isDataCompressionEnabled = true;

        @Override // defpackage.b6g
        public WTSignaling build() {
            Objects.requireNonNull(getSignalingStat(), "Signaling statistics is required");
            Objects.requireNonNull(getExecutor(), "executor is required");
            Objects.requireNonNull(getLog(), "log is required");
            Objects.requireNonNull(getTimeProvider(), "time provider is required");
            Objects.requireNonNull(getLogConfiguration(), "log configuration is required");
            Objects.requireNonNull(getEndpointParameters(), "endpoint parameters are required");
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
            WTSignaling wTSignaling = new WTSignaling(timeoutMS, connectFailureListener, signalingStat, executor, log, logConfiguration, serverPingTimeoutMs, zIsFastRecoverEnabled, endpointParameters, zIsReplaceParametersInEndpointEnabled, timeProvider, this.fallbackParams, getTimeouts(), isSummaryStatsEnabled(), isSignalingLogThrottlingEnabled(), isUseOfIPEnabled(), isSNIEnabled(), getSslProvider(), getPeerIdGenerator(), null);
            wTSignaling.init();
            return wTSignaling;
        }

        public final Builder setDataCompressionEnabled(boolean isEnabled) {
            this.isDataCompressionEnabled = isEnabled;
            return this;
        }

        public final Builder setFallbackParams(u5g fallbackParams) {
            this.fallbackParams = fallbackParams;
            return this;
        }
    }

    private WTSignaling(long j, m4g m4gVar, r5g r5gVar, ExecutorService executorService, y3e y3eVar, z3e z3eVar, long j2, boolean z, n96 n96Var, boolean z2, esh eshVar, u5g u5gVar, x5g x5gVar, boolean z3, boolean z4, boolean z5, boolean z6, wxe wxeVar, af7 af7Var) {
        long j3;
        super(i4i.a, j, m4gVar, r5gVar, executorService, y3eVar, z3eVar, j2, z, n96Var, z2, new q5g("webtransport_restart", "webtransport_connected", "webtransport_reconnected", "webtransport_failed_pings", "webtransport_failed_exception", "webtransport_timeout"), eshVar, z3, z4, u5gVar, x5gVar, z5, z6, wxeVar, af7Var);
        a aVar = new a(this);
        Long lValueOf = null;
        cp9 cp9VarB = wxeVar != null ? ((xd5) ((ex8) wxeVar).b).b() : null;
        if (u5gVar == null) {
            j3 = x5gVar != null ? x5gVar.a : j3;
            this.nal = new NAL(aVar, lValueOf, cp9VarB, new b(y3eVar));
        }
        j3 = u5gVar.d;
        lValueOf = Long.valueOf(j3);
        this.nal = new NAL(aVar, lValueOf, cp9VarB, new b(y3eVar));
    }

    public static final String getDefaultCompression() {
        return INSTANCE.getDefaultCompression();
    }

    public static final boolean isAvailable() {
        return INSTANCE.isAvailable();
    }

    @Override // defpackage.y5g
    public boolean isFallbackSupported() {
        return true;
    }

    @Override // defpackage.y5g
    public boolean safelyCloseSocketWithCodeAndReason(int code, String reason) {
        reason.getClass();
        NALSocket nALSocket = this.socket;
        this.socket = null;
        if (nALSocket == null) {
            return false;
        }
        nALSocket.close(code, reason);
        return true;
    }

    @Override // defpackage.y5g
    public void safelyCreateNewSocket(String endpoint, String hostname, w5g listener) {
        endpoint.getClass();
        listener.getClass();
        NAL nal = this.nal;
        if (!isSNIEnabled()) {
            hostname = null;
        }
        this.socket = nal.createSocket(endpoint, hostname, new c(listener));
    }

    @Override // defpackage.y5g
    public void safelyDoIfSocketExists(cf7 action) {
        action.getClass();
        NALSocket nALSocket = this.socket;
        if (nALSocket != null) {
            action.invoke(nALSocket.getEndpoint());
        }
    }

    @Override // defpackage.y5g
    public void safelyResetSocketReference() {
        try {
            NALSocket nALSocket = this.socket;
            if (nALSocket != null) {
                nALSocket.close(0, "");
            }
        } catch (Throwable th) {
            getLog().reportException(TRANSPORT_TAG, "Can't close socket by reference reset request", new IllegalStateException("Error on close before reset", th));
        }
        this.socket = null;
    }

    @Override // defpackage.y5g
    public boolean safelySendSocketMessage(String cmd) {
        cmd.getClass();
        NALSocket nALSocket = this.socket;
        if (nALSocket == null) {
            return false;
        }
        nALSocket.send(cmd);
        return true;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0003\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lone/video/calls/sdk/net/signaling/WTSignaling$Companion;", "", "<init>", "()V", "TRANSPORT_TAG", "", "isAvailable", "", "isAvailable$annotations", "()Z", "defaultCompression", "getDefaultCompression$annotations", "getDefaultCompression", "()Ljava/lang/String;", "wtsignaling"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        public static /* synthetic */ void getDefaultCompression$annotations() {
        }

        public static /* synthetic */ void isAvailable$annotations() {
        }

        public final String getDefaultCompression() {
            return NALSocket.INSTANCE.getCOMPRESSION_NAME();
        }

        public final boolean isAvailable() {
            return true;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WTSignaling(long j, m4g m4gVar, r5g r5gVar, ExecutorService executorService, y3e y3eVar, z3e z3eVar, long j2, boolean z, n96 n96Var, boolean z2, esh eshVar, u5g u5gVar, x5g x5gVar, boolean z3, boolean z4, boolean z5, boolean z6, wxe wxeVar, af7 af7Var, j95 j95Var) {
        this(j, m4gVar, r5gVar, executorService, y3eVar, z3eVar, j2, z, n96Var, z2, eshVar, u5gVar, x5gVar, z3, z4, z5, z6, wxeVar, af7Var);
    }
}
