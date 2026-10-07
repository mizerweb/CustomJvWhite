package com.vk.push.core.remote.config.omicron.retriever;

import com.vk.push.core.remote.config.omicron.Data;
import com.vk.push.core.remote.config.omicron.DataId;

/* JADX INFO: loaded from: classes3.dex */
public interface DataRetriever {
    Data getData();

    RetrievalStatus retrieve(DataId dataId, DataQuery dataQuery);
}
