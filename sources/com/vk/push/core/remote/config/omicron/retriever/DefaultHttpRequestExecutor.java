package com.vk.push.core.remote.config.omicron.retriever;

import com.vk.push.core.network.http.HttpClient;
import com.vk.push.core.network.http.HttpRequest;
import com.vk.push.core.network.http.HttpResponse;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultHttpRequestExecutor implements RequestExecutor {
    public final HttpClient a;

    public DefaultHttpRequestExecutor(HttpClient httpClient) {
        this.a = httpClient;
    }

    @Override // com.vk.push.core.remote.config.omicron.retriever.RequestExecutor
    public HttpResponse execute(HttpRequest httpRequest) {
        return this.a.executeRequestUnsafe(httpRequest);
    }
}
