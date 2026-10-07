package ru.ok.android.externcalls.sdk;

import android.content.Context;
import defpackage.a4f;
import defpackage.cn2;
import defpackage.co0;
import defpackage.eq9;
import defpackage.esh;
import defpackage.et7;
import defpackage.fsb;
import defpackage.iq8;
import defpackage.nue;
import defpackage.opb;
import defpackage.vt1;
import defpackage.wl;
import defpackage.wxe;
import defpackage.y3e;
import defpackage.y7b;
import defpackage.yt1;
import defpackage.z3e;
import defpackage.z7b;
import defpackage.zv8;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.sdk.api.OkApiService;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate;
import ru.ok.android.externcalls.sdk.api.interceptor.ExecutionTimeInterceptor;
import ru.ok.android.externcalls.sdk.capabilities.ClientCapabilities;
import ru.ok.android.externcalls.sdk.chat.ChatStateListener;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionSettings;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.rate.rtt.RttRateHintConfig;

/* JADX INFO: loaded from: classes3.dex */
class ConversationBuilder {
    List<String> additionalWhitelistedCodecPrefixes;
    CallAnalyticsSender analyticsSender;
    wl animojiRenderProvider;
    String anonToken;
    boolean answerAsContact;
    fsb api;
    co0 badNetworkIndicatorConfig;
    opb cameraCapturerFactory;
    String cid;
    String clientType;
    Context context;
    ConversationFactory creator;
    boolean dnsResolverEnabled;
    String domainId;
    boolean enableLossRttBadConnectionHandling;
    ConversationEventsListener eventListener;
    ExecutionTimeInterceptor executionTimeInterceptor;
    ExecutorService executorService;
    final z7b experiments;
    IdsMapper<yt1, ParticipantId> externalIdsMapper;
    boolean forceRelayPolicy;
    cn2 frameInterceptor;
    eq9 groupCallMediaAdaptationConfig;
    et7 hangupDelegate;
    boolean hasVideo;
    IdMappingWrapper idMappingWrapper;
    ConversationParticipant initialOpponent;
    IdsMapper<ParticipantId, yt1> internalIdsMapper;
    boolean isAnswer;
    boolean isCaller;
    boolean isConsumerUpdateEnabled;
    boolean isDataChannelScreenshareRecvEnabled;
    boolean isDataChannelScreenshareSendEnabled;
    boolean isJoined;
    boolean isOnDemandTracksEnabled;
    boolean isWatchTogetherEnabledForAll;
    iq8 joinConversationDelegate;
    String joinLink;
    y3e log;
    z3e logConfiguration;

    /* JADX INFO: renamed from: me */
    ConversationParticipant f0me;
    MediaConnectionSettings mediaConnectionSettings;
    long mediaReceivingTimeoutMs;
    boolean multipleDevicesEnabled;
    OkApiService okApiService;
    String payload;
    eq9 ptpCallMediaAdaptationConfig;
    RttRateHintConfig rttRateHintConfig;
    a4f screenCapturePermissionProvider;
    boolean showLocalVideoInOriginalQuality;
    StartConversationDelegate startConversationDelegate;
    esh timeProvider;
    String version;
    boolean waitForAdminEnabled = false;
    int audioLevelFrequencyMs = 250;
    vt1 bitrates = null;
    int videoTracksCount = 10;
    boolean fastRecoverEnabled = false;
    boolean isWebRTCCodecFilteringEnabled = false;
    String[] audioCodecs = null;
    String[] videoCodecs = null;
    nue rotationProvider = nue.M0;
    boolean isFastScreenCaptureEnabled = false;
    boolean isDeviceAudioShareEnabled = false;
    boolean isAsrOnlineEnabled = false;
    boolean isMediaAdaptationFeatureEnabledForP2PCall = true;
    boolean isMediaAdaptationFeatureEnabledForGroupCall = true;
    Locale locale = null;
    ChatStateListener chatStateListener = ChatStateListener.EMPTY;
    Long chatId = null;
    ClientCapabilities clientCapabilities = ClientCapabilities.getDefault();
    RemoteSettings remoteSettings = null;
    wxe sslProvider = null;
    long ringingTimeout = 0;

    public ConversationBuilder(IdMappingWrapper idMappingWrapper, z7b z7bVar) {
        this.idMappingWrapper = idMappingWrapper;
        this.experiments = z7bVar;
    }

    public ConversationImpl createConversation() {
        return new ConversationImpl(this);
    }

    public ConversationBuilder setAdditionalWhitelistedCodecPrefixes(List<String> list) {
        this.additionalWhitelistedCodecPrefixes = list;
        return this;
    }

    public ConversationBuilder setAnalyticsSender(CallAnalyticsSender callAnalyticsSender) {
        this.analyticsSender = callAnalyticsSender;
        return this;
    }

    public ConversationBuilder setAnimojiDataSupplier(wl wlVar) {
        this.animojiRenderProvider = wlVar;
        return this;
    }

    public ConversationBuilder setAnonToken(String str) {
        this.anonToken = str;
        return this;
    }

