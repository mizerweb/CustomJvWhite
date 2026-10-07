package ru.ok.android.externcalls.sdk;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import defpackage.a4f;
import defpackage.a5f;
import defpackage.a91;
import defpackage.ae7;
import defpackage.af7;
import defpackage.ah6;
import defpackage.ak8;
import defpackage.au1;
import defpackage.b2b;
import defpackage.b6g;
import defpackage.b72;
import defpackage.bh6;
import defpackage.bj1;
import defpackage.bnc;
import defpackage.br1;
import defpackage.brb;
import defpackage.bu1;
import defpackage.c0a;
import defpackage.c7k;
import defpackage.cf7;
import defpackage.ch;
import defpackage.ch6;
import defpackage.cnf;
import defpackage.co0;
import defpackage.cqk;
import defpackage.cw5;
import defpackage.cw6;
import defpackage.d2b;
import defpackage.dh6;
import defpackage.dlc;
import defpackage.dnf;
import defpackage.dp9;
import defpackage.ds1;
import defpackage.du1;
import defpackage.due;
import defpackage.dv6;
import defpackage.e2b;
import defpackage.eb0;
import defpackage.efd;
import defpackage.eoc;
import defpackage.ep9;
import defpackage.er3;
import defpackage.esh;
import defpackage.ew6;
import defpackage.ex8;
import defpackage.f13;
import defpackage.ffd;
import defpackage.fik;
import defpackage.fp9;
import defpackage.fqb;
import defpackage.ft0;
import defpackage.ft7;
import defpackage.fw6;
import defpackage.fwg;
import defpackage.fwh;
import defpackage.gg7;
import defpackage.gh2;
import defpackage.gj2;
import defpackage.gpb;
import defpackage.gsh;
import defpackage.gt7;
import defpackage.gw1;
import defpackage.gwh;
import defpackage.h0a;
import defpackage.h32;
import defpackage.h4i;
import defpackage.h64;
import defpackage.h9b;
import defpackage.hh2;
import defpackage.hh6;
import defpackage.hi1;
import defpackage.hs4;
import defpackage.ht7;
import defpackage.i0;
import defpackage.i1m;
import defpackage.i3f;
import defpackage.i4i;
import defpackage.i9b;
import defpackage.ifh;
import defpackage.ih;
import defpackage.ik8;
import defpackage.il6;
import defpackage.ip9;
import defpackage.iq8;
import defpackage.it7;
import defpackage.iwl;
import defpackage.j22;
import defpackage.j42;
import defpackage.j4g;
import defpackage.j4i;
import defpackage.j66;
import defpackage.jdb;
import defpackage.jl6;
import defpackage.jqb;
import defpackage.k4g;
import defpackage.k5g;
import defpackage.k9;
import defpackage.k91;
import defpackage.kd2;
import defpackage.km;
import defpackage.ko5;
import defpackage.kql;
import defpackage.krb;
import defpackage.ky7;
import defpackage.l4g;
import defpackage.l64;
import defpackage.l6m;
import defpackage.l91;
import defpackage.lb9;
import defpackage.ldf;
import defpackage.ll;
import defpackage.lml;
import defpackage.lp9;
import defpackage.m4g;
import defpackage.m91;
import defpackage.m96;
import defpackage.mg1;
import defpackage.mkc;
import defpackage.my7;
import defpackage.n0a;
import defpackage.n38;
import defpackage.n4g;
import defpackage.n91;
import defpackage.n96;
import defpackage.nl;
import defpackage.nl9;
import defpackage.nq8;
import defpackage.nqb;
import defpackage.nr1;
import defpackage.nue;
import defpackage.ny7;
import defpackage.o02;
import defpackage.o0a;
import defpackage.o38;
import defpackage.o72;
import defpackage.o91;
import defpackage.og7;
import defpackage.oh1;
import defpackage.oo5;
import defpackage.opb;
import defpackage.oq8;
import defpackage.or1;
import defpackage.ore;
import defpackage.ot4;
import defpackage.ou7;
import defpackage.oy7;
import defpackage.p4g;
import defpackage.p5a;
import defpackage.p64;
import defpackage.p81;
import defpackage.p8b;
import defpackage.pde;
import defpackage.pe3;
import defpackage.pg5;
import defpackage.pkg;
import defpackage.pl6;
import defpackage.pr1;
import defpackage.ps4;
import defpackage.pu6;
import defpackage.px;
import defpackage.px8;
import defpackage.q1g;
import defpackage.q4g;
import defpackage.q8g;
import defpackage.qpc;
import defpackage.qr7;
import defpackage.qs1;
import defpackage.qs4;
import defpackage.qu1;
import defpackage.qx;
import defpackage.qy7;
import defpackage.qyd;
import defpackage.r5g;
import defpackage.r5h;
import defpackage.rg4;
import defpackage.ri1;
import defpackage.rs4;
import defpackage.ru1;
import defpackage.rzf;
import defpackage.s38;
import defpackage.s63;
import defpackage.sb9;
import defpackage.sbi;
import defpackage.sg4;
import defpackage.si1;
import defpackage.skg;
import defpackage.sqb;
import defpackage.sr;
import defpackage.ss4;
import defpackage.sw;
import defpackage.szf;
import defpackage.t32;
import defpackage.th;
import defpackage.tre;
import defpackage.tt1;
import defpackage.ubj;
import defpackage.ug5;
import defpackage.ukg;
import defpackage.us4;
import defpackage.ut1;
import defpackage.uxh;
import defpackage.uza;
import defpackage.v7g;
import defpackage.v88;
import defpackage.vj7;
import defpackage.vm9;
import defpackage.vmc;
import defpackage.vn7;
import defpackage.vog;
import defpackage.vqb;
import defpackage.vx8;
import defpackage.vy0;
import defpackage.w74;
import defpackage.wi1;
import defpackage.wl;
import defpackage.woc;
import defpackage.wpc;
import defpackage.wt1;
import defpackage.wwf;
import defpackage.wxe;
import defpackage.wy0;
import defpackage.wzf;
import defpackage.xbb;
import defpackage.xc2;
import defpackage.xdd;
import defpackage.xde;
import defpackage.xj9;
import defpackage.xmf;
import defpackage.xoc;
import defpackage.xp9;
import defpackage.xq1;
import defpackage.xqb;
import defpackage.xr8;
import defpackage.xt1;
import defpackage.xy0;
import defpackage.xzf;
import defpackage.y3e;
import defpackage.y4e;
import defpackage.y7b;
import defpackage.yde;
import defpackage.ye1;
import defpackage.yfj;
import defpackage.yhf;
import defpackage.yo6;
import defpackage.yt1;
import defpackage.yvi;
import defpackage.yy0;
import defpackage.yzf;
import defpackage.z2f;
import defpackage.z3e;
import defpackage.z6g;
import defpackage.z7b;
import defpackage.zfh;
import defpackage.zi1;
import defpackage.zj8;
import defpackage.zki;
import defpackage.zn0;
import defpackage.zo5;
import defpackage.zo7;
import defpackage.zq1;
import defpackage.zv8;
import defpackage.zve;
import defpackage.zvh;
import defpackage.zy0;
import defpackage.zzf;
import java.io.File;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import one.video.calls.sdk.conversation.hold.HoldException;
import one.video.calls.sdk.error.ServiceUnavailableException;
import one.video.calls.sdk.internal.join.FastJoinException;
import one.video.calls.sdk.net.signaling.WSSignaling;
import one.video.calls.sdk.net.signaling.WTSignaling;
import one.video.calls.sdk.rest.api.error.ApiErrorParticipantLimitExceeded;
import one.video.calls.sdk.rest.api.error.ApiErrorTooManyUsers;
import one.video.calls.sdk.rest.api.error.ApiErrorUserBanned;
import one.video.calls.sdk.rest.api.error.ApiErrorUserBlocked;
import one.video.calls.sdk.rest.api.error.ApiErrorUserPrivate;
import one.video.calls.sdk.rest.api.error.ApiInvocationError;
import org.apache.http.conn.params.ConnManagerParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CandidatePairChangeEvent;
import org.webrtc.EglBase;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.externcalls.analytics.CallAnalyticsSender;
import ru.ok.android.externcalls.sdk.api.CallApiServiceImpl;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.android.externcalls.sdk.api.ChatHistoryEntry;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.ExternApiException;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.api.RemoteSettings;
import ru.ok.android.externcalls.sdk.api.extern.ExternErrorParser;
import ru.ok.android.externcalls.sdk.api.interceptor.ExecutionTimeInterceptor;
import ru.ok.android.externcalls.sdk.api.request.GetOkIdByExternalId;
import ru.ok.android.externcalls.sdk.api.request.JoinConversation;
import ru.ok.android.externcalls.sdk.asr.AsrManager;
import ru.ok.android.externcalls.sdk.asr.internal.AsrManagerImpl;
import ru.ok.android.externcalls.sdk.asr.internal.commands.AsrCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManager;
import ru.ok.android.externcalls.sdk.asr.internal.listeners.AsrListenerManagerImpl;
import ru.ok.android.externcalls.sdk.asr_online.AsrOnlineManager;
import ru.ok.android.externcalls.sdk.asr_online.internal.AsrOnlineManagerImpl;
import ru.ok.android.externcalls.sdk.asr_online.internal.commands.AsrOnlineCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.asr_online.internal.listeners.AsrOnlineListenerManagerImpl;
import ru.ok.android.externcalls.sdk.audio.MicrophoneManager;
import ru.ok.android.externcalls.sdk.audio.NoiseSuppressionManager;
import ru.ok.android.externcalls.sdk.audio.internal.MicrophoneManagerImpl;
import ru.ok.android.externcalls.sdk.audio.internal.NoiseSuppressionManagerImpl;
import ru.ok.android.externcalls.sdk.capabilities.ClientCapabilities;
import ru.ok.android.externcalls.sdk.chat.ChatManager;
import ru.ok.android.externcalls.sdk.chat.ChatStateListener;
import ru.ok.android.externcalls.sdk.chat.internal.ChatManagerImpl;
import ru.ok.android.externcalls.sdk.chat.internal.command.ChatCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.chat.internal.listener.ChatListenerManagerImpl;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionManager;
import ru.ok.android.externcalls.sdk.connection.internal.MediaConnectionManagerImpl;
import ru.ok.android.externcalls.sdk.contacts.ContactCallManager;
import ru.ok.android.externcalls.sdk.contacts.internal.ContactCallManagerImpl;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.conversation.internal.FastStartException;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.Action;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionParams;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ActionResult;
import ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart;
import ru.ok.android.externcalls.sdk.dev.DebugManager;
import ru.ok.android.externcalls.sdk.dev.internal.DebugManagerImpl;
import ru.ok.android.externcalls.sdk.di.ApiModule;
import ru.ok.android.externcalls.sdk.di.ApiModuleImpl;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.events.HangupHint;
import ru.ok.android.externcalls.sdk.events.MultiEventListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndReason;
import ru.ok.android.externcalls.sdk.exception.CallTerminatingException;
import ru.ok.android.externcalls.sdk.exception.Domain;
import ru.ok.android.externcalls.sdk.exception.SubDomain;
import ru.ok.android.externcalls.sdk.factory.internal.CidLogger;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManagerImpl;
import ru.ok.android.externcalls.sdk.feature.internal.commands.ConversationFeatureCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.feature.internal.listener.ConversationFeatureListenersImpl;
import ru.ok.android.externcalls.sdk.feedback.FeedbackManager;
import ru.ok.android.externcalls.sdk.feedback.internal.FeedbackManagerImpl;
import ru.ok.android.externcalls.sdk.feedback.internal.commands.FeedbackCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManager;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;
import ru.ok.android.externcalls.sdk.id.CallExternalIdConverter;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.mapping.ExternalToInternalIdsMapper;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.id.mapping.InternalToExternalIdsMapper;
import ru.ok.android.externcalls.sdk.id.mapping.MappingContext;
import ru.ok.android.externcalls.sdk.id.peer.PeerIdGenerator;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.media.mute.internal.MediaMuteManagerImpl;
import ru.ok.android.externcalls.sdk.media.mute.internal.command.MediaMuteCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManager;
import ru.ok.android.externcalls.sdk.media.mute.internal.listener.MediaMuteListenerManagerImpl;
import ru.ok.android.externcalls.sdk.ml.MLFeaturesManager;
import ru.ok.android.externcalls.sdk.ml.MLFeaturesManagerImpl;
import ru.ok.android.externcalls.sdk.ml.delegate.NSFeatureDelegate;
import ru.ok.android.externcalls.sdk.ml.model.AvailableMLFeatureInfo;
import ru.ok.android.externcalls.sdk.net.DownloadService;
import ru.ok.android.externcalls.sdk.net.NetworkConnectionManager;
import ru.ok.android.externcalls.sdk.net.internal.NetworkConnectionManagerImpl;
import ru.ok.android.externcalls.sdk.net.internal.monitor.StatMonitor;
import ru.ok.android.externcalls.sdk.net.internal.monitor.StatMonitorImpl;
import ru.ok.android.externcalls.sdk.p2prelay.P2PRelaySwitchConfigProviderImpl;
import ru.ok.android.externcalls.sdk.p2prelay.P2pRelaySwitchTrigger;
import ru.ok.android.externcalls.sdk.participant.AddParticipantsCommands;
import ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStateChanger;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;
import ru.ok.android.externcalls.sdk.rate.RateCallData;
import ru.ok.android.externcalls.sdk.rate.RateManager;
import ru.ok.android.externcalls.sdk.rate.internal.RateManagerConfigProviderImpl;
import ru.ok.android.externcalls.sdk.rate.internal.RateManagerImpl;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.record.internal.RecordManagerImpl;
import ru.ok.android.externcalls.sdk.renderer.ConversationRenderers;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.sessionroom.internal.SessionRoomsManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomAdminCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.command.SessionRoomCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantStatesHandler;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;
import ru.ok.android.externcalls.sdk.settings.RemoteSettingsImplV2;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingTransportBuilder;
import ru.ok.android.externcalls.sdk.stat.ConversationStats;
import ru.ok.android.externcalls.sdk.stat.api.ApiStats;
import ru.ok.android.externcalls.sdk.stat.audio.AudioErrorStat;
import ru.ok.android.externcalls.sdk.stat.supportedcodecs.SupportedCodecsStatistics;
import ru.ok.android.externcalls.sdk.stat.topology.ServerTopologyRequestedStat;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.listener.StereoRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.UrlSharingManager;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.UrlSharingManagerImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.commands.UrlSharingCommandsExecutorImpl;
import ru.ok.android.externcalls.sdk.urlsharing.external.internal.listener.UrlSharingListenerManagerImpl;
import ru.ok.android.externcalls.sdk.util.CallsThreadUtilsKt;
import ru.ok.android.externcalls.sdk.util.ConversationListenerProxy;
import ru.ok.android.externcalls.sdk.video.CameraManager;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;
import ru.ok.android.externcalls.sdk.video.ScreenCaptureManager;
import ru.ok.android.externcalls.sdk.video.VideoRenderManager;
import ru.ok.android.externcalls.sdk.video.internal.CameraManagerImpl;
import ru.ok.android.externcalls.sdk.video.internal.DisplayLayoutSenderImpl;
import ru.ok.android.externcalls.sdk.video.internal.ScreenCaptureManagerImpl;
import ru.ok.android.externcalls.sdk.video.internal.VideoRenderManagerImpl;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;
import ru.ok.android.externcalls.sdk.watch_together.WatchTogetherPlayer;
import ru.ok.android.externcalls.sdk.watch_together.internal.WatchTogetherPlayerImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.commands.WatchTogetherCommandExecutorImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManager;
import ru.ok.android.externcalls.sdk.watch_together.internal.listener.WatchTogetherListenerManagerImpl;
import ru.ok.android.externcalls.sdk.watch_together.internal.sessionroom.SessionRoomWatchTogetherHandler;
import ru.ok.android.webrtc.SignalingErrors$CallIsUnfeasibleError;

/* JADX INFO: loaded from: classes3.dex */
class ConversationImpl implements Conversation {
    private static final float AUDIO_LEVEL_CLAMP_MAX = 10000.0f;
    private static final float AUDIO_LEVEL_MIN = 1000.0f;
    private static final String LOG_TAG = "Conversation";
    private final AddParticipantsCommands addParticipantsCommands;
    private final wl animojiDataSupplier;
    private String anonToken;
    private final ApiModule apiModule;
    private final OkApiServiceInternal apiService;
    private final AsrListenerManagerImpl asrListenerManager;
    private final AsrManager asrManager;
    private final AsrOnlineManagerImpl asrOnlineManager;
    private final yzf audioEventsListener;
    private final int audioLevelFrequencyMs;
    private final AudioSampleEnergyCalculator audioSampleEnergyCalculator;
    private boolean audioSampleEnergyCalculatorRegistered;
    private final o91 call;
    private final zi1 callFinishHandler;
    private CallInfo callInfo;
    private final xt1 callParams;
    private final Runnable callParticipantResolutionRunnable;
    private final CameraManager cameraManager;
    private final ChatListenerManagerImpl chatListenerManager;
    private final ChatManagerImpl chatManager;
    private final ChatStateListener chatStateListener;
    private final ps4 cidProvider;
    private final ClientCapabilities clientCapabilities;
    private final ContactCallManagerImpl contactCallManager;
    private final ConversationFeatureListenersImpl conversationFeatureListeners;
    private final ConversationFeatureManagerImpl conversationFeatureManager;
    private ConversationParams conversationParams;
    private final ConversationStart conversationStart;
    private final ConversationStats conversationStats;
    private final ConversationFactory creator;
    private final DebugManager debugManager;
    private final DisplayLayoutSender displayLayoutSender;
    private final w74 disposable;
    private final MultiEventListener eventListener;
    private final ExecutionTimeInterceptor executionTimeInterceptor;
    private final ExecutorService executorService;
    private boolean expectedChat;
    private final hh6 experiments;
    private final ExternalIdsResolver externalIdsResolver;
    private final FeedbackListenerManagerImpl feedbackListenerManager;
    private final FeedbackManager feedbackManager;
    private boolean forceRelayPolicy;
    private final IdMappingWrapper idMappingWrapper;
    private volatile boolean inited;
    private final String initialJoinLink;
    private ConversationParticipant initialOpponent;
    private final zj8 internalHoldStateListener;
    private final IdsMapper<ParticipantId, yt1> internalIdsMapper;
    private final InternalIdsResolver internalIdsResolver;
    private final ik8 internalParamsProvider;
    private final boolean isAnswer;
    private final boolean isCaller;
    private boolean isConcurrent;
    private boolean isConcurrentByApi;
    private final AtomicBoolean isHoldStateProcessingActive;
    private final boolean isJoined;
    private final iq8 joinConversationDelegate;
    private final ListenerImpl listener;
    private final ConversationListenerProxy<ListenerImpl> listenerProxy;
    private final LocalIdMappings localIdMappings;
    private final Locale locale;
    private final y3e log;
    private final z3e logConfiguration;
    private final Handler mainThreadHandler;

