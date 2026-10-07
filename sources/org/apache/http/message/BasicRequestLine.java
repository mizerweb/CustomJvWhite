package org.apache.http.message;

import defpackage.ore;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class BasicRequestLine implements RequestLine, Cloneable {
    private final String method;
    private final ProtocolVersion protoversion;
    private final String uri;

    public BasicRequestLine(String str, String str2, ProtocolVersion protocolVersion) {
        if (str == null) {
            ore.p("Method must not be null.");
            throw null;
        }
        if (str2 == null) {
            ore.p("URI must not be null.");
            throw null;
        }
        if (protocolVersion == null) {
            ore.p("Protocol version must not be null.");
            throw null;
        }
        this.method = str;
        this.uri = str2;
        this.protoversion = protocolVersion;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // org.apache.http.RequestLine
    public String getMethod() {
        return this.method;
    }

    @Override // org.apache.http.RequestLine
    public ProtocolVersion getProtocolVersion() {
        return this.protoversion;
    }

    @Override // org.apache.http.RequestLine
    public String getUri() {
        return this.uri;
    }

    public String toString() {
        return BasicLineFormatter.DEFAULT.formatRequestLine((CharArrayBuffer) null, this).toString();
    }
}
