package ru.ok.android.externcalls.sdk;

import defpackage.a4f;
import defpackage.af7;
import defpackage.co0;
import defpackage.eq9;
import defpackage.et7;
import defpackage.iq8;
import defpackage.j22;
import defpackage.nue;
import defpackage.ore;
import defpackage.sbi;
import defpackage.vt1;
import defpackage.wxe;
import defpackage.x3e;
import defpackage.y3e;
import defpackage.z7b;
import java.util.Collections;
import java.util.List;
import ru.ok.android.externcalls.analytics.config.UploadConfig;
import ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate;
import ru.ok.android.externcalls.sdk.capabilities.ClientCapabilities;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionSettings;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;

/* JADX INFO: loaded from: classes3.dex */
public class ConversationFactoryParams {
    StartConversationDelegate confroomStartConversationDelegate;
    private boolean dnsResolverEnabled;
    private eq9 groupCallMediaAdaptationConfig;
    et7 hangupDelegate;
    iq8 joinConversationDelegate;
    private eq9 p2pCallMediaAdaptationConfig;
    StartConversationDelegate p2pStartConversationDelegate;
    private a4f screenCapturePermissionProvider;
    private boolean forceRelayPolicy = false;
    private int audioLevelFrequencyMs = 250;
    private nue rotationProvider = nue.M0;
    private String appVersion = "sdk-0.2.6";
    private boolean isWebRTCCodecFilteringEnabled = false;
    private String[] audioCodecs = null;
    private String[] videoCodecs = null;
    private boolean multipleDevicesEnabled = false;
    private boolean showLocalVideoInOriginalQuality = false;
    private boolean isFastScreenCaptureEnabled = false;
    private boolean isDeviceAudioShareEnabled = false;
    private boolean isAsrOnlineEnabled = false;

    @Deprecated
    private boolean isSignalingDefaultValuesFilteringEnabled = true;

    @Deprecated
    private boolean isWaitingRoomActivated = true;

    @Deprecated
    private boolean isSessionRoomsFeatureEnabled = true;
    private boolean isMediaAdaptationFeatureEnabledForP2PCall = true;
    private boolean isMediaAdaptationFeatureEnabledForGroupCall = true;
    private boolean isConsumerUpdateEnabled = true;
    private boolean onDemandTracksEnabled = true;
    private boolean dataChannelScreenshareRecvEnabled = true;
    private boolean dataChannelScreenshareSendEnabled = true;
    private int videoTracksCount = 10;
    private boolean fastRecoverEnabled = true;
    private long mediaReceivingTimeoutMs = 10000;
    private MediaConnectionSettings mediaConnectionSettings = new MediaConnectionSettings();
    private RttRateHintConfig rttRateHintConfig = new RttRateHintConfig();

    @Deprecated
    private boolean isAudienceModeEnabled = false;
    private boolean enableLossRttBadConnectionHandling = false;
    private vt1 bitrates = CallUtil.createBitrates();
    private List<String> additionalWhitelistedCodecPrefixes = Collections.EMPTY_LIST;
    private co0 badNetworkIndicatorConfig = co0.e;
    private wxe sslProvider = null;
    private boolean logExperimentChanges = false;
    protected y3e log = x3e.a;
    protected final z7b experiments = new z7b(new j22(26, this));
    private ClientCapabilities clientCapabilities = null;

    public /* synthetic */ sbi lambda$new$0(af7 af7Var) {
        if (this.logExperimentChanges) {
            this.log.log("CallsSDKExp", (String) af7Var.invoke());
        }
        return sbi.a;
    }

    public int getAudioLevelFrequencyMs() {
        return this.audioLevelFrequencyMs;
    }

