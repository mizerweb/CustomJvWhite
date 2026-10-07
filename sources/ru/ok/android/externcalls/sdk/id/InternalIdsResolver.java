package ru.ok.android.externcalls.sdk.id;

import defpackage.i3f;
import defpackage.p64;
import defpackage.v7g;
import defpackage.vs4;
import defpackage.yt1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.ConversationParticipantExtensionsKt;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.id.mapping.MappingContext;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

/* JADX INFO: loaded from: classes3.dex */
public class InternalIdsResolver {
    private final IdMappingWrapper idMappingWrapper;
    private final LocalIdMappings localIdMappings;
    private final IdsMapper<ParticipantId, yt1> mapper;
    private final ParticipantPrivateStateModifier stateModifier;
    private final ParticipantStore store;

    public interface ParticipantPrivateStateModifier {
        void setInternalId(ConversationParticipant conversationParticipant, yt1 yt1Var);
    }

    public InternalIdsResolver(ParticipantStore participantStore, IdMappingWrapper idMappingWrapper, ParticipantPrivateStateModifier participantPrivateStateModifier, LocalIdMappings localIdMappings, IdsMapper<ParticipantId, yt1> idsMapper) {
        this.idMappingWrapper = idMappingWrapper;
        this.store = participantStore;
        this.stateModifier = participantPrivateStateModifier;
        this.localIdMappings = localIdMappings;
        this.mapper = idsMapper;
    }

    private void applyInternalIds(Map<ParticipantId, yt1> map) {
        for (Map.Entry<ParticipantId, yt1> entry : map.entrySet()) {
            yt1 value = entry.getValue();
            ParticipantId key = entry.getKey();
            ConversationParticipant byExternal = this.store.getByExternal(key);
            this.idMappingWrapper.addMapping(key, value);
            if (byExternal != null) {
                this.stateModifier.setInternalId(byExternal, value);
                this.localIdMappings.addMappings(byExternal);
            }
        }
    }

    private List<ParticipantId> getResolutionCandidates() {
        ArrayList arrayList = new ArrayList();
        for (ConversationParticipant conversationParticipant : this.store) {
            if (ConversationParticipantExtensionsKt.getInternalIdExt(conversationParticipant) == null) {
                arrayList.add(conversationParticipant.getExternalId());
            }
        }
        return arrayList;
    }

    public /* synthetic */ Set lambda$resolveIdsAndGetFailed$0(MappingContext mappingContext) throws Exception {
        List<ParticipantId> resolutionCandidates = getResolutionCandidates();
        if (resolutionCandidates.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        applyInternalIds(this.mapper.map(resolutionCandidates, mappingContext));
        HashSet hashSet = new HashSet(getResolutionCandidates());
        HashSet hashSet2 = new HashSet(resolutionCandidates);
        hashSet2.retainAll(hashSet);
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            this.store.removeByExternal((ParticipantId) it.next());
        }
        return hashSet2;
    }

    public v7g resolveIdsAndGetFailed(MappingContext mappingContext) {
        return new p64(4, new vs4(this, 8, mappingContext)).j(i3f.b());
    }
}
