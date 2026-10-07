package ru.ok.android.externcalls.sdk.participant.collection;

import defpackage.bnf;
import defpackage.cnf;
import defpackage.cqk;
import defpackage.dnf;
import defpackage.qe7;
import defpackage.xmf;
import defpackage.yt1;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Predicate;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.ConversationParticipantExtensionsKt;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.local.LocalParticipantId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010!\u001a\u00020\u00102\n\u0010 \u001a\u00060\u001ej\u0002`\u001f¢\u0006\u0004\b!\u0010\"J\u001b\u0010$\u001a\u0004\u0018\u00010\u00022\n\u0010#\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b$\u0010\u000fJ\u001d\u0010%\u001a\u0004\u0018\u00010\u00022\n\u0010 \u001a\u00060\u001ej\u0002`\u001fH\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010'\u001a\u00020\u00152\n\u0010#\u001a\u00060\u000bj\u0002`\f¢\u0006\u0004\b'\u0010(J\u0019\u0010)\u001a\u00020\u00152\n\u0010 \u001a\u00060\u001ej\u0002`\u001f¢\u0006\u0004\b)\u0010*J\u001f\u0010)\u001a\u00020\u00152\u0010\u0010,\u001a\f\u0012\b\u0012\u00060\u001ej\u0002`\u001f0+¢\u0006\u0004\b)\u0010-J\u001b\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020+2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b.\u0010/J)\u00103\u001a\u001e\u0012\u0004\u0012\u00020\u001a\u0012\u0014\u0012\u0012\u0012\b\u0012\u000601j\u0002`2\u0012\u0004\u0012\u00020\u00020000¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b5\u00106J\u001f\u00109\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u001a2\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u001a2\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b;\u0010:J\u0015\u0010<\u001a\u00020\u00152\u0006\u00108\u001a\u000207¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0015¢\u0006\u0004\b>\u0010?J\u001f\u0010B\u001a\u00020\u00152\u0006\u0010@\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020\u001aH\u0002¢\u0006\u0004\bB\u0010CJ\u001d\u0010E\u001a\u0004\u0018\u00010\u00022\n\u0010D\u001a\u000601j\u0002`2H\u0002¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u00152\u0006\u0010D\u001a\u000201H\u0002¢\u0006\u0004\bG\u0010HJ3\u0010L\u001a\u001e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00020Jj\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0002`K2\u0006\u0010I\u001a\u00020\u001aH\u0002¢\u0006\u0004\bL\u0010MR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010NRx\u0010Q\u001af\u0012\u0004\u0012\u00020\u001a\u0012(\u0012&\u0012\b\u0012\u000601j\u0002`2\u0012\u0004\u0012\u00020\u00020Jj\u0012\u0012\b\u0012\u000601j\u0002`2\u0012\u0004\u0012\u00020\u0002`K0Oj2\u0012\u0004\u0012\u00020\u001a\u0012(\u0012&\u0012\b\u0012\u000601j\u0002`2\u0012\u0004\u0012\u00020\u00020Jj\u0012\u0012\b\u0012\u000601j\u0002`2\u0012\u0004\u0012\u00020\u0002`K`P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR8\u0010S\u001a&\u0012\b\u0012\u000601j\u0002`2\u0012\u0004\u0012\u00020\u001a0Oj\u0012\u0012\b\u0012\u000601j\u0002`2\u0012\u0004\u0012\u00020\u001a`P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010RR(\u0010U\u001a\u0004\u0018\u0001072\b\u0010T\u001a\u0004\u0018\u0001078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR(\u0010Y\u001a\u0004\u0018\u0001072\b\u0010T\u001a\u0004\u0018\u0001078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bY\u0010V\u001a\u0004\bZ\u0010XR*\u0010[\u001a\u00020\u001a2\u0006\u0010T\u001a\u00020\u001a8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R(\u0010a\u001a\u0004\u0018\u00010\u001a2\b\u0010T\u001a\u0004\u0018\u00010\u001a8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\ba\u0010\\\u001a\u0004\bb\u0010^R\u001a\u0010\u0014\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010c\u001a\u0004\bd\u0010eR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010fR\u0014\u0010k\u001a\u00020h8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010j¨\u0006l"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/collection/ParticipantStore;", "Lru/ok/android/externcalls/sdk/participant/collection/ParticipantCollection;", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "initialMe", "Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;", "localIdMappings", "<init>", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;)V", "", "iterator", "()Ljava/util/Iterator;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "id", "getParticipantById", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lru/ok/android/externcalls/sdk/ConversationParticipant;", "", "hasOtherParticipants", "()Z", "isEmpty", "me", "Lsbi;", "updateMe", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)V", "participant", "addToActiveSessionRoom", "Ldnf;", "sessionRoomId", "add", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;Ldnf;)V", "Lyt1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "internalId", "containsByInternal", "(Lyt1;)Z", "externalId", "getByExternalWithAnyDevice", "getByInternal", "(Lyt1;)Lru/ok/android/externcalls/sdk/ConversationParticipant;", "removeByExternal", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)V", "removeByInternal", "(Lyt1;)V", "", "internalIdsSet", "(Ljava/util/Collection;)V", "getParticipants", "(Ldnf;)Ljava/util/Collection;", "", "Lru/ok/android/externcalls/sdk/id/local/LocalParticipantId;", "Lru/ok/android/externcalls/sdk/participant/collection/LocalId;", "getRoomToParticipantsMap", "()Ljava/util/Map;", "getParticipantRoomId", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)Ldnf;", "Lxmf;", "room", "setActiveSessionRoom", "(Ldnf;Lxmf;)V", "setProposedSessionRoom", "maybeUpdateRoom", "(Lxmf;)V", "clearMapping", "()V", "oldRoomId", "newRoomId", "onActiveRoomChanged", "(Ldnf;Ldnf;)V", "localId", "getByLocal", "(Lru/ok/android/externcalls/sdk/id/local/LocalParticipantId;)Lru/ok/android/externcalls/sdk/ConversationParticipant;", "removeByLocalId", "(Lru/ok/android/externcalls/sdk/id/local/LocalParticipantId;)V", "roomId", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "getSessionRoomParticipantsMap", "(Ldnf;)Ljava/util/LinkedHashMap;", "Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "roomToIdToParticipantMap", "Ljava/util/HashMap;", "localIdToSessionRoomMap", SdkMetricStatEvent.VALUE_KEY, "activeRoom", "Lxmf;", "getActiveRoom", "()Lxmf;", "proposedRoom", "getProposedRoom", "activeRoomId", "Ldnf;", "getActiveRoomId", "()Ldnf;", "setActiveRoomId", "(Ldnf;)V", "proposedRoomId", "getProposedRoomId", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "getMe", "()Lru/ok/android/externcalls/sdk/ConversationParticipant;", "()Ljava/util/Collection;", "participants", "", "getSize", "()I", "size", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ParticipantStore implements ParticipantCollection {
    private xmf activeRoom;
    private final LocalIdMappings localIdMappings;
    private final ConversationParticipant me;
    private xmf proposedRoom;
    private dnf proposedRoomId;
    private final HashMap<dnf, LinkedHashMap<LocalParticipantId, ConversationParticipant>> roomToIdToParticipantMap = new HashMap<>();
    private final HashMap<LocalParticipantId, dnf> localIdToSessionRoomMap = new HashMap<>();
    private dnf activeRoomId = bnf.a;

    public ParticipantStore(ConversationParticipant conversationParticipant, LocalIdMappings localIdMappings) {
        this.localIdMappings = localIdMappings;
        this.me = conversationParticipant;
        updateMe(conversationParticipant);
    }

    private final ConversationParticipant getByLocal(LocalParticipantId localId) {
        LinkedHashMap<LocalParticipantId, ConversationParticipant> linkedHashMap;
        dnf dnfVar = this.localIdToSessionRoomMap.get(localId);
        if (dnfVar == null || (linkedHashMap = this.roomToIdToParticipantMap.get(dnfVar)) == null) {
            return null;
        }
        return linkedHashMap.get(localId);
    }

    private final LinkedHashMap<LocalParticipantId, ConversationParticipant> getSessionRoomParticipantsMap(dnf roomId) {
        HashMap<dnf, LinkedHashMap<LocalParticipantId, ConversationParticipant>> map = this.roomToIdToParticipantMap;
        LinkedHashMap<LocalParticipantId, ConversationParticipant> linkedHashMap = map.get(roomId);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap<>();
            map.put(roomId, linkedHashMap);
        }
        return linkedHashMap;
    }

    private final void onActiveRoomChanged(dnf oldRoomId, dnf newRoomId) {
        ConversationParticipant me2;
        if (cqk.d(oldRoomId, newRoomId) || (me2 = getMe()) == null) {
            return;
        }
        removeByLocalId(ConversationParticipantExtensionsKt.getLocalParticipantIdExt(me2));
        add(me2, newRoomId);
    }

    private final void removeByLocalId(LocalParticipantId localId) {
        ConversationParticipant byLocal = getByLocal(localId);
        if (byLocal != null) {
            this.localIdMappings.removedMappings(byLocal);
        }
        dnf dnfVar = this.localIdToSessionRoomMap.get(localId);
        if (dnfVar == null) {
            return;
        }
        LinkedHashMap<LocalParticipantId, ConversationParticipant> linkedHashMap = this.roomToIdToParticipantMap.get(dnfVar);
        if (linkedHashMap != null) {
            linkedHashMap.remove(localId);
        }
        this.localIdToSessionRoomMap.remove(localId);
    }

    private final void setActiveRoomId(dnf dnfVar) {
        if (cqk.d(this.activeRoomId, dnfVar)) {
            return;
        }
        dnf dnfVar2 = this.activeRoomId;
        this.activeRoomId = dnfVar;
        onActiveRoomChanged(dnfVar2, dnfVar);
    }

    public final void add(ConversationParticipant participant, dnf sessionRoomId) {
        this.localIdMappings.addMappings(participant);
        getSessionRoomParticipantsMap(sessionRoomId).put(ConversationParticipantExtensionsKt.getLocalParticipantIdExt(participant), participant);
        this.localIdToSessionRoomMap.put(ConversationParticipantExtensionsKt.getLocalParticipantIdExt(participant), sessionRoomId);
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends ConversationParticipant> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addToActiveSessionRoom(ConversationParticipant participant) {
        add(participant, this.activeRoomId);
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clearMapping() {
        this.localIdMappings.clearMapping();
    }

    @Override // ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof ConversationParticipant) {
            return contains((ConversationParticipant) obj);
        }
        return false;
    }

    @Override // ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection, java.util.Collection
    public /* bridge */ boolean containsAll(Collection<?> collection) {
        return super.containsAll(collection);
    }

    public final boolean containsByInternal(yt1 internalId) {
        return getByInternal(internalId) != null;
    }

    @Override // ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection
    public /* bridge */ ConversationParticipant get(ParticipantId participantId) {
        return super.get(participantId);
    }

    public final xmf getActiveRoom() {
        return this.activeRoom;
    }

    public final dnf getActiveRoomId() {
        return this.activeRoomId;
    }

    @Override // ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection
    public /* bridge */ ConversationParticipant getByExternal(ParticipantId participantId) {
        return super.getByExternal(participantId);
    }

    public final ConversationParticipant getByExternalWithAnyDevice(ParticipantId externalId) {
        LocalParticipantId anyLocalId = this.localIdMappings.getAnyLocalId(externalId);
        if (anyLocalId == null) {
            return null;
        }
        return getByLocal(anyLocalId);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection
    public ConversationParticipant getByInternal(yt1 internalId) {
        LocalParticipantId localId = this.localIdMappings.getLocalId(internalId);
        if (localId == null) {
            return null;
        }
        return getByLocal(localId);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection
    public ConversationParticipant getMe() {
        return this.me;
    }

    @Override // ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection
    public ConversationParticipant getParticipantById(ParticipantId id) {
        LocalParticipantId localId = this.localIdMappings.getLocalId(id);
        if (localId == null) {
            return null;
        }
        return getByLocal(localId);
    }

    public final dnf getParticipantRoomId(ConversationParticipant participant) {
        return this.localIdToSessionRoomMap.get(ConversationParticipantExtensionsKt.getLocalParticipantIdExt(participant));
    }

    public final Collection<ConversationParticipant> getParticipants(dnf sessionRoomId) {
        return getSessionRoomParticipantsMap(sessionRoomId).values();
    }

    public final xmf getProposedRoom() {
        return this.proposedRoom;
    }

    public final dnf getProposedRoomId() {
        return this.proposedRoomId;
    }

    public final Map<dnf, Map<LocalParticipantId, ConversationParticipant>> getRoomToParticipantsMap() {
        return this.roomToIdToParticipantMap;
    }

    @Override // ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection
    public int getSize() {
        return getParticipants().size();
    }

    @Override // ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection
    public boolean hasOtherParticipants() {
        return size() > 1;
    }

    @Override // ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection, java.util.Collection
    public boolean isEmpty() {
        return getParticipants().isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<ConversationParticipant> iterator() {
        return getParticipants().iterator();
    }

    public final void maybeUpdateRoom(xmf room) {
        dnf dnfVar = this.activeRoomId;
        cnf cnfVar = room.a;
        if (cqk.d(dnfVar, cnfVar)) {
            this.activeRoom = room;
        }
        if (cqk.d(this.proposedRoomId, cnfVar)) {
            this.proposedRoom = room;
        }
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void removeByExternal(ParticipantId externalId) {
        LocalParticipantId localId = this.localIdMappings.getLocalId(externalId);
        if (localId == null) {
            return;
        }
        removeByLocalId(localId);
    }

    public final void removeByInternal(Collection<yt1> internalIdsSet) {
        Iterator<T> it = internalIdsSet.iterator();
        while (it.hasNext()) {
            removeByInternal((yt1) it.next());
        }
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super ConversationParticipant> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setActiveSessionRoom(dnf id, xmf room) {
        setActiveRoomId(id);
        this.activeRoom = room;
    }

    public final void setProposedSessionRoom(dnf id, xmf room) {
        this.proposedRoomId = id;
        this.proposedRoom = room;
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return qe7.L(this);
    }

    public final void updateMe(ConversationParticipant me2) {
        add(me2, this.activeRoomId);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) qe7.M(this, tArr);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection
    public Collection<ConversationParticipant> getParticipants() {
        return getParticipants(this.activeRoomId);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection
    public /* bridge */ boolean contains(ConversationParticipant conversationParticipant) {
        return super.contains(conversationParticipant);
    }

    @Override // ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection
    public /* bridge */ boolean contains(ParticipantId participantId) {
        return super.contains(participantId);
    }

    public final void removeByInternal(yt1 internalId) {
        LocalParticipantId localId = this.localIdMappings.getLocalId(internalId);
        if (localId == null) {
            return;
        }
        removeByLocalId(localId);
    }

    /* JADX INFO: renamed from: add, reason: avoid collision after fix types in other method */
    public boolean add2(ConversationParticipant conversationParticipant) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(ConversationParticipant conversationParticipant) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
