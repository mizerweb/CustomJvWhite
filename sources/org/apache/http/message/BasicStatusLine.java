package org.apache.http.message;

import defpackage.ore;
import org.apache.http.ProtocolVersion;
import org.apache.http.StatusLine;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class BasicStatusLine implements StatusLine, Cloneable {
    private final ProtocolVersion protoVersion;
    private final String reasonPhrase;
    private final int statusCode;

    public BasicStatusLine(ProtocolVersion protocolVersion, int i, String str) {
        if (protocolVersion == null) {
            ore.p("Protocol version may not be null.");
            throw null;
        }
        if (i < 0) {
            ore.p("Status code may not be negative.");
            throw null;
        }
        this.protoVersion = protocolVersion;
        this.statusCode = i;
        this.reasonPhrase = str;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // org.apache.http.StatusLine
    public ProtocolVersion getProtocolVersion() {
        return this.protoVersion;
    }

    @Override // org.apache.http.StatusLine
    public String getReasonPhrase() {
        return this.reasonPhrase;
    }

    @Override // org.apache.http.StatusLine
    public int getStatusCode() {
        return this.statusCode;
    }

    public String toString() {
        return BasicLineFormatter.DEFAULT.formatStatusLine((CharArrayBuffer) null, this).toString();
    }
}
