package com.vk.push.core.filedatastore.flow;

import com.vk.push.core.filedatastore.FileDataStore;
import defpackage.ao5;
import defpackage.cqk;
import defpackage.gu4;
import defpackage.lb5;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Lcom/vk/push/core/filedatastore/FileDataStore;", "Lgu4;", "scope", "Lcom/vk/push/core/filedatastore/flow/FlowableFileDataStore;", "flowableFileDataStore", "(Lcom/vk/push/core/filedatastore/FileDataStore;Lgu4;)Lcom/vk/push/core/filedatastore/flow/FlowableFileDataStore;", "core_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class FlowableFileDataStoreImplKt {
    public static final <T> FlowableFileDataStore<T> flowableFileDataStore(FileDataStore<T> fileDataStore, gu4 gu4Var) {
        return new FlowableFileDataStoreImpl(fileDataStore, gu4Var);
    }

    public static FlowableFileDataStore flowableFileDataStore$default(FileDataStore fileDataStore, gu4 gu4Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ao5 ao5Var = ao5.a;
            gu4Var = cqk.a(lb5.c);
        }
        return flowableFileDataStore(fileDataStore, gu4Var);
    }
}
