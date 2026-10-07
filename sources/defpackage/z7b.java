package defpackage;

import android.os.Build;

/* JADX INFO: loaded from: classes3.dex */
public final class z7b implements hh6 {
    public static final /* synthetic */ zv8[] k0 = {new z8b(z7b.class, "isCamera2ApiEnabled", "isCamera2ApiEnabled()Z"), zo5.e(zfe.a, z7b.class, "maxCameraFrameDimension", "getMaxCameraFrameDimension()I"), new z8b(z7b.class, "timeouts", "getTimeouts()Lru/ok/android/webrtc/CallParams$Timeouts;"), new z8b(z7b.class, "isNonOpusRemovalEnabled", "isNonOpusRemovalEnabled()Z"), new z8b(z7b.class, "isEnqueuedCommandMergeEnabled", "isEnqueuedCommandMergeEnabled()Z"), new z8b(z7b.class, "isDynamicScreenShareSizeUpdateEnabled", "isDynamicScreenShareSizeUpdateEnabled()Z"), new z8b(z7b.class, "isBackendRenderVmojiEnabled", "isBackendRenderVmojiEnabled()Z"), new z8b(z7b.class, "isFilterCallMuteStateInitForAdmins", "isFilterCallMuteStateInitForAdmins()Z"), new z8b(z7b.class, "isInCallAnalyticsUploadEnabled", "isInCallAnalyticsUploadEnabled()Z"), new z8b(z7b.class, "callAnalyticsUploadMaxLoss", "getCallAnalyticsUploadMaxLoss()Ljava/lang/Double;"), new z8b(z7b.class, "callAnalyticsUploadMinBitrate", "getCallAnalyticsUploadMinBitrate()Ljava/lang/Double;"), new z8b(z7b.class, "userFieldTrials", "getUserFieldTrials()Ljava/lang/String;"), new z8b(z7b.class, "vpnPreference", "getVpnPreference()Lorg/webrtc/PeerConnection$VpnPreference;"), new z8b(z7b.class, "emulatedNegotiationErrorType", "getEmulatedNegotiationErrorType()Lru/ok/android/webrtc/stat/NegotiationError$Type;"), new z8b(z7b.class, "skipRequestReallocEnabled", "getSkipRequestReallocEnabled()Z"), new z8b(z7b.class, "isWebTransportEnabled", "isWebTransportEnabled()Z"), new z8b(z7b.class, "wtToWsFallbackParams", "getWtToWsFallbackParams()Lru/ok/android/webrtc/signaling/transport/SignalingTransport$FallbackParams;"), new z8b(z7b.class, "isIdsMappersLoggingEnabled", "isIdsMappersLoggingEnabled()Z"), new z8b(z7b.class, "emulatedApiError", "getEmulatedApiError()Lone/video/calls/sdk/experiments/ExperimentsInterface$EmulatedApiError;"), new z8b(z7b.class, "isDtxDenoiseEnabled", "isDtxDenoiseEnabled()Z"), new z8b(z7b.class, "isSummaryStatsEnabled", "isSummaryStatsEnabled()Z"), new z8b(z7b.class, "isSignalingLogThrottlingEnabled", "isSignalingLogThrottlingEnabled()Z"), new z8b(z7b.class, "aiOpusBweConfig", "getAiOpusBweConfig()Lone/video/calls/sdk/experiments/models/AiOpusBweConfig;"), new z8b(z7b.class, "isTokenInvalidationEnabled", "isTokenInvalidationEnabled()Z"), new z8b(z7b.class, "isH265Prioritized", "isH265Prioritized()Z"), new z8b(z7b.class, "isLinearBweEnabled", "isLinearBweEnabled()Z"), new z8b(z7b.class, "isAdaptiveOpusComplexityEnabled", "isAdaptiveOpusComplexityEnabled()Z"), new z8b(z7b.class, "isAudioRecordEnabledOnStart", "isAudioRecordEnabledOnStart()Z"), new z8b(z7b.class, "isAudioPipelineDisabled", "isAudioPipelineDisabled()Z"), new z8b(z7b.class, "isAudioCaptureLoggingEnabled", "isAudioCaptureLoggingEnabled()Z"), new z8b(z7b.class, "isCorruptWsEndpointEnabled", "isCorruptWsEndpointEnabled()Z"), new z8b(z7b.class, "simulcastState", "getSimulcastState()Lone/video/calls/sdk/experiments/ExperimentsInterface$SimulcastState;"), new z8b(z7b.class, "emulatedSignalingError", "getEmulatedSignalingError()Lone/video/calls/sdk/experiments/ExperimentsInterface$EmulatedSignalingError;"), new z8b(z7b.class, "emulatedIceCandidateError", "getEmulatedIceCandidateError()Lone/video/calls/sdk/experiments/ExperimentsInterface$EmulatedIceCandidatesError;"), new z8b(z7b.class, "isSignalingByIpEnabled", "isSignalingByIpEnabled()Z"), new z8b(z7b.class, "isSNIEnabled", "isSNIEnabled()Z"), new z8b(z7b.class, "isReplaceParametersInEndpointEnabled", "isReplaceParametersInEndpointEnabled()Z"), new z8b(z7b.class, "isUseGeneratedPeerIdEnabled", "isUseGeneratedPeerIdEnabled()Z"), new z8b(z7b.class, "isDirectICERestartEnabled", "isDirectICERestartEnabled()Z"), new z8b(z7b.class, "bitrateDumpGatheringState", "getBitrateDumpGatheringState()Lone/video/calls/sdk/experiments/ExperimentsInterface$BitrateDumpGatheringState;"), new z8b(z7b.class, "isEarlyApplyRemoteOfferEnabled", "isEarlyApplyRemoteOfferEnabled()Z"), new z8b(z7b.class, "isVideoTransformV2Enabled", "isVideoTransformV2Enabled()Z"), new z8b(z7b.class, "isEarlyCreatePeerConnectionEnabled", "isEarlyCreatePeerConnectionEnabled()Z"), new z8b(z7b.class, "preferredIceCandidatesPoolSize", "getPreferredIceCandidatesPoolSize()Ljava/lang/Integer;"), new z8b(z7b.class, "isDoNothingOnIceFailureEnabled", "isDoNothingOnIceFailureEnabled()Z"), new z8b(z7b.class, "isLowLatencyAudioEnabled", "isLowLatencyAudioEnabled()Z"), new z8b(z7b.class, "nsConfig", "getNsConfig()Lone/video/calls/sdk/experiments/models/NsConfig;"), new z8b(z7b.class, "pcapLabelConfig", "getPcapLabelConfig()Lone/video/calls/sdk/experiments/models/PcapLabelConfig;"), new z8b(z7b.class, "isNoIdsResolutionForPrepareEnabled", "isNoIdsResolutionForPrepareEnabled()Z"), new z8b(z7b.class, "h265BitrateScale", "getH265BitrateScale()Ljava/lang/Float;"), new z8b(z7b.class, "audioFormatConfig", "getAudioFormatConfig()Lru/ok/android/webrtc/mediarecord/AudioFormat$Config;"), new z8b(z7b.class, "isOnlySoftwareEncodersEnabled", "isOnlySoftwareEncodersEnabled()Z"), new z8b(z7b.class, "signalingTransportTimeouts", "getSignalingTransportTimeouts()Lru/ok/android/webrtc/signaling/transport/SignalingTransport$Timeouts;"), new z8b(z7b.class, "isDeprecatedStatDisabled", "isDeprecatedStatDisabled()Z"), new z8b(z7b.class, "isFastConnectByIpEnabled", "isFastConnectByIpEnabled()Z"), new z8b(z7b.class, "isSignalingCommandSmartModeEnabled", "isSignalingCommandSmartModeEnabled()Z"), new z8b(z7b.class, "isAudioSessionMonitorEnabled", "isAudioSessionMonitorEnabled()Z"), new z8b(z7b.class, "isNetworkSensorEnabled", "isNetworkSensorEnabled()Z"), new z8b(z7b.class, "isTransparentAudioEnabled", "isTransparentAudioEnabled()Z"), new z8b(z7b.class, "isMediaStatFixEnabled", "isMediaStatFixEnabled()Z"), new z8b(z7b.class, "isEarlyVideoEnabled", "isEarlyVideoEnabled()Z")};
    public final y7b A;
    public final y7b B;
    public final y7b C;
    public final y7b D;
    public final y7b E;
    public final y7b F;
    public final y7b G;
    public final y7b H;
    public final y7b I;
    public final y7b J;
    public final y7b K;
    public final y7b L;
    public final y7b M;
    public final y7b N;
    public final y7b O;
    public final y7b P;
    public final y7b Q;
    public final y7b R;
    public final y7b S;
    public final y7b T;
    public final y7b U;
    public final y7b V;
    public final y7b W;
    public final y7b X;
    public final y7b Y;
    public final y7b Z;
    public final j22 a;
    public final y7b a0;
    public final y7b b;
    public final y7b b0;
    public final y7b c;
    public final y7b c0;
    public final y7b d;
    public final y7b d0;
    public final y7b e;
    public final y7b e0;
    public final y7b f;
    public final y7b f0;
    public final y7b g;
    public final y7b g0;
    public final y7b h;
    public final y7b h0;
    public final y7b i;
    public final y7b i0;
    public final y7b j;
    public final y7b j0;
    public final y7b k;
    public final y7b l;
    public final y7b m;
    public final y7b n;
    public final y7b o;
    public final y7b p;
    public final y7b q;
    public final y7b r;
    public final y7b s;
    public final y7b t;
    public final y7b u;
    public final y7b v;
    public final y7b w;
    public final y7b x;
    public final y7b y;
    public final y7b z;

