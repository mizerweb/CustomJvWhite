package org.apache.http.entity;

import defpackage.np0;
import defpackage.ore;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class BasicHttpEntity extends AbstractHttpEntity {
    private InputStream content;
    private boolean contentObtained;
    private long length = -1;

    @Override // org.apache.http.entity.AbstractHttpEntity, org.apache.http.HttpEntity
    public void consumeContent() throws IOException {
        InputStream inputStream = this.content;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() throws IllegalStateException {
        InputStream inputStream = this.content;
        if (inputStream == null) {
            ore.k("Content has not been provided");
            return null;
        }
        if (this.contentObtained) {
            ore.k("Content has been consumed");
            return null;
        }
        this.contentObtained = true;
        return inputStream;
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.length;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return (this.contentObtained || this.content == null) ? false : true;
    }

    public void setContent(InputStream inputStream) {
        this.content = inputStream;
        this.contentObtained = false;
    }

    public void setContentLength(long j) {
        this.length = j;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            ore.p("Output stream may not be null");
            return;
        }
        InputStream content = getContent();
        byte[] bArr = new byte[np0.q];
        while (true) {
            int i = content.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }
}
