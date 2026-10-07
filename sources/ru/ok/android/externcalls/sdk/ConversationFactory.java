package ru.ok.android.externcalls.sdk;

import android.content.Context;
import android.util.Log;
import defpackage.ap;
import defpackage.at7;
import defpackage.cf7;
import defpackage.cq;
import defpackage.dq;
import defpackage.dt7;
import defpackage.er3;
import defpackage.esh;
import defpackage.fsb;
import defpackage.gsh;
import defpackage.hs4;
import defpackage.i3f;
import defpackage.ih6;
import defpackage.it7;
import defpackage.jj2;
import defpackage.ks4;
import defpackage.kzi;
import defpackage.ls4;
import defpackage.mxh;
import defpackage.nxe;
import defpackage.p64;
import defpackage.qp;
import defpackage.qpc;
import defpackage.rg4;
import defpackage.rpc;
import defpackage.s63;
import defpackage.sg4;
import defpackage.ta4;
import defpackage.uxh;
import defpackage.vu8;
import defpackage.w74;
import defpackage.wl;
import defpackage.ww3;
import defpackage.x3e;
import defpackage.y3e;
import defpackage.yp;
import defpackage.yt1;
import defpackage.z18;
import defpackage.z3e;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.webrtc.NativeLibraryLoader;
import ru.ok.android.api.json.JsonParseException;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.analytics.CallAnalyticsInitializer;
import ru.ok.android.externcalls.sdk.analytics.ConversationAnalyticsSender;
import ru.ok.android.externcalls.sdk.analytics.internal.ConversationAnalyticsSenderImpl;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.OkApiService;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.api.interceptor.ExecutionTimeInterceptor;
import ru.ok.android.externcalls.sdk.api.log.LoggingApiRequestDebugger;
import ru.ok.android.externcalls.sdk.api.request.GetSystemInfo;
import ru.ok.android.externcalls.sdk.api.request.HangupConversation;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.api.session.InMemorySessionStore;
import ru.ok.android.externcalls.sdk.chat.ChatStateListener;
import ru.ok.android.externcalls.sdk.events.AnalyticsEventListener;
import ru.ok.android.externcalls.sdk.events.SharedAnalyticsEvent;
import ru.ok.android.externcalls.sdk.factory.AnswerCallParams;
import ru.ok.android.externcalls.sdk.factory.CreateConfParams;
import ru.ok.android.externcalls.sdk.factory.JoinAnonByLinkParams;
import ru.ok.android.externcalls.sdk.factory.JoinByLinkParams;
import ru.ok.android.externcalls.sdk.factory.JoinCallParams;
import ru.ok.android.externcalls.sdk.factory.StartCallParams;
import ru.ok.android.externcalls.sdk.factory.internal.RTCLogWrapper;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.log.GlobalRTCLogger;
import ru.ok.android.externcalls.sdk.settings.RemoteSettingsShared;

/* JADX INFO: loaded from: classes3.dex */
public class ConversationFactory extends ConversationFactoryParams {
    private static final String LOG_TAG = "ConversationFactory";
    public static final String SDK_VERSION = "0.2.6";
    private static final ExecutorService WEBRTC_EXECUTOR = Executors.newSingleThreadExecutor();
    private static volatile boolean initDone = false;
    private static volatile Long keepSharedSettingsStorageTimeMs = null;
    private final CallAnalyticsSender.Listener analyticsSenderListener;
    private wl animojiDataSupplier;
    private final fsb api;
    private final CallAnalyticsSender callAnalyticsSender;
    private ChatStateListener chatStateListener;
    private final String clientType;
    private final Context context;
    private final ConversationAnalyticsSenderImpl conversationAnalyticsSender;
    private final w74 disposable;
    private String domainId;
    private ExecutionTimeInterceptor executionTimeInterceptor;
    private final ih6 experimentsManager;
    private IdsMapper<yt1, ParticipantId> externalIdsMapper;
    private volatile WeakReference<AnalyticsEventListener> externalListener;
    private final IdMappingWrapper idMappingWrapper;
    private IdsMapper<ParticipantId, yt1> internalIdsMapper;
    private Locale locale;
    private z3e logConfiguration;
    private OkApiService okApiService;
    private RemoteSettings remoteSettings;
    private final Object remoteSettingsLock;
    private final esh timeProvider;
    private final mxh tracerLiteFacade;

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ConversationFactory$1 */
    public class AnonymousClass1 implements CallAnalyticsSender.Listener {
        public AnonymousClass1() {
        }

