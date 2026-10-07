package org.apache.http.params;

import defpackage.ore;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class HttpAbstractParamBean {
    protected final HttpParams params;

    public HttpAbstractParamBean(HttpParams httpParams) {
        if (httpParams != null) {
            this.params = httpParams;
        } else {
            ore.p("HTTP parameters may not be null");
            throw null;
        }
    }
}
