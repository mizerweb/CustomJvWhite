package com.vk.push.core.network.http;

import com.vk.push.common.EmptyLogger;
import com.vk.push.common.Logger;
import com.vk.push.core.network.BuildConfig;
import com.vk.push.core.network.exception.VkpnsRequestException;
import defpackage.gm0;
import defpackage.j95;
import defpackage.ore;
import defpackage.poe;
import defpackage.r66;
import defpackage.rx8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/vk/push/core/network/http/HttpClient;", "", "", "connectingTimeout", "readingTimeout", "Lcom/vk/push/core/network/http/BaseHttpHeadersHolder;", "baseHeaders", "", "Lcom/vk/push/core/network/http/URLConnectionInterceptor;", "interceptors", "Lcom/vk/push/core/network/http/HttpOpenConnectionDelegate;", "httpOpenConnection", "Lcom/vk/push/common/Logger;", "logger", "<init>", "(IILcom/vk/push/core/network/http/BaseHttpHeadersHolder;Ljava/util/List;Lcom/vk/push/core/network/http/HttpOpenConnectionDelegate;Lcom/vk/push/common/Logger;)V", "Lcom/vk/push/core/network/http/HttpRequest;", "request", "Lroe;", "Lcom/vk/push/core/network/http/HttpResponse;", "executeRequest-IoAF18A", "(Lcom/vk/push/core/network/http/HttpRequest;)Ljava/lang/Object;", "executeRequest", "executeRequestUnsafe", "(Lcom/vk/push/core/network/http/HttpRequest;)Lcom/vk/push/core/network/http/HttpResponse;", "core-network_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class HttpClient {

    @Deprecated
    public static final int DEFAULT_TIMEOUT_IN_MILLIS = 60000;
    public final int a;
    public final int b;
    public final BaseHttpHeadersHolder c;
    public final List d;
    public final HttpOpenConnectionDelegate e;
    public final Logger f;

    public /* synthetic */ HttpClient(int i, int i2, BaseHttpHeadersHolder baseHttpHeadersHolder, List list, HttpOpenConnectionDelegate httpOpenConnectionDelegate, Logger logger, int i3, j95 j95Var) {
        this((i3 & 1) != 0 ? 60000 : i, (i3 & 2) != 0 ? 60000 : i2, (i3 & 4) != 0 ? new BaseHttpHeadersHolder("7.2.0", BuildConfig.LIBRARY_PACKAGE_NAME, null, 4, null) : baseHttpHeadersHolder, (i3 & 8) != 0 ? r66.a : list, (i3 & 16) != 0 ? new HttpOpenConnectionDelegate.Https() : httpOpenConnectionDelegate, (i3 & 32) != 0 ? new EmptyLogger() : logger);
    }

    public final void a(HttpURLConnection httpURLConnection, HttpRequest httpRequest) throws ProtocolException {
        httpURLConnection.setConnectTimeout(this.a);
        httpURLConnection.setReadTimeout(this.b);
        httpURLConnection.setRequestMethod(httpRequest.getMethod().toUpperCase(Locale.ROOT));
        for (Map.Entry<String, String> entry : this.c.get().entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            try {
                ((URLConnectionInterceptor) it.next()).intercept(httpURLConnection, httpRequest);
            } catch (Exception e) {
                this.f.error("Interceptor execution failed", e);
            }
        }
    }

    public final HttpResponse b(HttpURLConnection httpURLConnection) throws VkpnsRequestException, IOException {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getResponseCode() >= 400 ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream(), StandardCharsets.UTF_8));
            try {
                String strI = gm0.I(bufferedReader);
                bufferedReader.close();
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                if (responseMessage == null) {
                    responseMessage = "Unknown error";
                }
                return new HttpResponse(strI, responseCode, responseMessage);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(bufferedReader, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.f.error("Failed to read response body", e);
            throw new VkpnsRequestException(httpURLConnection.getResponseMessage(), httpURLConnection.getResponseCode());
        }
    }

    public final void c(HttpURLConnection httpURLConnection, HttpRequest httpRequest) {
        String body = httpRequest.getBody();
        if (body == null) {
            return;
        }
        try {
            httpURLConnection.setDoOutput(true);
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(body.getBytes(StandardCharsets.UTF_8));
                outputStream.flush();
                outputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    rx8.n(outputStream, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.f.error("Failed to send request body", e);
            ore.l("Failed to send request body", e);
        }
    }

    /* JADX INFO: renamed from: executeRequest-IoAF18A, reason: not valid java name */
    public final Object m26executeRequestIoAF18A(HttpRequest request) {
        try {
            return executeRequestUnsafe(request);
        } catch (Throwable th) {
            return new poe(th);
        }
    }

    public final HttpResponse executeRequestUnsafe(HttpRequest request) throws Throwable {
        try {
            HttpURLConnection httpURLConnection = null;
            try {
                HttpURLConnection httpURLConnectionInvoke = this.e.invoke(new URL(request.getRu.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase.URL_KEY java.lang.String()));
                if (httpURLConnectionInvoke == null) {
                    throw new IllegalStateException("Only HTTPS protocol is supported");
                }
                try {
                    a(httpURLConnectionInvoke, request);
                    c(httpURLConnectionInvoke, request);
                    HttpResponse httpResponseB = b(httpURLConnectionInvoke);
                    httpURLConnectionInvoke.disconnect();
                    return httpResponseB;
                } catch (Throwable th) {
                    th = th;
                    httpURLConnection = httpURLConnectionInvoke;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            throw th;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid URL: " + request.getRu.ok.android.externcalls.sdk.ml.config.MLFeatureConfigProviderBase.URL_KEY java.lang.String(), e);
        }
    }

    public HttpClient(int i, int i2, BaseHttpHeadersHolder baseHttpHeadersHolder, List<? extends URLConnectionInterceptor> list, HttpOpenConnectionDelegate httpOpenConnectionDelegate, Logger logger) {
        this.a = i;
        this.b = i2;
        this.c = baseHttpHeadersHolder;
        this.d = list;
        this.e = httpOpenConnectionDelegate;
        this.f = logger.createLogger("HttpLogging");
    }

    public HttpClient() {
        this(0, 0, null, null, null, null, 63, null);
    }
}
