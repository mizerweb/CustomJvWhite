package org.apache.http.impl.entity;

import defpackage.ore;
import defpackage.qv1;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class StrictContentLengthStrategy implements ContentLengthStrategy {
    @Override // org.apache.http.entity.ContentLengthStrategy
    public long determineLength(HttpMessage httpMessage) throws HttpException {
        if (httpMessage == null) {
            ore.p("HTTP message may not be null");
            return 0L;
        }
        Header firstHeader = httpMessage.getFirstHeader(HTTP.TRANSFER_ENCODING);
        Header firstHeader2 = httpMessage.getFirstHeader(HTTP.CONTENT_LEN);
        if (firstHeader == null) {
            if (firstHeader2 == null) {
                return -1L;
            }
            String value = firstHeader2.getValue();
            try {
                return Long.parseLong(value);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(qv1.k("Invalid content length: ", value));
            }
        }
        String value2 = firstHeader.getValue();
        if (!HTTP.CHUNK_CODING.equalsIgnoreCase(value2)) {
            if (HTTP.IDENTITY_CODING.equalsIgnoreCase(value2)) {
                return -1L;
            }
            throw new ProtocolException(qv1.k("Unsupported transfer encoding: ", value2));
        }
        if (!httpMessage.getProtocolVersion().lessEquals(HttpVersion.HTTP_1_0)) {
            return -2L;
        }
        throw new ProtocolException("Chunked transfer encoding not allowed for " + httpMessage.getProtocolVersion());
    }
}