    public ConversationBuilder setAnswerAsContact(boolean z) {
        this.answerAsContact = z;
        return this;
    }

    public ConversationBuilder setApi(fsb fsbVar) {
        this.api = fsbVar;
        return this;
    }

    public ConversationBuilder setAsrOnlineEnabled(boolean z) {
        this.isAsrOnlineEnabled = z;
        return this;
    }

    public ConversationBuilder setAudioLevelFrequencyMs(int i) {
        this.audioLevelFrequencyMs = i;
        return this;
    }

    public ConversationBuilder setBadNetworkIndicatorConfig(co0 co0Var) {
        this.badNetworkIndicatorConfig = co0Var;
        return this;
    }

    public ConversationBuilder setBitrates(vt1 vt1Var) {
        this.bitrates = vt1Var;
        return this;
    }

    public ConversationBuilder setCameraCapturerFactory(opb opbVar) {
        this.cameraCapturerFactory = opbVar;
        return this;
    }

    public ConversationBuilder setChatId(Long l) {
        this.chatId = l;
        return this;
    }

    public ConversationBuilder setChatStateListener(ChatStateListener chatStateListener) {
        this.chatStateListener = chatStateListener;
        return this;
    }

    public ConversationBuilder setCid(String str) {
        this.cid = str;
        return this;
    }

    public ConversationBuilder setClientCapabilities(ClientCapabilities clientCapabilities) {
        if (clientCapabilities == null) {
            clientCapabilities = ClientCapabilities.getDefault();
        }
        this.clientCapabilities = clientCapabilities;
        return this;
    }

    public ConversationBuilder setClientType(String str) {
        this.clientType = str;
        return this;
    }

    public ConversationBuilder setConsumerUpdateEnabled(boolean z) {
        this.isConsumerUpdateEnabled = z;
        return this;
    }

    public ConversationBuilder setContext(Context context) {
        this.context = context;
        return this;
    }

    public ConversationBuilder setCreator(ConversationFactory conversationFactory) {
        this.creator = conversationFactory;
        return this;
    }

    public ConversationBuilder setDataChannelScreenshareRecvEnabled(boolean z) {
        this.isDataChannelScreenshareRecvEnabled = z;
        return this;
    }

    public ConversationBuilder setDataChannelScreenshareSendEnabled(boolean z) {
        this.isDataChannelScreenshareSendEnabled = z;
        return this;
    }

    public ConversationBuilder setDeviceAudioShareEnabled(boolean z) {
        this.isDeviceAudioShareEnabled = z;
        return this;
    }

    public ConversationBuilder setDnsResolverEnabled(boolean z) {
        this.dnsResolverEnabled = z;
        return this;
    }

    public ConversationBuilder setDomainId(String str) {
        this.domainId = str;
        return this;
    }

    public ConversationBuilder setEnableLossRttBadConnectionHandling(boolean z) {
        this.enableLossRttBadConnectionHandling = z;
        return this;
    }

    public ConversationBuilder setEventListener(ConversationEventsListener conversationEventsListener) {
        this.eventListener = conversationEventsListener;
        return this;
    }

    public ConversationBuilder setExecutionTimeInterceptor(ExecutionTimeInterceptor executionTimeInterceptor) {
        this.executionTimeInterceptor = executionTimeInterceptor;
        return this;
    }

