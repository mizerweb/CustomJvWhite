package ru.ok.android.externcalls.sdk.id.local;

import android.util.LongSparseArray;
import defpackage.c76;
import defpackage.du1;
import defpackage.ww3;
import defpackage.yt1;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.ConversationParticipantExtensionsKt;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\tJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\b\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\b\u0010\u0010J\u001b\u0010\n\u001a\u0004\u0018\u00010\u00072\n\u0010\u0006\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\n\u0010\u0010J\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b2\n\u0010\u0006\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\f\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0016J!\u0010\u0019\u001a\u00020\u00142\n\u0010\u0018\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u0003R8\u0010\u001e\u001a&\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00070\u001cj\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u0007`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR8\u0010 \u001a&\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\u0004\u0012\u00020\u00070\u001cj\u0012\u0012\b\u0012\u00060\u000ej\u0002`\u000f\u0012\u0004\u0012\u00020\u0007`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R<\u0010&\u001a*\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\"0\u001cj\u0014\u0012\u0004\u0012\u00020%\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\"`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001f¨\u0006'"}, d2 = {"Lru/ok/android/externcalls/sdk/id/local/LocalIdMappings;", "", "<init>", "()V", "Lyt1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "id", "Lru/ok/android/externcalls/sdk/id/local/LocalParticipantId;", "getLocalId", "(Lyt1;)Lru/ok/android/externcalls/sdk/id/local/LocalParticipantId;", "getAnyLocalId", "", "getAllLocalIds", "(Lyt1;)Ljava/util/Set;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Lru/ok/android/externcalls/sdk/id/local/LocalParticipantId;", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;)Ljava/util/Set;", "Lru/ok/android/externcalls/sdk/ConversationParticipant;", "participant", "Lsbi;", "addMappings", "(Lru/ok/android/externcalls/sdk/ConversationParticipant;)V", "removedMappings", "oldExternalId", "deAnonymizeMapping", "(Lru/ok/android/externcalls/sdk/id/ParticipantId;Lru/ok/android/externcalls/sdk/ConversationParticipant;)V", "clearMapping", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "internalToLocalIdMap", "Ljava/util/HashMap;", "externalToLocalIdMap", "Landroid/util/LongSparseArray;", "", "internalIdToLocalIdsMap", "Landroid/util/LongSparseArray;", "", "externalIdToLocalIdsMap", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LocalIdMappings {
    private final HashMap<yt1, LocalParticipantId> internalToLocalIdMap = new HashMap<>();
    private final HashMap<ParticipantId, LocalParticipantId> externalToLocalIdMap = new HashMap<>();
    private final LongSparseArray<Set<LocalParticipantId>> internalIdToLocalIdsMap = new LongSparseArray<>();
    private final HashMap<String, Set<LocalParticipantId>> externalIdToLocalIdsMap = new HashMap<>();

    public final void addMappings(ConversationParticipant participant) {
        yt1 yt1Var;
        LocalParticipantId localParticipantIdExt = ConversationParticipantExtensionsKt.getLocalParticipantIdExt(participant);
        du1 callParticipant = participant.getCallParticipant();
        if (callParticipant != null && (yt1Var = callParticipant.a) != null) {
            this.internalToLocalIdMap.put(yt1Var, localParticipantIdExt);
            long j = yt1Var.a;
            Set<LocalParticipantId> linkedHashSet = this.internalIdToLocalIdsMap.get(j);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
                this.internalIdToLocalIdsMap.put(j, linkedHashSet);
            }
            linkedHashSet.add(localParticipantIdExt);
        }
        ParticipantId externalId = participant.getExternalId();
        if (externalId != null) {
            this.externalToLocalIdMap.put(externalId, localParticipantIdExt);
            HashMap<String, Set<LocalParticipantId>> map = this.externalIdToLocalIdsMap;
            String str = externalId.id;
            Set<LocalParticipantId> linkedHashSet2 = map.get(str);
            if (linkedHashSet2 == null) {
                linkedHashSet2 = new LinkedHashSet<>();
                map.put(str, linkedHashSet2);
            }
            linkedHashSet2.add(localParticipantIdExt);
        }
    }

    public final void clearMapping() {
        this.internalToLocalIdMap.clear();
        this.externalIdToLocalIdsMap.clear();
    }

    public final void deAnonymizeMapping(ParticipantId oldExternalId, ConversationParticipant participant) {
        this.externalToLocalIdMap.remove(oldExternalId);
        this.externalIdToLocalIdsMap.remove(oldExternalId.id);
        addMappings(participant);
    }

    public final Set<LocalParticipantId> getAllLocalIds(yt1 id) {
        Set<LocalParticipantId> set = this.internalIdToLocalIdsMap.get(id.a);
        return set == null ? c76.a : set;
    }

    public final LocalParticipantId getAnyLocalId(yt1 id) {
        Set<LocalParticipantId> set = this.internalIdToLocalIdsMap.get(id.a);
        if (set != null) {
            return (LocalParticipantId) ww3.s1(set);
        }
        return null;
    }

    public final LocalParticipantId getLocalId(yt1 id) {
        return this.internalToLocalIdMap.get(id);
    }

    public final void removedMappings(ConversationParticipant participant) {
        yt1 yt1Var;
        LocalParticipantId localParticipantIdExt = ConversationParticipantExtensionsKt.getLocalParticipantIdExt(participant);
        du1 callParticipant = participant.getCallParticipant();
        if (callParticipant != null && (yt1Var = callParticipant.a) != null) {
            this.internalToLocalIdMap.remove(yt1Var);
            long j = yt1Var.a;
            Set<LocalParticipantId> set = this.internalIdToLocalIdsMap.get(j);
            if (set != null) {
                set.remove(localParticipantIdExt);
                if (set.isEmpty()) {
                    this.internalIdToLocalIdsMap.remove(j);
                }
            }
        }
        ParticipantId externalId = participant.getExternalId();
        if (externalId != null) {
            this.externalToLocalIdMap.remove(externalId);
            String str = externalId.id;
            Set<LocalParticipantId> set2 = this.externalIdToLocalIdsMap.get(str);
            if (set2 != null) {
                set2.remove(localParticipantIdExt);
                if (set2.isEmpty()) {
                    this.externalIdToLocalIdsMap.remove(str);
                }
            }
        }
    }

    public final LocalParticipantId getLocalId(ParticipantId id) {
        return this.externalToLocalIdMap.get(id);
    }

    public final Set<LocalParticipantId> getAllLocalIds(ParticipantId id) {
        Set<LocalParticipantId> set = this.externalIdToLocalIdsMap.get(id.id);
        return set == null ? c76.a : set;
    }

    public final LocalParticipantId getAnyLocalId(ParticipantId id) {
        Set<LocalParticipantId> set = this.externalIdToLocalIdsMap.get(id.id);
        if (set != null) {
            return (LocalParticipantId) ww3.s1(set);
        }
        return null;
    }
}
