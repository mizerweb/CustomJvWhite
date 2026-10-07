package org.apache.http;

import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public interface HttpResponseFactory {
    HttpResponse newHttpResponse(ProtocolVersion protocolVersion, int i, HttpContext httpContext);

    HttpResponse newHttpResponse(StatusLine statusLine, HttpContext httpContext);
}
