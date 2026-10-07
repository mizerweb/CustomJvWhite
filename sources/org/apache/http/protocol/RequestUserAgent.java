package org.apache.http.protocol;

import defpackage.ore;
import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.params.HttpProtocolParams;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class RequestUserAgent implements HttpRequestInterceptor {
    @Override // org.apache.http.HttpRequestInterceptor
    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        String userAgent;
        if (httpRequest == null) {
            ore.p("HTTP request may not be null");
        } else {
            if (httpRequest.containsHeader(HTTP.USER_AGENT) || (userAgent = HttpProtocolParams.getUserAgent(httpRequest.getParams())) == null) {
                return;
            }
            httpRequest.addHeader(HTTP.USER_AGENT, userAgent);
        }
    }
}
