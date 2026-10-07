package org.apache.http.client.methods;

import java.net.URI;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class HttpPost extends HttpEntityEnclosingRequestBase {
    public static final String METHOD_NAME = "POST";

    public HttpPost(String str) {
        setURI(URI.create(str));
    }

    @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        return METHOD_NAME;
    }

    public HttpPost(URI uri) {
        setURI(uri);
    }

    public HttpPost() {
    }
}
