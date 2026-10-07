package org.apache.http.entity;

import defpackage.np0;
import defpackage.ore;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class FileEntity extends AbstractHttpEntity implements Cloneable {
    protected final File file;

    public FileEntity(File file, String str) {
        if (file == null) {
            ore.p("File may not be null");
            throw null;
        }
        this.file = file;
        setContentType(str);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override // org.apache.http.HttpEntity
    public InputStream getContent() throws IOException {
        return new FileInputStream(this.file);
    }

    @Override // org.apache.http.HttpEntity
    public long getContentLength() {
        return this.file.length();
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
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(this.file);
        try {
            byte[] bArr = new byte[np0.r];
            while (true) {
                int i = fileInputStream.read(bArr);
                if (i == -1) {
                    outputStream.flush();
                    return;
                }
                outputStream.write(bArr, 0, i);
            }
        } finally {
            fileInputStream.close();
        }
    }
}
