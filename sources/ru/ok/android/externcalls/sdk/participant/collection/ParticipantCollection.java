package ru.ok.android.externcalls.sdk.participant.collection;

import defpackage.uv8;
import defpackage.yt1;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\t\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH'¢\u0006\u0004\b\u000e\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u0003H&¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0006J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018&X§\u0004¢\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!¨\u0006%À\u0006\u0003"}, d2 = {"Lru/ok/android/externcalls/sdk/participant/collection/ParticipantCollection;", "", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "externalId", "getByExternal", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lru/ok/android/externcalls/sdk/ConversationParticipant;", "Lyt1;", "internalId", "getByInternal", "(Lyt1;)Lru/ok/android/externcalls/sdk/ConversationParticipant;", "", "hasOtherParticipants", "()Z", "isEmpty", "id", "getParticipantById", "get", "contains", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Z", "element", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)Z", "elements", "containsAll", "(Ljava/util/Collection;)Z", "getMe", "()Lru/ok/android/externcalls/sdk/ConversationParticipant;", "me", "", "getSize", "()I", "size", "getParticipants", "()Ljava/util/Collection;", "getParticipants$annotations", "()V", "participants", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface ParticipantCollection extends Collection<ConversationParticipant>, uv8 {
    @Override // java.util.Collection
    /* bridge */ default boolean contains(Object obj) {
        if (obj instanceof ConversationParticipant) {
            return contains((ConversationParticipant) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    default boolean containsAll(Collection<?> elements) {
        Collection<?> collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(((ConversationParticipant) it.next()).getExternalId())) {
                return false;
            }
        }
        return true;
    }

    default ConversationParticipant get(ParticipantId id) {
        return getParticipantById(id);
    }

    default ConversationParticipant getByExternal(ParticipantId externalId) {
        return getParticipantById(externalId);
    }

    ConversationParticipant getByInternal(yt1 internalId);

    ConversationParticipant getMe();

    ConversationParticipant getParticipantById(ParticipantId id);

    Collection<ConversationParticipant> getParticipants();

    int getSize();

    boolean hasOtherParticipants();

    @Override // java.util.Collection
    boolean isEmpty();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean contains(ParticipantCollection participantCollection, ParticipantId participantId) {
            return ParticipantCollection.super.contains(participantId);
        }

        @Deprecated
        public static boolean containsAll(ParticipantCollection participantCollection, Collection<? extends ConversationParticipant> collection) {
            return ParticipantCollection.super.containsAll(collection);
        }

        @Deprecated
        public static ConversationParticipant get(ParticipantCollection participantCollection, ParticipantId participantId) {
            return ParticipantCollection.super.get(participantId);
        }

        @Deprecated
        public static ConversationParticipant getByExternal(ParticipantCollection participantCollection, ParticipantId participantId) {
            return ParticipantCollection.super.getByExternal(participantId);
        }

        public static /* synthetic */ void getParticipants$annotations() {
        }

        @Deprecated
        public static boolean contains(ParticipantCollection participantCollection, ConversationParticipant conversationParticipant) {
            return ParticipantCollection.super.contains(conversationParticipant);
        }
    }

    default boolean contains(ParticipantId id) {
        return getParticipantById(id) != null;
    }

    default boolean contains(ConversationParticipant element) {
        return contains(element.getExternalId());
    }
}
