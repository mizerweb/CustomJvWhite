package org.apache.http.client.methods;

import defpackage.ore;
import java.net.URI;
import java.util.HashSet;
import java.util.Set;
import org.apache.http.HeaderElement;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpResponse;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class HttpOptions extends HttpRequestBase {
    public static final String METHOD_NAME = "OPTIONS";

    public HttpOptions(String str) {
        setURI(URI.create(str));
    }

    public Set<String> getAllowedMethods(HttpResponse httpResponse) {
        if (httpResponse == null) {
            ore.p("HTTP response may not be null");
            return null;
        }
        HeaderIterator headerIterator = httpResponse.headerIterator("Allow");
        HashSet hashSet = new HashSet();
        while (headerIterator.hasNext()) {
            for (HeaderElement headerElement : headerIterator.nextHeader().getElements()) {
                hashSet.add(headerElement.getName());
            }
        }
        return hashSet;
    }

    @Override // org.apache.http.client.methods.HttpRequestBase, org.apache.http.client.methods.HttpUriRequest
    public String getMethod() {
        return METHOD_NAME;
    }

    public HttpOptions(URI uri) {
        setURI(uri);
    }

    public HttpOptions() {
    }
}
