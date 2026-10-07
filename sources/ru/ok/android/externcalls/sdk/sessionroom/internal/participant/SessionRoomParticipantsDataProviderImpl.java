package ru.ok.android.externcalls.sdk.sessionroom.internal.participant;

import defpackage.af7;
import defpackage.bnf;
import defpackage.c;
import defpackage.cf7;
import defpackage.cnf;
import defpackage.dd5;
import defpackage.dnf;
import defpackage.e9i;
import defpackage.enf;
import defpackage.eq0;
import defpackage.i8f;
import defpackage.ja1;
import defpackage.ore;
import defpackage.r66;
import defpackage.sbi;
import defpackage.ww3;
import defpackage.xmf;
import defpackage.yde;
import defpackage.yt1;
import defpackage.yw3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.id.IdMappingWrapper;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdMappingResolver;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager;
import ru.ok.android.externcalls.sdk.sessionroom.internal.listener.SessionRoomListenerManagerImpl;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipants;
import ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¡\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004*\u0001J\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00112\u0006\u0010\u0010\u001a\u00020\u00182\u0010\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u0004\u0018\u00010\u001a2\n\u0010\u001d\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J9\u0010*\u001a\u00020&2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0002¢\u0006\u0004\b*\u0010+J+\u0010.\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130-2\u0010\u0010,\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b.\u0010/JE\u00102\u001a\u00020&2\u0010\u0010,\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00112\f\u00101\u001a\b\u0012\u0004\u0012\u00020&002\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0002¢\u0006\u0004\b2\u00103JA\u00104\u001a\u00020&2\u0006\u0010\u0010\u001a\u00020\u00182\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0016¢\u0006\u0004\b4\u00105J?\u00106\u001a\u00020&2\u0018\u0010'\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0-\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0016¢\u0006\u0004\b6\u0010+JE\u0010:\u001a\u00020&2\n\u00109\u001a\u000607j\u0002`82\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$H\u0016¢\u0006\u0004\b:\u0010;JG\u0010>\u001a\u00020&2\n\u0010<\u001a\u000607j\u0002`82\u0016\u0010=\u001a\u0012\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\u0004\u0012\u00020&0$2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020&\u0018\u00010$¢\u0006\u0004\b>\u0010;J3\u0010A\u001a\u0016\u0012\b\u0012\u000607j\u0002`8\u0012\b\u0012\u00060\u0012j\u0002`\u00130@2\u0010\u0010?\u001a\f\u0012\b\u0012\u000607j\u0002`80\u0011¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010ER \u0010H\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020G0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006M"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl;", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipantsDataProvider;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "store", "Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManagerImpl;", "listenerManager", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "idMappingResolver", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "idMappingWrapper", "<init>", "(Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;Lru/ok/android/externcalls/sdk/sessionroom/internal/listener/SessionRoomListenerManagerImpl;Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;)V", "", "Lcnf;", "getRoomIds", "()Ljava/util/Set;", "roomId", "", "Lyt1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "getRoomParticipantIds", "(Lcnf;)Ljava/util/Collection;", "getAllRoomParticipantIds", "()Ljava/util/Collection;", "Ldnf;", "internalIds", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants$Participant;", "mapInternalIdsToSessionRoomParticipants", "(Ldnf;Ljava/util/Collection;)Ljava/util/Collection;", "internalId", "mapInternalIdToSessionRoomParticipant", "(Lyt1;)Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants$Participant;", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "participant", "mapConversationParticipantToSessionRoomParticipant", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants$Participant;", "Lkotlin/Function1;", "Lru/ok/android/externcalls/sdk/sessionroom/participant/SessionRoomParticipants;", "Lsbi;", "onSuccess", "", "onError", "getMainCallParticipantIds", "(Lcf7;Lcf7;)V", "participantIds", "", "getUnresolvedExternalIds", "(Ljava/util/Collection;)Ljava/util/List;", "Lkotlin/Function0;", "onResolve", "resolveParticipantIds", "(Ljava/util/Collection;Laf7;Lcf7;)V", "getRoomParticipants", "(Ldnf;Lcf7;Lcf7;)V", "getAllInRoomParticipants", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "participantId", "getParticipantRoomId", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lcf7;Lcf7;)V", "externalId", "onIdResolved", "resolveInternalIdByExternal", ApiProtocol.PARAM_EXTERNAL_IDS, "", "getInternalIdsByExternal", "(Ljava/util/Collection;)Ljava/util/Map;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/id/mapping/IdMappingResolver;", "Lru/ok/android/externcalls/sdk/id/IdMappingWrapper;", "", "Lxmf;", "knownSessionRooms", "Ljava/util/Map;", "ru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl$roomsListener$1", "roomsListener", "Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantsDataProviderImpl$roomsListener$1;", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SessionRoomParticipantsDataProviderImpl implements SessionRoomParticipantsDataProvider {
    private final IdMappingResolver idMappingResolver;
    private final IdMappingWrapper idMappingWrapper;
    private final Map<cnf, xmf> knownSessionRooms = new LinkedHashMap();
    private final SessionRoomParticipantsDataProviderImpl$roomsListener$1 roomsListener;
    private final ParticipantStore store;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager$OwnRoomsListener, ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl$roomsListener$1] */
    public SessionRoomParticipantsDataProviderImpl(ParticipantStore participantStore, SessionRoomListenerManagerImpl sessionRoomListenerManagerImpl, IdMappingResolver idMappingResolver, IdMappingWrapper idMappingWrapper) {
        this.store = participantStore;
        this.idMappingResolver = idMappingResolver;
        this.idMappingWrapper = idMappingWrapper;
        ?? r1 = new SessionRoomsManager.OwnRoomsListener() { // from class: ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl$roomsListener$1
            @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
            public void onActiveRoomChanged(SessionRoomsManager.SessionRoomInfo event) {
            }

            @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
            public void onProposedRoomChanged(SessionRoomsManager.SessionRoomInfo event) {
            }

            @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
            public void onRoomRemoved(SessionRoomsManager.SessionRoomInfo event) {
                Map map = this.this$0.knownSessionRooms;
                dnf roomId = event.getRoomId();
                e9i.j(map);
                map.remove(roomId);
            }

            @Override // ru.ok.android.externcalls.sdk.sessionroom.SessionRoomsManager.OwnRoomsListener
            public void onRoomUpdated(SessionRoomsManager.SessionRoomInfo event) {
                xmf room = event.getRoom();
                if (room == null) {
                    return;
                }
                this.this$0.knownSessionRooms.put(room.a, room);
            }
        };
        this.roomsListener = r1;
        sessionRoomListenerManagerImpl.addListener(r1);
    }

    public static final sbi getAllInRoomParticipants$lambda$0(Set set, SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl, cf7 cf7Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            cnf cnfVar = (cnf) it.next();
            arrayList.add(new SessionRoomParticipants(cnfVar, sessionRoomParticipantsDataProviderImpl.mapInternalIdsToSessionRoomParticipants(cnfVar, sessionRoomParticipantsDataProviderImpl.getRoomParticipantIds(cnfVar))));
        }
        cf7Var.invoke(arrayList);
        return sbi.a;
    }

    private final Collection<yt1> getAllRoomParticipantIds() {
        Collection<xmf> collectionValues = this.knownSessionRooms.values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((xmf) it.next()).e);
        }
        return yw3.X0(arrayList);
    }

    private final void getMainCallParticipantIds(cf7 onSuccess, cf7 onError) {
        Set setX1 = ww3.X1(getAllRoomParticipantIds());
        ParticipantStore participantStore = this.store;
        bnf bnfVar = bnf.a;
        Collection<ConversationParticipant> participants = participantStore.getParticipants(bnfVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : participants) {
            ConversationParticipant conversationParticipant = (ConversationParticipant) obj;
            if (!conversationParticipant.isAdmin() && !conversationParticipant.isCreator() && !setX1.contains(conversationParticipant.getInternalId())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(yw3.W0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(mapConversationParticipantToSessionRoomParticipant((ConversationParticipant) it.next()));
        }
        onSuccess.invoke(new SessionRoomParticipants(bnfVar, arrayList2));
    }

    private final Set<cnf> getRoomIds() {
        return ww3.X1(this.knownSessionRooms.keySet());
    }

    private final Collection<yt1> getRoomParticipantIds(cnf roomId) {
        xmf xmfVar = this.knownSessionRooms.get(roomId);
        return xmfVar != null ? ww3.T1(xmfVar.e) : r66.a;
    }

    public static final sbi getRoomParticipants$lambda$0(cf7 cf7Var, dnf dnfVar, SessionRoomParticipantsDataProviderImpl sessionRoomParticipantsDataProviderImpl, Collection collection) {
        cf7Var.invoke(new SessionRoomParticipants(dnfVar, sessionRoomParticipantsDataProviderImpl.mapInternalIdsToSessionRoomParticipants(dnfVar, collection)));
        return sbi.a;
    }

    private final List<yt1> getUnresolvedExternalIds(Collection<yt1> participantIds) {
        ArrayList arrayList = new ArrayList();
        for (yt1 yt1Var : participantIds) {
            if (this.idMappingWrapper.getByInternal(yt1Var) == null) {
                arrayList.add(yt1Var);
            }
        }
        return arrayList;
    }

    private final SessionRoomParticipants.Participant mapConversationParticipantToSessionRoomParticipant(ConversationParticipant participant) {
        return new SessionRoomParticipants.Participant(participant.getExternalId(), this.store.getParticipantRoomId(participant), participant);
    }

    private final SessionRoomParticipants.Participant mapInternalIdToSessionRoomParticipant(yt1 internalId) {
        ConversationParticipant byInternal = this.store.getByInternal(internalId);
        if (byInternal != null) {
            return mapConversationParticipantToSessionRoomParticipant(byInternal);
        }
        ParticipantId byInternal2 = this.idMappingWrapper.getByInternal(internalId);
        if (byInternal2 != null) {
            return new SessionRoomParticipants.Participant(byInternal2, null, null);
        }
        return null;
    }

    private final Collection<SessionRoomParticipants.Participant> mapInternalIdsToSessionRoomParticipants(dnf roomId, Collection<yt1> internalIds) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = internalIds.iterator();
        while (it.hasNext()) {
            SessionRoomParticipants.Participant participantMapInternalIdToSessionRoomParticipant = mapInternalIdToSessionRoomParticipant((yt1) it.next());
            if (participantMapInternalIdToSessionRoomParticipant != null) {
                linkedHashMap.put(participantMapInternalIdToSessionRoomParticipant.getId(), participantMapInternalIdToSessionRoomParticipant);
            }
        }
        for (ConversationParticipant conversationParticipant : this.store.getParticipants(roomId)) {
            if (!linkedHashMap.containsKey(conversationParticipant.getExternalId()) && (conversationParticipant.isAdmin() || conversationParticipant.isCreator())) {
                linkedHashMap.put(conversationParticipant.getExternalId(), mapConversationParticipantToSessionRoomParticipant(conversationParticipant));
            }
        }
        return linkedHashMap.values();
    }

    public static final void resolveInternalIdByExternal$lambda$0(cf7 cf7Var, cf7 cf7Var2, ParticipantId participantId, yt1 yt1Var) {
        if (yt1Var != null) {
            cf7Var.invoke(yt1Var);
        } else if (cf7Var2 != null) {
            cf7Var2.invoke(new RuntimeException("Requested external id " + participantId + " resolved to null"));
        }
    }

    public static final void resolveInternalIdByExternal$lambda$1(cf7 cf7Var, ParticipantId participantId) {
        if (cf7Var != null) {
            cf7Var.invoke(new RuntimeException("Requested external id " + participantId + " could not be resolved to internal"));
        }
    }

    private final void resolveParticipantIds(Collection<yt1> participantIds, af7 onResolve, cf7 onError) {
        if (participantIds.isEmpty()) {
            onResolve.invoke();
            return;
        }
        List<yt1> unresolvedExternalIds = getUnresolvedExternalIds(participantIds);
        if (unresolvedExternalIds.isEmpty()) {
            onResolve.invoke();
        } else {
            this.idMappingResolver.resolveExternalsByInternalsIds(unresolvedExternalIds, new eq0(7, onResolve), new enf(0, onError));
        }
    }

    public static final void resolveParticipantIds$lambda$1(cf7 cf7Var) {
        if (cf7Var != null) {
            cf7Var.invoke(new RuntimeException("Can't resolve external ids"));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider
    public void getAllInRoomParticipants(cf7 onSuccess, cf7 onError) {
        Set<cnf> roomIds = getRoomIds();
        if (roomIds.isEmpty()) {
            onSuccess.invoke(r66.a);
        } else {
            resolveParticipantIds(getAllRoomParticipantIds(), new i8f(roomIds, this, onSuccess, 1), onError);
        }
    }

    public final Map<ParticipantId, yt1> getInternalIdsByExternal(Collection<ParticipantId> collection) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ParticipantId participantId : collection) {
            yt1 byExternal = this.idMappingWrapper.getByExternal(participantId);
            if (byExternal == null) {
                c.g(participantId, "Unresolved external participant id ");
                return null;
            }
            linkedHashMap.put(participantId, byExternal);
        }
        return linkedHashMap;
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider
    public void getParticipantRoomId(ParticipantId participantId, cf7 onSuccess, cf7 onError) {
        ConversationParticipant byExternal = this.store.getByExternal(participantId);
        if (byExternal == null) {
            if (onError != null) {
                onError.invoke(new RuntimeException("Participant " + participantId + " not found"));
                return;
            }
            return;
        }
        dnf participantRoomId = this.store.getParticipantRoomId(byExternal);
        if (participantRoomId != null) {
            onSuccess.invoke(participantRoomId);
        } else if (onError != null) {
            onError.invoke(new RuntimeException("Can't find room data for participant " + participantId));
        }
    }

    @Override // ru.ok.android.externcalls.sdk.sessionroom.participant.SessionRoomParticipantsDataProvider
    public void getRoomParticipants(dnf roomId, cf7 onSuccess, cf7 onError) {
        if (roomId instanceof bnf) {
            getMainCallParticipantIds(onSuccess, onError);
        } else if (!(roomId instanceof cnf)) {
            ore.o();
        } else {
            Collection<yt1> roomParticipantIds = getRoomParticipantIds((cnf) roomId);
            resolveParticipantIds(roomParticipantIds, new ja1(onSuccess, roomId, this, roomParticipantIds, 13), onError);
        }
    }

    public final void resolveInternalIdByExternal(ParticipantId externalId, cf7 onIdResolved, cf7 onError) {
        this.idMappingResolver.withInternalId(externalId, new dd5(2, externalId, onIdResolved, onError), new yde(onError, 16, externalId));
    }
}
