package org.apache.http.impl.entity;

import defpackage.ore;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.impl.io.ChunkedOutputStream;
import org.apache.http.impl.io.ContentLengthOutputStream;
import org.apache.http.impl.io.IdentityOutputStream;
import org.apache.http.io.SessionOutputBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class EntitySerializer {
    private final ContentLengthStrategy lenStrategy;

    public EntitySerializer(ContentLengthStrategy contentLengthStrategy) {
        if (contentLengthStrategy != null) {
            this.lenStrategy = contentLengthStrategy;
        } else {
            ore.p("Content length strategy may not be null");
            throw null;
        }
    }

    public OutputStream doSerialize(SessionOutputBuffer sessionOutputBuffer, HttpMessage httpMessage) throws HttpException, IOException {
        long jDetermineLength = this.lenStrategy.determineLength(httpMessage);
        if (jDetermineLength == -2) {
            return new ChunkedOutputStream(sessionOutputBuffer);
        }
        return jDetermineLength == -1 ? new IdentityOutputStream(sessionOutputBuffer) : new ContentLengthOutputStream(sessionOutputBuffer, jDetermineLength);
    }

    public void serialize(SessionOutputBuffer sessionOutputBuffer, HttpMessage httpMessage, HttpEntity httpEntity) throws HttpException, IOException {
        if (sessionOutputBuffer == null) {
            ore.p("Session output buffer may not be null");
            return;
        }
        if (httpMessage == null) {
            ore.p("HTTP message may not be null");
        } else {
            if (httpEntity == null) {
                ore.p("HTTP entity may not be null");
                return;
            }
            OutputStream outputStreamDoSerialize = doSerialize(sessionOutputBuffer, httpMessage);
            httpEntity.writeTo(outputStreamDoSerialize);
            outputStreamDoSerialize.close();
        }
    }
}
