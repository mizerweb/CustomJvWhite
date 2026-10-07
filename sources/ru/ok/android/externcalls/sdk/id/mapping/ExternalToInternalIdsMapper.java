package ru.ok.android.externcalls.sdk.id.mapping;

import android.os.Looper;
import defpackage.ore;
import defpackage.s66;
import defpackage.uza;
import defpackage.y3e;
import defpackage.yt1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.BatchInternalIdResponse;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00182\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u000e2\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u0014\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00132\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/ok/android/externcalls/sdk/id/mapping/ExternalToInternalIdsMapper;", "Lru/ok/android/externcalls/sdk/id/mapping/IdsMapper;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lyt1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "okApiService", "Ly3e;", "rtcLog", "<init>", "(Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;Ly3e;)V", "", "from", "", "filterEmptyParticipantIds", "(Ljava/util/Collection;)Ljava/util/List;", "Lru/ok/android/externcalls/sdk/id/mapping/MappingContext;", "mappingContext", "", "map", "(Ljava/util/Collection;Lru/ok/android/externcalls/sdk/id/mapping/MappingContext;)Ljava/util/Map;", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "Ly3e;", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ExternalToInternalIdsMapper implements IdsMapper<ParticipantId, yt1> {
    private static final String LOG_TAG = "ExternalToInternalIdsMapper";
    private final OkApiServiceInternal okApiService;
    private final y3e rtcLog;

    public ExternalToInternalIdsMapper(OkApiServiceInternal okApiServiceInternal, y3e y3eVar) {
        this.okApiService = okApiServiceInternal;
        this.rtcLog = y3eVar;
    }

    private final List<ParticipantId> filterEmptyParticipantIds(Collection<ParticipantId> from) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : from) {
            ParticipantId participantId = (ParticipantId) obj;
            if (participantId.id.length() == 0) {
                this.rtcLog.reportException(LOG_TAG, "Empty participant id", new IllegalArgumentException("Empty participant id"));
            }
            if (participantId.id.length() > 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // ru.ok.android.externcalls.sdk.id.mapping.IdsMapper
    public Map<ParticipantId, yt1> map(Collection<? extends ParticipantId> from, MappingContext mappingContext) {
        LinkedHashMap linkedHashMap;
        Map<ParticipantId, yt1> map;
        mappingContext.logContextIfNeeded();
        boolean z = uza.a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            ore.k("Background thread expected");
            return null;
        }
        List<ParticipantId> listFilterEmptyParticipantIds = filterEmptyParticipantIds(from);
        boolean zIsEmpty = listFilterEmptyParticipantIds.isEmpty();
        s66 s66Var = s66.a;
        if (zIsEmpty) {
            return s66Var;
        }
        try {
            Iterable<BatchInternalIdResponse> iterable = (Iterable) this.okApiService.getOkIdsByExternalIds(listFilterEmptyParticipantIds).d();
            ArrayList arrayList = new ArrayList();
            for (BatchInternalIdResponse batchInternalIdResponse : iterable) {
                if (batchInternalIdResponse == null || (map = batchInternalIdResponse.externalToInternalIdsMap) == null) {
                    linkedHashMap = null;
                } else {
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<ParticipantId, yt1> entry : map.entrySet()) {
                        if (entry.getKey() != null && entry.getValue() != null) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
                if (linkedHashMap != null) {
                    arrayList.add(linkedHashMap);
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                linkedHashMap2.putAll((Map) it.next());
            }
            return linkedHashMap2;
        } catch (Throwable th) {
            this.rtcLog.logException(LOG_TAG, "Can't map external ids to internal", th);
            return s66Var;
        }
    }
}
