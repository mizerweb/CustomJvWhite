package ru.ok.android.externcalls.sdk.stat.webrtc;

import android.os.SystemClock;
import defpackage.af7;
import defpackage.cth;
import defpackage.dp9;
import defpackage.ep9;
import defpackage.esh;
import defpackage.fi1;
import defpackage.gi1;
import defpackage.gsh;
import defpackage.gtj;
import defpackage.htj;
import defpackage.itj;
import defpackage.iwl;
import defpackage.j95;
import defpackage.ko5;
import defpackage.kp9;
import defpackage.rg4;
import defpackage.s63;
import defpackage.th;
import defpackage.tza;
import defpackage.wm9;
import defpackage.y3e;
import defpackage.ylc;
import defpackage.z2f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.analytics.events.EventItemValue;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 F2\u00020\u0001:\u000bGHIJKLMNOPFB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u001b\u0010\"\u001a\u00020\u00112\n\u0010!\u001a\u00060 R\u00020\u0000H\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010$\u001a\u00020\u00112\n\u0010!\u001a\u00060 R\u00020\u0000H\u0002¢\u0006\u0004\b$\u0010#J\r\u0010%\u001a\u00020\u0011¢\u0006\u0004\b%\u0010\u001eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010'J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0014\u0010'J\u000f\u0010(\u001a\u00020\u0011H\u0007¢\u0006\u0004\b(\u0010\u001eJ\u000f\u0010)\u001a\u00020\u0011H\u0007¢\u0006\u0004\b)\u0010\u001eJ\u000f\u0010*\u001a\u00020\u0011H\u0007¢\u0006\u0004\b*\u0010\u001eJ\u000f\u0010+\u001a\u00020\u0011H\u0007¢\u0006\u0004\b+\u0010\u001eJ\u0017\u0010.\u001a\u00020\u00112\u0006\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00112\u0006\u0010-\u001a\u000200H\u0007¢\u0006\u0004\b1\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R\u001e\u00107\u001a\f\u0012\b\u0012\u00060 R\u00020\u0000068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010?R\u0016\u0010A\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010?R\u0016\u0010B\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010?R\u0014\u0010D\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006Q"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat;", "", "Litj;", "configProvider", "Ly3e;", "logger", "Lesh;", "timeProvider", "Lkotlin/Function0;", "Lfi1;", "getEventualStatSender", "<init>", "(Litj;Ly3e;Lesh;Laf7;)V", "", "ip", ConversationWebRTCStat.KEY_TRANSPORT, "type", "Lsbi;", "onIceCandidateGenerated", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "onIceCandidateReceived", "sdp", "Ltza;", "parseIceCandidateSdp", "(Ljava/lang/String;)Ltza;", "Lhtj;", "config", "maybeInitWebRTCStat", "(Lhtj;)V", "reset", "()V", "reportAll", "Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat$Event;", "event", "report", "(Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat$Event;)V", "send", "release", "candidateSdp", "(Ljava/lang/String;)V", "onOfferGenerated", "onOfferReceived", "onAnswerGenerated", "onAnswerReceived", "Lorg/webrtc/PeerConnection$SignalingState;", "state", "onSignalingStateChanged", "(Lorg/webrtc/PeerConnection$SignalingState;)V", "Lorg/webrtc/PeerConnection$IceGatheringState;", "onGatheringStateChanged", "(Lorg/webrtc/PeerConnection$IceGatheringState;)V", "Ly3e;", "Lesh;", "Laf7;", "", "eventsCache", "Ljava/util/List;", "", "Lgtj;", "logItems", "Ljava/util/Set;", "", "signalingStateChangedTs", "J", "gatheringStateChangedTs", "lastGatheringStartTs", "lastRemoteSDPRecvTs", "Lko5;", "getConfigDisposable", "Lko5;", "Companion", "Event", "CandidateGenerated", "CandidateReceived", "OfferReceived", "AnswerReceived", "OfferGenerated", "AnswerGenerated", "SignalingStateChanged", "GatheringStateChanged", "WebRTCStatException", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConversationWebRTCStat {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_TRANSPORT = "transport";

    @Deprecated
    public static final String LOG_TAG = "ConversationWebRTCStat";
    private final ko5 getConfigDisposable;
    private final af7 getEventualStatSender;
    private long lastGatheringStartTs;
    private volatile long lastRemoteSDPRecvTs;
    private final y3e logger;
    private final esh timeProvider;
    private final List<Event> eventsCache = new ArrayList();
    private final Set<gtj> logItems = new LinkedHashSet();
    private long signalingStateChangedTs = -1;
    private long gatheringStateChangedTs = -1;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat$AnswerGenerated;", "Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat$Event;", "Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat;", "<init>", "(Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat;)V", "Lgtj;", "getItemType", "()Lgtj;", "itemType", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class AnswerGenerated extends Event {
        public AnswerGenerated() {
            super(ConversationWebRTCStat.this, null, "sdp_generated", EventItemValue.LongValue.m70boximpl(EventItemValue.LongValue.m71constructorimpl(0L)), new EventItemsMap(new ylc(SdkMetricStatEvent.STRING_VALUE_KEY, EventItemValue.StringValue.m84boximpl(EventItemValue.StringValue.m85constructorimpl("answer")))), 1, null);
        }

        @Override // ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat.Event
        public gtj getItemType() {
            return gtj.SDP;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat$AnswerReceived;", "Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat$Event;", "Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat;", "<init>", "(Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat;)V", "Lgtj;", "getItemType", "()Lgtj;", "itemType", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class AnswerReceived extends Event {
        public AnswerReceived() {
            super(ConversationWebRTCStat.this, null, "sdp_received", EventItemValue.LongValue.m70boximpl(EventItemValue.LongValue.m71constructorimpl(0L)), new EventItemsMap(new ylc(SdkMetricStatEvent.STRING_VALUE_KEY, EventItemValue.StringValue.m84boximpl(EventItemValue.StringValue.m85constructorimpl("answer")))), 1, null);
        }

        @Override // ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat.Event
        public gtj getItemType() {
            return gtj.SDP;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat$CandidateGenerated;", "Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat$Event;", "Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat;", "", "timeSinceGatheringStarted", "", "localIp", ConversationWebRTCStat.KEY_TRANSPORT, "type", "<init>", "(Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lgtj;", "getItemType", "()Lgtj;", "itemType", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class CandidateGenerated extends Event {
        public CandidateGenerated(long j, String str, String str2, String str3) {
            super(ConversationWebRTCStat.this, null, "sdp_generated", EventItemValue.LongValue.m70boximpl(EventItemValue.LongValue.m71constructorimpl(j)), new EventItemsMap((Map<String, ? extends EventItemValue>) wm9.Q0(new ylc("local_address", EventItemValue.StringValue.m84boximpl(EventItemValue.StringValue.m85constructorimpl(str))), new ylc(ConversationWebRTCStat.KEY_TRANSPORT, EventItemValue.StringValue.m84boximpl(EventItemValue.StringValue.m85constructorimpl(str2))), new ylc(SdkMetricStatEvent.STRING_VALUE_KEY, EventItemValue.StringValue.m84boximpl(EventItemValue.StringValue.m85constructorimpl(str3))))), 1, null);
        }

        @Override // ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat.Event
        public gtj getItemType() {
            return gtj.CANDIDATE;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat$CandidateReceived;", "Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat$Event;", "Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat;", "", "timeSinceRemoteSdpReceived", "", "remoteIp", ConversationWebRTCStat.KEY_TRANSPORT, "type", "<init>", "(Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lgtj;", "getItemType", "()Lgtj;", "itemType", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class CandidateReceived extends Event {
        public CandidateReceived(long j, String str, String str2, String str3) {
            super(ConversationWebRTCStat.this, null, "sdp_received", EventItemValue.LongValue.m70boximpl(EventItemValue.LongValue.m71constructorimpl(j)), new EventItemsMap((Map<String, ? extends EventItemValue>) wm9.Q0(new ylc("remote_address", EventItemValue.StringValue.m84boximpl(EventItemValue.StringValue.m85constructorimpl(str))), new ylc(ConversationWebRTCStat.KEY_TRANSPORT, EventItemValue.StringValue.m84boximpl(EventItemValue.StringValue.m85constructorimpl(str2))), new ylc(SdkMetricStatEvent.STRING_VALUE_KEY, EventItemValue.StringValue.m84boximpl(EventItemValue.StringValue.m85constructorimpl(str3))))), 1, null);
        }

        @Override // ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat.Event
        public gtj getItemType() {
            return gtj.CANDIDATE;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat$GatheringStateChanged;", "Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat$Event;", "Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat;", "", "timeSinceLastChange", "", "state", "<init>", "(Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat;JLjava/lang/String;)V", "Lgtj;", "getItemType", "()Lgtj;", "itemType", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class GatheringStateChanged extends Event {
        public GatheringStateChanged(long j, String str) {
            super(ConversationWebRTCStat.this, null, "gathering_state_changed", EventItemValue.LongValue.m70boximpl(EventItemValue.LongValue.m71constructorimpl(j)), new EventItemsMap(new ylc(SdkMetricStatEvent.STRING_VALUE_KEY, EventItemValue.StringValue.m84boximpl(EventItemValue.StringValue.m85constructorimpl(str)))), 1, null);
        }

        @Override // ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat.Event
        public gtj getItemType() {
            return gtj.SIGNALING;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat$OfferGenerated;", "Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat$Event;", "Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat;", "<init>", "(Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat;)V", "Lgtj;", "getItemType", "()Lgtj;", "itemType", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class OfferGenerated extends Event {
        public OfferGenerated() {
            super(ConversationWebRTCStat.this, null, "sdp_generated", EventItemValue.LongValue.m70boximpl(EventItemValue.LongValue.m71constructorimpl(0L)), new EventItemsMap(new ylc(SdkMetricStatEvent.STRING_VALUE_KEY, EventItemValue.StringValue.m84boximpl(EventItemValue.StringValue.m85constructorimpl("offer")))), 1, null);
        }

        @Override // ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat.Event
        public gtj getItemType() {
            return gtj.SDP;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat$OfferReceived;", "Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat$Event;", "Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat;", "<init>", "(Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat;)V", "Lgtj;", "getItemType", "()Lgtj;", "itemType", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class OfferReceived extends Event {
        public OfferReceived() {
            super(ConversationWebRTCStat.this, null, "sdp_received", EventItemValue.LongValue.m70boximpl(EventItemValue.LongValue.m71constructorimpl(0L)), new EventItemsMap(new ylc(SdkMetricStatEvent.STRING_VALUE_KEY, EventItemValue.StringValue.m84boximpl(EventItemValue.StringValue.m85constructorimpl("offer")))), 1, null);
        }

        @Override // ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat.Event
        public gtj getItemType() {
            return gtj.SDP;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat$SignalingStateChanged;", "Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat$Event;", "Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat;", "", "timeSinceLastChange", "", "state", "<init>", "(Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat;JLjava/lang/String;)V", "Lgtj;", "getItemType", "()Lgtj;", "itemType", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class SignalingStateChanged extends Event {
        public SignalingStateChanged(long j, String str) {
            super(ConversationWebRTCStat.this, null, "signaling_state_changed", EventItemValue.LongValue.m70boximpl(EventItemValue.LongValue.m71constructorimpl(j)), new EventItemsMap(new ylc(SdkMetricStatEvent.STRING_VALUE_KEY, EventItemValue.StringValue.m84boximpl(EventItemValue.StringValue.m85constructorimpl(str)))), 1, null);
        }

        @Override // ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat.Event
        public gtj getItemType() {
            return gtj.SIGNALING;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat$WebRTCStatException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class WebRTCStatException extends RuntimeException {
        public WebRTCStatException(Throwable th) {
            super(th);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PeerConnection.SignalingState.values().length];
            try {
                iArr[PeerConnection.SignalingState.STABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PeerConnection.SignalingState.HAVE_LOCAL_OFFER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PeerConnection.SignalingState.HAVE_REMOTE_OFFER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PeerConnection.SignalingState.HAVE_LOCAL_PRANSWER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PeerConnection.SignalingState.HAVE_REMOTE_PRANSWER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PeerConnection.SignalingState.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PeerConnection.IceGatheringState.values().length];
            try {
                iArr2[PeerConnection.IceGatheringState.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[PeerConnection.IceGatheringState.GATHERING.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[PeerConnection.IceGatheringState.COMPLETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public ConversationWebRTCStat(itj itjVar, y3e y3eVar, esh eshVar, af7 af7Var) {
        this.logger = y3eVar;
        this.timeProvider = eshVar;
        this.getEventualStatSender = af7Var;
        dp9 config = itjVar.getConfig();
        z2f z2fVarA = th.a();
        config.getClass();
        ep9 ep9Var = new ep9(new rg4() { // from class: ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat$getConfigDisposable$1
            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(htj htjVar) {
                this.$tmp0.maybeInitWebRTCStat(htjVar);
            }
        }, new rg4() { // from class: ru.ok.android.externcalls.sdk.stat.webrtc.ConversationWebRTCStat$getConfigDisposable$2
            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(Throwable th) {
                this.this$0.logger.reportException(ConversationWebRTCStat.LOG_TAG, "Error getting p2p relay switch config", th);
            }
        }, new s63(14, this));
        try {
            config.a(new kp9(ep9Var, z2fVarA, 0));
            this.getConfigDisposable = ep9Var;
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            iwl.a(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public static final void getConfigDisposable$lambda$0(ConversationWebRTCStat conversationWebRTCStat) {
        conversationWebRTCStat.reset();
        conversationWebRTCStat.logger.log(LOG_TAG, "Remote config has not been provided, reset");
    }

    public final void maybeInitWebRTCStat(htj config) {
        if (this.logItems.isEmpty()) {
            this.logItems.addAll(config.a);
            if (!this.logItems.isEmpty()) {
                reportAll();
            } else {
                this.logItems.add(gtj.NONE);
                this.eventsCache.clear();
            }
        }
    }

    private final void onIceCandidateGenerated(String ip, String str, String type) {
        if (ip == null || str == null || type == null) {
            return;
        }
        ((gsh) this.timeProvider).getClass();
        report(new CandidateGenerated(SystemClock.elapsedRealtime() - this.lastGatheringStartTs, ip, str, type));
    }

    private final void onIceCandidateReceived(String ip, String str, String type) {
        if (ip == null || str == null || type == null) {
            return;
        }
        ((gsh) this.timeProvider).getClass();
        report(new CandidateReceived(SystemClock.elapsedRealtime() - this.lastRemoteSDPRecvTs, "", str, type));
    }

    private final tza parseIceCandidateSdp(String sdp) {
        try {
            tza tzaVarA = tza.a(sdp);
            if (tzaVarA == null) {
                this.logger.log(LOG_TAG, "Can't parse candidate " + sdp);
                return null;
            }
            if (tzaVarA.b != null) {
                return tzaVarA;
            }
            this.logger.log(LOG_TAG, "Can't get address from candidate " + sdp);
            return null;
        } catch (Throwable th) {
            this.logger.reportException(LOG_TAG, "Error on parse candidate sdp", new WebRTCStatException(th));
            return null;
        }
    }

    private final void report(Event event) {
        if (!this.logItems.isEmpty()) {
            send(event);
            return;
        }
        this.eventsCache.add(event);
        this.logger.log(LOG_TAG, "Event " + event + " cached because logging level is not yet known");
    }

    private final void reportAll() {
        Iterator<T> it = this.eventsCache.iterator();
        while (it.hasNext()) {
            send((Event) it.next());
        }
        this.eventsCache.clear();
    }

    private final void reset() {
        this.logItems.clear();
        this.logItems.add(gtj.NONE);
        this.eventsCache.clear();
    }

    private final void send(Event event) {
        if (!event.isSuitableForLoggingLevel(this.logItems)) {
            this.logger.log(LOG_TAG, "Event " + event + " is not suitable for logging level " + this.logItems);
            return;
        }
        fi1 fi1Var = (fi1) this.getEventualStatSender.invoke();
        if (fi1Var != null) {
            ((gi1) fi1Var).e(event.getTs(), event.getName(), event.getValue(), event.getAttributes());
        }
        this.logger.log(LOG_TAG, "Event " + event + " submitted");
    }

    public final void onAnswerGenerated() {
        report(new AnswerGenerated());
    }

    public final void onAnswerReceived() {
        ((gsh) this.timeProvider).getClass();
        this.lastRemoteSDPRecvTs = SystemClock.elapsedRealtime();
        report(new AnswerReceived());
    }

    public final void onGatheringStateChanged(PeerConnection.IceGatheringState state) {
        String str;
        ((gsh) this.timeProvider).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.gatheringStateChangedTs;
        long j2 = j == -1 ? 0L : jElapsedRealtime - j;
        int i = WhenMappings.$EnumSwitchMapping$1[state.ordinal()];
        if (i == 1) {
            str = "new";
        } else if (i == 2) {
            this.lastGatheringStartTs = jElapsedRealtime;
            str = "gathering";
        } else {
            if (i != 3) {
                this.logger.log(LOG_TAG, "Unexpected ice gathering state " + state);
                return;
            }
            str = "complete";
        }
        this.gatheringStateChangedTs = jElapsedRealtime;
        report(new GatheringStateChanged(j2, str));
    }

    public final void onOfferGenerated() {
        report(new OfferGenerated());
    }

    public final void onOfferReceived() {
        ((gsh) this.timeProvider).getClass();
        this.lastRemoteSDPRecvTs = SystemClock.elapsedRealtime();
        report(new OfferReceived());
    }

    public final void onSignalingStateChanged(PeerConnection.SignalingState state) {
        String str;
        ((gsh) this.timeProvider).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.signalingStateChangedTs;
        long j2 = j == -1 ? 0L : jElapsedRealtime - j;
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                str = "stable";
                break;
            case 2:
                str = "have.local.offer";
                break;
            case 3:
                str = "have.remote.offer";
                break;
            case 4:
                str = "have.local.answer";
                break;
            case 5:
                str = "have.remote.answer";
                break;
            case 6:
                str = "closed";
                break;
            default:
                this.logger.log(LOG_TAG, "Unexpected signaling state " + state);
                return;
        }
        this.signalingStateChangedTs = jElapsedRealtime;
        report(new SignalingStateChanged(j2, str));
    }

    public final void release() {
        this.getConfigDisposable.dispose();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat$Companion;", "", "<init>", "()V", "LOG_TAG", "", "KEY_TRANSPORT", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b¢\u0004\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\r8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat$Event;", "", "Lcth;", "ts", "", SdkMetricStatEvent.NAME_KEY, "Lru/ok/android/externcalls/analytics/events/EventItemValue;", SdkMetricStatEvent.VALUE_KEY, "Lru/ok/android/externcalls/analytics/events/EventItemsMap;", "attributes", "<init>", "(Lru/ok/android/externcalls/sdk/stat/webrtc/ConversationWebRTCStat;Lcth;Ljava/lang/String;Lru/ok/android/externcalls/analytics/events/EventItemValue;Lru/ok/android/externcalls/analytics/events/EventItemsMap;)V", "", "Lgtj;", "allowedTypes", "", "isSuitableForLoggingLevel", "(Ljava/util/Set;)Z", "toString", "()Ljava/lang/String;", "Lcth;", "getTs", "()Lcth;", "Ljava/lang/String;", "getName", "Lru/ok/android/externcalls/analytics/events/EventItemValue;", "getValue", "()Lru/ok/android/externcalls/analytics/events/EventItemValue;", "Lru/ok/android/externcalls/analytics/events/EventItemsMap;", "getAttributes", "()Lru/ok/android/externcalls/analytics/events/EventItemsMap;", "getItemType", "()Lgtj;", "itemType", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public abstract class Event {
        private final EventItemsMap attributes;
        private final String name;
        private final cth ts;
        private final EventItemValue value;

        public /* synthetic */ Event(ConversationWebRTCStat conversationWebRTCStat, cth cthVar, String str, EventItemValue eventItemValue, EventItemsMap eventItemsMap, int i, j95 j95Var) {
            this((i & 1) != 0 ? ((gsh) conversationWebRTCStat.timeProvider).c() : cthVar, str, eventItemValue, (i & 8) != 0 ? new EventItemsMap() : eventItemsMap);
        }

        public final EventItemsMap getAttributes() {
            return this.attributes;
        }

        public abstract gtj getItemType();

        public final String getName() {
            return this.name;
        }

        public final cth getTs() {
            return this.ts;
        }

        public final EventItemValue getValue() {
            return this.value;
        }

        public boolean isSuitableForLoggingLevel(Set<? extends gtj> allowedTypes) {
            return allowedTypes.contains(getItemType());
        }

        public String toString() {
            return this.name + ", value=" + this.value + ", " + this.attributes;
        }

        public Event(cth cthVar, String str, EventItemValue eventItemValue, EventItemsMap eventItemsMap) {
            this.ts = cthVar;
            this.name = str;
            this.value = eventItemValue;
            this.attributes = eventItemsMap;
        }
    }

    public final void onIceCandidateGenerated(String candidateSdp) {
        tza iceCandidateSdp = parseIceCandidateSdp(candidateSdp);
        if (iceCandidateSdp != null) {
            onIceCandidateGenerated(iceCandidateSdp.b, iceCandidateSdp.a, iceCandidateSdp.c);
        }
    }

    public final void onIceCandidateReceived(String candidateSdp) {
        tza iceCandidateSdp = parseIceCandidateSdp(candidateSdp);
        if (iceCandidateSdp != null) {
            onIceCandidateReceived(iceCandidateSdp.b, iceCandidateSdp.a, iceCandidateSdp.c);
        }
    }
}
