package ru.ok.android.externcalls.sdk.id;

import defpackage.dnf;
import defpackage.h64;
import defpackage.i3f;
import defpackage.j64;
import defpackage.k64;
import defpackage.oo;
import defpackage.yt1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.ConversationParticipantExtensionsKt;
import ru.ok.android.externcalls.sdk.id.local.LocalIdMappings;
import ru.ok.android.externcalls.sdk.id.local.LocalParticipantId;
import ru.ok.android.externcalls.sdk.id.mapping.IdsMapper;
import ru.ok.android.externcalls.sdk.id.mapping.MappingContext;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;

/* JADX INFO: loaded from: classes3.dex */
public class ExternalIdsResolver {
    private final ExtraResolver extraResolver;
    private final IdMappingWrapper idMappingWrapper;
    private final IdsMapper<yt1, ParticipantId> idsMapper;
    private final LocalIdMappings localIdMappings;
    private final ParticipantPrivateStateModifier participantPrivateStateModifier;
    private final ParticipantStore store;

    public interface ExtraResolver {
        ParticipantId onExternalByInternalResolution(ConversationParticipant conversationParticipant);
    }

    public interface ParticipantPrivateStateModifier {
        void setExternalId(ConversationParticipant conversationParticipant, ParticipantId participantId);
    }

    public ExternalIdsResolver(ParticipantStore participantStore, IdMappingWrapper idMappingWrapper, ExtraResolver extraResolver, ParticipantPrivateStateModifier participantPrivateStateModifier, LocalIdMappings localIdMappings, IdsMapper<yt1, ParticipantId> idsMapper) {
        this.store = participantStore;
        this.idMappingWrapper = idMappingWrapper;
        this.extraResolver = extraResolver;
        this.participantPrivateStateModifier = participantPrivateStateModifier;
        this.localIdMappings = localIdMappings;
        this.idsMapper = idsMapper;
    }

    private void applyExternals(Map<yt1, ParticipantId> map) {
        for (Map.Entry<yt1, ParticipantId> entry : map.entrySet()) {
            yt1 key = entry.getKey();
            ParticipantId value = entry.getValue();
            ConversationParticipant byInternal = this.store.getByInternal(key);
            this.idMappingWrapper.addMapping(value, key);
            if (byInternal != null) {
                this.localIdMappings.addMappings(byInternal);
                this.participantPrivateStateModifier.setExternalId(byInternal, value);
            }
        }
    }

    private void collectExternalIdResolutionCandidatesForSessionRoom(List<yt1> list, Map<LocalParticipantId, ConversationParticipant> map) {
        for (ConversationParticipant conversationParticipant : map.values()) {
            if (conversationParticipant.getExternalId() == null) {
                ParticipantId participantIdOnExternalByInternalResolution = this.extraResolver.onExternalByInternalResolution(conversationParticipant);
                if (participantIdOnExternalByInternalResolution == null) {
                    list.add(ConversationParticipantExtensionsKt.getInternalIdExt(conversationParticipant));
                } else {
                    this.participantPrivateStateModifier.setExternalId(conversationParticipant, participantIdOnExternalByInternalResolution);
                    this.idMappingWrapper.addMapping(participantIdOnExternalByInternalResolution, ConversationParticipantExtensionsKt.getInternalIdExt(conversationParticipant));
                    this.localIdMappings.addMappings(conversationParticipant);
                }
            }
        }
    }

    public /* synthetic */ void lambda$resolveIds$0(List list, MappingContext mappingContext) throws Throwable {
        applyExternals(this.idsMapper.map(list, mappingContext));
    }

    public List<yt1> collectExternalIdResolutionCandidates() {
        ArrayList arrayList = new ArrayList();
        Map<dnf, Map<LocalParticipantId, ConversationParticipant>> roomToParticipantsMap = this.store.getRoomToParticipantsMap();
        Iterator<dnf> it = roomToParticipantsMap.keySet().iterator();
        while (it.hasNext()) {
            Map<LocalParticipantId, ConversationParticipant> map = roomToParticipantsMap.get(it.next());
            if (map != null) {
                collectExternalIdResolutionCandidatesForSessionRoom(arrayList, map);
            }
        }
        return arrayList;
    }

    public h64 resolveIds(List<yt1> list, MappingContext mappingContext) {
        return list.isEmpty() ? j64.a : new k64(0, new oo(this, list, mappingContext, 6)).c(i3f.b());
    }
}
