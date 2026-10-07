package org.apache.http.impl;

import defpackage.ore;
import java.util.Locale;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.ProtocolVersion;
import org.apache.http.ReasonPhraseCatalog;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DefaultHttpResponseFactory implements HttpResponseFactory {
    protected final ReasonPhraseCatalog reasonCatalog;

    public DefaultHttpResponseFactory(ReasonPhraseCatalog reasonPhraseCatalog) {
        if (reasonPhraseCatalog != null) {
            this.reasonCatalog = reasonPhraseCatalog;
        } else {
            ore.p("Reason phrase catalog must not be null.");
            throw null;
        }
    }

    public Locale determineLocale(HttpContext httpContext) {
        return Locale.getDefault();
    }

    @Override // org.apache.http.HttpResponseFactory
    public HttpResponse newHttpResponse(ProtocolVersion protocolVersion, int i, HttpContext httpContext) {
        if (protocolVersion != null) {
            Locale localeDetermineLocale = determineLocale(httpContext);
            return new BasicHttpResponse(new BasicStatusLine(protocolVersion, i, this.reasonCatalog.getReason(i, localeDetermineLocale)), this.reasonCatalog, localeDetermineLocale);
        }
        ore.p("HTTP version may not be null");
        return null;
    }

    public DefaultHttpResponseFactory() {
        this(EnglishReasonPhraseCatalog.INSTANCE);
    }

    @Override // org.apache.http.HttpResponseFactory
    public HttpResponse newHttpResponse(StatusLine statusLine, HttpContext httpContext) {
        if (statusLine != null) {
            return new BasicHttpResponse(statusLine, this.reasonCatalog, determineLocale(httpContext));
        }
        ore.p("Status line may not be null");
        return null;
    }
}
