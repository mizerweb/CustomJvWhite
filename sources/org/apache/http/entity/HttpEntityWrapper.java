package org.apache.http.entity;

import defpackage.ore;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class HttpEntityWrapper implements HttpEntity {
    protected HttpEntity wrappedEntity;

    public HttpEntityWrapper(HttpEntity httpEntity) {
        if (httpEntity != null) {
            this.wrappedEntity = httpEntity;
        } else {
            ore.p("wrapped entity must not be null");
            throw null;
        }
    }

    @Override // org.apache.http.HttpEntity
    public void consumeContent() throws IOException {
        this.wrappedEntity.consumeContent();
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() throws IOException {
        return this.wrappedEntity.getContent();
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentEncoding() {
        return this.wrappedEntity.getContentEncoding();
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.wrappedEntity.getContentLength();
    }

    @Override // org.apache.http.HttpEntity
    public Header getContentType() {
        return this.wrappedEntity.getContentType();
    }

    @Override // org.apache.http.HttpEntity
    public boolean isChunked() {
        return this.wrappedEntity.isChunked();
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return this.wrappedEntity.isRepeatable();
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return this.wrappedEntity.isStreaming();
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        this.wrappedEntity.writeTo(outputStream);
    }
}