    public ConversationBuilder getBaseBuilder(IdMappingWrapper idMappingWrapper) {
        ClientCapabilities clientCapabilities = this.clientCapabilities;
        if (clientCapabilities == null) {
            clientCapabilities = ClientCapabilities.getDefault().set(ClientCapabilities.Capability.WAITING_HALL, this.isWaitingRoomActivated).set(ClientCapabilities.Capability.SESSION_ROOMS, this.isSessionRoomsFeatureEnabled).set(ClientCapabilities.Capability.FILTER_DEFAULTS, this.isSignalingDefaultValuesFilteringEnabled).set(ClientCapabilities.Capability.AUDIENCE_MODE, this.isAudienceModeEnabled);
        }
        return new ConversationBuilder(idMappingWrapper, this.experiments).setClientCapabilities(clientCapabilities).setVersion(this.appVersion).setDnsResolverEnabled(this.dnsResolverEnabled).setConsumerUpdateEnabled(this.isConsumerUpdateEnabled).setOnDemandTracksEnabled(this.onDemandTracksEnabled).setAdditionalWhitelistedCodecPrefixes(this.additionalWhitelistedCodecPrefixes).setBitrates(this.bitrates).setEnableLossRttBadConnectionHandling(this.enableLossRttBadConnectionHandling).setDataChannelScreenshareRecvEnabled(this.dataChannelScreenshareRecvEnabled).setDataChannelScreenshareSendEnabled(this.dataChannelScreenshareSendEnabled).setVideoTracksCount(this.videoTracksCount).setFastRecoverEnabled(this.fastRecoverEnabled).setMediaReceivingTimeoutMs(this.mediaReceivingTimeoutMs).setForceRelayPolicy(this.forceRelayPolicy).setAudioLevelFrequencyMs(this.audioLevelFrequencyMs).setWebRTCCodecFilteringEnabled(this.isWebRTCCodecFilteringEnabled).setWebRTCAudioCodecs(this.audioCodecs).setWebRTCVideoCodecs(this.videoCodecs).setMultipleDevicesEnabled(this.multipleDevicesEnabled).setRotationProvider(this.rotationProvider).setRotationProvider(this.rotationProvider).showLocalVideoInOriginalQuality(this.showLocalVideoInOriginalQuality).setAsrOnlineEnabled(this.isAsrOnlineEnabled).setFastScreenCaptureEnabled(this.isFastScreenCaptureEnabled).setDeviceAudioShareEnabled(this.isDeviceAudioShareEnabled).setMediaAdaptationFeatureEnabledForP2PCall(this.isMediaAdaptationFeatureEnabledForP2PCall).setP2PCallMediaAdaptationConfig(this.p2pCallMediaAdaptationConfig).setMediaAdaptationFeatureEnabledForGroupCall(this.isMediaAdaptationFeatureEnabledForGroupCall).setGroupCallMediaAdaptationConfig(this.groupCallMediaAdaptationConfig).setMediaConnectionSettings(this.mediaConnectionSettings).setRttRateHintConfig(this.rttRateHintConfig).setBadNetworkIndicatorConfig(this.badNetworkIndicatorConfig).setScreenCapturePermissionProvider(this.screenCapturePermissionProvider).setSSLProvider(this.sslProvider).setHangupApiDelegate(this.hangupDelegate);
    }

    public boolean isDnsResolverEnabled() {
        return this.dnsResolverEnabled;
    }

    public void setAdditionalWhitelistedCodecPrefixes(List<String> list) {
        this.additionalWhitelistedCodecPrefixes = list;
    }

    public void setAppVersion(String str) {
        this.appVersion = str;
    }

    public void setAsrOnlineEnabled(boolean z) {
        this.isAsrOnlineEnabled = z;
    }

    @Deprecated(forRemoval = UploadConfig.DEFAULT_DISABLE_UPLOAD_IN_CALL, since = "0.1.4")
    public void setAudienceModeEnabled(boolean z) {
        this.isAudienceModeEnabled = z;
    }

    public void setAudioCodecs(String[] strArr) {
        this.audioCodecs = strArr;
    }

    public void setAudioLevelFrequencyMs(int i) {
        this.audioLevelFrequencyMs = i;
    }

    public void setBadNetworkIndicatorConfig(co0 co0Var) {
        if (co0Var == null) {
            co0Var = co0.e;
        }
        this.badNetworkIndicatorConfig = co0Var;
    }

    public void setBitrates(vt1 vt1Var) {
        this.bitrates = vt1Var;
    }

    public void setClientCapabilities(ClientCapabilities clientCapabilities) {
        if (clientCapabilities == null) {
            clientCapabilities = ClientCapabilities.getDefault();
        }
        this.clientCapabilities = clientCapabilities;
    }

    public void setConfroomStartConversationDelegate(StartConversationDelegate startConversationDelegate) {
        this.confroomStartConversationDelegate = startConversationDelegate;
    }

    public void setConsumerUpdateEnabled(boolean z) {
        this.isConsumerUpdateEnabled = z;
    }

    public void setDataChannelScreenshareRecvEnabled(boolean z) {
        this.dataChannelScreenshareRecvEnabled = z;
    }