    public ConversationBuilder setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
        return this;
    }

    public ConversationBuilder setExternalIdsMapper(IdsMapper<yt1, ParticipantId> idsMapper) {
        this.externalIdsMapper = idsMapper;
        return this;
    }

    public ConversationBuilder setFastRecoverEnabled(boolean z) {
        this.fastRecoverEnabled = z;
        return this;
    }

    public ConversationBuilder setFastScreenCaptureEnabled(boolean z) {
        this.isFastScreenCaptureEnabled = z;
        return this;
    }

    public ConversationBuilder setFieldTrials(String str) {
        y7b y7bVar = this.experiments.m;
        zv8 zv8Var = z7b.k0[11];
        y7bVar.b(str);
        return this;
    }

    public ConversationBuilder setForceRelayPolicy(boolean z) {
        this.forceRelayPolicy = z;
        return this;
    }

    public ConversationBuilder setFrameInterceptor(cn2 cn2Var) {
        return this;
    }

    public ConversationBuilder setGroupCallMediaAdaptationConfig(eq9 eq9Var) {
        this.groupCallMediaAdaptationConfig = eq9Var;
        return this;
    }

    public ConversationBuilder setHangupApiDelegate(et7 et7Var) {
        this.hangupDelegate = et7Var;
        return this;
    }

    public ConversationBuilder setHasVideo(boolean z) {
        this.hasVideo = z;
        return this;
    }

    public ConversationBuilder setInternalIdsMapper(IdsMapper<ParticipantId, yt1> idsMapper) {
        this.internalIdsMapper = idsMapper;
        return this;
    }

    public ConversationBuilder setIsAnswer(boolean z) {
        this.isAnswer = z;
        return this;
    }

    public ConversationBuilder setIsCaller(boolean z) {
        this.isCaller = z;
        return this;
    }

    public ConversationBuilder setIsJoined(boolean z) {
        this.isJoined = z;
        return this;
    }

    public ConversationBuilder setIsLazyStart(boolean z) {
        y7b y7bVar = this.experiments.j0;
        zv8 zv8Var = z7b.k0[60];
        y7bVar.b(Boolean.valueOf(z));
        return this;
    }

    public ConversationBuilder setJoinConversationDelegate(iq8 iq8Var) {
        this.joinConversationDelegate = iq8Var;
        return this;
    }

    public ConversationBuilder setJoinLink(String str) {
        this.joinLink = str;
        return this;
    }

    public ConversationBuilder setLocale(Locale locale) {
        this.locale = locale;
        return this;
    }

    public ConversationBuilder setLog(y3e y3eVar) {
        this.log = y3eVar;
        return this;
    }

    public ConversationBuilder setLogConfiguration(z3e z3eVar) {
        this.logConfiguration = z3eVar;
        return this;
    }

    public ConversationBuilder setMediaAdaptationFeatureEnabledForGroupCall(boolean z) {
        this.isMediaAdaptationFeatureEnabledForGroupCall = z;
        return this;
    }

    public ConversationBuilder setMediaAdaptationFeatureEnabledForP2PCall(boolean z) {
        this.isMediaAdaptationFeatureEnabledForP2PCall = z;
        return this;
    }

    public ConversationBuilder setMediaConnectionSettings(MediaConnectionSettings mediaConnectionSettings) {
        this.mediaConnectionSettings = mediaConnectionSettings;
        return this;
    }

    public ConversationBuilder setMediaReceivingTimeoutMs(long j) {
        this.mediaReceivingTimeoutMs = j;
        return this;
    }

    public ConversationBuilder setMultipleDevicesEnabled(boolean z) {
        this.multipleDevicesEnabled = z;
        return this;
    }

    public ConversationBuilder setMyId(ParticipantId participantId) {
        this.f0me = ConversationParticipant.fromExternal(participantId, this.idMappingWrapper);
        return this;
    }

    public ConversationBuilder setOkApiService(OkApiService okApiService) {
        this.okApiService = okApiService;
        return this;
    }

    public ConversationBuilder setOnDemandTracksEnabled(boolean z) {
        this.isOnDemandTracksEnabled = z;
        return this;
    }

    public ConversationBuilder setOpponentId(ParticipantId participantId) {
        if (participantId != null) {
            this.initialOpponent = ConversationParticipant.fromExternal(participantId, this.idMappingWrapper);
        }
        return this;
    }

    public ConversationBuilder setP2PCallMediaAdaptationConfig(eq9 eq9Var) {
        this.ptpCallMediaAdaptationConfig = eq9Var;
        return this;
    }

    public ConversationBuilder setPayload(String str) {
        this.payload = str;
        return this;
    }

    public ConversationBuilder setRemoteSettings(RemoteSettings remoteSettings) {
        this.remoteSettings = remoteSettings;
        return this;
    }

    public ConversationBuilder setRingingTimeout(long j) {
        this.ringingTimeout = j;
        return this;
    }

    public ConversationBuilder setRotationProvider(nue nueVar) {
        this.rotationProvider = nueVar;
        return this;
    }

    public ConversationBuilder setRttRateHintConfig(RttRateHintConfig rttRateHintConfig) {
        this.rttRateHintConfig = rttRateHintConfig;
        return this;
    }

    public ConversationBuilder setSSLProvider(wxe wxeVar) {
        this.sslProvider = wxeVar;
        return this;
    }

    public ConversationBuilder setScreenCapturePermissionProvider(a4f a4fVar) {
        this.screenCapturePermissionProvider = a4fVar;
        return this;
    }

    public ConversationBuilder setStartConversationDelegate(StartConversationDelegate startConversationDelegate) {
        this.startConversationDelegate = startConversationDelegate;
        return this;
    }

    public ConversationBuilder setTimeProvider(esh eshVar) {
        this.timeProvider = eshVar;
        return this;
    }

    public ConversationBuilder setVersion(String str) {
        this.version = str;
        return this;
    }

    public ConversationBuilder setVideoTracksCount(int i) {
        this.videoTracksCount = i;
        return this;
    }

    public ConversationBuilder setWaitForAdminEnabled(boolean z) {
        this.waitForAdminEnabled = z;
        return this;
    }

    public ConversationBuilder setWatchTogetherEnabledForAll(boolean z) {
        this.isWatchTogetherEnabledForAll = z;
        return this;
    }

    public ConversationBuilder setWebRTCAudioCodecs(String[] strArr) {
        this.audioCodecs = strArr;
        return this;
    }

    public ConversationBuilder setWebRTCCodecFilteringEnabled(boolean z) {
        this.isWebRTCCodecFilteringEnabled = z;
        return this;
    }

    public ConversationBuilder setWebRTCVideoCodecs(String[] strArr) {
        this.videoCodecs = strArr;
        return this;
    }

    public ConversationBuilder showLocalVideoInOriginalQuality(boolean z) {
        this.showLocalVideoInOriginalQuality = z;
        return this;
    }
}
