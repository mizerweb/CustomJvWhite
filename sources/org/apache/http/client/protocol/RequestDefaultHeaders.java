package org.apache.http.client.protocol;

import defpackage.ore;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class RequestDefaultHeaders implements HttpRequestInterceptor {
    @Override // org.apache.http.HttpRequestInterceptor
    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        if (httpRequest == null) {
            ore.p("HTTP request may not be null");
            return;
        }
        Collection collection = (Collection) httpRequest.getParams().getParameter(ClientPNames.DEFAULT_HEADERS);
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                httpRequest.addHeader((Header) it.next());
            }
        }
    }
}
