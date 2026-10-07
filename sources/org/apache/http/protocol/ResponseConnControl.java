package org.apache.http.protocol;

import defpackage.ore;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ResponseConnControl implements HttpResponseInterceptor {
    @Override // org.apache.http.HttpResponseInterceptor
    public void process(HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        Header firstHeader;
        if (httpResponse == null) {
            ore.p("HTTP response may not be null");
            return;
        }
        if (httpContext == null) {
            ore.p("HTTP context may not be null");
            return;
        }
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode == 400 || statusCode == 408 || statusCode == 411 || statusCode == 413 || statusCode == 414 || statusCode == 503 || statusCode == 501) {
            httpResponse.setHeader(HTTP.CONN_DIRECTIVE, HTTP.CONN_CLOSE);
            return;
        }
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null) {
            ProtocolVersion protocolVersion = httpResponse.getStatusLine().getProtocolVersion();
            if (entity.getContentLength() < 0 && (!entity.isChunked() || protocolVersion.lessEquals(HttpVersion.HTTP_1_0))) {
                httpResponse.setHeader(HTTP.CONN_DIRECTIVE, HTTP.CONN_CLOSE);
                return;
            }
        }
        HttpRequest httpRequest = (HttpRequest) httpContext.getAttribute(ExecutionContext.HTTP_REQUEST);
        if (httpRequest == null || (firstHeader = httpRequest.getFirstHeader(HTTP.CONN_DIRECTIVE)) == null) {
            return;
        }
        httpResponse.setHeader(HTTP.CONN_DIRECTIVE, firstHeader.getValue());
    }
}
