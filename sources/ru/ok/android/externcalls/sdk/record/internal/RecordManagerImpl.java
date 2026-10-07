package ru.ok.android.externcalls.sdk.record.internal;

import defpackage.af7;
import defpackage.b5g;
import defpackage.bnf;
import defpackage.c5g;
import defpackage.cf7;
import defpackage.cqk;
import defpackage.d12;
import defpackage.dnf;
import defpackage.e12;
import defpackage.ebe;
import defpackage.f12;
import defpackage.fw1;
import defpackage.g12;
import defpackage.gw1;
import defpackage.h12;
import defpackage.h7b;
import defpackage.hw1;
import defpackage.i7b;
import defpackage.iw1;
import defpackage.j95;
import defpackage.jw1;
import defpackage.lb;
import defpackage.ode;
import defpackage.q4g;
import defpackage.x81;
import defpackage.y3e;
import defpackage.yt1;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.RecordEventListener;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.record.RecordDescription;
import ru.ok.android.externcalls.sdk.record.RecordDescriptionHistory;
import ru.ok.android.externcalls.sdk.record.RecordManager;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;
import ru.ok.android.externcalls.sdk.signaling.SignalingProviderKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 m2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001mB?\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010!\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J=\u0010)\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020#2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010$2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001b\u0018\u00010&H\u0016¢\u0006\u0004\b)\u0010*J=\u0010,\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020+2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010$2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u001b\u0018\u00010&H\u0016¢\u0006\u0004\b,\u0010-J\u0011\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b/\u00100J\u001b\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020201H\u0016¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\n\u0018\u000105j\u0004\u0018\u0001`6¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u001b2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020=H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010A\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020@H\u0016¢\u0006\u0004\bA\u0010BJ\u001f\u0010E\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u00152\u0006\u0010D\u001a\u00020\u0015H\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u001b2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bG\u0010<J\u0015\u0010H\u001a\u0004\u0018\u00010.*\u00020\u0017H\u0002¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u0004\u0018\u00010\u0017*\u00020.H\u0002¢\u0006\u0004\bJ\u0010KJ1\u0010N\u001a\u00020\u001b2\u000e\u0010L\u001a\n\u0018\u000105j\u0004\u0018\u0001`62\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010M\u001a\u0004\u0018\u00010.H\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u001bH\u0002¢\u0006\u0004\bP\u0010QJ\u001f\u0010S\u001a\u00020\u001b2\u000e\u0010R\u001a\n\u0018\u000105j\u0004\u0018\u0001`6H\u0002¢\u0006\u0004\bS\u0010TJ\u0017\u0010W\u001a\u00020\u001b2\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\bW\u0010XR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010YR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010ZR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010[R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\\R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010]R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010^R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020\u000f0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR0\u0010h\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020.0fj\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020.`g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR0\u0010j\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u0002020fj\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u000202`g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010iR\u0016\u0010k\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006n"}, d2 = {"Lru/ok/android/externcalls/sdk/record/internal/RecordManagerImpl;", "Lru/ok/android/externcalls/sdk/record/RecordManager;", "Lh12;", "Ljw1;", "Lode;", "Ly3e;", "logger", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "participantStore", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idMappingResolver", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "signalingProvider", "Lru/ok/android/externcalls/sdk/events/RecordEventListener;", "deprecatedRecordListener", "", "isStrongModeEnabled", "<init>", "(Ly3e;Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;Lru/ok/android/externcalls/sdk/events/RecordEventListener;Z)V", "Ldnf;", "sessionRoomId", "Lfw1;", "getActiveRecording", "(Ldnf;)Lfw1;", "listener", "Lsbi;", "addRecordListener", "(Lru/ok/android/externcalls/sdk/events/RecordEventListener;)V", "removeRecordListener", "Ld12;", "params", "onCurrentParticipantActiveRoomChanged", "(Ld12;)V", "Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "startRecord", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StartParams;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;", "stopRecord", "(Lru/ok/android/externcalls/sdk/record/RecordManager$StopParams;Laf7;Lcf7;)V", "Lru/ok/android/externcalls/sdk/record/RecordDescription;", "getRecordDescription", "()Lru/ok/android/externcalls/sdk/record/RecordDescription;", "", "Lru/ok/android/externcalls/sdk/record/RecordDescriptionHistory;", "getRecordDescriptionHistory", "()Ljava/util/Map;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "getRecordAdmin", "()Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lhw1;", "info", "onRecordStarted", "(Lhw1;)V", "Liw1;", "onRecordStopped", "(Liw1;)V", "Lgw1;", "onRecordError", "(Lgw1;)V", "oldRoomId", "newRoomId", "notifyListenersWhenActiveRoomChanged", "(Ldnf;Ldnf;)V", "applyRecordStarted", "toRecordDescription", "(Lfw1;)Lru/ok/android/externcalls/sdk/record/RecordDescription;", "toCallRecordDescription", "(Lru/ok/android/externcalls/sdk/record/RecordDescription;)Lfw1;", "initiatorId", "current", "setMyRecordHistory", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Ldnf;Lru/ok/android/externcalls/sdk/record/RecordDescription;)V", "reportStarted", "()V", "whoStoppedRecordId", "reportStopped", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "", "description", "reportError", "(Ljava/lang/String;)V", "Ly3e;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "Lru/ok/android/externcalls/sdk/signaling/SignalingProvider;", "Lru/ok/android/externcalls/sdk/events/RecordEventListener;", "Z", "Lebe;", "commandParamsCreator", "Lebe;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "listeners", "Ljava/util/concurrent/CopyOnWriteArraySet;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "sessionRoomToRecordInfo", "Ljava/util/HashMap;", "sessionRoomToRecordInfoHistory", "activeRoomId", "Ldnf;", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RecordManagerImpl implements RecordManager, h12, jw1, ode {
    private static final Companion Companion = new Companion(null);
    private static final String KEY_REMOVE_ERROR = "removeError";
    private static final String LOG_TAG = "RecordManagerImpl";
    private final RecordEventListener deprecatedRecordListener;
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private final boolean isStrongModeEnabled;
    private final y3e logger;
    private final ParticipantStore participantStore;
    private final SignalingProvider signalingProvider;
    private final ebe commandParamsCreator = new ebe();
    private final CopyOnWriteArraySet<RecordEventListener> listeners = new CopyOnWriteArraySet<>();
    private final HashMap<dnf, RecordDescription> sessionRoomToRecordInfo = new HashMap<>();
    private final HashMap<dnf, RecordDescriptionHistory> sessionRoomToRecordInfoHistory = new HashMap<>();
    private dnf activeRoomId = bnf.a;

    public RecordManagerImpl(y3e y3eVar, ParticipantStore participantStore, IdMappingResolver idMappingResolver, IdMappingWrapper idMappingWrapper, SignalingProvider signalingProvider, RecordEventListener recordEventListener, boolean z) {
        this.logger = y3eVar;
        this.participantStore = participantStore;
        this.idMappingResolver = idMappingResolver;
        this.idMappingWrapper = idMappingWrapper;
        this.signalingProvider = signalingProvider;
        this.deprecatedRecordListener = recordEventListener;
        this.isStrongModeEnabled = z;
    }

    public final void applyRecordStarted(hw1 info) {
        fw1 fw1Var = info.b;
        dnf dnfVar = info.a;
        RecordDescription recordDescription = toRecordDescription(fw1Var);
        if (recordDescription == null) {
            return;
        }
        setMyRecordHistory(recordDescription.getInitiator(), dnfVar, recordDescription);
        this.sessionRoomToRecordInfo.put(dnfVar, recordDescription);
        if (dnfVar.equals(this.activeRoomId)) {
            reportStarted();
        }
    }

    private final void notifyListenersWhenActiveRoomChanged(dnf oldRoomId, dnf newRoomId) {
        if (this.sessionRoomToRecordInfo.get(oldRoomId) != null) {
            RecordDescription recordDescription = this.sessionRoomToRecordInfo.get(oldRoomId);
            reportStopped(recordDescription != null ? recordDescription.getInitiator() : null);
        }
        if (this.sessionRoomToRecordInfo.get(newRoomId) != null) {
            reportStarted();
        }
    }

    public static final void onRecordStarted$lambda$1(RecordManagerImpl recordManagerImpl) {
        recordManagerImpl.logger.log(LOG_TAG, "Can't resolve internal id");
    }

    private final void reportError(String description) {
        this.deprecatedRecordListener.onRecordError(description);
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((RecordEventListener) it.next()).onRecordError(description);
        }
    }

    private final void reportStarted() {
        this.deprecatedRecordListener.onRecordStarted();
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((RecordEventListener) it.next()).onRecordStarted();
        }
    }

    private final void reportStopped(ParticipantId whoStoppedRecordId) {
        ConversationParticipant byExternal = whoStoppedRecordId != null ? this.participantStore.getByExternal(whoStoppedRecordId) : null;
        this.deprecatedRecordListener.onRecordStopped(byExternal);
        Iterator<T> it = this.listeners.iterator();
        while (it.hasNext()) {
            ((RecordEventListener) it.next()).onRecordStopped(byExternal);
        }
    }

    private final void setMyRecordHistory(ParticipantId initiatorId, dnf sessionRoomId, RecordDescription current) {
        ConversationParticipant me2 = this.participantStore.getMe();
        if (cqk.d(initiatorId, me2 != null ? me2.getExternalId() : null)) {
            HashMap<dnf, RecordDescriptionHistory> map = this.sessionRoomToRecordInfoHistory;
            RecordDescriptionHistory recordDescriptionHistory = map.get(sessionRoomId);
            map.put(sessionRoomId, new RecordDescriptionHistory(current, recordDescriptionHistory != null ? recordDescriptionHistory.getCurrentState() : null));
        }
    }

    public static final void startRecord$lambda$0(RecordManager.StartParams startParams, af7 af7Var, JSONObject jSONObject) {
        if (startParams.getOnSuccess() != null) {
            startParams.getOnSuccess().invoke(new RecordManager.StartRecordInfo());
        } else if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void startRecord$lambda$1(RecordManagerImpl recordManagerImpl, RecordManager.StartParams startParams, cf7 cf7Var, JSONObject jSONObject) {
        String string;
        if ("error".equals(jSONObject.optString("type"))) {
            string = jSONObject.optString("message");
            recordManagerImpl.reportError(string);
        } else {
            string = null;
        }
        String string2 = jSONObject.toString();
        if (string == null) {
            string = jSONObject.toString();
        }
        RecordManager.RecordStartError recordStartError = new RecordManager.RecordStartError(string2, string);
        recordManagerImpl.logger.logException(LOG_TAG, "Can't start record", recordStartError);
        cf7 onError = startParams.getOnError();
        if (onError != null) {
            cf7Var = onError;
        }
        if (cf7Var != null) {
            cf7Var.invoke(recordStartError);
        }
    }

    public static final void stopRecord$lambda$0(RecordManager.StopParams stopParams, af7 af7Var, JSONObject jSONObject) {
        RecordManager.StopRecordInfo.RemoveResult removeResult;
        if (stopParams.getOnSuccess() == null) {
            if (af7Var != null) {
                af7Var.invoke();
            }
        } else {
            if (!stopParams.getRemoveRecord()) {
                removeResult = RecordManager.StopRecordInfo.RemoveResult.NOT_REQUESTED;
            } else if (jSONObject.has(KEY_REMOVE_ERROR)) {
                removeResult = cqk.d(jSONObject.optString(KEY_REMOVE_ERROR), "record.remove_unsupported") ? RecordManager.StopRecordInfo.RemoveResult.NOT_SUPPORTED : RecordManager.StopRecordInfo.RemoveResult.NOT_REMOVED;
            } else {
                removeResult = RecordManager.StopRecordInfo.RemoveResult.REMOVED;
            }
            stopParams.getOnSuccess().invoke(new RecordManager.StopRecordInfo(removeResult));
        }
    }

    public static final void stopRecord$lambda$1(RecordManagerImpl recordManagerImpl, RecordManager.StopParams stopParams, cf7 cf7Var, JSONObject jSONObject) {
        String string;
        if ("error".equals(jSONObject.optString("type"))) {
            string = jSONObject.optString("message");
            recordManagerImpl.reportError(string);
        } else {
            string = null;
        }
        String string2 = jSONObject.toString();
        if (string == null) {
            string = jSONObject.toString();
        }
        RecordManager.RecordStopError recordStopError = new RecordManager.RecordStopError(string2, string);
        cf7 onError = stopParams.getOnError();
        if (onError != null) {
            cf7Var = onError;
        }
        if (cf7Var != null) {
            cf7Var.invoke(recordStopError);
        }
        recordManagerImpl.logger.logException(LOG_TAG, "Can't stop record", recordStopError);
    }

    private final fw1 toCallRecordDescription(RecordDescription recordDescription) {
        yt1 byExternal;
        ConversationParticipant participantById = this.participantStore.getParticipantById(recordDescription.getInitiator());
        if ((participantById == null || (byExternal = participantById.getInternalId()) == null) && (byExternal = this.idMappingWrapper.getByExternal(recordDescription.getInitiator())) == null) {
            return null;
        }
        return new fw1(recordDescription.getMovieId(), recordDescription.getType(), byExternal, recordDescription.getStart(), recordDescription.getExternalMovieId(), recordDescription.getExternalOwnerId());
    }

    private final RecordDescription toRecordDescription(fw1 fw1Var) {
        ParticipantId byInternal;
        ConversationParticipant byInternal2 = this.participantStore.getByInternal(fw1Var.c);
        if ((byInternal2 == null || (byInternal = byInternal2.getExternalId()) == null) && (byInternal = this.idMappingWrapper.getByInternal(fw1Var.c)) == null) {
            return null;
        }
        return new RecordDescription(byInternal, fw1Var.b, fw1Var.d, fw1Var.a, fw1Var.e, fw1Var.f);
    }

    @Override // ru.ok.android.externcalls.sdk.record.RecordManager
    public void addRecordListener(RecordEventListener listener) {
        this.listeners.add(listener);
    }

    @Override // defpackage.ode
    public fw1 getActiveRecording(dnf sessionRoomId) {
        RecordDescription recordDescription = this.sessionRoomToRecordInfo.get(sessionRoomId);
        if (recordDescription != null) {
            return toCallRecordDescription(recordDescription);
        }
        return null;
    }

    public final ParticipantId getRecordAdmin() {
        RecordDescription recordDescription = this.sessionRoomToRecordInfo.get(this.activeRoomId);
        if (recordDescription != null) {
            return recordDescription.getInitiator();
        }
        return null;
    }

    @Override // ru.ok.android.externcalls.sdk.record.RecordManager
    public RecordDescription getRecordDescription() {
        return this.sessionRoomToRecordInfo.get(this.activeRoomId);
    }

    @Override // ru.ok.android.externcalls.sdk.record.RecordManager
    public Map<dnf, RecordDescriptionHistory> getRecordDescriptionHistory() {
        return this.sessionRoomToRecordInfoHistory;
    }

    @Override // defpackage.h12
    public void onCurrentParticipantActiveRoomChanged(d12 params) {
        dnf dnfVar = params.a;
        if (dnfVar.equals(this.activeRoomId)) {
            return;
        }
        dnf dnfVar2 = this.activeRoomId;
        this.activeRoomId = dnfVar;
        notifyListenersWhenActiveRoomChanged(dnfVar2, dnfVar);
    }

    @Override // defpackage.h12
    public void onCurrentParticipantInvitedToRoom(e12 e12Var) {
        e12Var.getClass();
    }

    public void onRecordError(gw1 info) {
        reportError(info.a);
    }

    @Override // defpackage.jw1
    public void onRecordStarted(hw1 info) {
        ParticipantStore participantStore = this.participantStore;
        yt1 yt1Var = info.b.c;
        if (participantStore.getByInternal(yt1Var) != null) {
            applyRecordStarted(info);
        } else {
            this.idMappingResolver.resolveExternalsByInternalsIds(Collections.singletonList(yt1Var), new i7b(this, 28, info), new h7b(12, this));
        }
    }

    @Override // defpackage.jw1
    public void onRecordStopped(iw1 info) {
        HashMap<dnf, RecordDescription> map = this.sessionRoomToRecordInfo;
        dnf dnfVar = info.a;
        RecordDescription recordDescription = map.get(dnfVar);
        setMyRecordHistory(recordDescription != null ? recordDescription.getInitiator() : null, dnfVar, null);
        this.sessionRoomToRecordInfo.remove(dnfVar);
        if (dnfVar.equals(this.activeRoomId)) {
            yt1 yt1Var = info.b;
            ConversationParticipant byInternal = yt1Var != null ? this.participantStore.getByInternal(yt1Var) : null;
            reportStopped(byInternal != null ? byInternal.getExternalId() : null);
        }
    }

    @Override // defpackage.h12
    public void onRoomRemoved(f12 f12Var) {
        f12Var.getClass();
    }

    @Override // defpackage.h12
    public void onRoomUpdated(g12 g12Var) {
        g12Var.getClass();
    }

    @Override // ru.ok.android.externcalls.sdk.record.RecordManager
    public void removeRecordListener(RecordEventListener listener) {
        this.listeners.remove(listener);
    }

    @Override // ru.ok.android.externcalls.sdk.record.RecordManager
    public void startRecord(RecordManager.StartParams params, af7 onSuccess, cf7 onError) {
        q4g q4gVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (q4gVar == null) {
            return;
        }
        ebe ebeVar = this.commandParamsCreator;
        boolean isStream = params.getIsStream();
        Long movieId = params.getMovieId();
        dnf sessionRoomId = params.getSessionRoomId();
        if (sessionRoomId == null) {
            sessionRoomId = this.activeRoomId;
        }
        dnf dnfVar = sessionRoomId;
        Long groupId = params.getGroupId();
        CharSequence name = params.getName();
        CharSequence description = params.getDescription();
        String privacy = params.getPrivacy();
        String albumId = params.getAlbumId();
        boolean z = this.isStrongModeEnabled;
        ebeVar.getClass();
        privacy.getClass();
        dnfVar.getClass();
        Calendar calendar = Calendar.getInstance();
        if (name == null) {
            name = String.format(Locale.getDefault(), "%4d-%2d-%2d %2d:%2d:%2d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(1)), Integer.valueOf(calendar.get(2) + 1), Integer.valueOf(calendar.get(5)), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12)), Integer.valueOf(calendar.get(13))}, 6));
        }
        q4gVar.d(new b5g(movieId, name, description, privacy, groupId, albumId, isStream, dnfVar, z), false, new lb(params, 3, onSuccess), new x81(this, params, onError, 5));
    }

    @Override // ru.ok.android.externcalls.sdk.record.RecordManager
    public void stopRecord(RecordManager.StopParams params, af7 onSuccess, cf7 onError) {
        q4g q4gVar = SignalingProviderKt.get(this.signalingProvider, onError);
        if (q4gVar == null) {
            return;
        }
        ebe ebeVar = this.commandParamsCreator;
        dnf sessionRoomId = params.getSessionRoomId();
        if (sessionRoomId == null) {
            sessionRoomId = this.activeRoomId;
        }
        boolean removeRecord = params.getRemoveRecord();
        boolean z = this.isStrongModeEnabled;
        ebeVar.getClass();
        sessionRoomId.getClass();
        q4gVar.d(new c5g(sessionRoomId, removeRecord, z), false, new lb(params, 2, onSuccess), new x81(this, params, onError, 4));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ok/android/externcalls/sdk/record/internal/RecordManagerImpl$Companion;", "", "<init>", "()V", "LOG_TAG", "", "KEY_REMOVE_ERROR", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }
}
