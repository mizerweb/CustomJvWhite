package com.vk.push.core.network.http;

import java.net.HttpURLConnection;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/vk/push/core/network/http/URLConnectionHeadersInterceptorFactory;", "", "", "", "headers", "Lcom/vk/push/core/network/http/URLConnectionInterceptor;", "create", "(Ljava/util/Map;)Lcom/vk/push/core/network/http/URLConnectionInterceptor;", "core-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class URLConnectionHeadersInterceptorFactory {
    public static final URLConnectionHeadersInterceptorFactory INSTANCE = new URLConnectionHeadersInterceptorFactory();

    public final URLConnectionInterceptor create(final Map<String, String> headers) {
        return new URLConnectionInterceptor() { // from class: com.vk.push.core.network.http.URLConnectionHeadersInterceptorFactory.create.1
            @Override // com.vk.push.core.network.http.URLConnectionInterceptor
            public void intercept(HttpURLConnection connection, HttpRequest request) {
                for (Map.Entry entry : headers.entrySet()) {
                    connection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
        };
    }
}