    /* JADX INFO: renamed from: me */
    private final ConversationParticipant f1me;
    private final MediaConnectionManagerImpl mediaConnectionManager;
    private final MediaMuteListenerManagerImpl mediaMuteListenerManager;
    private final MediaMuteManagerImpl mediaMuteManager;
    private final MicrophoneManager microphoneManager;
    private final xj9 mlFeaturesInfoDataSource;
    private final MLFeaturesManager mlFeaturesManager;
    private final NetworkConnectionManager networkConnectionManager;
    private final NoiseSuppressionManager noiseSuppressionManager;
    private P2pRelaySwitchTrigger p2pRelaySwitchTrigger;
    private final ParticipantStatesManagerImpl participantStatesManager;
    private final ParticipantsUpdater participantsUpdater;
    private xoc pcapLabelProvider;
    private final PeerIdGenerator peerIdGenerator;
    private final xdd preferencesHelper;
    private volatile boolean prepared;
    private final RateManagerImpl rateManager;
    private final RecordManagerImpl recordManager;
    private final RemoteSettings remoteSettings;
    private final ScreenCaptureManager screenCaptureManager;
    private final SessionRoomsManagerImpl sessionRoomManager;
    private final SessionRoomParticipantStatesHandler sessionRoomParticipantStatesHandler;
    private final SessionRoomWatchTogetherHandler sessionRoomWatchTogetherHandler;
    private p4g signalingTransport;
    private final wxe sslProvider;
    private final StartCallApiParams startCallApiParams;
    private final StatMonitor statMonitor;
    private final AtomicReference<Conversation.State> state;
    private final Object stateTransitionLock = new Object();
    private final StereoRoomManagerImpl stereoRoomManager;
    private final ParticipantStore store;
    private final esh timeProvider;
    private final t32 timings;
    private final fwh topologyUpgradeStatEventListener;
    private final UrlSharingListenerManagerImpl urlSharingListenerManager;
    private final UrlSharingManagerImpl urlSharingManager;
    private final String version;
    private final VideoRenderManager videoRenderManager;
    private final pg5 videoRendererProvider;
    private final WaitingRoomParticipants waitingRoomParticipants;
    private volatile boolean wantsApiHangup;
    private volatile boolean wasHungUp;
    private final WatchTogetherListenerManagerImpl watchTogetherListenerManager;
    private final WatchTogetherPlayer watchTogetherPlayer;

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ConversationImpl$1 */
    public class AnonymousClass1 extends AudioSampleEnergyCalculator {
        public AnonymousClass1(Handler handler) {
            super(handler);
        }

        public void lambda$onSample$0() {
            if (ConversationImpl.this.listener.listener == null || ConversationImpl.this.call.n0.w().equals(zvh.c)) {
                return;
            }
            ConversationImpl.this.updateTalkingParticipants();
        }