        @Override // ru.ok.android.externcalls.analytics.CallAnalyticsSender.Listener
        public void onNewEvent(CallAnalyticsEvent callAnalyticsEvent) {
            AnalyticsEventListener.AnalyticsEvent eventListenerEvent;
            WeakReference weakReference = ConversationFactory.this.externalListener;
            AnalyticsEventListener analyticsEventListener = weakReference == null ? null : (AnalyticsEventListener) weakReference.get();
            if (analyticsEventListener == null || (eventListenerEvent = SharedAnalyticsEvent.toEventListenerEvent(callAnalyticsEvent)) == null) {
                return;
            }
            analyticsEventListener.onAnalyticsEvent(eventListenerEvent);
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ConversationFactory$2 */
    public class AnonymousClass2 implements LazyConversation {
        final /* synthetic */ ConversationImpl val$conversation;
        final /* synthetic */ StartCallParams val$params;

        public AnonymousClass2(ConversationImpl conversationImpl, StartCallParams startCallParams) {
            this.val$conversation = conversationImpl;
            this.val$params = startCallParams;
        }

        public static /* synthetic */ void lambda$start$0(StartCallParams startCallParams, Conversation conversation) {
            startCallParams.getOnPrepared().invoke(conversation);
        }

        public static /* synthetic */ void lambda$start$1(StartCallParams startCallParams, Throwable th) {
            startCallParams.getOnError().invoke(th);
        }

        @Override // ru.ok.android.externcalls.sdk.LazyConversation
        public Conversation getConversation() {
            return this.val$conversation;
        }

        @Override // ru.ok.android.externcalls.sdk.LazyConversation
        public void start() {
            ConversationImpl conversationImpl = this.val$conversation;
            StartCallParams startCallParams = this.val$params;
            conversationImpl.prepare(null, new a(0, startCallParams), new a(1, startCallParams));
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ConversationFactory$3 */
    public class AnonymousClass3 implements LazyConversation {
        final /* synthetic */ ConversationImpl val$conversation;
        final /* synthetic */ JoinCallParams val$params;

        public AnonymousClass3(ConversationImpl conversationImpl, JoinCallParams joinCallParams) {
            this.val$conversation = conversationImpl;
            this.val$params = joinCallParams;
        }

        public static /* synthetic */ void lambda$start$0(JoinCallParams joinCallParams, Conversation conversation) {
            joinCallParams.getOnPrepared().invoke(conversation);
        }

        public static /* synthetic */ void lambda$start$1(JoinCallParams joinCallParams, Throwable th) {
            joinCallParams.getOnError().invoke(th);
        }

        @Override // ru.ok.android.externcalls.sdk.LazyConversation
        public Conversation getConversation() {
            return this.val$conversation;
        }

        @Override // ru.ok.android.externcalls.sdk.LazyConversation
        public void start() {
            ConversationImpl conversationImpl = this.val$conversation;
            final JoinCallParams joinCallParams = this.val$params;
            final int i = 0;
            final int i2 = 1;
            conversationImpl.prepare(null, new sg4() { // from class: ru.ok.android.externcalls.sdk.b
                @Override // defpackage.sg4
                public final void accept(Object obj) {
                    int i3 = i;
                    JoinCallParams joinCallParams2 = joinCallParams;
                    switch (i3) {
                        case 0:
                            ConversationFactory.AnonymousClass3.lambda$start$0(joinCallParams2, (Conversation) obj);
                            break;
                        default:
                            ConversationFactory.AnonymousClass3.lambda$start$1(joinCallParams2, (Throwable) obj);
                            break;
                    }
                }
            }, new sg4() { // from class: ru.ok.android.externcalls.sdk.b
                @Override // defpackage.sg4
                public final void accept(Object obj) {
                    int i3 = i2;
                    JoinCallParams joinCallParams2 = joinCallParams;
                    switch (i3) {
                        case 0:
                            ConversationFactory.AnonymousClass3.lambda$start$0(joinCallParams2, (Conversation) obj);
                            break;
                        default:
                            ConversationFactory.AnonymousClass3.lambda$start$1(joinCallParams2, (Throwable) obj);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ConversationFactory$4 */
    public class AnonymousClass4 implements LazyConversation {
        final /* synthetic */ ConversationImpl val$conversation;
        final /* synthetic */ JoinByLinkParams val$params;

        public AnonymousClass4(ConversationImpl conversationImpl, JoinByLinkParams joinByLinkParams) {
            this.val$conversation = conversationImpl;
            this.val$params = joinByLinkParams;
        }

        public static /* synthetic */ void lambda$start$0(JoinByLinkParams joinByLinkParams, Conversation conversation) {
            joinByLinkParams.getOnPrepared().invoke(conversation);
        }

        public static /* synthetic */ void lambda$start$1(JoinByLinkParams joinByLinkParams, Throwable th) {
            joinByLinkParams.getOnError().invoke(th);
        }

        @Override // ru.ok.android.externcalls.sdk.LazyConversation
        public Conversation getConversation() {
            return this.val$conversation;
        }

        @Override // ru.ok.android.externcalls.sdk.LazyConversation
        public void start() {
            ConversationImpl conversationImpl = this.val$conversation;
            final JoinByLinkParams joinByLinkParams = this.val$params;
            final int i = 0;
            final int i2 = 1;
            conversationImpl.prepareJoinByLink(new sg4() { // from class: ru.ok.android.externcalls.sdk.c
                @Override // defpackage.sg4
                public final void accept(Object obj) {
                    int i3 = i;
                    JoinByLinkParams joinByLinkParams2 = joinByLinkParams;
                    switch (i3) {
                        case 0:
                            ConversationFactory.AnonymousClass4.lambda$start$0(joinByLinkParams2, (Conversation) obj);
                            break;
                        default:
                            ConversationFactory.AnonymousClass4.lambda$start$1(joinByLinkParams2, (Throwable) obj);
                            break;
                    }
                }
            }, new sg4() { // from class: ru.ok.android.externcalls.sdk.c
                @Override // defpackage.sg4
                public final void accept(Object obj) {
                    int i3 = i2;
                    JoinByLinkParams joinByLinkParams2 = joinByLinkParams;
                    switch (i3) {
                        case 0:
                            ConversationFactory.AnonymousClass4.lambda$start$0(joinByLinkParams2, (Conversation) obj);
                            break;
                        default:
                            ConversationFactory.AnonymousClass4.lambda$start$1(joinByLinkParams2, (Throwable) obj);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ConversationFactory$5 */
    public class AnonymousClass5 implements LazyConversation {
        final /* synthetic */ ConversationImpl val$conversation;
        final /* synthetic */ JoinAnonByLinkParams val$params;

        public AnonymousClass5(ConversationImpl conversationImpl, JoinAnonByLinkParams joinAnonByLinkParams) {
            this.val$conversation = conversationImpl;
            this.val$params = joinAnonByLinkParams;
        }

        public static /* synthetic */ void lambda$start$0(JoinAnonByLinkParams joinAnonByLinkParams, Conversation conversation) {
            joinAnonByLinkParams.getOnPrepared().invoke(conversation);
        }

        public static /* synthetic */ void lambda$start$1(JoinAnonByLinkParams joinAnonByLinkParams, Throwable th) {
            joinAnonByLinkParams.getOnError().invoke(th);
        }

        @Override // ru.ok.android.externcalls.sdk.LazyConversation
        public Conversation getConversation() {
            return this.val$conversation;
        }

        @Override // ru.ok.android.externcalls.sdk.LazyConversation
        public void start() {
            ConversationImpl conversationImpl = this.val$conversation;
            final JoinAnonByLinkParams joinAnonByLinkParams = this.val$params;
            final int i = 0;
            final int i2 = 1;
            conversationImpl.prepareJoinByLink(new sg4() { // from class: ru.ok.android.externcalls.sdk.d
                @Override // defpackage.sg4
                public final void accept(Object obj) {
                    int i3 = i;
                    JoinAnonByLinkParams joinAnonByLinkParams2 = joinAnonByLinkParams;
                    switch (i3) {
                        case 0:
                            ConversationFactory.AnonymousClass5.lambda$start$0(joinAnonByLinkParams2, (Conversation) obj);
                            break;
                        default:
                            ConversationFactory.AnonymousClass5.lambda$start$1(joinAnonByLinkParams2, (Throwable) obj);
                            break;
                    }
                }
            }, new sg4() { // from class: ru.ok.android.externcalls.sdk.d
                @Override // defpackage.sg4
                public final void accept(Object obj) {
                    int i3 = i2;
                    JoinAnonByLinkParams joinAnonByLinkParams2 = joinAnonByLinkParams;
                    switch (i3) {
                        case 0:
                            ConversationFactory.AnonymousClass5.lambda$start$0(joinAnonByLinkParams2, (Conversation) obj);
                            break;
                        default:
                            ConversationFactory.AnonymousClass5.lambda$start$1(joinAnonByLinkParams2, (Throwable) obj);
                            break;
                    }
                }
            });
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ConversationFactory$6 */
    public class AnonymousClass6 implements LazyConversation {
        final /* synthetic */ ConversationImpl val$conversation;
        final /* synthetic */ CreateConfParams val$params;

        public AnonymousClass6(ConversationImpl conversationImpl, CreateConfParams createConfParams) {
            this.val$conversation = conversationImpl;
            this.val$params = createConfParams;
        }

        public static /* synthetic */ void lambda$start$0(CreateConfParams createConfParams, Conversation conversation) {
            createConfParams.getOnPrepared().invoke(conversation);
        }

        public static /* synthetic */ void lambda$start$1(CreateConfParams createConfParams, Throwable th) {
            createConfParams.getOnError().invoke(th);
        }

        @Override // ru.ok.android.externcalls.sdk.LazyConversation
        public Conversation getConversation() {
            return this.val$conversation;
        }

        @Override // ru.ok.android.externcalls.sdk.LazyConversation
        public void start() {
            ConversationImpl conversationImpl = this.val$conversation;
            final CreateConfParams createConfParams = this.val$params;
            final int i = 0;
            final int i2 = 1;
            conversationImpl.prepare(null, true, new sg4() { // from class: ru.ok.android.externcalls.sdk.e
                @Override // defpackage.sg4
                public final void accept(Object obj) {
                    int i3 = i;
                    CreateConfParams createConfParams2 = createConfParams;
                    switch (i3) {
                        case 0:
                            ConversationFactory.AnonymousClass6.lambda$start$0(createConfParams2, (Conversation) obj);
                            break;
                        default:
                            ConversationFactory.AnonymousClass6.lambda$start$1(createConfParams2, (Throwable) obj);
                            break;
                    }
                }
            }, new sg4() { // from class: ru.ok.android.externcalls.sdk.e
                @Override // defpackage.sg4
                public final void accept(Object obj) {
                    int i3 = i2;
                    CreateConfParams createConfParams2 = createConfParams;
                    switch (i3) {
                        case 0:
                            ConversationFactory.AnonymousClass6.lambda$start$0(createConfParams2, (Conversation) obj);
                            break;
                        default:
                            ConversationFactory.AnonymousClass6.lambda$start$1(createConfParams2, (Throwable) obj);
                            break;
                    }
                }
            });
        }
    }

    public ConversationFactory(fsb fsbVar, Context context, String str, String str2) {
        this.logConfiguration = CallUtil.LOG_CONFIGURATION;
        this.locale = null;
        this.animojiDataSupplier = er3.a;
        this.chatStateListener = ChatStateListener.EMPTY;
        CallAnalyticsSender callAnalyticsSender = CallAnalyticsSender.INSTANCE;
        this.callAnalyticsSender = callAnalyticsSender;
        ConversationAnalyticsSenderImpl conversationAnalyticsSenderImpl = new ConversationAnalyticsSenderImpl();
        this.conversationAnalyticsSender = conversationAnalyticsSenderImpl;
        this.analyticsSenderListener = new CallAnalyticsSender.Listener() { // from class: ru.ok.android.externcalls.sdk.ConversationFactory.1
            public AnonymousClass1() {
            }

            @Override // ru.ok.android.externcalls.analytics.CallAnalyticsSender.Listener
            public void onNewEvent(CallAnalyticsEvent callAnalyticsEvent) {
                AnalyticsEventListener.AnalyticsEvent eventListenerEvent;
                WeakReference weakReference = ConversationFactory.this.externalListener;
                AnalyticsEventListener analyticsEventListener = weakReference == null ? null : (AnalyticsEventListener) weakReference.get();
                if (analyticsEventListener == null || (eventListenerEvent = SharedAnalyticsEvent.toEventListenerEvent(callAnalyticsEvent)) == null) {
                    return;
                }
                analyticsEventListener.onAnalyticsEvent(eventListenerEvent);
            }
        };
        this.remoteSettings = null;
        this.remoteSettingsLock = new Object();
        this.clientType = str;
        this.domainId = str2;
        this.executionTimeInterceptor = new ExecutionTimeInterceptor(null, new gsh());
        z18 z18VarG = fsbVar.g();
        z18VarG.h = ww3.H1(this.executionTimeInterceptor, (List) z18VarG.h);
        fsb fsbVarA = z18VarG.a();
        this.api = fsbVarA;
        requestServerTime();
        this.context = context;
        this.disposable = new w74();
        this.timeProvider = new gsh();
        IdMappingWrapper idMappingWrapper = IdMappingWrapper.get(context, new RTCLogWrapper(new ks4(this, 0)));
        this.idMappingWrapper = idMappingWrapper;
        idMappingWrapper.scheduleReadCacheFromDisk();
        this.experimentsManager = new ih6(this.experiments);
        this.okApiService = new OkApiService(fsbVarA.f());
        this.tracerLiteFacade = new mxh(context);
        new CallAnalyticsInitializer().init(callAnalyticsSender, conversationAnalyticsSenderImpl.getConfiguration(), fsbVarA, new ks4(this, 1));
        getRemoteSettings();
    }

    private LazyConversation callInternal(cf7 cf7Var, boolean z) {
        StartCallParams startCallParams = (StartCallParams) cf7Var.invoke(new StartCallParams.Builder());
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(startCallParams.getShouldStartWithVideo()).setIsCaller(true).setPayload(startCallParams.getPayload()).setCid(startCallParams.getConversationId() != null ? startCallParams.getConversationId().toString() : generateConversationId()).setEventListener(startCallParams.getEventListener());
        startCallParams.getFrameInterceptor();
        ConversationBuilder ringingTimeout = eventListener.setFrameInterceptor(null).setWatchTogetherEnabledForAll(startCallParams.getIsWatchTogetherEnabledForAll()).setCameraCapturerFactory(startCallParams.getCameraCapturerFactory()).setMyId(startCallParams.getMyId()).setOpponentId(startCallParams.getOpponentId()).setChatId(startCallParams.getChatId()).setFieldTrials(startCallParams.getFieldTrials()).setStartConversationDelegate(this.p2pStartConversationDelegate).setWaitForAdminEnabled(startCallParams.getIsWaitingForAdminEnabled()).setIsLazyStart(z).setRingingTimeout(startCallParams.getRingingTimeout());
        if (startCallParams.getTokenProvider() != null) {
            z18 z18VarG = this.api.g();
            z18VarG.a = new SimpleConfigurationStore((ta4) z18VarG.a);
            z18VarG.b = startCallParams.getTokenProvider();
            ringingTimeout.setApi(z18VarG.a());
        }
        if (startCallParams.getTokenInfoProvider() != null) {
            z18 z18VarG2 = this.api.g();
            z18VarG2.g = lambda$callInternal$2((yp) z18VarG2.g);
            z18VarG2.f = startCallParams.getTokenInfoProvider();
            ringingTimeout.setApi(z18VarG2.a());
        }
        return new AnonymousClass2(ringingTimeout.createConversation(), startCallParams);
    }

    private LazyConversation createConfRoomInternal(cf7 cf7Var, boolean z) {
        CreateConfParams createConfParams = (CreateConfParams) cf7Var.invoke(new CreateConfParams.Builder());
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(createConfParams.getShouldStartWithVideo()).setIsCaller(true).setPayload(createConfParams.getPayload()).setChatId(createConfParams.getChatId()).setCid(createConfParams.getConversationId() != null ? createConfParams.getConversationId().toString() : generateConversationId()).setEventListener(createConfParams.getEventListener());
        createConfParams.getFrameInterceptor();
        ConversationBuilder isLazyStart = eventListener.setFrameInterceptor(null).setCameraCapturerFactory(createConfParams.getCameraCapturerFactory()).setWatchTogetherEnabledForAll(createConfParams.getIsWatchTogetherEnabledForAll()).setMyId(createConfParams.getMyId()).setFieldTrials(createConfParams.getFieldTrials()).setStartConversationDelegate(this.confroomStartConversationDelegate).setWaitForAdminEnabled(createConfParams.getIsWaitingForAdminEnabled()).setIsLazyStart(z);
        if (createConfParams.getTokenProvider() != null) {
            z18 z18VarG = this.api.g();
            z18VarG.b = createConfParams.getTokenProvider();
            z18VarG.a = new SimpleConfigurationStore((ta4) z18VarG.a);
            isLazyStart.setApi(z18VarG.a());
        }
        if (createConfParams.getTokenInfoProvider() != null) {
            z18 z18VarG2 = this.api.g();
            z18VarG2.g = lambda$createConfRoomInternal$10((yp) z18VarG2.g);
            z18VarG2.f = createConfParams.getTokenInfoProvider();
            isLazyStart.setApi(z18VarG2.a());
        }
        ConversationImpl conversationImplCreateConversation = isLazyStart.createConversation();
        conversationImplCreateConversation.initStore(createConfParams.getInitialIds());
        return new AnonymousClass6(conversationImplCreateConversation, createConfParams);
    }

    public static String generateConversationId() {
        return UUID.randomUUID().toString();
    }

    private RemoteSettings getRemoteSettings() {
        Long l = keepSharedSettingsStorageTimeMs;
        synchronized (this.remoteSettingsLock) {
            if (l != null) {
                try {
                    if (this.remoteSettings == null) {
                        this.remoteSettings = new RemoteSettingsShared(this.api.f(), this.timeProvider, new ks4(this, 2), RemoteSettings.getKeys(), l);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.remoteSettings;
    }

    public static synchronized void init(ConversationFactoryInitParams conversationFactoryInitParams) {
        try {
            if (initDone) {
                return;
            }
            keepSharedSettingsStorageTimeMs = conversationFactoryInitParams.getSharedSettingsLifeTime();
            ConversationFactoryInitParams.PeerConnection peerConnection = conversationFactoryInitParams.getPeerConnection();
            Context context = conversationFactoryInitParams.getContext();
            y3e logger = peerConnection.getLogger();
            if (context != null && logger != null) {
                try {
                    logger = new uxh(new mxh(conversationFactoryInitParams.getContext()), logger);
                } catch (Throwable th) {
                    Log.e(LOG_TAG, "Can't apply tracer to provided logger", th);
                }
            }
            qpc.D(conversationFactoryInitParams.getContext(), new kzi(new rpc(peerConnection.getUdpMarker(), peerConnection.getTcpMarker(), peerConnection.getRttMultCapMs(), peerConnection.getIsEarlyAudioPlayoutEnabled(), peerConnection.getIsEarlyAudioRecordingEnabled(), peerConnection.getIsAudioPipelineOffOnMuteEnabled(), peerConnection.getIsSimulcastEnabled(), peerConnection.getBonusFieldTrials()), logger, false), conversationFactoryInitParams.getPeerConnection().getLibraryLoader());
            initDone = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private LazyConversation joinAnonByLinkInternal(cf7 cf7Var, boolean z) {
        JoinAnonByLinkParams joinAnonByLinkParams = (JoinAnonByLinkParams) cf7Var.invoke(new JoinAnonByLinkParams.Builder());
        z18 z18VarG = this.api.g();
        if (((dq) z18VarG.f) == null || joinAnonByLinkParams.getApiEndpoint() == null) {
            z18VarG.a = new SimpleConfigurationStore((ta4) z18VarG.a);
            z18VarG.b = new hs4(1);
        } else {
            z18VarG.g = lambda$joinAnonByLinkInternal$7((yp) z18VarG.g);
            z18VarG.f = new s63(11, joinAnonByLinkParams);
        }
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(joinAnonByLinkParams.getShouldStartWithVideo()).setIsCaller(false).setIsJoined(true).setPayload(null).setEventListener(joinAnonByLinkParams.getEventListener());
        joinAnonByLinkParams.getFrameInterceptor();
        ConversationImpl conversationImplCreateConversation = eventListener.setFrameInterceptor(null).setJoinLink(joinAnonByLinkParams.getLink()).setApi(z18VarG.a()).setCameraCapturerFactory(joinAnonByLinkParams.getCameraCapturerFactory()).setMyId(joinAnonByLinkParams.getMyId()).setFieldTrials(joinAnonByLinkParams.getFieldTrials()).setAnonToken(joinAnonByLinkParams.getToken()).setJoinConversationDelegate(this.joinConversationDelegate).setIsLazyStart(z).createConversation();
        conversationImplCreateConversation.initAsConfJoin();
        return new AnonymousClass5(conversationImplCreateConversation, joinAnonByLinkParams);
    }

    private LazyConversation joinByLinkInternal(cf7 cf7Var, boolean z) {
        JoinByLinkParams joinByLinkParams = (JoinByLinkParams) cf7Var.invoke(new JoinByLinkParams.Builder());
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(joinByLinkParams.getShouldStartWithVideo()).setIsCaller(false).setIsJoined(true).setPayload(null).setEventListener(joinByLinkParams.getEventListener());
        joinByLinkParams.getFrameInterceptor();
        ConversationBuilder isLazyStart = eventListener.setFrameInterceptor(null).setJoinLink(joinByLinkParams.getLink()).setCameraCapturerFactory(joinByLinkParams.getCameraCapturerFactory()).setPayload(joinByLinkParams.getPayload()).setMyId(joinByLinkParams.getMyId()).setJoinConversationDelegate(this.joinConversationDelegate).setFieldTrials(joinByLinkParams.getFieldTrials()).setIsLazyStart(z);
        if (joinByLinkParams.getTokenProvider() != null) {
            z18 z18VarG = this.api.g();
            z18VarG.b = joinByLinkParams.getTokenProvider();
            z18VarG.a = new SimpleConfigurationStore((ta4) z18VarG.a);
            isLazyStart.setApi(z18VarG.a());
        }
        if (joinByLinkParams.getTokenInfoProvider() != null) {
            z18 z18VarG2 = this.api.g();
            z18VarG2.g = lambda$joinByLinkInternal$6((yp) z18VarG2.g);
            z18VarG2.f = joinByLinkParams.getTokenInfoProvider();
            isLazyStart.setApi(z18VarG2.a());
        }
        ConversationImpl conversationImplCreateConversation = isLazyStart.createConversation();
        conversationImplCreateConversation.initAsConfJoin();
        return new AnonymousClass4(conversationImplCreateConversation, joinByLinkParams);
    }

    private LazyConversation joinInternal(cf7 cf7Var, boolean z) {
        JoinCallParams joinCallParams = (JoinCallParams) cf7Var.invoke(new JoinCallParams.Builder());
        ConversationBuilder eventListener = getBaseBuilder().setHasVideo(joinCallParams.getShouldStartWithVideo()).setIsCaller(false).setIsJoined(true).setPayload(null).setCid(joinCallParams.getConversationId()).setEventListener(joinCallParams.getEventListener());
        joinCallParams.getFrameInterceptor();
        ConversationImpl conversationImplCreateConversation = eventListener.setFrameInterceptor(null).setChatId(joinCallParams.getChatId()).setCameraCapturerFactory(joinCallParams.getCameraCapturerFactory()).setMyId(joinCallParams.getMyId()).setFieldTrials(joinCallParams.getFieldTrials()).setIsLazyStart(z).createConversation();
        conversationImplCreateConversation.initAsConfJoin();
        return new AnonymousClass3(conversationImplCreateConversation, joinCallParams);
    }

    private static /* synthetic */ yp lambda$answer$3(yp ypVar) {
        return new InMemorySessionStore();
    }

    public static /* synthetic */ void lambda$answer$4(AnswerCallParams answerCallParams, Conversation conversation) {
        answerCallParams.getOnPrepared().invoke(conversation);
    }

    public static /* synthetic */ void lambda$answer$5(AnswerCallParams answerCallParams, Throwable th) {
        answerCallParams.getOnError().invoke(th);
    }

    private static /* synthetic */ yp lambda$callInternal$2(yp ypVar) {
        return new InMemorySessionStore();
    }

    private static /* synthetic */ yp lambda$createConfRoomInternal$10(yp ypVar) {
        return new InMemorySessionStore();
    }

    public /* synthetic */ y3e lambda$getRemoteSettings$17() {
        return this.log;
    }

    public /* synthetic */ dt7 lambda$hangup$11(String str, it7 it7Var) throws Exception {
        return this.hangupDelegate.invoke(new at7(str, it7Var, ""));
    }

    public static /* synthetic */ void lambda$hangup$12(dt7 dt7Var) throws Throwable {
    }

    public /* synthetic */ void lambda$hangup$13(Throwable th) throws Throwable {
        this.log.reportException(LOG_TAG, "ConversationFactory.hangup error", th);
    }

    public static /* synthetic */ Object lambda$hangup$14(vu8 vu8Var) throws JsonParseException, IOException {
        vu8Var.x();
        return new Object();
    }

    public static /* synthetic */ void lambda$hangup$15(Object obj) throws Throwable {
    }

    public /* synthetic */ void lambda$hangup$16(Throwable th) throws Throwable {
        this.log.reportException(LOG_TAG, "ConversationFactory.hangup error", th);
    }

    private static /* synthetic */ yp lambda$joinAnonByLinkInternal$7(yp ypVar) {
        return new InMemorySessionStore();
    }

    public static /* synthetic */ cq lambda$joinAnonByLinkInternal$8(JoinAnonByLinkParams joinAnonByLinkParams) throws IOException {
        return new cq(null, joinAnonByLinkParams.getApiEndpoint());
    }

    public static /* synthetic */ String lambda$joinAnonByLinkInternal$9() {
        return null;
    }

    private static /* synthetic */ yp lambda$joinByLinkInternal$6(yp ypVar) {
        return new InMemorySessionStore();
    }

    public /* synthetic */ y3e lambda$new$0() {
        return this.log;
    }

    public /* synthetic */ y3e lambda$new$1() {
        return this.log;
    }

    public void lambda$requestServerTime$18() {
        try {
            GetSystemInfo.Response response = (GetSystemInfo.Response) this.api.f().a(new GetSystemInfo.Request()).d();
            Long serverTime = response.getServerTime();
            if (serverTime != null) {
                esh eshVar = this.timeProvider;
                long jLongValue = serverTime.longValue();
                eshVar.getClass();
                if (eshVar instanceof gsh) {
                    ((gsh) eshVar).b(jLongValue);
                }
            }
            this.log.log(LOG_TAG, "Server time: " + response.getServerTime());
        } catch (Throwable th) {
            this.log.logException(LOG_TAG, "Can't get server time ", th);
        }
    }

    private void requestServerTime() {
        try {
            i3f.b().b(new jj2(8, this));
        } catch (Throwable th) {
            this.log.logException(LOG_TAG, "Can't schedule server time request", th);
        }
    }

    public Conversation answer(cf7 cf7Var) {
        final AnswerCallParams answerCallParams = (AnswerCallParams) cf7Var.invoke(new AnswerCallParams.Builder());
        final int i = 0;
        final int i2 = 1;
        ConversationParams conversationParamsDecode = null;
        ConversationBuilder cameraCapturerFactory = getBaseBuilder().setHasVideo(answerCallParams.getShouldStartWithVideo()).setAnswerAsContact(answerCallParams.getAnswerAsContact()).setIsCaller(false).setIsAnswer(true).setPayload(null).setCid(answerCallParams.getConversationId()).setEventListener(answerCallParams.getEventListener()).setCameraCapturerFactory(answerCallParams.getCameraCapturerFactory());
        answerCallParams.getFrameInterceptor();
        ConversationBuilder fieldTrials = cameraCapturerFactory.setFrameInterceptor(null).setMyId(answerCallParams.getMyId()).setOpponentId(answerCallParams.getOpponentId()).setFieldTrials(answerCallParams.getFieldTrials());
        if (answerCallParams.getTokenProvider() != null) {
            z18 z18VarG = this.api.g();
            z18VarG.a = new SimpleConfigurationStore((ta4) z18VarG.a);
            z18VarG.b = answerCallParams.getTokenProvider();
            fieldTrials.setApi(z18VarG.a());
        }
        if (answerCallParams.getTokenInfoProvider() != null) {
            z18 z18VarG2 = this.api.g();
            z18VarG2.g = lambda$answer$3((yp) z18VarG2.g);
            z18VarG2.f = answerCallParams.getTokenInfoProvider();
            fieldTrials.setApi(z18VarG2.a());
        }
        ConversationImpl conversationImplCreateConversation = fieldTrials.createConversation();
        try {
            this.log.log(LOG_TAG, "Try to decode provided conversation params");
            conversationParamsDecode = ConversationParams.decode(answerCallParams.getConversationParams());
        } catch (Throwable unused) {
            this.log.log(LOG_TAG, "Error while trying to decode provided conversation params");
        }
        conversationImplCreateConversation.prepare(conversationParamsDecode, new sg4() { // from class: js4
            @Override // defpackage.sg4
            public final void accept(Object obj) {
                int i3 = i;
                AnswerCallParams answerCallParams2 = answerCallParams;
                switch (i3) {
                    case 0:
                        ConversationFactory.lambda$answer$4(answerCallParams2, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$answer$5(answerCallParams2, (Throwable) obj);
                        break;
                }
            }
        }, new sg4() { // from class: js4
            @Override // defpackage.sg4
            public final void accept(Object obj) {
                int i3 = i2;
                AnswerCallParams answerCallParams2 = answerCallParams;
                switch (i3) {
                    case 0:
                        ConversationFactory.lambda$answer$4(answerCallParams2, (Conversation) obj);
                        break;
                    default:
                        ConversationFactory.lambda$answer$5(answerCallParams2, (Throwable) obj);
                        break;
                }
            }
        });
        return conversationImplCreateConversation;
    }

    public Conversation call(cf7 cf7Var) {
        LazyConversation lazyConversationCallInternal = callInternal(cf7Var, false);
        lazyConversationCallInternal.start();
        return lazyConversationCallInternal.getConversation();
    }

    public LazyConversation callLazy(cf7 cf7Var) {
        return callInternal(cf7Var, true);
    }

    public void clearApiAuthSession() {
        this.api.e().l();
    }

    public Conversation createConfRoom(cf7 cf7Var) {
        LazyConversation lazyConversationCreateConfRoomInternal = createConfRoomInternal(cf7Var, false);
        lazyConversationCreateConfRoomInternal.start();
        return lazyConversationCreateConfRoomInternal.getConversation();
    }

    public LazyConversation createConfRoomLazy(cf7 cf7Var) {
        return createConfRoomInternal(cf7Var, true);
    }

    public ConversationAnalyticsSender getAnalyticsSender() {
        return this.conversationAnalyticsSender;
    }

    public wl getAnimojiDataSupplier() {
        return this.animojiDataSupplier;
    }

    public ConversationBuilder getBaseBuilder() {
        y3e y3eVar = this.log;
        if (!(y3eVar instanceof uxh)) {
            setLogger(new uxh(this.tracerLiteFacade, y3eVar));
        }
        return super.getBaseBuilder(this.idMappingWrapper).setCreator(this).setContext(this.context).setApi(this.api).setTimeProvider(this.timeProvider).setExecutionTimeInterceptor(this.executionTimeInterceptor).setExecutorService(WEBRTC_EXECUTOR).setLog(this.log).setLogConfiguration(this.logConfiguration).setClientType(this.clientType).setDomainId(this.domainId).setAnimojiDataSupplier(this.animojiDataSupplier).setLocale(this.locale).setInternalIdsMapper(this.internalIdsMapper).setExternalIdsMapper(this.externalIdsMapper).setChatStateListener(this.chatStateListener).setOkApiService(this.okApiService).setAnalyticsSender(this.callAnalyticsSender).setRemoteSettings(getRemoteSettings());
    }

    public ih6 getExperiments() {
        return this.experimentsManager;
    }

    public void hangup(it7 it7Var, String str, String str2) {
        final int i = 0;
        if (this.hangupDelegate != null) {
            final int i2 = 1;
            this.disposable.a(new p64(4, new ls4(this, str, it7Var, 0)).j(i3f.b()).g(new hs4(2), new rg4(this) { // from class: is4
                public final /* synthetic */ ConversationFactory b;

                {
                    this.b = this;
                }

                @Override // defpackage.rg4, defpackage.tg4
                public final void accept(Object obj) throws Throwable {
                    int i3 = i2;
                    ConversationFactory conversationFactory = this.b;
                    Throwable th = (Throwable) obj;
                    switch (i3) {
                        case 0:
                            conversationFactory.lambda$hangup$16(th);
                            break;
                        default:
                            conversationFactory.lambda$hangup$13(th);
                            break;
                    }
                }
            }));
        } else {
            nxe nxeVarF = this.api.f();
            HangupConversation.Request request = new HangupConversation.Request(str, it7Var, str2);
            hs4 hs4Var = new hs4(3);
            nxeVarF.getClass();
            this.disposable.a(RetryKt.retryApiCallForBackgroundWork(nxeVarF.a(new ap(request, hs4Var)), this.log).g(new hs4(0), new rg4(this) { // from class: is4
                public final /* synthetic */ ConversationFactory b;

                {
                    this.b = this;
                }

                @Override // defpackage.rg4, defpackage.tg4
                public final void accept(Object obj) throws Throwable {
                    int i3 = i;
                    ConversationFactory conversationFactory = this.b;
                    Throwable th = (Throwable) obj;
                    switch (i3) {
                        case 0:
                            conversationFactory.lambda$hangup$16(th);
                            break;
                        default:
                            conversationFactory.lambda$hangup$13(th);
                            break;
                    }
                }
            }));
        }
    }

    public Conversation join(cf7 cf7Var) {
        LazyConversation lazyConversationJoinInternal = joinInternal(cf7Var, false);
        lazyConversationJoinInternal.start();
        return lazyConversationJoinInternal.getConversation();
    }

    public Conversation joinAnonByLink(cf7 cf7Var) {
        LazyConversation lazyConversationJoinAnonByLinkInternal = joinAnonByLinkInternal(cf7Var, false);
        lazyConversationJoinAnonByLinkInternal.start();
        return lazyConversationJoinAnonByLinkInternal.getConversation();
    }

    public LazyConversation joinAnonByLinkLazy(cf7 cf7Var) {
        return joinAnonByLinkInternal(cf7Var, true);
    }

    public Conversation joinByLink(cf7 cf7Var) {
        LazyConversation lazyConversationJoinByLinkInternal = joinByLinkInternal(cf7Var, false);
        lazyConversationJoinByLinkInternal.start();
        return lazyConversationJoinByLinkInternal.getConversation();
    }

    public LazyConversation joinByLinkLazy(cf7 cf7Var) {
        return joinByLinkInternal(cf7Var, true);
    }

    public LazyConversation joinLazy(cf7 cf7Var) {
        return joinInternal(cf7Var, true);
    }

    public void reset() {
        this.disposable.d();
        this.api.e().l();
        this.idMappingWrapper.clear();
    }

    public void setAnalyticsEventListener(AnalyticsEventListener analyticsEventListener) {
        CallAnalyticsSender.Listener listener;
        if (analyticsEventListener == null) {
            listener = null;
            this.externalListener = null;
        } else {
            CallAnalyticsSender.Listener listener2 = this.analyticsSenderListener;
            this.externalListener = new WeakReference<>(analyticsEventListener);
            listener = listener2;
        }
        this.callAnalyticsSender.setEventListener(listener);
    }

    public void setAnimojiDataSupplier(wl wlVar) {
        this.animojiDataSupplier = wlVar;
    }

    public void setChatStateListener(ChatStateListener chatStateListener) {
        this.chatStateListener = chatStateListener;
    }

    public void setDomainId(String str) {
        this.domainId = str;
    }

    public void setExternalIdsMapper(IdsMapper<yt1, ParticipantId> idsMapper) {
        this.externalIdsMapper = idsMapper;
    }

    public void setInternalIdsMapper(IdsMapper<ParticipantId, yt1> idsMapper) {
        this.internalIdsMapper = idsMapper;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public void setLogConfiguration(z3e z3eVar) {
        this.logConfiguration = z3eVar;
    }

    public void setLogger(y3e y3eVar) {
        fsb fsbVar = this.api;
        if (y3eVar == null) {
            fsbVar.e().a(qp.a);
            y3eVar = x3e.a;
        } else {
            fsbVar.e().a(new LoggingApiRequestDebugger(y3eVar, (yp) this.api.g().g));
        }
        uxh uxhVar = new uxh(this.tracerLiteFacade, y3eVar);
        this.log = uxhVar;
        GlobalRTCLogger.setLog(uxhVar);
    }

    public void setOkApiService(OkApiService okApiService) {
        this.okApiService = okApiService;
    }

    public void hangup(it7 it7Var, String str) {
        hangup(it7Var, str, null);
    }

    public static synchronized void init(Context context, NativeLibraryLoader nativeLibraryLoader) {
        init(new ConversationFactoryInitParams.Builder(context).setPeerConnection(new ConversationFactoryInitParams.PeerConnection.Builder().setNativeLibraryLoader(nativeLibraryLoader).build()).build());
    }

    public static synchronized void init(Context context) {
        init(new ConversationFactoryInitParams.Builder(context).build());
    }

    public ConversationFactory(fsb fsbVar, Context context, String str) {
        this(fsbVar, context, str, null);
    }
}
