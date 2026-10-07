package ru.ok.android.externcalls.sdk.participant.state.internal;

import defpackage.af7;
import defpackage.au1;
import defpackage.c76;
import defpackage.cf7;
import defpackage.cnf;
import defpackage.cqk;
import defpackage.j95;
import defpackage.la6;
import defpackage.ma6;
import defpackage.n4g;
import defpackage.nx;
import defpackage.ox;
import defpackage.wm9;
import defpackage.ww3;
import defpackage.x81;
import defpackage.ylc;
import defpackage.yt1;
import defpackage.yw3;
import defpackage.zt1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONObject;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.ConversationEventsListener;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b$\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 o2\u00020\u0001:\u0003pqoB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u0010\u001a\u00020\u000f2\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u001e\u001a\u00020\u000f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ5\u0010#\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b#\u0010$J7\u0010&\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b&\u0010'J;\u0010&\u001a\u00020\u000f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\u00172\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b&\u0010\u001fJ\u0015\u0010*\u001a\u00020)2\u0006\u0010 \u001a\u00020\u0018¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020,H\u0016¢\u0006\u0004\b/\u0010.J\u0017\u00100\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020,H\u0016¢\u0006\u0004\b0\u0010.J\u0017\u00101\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020,H\u0016¢\u0006\u0004\b1\u0010.J\u000f\u00102\u001a\u00020)H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u000f2\u0006\u00104\u001a\u00020)H\u0016¢\u0006\u0004\b5\u00106J\u001b\u00109\u001a\u00020\u000f2\n\u0010\f\u001a\u000607j\u0002`8H\u0016¢\u0006\u0004\b9\u0010:J5\u0010@\u001a\u00020\u000f2\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010;2\u0014\u0010?\u001a\u0010\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u000f\u0018\u00010=H\u0016¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u0019\u0010F\u001a\f\u0012\b\u0012\u000607j\u0002`80EH\u0016¢\u0006\u0004\bF\u0010GJ\u001b\u0010H\u001a\u00020B2\n\u0010\f\u001a\u000607j\u0002`8H\u0016¢\u0006\u0004\bH\u0010IJ\u001b\u0010J\u001a\u00020)2\n\u0010\f\u001a\u000607j\u0002`8H\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020)H\u0016¢\u0006\u0004\bL\u00103J\u0017\u0010N\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020)H\u0016¢\u0006\u0004\bN\u00106J\u000f\u0010O\u001a\u00020BH\u0016¢\u0006\u0004\bO\u0010DJ\u001b\u0010L\u001a\u00020)2\n\u0010\f\u001a\u000607j\u0002`8H\u0016¢\u0006\u0004\bL\u0010KJ\u001b\u0010O\u001a\u00020B2\n\u0010\f\u001a\u000607j\u0002`8H\u0016¢\u0006\u0004\bO\u0010IJ\u0019\u0010P\u001a\f\u0012\b\u0012\u000607j\u0002`80EH\u0016¢\u0006\u0004\bP\u0010GJ\u0017\u0010Q\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\bQ\u0010RJ\r\u0010S\u001a\u00020\u000f¢\u0006\u0004\bS\u0010TJ#\u0010U\u001a\u00020)2\n\u0010\f\u001a\u000607j\u0002`82\u0006\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020B2\u0006\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\bW\u0010XJ#\u0010Y\u001a\u00020B2\n\u0010\f\u001a\u000607j\u0002`82\u0006\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\bY\u0010ZJ\u001f\u0010[\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020,H\u0002¢\u0006\u0004\b[\u0010\\J;\u0010^\u001a\u00020\u000f2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\u00172\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b^\u0010\u001fJ#\u0010^\u001a\u00020\u000f2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020(0\u0017H\u0002¢\u0006\u0004\b^\u0010_J\u0017\u0010a\u001a\u00020\u00192\u0006\u0010`\u001a\u00020)H\u0002¢\u0006\u0004\ba\u0010bJ\u001f\u0010c\u001a\n\u0018\u000107j\u0004\u0018\u0001`8*\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\bc\u0010dJ\u001f\u0010e\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b*\u000607j\u0002`8H\u0002¢\u0006\u0004\be\u0010fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010gR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010hR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010iR0\u0010k\u001a\u001e\u0012\u0004\u0012\u00020\u0018\u0012\u0014\u0012\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020B0j0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR \u0010n\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020m0j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010l¨\u0006r"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStateChanger;", "participantStateChanger", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "stateListener", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStateChanger;Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;)V", "Lyt1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "participantId", "Lau1;", "newState", "Lsbi;", "onStateChanged", "(Lyt1;Lau1;)V", "", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "participants", "onParticipantsRemoved", "(Ljava/util/List;)V", "", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$StateValue;", "states", "Ln4g;", "listener", "errorListener", "updateMyStates", "(Ljava/util/Map;Ln4g;Ln4g;)V", "state", "Lcnf;", "roomId", "resetStates", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;Lcnf;Ln4g;Ln4g;)V", "isOn", "updateOwnState", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$StateValue;Ln4g;Ln4g;)V", "", "", "isOwnStateOn", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;)Z", "Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$Listener;", "addAssistanceRequestListener", "(Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$Listener;)V", "removeAssistanceRequestListener", "addHandListener", "removeHandListener", "isOwnHandRaised", "()Z", "isRaised", "setOwnHandRaised", "(Z)V", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "lowerHandParticipant", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "Lkotlin/Function0;", "onSuccess", "Lkotlin/Function1;", "", "onError", "lowerHandForAll", "(Laf7;Lcf7;)V", "", "getOwnHandRaiseTime", "()J", "", "getRaisedHandIds", "()Ljava/util/Set;", "getHandRaiseTime", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)J", "isHandRaised", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Z", "isAssistanceRequested", "isRequested", "setAssistanceRequested", "getAssistanceRequestTime", "getAssistanceRequestIds", "resetAssistanceRequests", "(Lcnf;)V", "release", "()V", "isParticipantStateOn", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;)Z", "getOwnStateSetupTime", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;)J", "getStateSetupTime", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;)J", "notifyCurrentState", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;Lru/ok/android/externcalls/sdk/participant/state/ParticipantStatesManager$Listener;)V", "updates", "updateOwnStateInternal", "(Ljava/util/Map;)V", "flag", "mapBooleanFlagToStateValue", "(Z)Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$StateValue;", "toExternal", "(Lyt1;)Lru/ok/android/externcalls/sdk/id/ParticipantId;", "toInternal", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lyt1;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStateChanger;", "Lru/ok/android/externcalls/sdk/events/ConversationEventsListener;", "", "statesMap", "Ljava/util/Map;", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesListenerProxy;", "listenersMap", "Companion", "State", "StateValue", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ParticipantStatesManagerImpl implements ParticipantStatesManager {
    private static final String INTERNAL_STATE_OFF = "0";
    private static final String INTERNAL_STATE_ON = "1";
    private final ParticipantStateChanger participantStateChanger;
    private final ConversationEventsListener stateListener;
    private final ParticipantStore store;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final StateValue STATE_ON = StateValue.ON;
    private static final StateValue STATE_OFF = StateValue.OFF;
    private final Map<State, Map<yt1, Long>> statesMap = new LinkedHashMap();
    private final Map<State, ParticipantStatesListenerProxy> listenersMap = new LinkedHashMap();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$State;", "", "key", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "HAND_RAISED", "ASSISTANCE_REQUESTED", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum State {
        HAND_RAISED("hand"),
        ASSISTANCE_REQUESTED("drat");

        private static final /* synthetic */ la6 $ENTRIES = new ma6(values());
        private final String key;

        State(String str) {
            this.key = str;
        }

        public static la6 getEntries() {
            return $ENTRIES;
        }

        public final String getKey() {
            return this.key;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$StateValue;", "", SdkMetricStatEvent.VALUE_KEY, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ON", "OFF", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum StateValue {
        ON(ParticipantStatesManagerImpl.INTERNAL_STATE_ON),
        OFF(ParticipantStatesManagerImpl.INTERNAL_STATE_OFF);

        private static final /* synthetic */ la6 $ENTRIES = new ma6(values());
        private final String value;

        StateValue(String str) {
            this.value = str;
        }

        public static la6 getEntries() {
            return $ENTRIES;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public ParticipantStatesManagerImpl(ParticipantStore participantStore, ParticipantStateChanger participantStateChanger, ConversationEventsListener conversationEventsListener) {
        this.store = participantStore;
        this.participantStateChanger = participantStateChanger;
        this.stateListener = conversationEventsListener;
    }

    private final long getOwnStateSetupTime(State state) {
        ParticipantId externalId = this.store.getMe().getExternalId();
        if (externalId == null) {
            return 0L;
        }
        return getStateSetupTime(externalId, state);
    }

    private final long getStateSetupTime(ParticipantId participantId, State state) {
        Long l;
        Map<yt1, Long> map = this.statesMap.get(state);
        if (map == null || (l = map.get(toInternal(participantId))) == null) {
            return 0L;
        }
        return l.longValue();
    }

    private final boolean isParticipantStateOn(ParticipantId participantId, State state) {
        Map<yt1, Long> map = this.statesMap.get(state);
        if (map != null) {
            return map.containsKey(toInternal(participantId));
        }
        return false;
    }

    public static final void lowerHandForAll$lambda$0(af7 af7Var, JSONObject jSONObject) {
        if (af7Var != null) {
            af7Var.invoke();
        }
    }

    public static final void lowerHandForAll$lambda$1(cf7 cf7Var, JSONObject jSONObject) {
        if (cf7Var != null) {
            cf7Var.invoke(new Exception(jSONObject.toString()));
        }
    }

    private final StateValue mapBooleanFlagToStateValue(boolean flag) {
        return flag ? STATE_ON : STATE_OFF;
    }

    private final void notifyCurrentState(State state, ParticipantStatesManager.Listener listener) {
        Map<yt1, Long> map = this.statesMap.get(state);
        if (map == null || map.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<yt1, Long> entry : map.entrySet()) {
            ParticipantId external = toExternal(entry.getKey());
            ParticipantStatesManager.ParticipantStateChange participantStateChange = external == null ? null : new ParticipantStatesManager.ParticipantStateChange(external, true, entry.getValue().longValue());
            if (participantStateChange != null) {
                arrayList.add(participantStateChange);
            }
        }
        listener.onParticipantStateChanged(this, new ParticipantStatesManager.StateChangedEvent(arrayList));
    }

    public static /* synthetic */ void resetStates$default(ParticipantStatesManagerImpl participantStatesManagerImpl, State state, cnf cnfVar, n4g n4gVar, n4g n4gVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            n4gVar = null;
        }
        if ((i & 8) != 0) {
            n4gVar2 = null;
        }
        participantStatesManagerImpl.resetStates(state, cnfVar, n4gVar, n4gVar2);
    }

    private final ParticipantId toExternal(yt1 yt1Var) {
        ConversationParticipant byInternal = this.store.getByInternal(yt1Var);
        if (byInternal != null) {
            return byInternal.getExternalId();
        }
        return null;
    }

    private final yt1 toInternal(ParticipantId participantId) {
        ConversationParticipant conversationParticipant = this.store.get(participantId);
        if (conversationParticipant != null) {
            return conversationParticipant.getInternalId();
        }
        return null;
    }

    public static /* synthetic */ void updateMyStates$default(ParticipantStatesManagerImpl participantStatesManagerImpl, Map map, n4g n4gVar, n4g n4gVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            n4gVar = null;
        }
        if ((i & 4) != 0) {
            n4gVar2 = null;
        }
        participantStatesManagerImpl.updateMyStates(map, n4gVar, n4gVar2);
    }

    public static /* synthetic */ void updateOwnState$default(ParticipantStatesManagerImpl participantStatesManagerImpl, State state, StateValue stateValue, n4g n4gVar, n4g n4gVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            n4gVar = null;
        }
        if ((i & 8) != 0) {
            n4gVar2 = null;
        }
        participantStatesManagerImpl.updateOwnState(state, stateValue, n4gVar, n4gVar2);
    }

    private final void updateOwnStateInternal(Map<String, String> updates) {
        ConversationParticipant me2 = this.store.getMe();
        yt1 internalId = me2.getInternalId();
        au1 au1Var = new au1(internalId);
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (Map.Entry<String, String> entry : updates.entrySet()) {
            au1Var.a.put(entry.getKey(), new zt1(entry.getValue(), jCurrentTimeMillis));
        }
        this.stateListener.onStateChanged(me2, au1Var);
        onStateChanged(internalId, au1Var);
    }

    public static /* synthetic */ void updateOwnStateInternal$default(ParticipantStatesManagerImpl participantStatesManagerImpl, Map map, n4g n4gVar, n4g n4gVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            n4gVar = null;
        }
        if ((i & 4) != 0) {
            n4gVar2 = null;
        }
        participantStatesManagerImpl.updateOwnStateInternal(map, n4gVar, n4gVar2);
    }

    public static final void updateOwnStateInternal$lambda$0(n4g n4gVar, ParticipantStatesManagerImpl participantStatesManagerImpl, Map map, JSONObject jSONObject) {
        if (n4gVar != null) {
            n4gVar.onResponse(jSONObject);
        }
        participantStatesManagerImpl.updateOwnStateInternal(map);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void addAssistanceRequestListener(ParticipantStatesManager.Listener listener) {
        Map<State, ParticipantStatesListenerProxy> map = this.listenersMap;
        State state = State.ASSISTANCE_REQUESTED;
        ParticipantStatesListenerProxy participantStatesListenerProxy = map.get(state);
        if (participantStatesListenerProxy == null) {
            participantStatesListenerProxy = new ParticipantStatesListenerProxy(this);
            map.put(state, participantStatesListenerProxy);
        }
        participantStatesListenerProxy.addListener(listener);
        notifyCurrentState(state, listener);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void addHandListener(ParticipantStatesManager.Listener listener) {
        Map<State, ParticipantStatesListenerProxy> map = this.listenersMap;
        State state = State.HAND_RAISED;
        ParticipantStatesListenerProxy participantStatesListenerProxy = map.get(state);
        if (participantStatesListenerProxy == null) {
            participantStatesListenerProxy = new ParticipantStatesListenerProxy(this);
            map.put(state, participantStatesListenerProxy);
        }
        participantStatesListenerProxy.addListener(listener);
        notifyCurrentState(state, listener);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public Set<ParticipantId> getAssistanceRequestIds() {
        Map<yt1, Long> map = this.statesMap.get(State.ASSISTANCE_REQUESTED);
        Set<ParticipantId> setX1 = null;
        Set<yt1> setKeySet = map != null ? map.keySet() : null;
        if (setKeySet != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                ParticipantId external = toExternal((yt1) it.next());
                if (external != null) {
                    arrayList.add(external);
                }
            }
            setX1 = ww3.X1(arrayList);
        }
        return setX1 == null ? c76.a : setX1;
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public long getAssistanceRequestTime() {
        return getOwnStateSetupTime(State.ASSISTANCE_REQUESTED);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public long getHandRaiseTime(ParticipantId participantId) {
        return getStateSetupTime(participantId, State.HAND_RAISED);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public long getOwnHandRaiseTime() {
        return getOwnStateSetupTime(State.HAND_RAISED);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public Set<ParticipantId> getRaisedHandIds() {
        Map<yt1, Long> map = this.statesMap.get(State.HAND_RAISED);
        Set<ParticipantId> setX1 = null;
        Set<yt1> setKeySet = map != null ? map.keySet() : null;
        if (setKeySet != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                ParticipantId external = toExternal((yt1) it.next());
                if (external != null) {
                    arrayList.add(external);
                }
            }
            setX1 = ww3.X1(arrayList);
        }
        return setX1 == null ? c76.a : setX1;
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public boolean isAssistanceRequested() {
        return isOwnStateOn(State.ASSISTANCE_REQUESTED);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public boolean isHandRaised(ParticipantId participantId) {
        return isParticipantStateOn(participantId, State.HAND_RAISED);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public boolean isOwnHandRaised() {
        return isOwnStateOn(State.HAND_RAISED);
    }

    public final boolean isOwnStateOn(State state) {
        ParticipantId externalId = this.store.getMe().getExternalId();
        if (externalId == null) {
            return false;
        }
        return isParticipantStateOn(externalId, state);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void lowerHandForAll(af7 onSuccess, cf7 onError) {
        this.participantStateChanger.lowerHandForAll(new nx(7, onSuccess), new ox(7, onError));
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void lowerHandParticipant(ParticipantId participantId) {
        yt1 internalId;
        ParticipantStateChanger participantStateChanger = this.participantStateChanger;
        ConversationParticipant conversationParticipant = this.store.get(participantId);
        if (conversationParticipant == null || (internalId = conversationParticipant.getInternalId()) == null) {
            return;
        }
        ParticipantStateChanger.changeParticipantState$default(participantStateChanger, internalId, Collections.singletonMap(State.HAND_RAISED.getKey(), INTERNAL_STATE_OFF), null, null, 8, null);
    }

    public final void onParticipantsRemoved(List<? extends ConversationParticipant> participants) {
        for (ConversationParticipant conversationParticipant : participants) {
            Iterator<T> it = this.statesMap.values().iterator();
            while (it.hasNext()) {
                ((Map) it.next()).remove(conversationParticipant.getInternalId());
            }
        }
    }

    public final void onStateChanged(yt1 participantId, au1 newState) {
        ParticipantId external;
        ParticipantStatesListenerProxy participantStatesListenerProxy;
        for (State state : State.getEntries()) {
            zt1 zt1Var = (zt1) newState.a.get(state.getKey());
            ParticipantStatesManager.ParticipantStateChange participantStateChange = null;
            String str = zt1Var != null ? zt1Var.a : null;
            if (cqk.d(str, INTERNAL_STATE_ON)) {
                Map<yt1, Long> map = this.statesMap.get(state);
                if (map == null) {
                    this.statesMap.put(state, wm9.S0(new ylc(participantId, Long.valueOf(zt1Var.b))));
                    ParticipantId external2 = toExternal(participantId);
                    if (external2 != null) {
                        participantStateChange = new ParticipantStatesManager.ParticipantStateChange(external2, true, zt1Var.b);
                    }
                } else if (map.get(participantId) == null) {
                    map.put(participantId, Long.valueOf(zt1Var.b));
                    ParticipantId external3 = toExternal(participantId);
                    if (external3 != null) {
                        participantStateChange = new ParticipantStatesManager.ParticipantStateChange(external3, true, zt1Var.b);
                    }
                } else {
                    map.put(participantId, Long.valueOf(zt1Var.b));
                }
            } else if (cqk.d(str, INTERNAL_STATE_OFF)) {
                Map<yt1, Long> map2 = this.statesMap.get(state);
                if ((map2 != null ? map2.remove(participantId) : null) != null && (external = toExternal(participantId)) != null) {
                    participantStateChange = new ParticipantStatesManager.ParticipantStateChange(external, false, 0L);
                }
            }
            if (participantStateChange != null && (participantStatesListenerProxy = this.listenersMap.get(state)) != null) {
                participantStatesListenerProxy.onParticipantStateChanged(this, new ParticipantStatesManager.StateChangedEvent(Collections.singletonList(participantStateChange)));
            }
        }
    }

    public final void release() {
        Iterator<T> it = this.listenersMap.values().iterator();
        while (it.hasNext()) {
            ((ParticipantStatesListenerProxy) it.next()).release();
        }
        this.listenersMap.clear();
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void removeAssistanceRequestListener(ParticipantStatesManager.Listener listener) {
        ParticipantStatesListenerProxy participantStatesListenerProxy = this.listenersMap.get(State.ASSISTANCE_REQUESTED);
        if (participantStatesListenerProxy != null) {
            participantStatesListenerProxy.removeListener(listener);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void removeHandListener(ParticipantStatesManager.Listener listener) {
        ParticipantStatesListenerProxy participantStatesListenerProxy = this.listenersMap.get(State.HAND_RAISED);
        if (participantStatesListenerProxy != null) {
            participantStatesListenerProxy.removeListener(listener);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void resetAssistanceRequests(cnf roomId) {
        resetStates$default(this, State.ASSISTANCE_REQUESTED, roomId, null, null, 12, null);
    }

    public final void resetStates(State state, cnf roomId, n4g listener, n4g errorListener) {
        Set<yt1> setKeySet;
        Map<yt1, Long> map = this.statesMap.get(state);
        if (map == null || (setKeySet = map.keySet()) == null) {
            return;
        }
        Collection<ConversationParticipant> participants = this.store.getParticipants(roomId);
        ArrayList arrayList = new ArrayList(yw3.W0(participants, 10));
        Iterator<T> it = participants.iterator();
        while (it.hasNext()) {
            arrayList.add(((ConversationParticipant) it.next()).getInternalId());
        }
        Set setX1 = ww3.X1(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : setKeySet) {
            if (setX1.contains((yt1) obj)) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.participantStateChanger.changeParticipantState((yt1) it2.next(), Collections.singletonMap(state.getKey(), INTERNAL_STATE_OFF), listener, errorListener);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void setAssistanceRequested(boolean isRequested) {
        updateOwnState$default(this, State.ASSISTANCE_REQUESTED, isRequested ? STATE_ON : STATE_OFF, null, null, 12, null);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public void setOwnHandRaised(boolean isRaised) {
        updateOwnState$default(this, State.HAND_RAISED, isRaised ? STATE_ON : STATE_OFF, null, null, 12, null);
    }

    public final void updateMyStates(Map<State, ? extends StateValue> states, n4g listener, n4g errorListener) {
        yt1 internalId = this.store.getMe().getInternalId();
        if (internalId == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<State, ? extends StateValue> entry : states.entrySet()) {
            StateValue value = entry.getValue();
            Map<yt1, Long> map = this.statesMap.get(entry.getKey());
            if (value != mapBooleanFlagToStateValue(map != null ? map.containsKey(internalId) : false)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(new ylc(((State) entry2.getKey()).getKey(), ((StateValue) entry2.getValue()).getValue()));
        }
        updateOwnStateInternal(wm9.W0(arrayList), listener, errorListener);
    }

    public final void updateOwnState(State state, StateValue stateValue) {
        updateOwnState$default(this, state, stateValue, null, null, 12, null);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$Companion;", "", "<init>", "()V", "STATE_ON", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$StateValue;", "getSTATE_ON", "()Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl$StateValue;", "STATE_OFF", "getSTATE_OFF", "INTERNAL_STATE_ON", "", "INTERNAL_STATE_OFF", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        public final StateValue getSTATE_OFF() {
            return ParticipantStatesManagerImpl.STATE_OFF;
        }

        public final StateValue getSTATE_ON() {
            return ParticipantStatesManagerImpl.STATE_ON;
        }

        private Companion() {
        }
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public long getAssistanceRequestTime(ParticipantId participantId) {
        return getStateSetupTime(participantId, State.ASSISTANCE_REQUESTED);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager
    public boolean isAssistanceRequested(ParticipantId participantId) {
        return isParticipantStateOn(participantId, State.ASSISTANCE_REQUESTED);
    }

    public final void updateOwnState(Map<String, String> map, n4g n4gVar) {
        updateOwnState$default(this, map, n4gVar, null, 4, null);
    }

    public final void updateOwnState(Map<String, String> map) {
        updateOwnState$default(this, map, null, null, 6, null);
    }

    public final void updateOwnState(State state, StateValue stateValue, n4g n4gVar) {
        updateOwnState$default(this, state, stateValue, n4gVar, null, 8, null);
    }

    public static /* synthetic */ void updateOwnState$default(ParticipantStatesManagerImpl participantStatesManagerImpl, Map map, n4g n4gVar, n4g n4gVar2, int i, Object obj) {
        if ((i & 2) != 0) {
            n4gVar = null;
        }
        if ((i & 4) != 0) {
            n4gVar2 = null;
        }
        participantStatesManagerImpl.updateOwnState((Map<String, String>) map, n4gVar, n4gVar2);
    }

    public final void updateOwnState(State state, StateValue isOn, n4g listener, n4g errorListener) {
        updateMyStates(Collections.singletonMap(state, isOn), listener, errorListener);
    }

    public final void updateOwnState(Map<String, String> states, n4g listener, n4g errorListener) {
        updateOwnStateInternal(states, listener, errorListener);
    }

    private final void updateOwnStateInternal(Map<String, String> updates, n4g listener, n4g errorListener) {
        if (updates.isEmpty()) {
            return;
        }
        this.participantStateChanger.changeMyState(updates, new x81(listener, this, updates), errorListener);
    }

    public final void updateMyStates(Map<State, ? extends StateValue> map, n4g n4gVar) {
        updateMyStates$default(this, map, n4gVar, null, 4, null);
    }

    public final void updateMyStates(Map<State, ? extends StateValue> map) {
        updateMyStates$default(this, map, null, null, 6, null);
    }
}
