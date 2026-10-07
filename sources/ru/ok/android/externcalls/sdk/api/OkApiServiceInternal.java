package ru.ok.android.externcalls.sdk.api;

import defpackage.at7;
import defpackage.cyl;
import defpackage.esh;
import defpackage.et7;
import defpackage.gsh;
import defpackage.it7;
import defpackage.j95;
import defpackage.kl7;
import defpackage.msb;
import defpackage.nji;
import defpackage.nxe;
import defpackage.p64;
import defpackage.q8g;
import defpackage.sbi;
import defpackage.sf7;
import defpackage.tt0;
import defpackage.v7g;
import defpackage.ww3;
import defpackage.x3e;
import defpackage.y3e;
import defpackage.yt1;
import defpackage.yw3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.api.request.BatchRequestKt;
import ru.ok.android.externcalls.sdk.api.request.ClientSupportedCodecs;
import ru.ok.android.externcalls.sdk.api.request.GetConversationParams;
import ru.ok.android.externcalls.sdk.api.request.GetExternalIdsByOkIds;
import ru.ok.android.externcalls.sdk.api.request.GetOkIdByExternalId;
import ru.ok.android.externcalls.sdk.api.request.GetOkIdsByExternalIds;
import ru.ok.android.externcalls.sdk.api.request.GetSettings;
import ru.ok.android.externcalls.sdk.api.request.HangupConversation;
import ru.ok.android.externcalls.sdk.api.request.JoinConversation;
import ru.ok.android.externcalls.sdk.api.request.JoinConversationByLink;
import ru.ok.android.externcalls.sdk.api.request.StartConversation;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;
import ru.ok.android.externcalls.sdk.conversation.StartCallApiParams;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stat.api.ApiStats;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 Y2\u00020\u0001:\u0001YBA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00162\b\u0010 \u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b!\u0010\"JK\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00162\u0006\u0010#\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100'2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b*\u0010+J-\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010-\u001a\u00020,2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b/\u00100J)\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010032\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001001H\u0001¢\u0006\u0004\b4\u00105J/\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010030\u00162\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u001001H\u0001¢\u0006\u0004\b6\u00107J\u001d\u0010:\u001a\b\u0012\u0004\u0012\u0002090\u00162\u0006\u00108\u001a\u00020\u0010H\u0001¢\u0006\u0004\b:\u0010;J\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00162\u0006\u0010=\u001a\u00020<H\u0001¢\u0006\u0004\b?\u0010@J-\u0010F\u001a\b\u0012\u0004\u0012\u00020E0\u00162\u0006\u0010A\u001a\u00020\u00102\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\u0010H\u0001¢\u0006\u0004\bF\u0010GJ/\u0010M\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010L0'0\u00162\u0010\u0010K\u001a\f\u0012\b\u0012\u00060Ij\u0002`J0HH\u0001¢\u0006\u0004\bM\u0010NJ/\u0010R\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010Q0'0\u00162\u0010\u0010K\u001a\f\u0012\b\u0012\u00060Oj\u0002`P0HH\u0001¢\u0006\u0004\bR\u0010NR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010SR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010TR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010UR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010VR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010WR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010X¨\u0006Z"}, d2 = {"Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "", "Lnxe;", "rxApiClient", "Lru/ok/android/externcalls/sdk/api/OkApiService;", "okApiService", "Lru/ok/android/externcalls/sdk/stat/api/ApiStats;", "apiStats", "Ly3e;", "rtcLog", "Lesh;", "timeProvider", "Let7;", "hangupDelegate", "<init>", "(Lnxe;Lru/ok/android/externcalls/sdk/api/OkApiService;Lru/ok/android/externcalls/sdk/stat/api/ApiStats;Ly3e;Lesh;Let7;)V", "", "cid", "", ApiProtocol.PARAM_PEER_ID, "Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;", "params", "Lv7g;", "Lru/ok/android/externcalls/sdk/api/request/JoinConversation$Response;", "joinToConversation", "(Ljava/lang/String;JLru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)Lv7g;", "anonToken", "", "isFastRetryEnabled", "Lru/ok/android/externcalls/sdk/api/ConversationParams;", "getConversationParams", "(Ljava/lang/String;ZLjava/lang/String;)Lv7g;", "initialJoinLink", "joinConversationByLink", "(Ljava/lang/String;Ljava/lang/String;JLru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)Lv7g;", "servers", "createLink", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "opponent", "", "opponentIds", "Lru/ok/android/externcalls/sdk/api/CallInfo;", "startConversation", "(Ljava/lang/String;Ljava/lang/String;ZLru/ok/android/externcalls/sdk/ConversationParticipant;Ljava/util/List;Lru/ok/android/externcalls/sdk/conversation/StartCallApiParams;)Lv7g;", "Lnji;", "type", "Lll7;", "requestUploadUrl", "(Ljava/lang/String;Lnji;Ljava/lang/String;)Lv7g;", "", ApiProtocol.PARAM_KEYS, "", "getSettingsBlocking", "(Ljava/util/Set;)Ljava/util/Map;", "getSettings", "(Ljava/util/Set;)Lv7g;", "participantExternalId", "Lru/ok/android/externcalls/sdk/api/request/GetOkIdByExternalId$Response;", "getOkIdByExternalId", "(Ljava/lang/String;)Lv7g;", "Lorg/json/JSONObject;", "codecList", "Lru/ok/android/externcalls/sdk/api/request/ClientSupportedCodecs$Response;", "sendSupportedCodecsStatistics", "(Lorg/json/JSONObject;)Lv7g;", "cId", "Lit7;", "reason", "internalParams", "Lru/ok/android/externcalls/sdk/api/request/HangupConversation$Response;", "hangupConversation", "(Ljava/lang/String;Lit7;Ljava/lang/String;)Lv7g;", "", "Lyt1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "candidates", "Lru/ok/android/externcalls/sdk/api/ExternalIdsResponse;", "getExternalIdsByOkIds", "(Ljava/util/Collection;)Lv7g;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lru/ok/android/externcalls/sdk/api/BatchInternalIdResponse;", "getOkIdsByExternalIds", "Lnxe;", "Lru/ok/android/externcalls/sdk/api/OkApiService;", "Lru/ok/android/externcalls/sdk/stat/api/ApiStats;", "Ly3e;", "Lesh;", "Let7;", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OkApiServiceInternal {
    private static final String BATCH_PREFIX = "batch.execute/";
    private static final Companion Companion = new Companion(null);
    private static final int MAX_EXTERNAL_IDS_PER_REQUEST = 200;
    private static final int MAX_OK_IDS_PER_REQUEST = 100;
    private ApiStats apiStats;
    private final et7 hangupDelegate;
    private final OkApiService okApiService;
    private y3e rtcLog;
    private final nxe rxApiClient;
    private esh timeProvider;

    public OkApiServiceInternal(nxe nxeVar, OkApiService okApiService, ApiStats apiStats, y3e y3eVar, esh eshVar, et7 et7Var, int i, j95 j95Var) {
        this(nxeVar, (i & 2) != 0 ? new OkApiService() : okApiService, (i & 4) != 0 ? null : apiStats, (i & 8) != 0 ? x3e.a : y3eVar, (i & 16) != 0 ? new gsh() : eshVar, et7Var);
    }

    public static /* synthetic */ v7g getConversationParams$default(OkApiServiceInternal okApiServiceInternal, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        return okApiServiceInternal.getConversationParams(str, z, str2);
    }

    public static final sbi getExternalIdsByOkIds$lambda$0(OkApiServiceInternal okApiServiceInternal, long j) {
        ApiStats apiStats = okApiServiceInternal.apiStats;
        if (apiStats != null) {
            apiStats.reportExecutionTime("batch.execute/vchat.getExternalIdsByOkIds", j);
        }
        return sbi.a;
    }

    public static final sbi getOkIdsByExternalIds$lambda$0(OkApiServiceInternal okApiServiceInternal, long j) {
        ApiStats apiStats = okApiServiceInternal.apiStats;
        if (apiStats != null) {
            apiStats.reportExecutionTime("batch.execute/vchat.getOkIdsByExternalIds", j);
        }
        return sbi.a;
    }

    public static final HangupConversation.Response hangupConversation$lambda$0(OkApiServiceInternal okApiServiceInternal, String str, it7 it7Var, String str2) {
        okApiServiceInternal.hangupDelegate.invoke(new at7(str, it7Var, str2));
        return new HangupConversation.Response();
    }

    public final v7g getConversationParams(String anonToken, boolean isFastRetryEnabled, String cid) {
        q8g q8gVarA = this.rxApiClient.a(new GetConversationParams.Request(anonToken, cid));
        y3e y3eVar = this.rtcLog;
        if (isFastRetryEnabled) {
            RetryKt.retryApiCallForFastWorkRequired(q8gVarA, y3eVar);
            return q8gVarA;
        }
        RetryKt.retryApiCallForBackgroundWork(q8gVarA, y3eVar);
        return q8gVarA;
    }

    public final v7g getExternalIdsByOkIds(Collection<yt1> candidates) {
        ArrayList arrayListY1 = ww3.Y1(candidates, 200, 200);
        ArrayList arrayList = new ArrayList(yw3.W0(arrayListY1, 10));
        Iterator it = arrayListY1.iterator();
        while (it.hasNext()) {
            arrayList.add(new GetExternalIdsByOkIds.Request((List) it.next()));
        }
        return RetryKt.retryApiCallForFastWorkRequired(cyl.a(this.rxApiClient.a(BatchRequestKt.toBatchRequest(arrayList)), this.timeProvider, new msb(this, 0)).f(new sf7() { // from class: ru.ok.android.externcalls.sdk.api.OkApiServiceInternal.getExternalIdsByOkIds.2
            final /* synthetic */ List<GetExternalIdsByOkIds.Request> $requests;

            public AnonymousClass2() {
                list = arrayList;
            }

            @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
            /* JADX INFO: renamed from: apply */
            public final List<ExternalIdsResponse> mo41apply(tt0 tt0Var) {
                return BatchRequestKt.parseBatchResponse(tt0Var, list);
            }
        }), this.rtcLog);
    }

    public final v7g getOkIdByExternalId(String participantExternalId) {
        return RetryKt.retryApiCallForFastWorkRequired(this.rxApiClient.a(new GetOkIdByExternalId.Request(participantExternalId, false, 2, null)), this.rtcLog);
    }

    public final v7g getOkIdsByExternalIds(Collection<ParticipantId> candidates) {
        ArrayList arrayListY1 = ww3.Y1(candidates, 100, 100);
        ArrayList arrayList = new ArrayList(yw3.W0(arrayListY1, 10));
        Iterator it = arrayListY1.iterator();
        while (it.hasNext()) {
            arrayList.add(new GetOkIdsByExternalIds.Request((List) it.next()));
        }
        return RetryKt.retryApiCallForFastWorkRequired(cyl.a(this.rxApiClient.a(BatchRequestKt.toBatchRequest(arrayList)), this.timeProvider, new msb(this, 1)).f(new sf7() { // from class: ru.ok.android.externcalls.sdk.api.OkApiServiceInternal.getOkIdsByExternalIds.2
            final /* synthetic */ List<GetOkIdsByExternalIds.Request> $requests;

            public C00072() {
                list = arrayList;
            }

            @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
            /* JADX INFO: renamed from: apply */
            public final List<BatchInternalIdResponse> mo41apply(tt0 tt0Var) {
                return BatchRequestKt.parseBatchResponse(tt0Var, list);
            }
        }), this.rtcLog);
    }

    public final v7g getSettings(Set<String> set) {
        return this.rxApiClient.a(new GetSettings.Request(set));
    }

    public final Map<String, String> getSettingsBlocking(Set<String> set) {
        nxe nxeVar = this.rxApiClient;
        return (Map) nxeVar.a.a(new GetSettings.Request(set));
    }

    public final v7g hangupConversation(final String cId, final it7 reason, final String internalParams) {
        return new p64(4, new Callable() { // from class: nsb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return OkApiServiceInternal.hangupConversation$lambda$0(this.a, cId, reason, internalParams);
            }
        });
    }

    public final v7g joinConversationByLink(String initialJoinLink, String anonToken, long j, StartCallApiParams params) {
        return RetryKt.retryApiCallForJoining(this.rxApiClient.a(new JoinConversationByLink.Request(initialJoinLink, anonToken, j, params)), this.rtcLog).f(AnonymousClass1.INSTANCE);
    }

    public final v7g joinToConversation(String cid, long j, StartCallApiParams params) {
        return RetryKt.retryApiCallForJoining(this.rxApiClient.a(new JoinConversation.Request(cid, j, params, new OkApiServiceInternal$joinToConversation$request$1(this.okApiService))), this.rtcLog);
    }

    public final v7g requestUploadUrl(String cid, nji type, String anonToken) {
        return RetryKt.retryApiCallForBackgroundWork(this.rxApiClient.a(new kl7(cid, type, anonToken)), this.rtcLog);
    }

    public final v7g sendSupportedCodecsStatistics(JSONObject codecList) {
        return RetryKt.retryApiCallForBackgroundWork(this.rxApiClient.a(new ClientSupportedCodecs.Request(codecList)), this.rtcLog);
    }

    public final v7g startConversation(String servers, String cid, boolean createLink, ConversationParticipant opponent, List<String> opponentIds, StartCallApiParams params) {
        return RetryKt.retryApiCallForOutgoing(this.rxApiClient.a(new StartConversation.Request(servers, cid, createLink, opponent, opponentIds, params, new OkApiServiceInternal$startConversation$request$1(this.okApiService))), this.rtcLog);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal$Companion;", "", "<init>", "()V", "MAX_EXTERNAL_IDS_PER_REQUEST", "", "MAX_OK_IDS_PER_REQUEST", "BATCH_PREFIX", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.api.OkApiServiceInternal$getExternalIdsByOkIds$2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass2<T, R> implements sf7 {
        final /* synthetic */ List<GetExternalIdsByOkIds.Request> $requests;

        public AnonymousClass2() {
            list = arrayList;
        }

        @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
        /* JADX INFO: renamed from: apply */
        public final List<ExternalIdsResponse> mo41apply(tt0 tt0Var) {
            return BatchRequestKt.parseBatchResponse(tt0Var, list);
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.api.OkApiServiceInternal$getOkIdsByExternalIds$2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C00072<T, R> implements sf7 {
        final /* synthetic */ List<GetOkIdsByExternalIds.Request> $requests;

        public C00072() {
            list = arrayList;
        }

        @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
        /* JADX INFO: renamed from: apply */
        public final List<BatchInternalIdResponse> mo41apply(tt0 tt0Var) {
            return BatchRequestKt.parseBatchResponse(tt0Var, list);
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.api.OkApiServiceInternal$joinConversationByLink$1 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass1<T, R> implements sf7 {
        public static final AnonymousClass1<T, R> INSTANCE = ;

        @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
        /* JADX INFO: renamed from: apply */
        public final ConversationParams mo41apply(JoinByLinkResponse joinByLinkResponse) {
            return joinByLinkResponse.toParams();
        }
    }

    public OkApiServiceInternal(nxe nxeVar, OkApiService okApiService, ApiStats apiStats, y3e y3eVar, esh eshVar, et7 et7Var) {
        this.rxApiClient = nxeVar;
        this.okApiService = okApiService;
        this.apiStats = apiStats;
        this.rtcLog = y3eVar;
        this.timeProvider = eshVar;
        this.hangupDelegate = et7Var;
    }
}
