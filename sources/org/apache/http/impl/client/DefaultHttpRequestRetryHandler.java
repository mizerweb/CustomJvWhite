package org.apache.http.impl.client;

import defpackage.ore;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DefaultHttpRequestRetryHandler implements HttpRequestRetryHandler {
    private final boolean requestSentRetryEnabled;
    private final int retryCount;

    public DefaultHttpRequestRetryHandler(int i, boolean z) {
        this.retryCount = i;
        this.requestSentRetryEnabled = z;
    }

    public int getRetryCount() {
        return this.retryCount;
    }

    public boolean isRequestSentRetryEnabled() {
        return this.requestSentRetryEnabled;
    }

    @Override // org.apache.http.client.HttpRequestRetryHandler
    public boolean retryRequest(IOException iOException, int i, HttpContext httpContext) {
        if (iOException == null) {
            ore.p("Exception parameter may not be null");
            return false;
        }
        if (httpContext == null) {
            ore.p("HTTP context may not be null");
            return false;
        }
        if (i > this.retryCount) {
            return false;
        }
        if (iOException instanceof NoHttpResponseException) {
            return true;
        }
        if ((iOException instanceof InterruptedIOException) || (iOException instanceof UnknownHostException) || (iOException instanceof SSLHandshakeException)) {
            return false;
        }
        Boolean bool = (Boolean) httpContext.getAttribute(ExecutionContext.HTTP_REQ_SENT);
        return bool == null || !bool.booleanValue() || this.requestSentRetryEnabled;
    }

    public DefaultHttpRequestRetryHandler() {
        this(3, false);
    }
}
