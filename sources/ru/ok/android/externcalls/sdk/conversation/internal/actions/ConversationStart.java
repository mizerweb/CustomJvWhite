package ru.ok.android.externcalls.sdk.conversation.internal.actions;

import defpackage.cqk;
import defpackage.hh6;
import defpackage.ik8;
import defpackage.j95;
import defpackage.nbh;
import defpackage.ore;
import defpackage.p64;
import defpackage.p8g;
import defpackage.ps4;
import defpackage.qs4;
import defpackage.sf7;
import defpackage.v7g;
import defpackage.vs4;
import defpackage.w83;
import defpackage.ww3;
import defpackage.y3e;
import defpackage.z5h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.webrtc.PeerConnection;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.CallInfo;
import ru.ok.android.externcalls.sdk.api.ConversationParams;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.api.delegate.StartConversationDelegate;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.conversation.internal.FastStartException;
import ru.ok.android.externcalls.sdk.exception.Domain;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003453BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\u001d2\u0010\u0010\u001c\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030(2\u0006\u0010'\u001a\u00020\u0002H\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010/R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00100R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00101R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00102¨\u00066"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/ConversationStart;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/Action;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/ConversationStart$Params;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/ConversationStart$Result;", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "okApiServiceInternal", "Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate;", "startConversationDelegate", "Lps4;", "conversationIdProvider", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "me", "Ly3e;", "logger", "Lik8;", "internalParamsProvider", "Lhh6;", "experiments", "<init>", "(Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate;Lps4;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/ConversationParticipant;Ly3e;Lik8;Lhh6;)V", "Lru/ok/android/externcalls/sdk/api/CallInfo;", "callInfo", "maybeEmulateError", "(Lru/ok/android/externcalls/sdk/api/CallInfo;)Lru/ok/android/externcalls/sdk/api/CallInfo;", "", "Lorg/webrtc/PeerConnection$IceServer;", "servers", "", "parseTurnServers", "(Ljava/util/List;)Ljava/lang/String;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "myId", "collectOpponentExternalIds", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/id/ParticipantId;)Ljava/util/List;", "", "isFastStartEnabled", "()Z", "params", "Lv7g;", "execute", "(Lru/ok/android/externcalls/sdk/conversation/internal/actions/ConversationStart$Params;)Lv7g;", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "Lru/ok/android/externcalls/sdk/api/delegate/StartConversationDelegate;", "Lps4;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "Ly3e;", "Lik8;", "Lhh6;", "Companion", "Params", "Result", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConversationStart implements Action<Params, Result> {
    private static final Companion Companion = new Companion(null);
    private static final String LOG_TAG = "ConversationStart";
    private final ps4 conversationIdProvider;
    private final hh6 experiments;
    private final ik8 internalParamsProvider;
    private final y3e logger;
    private final ConversationParticipant me;
    private final OkApiServiceInternal okApiServiceInternal;
    private final StartConversationDelegate startConversationDelegate;
    private final ParticipantStore store;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/ConversationStart$Params;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/ActionParams;", "providedParams", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "createLink", "", "opponent", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "startCallApiParams", "Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "<init>", "(Lru/ok/android/externcalls/sdk/api/ConversationParams;ZLru/ok/android/externcalls/sdk/ConversationParticipant;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)V", "getProvidedParams", "()Lru/ok/android/externcalls/sdk/api/ConversationParams;", "getCreateLink", "()Z", "getOpponent", "()Lru/ok/android/externcalls/sdk/ConversationParticipant;", "getStartCallApiParams", "()Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Params implements ActionParams {
        private final boolean createLink;
        private final ConversationParticipant opponent;
        private final ConversationParams providedParams;
        private final StartCallApiParams startCallApiParams;

        public Params(ConversationParams conversationParams, boolean z, ConversationParticipant conversationParticipant, StartCallApiParams startCallApiParams) {
            this.providedParams = conversationParams;
            this.createLink = z;
            this.opponent = conversationParticipant;
            this.startCallApiParams = startCallApiParams;
        }

        public static /* synthetic */ Params copy$default(Params params, ConversationParams conversationParams, boolean z, ConversationParticipant conversationParticipant, StartCallApiParams startCallApiParams, int i, Object obj) {
            if ((i & 1) != 0) {
                conversationParams = params.providedParams;
            }
            if ((i & 2) != 0) {
                z = params.createLink;
            }
            if ((i & 4) != 0) {
                conversationParticipant = params.opponent;
            }
            if ((i & 8) != 0) {
                startCallApiParams = params.startCallApiParams;
            }
            return params.copy(conversationParams, z, conversationParticipant, startCallApiParams);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final ConversationParams getProvidedParams() {
            return this.providedParams;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getCreateLink() {
            return this.createLink;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final ConversationParticipant getOpponent() {
            return this.opponent;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final StartCallApiParams getStartCallApiParams() {
            return this.startCallApiParams;
        }

        public final Params copy(ConversationParams providedParams, boolean createLink, ConversationParticipant opponent, StartCallApiParams startCallApiParams) {
            return new Params(providedParams, createLink, opponent, startCallApiParams);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return cqk.d(this.providedParams, params.providedParams) && this.createLink == params.createLink && cqk.d(this.opponent, params.opponent) && cqk.d(this.startCallApiParams, params.startCallApiParams);
        }

        public final boolean getCreateLink() {
            return this.createLink;
        }

        public final ConversationParticipant getOpponent() {
            return this.opponent;
        }

        public final ConversationParams getProvidedParams() {
            return this.providedParams;
        }

        public final StartCallApiParams getStartCallApiParams() {
            return this.startCallApiParams;
        }

        public int hashCode() {
            ConversationParams conversationParams = this.providedParams;
            int iN = nbh.n((conversationParams == null ? 0 : conversationParams.hashCode()) * 31, 31, this.createLink);
            ConversationParticipant conversationParticipant = this.opponent;
            return this.startCallApiParams.hashCode() + ((iN + (conversationParticipant != null ? conversationParticipant.hashCode() : 0)) * 31);
        }

        public String toString() {
            return "Params(providedParams=" + this.providedParams + ", createLink=" + this.createLink + ", opponent=" + this.opponent + ", startCallApiParams=" + this.startCallApiParams + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/ConversationStart$Result;", "Lru/ok/android/externcalls/sdk/conversation/internal/actions/ActionResult;", "callInfo", "Lru/ok/android/externcalls/sdk/api/CallInfo;", "<init>", "(Lru/ok/android/externcalls/sdk/api/CallInfo;)V", "getCallInfo", "()Lru/ok/android/externcalls/sdk/api/CallInfo;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Result implements ActionResult {
        private final CallInfo callInfo;

        public Result(CallInfo callInfo) {
            this.callInfo = callInfo;
        }

        public static /* synthetic */ Result copy$default(Result result, CallInfo callInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                callInfo = result.callInfo;
            }
            return result.copy(callInfo);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CallInfo getCallInfo() {
            return this.callInfo;
        }

        public final Result copy(CallInfo callInfo) {
            return new Result(callInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && cqk.d(this.callInfo, ((Result) other).callInfo);
        }

        public final CallInfo getCallInfo() {
            return this.callInfo;
        }

        public int hashCode() {
            return this.callInfo.hashCode();
        }

        public String toString() {
            return "Result(callInfo=" + this.callInfo + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Domain.values().length];
            try {
                iArr[Domain.NETWORK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Domain.SERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Domain.EXTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart$execute$2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass2<T, R> implements sf7 {
        public AnonymousClass2() {
        }

        @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
        /* JADX INFO: renamed from: apply */
        public final CallInfo mo41apply(StartConversationDelegate.Result result) throws FastStartException {
            if (result instanceof StartConversationDelegate.Result.Success) {
                return CallInfo.INSTANCE.createFromStartConversationDelegateResult$calls_sdk((StartConversationDelegate.Result.Success) result, ConversationStart.this.experiments.j());
            }
            if (result instanceof StartConversationDelegate.Result.Error) {
                StartConversationDelegate.Result.Error error = (StartConversationDelegate.Result.Error) result;
                throw new FastStartException(error.getErrorCode(), error.getThrowable());
            }
            ore.o();
            return null;
        }
    }

    public ConversationStart(OkApiServiceInternal okApiServiceInternal, StartConversationDelegate startConversationDelegate, ps4 ps4Var, ParticipantStore participantStore, ConversationParticipant conversationParticipant, y3e y3eVar, ik8 ik8Var, hh6 hh6Var) {
        this.okApiServiceInternal = okApiServiceInternal;
        this.startConversationDelegate = startConversationDelegate;
        this.conversationIdProvider = ps4Var;
        this.store = participantStore;
        this.me = conversationParticipant;
        this.logger = y3eVar;
        this.internalParamsProvider = ik8Var;
        this.experiments = hh6Var;
    }

    private final List<String> collectOpponentExternalIds(ParticipantStore store, ParticipantId myId) {
        ArrayList arrayList = new ArrayList();
        for (ConversationParticipant conversationParticipant : store) {
            if (conversationParticipant.getExternalId() != null && !cqk.d(conversationParticipant.getExternalId(), myId)) {
                arrayList.add(conversationParticipant.getExternalId().id);
            }
        }
        return arrayList;
    }

    public static final StartConversationDelegate.Result execute$lambda$0(ConversationStart conversationStart, StartConversationDelegate.Params params) {
        return conversationStart.startConversationDelegate.invoke(params);
    }

    public final CallInfo maybeEmulateError(CallInfo callInfo) {
        this.experiments.g();
        return callInfo;
    }

    private final String parseTurnServers(List<? extends PeerConnection.IceServer> servers) {
        if (servers == null) {
            return "";
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : servers) {
            PeerConnection.IceServer iceServer = (PeerConnection.IceServer) obj;
            if ((iceServer != null ? iceServer.hostname : null) != null && z5h.K0(iceServer.hostname, "turn", false)) {
                arrayList.add(obj);
            }
        }
        return ww3.z1(arrayList, ",", null, null, new w83(20), 30);
    }

    public static final CharSequence parseTurnServers$lambda$1(PeerConnection.IceServer iceServer) {
        String str;
        return (iceServer == null || (str = iceServer.hostname) == null) ? "" : str;
    }

    @Override // ru.ok.android.externcalls.sdk.conversation.internal.actions.Action
    public v7g execute(Params params) {
        p8g p8gVarF;
        if (this.startConversationDelegate != null) {
            StartConversationDelegate.Params params2 = new StartConversationDelegate.Params(((qs4) this.conversationIdProvider).b, collectOpponentExternalIds(this.store, this.me.getExternalId()), params.getStartCallApiParams().getChatId(), params.getStartCallApiParams().getIsVideo(), this.internalParamsProvider.a(params.getStartCallApiParams()));
            this.logger.log(LOG_TAG, "startConversationDelegate called with param " + params2);
            p8gVarF = new p64(4, new vs4(this, 0, params2)).f(new sf7() { // from class: ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart.execute.2
                public AnonymousClass2() {
                }

                @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
                /* JADX INFO: renamed from: apply */
                public final CallInfo mo41apply(StartConversationDelegate.Result result) throws FastStartException {
                    if (result instanceof StartConversationDelegate.Result.Success) {
                        return CallInfo.INSTANCE.createFromStartConversationDelegateResult$calls_sdk((StartConversationDelegate.Result.Success) result, ConversationStart.this.experiments.j());
                    }
                    if (result instanceof StartConversationDelegate.Result.Error) {
                        StartConversationDelegate.Result.Error error = (StartConversationDelegate.Result.Error) result;
                        throw new FastStartException(error.getErrorCode(), error.getThrowable());
                    }
                    ore.o();
                    return null;
                }
            });
        } else {
            OkApiServiceInternal okApiServiceInternal = this.okApiServiceInternal;
            ConversationParams providedParams = params.getProvidedParams();
            p8gVarF = okApiServiceInternal.startConversation(parseTurnServers(providedParams != null ? providedParams.stunTurnServers : null), ((qs4) this.conversationIdProvider).b, params.getCreateLink(), params.getOpponent(), collectOpponentExternalIds(this.store, this.me.getExternalId()), params.getStartCallApiParams()).f(new sf7() { // from class: ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart.execute.3
                public AnonymousClass3() {
                }

                @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
                /* JADX INFO: renamed from: apply */
                public final CallInfo mo41apply(CallInfo callInfo) {
                    return ConversationStart.this.maybeEmulateError(callInfo);
                }
            });
        }
        return p8gVarF.f(AnonymousClass4.INSTANCE);
    }

    public final boolean isFastStartEnabled() {
        return this.startConversationDelegate != null;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/conversation/internal/actions/ConversationStart$Companion;", "", "<init>", "()V", "LOG_TAG", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart$execute$3 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class AnonymousClass3 implements sf7 {
        public AnonymousClass3() {
        }

        @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
        /* JADX INFO: renamed from: apply */
        public final CallInfo mo41apply(CallInfo callInfo) {
            return ConversationStart.this.maybeEmulateError(callInfo);
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.conversation.internal.actions.ConversationStart$execute$4 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass4<T, R> implements sf7 {
        public static final AnonymousClass4<T, R> INSTANCE = ;

        @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
        /* JADX INFO: renamed from: apply */
        public final Result mo41apply(CallInfo callInfo) {
            return new Result(callInfo);
        }
    }
}