    public void setDataChannelScreenshareSendEnabled(boolean z) {
        this.dataChannelScreenshareSendEnabled = z;
    }

    public void setDeviceAudioShareEnabled(boolean z) {
        this.isDeviceAudioShareEnabled = z;
    }

    public void setEnableLossRttBadConnectionHandling(boolean z) {
        this.enableLossRttBadConnectionHandling = z;
    }

    public void setEnabledDnsResolver(boolean z) {
        this.dnsResolverEnabled = z;
    }

    public void setFastRecoverEnabled(boolean z) {
        this.fastRecoverEnabled = z;
    }

    public void setFastScreenCaptureEnabled(boolean z) {
        this.isFastScreenCaptureEnabled = z;
    }

    public void setForceRelayPolicy(boolean z) {
        this.forceRelayPolicy = z;
    }

    public void setGroupCallMediaAdaptationConfig(eq9 eq9Var) {
        this.groupCallMediaAdaptationConfig = eq9Var;
    }

    public void setHangupApiDelegate(et7 et7Var) {
        this.hangupDelegate = et7Var;
    }

    public void setIsMediaAdaptationFeatureEnabledForGroupCall(boolean z) {
        this.isMediaAdaptationFeatureEnabledForGroupCall = z;
    }

    public void setIsMediaAdaptationFeatureEnabledForP2PCall(boolean z) {
        this.isMediaAdaptationFeatureEnabledForP2PCall = z;
    }

    @Deprecated(forRemoval = UploadConfig.DEFAULT_DISABLE_UPLOAD_IN_CALL, since = "0.1.4")
    public void setIsWaitingRoomActivated(boolean z) {
        this.isWaitingRoomActivated = z;
    }

    public void setJoinConversationDelegate(iq8 iq8Var) {
        this.joinConversationDelegate = iq8Var;
    }

    public void setLogExperimentChanges(boolean z) {
        this.logExperimentChanges = z;
    }

    public void setMediaConnectionSettings(MediaConnectionSettings mediaConnectionSettings) {
        this.mediaConnectionSettings = mediaConnectionSettings;
    }

    public void setMediaReceivingTimeoutMs(long j) {
        this.mediaReceivingTimeoutMs = j;
    }

    public void setMultipleDevicesEnabled(boolean z) {
        this.multipleDevicesEnabled = z;
    }

    public void setOnDemandTracksEnabled(boolean z) {
        this.onDemandTracksEnabled = z;
    }

    public void setP2PCallMediaAdaptationConfig(eq9 eq9Var) {
        this.p2pCallMediaAdaptationConfig = eq9Var;
    }

    public void setP2pStartConversationDelegate(StartConversationDelegate startConversationDelegate) {
        this.p2pStartConversationDelegate = startConversationDelegate;
    }

    public void setRotationProvider(nue nueVar) {
        this.rotationProvider = nueVar;
    }

    public void setRttRateHintConfig(RttRateHintConfig rttRateHintConfig) {
        this.rttRateHintConfig = rttRateHintConfig;
    }

    public void setScreenCapturePermissionProvider(a4f a4fVar) {
        this.screenCapturePermissionProvider = a4fVar;
    }

    @Deprecated(forRemoval = UploadConfig.DEFAULT_DISABLE_UPLOAD_IN_CALL, since = "0.1.4")
    public void setSessionRoomsEnabled(boolean z) {
        this.isSessionRoomsFeatureEnabled = z;
    }

    public void setShowLocalVideoInOriginalQuality(boolean z) {
        this.showLocalVideoInOriginalQuality = z;
    }

    @Deprecated(forRemoval = UploadConfig.DEFAULT_DISABLE_UPLOAD_IN_CALL, since = "0.1.4")
    public void setSignalingDefaultValuesFilteringEnabled(boolean z) {
        this.isSignalingDefaultValuesFilteringEnabled = z;
    }

    public void setSslProvider(wxe wxeVar) {
        this.sslProvider = wxeVar;
    }

    public void setVideoCodecs(String[] strArr) {
        this.videoCodecs = strArr;
    }

    public void setVideoTracksCount(int i) {
        if (i > 0) {
            this.videoTracksCount = i;
        } else {
            ore.p("Video tracks count must be positive");
        }
    }

    public void setWebRTCCodecFilteringEnabled(boolean z) {
        this.isWebRTCCodecFilteringEnabled = z;
    }
}
