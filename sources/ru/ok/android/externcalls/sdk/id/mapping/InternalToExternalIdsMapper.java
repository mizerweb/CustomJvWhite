package ru.ok.android.externcalls.sdk.id.mapping;

import android.os.Looper;
import defpackage.j95;
import defpackage.ore;
import defpackage.s66;
import defpackage.uza;
import defpackage.y3e;
import defpackage.yt1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.api.ExternalIdsResponse;
import ru.ok.android.externcalls.sdk.api.OkApiServiceInternal;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00152\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ=\u0010\u0011\u001a\u0016\u0012\b\u0012\u00060\u0002j\u0002`\u0003\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00102\u0010\u0010\r\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ok/android/externcalls/sdk/id/mapping/InternalToExternalIdsMapper;", "Lru/ok/android/externcalls/sdk/id/mapping/IdsMapper;", "Lyt1;", "Lru/ok/android/externcalls/sdk/id/InternalId;", "Lru/ok/android/externcalls/sdk/id/ParticipantId;", "Lru/ok/android/externcalls/sdk/id/ExternalId;", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "okApiService", "Ly3e;", "rtcLog", "<init>", "(Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;Ly3e;)V", "", "from", "Lru/ok/android/externcalls/sdk/id/mapping/MappingContext;", "mappingContext", "", "map", "(Ljava/util/Collection;Lru/ok/android/externcalls/sdk/id/mapping/MappingContext;)Ljava/util/Map;", "Lru/ok/android/externcalls/sdk/api/OkApiServiceInternal;", "Ly3e;", "Companion", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class InternalToExternalIdsMapper implements IdsMapper<yt1, ParticipantId> {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String TAG = "InternalToExternalIdsMapper";
    private final OkApiServiceInternal okApiService;
    private final y3e rtcLog;

    public InternalToExternalIdsMapper(OkApiServiceInternal okApiServiceInternal, y3e y3eVar) {
        this.okApiService = okApiServiceInternal;
        this.rtcLog = y3eVar;
    }

    @Override // ru.ok.android.externcalls.sdk.id.mapping.IdsMapper
    public Map<yt1, ParticipantId> map(Collection<? extends yt1> from, MappingContext mappingContext) {
        LinkedHashMap linkedHashMap;
        Map<yt1, ParticipantId> mapping;
        mappingContext.logContextIfNeeded();
        boolean z = uza.a;
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            ore.k("Background thread expected");
            return null;
        }
        boolean zIsEmpty = from.isEmpty();
        s66 s66Var = s66.a;
        if (zIsEmpty) {
            return s66Var;
        }
        try {
            Iterable<ExternalIdsResponse> iterable = (Iterable) this.okApiService.getExternalIdsByOkIds(from).d();
            ArrayList arrayList = new ArrayList();
            for (ExternalIdsResponse externalIdsResponse : iterable) {
                if (externalIdsResponse == null || (mapping = externalIdsResponse.getMapping()) == null) {
                    linkedHashMap = null;
                } else {
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<yt1, ParticipantId> entry : mapping.entrySet()) {
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
            this.rtcLog.logException(TAG, "Can't map internal ids to external", th);
            return s66Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ok/android/externcalls/sdk/id/mapping/InternalToExternalIdsMapper$Companion;", "", "<init>", "()V", "TAG", "", "calls-sdk"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j95 j95Var) {
            this();
        }

        private Companion() {
        }
    }
}
