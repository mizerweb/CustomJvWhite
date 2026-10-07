package com.vk.push.core.remote.config.omicron.retriever;

import com.vk.push.core.network.http.HttpRequest;
import com.vk.push.core.network.http.HttpResponse;

/* JADX INFO: loaded from: classes2.dex */
public interface RequestExecutor {
    HttpResponse execute(HttpRequest httpRequest) throws Throwable;
}
