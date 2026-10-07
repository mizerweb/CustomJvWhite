package org.apache.http.impl.entity;

import defpackage.ore;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.entity.BasicHttpEntity;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.io.ChunkedInputStream;
import org.apache.http.impl.io.ContentLengthInputStream;
import org.apache.http.impl.io.IdentityInputStream;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class EntityDeserializer {
    private final ContentLengthStrategy lenStrategy;

    public EntityDeserializer(ContentLengthStrategy contentLengthStrategy) {
        if (contentLengthStrategy != null) {
            this.lenStrategy = contentLengthStrategy;
        } else {
            ore.p("Content length strategy may not be null");
            throw null;
        }
    }

    public HttpEntity deserialize(SessionInputBuffer sessionInputBuffer, HttpMessage httpMessage) throws HttpException, IOException {
        if (sessionInputBuffer == null) {
            ore.p("Session input buffer may not be null");
            return null;
        }
        if (httpMessage != null) {
            return doDeserialize(sessionInputBuffer, httpMessage);
        }
        ore.p("HTTP message may not be null");
        return null;
    }

    public BasicHttpEntity doDeserialize(SessionInputBuffer sessionInputBuffer, HttpMessage httpMessage) throws HttpException, IOException {
        BasicHttpEntity basicHttpEntity = new BasicHttpEntity();
        long jDetermineLength = this.lenStrategy.determineLength(httpMessage);
        if (jDetermineLength == -2) {
            basicHttpEntity.setChunked(true);
            basicHttpEntity.setContentLength(-1L);
            basicHttpEntity.setContent(new ChunkedInputStream(sessionInputBuffer));
        } else if (jDetermineLength == -1) {
            basicHttpEntity.setChunked(false);
            basicHttpEntity.setContentLength(-1L);
            basicHttpEntity.setContent(new IdentityInputStream(sessionInputBuffer));
        } else {
            basicHttpEntity.setChunked(false);
            basicHttpEntity.setContentLength(jDetermineLength);
            basicHttpEntity.setContent(new ContentLengthInputStream(sessionInputBuffer, jDetermineLength));
        }
        Header firstHeader = httpMessage.getFirstHeader(HTTP.CONTENT_TYPE);
        if (firstHeader != null) {
            basicHttpEntity.setContentType(firstHeader);
        }
        Header firstHeader2 = httpMessage.getFirstHeader(HTTP.CONTENT_ENCODING);
        if (firstHeader2 != null) {
            basicHttpEntity.setContentEncoding(firstHeader2);
        }
        return basicHttpEntity;
    }
}
