package org.apache.http.impl;

import defpackage.ore;
import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class NoConnectionReuseStrategy implements ConnectionReuseStrategy {
    @Override // org.apache.http.ConnectionReuseStrategy
    public boolean keepAlive(HttpResponse httpResponse, HttpContext httpContext) {
        if (httpResponse == null) {
            ore.p("HTTP response may not be null");
            return false;
        }
        if (httpContext != null) {
            return false;
        }
        ore.p("HTTP context may not be null");
        return false;
    }
}
