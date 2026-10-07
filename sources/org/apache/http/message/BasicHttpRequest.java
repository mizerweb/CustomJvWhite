package org.apache.http.message;

import defpackage.ore;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.params.HttpProtocolParams;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class BasicHttpRequest extends AbstractHttpMessage implements HttpRequest {
    private final String method;
    private final RequestLine requestline;
    private final String uri;

    public BasicHttpRequest(String str, String str2) {
        if (str == null) {
            ore.p("Method name may not be null");
            throw null;
        }
        if (str2 == null) {
            ore.p("Request URI may not be null");
            throw null;
        }
        this.method = str;
        this.uri = str2;
        this.requestline = null;
    }

    @Override // org.apache.http.HttpMessage
    public ProtocolVersion getProtocolVersion() {
        RequestLine requestLine = this.requestline;
        return requestLine != null ? requestLine.getProtocolVersion() : HttpProtocolParams.getVersion(getParams());
    }

    @Override // org.apache.http.HttpRequest
    public RequestLine getRequestLine() {
        RequestLine requestLine = this.requestline;
        if (requestLine != null) {
            return requestLine;
        }
        return new BasicRequestLine(this.method, this.uri, HttpProtocolParams.getVersion(getParams()));
    }

    public BasicHttpRequest(String str, String str2, ProtocolVersion protocolVersion) {
        this(new BasicRequestLine(str, str2, protocolVersion));
    }

    public BasicHttpRequest(RequestLine requestLine) {
        if (requestLine != null) {
            this.requestline = requestLine;
            this.method = requestLine.getMethod();
            this.uri = requestLine.getUri();
            return;
        }
        ore.p("Request line may not be null");
        throw null;
    }
}