    public z7b(j22 j22Var) {
        this.a = j22Var;
        this.b = new y7b(this, Boolean.valueOf(Build.VERSION.SDK_INT >= 29));
        this.c = new y7b(this, 960);
        this.d = new y7b(this, null);
        Boolean bool = Boolean.FALSE;
        this.e = new y7b(this, bool);
        this.f = new y7b(this, bool);
        this.g = new y7b(this, bool);
        this.h = new y7b(this, bool);
        Boolean bool2 = Boolean.TRUE;
        this.i = new y7b(this, bool2);
        this.j = new y7b(this, bool2);
        this.k = new y7b(this, null);
        this.l = new y7b(this, null);
        this.m = new y7b(this, null);
        this.n = new y7b(this, null);
        this.o = new y7b(this, null);
        this.p = new y7b(this, bool);
        this.q = new y7b(this, bool);
        this.r = new y7b(this, null);
        this.s = new y7b(this, bool);
        this.t = new y7b(this, null);
        this.u = new y7b(this, bool2);
        this.v = new y7b(this, bool);
        this.w = new y7b(this, bool);
        this.x = new y7b(this, bf.a);
        this.y = new y7b(this, bool);
        this.z = new y7b(this, bool);
        this.A = new y7b(this, bool);
        this.B = new y7b(this, bool);
        this.C = new y7b(this, bool);
        this.D = new y7b(this, bool);
        this.E = new y7b(this, bool);
        this.F = new y7b(this, bool);
        this.G = new y7b(this, fh6.a);
        this.H = new y7b(this, eh6.a);
        this.I = new y7b(this, dh6.a);
        this.J = new y7b(this, bool);
        this.K = new y7b(this, bool);
        this.L = new y7b(this, bool);
        this.M = new y7b(this, bool);
        this.N = new y7b(this, bool);
        this.O = new y7b(this, ah6.a);
        this.P = new y7b(this, bool);
        this.Q = new y7b(this, bool);
        this.R = new y7b(this, bool);
        this.S = new y7b(this, null);
        this.T = new y7b(this, bool);
        this.U = new y7b(this, bool);
        this.V = new y7b(this, new gpb(false, 2));
        this.W = new y7b(this, null);
        this.X = new y7b(this, bool);
        this.Y = new y7b(this, null);
        this.Z = new y7b(this, null);
        this.a0 = new y7b(this, bool);
        this.b0 = new y7b(this, null);
        this.c0 = new y7b(this, bool);
        this.d0 = new y7b(this, bool);
        this.e0 = new y7b(this, bool);
        this.f0 = new y7b(this, bool);
        this.g0 = new y7b(this, bool);
        this.h0 = new y7b(this, bool);
        this.i0 = new y7b(this, bool2);
        this.j0 = new y7b(this, bool);
    }

