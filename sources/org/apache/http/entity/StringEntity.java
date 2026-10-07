package org.apache.http.entity;

import defpackage.ore;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class StringEntity extends AbstractHttpEntity implements Cloneable {
    protected final byte[] content;

    public StringEntity(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            ore.p("Source string may not be null");
            throw null;
        }
        str2 = str2 == null ? "ISO-8859-1" : str2;
        this.content = str.getBytes(str2);
        setContentType("text/plain; charset=".concat(str2));
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() throws IOException {
        return new ByteArrayInputStream(this.content);
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.content.length;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isRepeatable() {
        return true;
    }

    @Override // org.apache.http.HttpEntity
    public boolean isStreaming() {
        return false;
    }

    @Override // org.apache.http.HttpEntity
    public void writeTo(OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            ore.p("Output stream may not be null");
        } else {
            outputStream.write(this.content);
            outputStream.flush();
        }
    }

    public StringEntity(String str) throws UnsupportedEncodingException {
        this(str, null);
    }
}
