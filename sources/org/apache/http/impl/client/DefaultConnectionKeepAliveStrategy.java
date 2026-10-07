package org.apache.http.impl.client;

import defpackage.ore;
import org.apache.http.HeaderElement;
import org.apache.http.HttpResponse;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.message.BasicHeaderElementIterator;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class DefaultConnectionKeepAliveStrategy implements ConnectionKeepAliveStrategy {
    @Override // org.apache.http.conn.ConnectionKeepAliveStrategy
    public long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
        if (httpResponse == null) {
            ore.p("HTTP response may not be null");
            return 0L;
        }
        BasicHeaderElementIterator basicHeaderElementIterator = new BasicHeaderElementIterator(httpResponse.headerIterator(HTTP.CONN_KEEP_ALIVE));
        while (basicHeaderElementIterator.hasNext()) {
            HeaderElement headerElementNextElement = basicHeaderElementIterator.nextElement();
            String name = headerElementNextElement.getName();
            String value = headerElementNextElement.getValue();
            if (value != null && name.equalsIgnoreCase("timeout")) {
                try {
                    return Long.parseLong(value) * 1000;
                } catch (NumberFormatException unused) {
                    continue;
                }
            }
        }
        return -1L;
    }
}