    @Override // defpackage.hh6
    public final boolean a() {
        return ((Boolean) this.y.a(k0[23])).booleanValue();
    }

    @Override // defpackage.hh6
    public final boolean b() {
        return ((Boolean) this.e0.a(k0[55])).booleanValue();
    }

    @Override // defpackage.hh6
    public final boolean c() {
        return ((Boolean) this.X.a(k0[48])).booleanValue();
    }

    @Override // defpackage.hh6
    public final boolean d() {
        return ((Boolean) this.L.a(k0[36])).booleanValue();
    }

    @Override // defpackage.hh6
    public final boolean e() {
        return ((Boolean) this.j0.a(k0[60])).booleanValue();
    }

    @Override // defpackage.hh6
    public final dh6 f() {
        return (dh6) this.I.a(k0[33]);
    }

    @Override // defpackage.hh6
    public final void g() {
        if (this.t.a(k0[18]) == null) {
            return;
        }
        ore.m();
    }

    @Override // defpackage.hh6
    public final gpb h() {
        return (gpb) this.V.a(k0[46]);
    }

    @Override // defpackage.hh6
    public final boolean i() {
        return ((Boolean) this.F.a(k0[30])).booleanValue();
    }

    @Override // defpackage.hh6
    public final boolean j() {
        return ((Boolean) this.d0.a(k0[54])).booleanValue();
    }

    @Override // defpackage.hh6
    public final boolean k() {
        return ((Boolean) this.s.a(k0[17])).booleanValue();
    }

    @Override // defpackage.hh6
    public final boolean l() {
        return ((Boolean) this.M.a(k0[37])).booleanValue();
    }

    public final ef m() {
        return (ef) this.x.a(k0[22]);
    }

    public final boolean n() {
        return ((Boolean) this.h0.a(k0[58])).booleanValue();
    }
}
