package org.apache.http.protocol;

import defpackage.ore;
import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ResponseDate implements HttpResponseInterceptor {
    private static final HttpDateGenerator DATE_GENERATOR = new HttpDateGenerator();

    @Override // org.apache.http.HttpResponseInterceptor
    public void process(HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        if (httpResponse == null) {
            ore.p("HTTP response may not be null.");
        } else {
            if (httpResponse.getStatusLine().getStatusCode() < 200 || httpResponse.containsHeader(HTTP.DATE_HEADER)) {
                return;
            }
            httpResponse.setHeader(HTTP.DATE_HEADER, DATE_GENERATOR.getCurrentDate());
        }
    }
}