        @Override // ru.ok.android.externcalls.sdk.AudioSampleEnergyCalculator, defpackage.vxa
        public void onSample(int i, int i2, int i3, dlc dlcVar) {
            super.onSample(i, i2, i3, dlcVar);
            ConversationImpl.this.mainThreadHandler.post(new u(3, this));
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ConversationImpl$2 */
    public class AnonymousClass2 implements ParticipantsUpdater.MappingUpdater {
        public AnonymousClass2() {
        }

        @Override // ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater.MappingUpdater
        public void reportIfApplicable() {
            ConversationImpl.this.reportIfApplicable();
        }

        @Override // ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater.MappingUpdater
        public void triggerMapUpdate() {
            ConversationImpl.this.mainThreadHandler.removeCallbacks(ConversationImpl.this.callParticipantResolutionRunnable);
            ConversationImpl.this.mainThreadHandler.post(ConversationImpl.this.callParticipantResolutionRunnable);
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ConversationImpl$3 */
    public class AnonymousClass3 implements WaitingRoomParticipants.Listener {
        final /* synthetic */ ListenerImpl val$listener;

        public AnonymousClass3() {
            listenerImpl = listenerImpl;
        }

        @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
        public void onMeInWaitingRoomChanged(boolean z) {
            listenerImpl.onMeInWaitingRoomChanged(z);
        }

        @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
        public void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
            listenerImpl.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ConversationImpl$4 */
    public class AnonymousClass4 implements n91 {
        public AnonymousClass4() {
        }

        @Override // defpackage.n91
        public void onIceCandidateAddFailed(n38 n38Var) {
            ConversationImpl.this.conversationStats.uceCandidateAddFailedStat.report(n38Var);
        }

        @Override // defpackage.n91
        public void onIceCandidateGatheringFailed(o38 o38Var) {
            ConversationImpl.this.conversationStats.iceCandidateGatheringFailedStat.report(o38Var);
        }

        @Override // defpackage.n91
        public void onIceRestart() {
            ConversationImpl.this.conversationStats.iceRestartStat.onIceRestart();
        }

        @Override // defpackage.n91
        public void onLocalCandidateCreated(String str) {
            ConversationImpl.this.conversationStats.webrtcStats.onIceCandidateGenerated(str);
        }

        @Override // defpackage.n91
        public void onLocalSdpCreated(SessionDescription.Type type) {
            if (type == SessionDescription.Type.OFFER) {
                ConversationImpl.this.conversationStats.webrtcStats.onOfferGenerated();
            } else if (type == SessionDescription.Type.ANSWER || type == SessionDescription.Type.PRANSWER) {
                ConversationImpl.this.conversationStats.webrtcStats.onAnswerGenerated();
            }
        }

        @Override // defpackage.n91
        public void onNegotiationError(xbb xbbVar) {
            ConversationImpl.this.conversationStats.negotiationErrorStat.onError(xbbVar);
        }

        @Override // defpackage.n91
        public void onPeerConnectionIceGatheringStateChanged(PeerConnection.IceGatheringState iceGatheringState) {
            ConversationImpl.this.conversationStats.webrtcStats.onGatheringStateChanged(iceGatheringState);
        }

        @Override // defpackage.n91
        public void onPeerConnectionSignalingStateChanged(PeerConnection.SignalingState signalingState) {
            ConversationImpl.this.conversationStats.webrtcStats.onSignalingStateChanged(signalingState);
        }

        @Override // defpackage.n91
        public void onPeerConnectionStateChanged(PeerConnection.PeerConnectionState peerConnectionState, j42 j42Var) {
            ConversationImpl.this.conversationStats.peerConnectionStateChangedStat.onStateChanged(peerConnectionState, j42Var);
        }

        @Override // defpackage.n91
        public void onRemoteCandidateReceived(String str) {
            ConversationImpl.this.conversationStats.webrtcStats.onIceCandidateReceived(str);
        }

        @Override // defpackage.n91
        public void onRemoteSdpReceived(SessionDescription.Type type) {
            if (type == SessionDescription.Type.OFFER) {
                ConversationImpl.this.conversationStats.webrtcStats.onOfferReceived();
            } else if (type == SessionDescription.Type.ANSWER || type == SessionDescription.Type.PRANSWER) {
                ConversationImpl.this.conversationStats.webrtcStats.onAnswerReceived();
            }
        }

        @Override // defpackage.n91
        public void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
            ConversationImpl.this.conversationStats.iceCandidatePairChangedStat.onSelectedCandidatePairChanged(candidatePairChangeEvent);
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ConversationImpl$5 */
    public class AnonymousClass5 implements IdMappingResolver {
        public AnonymousClass5() {
        }

        @Override // ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver
        public void resolveExternalsByInternalsIds(List<yt1> list, Runnable runnable, Runnable runnable2) {
            ConversationImpl.this.resolveExternalsByInternalsIds(list, runnable, runnable2);
        }

        @Override // ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver
        public void withInternalId(ParticipantId participantId, sg4 sg4Var, Runnable runnable) {
            ConversationImpl.this.withInternalId(participantId, sg4Var, runnable);
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.ConversationImpl$6 */
    public static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$ru$ok$android$webrtc$CallEvents;

        static {
            int[] iArr = new int[oh1.values().length];
            $SwitchMap$ru$ok$android$webrtc$CallEvents = iArr;
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[12] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[17] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[18] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[1] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[6] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[0] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[10] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[7] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[8] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[19] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[20] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[22] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[23] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[24] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[27] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[25] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[26] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[11] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[15] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[16] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[28] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[29] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[30] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[31] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[32] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[33] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[13] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[14] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$ru$ok$android$webrtc$CallEvents[21] = 34;
            } catch (NoSuchFieldError unused34) {
            }
        }
    }

    public class ListenerImpl implements l91, k91, wi1, ds1, qu1, WaitingRoomParticipants.Listener, q1g, tt1 {
        private boolean callAcceptedFired;
        private boolean callAcceptedForwarded;
        private ConversationEventsListener listener;

        public ListenerImpl(ConversationEventsListener conversationEventsListener) {
            this.listener = conversationEventsListener;
        }

        private void handleCallAccepted(du1 du1Var) {
            if (!ConversationImpl.this.isJoined && ConversationImpl.this.call.n0.w() == zvh.b) {
                ConversationImpl.this.conversationStats.acceptCallStat.onAcceptCall(ConversationImpl.this.isCaller, Objects.equals(du1Var, ConversationImpl.this.f1me.getCallParticipant()), ConversationImpl.this.isConcurrent);
            }
            if (!this.callAcceptedForwarded && (!ConversationImpl.this.isCaller || this.callAcceptedFired)) {
                this.listener.onCallAccepted();
                maybeInitP2PRelaySwitchTrigger();
                this.callAcceptedForwarded = true;
            }
            this.callAcceptedFired = true;
            this.listener.onCallAcceptedForAll();
        }

        private void handleHangup(o91 o91Var, Object obj) {
            this.listener.onCallEnded(ConversationImpl.this.getCallEndInfo(o91Var.J, obj));
            this.listener.onCallEnded(new ConversationEndInfo(o91Var.e1.p()));
            ConversationImpl.this.handleCallFinished(o91Var.h1);
            ConversationImpl.this.conversationStats.wsSignalingStat.onCallFinished();
        }

        private void handleMuteParticipant(i9b i9bVar) {
            if (shouldNotifyLegacyListener(i9bVar)) {
                this.listener.onMuteChanged(i9bVar.a);
            }
            ConversationImpl.this.mediaMuteListenerManager.onMuteChanged(i9bVar.a);
        }

        private void handleMuteStateInitialized(i9b i9bVar) {
            boolean z = i9bVar.b;
            h9b h9bVar = i9bVar.a;
            if (!z || !ConversationImpl.this.isMeCreatorOrAdmin()) {
                this.listener.onMuteStateInitialized(h9bVar);
            }
            ConversationImpl.this.mediaMuteListenerManager.onMuteStateInitialized(h9bVar);
        }

        private void handleRolesChanged(du1 du1Var) {
            hi1 hi1Var;
            ParticipantId participantIdConvert;
            yt1 yt1Var = du1Var.a;
            ConversationParticipant byInternal = yt1Var != null ? ConversationImpl.this.store.getByInternal(yt1Var) : null;
            if (byInternal == null && (hi1Var = du1Var.q) != null && (participantIdConvert = CallExternalIdConverter.convert(hi1Var)) != null) {
                byInternal = ConversationImpl.this.store.getParticipantById(participantIdConvert);
            }
            if (byInternal != null) {
                if (byInternal.getCallParticipant() == null) {
                    byInternal.setCallParticipant(du1Var, ConversationImpl.this.localIdMappings);
                }
                ConversationEventsListener conversationEventsListener = this.listener;
                if (conversationEventsListener != null) {
                    conversationEventsListener.onRolesChanged(byInternal);
                }
                if ((ConversationImpl.this.f1me.getInternalId() == null || !ConversationImpl.this.f1me.getInternalId().equals(du1Var.a)) && byInternal != ConversationImpl.this.f1me) {
                    return;
                }
                ConversationImpl.this.waitingRoomParticipants.onIsMeAdminMayHaveChanged(ConversationImpl.this.isMeCreatorOrAdmin());
            }
        }

        private void maybeInitP2PRelaySwitchTrigger() {
            if (ConversationImpl.this.isCaller && ConversationImpl.this.call.n0.w() == zvh.b) {
                P2PRelaySwitchConfigProviderImpl p2PRelaySwitchConfigProviderImpl = new P2PRelaySwitchConfigProviderImpl(ConversationImpl.this.remoteSettings, ConversationImpl.this.log);
                ConversationImpl conversationImpl = ConversationImpl.this;
                StatMonitor statMonitor = ConversationImpl.this.statMonitor;
                y3e y3eVar = ConversationImpl.this.log;
                o91 o91Var = ConversationImpl.this.call;
                Objects.requireNonNull(o91Var);
                conversationImpl.p2pRelaySwitchTrigger = new P2pRelaySwitchTrigger(statMonitor, y3eVar, new p81(o91Var, 11), ConversationImpl.this.conversationStats, p2PRelaySwitchConfigProviderImpl);
            }
        }

        private boolean shouldNotifyLegacyListener(i9b i9bVar) {
            if (!i9bVar.b || !ConversationImpl.this.isMeCreatorOrAdmin()) {
                return true;
            }
            h9b h9bVar = i9bVar.a;
            AbstractMap abstractMap = h9bVar.a;
            Iterator it = h9bVar.b.iterator();
            while (it.hasNext()) {
                o0a o0aVar = (o0a) abstractMap.get((n0a) it.next());
                if (o0aVar != null && o0aVar == o0a.a) {
                    return true;
                }
            }
            return false;
        }

        @Override // defpackage.tt1
        public void onAdminInCallChanged() {
            this.listener.onAdminInCallChanged(ConversationImpl.this.isAdminHere());
        }

        @Override // defpackage.tt1
        public void onAnonJoinForbiddenChanged() {
            this.listener.onAnonJoinForbiddenChanged(ConversationImpl.this.isAnonJoinForbidden());
        }

        @Override // defpackage.tt1
        public void onAsrOnlineAvailableChanged() {
            AsrOnlineManagerImpl asrOnlineManagerImpl = ConversationImpl.this.asrOnlineManager;
            o91 o91Var = ConversationImpl.this.call;
            asrOnlineManagerImpl.onAsrAvailableChanged(o91Var.t.contains(m91.f));
        }

        @Override // defpackage.wi1
        public void onCallParticipantFingerprint(du1 du1Var, long j) {
            ConversationEventsListener conversationEventsListener;
            if (ConversationImpl.this.call.j0.j().size() == 1 && ConversationImpl.this.call.u() == du1Var && (conversationEventsListener = this.listener) != null) {
                conversationEventsListener.onOpponentFingerprintChanged(j);
            }
        }

        @Override // defpackage.ds1
        public void onCallParticipantNetworkStatusChanged(List<du1> list) {
            ConversationParticipant byInternal;
            ArrayList arrayList = new ArrayList();
            for (du1 du1Var : list) {
                yt1 yt1Var = du1Var.a;
                if (yt1Var != null && (byInternal = ConversationImpl.this.store.getByInternal(yt1Var)) != null) {
                    if (byInternal.getCallParticipant() == null) {
                        byInternal.setCallParticipant(du1Var, ConversationImpl.this.localIdMappings);
                    }
                    if (ConversationImpl.this.store.getParticipantRoomId(byInternal) == ConversationImpl.this.store.getActiveRoomId()) {
                        arrayList.add(byInternal);
                    }
                }
            }
            if (this.listener == null || arrayList.isEmpty()) {
                return;
            }
            this.listener.onCallParticipantsNetworkStatusChanged(arrayList);
        }

        @Override // defpackage.k91
        public void onCustomData(yt1 yt1Var, JSONObject jSONObject) {
            ConversationEventsListener conversationEventsListener = this.listener;
            if (conversationEventsListener != null) {
                conversationEventsListener.onCustomData(jSONObject);
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // defpackage.l91
        public void onEvent(o91 o91Var, oh1 oh1Var, Object obj) {
            ConversationImpl.this.log.log(ConversationImpl.LOG_TAG, "EVENT: " + oh1Var);
            if (this.listener != null) {
                switch (oh1Var.ordinal()) {
                    case 0:
                        ConversationImpl.this.mediaConnectionManager.onIceConnected();
                        this.listener.onConnected();
                        if (!ConversationImpl.this.audioSampleEnergyCalculatorRegistered) {
                            ConversationImpl.this.audioSampleEnergyCalculatorRegistered = true;
                            AudioSampleEnergyCalculator audioSampleEnergyCalculator = ConversationImpl.this.audioSampleEnergyCalculator;
                            long j = ConversationImpl.this.audioLevelFrequencyMs;
                            zzf zzfVar = o91Var.e0;
                            zzfVar.a.execute(new xc2(zzfVar, audioSampleEnergyCalculator, j, 6));
                        }
                        break;
                    case 1:
                        ConversationImpl.this.mediaConnectionManager.onIceDisconnected();
                        this.listener.onDisconnected();
                        break;
                    case 2:
                    case 12:
                        handleHangup(o91Var, obj);
                        break;
                    case 3:
                        this.listener.onCallEnded(new ConversationEventsListener.CallEndInfo(it7.f, Collections.EMPTY_SET, null));
                        o91Var.e1.E(ConversationEndReason.AcceptedOnAnotherDevice.INSTANCE);
                        this.listener.onCallEnded(new ConversationEndInfo(o91Var.e1.p()));
                        ConversationImpl.this.conversationStats.wsSignalingStat.onCallFinished();
                        break;
                    case 4:
                        this.listener.onLocalMediaChanged();
                        break;
                    case 5:
                        this.listener.onOpponentMediaChanged();
                        break;
                    case 6:
                        this.listener.onCameraChanged();
                        break;
                    case 7:
                        this.listener.onDestroyed(ConversationImpl.this.getDestroyReason());
                        this.listener.onDestroyed(new ConversationDestroyedInfo(o91Var.e1.p()));
                        ConversationImpl.this.idMappingWrapper.scheduleWriteCacheToDisk();
                        ConversationImpl.this.handleCallFinished(o91Var.h1);
                        ConversationImpl.this.conversationStats.wsSignalingStat.onCallFinished();
                        break;
                    case 8:
                        ConversationImpl.this.resetSignaling();
                        break;
                    case 9:
                        handleCallAccepted(obj instanceof du1 ? (du1) obj : null);
                        break;
                    case 10:
                        this.listener.onOpponentRegistered();
                        break;
                    case 13:
                        if (obj instanceof ri1) {
                            ConversationImpl.this.conversationFeatureListeners.onFeatureSetChanged((ri1) obj);
                        }
                        break;
                    case 14:
                        if (obj instanceof si1) {
                            ConversationImpl.this.conversationFeatureListeners.onFeaturesPerRoleChanged((si1) obj);
                        }
                        break;
                    case 15:
                        if ((obj instanceof Long) && ConversationImpl.this.chatStateListener != null) {
                            ConversationImpl.this.chatStateListener.onChatCreated(((Long) obj).longValue());
                            break;
                        }
                        break;
                    case 16:
                        if ((obj instanceof Long) && ConversationImpl.this.chatStateListener != null) {
                            ConversationImpl.this.chatStateListener.onChatUpdated(((Long) obj).longValue());
                            break;
                        }
                        break;
                    case 17:
                        this.listener.onMicrophoneForciblyMuted();
                        break;
                    case 18:
                        this.listener.onCameraForciblyMuted();
                        break;
                    case 19:
                        o91Var.L(true);
                        this.listener.onMicChanged(true);
                        break;
                    case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /* 20 */:
                        o91Var.L(false);
                        this.listener.onMicChanged(false);
                        break;
                    case 21:
                        if (obj instanceof SignalingErrors$CallIsUnfeasibleError) {
                            this.listener.onCallIsUnfeasibleError((SignalingErrors$CallIsUnfeasibleError) obj);
                        }
                        break;
                    case 22:
                        this.listener.onCallSignalingConnected();
                        break;
                    case 23:
                        if (obj instanceof du1) {
                            handleRolesChanged((du1) obj);
                        }
                        break;
                    case 24:
                        if (obj instanceof Set) {
                            Iterator it = ((Set) obj).iterator();
                            while (it.hasNext()) {
                                handleRolesChanged((du1) it.next());
                            }
                        }
                        break;
                    case 25:
                    case 26:
                        yt1 yt1Var = obj instanceof yt1 ? (yt1) obj : null;
                        this.listener.onPinChanged(yt1Var != null ? ConversationImpl.this.store.getByInternal(yt1Var) : null, oh1Var == oh1.z);
                        break;
                    case 27:
                        if (obj instanceof i9b) {
                            handleMuteParticipant((i9b) obj);
                        }
                        break;
                    case 28:
                        if (obj instanceof i9b) {
                            handleMuteStateInitialized((i9b) obj);
                        }
                        break;
                    case 29:
                        this.listener.onMigratedToServerTopology();
                        ConversationImpl.this.asrOnlineManager.onMigratedToServerCallTopology();
                        break;
                    case 30:
                        if (obj instanceof String) {
                            this.listener.onJoinLinkUpdated((String) obj);
                        }
                        break;
                    case 31:
                        if (obj instanceof b2b) {
                            ConversationImpl.this.watchTogetherListenerManager.onVideoStarted((b2b) obj);
                        }
                        break;
                    case 32:
                        if (obj instanceof d2b) {
                            ConversationImpl.this.watchTogetherListenerManager.onVideoStatesUpdatedChanged((d2b) obj);
                        }
                        break;
                    case 33:
                        if (obj instanceof e2b) {
                            ConversationImpl.this.watchTogetherListenerManager.onVideoStopped((e2b) obj);
                        }
                        break;
                }
            }
        }

        @Override // defpackage.tt1
        public void onFeedbackEnabledChanged() {
            ConversationImpl.this.feedbackListenerManager.onFeedbackEnabledChanged(ConversationImpl.this.isFeedbackEnabled());
        }

        @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
        public void onMeInWaitingRoomChanged(boolean z) {
            ConversationEventsListener conversationEventsListener = this.listener;
            if (conversationEventsListener != null) {
                conversationEventsListener.onMeInWaitingRoomChanged(z);
            }
        }

        @Override // defpackage.q1g
        public void onRateCall(JSONObject jSONObject) {
            RateCallData rateCallData;
            ConversationParams conversationParams = ConversationImpl.this.conversationParams;
            if (conversationParams == null || (rateCallData = conversationParams.rateCallData) == null) {
                rateCallData = new RateCallData(0, Collections.EMPTY_LIST);
            }
            this.listener.onRateCall(rateCallData);
        }

        @Override // defpackage.tt1
        public void onRecurringChanged() {
            this.listener.onRecurringChanged(ConversationImpl.this.isRecurring());
        }

        @Override // defpackage.qu1
        public void onStateChanged(yt1 yt1Var, au1 au1Var) {
            if (this.listener != null) {
                ConversationParticipant byInternal = ConversationImpl.this.store.getByInternal(yt1Var);
                if (byInternal == null) {
                    byInternal = ConversationParticipant.fromInternal(yt1Var, ConversationImpl.this.idMappingWrapper);
                }
                this.listener.onStateChanged(byInternal, au1Var);
                ConversationImpl.this.participantStatesManager.onStateChanged(yt1Var, au1Var);
            }
        }

        @Override // defpackage.tt1
        public void onWaitForAdminChanged() {
            this.listener.onWaitForAdminEnabled();
        }

        @Override // defpackage.tt1
        public void onWaitingHallEnabledChanged() {
            ConversationImpl.this.waitingRoomParticipants.onWaitingRoomEnabled(ConversationImpl.this.isWaitingRoomEnabled());
            this.listener.onWaitingRoomEnabledChanged(ConversationImpl.this.isWaitingRoomEnabled());
        }

        @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
        public void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
            ConversationEventsListener conversationEventsListener = this.listener;
            if (conversationEventsListener != null) {
                conversationEventsListener.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
            }
        }

        public void release() {
            this.listener = null;
        }
    }

    public ConversationImpl(ConversationBuilder conversationBuilder) {
        skg o02Var;
        Handler handler = new Handler(Looper.getMainLooper());
        this.mainThreadHandler = handler;
        LocalIdMappings localIdMappings = new LocalIdMappings();
        this.localIdMappings = localIdMappings;
        this.peerIdGenerator = new PeerIdGenerator();
        this.callParticipantResolutionRunnable = new u(2, this);
        this.audioSampleEnergyCalculatorRegistered = false;
        AtomicReference<Conversation.State> atomicReference = new AtomicReference<>(Conversation.State.None);
        this.state = atomicReference;
        this.p2pRelaySwitchTrigger = null;
        this.isHoldStateProcessingActive = new AtomicBoolean();
        this.creator = conversationBuilder.creator;
        this.executorService = conversationBuilder.executorService;
        this.version = conversationBuilder.version;
        boolean z = conversationBuilder.isCaller;
        this.isCaller = z;
        this.isAnswer = conversationBuilder.isAnswer;
        this.isJoined = conversationBuilder.isJoined;
        this.forceRelayPolicy = conversationBuilder.forceRelayPolicy;
        this.disposable = new w74();
        xdd xddVar = new xdd(conversationBuilder.context);
        this.preferencesHelper = xddVar;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        ConversationEventsListener conversationEventsListener = conversationBuilder.eventListener;
        if (conversationEventsListener != null) {
            copyOnWriteArraySet.add(conversationEventsListener);
        }
        MultiEventListener multiEventListener = new MultiEventListener(copyOnWriteArraySet);
        this.eventListener = multiEventListener;
        ListenerImpl listenerImpl = new ListenerImpl(multiEventListener);
        this.listener = listenerImpl;
        ConversationListenerProxy<ListenerImpl> conversationListenerProxy = new ConversationListenerProxy<>(listenerImpl);
        this.listenerProxy = conversationListenerProxy;
        this.internalHoldStateListener = new zj8() { // from class: ru.ok.android.externcalls.sdk.y
            @Override // defpackage.zj8
            public final void a(String str, boolean z2) {
                this.a.lambda$new$0(str, z2);
            }
        };
        us4 us4Var = new us4(multiEventListener);
        String str = conversationBuilder.cid;
        qs4 qs4Var = new qs4(us4Var, str == null ? "" : str);
        this.cidProvider = qs4Var;
        y3e y3eVar = conversationBuilder.log;
        if (y3eVar instanceof uxh) {
            ((uxh) y3eVar).c = qs4Var;
        }
        CidLogger cidLogger = new CidLogger(qs4Var, y3eVar);
        this.log = cidLogger;
        z3e z3eVar = conversationBuilder.logConfiguration;
        this.logConfiguration = z3eVar;
        IdMappingWrapper idMappingWrapper = conversationBuilder.idMappingWrapper;
        this.idMappingWrapper = idMappingWrapper;
        this.initialJoinLink = conversationBuilder.joinLink;
        this.anonToken = conversationBuilder.anonToken;
        StatMonitorImpl statMonitorImpl = new StatMonitorImpl(cidLogger);
        this.statMonitor = statMonitorImpl;
        nl9.c = new c7k(13, cidLogger);
        ConversationParticipant conversationParticipant = conversationBuilder.f0me;
        this.f1me = conversationParticipant;
        conversationParticipant.setReported(true);
        ParticipantStore participantStore = new ParticipantStore(conversationParticipant, localIdMappings);
        this.store = participantStore;
        this.audioLevelFrequencyMs = conversationBuilder.audioLevelFrequencyMs;
        r rVar = new r(this, 5);
        Context context = conversationBuilder.context;
        context.getClass();
        this.mlFeaturesInfoDataSource = new xy0(rVar, context, "ml_features");
        zy0 ex8Var = new ex8(4, new xy0(new r(this, 6), conversationBuilder.context, "bitrate_dump_config"));
        applyBitrateDumpGatheringConfig(conversationBuilder.experiments, ex8Var, conversationBuilder.context);
        xt1 xt1VarCreateCallParams = CallUtil.createCallParams(conversationBuilder);
        this.callParams = xt1VarCreateCallParams;
        wl wlVar = conversationBuilder.animojiRenderProvider;
        this.animojiDataSupplier = wlVar;
        this.clientCapabilities = configureSignalingCapabilities(conversationParticipant, conversationBuilder.clientCapabilities);
        v88 v88Var = xt1VarCreateCallParams.r;
        this.experiments = v88Var;
        StartCallApiParams startCallApiParamsCreateStartCallApiParams = createStartCallApiParams(conversationBuilder);
        this.startCallApiParams = startCallApiParamsCreateStartCallApiParams;
        du1 du1Var = new du1(conversationParticipant.getInternalId(), null, null, null);
        conversationParticipant.setCallParticipant(du1Var, localIdMappings);
        ConversationParticipant conversationParticipant2 = conversationBuilder.initialOpponent;
        ConversationParticipant conversationParticipant3 = (conversationParticipant2 == null || Objects.equals(conversationParticipant2.getExternalId(), conversationParticipant.getExternalId())) ? null : conversationBuilder.initialOpponent;
        this.initialOpponent = conversationParticipant3;
        if (conversationParticipant3 != null) {
            participantStore.addToActiveSessionRoom(conversationParticipant3);
            this.initialOpponent.setReported(true);
        }
        esh eshVar = conversationBuilder.timeProvider;
        this.timeProvider = eshVar;
        boolean z2 = this.initialOpponent != null;
        boolean isVideo = startCallApiParamsCreateStartCallApiParams.getIsVideo();
        boolean z3 = this.forceRelayPolicy;
        ClientCapabilities clientCapabilities = conversationBuilder.clientCapabilities;
        bj1 bj1Var = new bj1(z2, isVideo, z3, clientCapabilities != null && clientCapabilities.has(ClientCapabilities.Capability.SESSION_STATE_UPDATES));
        CallApiServiceImpl callApiServiceImpl = new CallApiServiceImpl(qs4Var);
        eshVar.getClass();
        px8 px8Var = new px8();
        this.timings = px8Var;
        IdMappingResolver idMappingResolverCreateIdMappingResolver = createIdMappingResolver();
        SignalingProvider signalingProviderCreateSignalingProvider = createSignalingProvider();
        RecordManagerImpl recordManagerImplCreateRecordManager = createRecordManager(idMappingResolverCreateIdMappingResolver, idMappingWrapper, signalingProviderCreateSignalingProvider);
        this.recordManager = recordManagerImplCreateRecordManager;
        this.sslProvider = conversationBuilder.sslProvider;
        Context context2 = conversationBuilder.context;
        boolean z4 = conversationBuilder.isJoined;
        opb ex8Var2 = conversationBuilder.cameraCapturerFactory;
        if (ex8Var2 == null) {
            ex8Var2 = new ex8(13, cidLogger);
        }
        nue nueVar = conversationBuilder.rotationProvider;
        opb opbVar = ex8Var2;
        CallAnalyticsSender callAnalyticsSender = conversationBuilder.analyticsSender;
        a4f a4fVar = conversationBuilder.screenCapturePermissionProvider;
        xoc xocVar = this.pcapLabelProvider;
        long j = conversationBuilder.ringingTimeout;
        pr1 pr1Var = new pr1(context2, xt1VarCreateCallParams, z, z4, du1Var, qs4Var, cidLogger, z3eVar, opbVar, nueVar, wlVar, eshVar, callAnalyticsSender, xddVar, a4fVar, bj1Var, callApiServiceImpl, px8Var, recordManagerImplCreateRecordManager, xocVar, j);
        xq1 xq1Var = pr1Var.g;
        ru1 ru1Var = pr1Var.i;
        fik fikVar = pr1Var.h;
        ifh ifhVar = new ifh(new br1(1));
        p8b p8bVar = du1Var.c;
        h0a h0aVar = new h0a();
        boolean z5 = xt1VarCreateCallParams.i;
        vn7 vn7Var = pr1Var.k;
        b72 b72Var = new b72(cidLogger);
        co0 co0Var = xt1VarCreateCallParams.u;
        zn0 zn0Var = new zn0(co0Var.a != null, co0Var.c.a);
        gj2 gj2Var = new gj2(2, cidLogger);
        ch chVar = new ch(cidLogger, eshVar, xt1VarCreateCallParams.r.Z);
        h32 h32Var = (h32) pr1Var.o.b.getValue();
        cw5 cw5Var = pr1Var.m;
        due dueVar = pr1Var.n;
        if (xt1VarCreateCallParams.r.e0) {
            du1 du1Var2 = ru1Var.a;
            xt1VarCreateCallParams.getClass();
            ukg ukgVar = new ukg();
            ukgVar.d = xt1VarCreateCallParams;
            ukgVar.e = cidLogger;
            ukgVar.f = du1Var2;
            ukgVar.g = new Hashtable();
            ukgVar.i = new p5a();
            ukgVar.h = new Hashtable();
            o02Var = ukgVar;
        } else {
            o02Var = new o02(xt1VarCreateCallParams, cidLogger, ru1Var.a);
        }
        xp9 xp9Var = new xp9(cidLogger);
        skg skgVar = o02Var;
        EglBase eglBase = pr1Var.p;
        EglBase.Context eglBaseContext = eglBase.getEglBaseContext();
        eglBaseContext.getClass();
        int[] iArr = EglBase.CONFIG_PLAIN;
        iArr.getClass();
        qs1 qs1Var = new qs1(cidLogger, eglBaseContext, iArr, null);
        ExecutorService executorService = pr1Var.q;
        ExecutorService executorService2 = pr1Var.r;
        wwf wwfVar = new wwf("pc_created", cidLogger);
        wwf wwfVar2 = new wwf("accepted", cidLogger);
        ug5 ug5Var = pr1Var.s;
        zzf zzfVar = pr1Var.t;
        lb9 lb9Var = pr1Var.u;
        fwg fwgVar = pr1Var.v;
        rzf rzfVar = new rzf();
        rzfVar.a = zzfVar;
        rzfVar.b = fwgVar;
        rzfVar.i = Integer.valueOf(xt1VarCreateCallParams.r.b);
        rzfVar.c = du1Var.c;
        rzfVar.d = context2;
        rzfVar.e = cidLogger;
        rzfVar.j = true;
        rzfVar.k = pr1Var.p.getEglBaseContext();
        rzfVar.f = xt1VarCreateCallParams;
        rzfVar.g = new or1(pr1Var);
        rzfVar.l = pr1Var.u;
        rzfVar.n = nueVar;
        rzfVar.m = eshVar;
        rzfVar.o = new or1(pr1Var);
        boolean z6 = xt1VarCreateCallParams.f;
        ifh ifhVar2 = new ifh(new nr1(pr1Var, 6));
        xr8 xr8Var = new xr8();
        zzf zzfVar2 = pr1Var.t;
        vn7 vn7Var2 = pr1Var.k;
        p8b p8bVar2 = du1Var.c;
        EglBase eglBase2 = pr1Var.p;
        zzfVar2.getClass();
        vn7Var2.getClass();
        wlVar.getClass();
        eglBase2.getClass();
        yfj yfjVar = new yfj();
        yfjVar.a = zzfVar2;
        yfjVar.b = cidLogger;
        yfjVar.c = vn7Var2;
        yfjVar.d = wlVar;
        yfjVar.e = p8bVar2;
        yfjVar.f = eglBase2;
        zq1 zq1Var = pr1Var.w;
        k5g k5gVar = pr1Var.x;
        ru1 ru1Var2 = pr1Var.i;
        fik fikVar2 = pr1Var.h;
        xq1 xq1Var2 = pr1Var.g;
        ru1Var2.getClass();
        fikVar2.getClass();
        zq1Var.getClass();
        xq1Var2.getClass();
        eshVar.getClass();
        yfj yfjVar2 = new yfj();
        yfjVar2.a = cidLogger;
        yfjVar2.b = ru1Var2;
        yfjVar2.c = fikVar2;
        yfjVar2.d = zq1Var;
        yfjVar2.e = xq1Var2;
        yfjVar2.f = eshVar;
        xde xdeVar = new xde(ru1Var, pr1Var.x, xq1Var, cidLogger);
        xq1Var.getClass();
        due dueVar2 = new due();
        dueVar2.a = new zfh(xq1Var.l);
        ifh ifhVar3 = new ifh(new nr1(pr1Var, 5));
        ifh ifhVar4 = new ifh(new nr1(pr1Var, 2));
        ifh ifhVar5 = new ifh(new nr1(pr1Var, 1));
        ew6 ew6Var = pr1Var.y;
        fw6 fw6Var = ew6Var.b;
        cw6 cw6Var = ew6Var.c;
        nr1 nr1Var = new nr1(pr1Var, 0);
        mkc mkcVar = new mkc();
        mkcVar.b = cidLogger;
        mkcVar.c = nr1Var;
        qyd qydVar = new qyd();
        mkcVar.d = qydVar;
        z2f z2fVarA = i3f.a();
        Objects.requireNonNull(TimeUnit.MILLISECONDS, "unit is null");
        Objects.requireNonNull(z2fVarA, "scheduler is null");
        vqb vqbVarE = new jqb(qydVar, z2fVarA, 0).e(th.a());
        vx8 vx8Var = new vx8(new vog(mkcVar), vm9.f);
        vqbVarE.f(vx8Var);
        mkcVar.e = vx8Var;
        o91 o91Var = new o91(context2, eshVar, xq1Var, fikVar, ru1Var, xt1VarCreateCallParams, ifhVar, z, z4, p8bVar, h0aVar, qs4Var, cidLogger, xddVar, z5, vn7Var, b72Var, zn0Var, gj2Var, chVar, h32Var, cw5Var, dueVar, skgVar, xp9Var, eglBase, qs1Var, executorService, executorService2, wwfVar, wwfVar2, ug5Var, zzfVar, lb9Var, fwgVar, rzfVar, z6, ifhVar2, xr8Var, yfjVar, wlVar, zq1Var, k5gVar, yfjVar2, xdeVar, dueVar2, ifhVar3, ifhVar4, ifhVar5, fw6Var, cw6Var, a4fVar, mkcVar, new fik(6, cidLogger), Camera.getNumberOfCameras(), bj1Var, callApiServiceImpl, px8Var, pr1Var.j, (wpc) pr1Var.z.getValue(), pr1Var.l, xocVar, j);
        this.call = o91Var;
        ApiStats apiStats = new ApiStats(new p81(o91Var, 9));
        o91Var.F.add(conversationListenerProxy);
        ExecutionTimeInterceptor executionTimeInterceptor = conversationBuilder.executionTimeInterceptor;
        this.executionTimeInterceptor = executionTimeInterceptor;
        executionTimeInterceptor.setApiStats(apiStats);
        ApiModuleImpl apiModuleImpl = new ApiModuleImpl(conversationBuilder.api, conversationParticipant, conversationBuilder.okApiService, new p81(o91Var, 9), cidLogger, eshVar, conversationBuilder.sslProvider, conversationBuilder.hangupDelegate, this.anonToken);
        this.apiModule = apiModuleImpl;
        OkApiServiceInternal okApiServiceInternal = apiModuleImpl.getOkApiServiceInternal();
        this.apiService = okApiServiceInternal;
        callApiServiceImpl.setApiServiceImpl(okApiServiceInternal);
        this.screenCaptureManager = new ScreenCaptureManagerImpl(o91Var);
        this.cameraManager = new CameraManagerImpl(o91Var, new r(this, 7), v88Var.g0);
        VideoRenderManagerImpl videoRenderManagerImpl = new VideoRenderManagerImpl(new pe3(21, atomicReference), o91Var, new ConversationRenderers(), participantStore, v88Var.g0);
        this.videoRendererProvider = videoRenderManagerImpl;
        this.videoRenderManager = videoRenderManagerImpl;
        this.microphoneManager = new MicrophoneManagerImpl(o91Var, new r(this, 8));
        this.noiseSuppressionManager = new NoiseSuppressionManagerImpl(o91Var);
        NetworkConnectionManagerImpl networkConnectionManagerImpl = new NetworkConnectionManagerImpl(o91Var);
        this.networkConnectionManager = networkConnectionManagerImpl;
        this.debugManager = new DebugManagerImpl(o91Var, cidLogger, (wpc) pr1Var.z.getValue(), signalingProviderCreateSignalingProvider);
        ParticipantStatesManagerImpl participantStatesManagerImplCreateParticipantStatesManager = createParticipantStatesManager(participantStore, new ParticipantStateChanger(signalingProviderCreateSignalingProvider), multiEventListener);
        this.participantStatesManager = participantStatesManagerImplCreateParticipantStatesManager;
        this.waitingRoomParticipants = createWaitingRoomParticipants(idMappingWrapper, idMappingResolverCreateIdMappingResolver, listenerImpl);
        this.stereoRoomManager = createStereoRoomManager(signalingProviderCreateSignalingProvider, idMappingResolverCreateIdMappingResolver);
        IdsMapper<ParticipantId, yt1> externalToInternalIdsMapper = conversationBuilder.internalIdsMapper;
        externalToInternalIdsMapper = externalToInternalIdsMapper == null ? new ExternalToInternalIdsMapper(okApiServiceInternal, cidLogger) : externalToInternalIdsMapper;
        this.internalIdsMapper = externalToInternalIdsMapper;
        this.internalIdsResolver = createInternalIdsResolver(participantStore, idMappingWrapper, externalToInternalIdsMapper);
        this.externalIdsResolver = createExternalIdsResolver(participantStore, idMappingWrapper, conversationBuilder.externalIdsMapper);
        this.addParticipantsCommands = new AddParticipantsCommands(signalingProviderCreateSignalingProvider, o91Var, idMappingWrapper, new pe3(21, atomicReference));
        WatchTogetherListenerManagerImpl watchTogetherListenerManagerImpl = new WatchTogetherListenerManagerImpl(participantStore);
        this.watchTogetherListenerManager = watchTogetherListenerManagerImpl;
        SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl = new SessionRoomListenerManagerImpl(participantStore);
        WatchTogetherPlayer watchTogetherPlayerCreateWatchTogetherPlayer = createWatchTogetherPlayer(watchTogetherListenerManagerImpl, signalingProviderCreateSignalingProvider);
        this.watchTogetherPlayer = watchTogetherPlayerCreateWatchTogetherPlayer;
        FeedbackListenerManagerImpl feedbackListenerManagerImpl = new FeedbackListenerManagerImpl(this, participantStore, idMappingResolverCreateIdMappingResolver, idMappingWrapper);
        this.feedbackListenerManager = feedbackListenerManagerImpl;
        this.feedbackManager = createFeedbackManager(feedbackListenerManagerImpl, signalingProviderCreateSignalingProvider);
        AsrListenerManagerImpl asrListenerManagerImpl = new AsrListenerManagerImpl(participantStore);
        this.asrListenerManager = asrListenerManagerImpl;
        this.asrManager = createAsrManager(asrListenerManagerImpl, participantStore, signalingProviderCreateSignalingProvider);
        this.contactCallManager = new ContactCallManagerImpl(participantStore, conversationBuilder.answerAsContact);
        this.asrOnlineManager = createAsrOnlineManager(participantStore);
        this.chatStateListener = conversationBuilder.chatStateListener;
        this.conversationFeatureListeners = createConversationFeatureListeners();
        this.conversationFeatureManager = createFeatureManager(signalingProviderCreateSignalingProvider);
        this.sessionRoomManager = createSessionRoomManager(sessionRoomListenerManagerImpl, participantStatesManagerImplCreateParticipantStatesManager, idMappingResolverCreateIdMappingResolver, signalingProviderCreateSignalingProvider);
        this.participantsUpdater = createParticipantsUpdater(participantStatesManagerImplCreateParticipantStatesManager);
        this.locale = conversationBuilder.locale;
        if (v88Var.g0) {
            registerParticipantsUpdaterListeners();
        }
        this.sessionRoomWatchTogetherHandler = new SessionRoomWatchTogetherHandler(participantStore, watchTogetherPlayerCreateWatchTogetherPlayer);
        this.sessionRoomParticipantStatesHandler = createParticipantStatesHandler(participantStatesManagerImplCreateParticipantStatesManager);
        RemoteSettings remoteSettingsCreateRemoteSettings = createRemoteSettings(conversationBuilder.remoteSettings);
        this.remoteSettings = remoteSettingsCreateRemoteSettings;
        ConversationStats conversationStatsCreateConversationStats = createConversationStats(remoteSettingsCreateRemoteSettings);
        this.conversationStats = conversationStatsCreateConversationStats;
        AudioErrorStat audioErrorStat = conversationStatsCreateConversationStats.audioErrorStat;
        Objects.requireNonNull(audioErrorStat);
        ss4 ss4Var = new ss4(audioErrorStat);
        this.audioEventsListener = ss4Var;
        zzf zzfVar3 = o91Var.e0;
        zzfVar3.a.execute(new yde(zzfVar3, 21, ss4Var));
        this.urlSharingListenerManager = createUrlSharingListenerManager();
        this.urlSharingManager = createUrlSharingManager();
        ChatListenerManagerImpl chatListenerManagerImplCreateChatListenerManager = createChatListenerManager(participantStore);
        this.chatListenerManager = chatListenerManagerImplCreateChatListenerManager;
        this.chatManager = createChatManager(participantStore, chatListenerManagerImplCreateChatListenerManager);
        MediaMuteListenerManagerImpl mediaMuteListenerManagerImplCreateMediaMuteListenerManager = createMediaMuteListenerManager();
        this.mediaMuteListenerManager = mediaMuteListenerManagerImplCreateMediaMuteListenerManager;
        this.mediaMuteManager = createMediaMuteManager(signalingProviderCreateSignalingProvider, mediaMuteListenerManagerImplCreateMediaMuteListenerManager);
        this.displayLayoutSender = new DisplayLayoutSenderImpl(new j22(28, participantStore), new v(this, 1));
        ik8 ik8Var = new ik8(conversationBuilder.api.d(), conversationBuilder.api.c());
        this.internalParamsProvider = ik8Var;
        this.conversationStart = new ConversationStart(okApiServiceInternal, conversationBuilder.startConversationDelegate, qs4Var, participantStore, conversationParticipant, cidLogger, ik8Var, v88Var);
        this.joinConversationDelegate = conversationBuilder.joinConversationDelegate;
        this.audioSampleEnergyCalculator = new AnonymousClass1(handler);
        MediaConnectionManagerImpl mediaConnectionManagerImpl = new MediaConnectionManagerImpl(cidLogger, new r(this, 4), conversationBuilder.mediaConnectionSettings);
        this.mediaConnectionManager = mediaConnectionManagerImpl;
        networkConnectionManagerImpl.plusAssign(mediaConnectionManagerImpl);
        this.rateManager = new RateManagerImpl(cidLogger, new RateManagerConfigProviderImpl(remoteSettingsCreateRemoteSettings, cidLogger), new p81(o91Var, 8), statMonitorImpl);
        final ServerTopologyRequestedStat serverTopologyRequestedStat = conversationStatsCreateConversationStats.serverTopologyRequestedStat;
        Objects.requireNonNull(serverTopologyRequestedStat);
        this.topologyUpgradeStatEventListener = new fwh() { // from class: ts4
            @Override // defpackage.fwh
            public final void a(bwh bwhVar) {
                serverTopologyRequestedStat.onServerTopologyRequested(bwhVar);
            }
        };
        vy0 vy0Var = new vy0(v88Var.M);
        String str2 = this.anonToken;
        HashSet hashSet = new HashSet(1);
        Object obj = new Object[]{vy0Var}[0];
        Objects.requireNonNull(obj);
        if (!hashSet.add(obj)) {
            ore.p(c0a.n(obj, "duplicate element: "));
            throw null;
        }
        this.callFinishHandler = new zi1(okApiServiceInternal, cidLogger, qs4Var, str2, Collections.unmodifiableSet(hashSet));
        yy0 yy0Var = new yy0(remoteSettingsCreateRemoteSettings, cidLogger, "android.dump.bitrate", "BitrateDumpGatheringConfigProviderImpl", 0);
        ih ihVar = new ih();
        ihVar.a = ex8Var;
        ihVar.b = cidLogger;
        dp9 config = yy0Var.getConfig();
        vn7 vn7Var3 = new vn7(4, ihVar);
        zo7 zo7Var = new zo7(4, ihVar);
        ot4 ot4Var = new ot4(7, ihVar);
        config.getClass();
        config.a(new ep9(vn7Var3, zo7Var, ot4Var));
        conversationStatsCreateConversationStats.callInitStat.onCallInitialized();
        this.mlFeaturesManager = createMLFeatureManager(conversationBuilder.context);
    }

    private void applyBitrateDumpGatheringConfig(z7b z7bVar, zy0 zy0Var, Context context) {
        wy0 wy0Var = (wy0) ((xy0) ((ex8) zy0Var).b).y("bitrate_config_key", wy0.class);
        gpb gpbVarH = z7bVar.h();
        AvailableMLFeatureInfo availableMLFeatureInfo = (AvailableMLFeatureInfo) ((sr) this.mlFeaturesInfoDataSource).y("ns", AvailableMLFeatureInfo.class);
        boolean z = true;
        boolean z2 = availableMLFeatureInfo != null && availableMLFeatureInfo.getVersion().equals(NSFeatureDelegate.getFeatureKeyByVersion(gpbVarH.b));
        y7b y7bVar = z7bVar.W;
        zv8[] zv8VarArr = z7b.k0;
        woc wocVar = (woc) y7bVar.a(zv8VarArr[47]);
        ae7 ae7Var = new ae7(wocVar, gpbVarH, z7bVar.m(), z2);
        this.pcapLabelProvider = ae7Var;
        woc wocVarL = ae7Var.l();
        if ((wy0Var == null || !wy0Var.a) && wocVarL == null) {
            z = false;
        }
        this.log.log(LOG_TAG, "BitrateDumpGatheringConfig=" + wy0Var + ", initial pcapLabel=" + wocVar + ", isActualNsModelAvailable=" + z2 + ", actual pcapLabel=" + wocVarL + ". Summary, is dump gathering enabled=" + z);
        Object bh6Var = z ? new bh6(context) : ah6.a;
        y7b y7bVar2 = z7bVar.O;
        zv8 zv8Var = zv8VarArr[39];
        y7bVar2.b(bh6Var);
    }

    private void assertInited() {
        if (!this.inited) {
            ore.k("Conversation not initialized");
        } else if (isDestroyed()) {
            ore.k("Conversation already destroyed");
        }
    }

    private void assertPrepared() {
        if (!this.prepared) {
            ore.k("Conversation not ready");
        } else if (isDestroyed()) {
            ore.k("Conversation already destroyed");
        }
    }

    private s38 chooseIceServersResolver() {
        return this.experiments.f() == dh6.c ? new ldf(18) : new l6m(28);
    }

    private ClientCapabilities configureSignalingCapabilities(ConversationParticipant conversationParticipant, ClientCapabilities clientCapabilities) {
        xt1 xt1Var = this.callParams;
        this.animojiDataSupplier.getClass();
        ClientCapabilities capabilitiesForCurrentUser = getCapabilitiesForCurrentUser(clientCapabilities, xt1Var, false);
        conversationParticipant.setCapabilities(capabilitiesForCurrentUser);
        return capabilitiesForCurrentUser;
    }

    private AsrManager createAsrManager(AsrListenerManager asrListenerManager, ParticipantStore participantStore, SignalingProvider signalingProvider) {
        return new AsrManagerImpl(new AsrCommandsExecutorImpl(signalingProvider, participantStore), asrListenerManager);
    }

    private AsrOnlineManagerImpl createAsrOnlineManager(ParticipantStore participantStore) {
        return new AsrOnlineManagerImpl(new AsrOnlineCommandsExecutorImpl(new r(this, 2), createSignalingProvider()), new AsrOnlineListenerManagerImpl(participantStore), new r(this, 3));
    }

    private ChatListenerManagerImpl createChatListenerManager(ParticipantStore participantStore) {
        return new ChatListenerManagerImpl(participantStore);
    }

    private ChatManagerImpl createChatManager(ParticipantStore participantStore, ChatListenerManagerImpl chatListenerManagerImpl) {
        return new ChatManagerImpl(new ChatCommandExecutorImpl(createSignalingProvider(), participantStore), chatListenerManagerImpl);
    }

    private ConversationFeatureListenersImpl createConversationFeatureListeners() {
        return new ConversationFeatureListenersImpl();
    }

    private ConversationStats createConversationStats(RemoteSettings remoteSettings) {
        o91 o91Var = this.call;
        Objects.requireNonNull(o91Var);
        return new ConversationStats(new p81(o91Var, 10), new yy0(remoteSettings, this.log, "android.webrtc.stats", "BitrateDumpGatheringConfigProviderImpl", 1), getCallType(), this.timeProvider, this.log, this.anonToken != null, this.callParams.r.t);
    }

    private ExternalIdsResolver createExternalIdsResolver(ParticipantStore participantStore, IdMappingWrapper idMappingWrapper, IdsMapper<yt1, ParticipantId> idsMapper) {
        MultiEventListener multiEventListener = this.eventListener;
        Objects.requireNonNull(multiEventListener);
        us4 us4Var = new us4(multiEventListener);
        hs4 hs4Var = new hs4(5);
        LocalIdMappings localIdMappings = this.localIdMappings;
        if (idsMapper == null) {
            idsMapper = new InternalToExternalIdsMapper(this.apiService, this.log);
        }
        return new ExternalIdsResolver(participantStore, idMappingWrapper, us4Var, hs4Var, localIdMappings, idsMapper);
    }

    private jl6 createFastJoinPrepare() {
        return new jl6(this.joinConversationDelegate, this.internalParamsProvider, this.cidProvider, this.internalIdsResolver, this.externalIdsResolver, this.conversationStats.preparedStat, this.isAnswer, this.isCaller, this.log, this.f1me, this.experiments);
    }

    private pl6 createFastStartPrepare() {
        return new pl6(this.internalIdsResolver, this.externalIdsResolver, this.conversationStats.preparedStat, this.isAnswer, this.isCaller, this.log, this.f1me, this.experiments);
    }

    private ConversationFeatureManagerImpl createFeatureManager(SignalingProvider signalingProvider) {
        return new ConversationFeatureManagerImpl(new ConversationFeatureCommandExecutorImpl(signalingProvider), this.conversationFeatureListeners);
    }

    private FeedbackManager createFeedbackManager(FeedbackListenerManager feedbackListenerManager, SignalingProvider signalingProvider) {
        return new FeedbackManagerImpl(new FeedbackCommandsExecutorImpl(signalingProvider), feedbackListenerManager);
    }

    private IdMappingResolver createIdMappingResolver() {
        return new IdMappingResolver() { // from class: ru.ok.android.externcalls.sdk.ConversationImpl.5
            public AnonymousClass5() {
            }

            @Override // ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver
            public void resolveExternalsByInternalsIds(List<yt1> list, Runnable runnable, Runnable runnable2) {
                ConversationImpl.this.resolveExternalsByInternalsIds(list, runnable, runnable2);
            }

            @Override // ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver
            public void withInternalId(ParticipantId participantId, sg4 sg4Var, Runnable runnable) {
                ConversationImpl.this.withInternalId(participantId, sg4Var, runnable);
            }
        };
    }

    private InternalIdsResolver createInternalIdsResolver(ParticipantStore participantStore, IdMappingWrapper idMappingWrapper, IdsMapper<ParticipantId, yt1> idsMapper) {
        return new InternalIdsResolver(participantStore, idMappingWrapper, new hs4(4), this.localIdMappings, idsMapper);
    }

    private oq8 createJoinPrepare() {
        return new oq8(this.apiService, this.cidProvider, this.internalIdsResolver, this.externalIdsResolver, this.startCallApiParams, this.peerIdGenerator, this.conversationStats.preparedStat, this.isAnswer, this.isCaller, this.log, this.f1me, this.experiments);
    }

    private MLFeaturesManager createMLFeatureManager(Context context) {
        DownloadService.Impl impl = new DownloadService.Impl(this.log);
        xj9 xj9Var = this.mlFeaturesInfoDataSource;
        y3e y3eVar = this.log;
        RemoteSettings remoteSettings = this.remoteSettings;
        ConversationStats conversationStats = this.conversationStats;
        NoiseSuppressionManager noiseSuppressionManager = this.noiseSuppressionManager;
        hh6 hh6Var = this.experiments;
        o91 o91Var = this.call;
        Objects.requireNonNull(o91Var);
        p81 p81Var = new p81(o91Var, 5);
        o91 o91Var2 = this.call;
        Objects.requireNonNull(o91Var2);
        return new MLFeaturesManagerImpl(xj9Var, impl, context, y3eVar, remoteSettings, conversationStats, noiseSuppressionManager, hh6Var, p81Var, new p81(o91Var2, 6));
    }

    private MediaMuteListenerManagerImpl createMediaMuteListenerManager() {
        return new MediaMuteListenerManagerImpl();
    }

    private MediaMuteManagerImpl createMediaMuteManager(SignalingProvider signalingProvider, MediaMuteListenerManager mediaMuteListenerManager) {
        r rVar = new r(this, 1);
        v vVar = new v(this, 0);
        ParticipantStore participantStore = this.store;
        Objects.requireNonNull(participantStore);
        return new MediaMuteManagerImpl(new MediaMuteCommandExecutorImpl(signalingProvider, rVar, vVar, new pe3(20, participantStore)), mediaMuteListenerManager);
    }

    private SessionRoomParticipantStatesHandler createParticipantStatesHandler(ParticipantStatesManagerImpl participantStatesManagerImpl) {
        return new SessionRoomParticipantStatesHandler(participantStatesManagerImpl, new r(this, 0));
    }

    private ParticipantStatesManagerImpl createParticipantStatesManager(ParticipantStore participantStore, ParticipantStateChanger participantStateChanger, ConversationEventsListener conversationEventsListener) {
        return new ParticipantStatesManagerImpl(participantStore, participantStateChanger, conversationEventsListener);
    }

    private ParticipantsUpdater createParticipantsUpdater(ParticipantStatesManagerImpl participantStatesManagerImpl) {
        MultiEventListener multiEventListener = this.eventListener;
        ParticipantStore participantStore = this.store;
        IdMappingWrapper idMappingWrapper = this.idMappingWrapper;
        LocalIdMappings localIdMappings = this.localIdMappings;
        AnonymousClass2 anonymousClass2 = new ParticipantsUpdater.MappingUpdater() { // from class: ru.ok.android.externcalls.sdk.ConversationImpl.2
            public AnonymousClass2() {
            }

            @Override // ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater.MappingUpdater
            public void reportIfApplicable() {
                ConversationImpl.this.reportIfApplicable();
            }

            @Override // ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater.MappingUpdater
            public void triggerMapUpdate() {
                ConversationImpl.this.mainThreadHandler.removeCallbacks(ConversationImpl.this.callParticipantResolutionRunnable);
                ConversationImpl.this.mainThreadHandler.post(ConversationImpl.this.callParticipantResolutionRunnable);
            }
        };
        ConversationParticipant conversationParticipant = this.f1me;
        Objects.requireNonNull(conversationParticipant);
        return new ParticipantsUpdater(multiEventListener, participantStore, participantStatesManagerImpl, idMappingWrapper, localIdMappings, anonymousClass2, new s63(12, conversationParticipant));
    }

    private RecordManagerImpl createRecordManager(IdMappingResolver idMappingResolver, IdMappingWrapper idMappingWrapper, SignalingProvider signalingProvider) {
        return new RecordManagerImpl(this.log, this.store, idMappingResolver, idMappingWrapper, signalingProvider, this.eventListener, this.experiments.b());
    }

    private SessionRoomsManagerImpl createSessionRoomManager(SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, ParticipantStatesManagerImpl participantStatesManagerImpl, IdMappingResolver idMappingResolver, SignalingProvider signalingProvider) {
        SessionRoomCommandExecutorImpl sessionRoomCommandExecutorImpl = new SessionRoomCommandExecutorImpl(participantStatesManagerImpl, signalingProvider);
        SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl = new SessionRoomParticipantsDataProviderImpl(this.store, sessionRoomListenerManagerImpl, idMappingResolver, this.idMappingWrapper);
        return new SessionRoomsManagerImpl(sessionRoomListenerManagerImpl, sessionRoomCommandExecutorImpl, new SessionRoomAdminCommandExecutorImpl(signalingProvider, sessionRoomParticipantsDataProviderImpl), sessionRoomParticipantsDataProviderImpl);
    }

    private SignalingProvider createSignalingProvider() {
        return new g(0, this);
    }

    private z6g createSimplePrepare(ConversationParams conversationParams) {
        return new z6g(this.apiService, this.cidProvider, conversationParams, this.internalIdsResolver, this.externalIdsResolver, this.conversationStats.preparedStat, this.isAnswer, this.isCaller, this.log, this.f1me, this.experiments);
    }

    private StartCallApiParams createStartCallApiParams(ConversationBuilder conversationBuilder) {
        return new StartCallApiParams(conversationBuilder.domainId, conversationBuilder.payload, conversationBuilder.isWatchTogetherEnabledForAll, conversationBuilder.hasVideo, conversationBuilder.clientType, conversationBuilder.multipleDevicesEnabled, conversationBuilder.chatId, conversationBuilder.waitForAdminEnabled, this.clientCapabilities.getHexValueString());
    }

    private StereoRoomManagerImpl createStereoRoomManager(SignalingProvider signalingProvider, IdMappingResolver idMappingResolver) {
        return new StereoRoomManagerImpl(this.log, this.store, idMappingResolver, new g(3, this), new StereoRoomCommandExecutorImpl(signalingProvider, this.log), this.idMappingWrapper, new StereoRoomListenerManagerImpl(), this.timeProvider);
    }

    private UrlSharingListenerManagerImpl createUrlSharingListenerManager() {
        return new UrlSharingListenerManagerImpl(createIdMappingResolver(), this.idMappingWrapper, this.log);
    }

    private UrlSharingManagerImpl createUrlSharingManager() {
        return new UrlSharingManagerImpl(new UrlSharingCommandsExecutorImpl(createSignalingProvider()), this.urlSharingListenerManager);
    }

    private WaitingRoomParticipants createWaitingRoomParticipants(IdMappingWrapper idMappingWrapper, IdMappingResolver idMappingResolver, ListenerImpl listenerImpl) {
        return new WaitingRoomParticipants(new WaitingRoomParticipants.Listener() { // from class: ru.ok.android.externcalls.sdk.ConversationImpl.3
            final /* synthetic */ ListenerImpl val$listener;

            public AnonymousClass3() {
                listenerImpl = listenerImpl;
            }

            @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
            public void onMeInWaitingRoomChanged(boolean z) {
                listenerImpl.onMeInWaitingRoomChanged(z);
            }

            @Override // ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.Listener
            public void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
                listenerImpl.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
            }
        }, idMappingWrapper, idMappingResolver, this.log);
    }

    private WatchTogetherPlayer createWatchTogetherPlayer(WatchTogetherListenerManager watchTogetherListenerManager, SignalingProvider signalingProvider) {
        o91 o91Var = this.call;
        Objects.requireNonNull(o91Var);
        return new WatchTogetherPlayerImpl(new WatchTogetherCommandExecutorImpl(signalingProvider, new p81(o91Var, 7)), watchTogetherListenerManager);
    }

    private <T> void executeOnBg(af7 af7Var, sg4 sg4Var, Runnable runnable) {
        this.disposable.a(CallsThreadUtilsKt.executeOnIoThread(af7Var, sg4Var, runnable));
    }

    private <P extends ActionParams, R extends ActionResult> v7g executeWithState(Conversation.State state, Conversation.State state2, Action<P, R> action, P p) {
        AtomicReference<Conversation.State> atomicReference = this.state;
        while (!atomicReference.compareAndSet(state, state2)) {
            if (atomicReference.get() != state) {
                return new p64(3, new gg7(new IllegalStateException("State " + this.state.get() + " doesn't match wanted state " + state)));
            }
        }
        return action.execute(p);
    }

    public ConversationEventsListener.CallEndInfo getCallEndInfo(it7 it7Var, Object obj) {
        HashSet hashSet;
        String str;
        if (obj instanceof gt7) {
            gt7 gt7Var = (gt7) obj;
            hashSet = new HashSet();
            if (gt7Var.a.contains(ft7.ONE_VIDEO_TIMEOUT)) {
                hashSet.add(HangupHint.SHOULD_RECONNECT);
            }
            str = gt7Var.b;
        } else {
            hashSet = null;
            str = null;
        }
        return new ConversationEventsListener.CallEndInfo(it7Var, hashSet, str);
    }

    private du1 getCallParticipantByExternalId(ParticipantId participantId) {
        ConversationParticipant byExternalWithAnyDevice = this.store.getByExternalWithAnyDevice(participantId);
        if (byExternalWithAnyDevice != null) {
            return byExternalWithAnyDevice.getCallParticipant();
        }
        return null;
    }

    public yt1 getCallParticipantId(ParticipantId participantId) {
        ConversationParticipant byExternal;
        du1 callParticipant;
        if (participantId == null || (byExternal = this.store.getByExternal(participantId)) == null || (callParticipant = byExternal.getCallParticipant()) == null) {
            return null;
        }
        return callParticipant.a;
    }

    public static ClientCapabilities getCapabilitiesForCurrentUser(ClientCapabilities clientCapabilities, xt1 xt1Var, boolean z) {
        boolean z2 = false;
        ClientCapabilities clientCapabilities2 = clientCapabilities.set(ClientCapabilities.Capability.VIDEO_TRACKS, xt1Var.j > 0);
        ClientCapabilities.Capability capability = ClientCapabilities.Capability.VMOJI;
        if (clientCapabilities.has(capability) && z) {
            z2 = true;
        }
        return clientCapabilities2.set(capability, z2);
    }

    @Deprecated
    private ConversationParticipant getParticipantByExternalId(String str) {
        return this.store.getByExternalWithAnyDevice(ParticipantId.authorized(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [u81] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void grantRoles(final yt1 yt1Var, final boolean z, bu1[] bu1VarArr, final Runnable runnable, final Runnable runnable2) {
        final o91 o91Var = this.call;
        final List listAsList = Arrays.asList(bu1VarArr);
        o91Var.n0.C(yt1Var, listAsList, z, new n4g() { // from class: u81
            @Override // defpackage.n4g
            public final void onResponse(JSONObject jSONObject) {
                du1 du1Var;
                o91 o91Var2 = o91Var;
                o91Var2.getClass();
                if (!jSONObject.optString("error").isEmpty()) {
                    Runnable runnable3 = runnable2;
                    if (runnable3 != null) {
                        runnable3.run();
                        return;
                    }
                    return;
                }
                ru1 ru1Var = o91Var2.j0;
                ru1Var.getClass();
                yt1 yt1Var2 = yt1Var;
                yt1Var2.getClass();
                LinkedHashSet<du1> linkedHashSet = new LinkedHashSet();
                du1 du1Var2 = ru1Var.a;
                yt1 yt1Var3 = du1Var2.a;
                if (yt1Var3 == null || !yt1Var3.equals(yt1Var2)) {
                    Set<yt1> set = (Set) ru1Var.h.get(yt1Var2.a);
                    if (set != null) {
                        for (yt1 yt1Var4 : set) {
                            dnf dnfVar = (dnf) ru1Var.g.get(yt1Var4);
                            if (dnfVar != null && (du1Var = (du1) ru1Var.d(dnfVar).get(yt1Var4)) != null) {
                                linkedHashSet.add(du1Var);
                            }
                        }
                    }
                } else {
                    linkedHashSet.add(du1Var2);
                }
                if (!linkedHashSet.isEmpty()) {
                    for (du1 du1Var3 : linkedHashSet) {
                        boolean z2 = z;
                        List list = listAsList;
                        if (z2) {
                            du1Var3.d.removeAll(list);
                        } else {
                            du1Var3.d.addAll(list);
                        }
                    }
                    o91Var2.n(oh1.x, linkedHashSet);
                }
                Runnable runnable4 = runnable;
                if (runnable4 != null) {
                    runnable4.run();
                }
            }
        });
    }

    public void handleCallFinished(CallTerminatingException callTerminatingException) {
        int i;
        Object lp9Var;
        reportCallFinished(callTerminatingException);
        zi1 zi1Var = this.callFinishHandler;
        int i2 = 0;
        int i3 = 1;
        if (zi1Var.f.compareAndSet(false, true)) {
            for (vy0 vy0Var : zi1Var.e) {
                ch6 ch6Var = vy0Var.a;
                if (ch6Var instanceof bh6) {
                    File file = new File(((bh6) ch6Var).b);
                    z2f z2fVarA = i3f.a();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    brb brbVarA = fqb.a(0L, 1L, timeUnit, z2fVarA);
                    z2f z2fVarB = i3f.b();
                    Objects.requireNonNull(z2fVarB, "scheduler is null");
                    sqb sqbVar = new sqb(new xqb(new jqb(brbVarA, z2fVarB, 2), new c7k(3, file), i3), er3.c, i2);
                    z2f z2fVarA2 = i3f.a();
                    Objects.requireNonNull(z2fVarA2, "scheduler is null");
                    i = 1;
                    lp9Var = new lp9(new nqb(new xqb(new sqb(sqbVar, new krb(Math.max(5L, 0L), timeUnit, z2fVarA2), 3), ou7.d, 1)), new ot4(6, file), 2);
                } else {
                    i = i3;
                    lp9Var = fp9.a;
                }
                ip9 ip9Var = new ip9(lp9Var, new i1m(zi1Var), 0);
                z2f z2fVarB2 = i3f.b();
                Objects.requireNonNull(z2fVarB2, "scheduler is null");
                due dueVar = new due();
                dueVar.a = zi1Var;
                ft0 ft0Var = new ft0();
                ft0Var.a = zi1Var;
                ep9 ep9Var = new ep9(dueVar, ft0Var, new ot4(zi1Var, vy0Var));
                try {
                    o72 o72Var = new o72(ep9Var);
                    ep9Var.c(o72Var);
                    j66 j66Var = (j66) o72Var.b;
                    ko5 ko5VarB = z2fVarB2.b(new og7(o72Var, 10, ip9Var));
                    j66Var.getClass();
                    oo5.d(j66Var, ko5VarB);
                    i2 = 0;
                    i3 = i;
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th) {
                    iwl.a(th);
                    NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                    nullPointerException.initCause(th);
                    throw nullPointerException;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
    /* JADX INFO: renamed from: handleCallStartException, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$runStartConversation$18(Throwable th, sg4 sg4Var) {
        ApiInvocationException apiErrorParticipantLimitExceeded;
        if (th instanceof FastStartException) {
            sg4Var.accept(new CallTerminatingException.Builder(Domain.EXTERNAL, th).setSubDomain(SubDomain.START).build());
            return;
        }
        if (th instanceof FastJoinException) {
            sg4Var.accept(new CallTerminatingException.Builder(Domain.EXTERNAL, th).setSubDomain(SubDomain.JOIN).build());
            return;
        }
        if (th instanceof IOException) {
            sg4Var.accept(new CallTerminatingException.Builder(Domain.NETWORK, th).build());
            return;
        }
        if (!(th instanceof ApiInvocationException)) {
            sg4Var.accept(new CallTerminatingException.Builder(Domain.SERVER, th).setSubDomain(SubDomain.API).build());
            return;
        }
        ApiInvocationException apiInvocationException = (ApiInvocationException) th;
        int errorCode = apiInvocationException.getErrorCode();
        String errorMessage = apiInvocationException.getErrorMessage();
        if (errorCode == 1104 || errorCode == 1114) {
            handleExternalApiException(apiInvocationException, sg4Var);
            return;
        }
        if (errorCode == 2) {
            sg4Var.accept(new CallTerminatingException.Builder(Domain.SERVER, new ServiceUnavailableException()).setSubDomain(SubDomain.API).setCode(errorCode).build());
            return;
        }
        if (errorCode != 4 || errorMessage == null) {
            sg4Var.accept(new CallTerminatingException.Builder(Domain.SERVER, th).setSubDomain(SubDomain.API).setCode(errorCode).build());
            return;
        }
        int i = ApiInvocationError.a;
        if (r5h.L0(errorMessage, "error.friend.restricted-access", false)) {
            apiErrorParticipantLimitExceeded = new ApiErrorUserPrivate(77990, apiInvocationException);
        } else if (r5h.L0(errorMessage, "auth.banned", false)) {
            apiErrorParticipantLimitExceeded = new ApiErrorUserBanned(77993, apiInvocationException);
        } else if (r5h.L0(errorMessage, "not.found.User", false)) {
            apiErrorParticipantLimitExceeded = new ApiErrorUserBlocked(77992, apiInvocationException);
        } else {
            if (!r5h.L0(errorMessage, "error.send-message.too-many-users", false)) {
                if (r5h.L0(errorMessage, "error.participants.limit.exceeded", false)) {
                    apiErrorParticipantLimitExceeded = new ApiErrorParticipantLimitExceeded(77994, apiInvocationException);
                }
                if (apiInvocationException.getErrorCode() == 77993) {
                    sg4Var.accept(new CallTerminatingException.Builder(Domain.SERVER, apiInvocationException).setSubDomain(SubDomain.API).setCode(apiInvocationException.getErrorCode()).build());
                } else {
                    this.call.e1.E(ConversationEndReason.Banned.INSTANCE);
                    sg4Var.accept(apiInvocationException);
                }
            }
            apiErrorParticipantLimitExceeded = new ApiErrorTooManyUsers(77991, apiInvocationException);
        }
        apiInvocationException = apiErrorParticipantLimitExceeded;
        if (apiInvocationException.getErrorCode() == 77993) {
            sg4Var.accept(new CallTerminatingException.Builder(Domain.SERVER, apiInvocationException).setSubDomain(SubDomain.API).setCode(apiInvocationException.getErrorCode()).build());
        } else {
            this.call.e1.E(ConversationEndReason.Banned.INSTANCE);
            sg4Var.accept(apiInvocationException);
        }
    }

    private void handleExternalApiException(ApiInvocationException apiInvocationException, sg4 sg4Var) {
        ExternErrorParser.ErrorDescription errorDescription = new ExternErrorParser().parse(apiInvocationException);
        String errorCode = errorDescription.getErrorCode();
        ExternApiException externApiException = new ExternApiException(apiInvocationException, apiInvocationException.getErrorCode(), errorCode);
        if (errorCode == null || !errorCode.toLowerCase().startsWith("obsolete_client")) {
            sg4Var.accept(new CallTerminatingException.Builder(Domain.EXTERNAL, externApiException, errorDescription.getErrorCode()).setSubDomain(SubDomain.API).build());
        } else {
            this.call.e1.E(new ConversationEndReason.ObsoleteClient(null, errorCode));
            sg4Var.accept(externApiException);
        }
    }

    public void handleSignalingError(l4g l4gVar, final p4g p4gVar) {
        String str;
        Domain domain;
        final String str2;
        final Domain domain2;
        final it7 it7Var;
        if (l4gVar instanceof k4g) {
            domain2 = Domain.INTERNAL;
            it7Var = it7.a;
            str2 = "signaling timeout";
        } else {
            boolean z = l4gVar instanceof j4g;
            it7 it7Var2 = it7.d;
            if (z) {
                domain = Domain.INTERNAL;
                str = ((j4g) l4gVar).a;
            } else {
                str = "Unknown ErrorType " + l4gVar;
                domain = Domain.UNKNOWN;
            }
            str2 = str;
            domain2 = domain;
            it7Var = it7Var2;
        }
        this.mainThreadHandler.post(new Runnable() { // from class: ru.ok.android.externcalls.sdk.t
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$handleSignalingError$23(domain2, str2, p4gVar, it7Var);
            }
        });
    }

    private boolean hasNoInternalId(ffd ffdVar, Boolean bool, sg4 sg4Var) {
        ArrayList arrayList = new ArrayList(ffdVar.b);
        if (!arrayList.isEmpty()) {
            this.eventListener.onCallStartResolutionFailed(arrayList);
        }
        if (!bool.booleanValue()) {
            boolean z = !arrayList.isEmpty();
            int i = 0;
            for (ConversationParticipant conversationParticipant : this.store) {
                boolean zEquals = Objects.equals(conversationParticipant.getExternalId(), this.f1me.getExternalId());
                boolean z2 = conversationParticipant.getInternalId() != null;
                z &= !z2 || zEquals;
                i += (!z2 || zEquals) ? 0 : 1;
            }
            if (z) {
                sg4Var.accept(wrapInternalError(new CallFailedException("no call targets left")));
                return true;
            }
            if (i == 1) {
                for (ConversationParticipant conversationParticipant2 : this.store) {
                    if (conversationParticipant2.getInternalId() != null && !Objects.equals(conversationParticipant2.getExternalId(), this.f1me.getExternalId())) {
                        this.initialOpponent = conversationParticipant2;
                        break;
                    }
                }
            }
        }
        return false;
    }

    private boolean isWebTransportEnabled() {
        return this.callParams.r.p && WTSignaling.isAvailable();
    }

    public static /* synthetic */ void lambda$addParticipant$28(sg4 sg4Var, JSONObject jSONObject) throws JSONException {
        if (sg4Var != null) {
            sg4Var.accept(jSONObject.optString("error", ""));
        }
    }

    public /* synthetic */ void lambda$addParticipant$29(Boolean bool, boolean z, sg4 sg4Var, Collection collection) {
        this.call.m((yt1) collection.iterator().next(), bool, Boolean.valueOf(z), new n(sg4Var, 0));
    }

    public static /* synthetic */ void lambda$addParticipant$30(sg4 sg4Var, JSONObject jSONObject) throws JSONException {
        if (sg4Var != null) {
            sg4Var.accept(jSONObject.optString("error", ""));
        }
    }

    public /* synthetic */ void lambda$addParticipant$31(boolean z, sg4 sg4Var, GetOkIdByExternalId.Response response) throws Throwable {
        this.call.m(new yt1(1, 0, response.getOkId()), Boolean.valueOf(z), Boolean.FALSE, new n(sg4Var, 1));
    }

    public /* synthetic */ void lambda$addParticipant$32(Throwable th) throws Throwable {
        this.log.reportException(LOG_TAG, "failed to add participant", th);
    }

    public /* synthetic */ o91 lambda$createAsrOnlineManager$7() {
        return this.call;
    }

    public /* synthetic */ o91 lambda$createAsrOnlineManager$8() {
        return this.call;
    }

    public /* synthetic */ o91 lambda$createMediaMuteManager$6() {
        return this.call;
    }

    public q4g lambda$createSignalingProvider$42() {
        return this.call.k;
    }

    public void lambda$handleSignalingError$23(Domain domain, String str, p4g p4gVar, it7 it7Var) {
        SubDomain subDomain;
        if (this.listener.listener != null) {
            o91 o91Var = this.call;
            CallTerminatingException.Builder builder = new CallTerminatingException.Builder(domain, str);
            j4i j4iVarType = p4gVar.type();
            if (cqk.d(j4iVarType, i4i.a)) {
                subDomain = SubDomain.WT;
            } else {
                subDomain = cqk.d(j4iVarType, h4i.a) ? SubDomain.WS : null;
            }
            o91Var.h1 = builder.setSubDomain(subDomain).build();
            hangup(new ht7(it7Var));
        }
    }

    public /* synthetic */ void lambda$new$0(String str, boolean z) {
        this.eventListener.onParticipantHoldStateChanged(new qy7(str, z));
    }

    public /* synthetic */ y3e lambda$new$1() {
        return this.log;
    }

    public /* synthetic */ y3e lambda$new$2() {
        return this.log;
    }

    public /* synthetic */ Boolean lambda$new$3() {
        return Boolean.valueOf(this.prepared);
    }

    public /* synthetic */ Boolean lambda$new$4() {
        return Boolean.valueOf(this.prepared);
    }

    public sbi lambda$new$5(List list) {
        o91 o91Var = this.call;
        o91Var.getClass();
        o91Var.N.log("OKRTCCall", "updateDisplayLayout " + list);
        if (o91Var.q()) {
            o91Var.n0.a0(list);
            nl nlVar = o91Var.x0;
            nlVar.getClass();
            list.getClass();
            if (nlVar.i) {
                km kmVar = nlVar.h;
                kmVar.getClass();
                Point point = new Point();
                HashMap map = new HashMap();
                pu6 pu6Var = new pu6(yhf.m0(new sw(1, list), new defpackage.m(12, kmVar)));
                while (pu6Var.hasNext()) {
                    mg1 mg1Var = (mg1) pu6Var.next();
                    mg1Var.getClass();
                    yvi yviVar = mg1Var.b;
                    int i = point.x;
                    int i2 = yviVar.a;
                    int i3 = yviVar.b;
                    point.x = Integer.max(i, i2);
                    point.y = Integer.max(point.y, i3);
                    yt1 yt1Var = mg1Var.a.b;
                    mg1 mg1Var2 = (mg1) map.get(yt1Var);
                    if (mg1Var2 != null) {
                        yvi yviVar2 = mg1Var2.b;
                        yviVar2.getClass();
                        if (yviVar2.b * yviVar2.a > i3 * yviVar.a) {
                            mg1Var = mg1Var2;
                        }
                    }
                    map.put(yt1Var, mg1Var);
                }
                StringBuilder sb = new StringBuilder("layouts: {");
                for (Map.Entry entry : map.entrySet()) {
                    sb.append(((yt1) entry.getKey()).a);
                    sb.append(" -> ");
                    sb.append(((mg1) entry.getValue()).b.a);
                    sb.append('x');
                    sb.append(((mg1) entry.getValue()).b.b);
                    sb.append(" , ");
                }
                sb.append("}");
                kmVar.n.log("AniRenderDispatch", sb.toString());
                kmVar.g.post(new i0(kmVar, map, point, 1));
            }
            a5f a5fVar = (a5f) o91Var.V0.getValue();
            a5fVar.getClass();
            ((gsh) a5fVar.b).getClass();
            i3f.a().b(new xc2(a5fVar, list, SystemClock.elapsedRealtime(), 4));
        }
        return sbi.a;
    }

    public /* synthetic */ void lambda$performConfroomJoin$13(ConversationParams conversationParams, sg4 sg4Var, sg4 sg4Var2, JoinConversation.Response response) throws Throwable {
        this.forceRelayPolicy |= response.getP2pForbidden();
        performConnect(response.getEndpoint(), null, response.getWtEndpoint(), null, conversationParams, sg4Var, sg4Var2);
    }

    public /* synthetic */ void lambda$performConnect$20(String str) {
        this.recordManager.onRecordError(new gw1(str));
    }

    public /* synthetic */ Boolean lambda$performConnect$21(boolean z) {
        return Boolean.valueOf(this.experiments.d() || z || this.conversationStart.isFastStartEnabled());
    }

    public void lambda$performConnect$22(sg4 sg4Var, o91 o91Var) {
        this.conversationStats.connectedToSignalingStat.onConnectedToSignaling();
        this.isConcurrent = o91Var.K;
        this.state.getAndSet(Conversation.State.Connected);
        if (sg4Var != null) {
            sg4Var.accept(this);
        }
        this.mlFeaturesManager.start();
        uza.d();
        o91Var.T = null;
    }

    public void lambda$prepare$9(boolean z, sg4 sg4Var, sg4 sg4Var2, ffd ffdVar) throws Throwable {
        if (this.conversationStart.isFastStartEnabled() || !hasNoInternalId(ffdVar, Boolean.valueOf(z), sg4Var)) {
            ConversationParams conversationParams = ffdVar.a;
            if (conversationParams == null && !this.isCaller) {
                sg4Var.accept(wrapInternalError(new NullPointerException("Conversation parameters object MUST not be null for a not calling participant")));
                return;
            }
            if (this.isCaller) {
                runStartConversation(conversationParams, z, sg4Var2, sg4Var);
            } else if (this.expectedChat) {
                performConfroomJoin(conversationParams, sg4Var2, sg4Var);
            } else {
                performConnect(conversationParams.endpoint, conversationParams.wsIps, conversationParams.wtEndpoint, conversationParams.wtIps, conversationParams, sg4Var2, sg4Var);
            }
        }
    }

    public void lambda$prepareJoinByLink$11(sg4 sg4Var, sg4 sg4Var2, ffd ffdVar) throws Throwable {
        ConversationParams conversationParams = ffdVar.a;
        if (conversationParams == null) {
            sg4Var.accept(wrapInternalError(new NullPointerException("Conversation parameters object MUST not be null")));
            return;
        }
        this.forceRelayPolicy |= conversationParams.isP2PForbidden;
        performConnect(conversationParams.endpoint, conversationParams.wsIps, conversationParams.wtEndpoint, conversationParams.wtIps, conversationParams, sg4Var2, sg4Var);
        this.call.z = this.initialJoinLink;
    }

    public void lambda$promoteParticipant$34(boolean z, yt1 yt1Var) {
        o91 o91Var = this.call;
        o91Var.k.d(kql.p(yt1Var, z), false, new a91(o91Var, yt1Var, 1), o91Var.f);
    }

    public /* synthetic */ void lambda$queryChatHistory$39(Conversation.ChatHistoryCallback chatHistoryCallback, JSONObject jSONObject) throws JSONException {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("messages");
        if (jSONArrayOptJSONArray == null) {
            return;
        }
        int length = jSONArrayOptJSONArray.length();
        ChatHistoryEntry[] chatHistoryEntryArr = new ChatHistoryEntry[length];
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                yt1 yt1VarW = kql.w(jSONObjectOptJSONObject);
                ConversationParticipant byInternal = this.store.getByInternal(yt1VarW);
                if (byInternal == null) {
                    byInternal = ConversationParticipant.fromInternal(yt1VarW, this.idMappingWrapper);
                }
                chatHistoryEntryArr[i] = new ChatHistoryEntry(jSONObjectOptJSONObject.optString("message", ""), jSONObjectOptJSONObject.optBoolean("direct", false), byInternal);
            }
        }
        chatHistoryCallback.onResponse(chatHistoryEntryArr);
    }

    public /* synthetic */ void lambda$refreshParams$15(Runnable runnable, ConversationParams conversationParams) throws Throwable {
        this.conversationParams = conversationParams;
        this.prepared = true;
        runnable.run();
    }

    public void lambda$removeParticipant$33(boolean z, yt1 yt1Var) {
        o91 o91Var = this.call;
        o91Var.getClass();
        o91Var.N.log("OKRTCCall", "removeParticipant, participant=" + yt1Var);
        if (o91Var.q()) {
            try {
                if (yt1Var.equals(o91Var.C0)) {
                    o91Var.C0 = null;
                    o91Var.n(oh1.y, null);
                }
                q4g q4gVar = o91Var.k;
                JSONObject jSONObject = new JSONObject();
                kql.d(yt1Var, jSONObject, false);
                jSONObject.put("ban", z);
                q4gVar.j(kql.b(jSONObject, "remove-participant"), new a91(o91Var, yt1Var, 0));
            } catch (JSONException e) {
                ore.h("Remove participant command failed", e);
            }
        }
    }

    public /* synthetic */ void lambda$requestHoldStateChange$26(boolean z, my7 my7Var, Void r4) {
        this.state.set(z ? Conversation.State.HeldByMe : Conversation.State.Connected);
        this.isHoldStateProcessingActive.set(false);
        my7Var.a(new oy7(z));
    }

    public void lambda$requestHoldStateChange$27(my7 my7Var, ky7 ky7Var) {
        this.isHoldStateProcessingActive.set(false);
        my7Var.a(new ny7(new HoldException.SignalingCommandExecution(ky7Var.a)));
    }

    public /* synthetic */ void lambda$resolveExternalsByInternalsIds$40(Runnable runnable, Throwable th) throws Throwable {
        if (runnable != null) {
            runnable.run();
        }
        this.log.reportException(LOG_TAG, "failed to get mapping", th);
    }

    public void lambda$runStartConversation$17(sg4 sg4Var, ConversationParams conversationParams, sg4 sg4Var2, ConversationStart.Result result) throws Throwable {
        String str;
        CallInfo callInfo = result.getCallInfo();
        this.callInfo = callInfo;
        boolean z = true;
        this.wantsApiHangup = true;
        if (!callInfo.isConcurrent && ((str = callInfo.id) == null || str.equals(((qs4) this.cidProvider).b))) {
            z = false;
        }
        this.isConcurrentByApi = z;
        this.forceRelayPolicy |= callInfo.isP2PForbidden;
        String str2 = callInfo.id;
        if (str2 != null) {
            lml.c(this.cidProvider, str2);
        }
        String str3 = callInfo.endpoint;
        String str4 = callInfo.wtEndpoint;
        if (str3 == null && (!isWebTransportEnabled() || str4 == null)) {
            sg4Var.accept(wrapInternalError(new IllegalStateException("couldn't create call endpoint is null")));
            return;
        }
        List<String> list = callInfo.wsIps;
        List<String> list2 = callInfo.wtIps;
        if (conversationParams == null) {
            conversationParams = callInfo.toParams();
        }
        performConnect(str3, list, str4, list2, conversationParams, sg4Var2, sg4Var);
        this.call.z = callInfo.joinLink;
    }

    public void lambda$setCallOptionEnabled$24(boolean z, m91 m91Var, sg4 sg4Var, JSONObject jSONObject) throws JSONException {
        o91 o91Var = this.call;
        if (z) {
            o91Var.t.add(m91Var);
            o91Var.c(m91Var);
        } else {
            o91Var.t.remove(m91Var);
            o91Var.c(m91Var);
        }
        if (sg4Var != null) {
            sg4Var.accept(null);
        }
    }

    public static /* synthetic */ void lambda$setCallOptionEnabled$25(sg4 sg4Var, JSONObject jSONObject) throws JSONException {
        if (sg4Var != null) {
            sg4Var.accept(jSONObject.optString("error"));
        }
    }

    public static void lambda$setMuteState$41(q4g q4gVar, boolean z, yt1 yt1Var) {
        try {
            q4gVar.k(kql.b(new JSONObject().put("eId", yt1Var.b()).put("muteTarget", z), "switch-micro"));
        } catch (JSONException e) {
            qr7.o(e);
        }
    }

    public /* synthetic */ Map lambda$withInternalId$35(ParticipantId participantId, MappingContext mappingContext) {
        return this.internalIdsMapper.map(Collections.singleton(participantId), mappingContext);
    }

    public static /* synthetic */ void lambda$withInternalId$36(ParticipantId participantId, sg4 sg4Var, Map map) {
        yt1 yt1Var = (yt1) map.get(participantId);
        if (yt1Var != null) {
            sg4Var.accept(yt1Var);
        }
    }

    public /* synthetic */ Map lambda$withInternalIds$37(ArrayList arrayList, MappingContext mappingContext) {
        return this.internalIdsMapper.map(arrayList, mappingContext);
    }

    public static /* synthetic */ void lambda$withInternalIds$38(sg4 sg4Var, ArrayList arrayList, Map map) {
        if (sg4Var != null) {
            arrayList.addAll(map.values());
            sg4Var.accept(arrayList);
        }
    }

    public /* synthetic */ void lambda$wrapExternalErrorConsumer$19(sg4 sg4Var, Throwable th) {
        Throwable cause;
        CallTerminatingException callTerminatingExceptionWrapInternalError;
        if (th instanceof CallTerminatingException) {
            callTerminatingExceptionWrapInternalError = (CallTerminatingException) th;
            cause = callTerminatingExceptionWrapInternalError.getCause();
            if (cause == null) {
                cause = new IllegalStateException(callTerminatingExceptionWrapInternalError.asString());
            }
        } else {
            cause = th;
            callTerminatingExceptionWrapInternalError = this.call.e1.p() == ConversationEndReason.Unknown.INSTANCE ? wrapInternalError(th) : null;
        }
        handleCallFinished(callTerminatingExceptionWrapInternalError);
        sg4Var.accept(cause);
    }

    public void onSignalingRefresh() {
        p4g p4gVar;
        ConversationParams conversationParams;
        if (this.call.u || (p4gVar = this.signalingTransport) == null || (conversationParams = this.conversationParams) == null) {
            return;
        }
        p4gVar.restart(conversationParams.token, Long.valueOf(this.f1me.getInternalId().a));
    }

    private void performConfroomJoin(ConversationParams conversationParams, sg4 sg4Var, sg4 sg4Var2) {
        w74 w74Var = this.disposable;
        v7g v7gVarJoinToConversation = this.apiService.joinToConversation(((qs4) this.cidProvider).b, this.peerIdGenerator.generatePeerId(), this.startCallApiParams);
        z2f z2fVarA = th.a();
        v7gVarJoinToConversation.getClass();
        w74Var.a(new q8g(v7gVarJoinToConversation, z2fVarA, 0).g(new x(this, conversationParams, sg4Var, sg4Var2), new j(this, sg4Var2, 3)));
    }

    private void performConnect(String str, List<String> list, String str2, List<String> list2, ConversationParams conversationParams, sg4 sg4Var, sg4 sg4Var2) {
        String str3;
        String str4;
        String str5;
        int i;
        if (this.experiments.i()) {
            str3 = "";
            str4 = "";
        } else {
            str3 = str;
            str4 = str2;
        }
        this.timings.getClass();
        synchronized (this.stateTransitionLock) {
            try {
                if (isDestroyed()) {
                    return;
                }
                if (conversationParams == null) {
                    IllegalStateException illegalStateException = new IllegalStateException("No conversation parameters in performConnect()");
                    this.log.reportException(LOG_TAG, "An attempt to connect without conversation parameters", illegalStateException);
                    sg4Var2.accept(wrapInternalError(illegalStateException));
                    return;
                }
                if (this.startCallApiParams.getIsMultipleDevicesEnabled()) {
                    this.f1me.setDeviceIndex(conversationParams.deviceIndex, this.localIdMappings);
                    this.store.updateMe(this.f1me);
                }
                this.conversationParams = conversationParams;
                AtomicReference<Conversation.State> atomicReference = this.state;
                Conversation.State state = Conversation.State.Preparing;
                Conversation.State state2 = Conversation.State.Starting;
                while (!atomicReference.compareAndSet(state, state2)) {
                    String str6 = str4;
                    if (atomicReference.get() != state) {
                        IllegalStateException illegalStateException2 = new IllegalStateException("Wrong state within performConnect(): " + this.state.get() + " expected state is " + Conversation.State.Preparing);
                        this.log.reportException(LOG_TAG, "An attempt to connect while conversation not in preparing state", illegalStateException2);
                        sg4Var2.accept(illegalStateException2);
                        return;
                    }
                    str4 = str6;
                }
                this.conversationStats.startedStat.onConversationStarted();
                du1 callParticipant = this.f1me.getCallParticipant();
                callParticipant.a = this.f1me.getInternalId();
                if (this.isCaller || this.expectedChat) {
                    callParticipant.f(du1.u);
                }
                ConversationParticipant conversationParticipant = this.initialOpponent;
                if (conversationParticipant != null && conversationParticipant.getInternalId() != null) {
                    this.call.N(this.initialOpponent.getInternalId());
                }
                if (this.isConcurrentByApi) {
                    this.call.K = true;
                }
                this.listenerProxy.unlock();
                this.call.K(this.listener);
                subscribeCallListeners();
                setupSessionRoomWatchTogetherHandler(this.call);
                setupSessionRoomHandHandler(this.call);
                this.call.X = new a(2, this);
                pe3 pe3Var = null;
                String strValueOf = this.f1me.getInternalId() != null ? String.valueOf(this.f1me.getInternalId().a) : null;
                g gVar = new g(1, this);
                final boolean zA = this.experiments.a();
                if (zA) {
                    str5 = conversationParams.token + "_";
                } else {
                    str5 = conversationParams.token;
                }
                m96 m96Var = new m96();
                m96Var.a = ((qs4) this.cidProvider).b;
                m96Var.b = str5;
                m96Var.c = strValueOf;
                m96Var.d = conversationParams.deviceIndex;
                m96Var.g = this.version;
                m96Var.h = null;
                m96Var.i = conversationParams.clientType;
                m96Var.k = this.clientCapabilities.getHexValueString();
                m96Var.l = conversationParams.ispAsNo;
                m96Var.m = conversationParams.ispAsOrg;
                m96Var.n = conversationParams.locCc;
                m96Var.o = conversationParams.locReg;
                m96Var.p = this.locale;
                m96Var.j = this.startCallApiParams.getIsMultipleDevicesEnabled() ? 6 : 5;
                try {
                    if (this.experiments.l()) {
                        PeerIdGenerator peerIdGenerator = this.peerIdGenerator;
                        Objects.requireNonNull(peerIdGenerator);
                        pe3Var = new pe3(19, peerIdGenerator);
                    }
                    pe3 pe3Var2 = pe3Var;
                    if (isWebTransportEnabled()) {
                        this.log.log(LOG_TAG, "WebTransport is enabled and available, use fallback aware signaling transport adapter");
                        xt1 xt1Var = this.callParams;
                        ExecutorService executorService = this.executorService;
                        ConversationStats conversationStats = this.conversationStats;
                        af7 af7Var = new af7() { // from class: ru.ok.android.externcalls.sdk.i
                            @Override // defpackage.af7
                            public final Object invoke() {
                                return this.a.lambda$performConnect$21(zA);
                            }
                        };
                        esh eshVar = this.timeProvider;
                        v88 v88Var = xt1Var.r;
                        i = 0;
                        this.signalingTransport = new yfj(new j22(27, new SignalingTransportBuilder(m96Var, str4, list2, str3, list, xt1Var, gVar, executorService, conversationStats, af7Var, eshVar, v88Var.q, this.logConfiguration, pe3Var2, v88Var.Y, this.sslProvider, this.log)));
                    } else {
                        i = 0;
                        m96Var.e = str3;
                        m96Var.f = list;
                        n96 n96VarA = m96Var.a();
                        WSSignaling.Builder builder = new WSSignaling.Builder();
                        wt1 wt1Var = this.callParams.b;
                        b6g logConfiguration = builder.setTimeoutMS(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).setConnectFailureListener((m4g) gVar).setSignalingStat((r5g) this.conversationStats.wsSignalingStat).setExecutor(this.executorService).setLog(this.log).setTimeProvider(this.timeProvider).setLogConfiguration(this.logConfiguration);
                        wt1 wt1Var2 = this.callParams.b;
                        this.signalingTransport = logConfiguration.setServerPingTimeoutMs(20000L).setFastRecoverEnabled(this.callParams.k).setEndpointParameters(n96VarA).setIsReplaceParametersInEndpointEnabled(this.experiments.d() || zA || this.conversationStart.isFastStartEnabled()).setIsSummaryStatsEnabled(this.callParams.r.t).setIsSignalingLogThrottlingEnabled(this.callParams.r.u).setUseOfIPEnabled(this.callParams.r.H).setSNIEnabled(this.callParams.r.I).setPeerIdGenerator((af7) pe3Var2).setSSLProvider(this.sslProvider).setTimeouts(this.callParams.r.Y).build();
                    }
                    j jVar = new j(this, sg4Var, i);
                    this.call.V = new n91() { // from class: ru.ok.android.externcalls.sdk.ConversationImpl.4
                        public AnonymousClass4() {
                        }

                        @Override // defpackage.n91
                        public void onIceCandidateAddFailed(n38 n38Var) {
                            ConversationImpl.this.conversationStats.uceCandidateAddFailedStat.report(n38Var);
                        }

                        @Override // defpackage.n91
                        public void onIceCandidateGatheringFailed(o38 o38Var) {
                            ConversationImpl.this.conversationStats.iceCandidateGatheringFailedStat.report(o38Var);
                        }

                        @Override // defpackage.n91
                        public void onIceRestart() {
                            ConversationImpl.this.conversationStats.iceRestartStat.onIceRestart();
                        }

                        @Override // defpackage.n91
                        public void onLocalCandidateCreated(String str7) {
                            ConversationImpl.this.conversationStats.webrtcStats.onIceCandidateGenerated(str7);
                        }

                        @Override // defpackage.n91
                        public void onLocalSdpCreated(SessionDescription.Type type) {
                            if (type == SessionDescription.Type.OFFER) {
                                ConversationImpl.this.conversationStats.webrtcStats.onOfferGenerated();
                            } else if (type == SessionDescription.Type.ANSWER || type == SessionDescription.Type.PRANSWER) {
                                ConversationImpl.this.conversationStats.webrtcStats.onAnswerGenerated();
                            }
                        }

                        @Override // defpackage.n91
                        public void onNegotiationError(xbb xbbVar) {
                            ConversationImpl.this.conversationStats.negotiationErrorStat.onError(xbbVar);
                        }

                        @Override // defpackage.n91
                        public void onPeerConnectionIceGatheringStateChanged(PeerConnection.IceGatheringState iceGatheringState) {
                            ConversationImpl.this.conversationStats.webrtcStats.onGatheringStateChanged(iceGatheringState);
                        }

                        @Override // defpackage.n91
                        public void onPeerConnectionSignalingStateChanged(PeerConnection.SignalingState signalingState) {
                            ConversationImpl.this.conversationStats.webrtcStats.onSignalingStateChanged(signalingState);
                        }

                        @Override // defpackage.n91
                        public void onPeerConnectionStateChanged(PeerConnection.PeerConnectionState peerConnectionState, j42 j42Var) {
                            ConversationImpl.this.conversationStats.peerConnectionStateChangedStat.onStateChanged(peerConnectionState, j42Var);
                        }

                        @Override // defpackage.n91
                        public void onRemoteCandidateReceived(String str7) {
                            ConversationImpl.this.conversationStats.webrtcStats.onIceCandidateReceived(str7);
                        }

                        @Override // defpackage.n91
                        public void onRemoteSdpReceived(SessionDescription.Type type) {
                            if (type == SessionDescription.Type.OFFER) {
                                ConversationImpl.this.conversationStats.webrtcStats.onOfferReceived();
                            } else if (type == SessionDescription.Type.ANSWER || type == SessionDescription.Type.PRANSWER) {
                                ConversationImpl.this.conversationStats.webrtcStats.onAnswerReceived();
                            }
                        }

                        @Override // defpackage.n91
                        public void onSelectedCandidatePairChanged(CandidatePairChangeEvent candidatePairChangeEvent) {
                            ConversationImpl.this.conversationStats.iceCandidatePairChangedStat.onSelectedCandidatePairChanged(candidatePairChangeEvent);
                        }
                    };
                    this.call.w(this.signalingTransport, chooseIceServersResolver().f(conversationParams.stunTurnServers));
                    this.waitingRoomParticipants.setCall(this.call);
                    this.wantsApiHangup = true;
                    this.prepared = true;
                    this.state.set(Conversation.State.Connecting);
                    o91 o91Var = this.call;
                    o91Var.getClass();
                    uza.d();
                    if (o91Var.q) {
                        jVar.a(o91Var);
                    } else {
                        o91Var.T = jVar;
                    }
                } catch (Throwable th) {
                    this.log.logException(LOG_TAG, "Can't connect conversation", th);
                    sg4Var2.accept(new CallTerminatingException.Builder(Domain.SERVER, th).build());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private ko5 refreshParams(Runnable runnable, sg4 sg4Var) {
        v7g conversationParams = this.apiService.getConversationParams(this.anonToken, false, null);
        z2f z2fVarA = th.a();
        conversationParams.getClass();
        return new q8g(conversationParams, z2fVarA, 0).g(new s(this, runnable, 0), new g(4, sg4Var));
    }

    private void registerParticipantsUpdaterListeners() {
        xq1 xq1Var = this.call.Q0;
        ParticipantsUpdater participantsUpdater = this.participantsUpdater;
        xq1Var.getClass();
        participantsUpdater.getClass();
        bnc bncVar = xq1Var.c;
        bncVar.getClass();
        ((CopyOnWriteArraySet) bncVar.b).add(participantsUpdater);
        xq1 xq1Var2 = this.call.Q0;
        ParticipantsUpdater participantsUpdater2 = this.participantsUpdater;
        xq1Var2.getClass();
        participantsUpdater2.getClass();
        k9 k9Var = xq1Var2.a;
        k9Var.getClass();
        k9Var.a.add(participantsUpdater2);
        this.call.Q0.a(this.participantsUpdater);
    }

    private void reportCallFinished(CallTerminatingException callTerminatingException) {
        ConversationEndReason error = callTerminatingException != null ? new ConversationEndReason.Error(callTerminatingException) : this.call.e1.p();
        this.conversationStats.callFinish.onCallFinished(error, this.rateManager.getRateHints(), error.getDescription(), this.isCaller);
    }

    public void reportIfApplicable() {
        ArrayList arrayList = new ArrayList();
        for (ConversationParticipant conversationParticipant : this.store) {
            if (!conversationParticipant.isReported() && conversationParticipant.getExternalId() != null && this.listener.listener != null) {
                conversationParticipant.setReported(true);
                arrayList.add(conversationParticipant);
                this.store.addToActiveSessionRoom(conversationParticipant);
            }
        }
        if (this.listener.listener == null || arrayList.isEmpty()) {
            return;
        }
        this.listener.listener.onParticipantsAdded(arrayList);
    }

    public void resetSignaling() {
        this.store.clearMapping();
        this.apiModule.getOkApiHolder().l();
        this.disposable.a(refreshParams(new u(1, this), new rs4(0)));
    }

    public void resolveExternalsByInternalsIds(List<yt1> list, Runnable runnable, Runnable runnable2) {
        if (list.isEmpty()) {
            runnable.run();
            return;
        }
        h64 h64VarResolveIds = this.externalIdsResolver.resolveIds(list, new MappingContext(this.log, this.callParams.r.r));
        z2f z2fVarA = th.a();
        h64VarResolveIds.getClass();
        Objects.requireNonNull(runnable);
        o72 o72Var = new o72(new s(this, runnable2, 1), 0, new s63(13, runnable));
        try {
            h64VarResolveIds.a(new l64(o72Var, z2fVarA));
            this.disposable.a(o72Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            iwl.a(th);
            tre.s0(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public void resolveUnknownExternals() {
        resolveExternalsByInternalsIds(this.externalIdsResolver.collectExternalIdResolutionCandidates(), new u(0, this), null);
    }

    private void runStartConversation(ConversationParams conversationParams, boolean z, sg4 sg4Var, sg4 sg4Var2) {
        if (isDestroyed()) {
            return;
        }
        this.disposable.a(new q8g(this.conversationStart.execute(new ConversationStart.Params(conversationParams, z, this.initialOpponent, this.startCallApiParams)).j(i3f.b()), th.a(), 0).g(new x(this, sg4Var2, conversationParams, sg4Var), new j(this, sg4Var2, 2)));
    }

    private void setupSessionRoomHandHandler(o91 o91Var) {
        o91Var.Q0.a(this.sessionRoomParticipantStatesHandler);
        xq1 xq1Var = o91Var.Q0;
        SessionRoomParticipantStatesHandler sessionRoomParticipantStatesHandler = this.sessionRoomParticipantStatesHandler;
        xq1Var.getClass();
        sessionRoomParticipantStatesHandler.getClass();
        k9 k9Var = xq1Var.a;
        k9Var.getClass();
        k9Var.a.add(sessionRoomParticipantStatesHandler);
    }

    private void setupSessionRoomWatchTogetherHandler(o91 o91Var) {
        o91Var.Q0.a(this.sessionRoomWatchTogetherHandler);
    }

    private void subscribeCallListeners() {
        if (!this.experiments.e()) {
            registerParticipantsUpdaterListeners();
        }
        xq1 xq1Var = this.call.Q0;
        ListenerImpl listenerImpl = this.listener;
        xq1Var.getClass();
        listenerImpl.getClass();
        dv6 dv6Var = xq1Var.b;
        dv6Var.getClass();
        dv6Var.a.add(listenerImpl);
        xq1 xq1Var2 = this.call.Q0;
        ListenerImpl listenerImpl2 = this.listener;
        xq1Var2.getClass();
        listenerImpl2.getClass();
        jdb jdbVar = xq1Var2.e;
        jdbVar.getClass();
        jdbVar.a.add(listenerImpl2);
        this.call.Q0.a(this.sessionRoomManager);
        this.call.Q0.a(this.recordManager);
        this.call.Q0.a(this.asrListenerManager);
        xq1 xq1Var3 = this.call.Q0;
        RecordManagerImpl recordManagerImpl = this.recordManager;
        xq1Var3.getClass();
        recordManagerImpl.getClass();
        pde pdeVar = xq1Var3.i;
        pdeVar.getClass();
        pdeVar.a.add(recordManagerImpl);
        xq1 xq1Var4 = this.call.Q0;
        FeedbackListenerManagerImpl feedbackListenerManagerImpl = this.feedbackListenerManager;
        xq1Var4.getClass();
        feedbackListenerManagerImpl.getClass();
        yo6 yo6Var = xq1Var4.j;
        yo6Var.getClass();
        yo6Var.a.add(feedbackListenerManagerImpl);
        xq1 xq1Var5 = this.call.Q0;
        AsrListenerManagerImpl asrListenerManagerImpl = this.asrListenerManager;
        xq1Var5.getClass();
        asrListenerManagerImpl.getClass();
        px pxVar = xq1Var5.m;
        pxVar.getClass();
        pxVar.a.add(asrListenerManagerImpl);
        xq1 xq1Var6 = this.call.Q0;
        ListenerImpl listenerImpl3 = this.listener;
        xq1Var6.getClass();
        listenerImpl3.getClass();
        vmc vmcVar = xq1Var6.n;
        vmcVar.getClass();
        vmcVar.a.add(listenerImpl3);
        xq1 xq1Var7 = this.call.Q0;
        AsrOnlineManagerImpl asrOnlineManagerImpl = this.asrOnlineManager;
        xq1Var7.getClass();
        asrOnlineManagerImpl.getClass();
        qx qxVar = xq1Var7.o;
        qxVar.getClass();
        qxVar.a.add(asrOnlineManagerImpl);
        xq1 xq1Var8 = this.call.Q0;
        ContactCallManagerImpl contactCallManagerImpl = this.contactCallManager;
        xq1Var8.getClass();
        contactCallManagerImpl.getClass();
        ye1 ye1Var = xq1Var8.k;
        ye1Var.getClass();
        ye1Var.a.add(contactCallManagerImpl);
        xq1 xq1Var9 = this.call.Q0;
        ListenerImpl listenerImpl4 = this.listener;
        xq1Var9.getClass();
        listenerImpl4.getClass();
        y4e y4eVar = xq1Var9.p;
        y4eVar.getClass();
        y4eVar.a.add(listenerImpl4);
        xq1 xq1Var10 = this.call.Q0;
        ListenerImpl listenerImpl5 = this.listener;
        xq1Var10.getClass();
        listenerImpl5.getClass();
        ut1 ut1Var = xq1Var10.w;
        ut1Var.getClass();
        ut1Var.a.add(listenerImpl5);
        xq1 xq1Var11 = this.call.Q0;
        WaitingRoomParticipants waitingRoomParticipants = this.waitingRoomParticipants;
        xq1Var11.getClass();
        waitingRoomParticipants.getClass();
        ubj ubjVar = xq1Var11.d;
        ubjVar.getClass();
        ubjVar.a.add(waitingRoomParticipants);
        xq1 xq1Var12 = this.call.Q0;
        StereoRoomManagerImpl stereoRoomManagerImpl = this.stereoRoomManager;
        xq1Var12.getClass();
        stereoRoomManagerImpl.getClass();
        ubj ubjVar2 = xq1Var12.d;
        ubjVar2.getClass();
        ubjVar2.a.add(stereoRoomManagerImpl);
        xq1 xq1Var13 = this.call.Q0;
        UrlSharingListenerManagerImpl urlSharingListenerManagerImpl = this.urlSharingListenerManager;
        xq1Var13.getClass();
        urlSharingListenerManagerImpl.getClass();
        zki zkiVar = xq1Var13.q;
        zkiVar.getClass();
        zkiVar.a.add(urlSharingListenerManagerImpl);
        this.call.Q0.a(this.urlSharingListenerManager);
        xq1 xq1Var14 = this.call.Q0;
        ChatListenerManagerImpl chatListenerManagerImpl = this.chatListenerManager;
        xq1Var14.getClass();
        chatListenerManagerImpl.getClass();
        f13 f13Var = xq1Var14.r;
        f13Var.getClass();
        f13Var.a.add(chatListenerManagerImpl);
        xq1 xq1Var15 = this.call.Q0;
        MediaMuteListenerManagerImpl mediaMuteListenerManagerImpl = this.mediaMuteListenerManager;
        xq1Var15.getClass();
        mediaMuteListenerManagerImpl.getClass();
        zo7 zo7Var = xq1Var15.s;
        zo7Var.getClass();
        ((CopyOnWriteArraySet) zo7Var.b).add(mediaMuteListenerManagerImpl);
        xq1 xq1Var16 = this.call.Q0;
        MediaConnectionManagerImpl mediaConnectionManagerImpl = this.mediaConnectionManager;
        xq1Var16.getClass();
        mediaConnectionManagerImpl.getClass();
        pkg pkgVar = xq1Var16.t;
        pkgVar.getClass();
        pkgVar.a.add(mediaConnectionManagerImpl);
        xq1 xq1Var17 = this.call.Q0;
        StatMonitor statMonitor = this.statMonitor;
        xq1Var17.getClass();
        statMonitor.getClass();
        zve zveVar = xq1Var17.u;
        zveVar.getClass();
        zveVar.a.add(statMonitor);
        xq1 xq1Var18 = this.call.Q0;
        fwh fwhVar = this.topologyUpgradeStatEventListener;
        xq1Var18.getClass();
        fwhVar.getClass();
        gwh gwhVar = xq1Var18.v;
        gwhVar.getClass();
        gwhVar.a.add(fwhVar);
        xq1 xq1Var19 = this.call.Q0;
        zj8 zj8Var = this.internalHoldStateListener;
        xq1Var19.getClass();
        zj8Var.getClass();
        ak8 ak8Var = xq1Var19.x;
        ak8Var.getClass();
        ak8Var.a.add(zj8Var);
    }

    public void updateTalkingParticipants() {
        o91 o91Var = this.call;
        ArrayList arrayList = new ArrayList();
        for (ConversationParticipant conversationParticipant : this.store.getParticipants()) {
            du1 callParticipant = conversationParticipant.getCallParticipant();
            boolean z = getAdjustedAudioLevel(conversationParticipant) > 0.0f;
            if (callParticipant != null && z) {
                arrayList.add(callParticipant.a);
            }
        }
        o91Var.j0.t(arrayList);
    }

    public void withInternalId(ParticipantId participantId, sg4 sg4Var, Runnable runnable) {
        yt1 byExternal = this.idMappingWrapper.getByExternal(participantId);
        if (byExternal == null) {
            executeOnBg(new k(this, participantId, new MappingContext(this.log, this.callParams.r.r), 1), new l(participantId, sg4Var, 3), runnable);
            return;
        }
        try {
            sg4Var.accept(byExternal);
        } catch (Exception e) {
            if (runnable != null) {
                runnable.run();
            }
            this.log.reportException(LOG_TAG, "unable to use internal id", e);
        }
    }

    private void withInternalIds(Collection<ParticipantId> collection, sg4 sg4Var) {
        ArrayList arrayList = new ArrayList(collection.size());
        ArrayList arrayList2 = new ArrayList(collection.size());
        for (ParticipantId participantId : collection) {
            yt1 byExternal = this.idMappingWrapper.getByExternal(participantId);
            if (byExternal == null) {
                arrayList.add(participantId);
            } else {
                arrayList2.add(byExternal);
            }
        }
        if (!arrayList.isEmpty()) {
            executeOnBg(new k(this, arrayList, new MappingContext(this.log, this.callParams.r.r), 0), new l(sg4Var, 0, arrayList2), null);
        } else if (sg4Var != null) {
            try {
                sg4Var.accept(arrayList2);
            } catch (Exception e) {
                this.log.reportException(LOG_TAG, "unable to use internal id", e);
            }
        }
    }

    private sg4 wrapExternalErrorConsumer(sg4 sg4Var) {
        return new l(this, sg4Var, 2);
    }

    private CallTerminatingException wrapInternalError(Throwable th) {
        return new CallTerminatingException.Builder(Domain.INTERNAL, th).build();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void addEventsListener(ConversationEventsListener conversationEventsListener) {
        this.eventListener.add(conversationEventsListener);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Deprecated
    public void addParticipant(String str, final boolean z, final sg4 sg4Var) {
        w74 w74Var = this.disposable;
        v7g okIdByExternalId = this.apiService.getOkIdByExternalId(str);
        z2f z2fVarA = th.a();
        okIdByExternalId.getClass();
        w74Var.a(new q8g(okIdByExternalId, z2fVarA, 0).g(new rg4() { // from class: ru.ok.android.externcalls.sdk.w
            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(Object obj) throws Throwable {
                this.a.lambda$addParticipant$31(z, sg4Var, (GetOkIdByExternalId.Response) obj);
            }
        }, new g(2, this)));
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void addParticipantByLink(String str, Runnable runnable, sg4 sg4Var) {
        this.addParticipantsCommands.addParticipantByLink(str, runnable, sg4Var);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void addParticipants(Collection<ParticipantId> collection, Boolean bool, boolean z, cf7 cf7Var, cf7 cf7Var2) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (ParticipantId participantId : collection) {
            arrayList.add(new hi1(participantId.id, participantId.isAnon ? 3 : 2, participantId.deviceIndex));
        }
        this.addParticipantsCommands.addParticipantsExtIds(arrayList, bool, z, cf7Var, cf7Var2);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void changeMyState(Map<String, String> map, n4g n4gVar) {
        this.participantStatesManager.updateOwnState(map, n4gVar);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void connect() {
        assertInited();
        o91 o91Var = this.call;
        if (o91Var.q() && !o91Var.c1) {
            o91Var.c1 = true;
            o91Var.l();
            if (qpc.E() && o91Var.t0.e) {
                if (!o91Var.h0.c && o91Var.h0.a() && o91Var.h0.c) {
                    zzf zzfVar = o91Var.e0;
                    zzfVar.a.execute(new xzf(zzfVar, 2));
                } else if (qpc.E()) {
                    zzf zzfVar2 = o91Var.e0;
                    zzfVar2.a.execute(new xzf(zzfVar2, 2));
                }
                zzf zzfVar3 = o91Var.e0;
                zzfVar3.a.execute(new wzf(zzfVar3, false, 1));
            }
            o91Var.N.log("OKRTCCall", "createPeerConnectionIfReady");
            uza.d();
            if (o91Var.I) {
                o91Var.N.log("OKRTCCall", "   peerConnectionCreated");
            } else {
                if (o91Var.E == null) {
                    ore.k("No ice servers");
                    return;
                }
                o91Var.N.log("OKRTCCall", "createPeerConnectionIfReady impl");
                o91Var.I = true;
                o91Var.W = true;
                o91Var.d(o91Var.n0, 1);
                if (o91Var.h0.d) {
                    o91Var.n(oh1.g, null);
                }
            }
            o91Var.N.log("OKRTCCall", "apply local media settings once connection requested");
            if (!o91Var.o.g0) {
                szf szfVar = o91Var.f0;
                p8b p8bVar = szfVar.e;
                p8bVar.a.add(szfVar);
                szfVar.l(p8bVar);
            }
            o91Var.I();
        }
    }

    public RemoteSettings createRemoteSettings(RemoteSettings remoteSettings) {
        return remoteSettings != null ? remoteSettings : new RemoteSettingsImplV2(this.apiService, this.log, RemoteSettings.getKeys());
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public float getAdjustedAudioLevel(ConversationParticipant conversationParticipant) {
        eb0 audioLevel = getAudioLevel(conversationParticipant);
        if (audioLevel == null) {
            return 0.0f;
        }
        float f = audioLevel.b;
        if (conversationParticipant == this.f1me) {
            f *= 5.0f;
        }
        if (f < AUDIO_LEVEL_MIN) {
            return 0.0f;
        }
        if (f > AUDIO_LEVEL_CLAMP_MAX) {
            return 1.0f;
        }
        return f / 9000.0f;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ll getAnimojiControl() {
        return this.call.p1;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public AsrManager getAsrManager() {
        return this.asrManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public AsrOnlineManager getAsrOnlineManager() {
        return this.asrOnlineManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public eb0 getAudioLevel(ConversationParticipant conversationParticipant) {
        if (this.f1me == conversationParticipant) {
            return this.audioSampleEnergyCalculator.getProcessor();
        }
        o91 o91Var = this.call;
        p5a p5aVarC = o91Var.u ? null : o91Var.d0.c(conversationParticipant.getCallParticipant());
        if (p5aVarC == null) {
            return null;
        }
        return p5aVarC.a;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public int getAudioLevelFrequencyMs() {
        return this.audioLevelFrequencyMs;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public CallInfo getCallInfo() {
        return this.callInfo;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public Conversation.CallType getCallType() {
        if (this.isAnswer) {
            return Conversation.CallType.Incoming;
        }
        return this.isCaller ? Conversation.CallType.Outgoing : Conversation.CallType.Join;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public CameraManager getCameraManager() {
        return this.cameraManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public hh2 getCameraStatProvider() {
        kd2 kd2Var;
        sb9 sb9Var = this.call.f0.o;
        if (sb9Var == null || (kd2Var = sb9Var.r) == null) {
            return null;
        }
        return (gh2) ((eoc) kd2Var.c.b).b;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ChatManager getChatManager() {
        return this.chatManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ContactCallManager getContactCallManager() {
        return this.contactCallManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public String getConversationId() {
        return ((qs4) this.cidProvider).b;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public DebugManager getDebugManager() {
        return this.debugManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public String getDestroyReason() {
        return this.call.p;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public DisplayLayoutSender getDisplayLayoutSender() {
        return this.displayLayoutSender;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ConversationFeatureManager getFeatureManager() {
        return this.conversationFeatureManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public FeedbackManager getFeedbackManager() {
        return this.feedbackManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public String getJoinLink() {
        String str = this.call.z;
        if (str != null) {
            return str;
        }
        CallInfo callInfo = this.callInfo;
        return callInfo != null ? callInfo.joinLink : this.initialJoinLink;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ConversationParticipant getMe() {
        return this.f1me;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public MediaConnectionManager getMediaConnectionManager() {
        return this.mediaConnectionManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public MediaMuteManager getMediaMuteManager() {
        return this.mediaMuteManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public MicrophoneManager getMicrophoneManager() {
        return this.microphoneManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public NetworkConnectionManager getNetworkConnectionManager() {
        return this.networkConnectionManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public NoiseSuppressionManager getNoiseSuppressionManager() {
        return this.noiseSuppressionManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ConversationParticipant getOpponent() {
        for (ConversationParticipant conversationParticipant : this.store) {
            if (conversationParticipant != this.f1me) {
                return conversationParticipant;
            }
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public p5a getParticipantMediaStat(ConversationParticipant conversationParticipant) {
        o91 o91Var = this.call;
        du1 callParticipant = conversationParticipant.getCallParticipant();
        if (o91Var.u) {
            return null;
        }
        return o91Var.d0.c(callParticipant);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ParticipantStatesManager getParticipantStatesManager() {
        return this.participantStatesManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ParticipantCollection getParticipants() {
        return this.store;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ConversationParticipant getPinnedParticipant() {
        yt1 yt1Var;
        o91 o91Var = this.call;
        dnf dnfVar = o91Var.j0.k;
        if (dnfVar instanceof cnf) {
            xmf xmfVarR = o91Var.R0.r((cnf) dnfVar);
            yt1Var = xmfVarR == null ? null : xmfVarR.f;
        } else {
            yt1Var = o91Var.C0;
        }
        if (yt1Var != null) {
            return this.store.getByInternal(yt1Var);
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public RateManager getRateManager() {
        return this.rateManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public RecordManager getRecordManager() {
        return this.recordManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public it7 getRejectReason() {
        return this.call.J;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public ScreenCaptureManager getScreenCaptureManager() {
        return this.screenCaptureManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public SessionRoomsManager getSessionRoomManager() {
        return this.sessionRoomManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public Conversation.State getState() {
        return this.state.get();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public StereoRoomManager getStereoRoomManager() {
        return this.stereoRoomManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public o91 getUnderlyingCall() {
        return this.debugManager.getUnderlyingCall();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public UrlSharingManager getUrlSharingManager() {
        return this.urlSharingManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public VideoRenderManager getVideoRenderManager() {
        return this.videoRenderManager;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public WatchTogetherPlayer getWatchTogetherPlayer() {
        return this.watchTogetherPlayer;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void hangup(ht7 ht7Var) {
        o91 o91Var = this.call;
        o91Var.getClass();
        it7 it7Var = it7.e;
        it7 it7Var2 = ht7Var.a;
        if (it7Var2 != null) {
            it7Var = it7Var2;
        } else if (o91Var.v) {
            if (!o91Var.x() && o91Var.h.a) {
                it7Var = it7.f;
            }
        } else if (!o91Var.x()) {
            it7Var = it7.c;
        }
        o91Var.e(it7Var);
        this.wasHungUp = true;
        handleCallFinished(this.call.h1);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean hasRegisteredParticipnats() {
        for (du1 du1Var : this.call.j0.j()) {
            if (du1Var.k != null || !du1Var.f.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void init() {
        this.log.log(LOG_TAG, "init called");
        synchronized (this.stateTransitionLock) {
            try {
                if (isDestroyed()) {
                    this.log.log(LOG_TAG, "attempted to continue init after release, ignoring");
                    return;
                }
                assertPrepared();
                ConversationParticipant conversationParticipant = this.initialOpponent;
                if (conversationParticipant != null && conversationParticipant.getInternalId() != null) {
                    ConversationParticipant conversationParticipant2 = this.initialOpponent;
                    o91 o91Var = this.call;
                    conversationParticipant2.setCallParticipant(o91Var.j0.l(conversationParticipant2.getInternalId()), this.localIdMappings);
                }
                o91 o91Var2 = this.call;
                pg5 pg5Var = this.videoRendererProvider;
                if (o91Var2.q()) {
                    o91Var2.q0 = pg5Var;
                    if (pg5Var == null) {
                        o91Var2.n0.p();
                    }
                }
                this.inited = true;
                this.call.H();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void initAsConfJoin() {
        this.expectedChat = true;
    }

    public void initStore(Collection<ParticipantId> collection) {
        boolean z = collection.size() > 1;
        Iterator<ParticipantId> it = collection.iterator();
        while (it.hasNext()) {
            ConversationParticipant conversationParticipantFromExternal = ConversationParticipant.fromExternal(it.next(), this.idMappingWrapper);
            this.store.addToActiveSessionRoom(conversationParticipantFromExternal);
            if (!z) {
                this.initialOpponent = conversationParticipantFromExternal;
                conversationParticipantFromExternal.setReported(true);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isAdminHere() {
        o91 o91Var = this.call;
        return o91Var.t.contains(m91.h);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isAnonJoinForbidden() {
        o91 o91Var = this.call;
        return o91Var.t.contains(m91.a);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isAnswered() {
        return this.call.x();
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isCaller() {
        return this.isCaller;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isConcurrent() {
        return this.isConcurrent;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Deprecated
    public boolean isConditionAccepted() {
        return this.call.M.b;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isConnected() {
        return this.call.D;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isDestroyed() {
        return this.state.get() == Conversation.State.Finished;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isFeatureAddParticipantEnabled() {
        return this.call.s0;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isFeedbackEnabled() {
        o91 o91Var = this.call;
        return o91Var.t.contains(m91.d);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isGroupCall() {
        return this.call.j0.u() > 1;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isHeldByMe() {
        return getState().equals(Conversation.State.HeldByMe);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isInited() {
        return this.inited;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isInitialVideoEnabled() {
        return this.call.y;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isMeCreatorOrAdmin() {
        return o91.y(this.call.j0.a);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isMeInWaitingRoom() {
        return this.call.E0;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isMuteParticipantsPermitted() {
        return this.call.a;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Deprecated
    public boolean isParticipantAdmin(String str) {
        du1 callParticipant;
        ConversationParticipant participantByExternalId = getParticipantByExternalId(str);
        if (participantByExternalId != null && (callParticipant = participantByExternalId.getCallParticipant()) != null) {
            this.call.getClass();
            Iterator it = callParticipant.e.iterator();
            while (it.hasNext()) {
                if (((bu1) it.next()) == bu1.b) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    @Deprecated
    public boolean isParticipantCreator(String str) {
        du1 callParticipant;
        ConversationParticipant participantByExternalId = getParticipantByExternalId(str);
        if (participantByExternalId != null && (callParticipant = participantByExternalId.getCallParticipant()) != null) {
            this.call.getClass();
            Iterator it = callParticipant.e.iterator();
            while (it.hasNext()) {
                if (((bu1) it.next()) == bu1.a) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isParticipantCreatorOrAdmin(String str) {
        du1 callParticipant;
        ConversationParticipant participantByExternalId = getParticipantByExternalId(str);
        if (participantByExternalId == null || (callParticipant = participantByExternalId.getCallParticipant()) == null) {
            return false;
        }
        this.call.getClass();
        return o91.y(callParticipant);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isPermissionsGranted() {
        lb9 lb9Var = this.call.h0;
        if (lb9Var.d || lb9Var.c) {
            return true;
        }
        if (lb9Var.a()) {
            return lb9Var.d || lb9Var.c;
        }
        return false;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isPrepared() {
        return this.prepared;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isRecurring() {
        o91 o91Var = this.call;
        return o91Var.t.contains(m91.c);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isVideoPermissionGranted() {
        o91 o91Var = this.call;
        if (o91Var.h0.d) {
            return true;
        }
        return o91Var.h0.a() && o91Var.h0.d;
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isWaitForAdminEnabled() {
        o91 o91Var = this.call;
        return o91Var.t.contains(m91.g);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public boolean isWaitingRoomEnabled() {
        o91 o91Var = this.call;
        return o91Var.t.contains(m91.b);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void muteAll() {
        q4g q4gVar = this.call.k;
        if (q4gVar != null) {
            try {
                q4gVar.k(kql.b(new JSONObject().put("all", true).put("muteTarget", true), "switch-micro"));
            } catch (JSONException e) {
                qr7.o(e);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [v81] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void pinParticipant(ParticipantId participantId, final boolean z) {
        final yt1 yt1Var;
        du1 callParticipantByExternalId = getCallParticipantByExternalId(participantId);
        if (callParticipantByExternalId == null || (yt1Var = callParticipantByExternalId.a) == null) {
            return;
        }
        final o91 o91Var = this.call;
        final dnf dnfVar = o91Var.j0.k;
        o91Var.n0.M(yt1Var, dnfVar, z, new n4g() { // from class: v81
            @Override // defpackage.n4g
            public final void onResponse(JSONObject jSONObject) {
                o91 o91Var2 = o91Var;
                o91Var2.getClass();
                if (jSONObject.optString("error").isEmpty()) {
                    boolean z2 = z;
                    yt1 yt1Var2 = yt1Var;
                    yt1 yt1Var3 = z2 ? yt1Var2 : null;
                    dnf dnfVar2 = dnfVar;
                    if (dnfVar2 instanceof cnf) {
                        o91Var2.S0.c(!z2, yt1Var2, (cnf) dnfVar2);
                    } else {
                        o91Var2.C0 = yt1Var3;
                    }
                    o91Var2.n(oh1.z, yt1Var3);
                }
            }
        });
    }

    public void prepare(ConversationParams conversationParams, final boolean z, final sg4 sg4Var, sg4 sg4Var2) {
        boolean zIsFastStartEnabled = this.conversationStart.isFastStartEnabled();
        efd efdVar = efd.a;
        v7g v7gVarExecuteWithState = zIsFastStartEnabled ? executeWithState(Conversation.State.None, Conversation.State.Preparing, createFastStartPrepare(), efdVar) : executeWithState(Conversation.State.None, Conversation.State.Preparing, createSimplePrepare(conversationParams), efdVar);
        final sg4 sg4VarWrapExternalErrorConsumer = wrapExternalErrorConsumer(sg4Var2);
        z2f z2fVarA = th.a();
        v7gVarExecuteWithState.getClass();
        this.disposable.a(new q8g(v7gVarExecuteWithState, z2fVarA, 0).g(new rg4() { // from class: ru.ok.android.externcalls.sdk.o
            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(Object obj) throws Throwable {
                this.a.lambda$prepare$9(z, sg4VarWrapExternalErrorConsumer, sg4Var, (ffd) obj);
            }
        }, new j(this, sg4VarWrapExternalErrorConsumer, 1)));
    }

    public void prepareJoinByLink(final sg4 sg4Var, sg4 sg4Var2) {
        final sg4 sg4VarWrapExternalErrorConsumer = wrapExternalErrorConsumer(sg4Var2);
        if (this.initialJoinLink == null) {
            sg4VarWrapExternalErrorConsumer.accept(wrapInternalError(new NullPointerException("Initial join link MUST not be null during joining BY LINK")));
            return;
        }
        v7g v7gVarExecuteWithState = this.joinConversationDelegate != null ? executeWithState(Conversation.State.None, Conversation.State.Preparing, createFastJoinPrepare(), new il6(this.initialJoinLink, this.startCallApiParams)) : executeWithState(Conversation.State.None, Conversation.State.Preparing, createJoinPrepare(), new nq8(this.initialJoinLink, this.anonToken));
        w74 w74Var = this.disposable;
        z2f z2fVarA = th.a();
        v7gVarExecuteWithState.getClass();
        w74Var.a(new q8g(v7gVarExecuteWithState, z2fVarA, 0).g(new rg4() { // from class: ru.ok.android.externcalls.sdk.z
            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(Object obj) throws Throwable {
                this.a.lambda$prepareJoinByLink$11(sg4VarWrapExternalErrorConsumer, sg4Var, (ffd) obj);
            }
        }, new j(this, sg4VarWrapExternalErrorConsumer, 4)));
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void promoteParticipant(ParticipantId participantId, boolean z) {
        withInternalId(participantId, new h(this, z, 1));
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void queryChatHistory(Integer num, Integer num2, final Conversation.ChatHistoryCallback chatHistoryCallback) {
        q4g q4gVar = this.call.k;
        if (q4gVar != null) {
            try {
                vj7 vj7VarB = kql.b(null, "chat-history");
                JSONObject jSONObject = vj7VarB.a;
                jSONObject.put("offset", num.intValue());
                jSONObject.put("count", num2.intValue());
                q4gVar.j(vj7VarB, new n4g() { // from class: ru.ok.android.externcalls.sdk.m
                    @Override // defpackage.n4g
                    public final void onResponse(JSONObject jSONObject2) throws JSONException {
                        this.a.lambda$queryChatHistory$39(chatHistoryCallback, jSONObject2);
                    }
                });
            } catch (JSONException e) {
                qr7.o(e);
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void release() {
        SupportedCodecsStatistics.tryToReport(this.apiService, this.preferencesHelper, this.log);
        this.rateManager.logHints();
        this.disposable.d();
        this.waitingRoomParticipants.release();
        this.participantStatesManager.release();
        this.mediaConnectionManager.release();
        this.rateManager.release();
        this.remoteSettings.release();
        this.executionTimeInterceptor.release();
        this.mlFeaturesManager.dispose();
        P2pRelaySwitchTrigger p2pRelaySwitchTrigger = this.p2pRelaySwitchTrigger;
        if (p2pRelaySwitchTrigger != null) {
            p2pRelaySwitchTrigger.release();
        }
        this.conversationStats.release();
        synchronized (this.stateTransitionLock) {
            try {
                if (this.wantsApiHangup && this.wasHungUp) {
                    it7 it7Var = this.call.J;
                    if (it7Var == null) {
                        it7Var = it7.f;
                    }
                    this.creator.hangup(it7Var, ((qs4) this.cidProvider).b, this.anonToken);
                }
                this.call.K(null);
                o91 o91Var = this.call;
                o91Var.X = null;
                o91Var.F.remove(this.listener);
                o91 o91Var2 = this.call;
                AudioSampleEnergyCalculator audioSampleEnergyCalculator = this.audioSampleEnergyCalculator;
                zzf zzfVar = o91Var2.e0;
                zzfVar.a.execute(new yde(zzfVar, 19, audioSampleEnergyCalculator));
                o91 o91Var3 = this.call;
                yzf yzfVar = this.audioEventsListener;
                zzf zzfVar2 = o91Var3.e0;
                zzfVar2.a.execute(new yde(zzfVar2, 18, yzfVar));
                this.call.t("release", null);
                this.state.set(Conversation.State.Finished);
                this.listener.release();
                this.eventListener.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void removeEventsListener(ConversationEventsListener conversationEventsListener) {
        this.eventListener.remove(conversationEventsListener);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void removeParticipant(ParticipantId participantId, boolean z) {
        withInternalId(participantId, new h(this, z, 0));
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void requestHoldStateChange(boolean z, my7 my7Var) {
        if (isHeldByMe() == z) {
            my7Var.a(new ny7(new HoldException.SameStateRequested(zo5.s("The state is already ", z))));
            return;
        }
        if (!this.isHoldStateProcessingActive.compareAndSet(false, true)) {
            my7Var.a(new ny7(new HoldException.AlreadyProcessing("Hold state processing is in progress now")));
            return;
        }
        try {
            this.call.s(z, new p(this, z, my7Var), new l(this, 1, my7Var));
        } catch (Exception e) {
            this.isHoldStateProcessingActive.set(false);
            my7Var.a(new ny7(new HoldException.Unspecified(e)));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void sendData(ConversationParticipant conversationParticipant, JSONObject jSONObject) {
        yt1 yt1Var;
        if (this.call.u || conversationParticipant == null || (yt1Var = conversationParticipant.getCallParticipant().a) == null) {
            return;
        }
        this.call.k.k(kql.h(yt1Var, jSONObject));
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setAnonJoinForbidden(boolean z, sg4 sg4Var) {
        setCallOptionEnabled(m91.a, z, sg4Var);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setAudioCaptureEnabled(boolean z) {
        this.screenCaptureManager.setAudioCaptureEnabled(z);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setCallOptionEnabled(final m91 m91Var, final boolean z, final sg4 sg4Var) {
        q4g q4gVar = this.call.k;
        if (!isMeCreatorOrAdmin()) {
            if (sg4Var != null) {
                sg4Var.accept("user is not creator or admin");
            }
            this.log.log(LOG_TAG, "user is not creator or admin");
        } else if (q4gVar != null) {
            Set setSingleton = Collections.singleton(m91Var);
            q4gVar.d(z ? kql.f(setSingleton, null) : kql.f(null, setSingleton), false, new n4g() { // from class: ru.ok.android.externcalls.sdk.q
                @Override // defpackage.n4g
                public final void onResponse(JSONObject jSONObject) throws JSONException {
                    this.a.lambda$setCallOptionEnabled$24(z, m91Var, sg4Var, jSONObject);
                }
            }, new n(sg4Var, 2));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setFeedbackEnabled(boolean z, sg4 sg4Var) {
        setCallOptionEnabled(m91.d, z, sg4Var);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setMuteState(ParticipantId participantId, boolean z) {
        q4g q4gVar = this.call.k;
        if (q4gVar != null) {
            withInternalId(participantId, new h(q4gVar, z, 2));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setWaitingRoomEnabled(boolean z, sg4 sg4Var) {
        setCallOptionEnabled(m91.b, z, sg4Var);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void changeMyState(Map<String, String> map) {
        changeMyState(map, null);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setAnonJoinForbidden(boolean z) {
        setAnonJoinForbidden(z, null);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setFeedbackEnabled(boolean z) {
        setFeedbackEnabled(z, null);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void setWaitingRoomEnabled(boolean z) {
        setWaitingRoomEnabled(z, null);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void removeParticipant(ParticipantId participantId) {
        removeParticipant(participantId, false);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void grantRoles(ParticipantId participantId, boolean z, bu1... bu1VarArr) {
        yt1 yt1Var;
        du1 callParticipantByExternalId = getCallParticipantByExternalId(participantId);
        if (callParticipantByExternalId == null || (yt1Var = callParticipantByExternalId.a) == null) {
            return;
        }
        grantRoles(yt1Var, z, bu1VarArr, null, null);
    }

    @Override // ru.ok.android.externcalls.sdk.Conversation
    public void addParticipant(ParticipantId participantId, final Boolean bool, final boolean z, final sg4 sg4Var) {
        withInternalIds(Collections.singletonList(participantId), new sg4() { // from class: ru.ok.android.externcalls.sdk.f
            @Override // defpackage.sg4
            public final void accept(Object obj) {
                this.a.lambda$addParticipant$29(bool, z, sg4Var, (Collection) obj);
            }
        });
    }

    private void withInternalId(ParticipantId participantId, sg4 sg4Var) {
        withInternalId(participantId, sg4Var, null);
    }

    public void prepare(ConversationParams conversationParams, sg4 sg4Var, sg4 sg4Var2) {
        prepare(conversationParams, false, sg4Var, sg4Var2);
    }
}
