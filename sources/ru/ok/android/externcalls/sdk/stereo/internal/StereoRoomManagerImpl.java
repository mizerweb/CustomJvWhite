package ru.ok.android.externcalls.sdk.stereo.internal;

import defpackage.af7;
import defpackage.alg;
import defpackage.bu1;
import defpackage.cf7;
import defpackage.du1;
import defpackage.enf;
import defpackage.eq0;
import defpackage.esh;
import defpackage.i62;
import defpackage.j62;
import defpackage.j95;
import defpackage.ja1;
import defpackage.k62;
import defpackage.l62;
import defpackage.pg4;
import defpackage.sbi;
import defpackage.sc2;
import defpackage.ww3;
import defpackage.xre;
import defpackage.y3e;
import defpackage.yt1;
import defpackage.z62;
import defpackage.zkg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.stereo.hands.StereoRoomHandsQueueImpl;
import ru.ok.android.externcalls.sdk.stereo.internal.command.StereoRoomCommandExecutor;
import ru.ok.android.externcalls.sdk.stereo.internal.listener.StereoRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager;
import ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomManagerListener;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 d2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002edBG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001c\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ3\u0010\u001e\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ3\u0010\u001f\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ3\u0010 \u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019H\u0016¢\u0006\u0004\b \u0010\u001dJ?\u0010$\u001a\u00020\u00172\n\u0010#\u001a\u00060!j\u0002`\"2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019H\u0016¢\u0006\u0004\b$\u0010%J?\u0010&\u001a\u00020\u00172\n\u0010#\u001a\u00060!j\u0002`\"2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019H\u0016¢\u0006\u0004\b&\u0010%J?\u0010'\u001a\u00020\u00172\n\u0010#\u001a\u00060!j\u0002`\"2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019H\u0016¢\u0006\u0004\b'\u0010%J?\u0010(\u001a\u00020\u00172\n\u0010#\u001a\u00060!j\u0002`\"2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019H\u0016¢\u0006\u0004\b(\u0010%J\u0017\u0010+\u001a\u00020\u00172\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00172\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00172\u0006\u0010.\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00172\u0006\u0010.\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00172\u0006\u0010.\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00172\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J?\u0010>\u001a\u00020\u00172\n\u0010#\u001a\u00060!j\u0002`\"2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019H\u0016¢\u0006\u0004\b>\u0010%J?\u0010?\u001a\u00020\u00172\n\u0010#\u001a\u00060!j\u0002`\"2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019H\u0016¢\u0006\u0004\b?\u0010%J\u0018\u0010@\u001a\u00020\u00172\u0006\u0010*\u001a\u00020)H\u0096\u0001¢\u0006\u0004\b@\u0010,J?\u0010A\u001a\u00020\u00172\n\u0010#\u001a\u00060!j\u0002`\"2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019H\u0002¢\u0006\u0004\bA\u0010%J#\u0010E\u001a\n\u0018\u00010Cj\u0004\u0018\u0001`D2\n\u0010B\u001a\u00060!j\u0002`\"H\u0002¢\u0006\u0004\bE\u0010FJ#\u0010H\u001a\n\u0018\u00010!j\u0004\u0018\u0001`\"2\n\u0010G\u001a\u00060Cj\u0002`DH\u0002¢\u0006\u0004\bH\u0010IJ/\u0010M\u001a\u00020\u00172\u0010\u0010K\u001a\f\u0012\b\u0012\u00060Cj\u0002`D0J2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\bM\u0010NJA\u0010O\u001a\u00020\u00172\n\u0010#\u001a\u00060!j\u0002`\"2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019H\u0002¢\u0006\u0004\bO\u0010%JI\u0010P\u001a\u00020\u00172\n\u0010#\u001a\u00060!j\u0002`\"2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00192\u0016\u0010L\u001a\u0012\u0012\b\u0012\u00060Cj\u0002`D\u0012\u0004\u0012\u00020\u00170\u0019H\u0002¢\u0006\u0004\bP\u0010QJ1\u0010R\u001a\u00020\u00172\n\u0010#\u001a\u00060!j\u0002`\"2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0019H\u0002¢\u0006\u0004\bR\u0010SR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010TR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010UR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010VR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010WR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010XR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010YR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010ZR\u001a\u0010\\\u001a\u00020[8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R$\u0010a\u001a\u00020:2\u0006\u0010`\u001a\u00020:8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\ba\u0010c¨\u0006f"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl;", "Lru/ok/android/externcalls/sdk/stereo/StereoRoomManager;", "Lz62;", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomListenerManager;", "Ly3e;", "logger", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idResolver", "Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$GrantRolesRequest;", "grantRolesRequest", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "commandExecutor", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "listenersManager", "Lesh;", "timeProvider", "<init>", "(Ly3e;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$GrantRolesRequest;Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;Lesh;)V", "Lkotlin/Function0;", "Lsbi;", "onSuccess", "Lkotlin/Function1;", "", "onError", "requestPromotion", "(Laf7;Lcf7;)V", "cancelPromotionRequest", "acceptPromotion", "rejectPromotion", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "promoteParticipant", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Laf7;Lcf7;)V", "revokePromotion", "rejectPromotionRequest", "unpromoteParticipant", "Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener;", "listener", "addListener", "(Lru/ok/android/externcalls/sdk/stereo/listener/StereoRoomManagerListener;)V", "Li62;", "event", "onAttendee", "(Li62;)V", "Lk62;", "onHandUp", "(Lk62;)V", "Lj62;", "onFeedback", "(Lj62;)V", "Ll62;", "onPromotionUpdated", "(Ll62;)V", "", "isMeInWaitingRoom", "onMeInWaitingRoomChanged", "(Z)V", "grantAdmin", "revokeAdmin", "removeListener", "revokeRoles", "externalId", "Lyt1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "getInternalId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lyt1;", "internalId", "getExternalId", "(Lyt1;)Lru/ok/android/externcalls/sdk/id/ParticipantId;", "", "ids", "block", "resolveIdsAndThen", "(Ljava/util/List;Laf7;)V", "unpromoteParticipantImpl", "withInternalId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lcf7;Lcf7;)V", "idNotResolved", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lcf7;)V", "Ly3e;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$GrantRolesRequest;", "Lru/ok/android/externcalls/sdk/stereo/internal/command/StereoRoomCommandExecutor;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lru/ok/android/externcalls/sdk/stereo/internal/listener/StereoRoomListenerManagerImpl;", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl;", "handsQueue", "Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl;", "getHandsQueue", "()Lru/ok/android/externcalls/sdk/stereo/hands/StereoRoomHandsQueueImpl;", SdkMetricStatEvent.VALUE_KEY, "isMePromoted", "Z", "()Z", "Companion", "GrantRolesRequest", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StereoRoomManagerImpl implements StereoRoomManager, z62, StereoRoomListenerManager {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String LOG_TAG = "StereoRoomManagerImpl";
    private final StereoRoomCommandExecutor commandExecutor;
    private final GrantRolesRequest grantRolesRequest;
    private final StereoRoomHandsQueueImpl handsQueue;
    private final IdMappingWrapper idMappingWrapper;
    private final IdMappingResolver idResolver;
    private boolean isMePromoted;
    private final StereoRoomListenerManagerImpl listenersManager;
    private final y3e logger;
    private final ParticipantStore store;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JE\u0010\u000e\u001a\u00020\r2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$GrantRolesRequest;", "", "Lyt1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "participantId", "", "revoke", "", "Lbu1;", "roles", "Ljava/lang/Runnable;", "onSuccess", "onError", "Lsbi;", "grantRoles", "(Lyt1;Z[Lbu1;Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public interface GrantRolesRequest {
        void grantRoles(yt1 participantId, boolean revoke, bu1[] roles, Runnable onSuccess, Runnable onError);
    }

    public StereoRoomManagerImpl(y3e y3eVar, ParticipantStore participantStore, IdMappingResolver idMappingResolver, GrantRolesRequest grantRolesRequest, StereoRoomCommandExecutor stereoRoomCommandExecutor, IdMappingWrapper idMappingWrapper, StereoRoomListenerManagerImpl stereoRoomListenerManagerImpl, esh eshVar) {
        this.logger = y3eVar;
        this.store = participantStore;
        this.idResolver = idMappingResolver;
        this.grantRolesRequest = grantRolesRequest;
        this.commandExecutor = stereoRoomCommandExecutor;
        this.idMappingWrapper = idMappingWrapper;
        this.listenersManager = stereoRoomListenerManagerImpl;
        this.handsQueue = new StereoRoomHandsQueueImpl(stereoRoomCommandExecutor, new StereoRoomManagerImpl$handsQueue$1(this), new StereoRoomManagerImpl$handsQueue$2(this), stereoRoomListenerManagerImpl, eshVar);
    }

    public final ParticipantId getExternalId(yt1 internalId) {
        ParticipantId externalId;
        ConversationParticipant byInternal = this.store.getByInternal(internalId);
        return (byInternal == null || (externalId = byInternal.getExternalId()) == null) ? this.idMappingWrapper.getByInternal(internalId) : externalId;
    }

    private final yt1 getInternalId(ParticipantId externalId) {
        yt1 internalId;
        ConversationParticipant byExternal = this.store.getByExternal(externalId);
        return (byExternal == null || (internalId = byExternal.getInternalId()) == null) ? this.idMappingWrapper.getByExternal(externalId) : internalId;
    }

    public static final void grantAdmin$lambda$0$1(cf7 cf7Var) {
        if (cf7Var != null) {
            cf7Var.invoke(new RuntimeException("Grant admin failed"));
        }
    }

    public final void idNotResolved(ParticipantId participantId, cf7 onError) {
        if (onError != null) {
            onError.invoke(new RuntimeException("Can't resolve internal id of participant " + participantId));
        }
    }

    public static final sbi onAttendee$lambda$0(StereoRoomManagerImpl stereoRoomManagerImpl, i62 i62Var) {
        StereoRoomListenerManagerImpl stereoRoomListenerManagerImpl = stereoRoomManagerImpl.listenersManager;
        int i = i62Var.a;
        List list = i62Var.c;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ParticipantId externalId = stereoRoomManagerImpl.getExternalId((yt1) it.next());
            if (externalId != null) {
                arrayList.add(externalId);
            }
        }
        List list2 = i62Var.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            ParticipantId externalId2 = stereoRoomManagerImpl.getExternalId((yt1) it2.next());
            if (externalId2 != null) {
                arrayList2.add(externalId2);
            }
        }
        stereoRoomListenerManagerImpl.onListenersChanged(new StereoRoomManagerListener.ListenersUpdated(i, arrayList2, arrayList));
        return sbi.a;
    }

    public static final sbi promoteParticipant$lambda$0(StereoRoomManagerImpl stereoRoomManagerImpl, af7 af7Var, cf7 cf7Var, yt1 yt1Var) {
        stereoRoomManagerImpl.commandExecutor.promoteParticipant(new StereoRoomCommandExecutor.PromoteParticipantParams(yt1Var, true), af7Var, cf7Var);
        return sbi.a;
    }

    public final void resolveIdsAndThen(List<yt1> ids, af7 block) {
        ArrayList arrayList = new ArrayList();
        for (yt1 yt1Var : ids) {
            if (getExternalId(yt1Var) == null) {
                arrayList.add(yt1Var);
            }
        }
        if (arrayList.isEmpty()) {
            block.invoke();
        } else {
            this.idResolver.resolveExternalsByInternalsIds(arrayList, new eq0(9, block), new sc2(this, arrayList, ids, block, 13));
        }
    }

    public static final void resolveIdsAndThen$lambda$2(StereoRoomManagerImpl stereoRoomManagerImpl, List list, List list2, af7 af7Var) {
        stereoRoomManagerImpl.logger.log(LOG_TAG, "Something went wrong during internal to external id list resolution");
        if (list.size() < list2.size()) {
            af7Var.invoke();
        }
    }

    public static final void revokeAdmin$lambda$0$1(cf7 cf7Var) {
        if (cf7Var != null) {
            cf7Var.invoke(new RuntimeException("Revoke admin failed"));
        }
    }

    private final void revokeRoles(ParticipantId participantId, af7 onSuccess, cf7 onError) {
        ConversationParticipant byExternal = this.store.getByExternal(participantId);
        du1 callParticipant = byExternal != null ? byExternal.getCallParticipant() : null;
        if (callParticipant == null) {
            onSuccess.invoke();
            return;
        }
        List list = callParticipant.e;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        bu1 bu1Var = bu1.b;
        if (list.contains(bu1Var)) {
            linkedHashSet.add(bu1Var);
        }
        bu1 bu1Var2 = bu1.c;
        if (list.contains(bu1Var2)) {
            linkedHashSet.add(bu1Var2);
        }
        if (linkedHashSet.isEmpty()) {
            onSuccess.invoke();
            return;
        }
        GrantRolesRequest grantRolesRequest = this.grantRolesRequest;
        yt1 yt1Var = callParticipant.a;
        if (yt1Var == null) {
            return;
        }
        grantRolesRequest.grantRoles(yt1Var, true, (bu1[]) linkedHashSet.toArray(new bu1[0]), new eq0(8, onSuccess), new enf(1, onError));
    }

    public static final void revokeRoles$lambda$1(cf7 cf7Var) {
        if (cf7Var != null) {
            cf7Var.invoke(new RuntimeException("Revoke all roles failed"));
        }
    }

    public static final sbi unpromoteParticipant$lambda$0(StereoRoomManagerImpl stereoRoomManagerImpl, ParticipantId participantId, af7 af7Var, cf7 cf7Var) {
        stereoRoomManagerImpl.unpromoteParticipantImpl(participantId, af7Var, cf7Var);
        return sbi.a;
    }

    private final void unpromoteParticipantImpl(ParticipantId participantId, af7 onSuccess, cf7 onError) {
        withInternalId(participantId, onError, new zkg(this, onSuccess, onError, 1));
    }

    public static final sbi unpromoteParticipantImpl$lambda$0(StereoRoomManagerImpl stereoRoomManagerImpl, af7 af7Var, cf7 cf7Var, yt1 yt1Var) {
        stereoRoomManagerImpl.commandExecutor.promoteParticipant(new StereoRoomCommandExecutor.PromoteParticipantParams(yt1Var, false), af7Var, cf7Var);
        return sbi.a;
    }

    private final void withInternalId(ParticipantId participantId, cf7 onError, cf7 block) {
        this.idResolver.withInternalId(participantId, new pg4(4, block), new alg(this, participantId, onError, 0));
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void acceptPromotion(af7 onSuccess, cf7 onError) {
        this.commandExecutor.acceptPromotion(new StereoRoomCommandExecutor.AcceptPromotionParams(false), onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager
    public void addListener(StereoRoomManagerListener listener) {
        this.listenersManager.addListener(listener);
        listener.onOwnPromotionChanged(getIsMePromoted());
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void cancelPromotionRequest(af7 onSuccess, cf7 onError) {
        this.commandExecutor.requestPromotion(new StereoRoomCommandExecutor.RequestPromotionParams(true), onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void grantAdmin(ParticipantId participantId, af7 onSuccess, cf7 onError) {
        yt1 internalId = getInternalId(participantId);
        if (internalId != null) {
            this.grantRolesRequest.grantRoles(internalId, false, new bu1[]{bu1.b}, new eq0(10, onSuccess), new enf(2, onError));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    /* JADX INFO: renamed from: isMePromoted, reason: from getter */
    public boolean getIsMePromoted() {
        return this.isMePromoted;
    }

    @Override // defpackage.z62
    public void onAttendee(i62 event) {
        resolveIdsAndThen(ww3.G1(event.c, event.b), new xre(this, 19, event));
    }

    @Override // defpackage.z62
    public void onFeedback(j62 event) {
    }

    @Override // defpackage.z62
    public void onHandUp(k62 event) {
        getHandsQueue().onHandUp(event);
    }

    @Override // defpackage.z62
    public void onMeInWaitingRoomChanged(boolean isMeInWaitingRoom) {
        this.isMePromoted = !isMeInWaitingRoom;
        this.listenersManager.onOwnPromotionChanged(getIsMePromoted());
    }

    @Override // defpackage.z62
    public void onPromotionUpdated(l62 event) {
        this.listenersManager.onPromotionRequestUpdated(new StereoRoomManagerListener.PromotionRequestUpdated(event.a));
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void promoteParticipant(ParticipantId participantId, af7 onSuccess, cf7 onError) {
        withInternalId(participantId, onError, new zkg(this, onSuccess, onError, 0));
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void rejectPromotion(af7 onSuccess, cf7 onError) {
        this.commandExecutor.acceptPromotion(new StereoRoomCommandExecutor.AcceptPromotionParams(true), onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void rejectPromotionRequest(ParticipantId participantId, af7 onSuccess, cf7 onError) {
        unpromoteParticipantImpl(participantId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.listener.StereoRoomListenerManager
    public void removeListener(StereoRoomManagerListener listener) {
        this.listenersManager.removeListener(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void requestPromotion(af7 onSuccess, cf7 onError) {
        this.commandExecutor.requestPromotion(new StereoRoomCommandExecutor.RequestPromotionParams(false), onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void revokeAdmin(ParticipantId participantId, af7 onSuccess, cf7 onError) {
        yt1 internalId = getInternalId(participantId);
        if (internalId != null) {
            this.grantRolesRequest.grantRoles(internalId, true, new bu1[]{bu1.b}, new eq0(11, onSuccess), new enf(3, onError));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void revokePromotion(ParticipantId participantId, af7 onSuccess, cf7 onError) {
        unpromoteParticipantImpl(participantId, onSuccess, onError);
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public void unpromoteParticipant(ParticipantId participantId, af7 onSuccess, cf7 onError) {
        revokeRoles(participantId, new ja1(this, participantId, onSuccess, onError, 14), onError);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/stereo/internal/StereoRoomManagerImpl$Companion;", "", "<init>", "()V", "LOG_TAG", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }

    @Override // ru.ok.android.externcalls.sdk.stereo.StereoRoomManager
    public StereoRoomHandsQueueImpl getHandsQueue() {
        return this.handsQueue;
    }
}
