package com.vk.push.core.remote.config.omicron;

import com.vk.push.core.remote.config.omicron.storage.SerializationDataStorage;
import defpackage.atb;
import defpackage.g85;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends atb {
    public final /* synthetic */ g85 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g85 g85Var, OmicronConfig omicronConfig) {
        super(g85Var, omicronConfig);
        this.f = g85Var;
    }

    @Override // defpackage.atb
    public final Data a() {
        SerializationDataStorage serializationDataStorage = (SerializationDataStorage) this.f.a;
        DataId dataId = this.d;
        Data data = serializationDataStorage.getData(dataId);
        if (data != null) {
            b();
            return data;
        }
        Data dataBuild = Data.newBuilder().build();
        this.c.f.onCacheMiss(dataId);
        return dataBuild;
    }
}
