package com.vk.push.core.remote.config.omicron;

import com.vk.push.core.remote.config.omicron.executor.DefaultExecutorFactory;
import com.vk.push.core.remote.config.omicron.retriever.DataQuery;
import com.vk.push.core.remote.config.omicron.storage.SerializationDataStorage;
import defpackage.atb;
import defpackage.g85;
import defpackage.i7b;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends atb {
    public final ExecutorService f;
    public final /* synthetic */ g85 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g85 g85Var, OmicronConfig omicronConfig) {
        super(g85Var, omicronConfig);
        this.g = g85Var;
        this.f = ((DefaultExecutorFactory) g85Var.e).newSingleThreadExecutor();
    }

    @Override // defpackage.atb
    public final Data a() {
        DataQuery dataQueryBuild;
        SerializationDataStorage serializationDataStorage = (SerializationDataStorage) this.g.a;
        DataId dataId = this.d;
        Data data = serializationDataStorage.getData(dataId);
        OmicronConfig omicronConfig = this.c;
        if (data == null) {
            data = Data.newBuilder().build();
            dataQueryBuild = DataQuery.newBuilder().environment(omicronConfig.h).userId(omicronConfig.k).fingerprints(omicronConfig.e).build();
            omicronConfig.f.onCacheMiss(dataId);
        } else {
            dataQueryBuild = DataQuery.newBuilder().version(data.getVersion()).condition(data.getCondition()).segments(data.getSegments()).environment(omicronConfig.h).userId(omicronConfig.k).fingerprints(omicronConfig.e).build();
            b();
        }
        this.f.execute(new i7b(this, 1, dataQueryBuild));
        return data;
    }
}
