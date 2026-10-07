package ru.ok.android.externcalls.sdk.waiting_room;

import defpackage.a72;
import defpackage.b8g;
import defpackage.bm5;
import defpackage.c5f;
import defpackage.cf7;
import defpackage.d7i;
import defpackage.ewg;
import defpackage.f4g;
import defpackage.f8g;
import defpackage.g62;
import defpackage.gg7;
import defpackage.h62;
import defpackage.i3f;
import defpackage.i62;
import defpackage.j62;
import defpackage.jqb;
import defpackage.k62;
import defpackage.kql;
import defpackage.l62;
import defpackage.mb;
import defpackage.o91;
import defpackage.p64;
import defpackage.pg4;
import defpackage.q4g;
import defpackage.qr7;
import defpackage.qv1;
import defpackage.qyd;
import defpackage.rg4;
import defpackage.sf7;
import defpackage.sqb;
import defpackage.th;
import defpackage.tre;
import defpackage.v7g;
import defpackage.vj7;
import defpackage.vm9;
import defpackage.vqb;
import defpackage.vx8;
import defpackage.w74;
import defpackage.x81;
import defpackage.xqb;
import defpackage.y3e;
import defpackage.yt1;
import defpackage.z2f;
import defpackage.z62;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.CallExternalIdConverter;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 b2\u00020\u0001:\u0003cdbB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000eH\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\u000eH\u0003¢\u0006\u0004\b)\u0010'J\u000f\u0010+\u001a\u00020*H\u0003¢\u0006\u0004\b+\u0010,J!\u00102\u001a\f\u0012\b\u0012\u000600j\u0002`10/2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b2\u00103J'\u00107\u001a\b\u0012\u0004\u0012\u0002060/2\u0006\u0010\r\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u000104H\u0002¢\u0006\u0004\b7\u00108J#\u0010;\u001a\u0002042\u0006\u00109\u001a\u00020-2\n\u0010:\u001a\u000600j\u0002`1H\u0002¢\u0006\u0004\b;\u0010<JP\u0010D\u001a\u00020\u000e2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=2\u001a\b\u0004\u0010A\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0=\u0012\u0004\u0012\u00020\u000e0@2\u0014\b\u0004\u0010C\u001a\u000e\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u000e0@H\u0082\b¢\u0006\u0004\bD\u0010EJ#\u0010F\u001a\b\u0012\u0004\u0012\u00020-0=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002¢\u0006\u0004\bF\u0010GJ'\u0010H\u001a\f\u0012\b\u0012\u000600j\u0002`10=2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002¢\u0006\u0004\bH\u0010GJ\u001d\u0010I\u001a\u00020\u000e2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0=H\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u000eH\u0002¢\u0006\u0004\bK\u0010'J\u0017\u0010M\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020*H\u0003¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u0011H\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u000eH\u0003¢\u0006\u0004\bQ\u0010'J\u0017\u0010R\u001a\u00020\u000e2\u0006\u0010L\u001a\u00020*H\u0003¢\u0006\u0004\bR\u0010NR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010SR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010TR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010UR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010VR\"\u0010Y\u001a\u0010\u0012\f\u0012\n X*\u0004\u0018\u00010\u00110\u00110W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010^R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010_R\u0016\u0010\u0015\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010_R\u001e\u0010`\u001a\n X*\u0004\u0018\u00010*0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010a¨\u0006e"}, d2 = {"Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants;", "Lz62;", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Listener;", "listener", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idMappingResolver", "Ly3e;", "log", "<init>", "(Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Listener;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Ly3e;)V", "Lo91;", "call", "Lsbi;", "setCall", "(Lo91;)V", "", "isMeAdmin", "onIsMeAdminMayHaveChanged", "(Z)V", "isWaitingRoomEnabled", "onWaitingRoomEnabled", "isMeInWaitingRoom", "onMeInWaitingRoomChanged", "Li62;", "event", "onAttendee", "(Li62;)V", "Lj62;", "onFeedback", "(Lj62;)V", "Ll62;", "onPromotionUpdated", "(Ll62;)V", "Lk62;", "onHandUp", "(Lk62;)V", "release", "()V", "update", "onWaitingRoomParticipantsMayHaveChanged", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "loadWaitingParticipantIds", "()Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "Lru/ok/android/externcalls/sdk/waiting_room/ConversationWaitingParticipantId;", "waitingParticipantId", "Lv7g;", "Lyt1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "resolveInternalIdSingle", "(Lru/ok/android/externcalls/sdk/waiting_room/ConversationWaitingParticipantId;)Lv7g;", "Lh62;", "fromId", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$WaitingParticipantsPage;", "loadWaitingParticipantIdsPageSingle", "(Lo91;Lh62;)Lv7g;", "participantId", "internalId", "fromInternalLong", "(Lru/ok/android/externcalls/sdk/waiting_room/ConversationWaitingParticipantId;Lyt1;)Lh62;", "", "Lg62;", "waitingParticipants", "Lkotlin/Function1;", "onResult", "", "onError", "resolveInternalIds", "(Ljava/util/List;Lcf7;Lcf7;)V", "getResolvedWaitingParticipantIds", "(Ljava/util/List;)Ljava/util/List;", "getInternalIdsToResolve", "putIdMappingsToCache", "(Ljava/util/List;)V", "scheduleLoad", "data", "notifyListener", "(Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;)V", "shouldSendWaitingList", "()Z", "notifyListenerWithEmptyList", "notifyIfListChanged", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Listener;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Ly3e;", "Lqyd;", "kotlin.jvm.PlatformType", "loadEventSubject", "Lqyd;", "Lw74;", "compositeDisposable", "Lw74;", "Lo91;", "Z", "lastSentParticipantIds", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "Companion", "Listener", "WaitingParticipantsPage", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WaitingRoomParticipants implements z62 {
    private static final String LOG_TAG = "WaitingRoomParticipants";
    private static final int PAGE_SIZE = 50;
    private volatile o91 call;
    private final w74 compositeDisposable;
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private volatile boolean isMeAdmin;
    private volatile boolean isWaitingRoomEnabled;
    private volatile WaitingRoomParticipantsUpdate lastSentParticipantIds;
    private final Listener listener;
    private final qyd loadEventSubject;
    private final y3e log;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$Listener;", "", "Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;", "data", "Lsbi;", "onWaitingRoomParticipantsChanged", "(Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipantsUpdate;)V", "", "isMeInWaitingRoom", "onMeInWaitingRoomChanged", "(Z)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface Listener {
        void onMeInWaitingRoomChanged(boolean isMeInWaitingRoom);

        void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate data);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ok/android/externcalls/sdk/waiting_room/WaitingRoomParticipants$WaitingParticipantsPage;", "", "participantIds", "", "Lru/ok/android/externcalls/sdk/waiting_room/ConversationWaitingParticipantId;", "hasMore", "", "<init>", "(Ljava/util/List;Z)V", "getParticipantIds", "()Ljava/util/List;", "getHasMore", "()Z", "setHasMore", "(Z)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class WaitingParticipantsPage {
        private boolean hasMore;
        private final List<ConversationWaitingParticipantId> participantIds;

        public WaitingParticipantsPage(List<ConversationWaitingParticipantId> list, boolean z) {
            this.participantIds = list;
            this.hasMore = z;
        }

        public final boolean getHasMore() {
            return this.hasMore;
        }

        public final List<ConversationWaitingParticipantId> getParticipantIds() {
            return this.participantIds;
        }

        public final void setHasMore(boolean z) {
            this.hasMore = z;
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants$resolveInternalIds$1 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass1 implements Runnable {
        final /* synthetic */ cf7 $onError;
        final /* synthetic */ cf7 $onResult;
        final /* synthetic */ List<g62> $waitingParticipants;

        public AnonymousClass1() {
            list = list;
            cf7Var = cf7Var;
            cf7Var = cf7Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                cf7Var.invoke(WaitingRoomParticipants.this.getResolvedWaitingParticipantIds(list));
            } catch (Exception e) {
                cf7Var.invoke(e);
            }
        }
    }

    /* JADX INFO: renamed from: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants$resolveInternalIds$2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            cf7Var.invoke(new RuntimeException("Can't resolve extenral ids"));
        }
    }

    public WaitingRoomParticipants(Listener listener, IdMappingWrapper idMappingWrapper, IdMappingResolver idMappingResolver, y3e y3eVar) {
        this.listener = listener;
        this.idMappingWrapper = idMappingWrapper;
        this.idMappingResolver = idMappingResolver;
        this.log = y3eVar;
        qyd qydVar = new qyd();
        this.loadEventSubject = qydVar;
        w74 w74Var = new w74();
        this.compositeDisposable = w74Var;
        WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate = WaitingRoomParticipantsUpdate.EMPTY;
        this.lastSentParticipantIds = waitingRoomParticipantsUpdate;
        z2f z2fVarA = i3f.a();
        Objects.requireNonNull(TimeUnit.SECONDS, "unit is null");
        Objects.requireNonNull(z2fVarA, "scheduler is null");
        xqb xqbVar = new xqb(new jqb(qydVar, z2fVarA, 3).e(i3f.b()), new sf7() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants$loadDisposable$1
            @Override // defpackage.sf7, defpackage.sxe, defpackage.rf7, defpackage.mf7
            /* JADX INFO: renamed from: apply, reason: merged with bridge method [inline-methods] */
            public final WaitingRoomParticipantsUpdate mo41apply(Boolean bool) {
                return this.this$0.loadWaitingParticipantIds();
            }
        }, 1);
        Objects.requireNonNull(waitingRoomParticipantsUpdate, "item is null");
        vqb vqbVarE = new sqb(xqbVar, new gg7(waitingRoomParticipantsUpdate), 1).e(th.a());
        vx8 vx8Var = new vx8(new rg4() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants$loadDisposable$2
            @Override // defpackage.rg4, defpackage.tg4
            public final void accept(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate2) {
                this.this$0.notifyListener(waitingRoomParticipantsUpdate2);
            }
        }, vm9.f);
        vqbVarE.f(vx8Var);
        w74Var.a(vx8Var);
    }

    private final h62 fromInternalLong(ConversationWaitingParticipantId participantId, yt1 internalId) {
        return new h62(internalId, participantId.addedTs);
    }

    private final List<yt1> getInternalIdsToResolve(List<g62> waitingParticipants) {
        ArrayList arrayList = new ArrayList(waitingParticipants.size());
        Iterator<g62> it = waitingParticipants.iterator();
        while (it.hasNext()) {
            yt1 yt1Var = it.next().a.b;
            if (this.idMappingWrapper.getByInternal(yt1Var) == null) {
                arrayList.add(yt1Var);
            }
        }
        return arrayList;
    }

    public final List<ConversationWaitingParticipantId> getResolvedWaitingParticipantIds(List<g62> waitingParticipants) {
        ArrayList arrayList = new ArrayList(waitingParticipants.size());
        for (g62 g62Var : waitingParticipants) {
            ParticipantId byInternal = this.idMappingWrapper.getByInternal(g62Var.a.b);
            if (byInternal != null) {
                arrayList.add(new ConversationWaitingParticipantId(ParticipantId.withoutDeviceId(byInternal.id, byInternal.isAnon), g62Var.a.a));
            }
        }
        return arrayList;
    }

    public final WaitingRoomParticipantsUpdate loadWaitingParticipantIds() {
        h62 h62VarFromInternalLong;
        boolean z;
        o91 o91Var = this.call;
        if (o91Var == null || !this.isMeAdmin || !this.isWaitingRoomEnabled) {
            return WaitingRoomParticipantsUpdate.EMPTY;
        }
        ArrayList arrayList = new ArrayList();
        ConversationWaitingParticipantId conversationWaitingParticipantId = null;
        do {
            if (conversationWaitingParticipantId != null) {
                try {
                    h62VarFromInternalLong = fromInternalLong(conversationWaitingParticipantId, (yt1) resolveInternalIdSingle(conversationWaitingParticipantId).d());
                } catch (Throwable th) {
                    this.log.log(LOG_TAG, "can't resolve internal id for " + conversationWaitingParticipantId + ". Error: " + th.getMessage());
                }
            } else {
                h62VarFromInternalLong = null;
            }
            try {
                WaitingParticipantsPage waitingParticipantsPage = (WaitingParticipantsPage) loadWaitingParticipantIdsPageSingle(o91Var, h62VarFromInternalLong).d();
                Iterator<ConversationWaitingParticipantId> it = waitingParticipantsPage.getParticipantIds().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getParticipantId());
                }
                z = waitingParticipantsPage.getHasMore() && !waitingParticipantsPage.getParticipantIds().isEmpty();
                if (!waitingParticipantsPage.getParticipantIds().isEmpty()) {
                    conversationWaitingParticipantId = waitingParticipantsPage.getParticipantIds().get(waitingParticipantsPage.getParticipantIds().size() - 1);
                }
            } catch (Throwable th2) {
                this.log.log(LOG_TAG, "can't load next page. Error: " + th2.getMessage());
            }
        } while (z);
        HashSet hashSet = new HashSet(this.lastSentParticipantIds.participantsIds);
        HashSet hashSet2 = new HashSet(arrayList);
        hashSet.removeAll(arrayList);
        hashSet2.removeAll(this.lastSentParticipantIds.participantsIds);
        this.lastSentParticipantIds = new WaitingRoomParticipantsUpdate(arrayList, !hashSet2.isEmpty(), !hashSet.isEmpty());
        return this.lastSentParticipantIds;
    }

    private final v7g loadWaitingParticipantIdsPageSingle(o91 call, h62 fromId) {
        return new p64(2, new d7i(call, fromId, this, 2));
    }

    public static final void loadWaitingParticipantIdsPageSingle$lambda$0(o91 o91Var, h62 h62Var, WaitingRoomParticipants waitingRoomParticipants, f8g f8gVar) {
        bm5 bm5Var = new bm5(waitingRoomParticipants, 6, f8gVar);
        f4g f4gVar = new f4g(27, f8gVar);
        q4g q4gVar = o91Var.k;
        try {
            vj7 vj7VarB = kql.b(null, "get-waiting-hall");
            JSONObject jSONObject = vj7VarB.a;
            jSONObject.put("backward", false);
            if (h62Var != null) {
                JSONObject jSONObjectPut = new JSONObject().put("id", h62Var.b.b()).put("addedTs", h62Var.a);
                jSONObjectPut.getClass();
                jSONObject.put("fromId", jSONObjectPut);
            }
            jSONObject.put("count", PAGE_SIZE);
            q4gVar.d(vj7VarB, false, new x81(o91Var, bm5Var, f4gVar, 1), new mb(1, f4gVar));
        } catch (JSONException e) {
            qr7.o(e);
        }
    }

    public static final void loadWaitingParticipantIdsPageSingle$lambda$0$0(final WaitingRoomParticipants waitingRoomParticipants, final f8g f8gVar, final a72 a72Var) {
        final ArrayList arrayList = a72Var.a;
        waitingRoomParticipants.putIdMappingsToCache(arrayList);
        List<yt1> internalIdsToResolve = waitingRoomParticipants.getInternalIdsToResolve(arrayList);
        if (!internalIdsToResolve.isEmpty()) {
            waitingRoomParticipants.idMappingResolver.resolveExternalsByInternalsIds(internalIdsToResolve, new Runnable() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants$loadWaitingParticipantIdsPageSingle$lambda$0$0$$inlined$resolveInternalIds$1
                @Override // java.lang.Runnable
                public final void run() {
                    List resolvedWaitingParticipantIds = this.this$0.getResolvedWaitingParticipantIds(arrayList);
                    try {
                        ((b8g) f8gVar).a(new WaitingRoomParticipants.WaitingParticipantsPage(resolvedWaitingParticipantIds, a72Var.b));
                    } catch (Exception e) {
                        ((b8g) f8gVar).d(new RuntimeException(qv1.k("Can't resolve internal ids: ", e.getMessage())));
                    }
                }
            }, new Runnable() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants$loadWaitingParticipantIdsPageSingle$lambda$0$0$$inlined$resolveInternalIds$2
                @Override // java.lang.Runnable
                public final void run() {
                    RuntimeException runtimeException = new RuntimeException("Can't resolve extenral ids");
                    ((b8g) f8gVar).d(new RuntimeException(qv1.k("Can't resolve internal ids: ", runtimeException.getMessage())));
                }
            });
        } else {
            ((b8g) f8gVar).a(new WaitingParticipantsPage(waitingRoomParticipants.getResolvedWaitingParticipantIds(arrayList), a72Var.b));
        }
    }

    public static final void loadWaitingParticipantIdsPageSingle$lambda$0$1(f8g f8gVar) {
        ((b8g) f8gVar).d(new RuntimeException("Can't get waiting room partiicpants"));
    }

    private final void notifyIfListChanged(WaitingRoomParticipantsUpdate data) {
        this.listener.onWaitingRoomParticipantsChanged(data);
    }

    public final void notifyListener(WaitingRoomParticipantsUpdate data) {
        if (shouldSendWaitingList()) {
            notifyIfListChanged(data);
        } else {
            notifyListenerWithEmptyList();
        }
    }

    private final void notifyListenerWithEmptyList() {
        this.lastSentParticipantIds = WaitingRoomParticipantsUpdate.EMPTY;
        notifyIfListChanged(this.lastSentParticipantIds);
    }

    private final void onWaitingRoomParticipantsMayHaveChanged() {
        if (shouldSendWaitingList()) {
            scheduleLoad();
        }
    }

    private final void putIdMappingsToCache(List<g62> waitingParticipants) {
        for (g62 g62Var : waitingParticipants) {
            ParticipantId participantIdConvert = CallExternalIdConverter.convert(g62Var.b);
            if (participantIdConvert != null) {
                this.idMappingWrapper.addMapping(participantIdConvert, g62Var.a.b);
            }
        }
    }

    private final v7g resolveInternalIdSingle(ConversationWaitingParticipantId waitingParticipantId) {
        return new p64(2, new c5f(this, 14, waitingParticipantId));
    }

    public static final void resolveInternalIdSingle$lambda$0(WaitingRoomParticipants waitingRoomParticipants, ConversationWaitingParticipantId conversationWaitingParticipantId, f8g f8gVar) {
        waitingRoomParticipants.idMappingResolver.withInternalId(conversationWaitingParticipantId.getParticipantId(), new pg4(5, f8gVar), new ewg(f8gVar, 28, conversationWaitingParticipantId));
    }

    public static final void resolveInternalIdSingle$lambda$0$0(f8g f8gVar, ConversationWaitingParticipantId conversationWaitingParticipantId) {
        RuntimeException runtimeException = new RuntimeException("No external id for " + conversationWaitingParticipantId.getParticipantId());
        if (((b8g) f8gVar).d(runtimeException)) {
            return;
        }
        tre.s0(runtimeException);
    }

    private final void resolveInternalIds(List<g62> waitingParticipants, cf7 onResult, cf7 onError) {
        putIdMappingsToCache(waitingParticipants);
        List<yt1> internalIdsToResolve = getInternalIdsToResolve(waitingParticipants);
        if (internalIdsToResolve.isEmpty()) {
            onResult.invoke(getResolvedWaitingParticipantIds(waitingParticipants));
        } else {
            this.idMappingResolver.resolveExternalsByInternalsIds(internalIdsToResolve, new Runnable() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.resolveInternalIds.1
                final /* synthetic */ cf7 $onError;
                final /* synthetic */ cf7 $onResult;
                final /* synthetic */ List<g62> $waitingParticipants;

                public AnonymousClass1() {
                    list = waitingParticipants;
                    cf7Var = onResult;
                    cf7Var = onError;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        cf7Var.invoke(WaitingRoomParticipants.this.getResolvedWaitingParticipantIds(list));
                    } catch (Exception e) {
                        cf7Var.invoke(e);
                    }
                }
            }, new Runnable() { // from class: ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants.resolveInternalIds.2
                public AnonymousClass2() {
                }

                @Override // java.lang.Runnable
                public final void run() {
                    cf7Var.invoke(new RuntimeException("Can't resolve extenral ids"));
                }
            });
        }
    }

    private final void scheduleLoad() {
        this.loadEventSubject.d(Boolean.TRUE);
    }

    private final boolean shouldSendWaitingList() {
        return this.isMeAdmin && this.isWaitingRoomEnabled;
    }

    private final void update() {
        if (shouldSendWaitingList()) {
            scheduleLoad();
        } else {
            notifyListenerWithEmptyList();
        }
    }

    @Override // defpackage.z62
    public void onAttendee(i62 event) {
        onWaitingRoomParticipantsMayHaveChanged();
    }

    @Override // defpackage.z62
    public void onFeedback(j62 event) {
    }

    @Override // defpackage.z62
    public void onHandUp(k62 event) {
    }

    public final void onIsMeAdminMayHaveChanged(boolean isMeAdmin) {
        if (this.isMeAdmin != isMeAdmin) {
            this.isMeAdmin = isMeAdmin;
            update();
        }
    }

    @Override // defpackage.z62
    public void onMeInWaitingRoomChanged(boolean isMeInWaitingRoom) {
        this.listener.onMeInWaitingRoomChanged(isMeInWaitingRoom);
    }

    @Override // defpackage.z62
    public void onPromotionUpdated(l62 event) {
    }

    public final void onWaitingRoomEnabled(boolean isWaitingRoomEnabled) {
        if (this.isWaitingRoomEnabled != isWaitingRoomEnabled) {
            this.isWaitingRoomEnabled = isWaitingRoomEnabled;
            update();
        }
    }

    public final void release() {
        this.compositeDisposable.dispose();
    }

    public final void setCall(o91 call) {
        this.call = call;
    }
}
