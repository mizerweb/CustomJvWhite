package com.vk.push.core.network.http;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007J\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦\u0002\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/vk/push/core/network/http/HttpOpenConnectionDelegate;", "", "invoke", "Ljava/net/HttpURLConnection;", MLFeatureConfigProviderBase.URL_KEY, "Ljava/net/URL;", "Https", "Unsafe", "Lcom/vk/push/core/network/http/HttpOpenConnectionDelegate$Https;", "Lcom/vk/push/core/network/http/HttpOpenConnectionDelegate$Unsafe;", "core-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface HttpOpenConnectionDelegate {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0096\u0002¨\u0006\u0007"}, d2 = {"Lcom/vk/push/core/network/http/HttpOpenConnectionDelegate$Https;", "Lcom/vk/push/core/network/http/HttpOpenConnectionDelegate;", "()V", "invoke", "Ljava/net/HttpURLConnection;", MLFeatureConfigProviderBase.URL_KEY, "Ljava/net/URL;", "core-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Https implements HttpOpenConnectionDelegate {
        @Override // com.vk.push.core.network.http.HttpOpenConnectionDelegate
        public HttpURLConnection invoke(URL url) throws IOException {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                return (HttpsURLConnection) uRLConnectionOpenConnection;
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0096\u0002¨\u0006\u0007"}, d2 = {"Lcom/vk/push/core/network/http/HttpOpenConnectionDelegate$Unsafe;", "Lcom/vk/push/core/network/http/HttpOpenConnectionDelegate;", "()V", "invoke", "Ljava/net/HttpURLConnection;", MLFeatureConfigProviderBase.URL_KEY, "Ljava/net/URL;", "core-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Unsafe implements HttpOpenConnectionDelegate {
        @Override // com.vk.push.core.network.http.HttpOpenConnectionDelegate
        public HttpURLConnection invoke(URL url) throws IOException {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection instanceof HttpURLConnection) {
                return (HttpURLConnection) uRLConnectionOpenConnection;
            }
            return null;
        }
    }

    HttpURLConnection invoke(URL url);
}
