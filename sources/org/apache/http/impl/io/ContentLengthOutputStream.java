package org.apache.http.impl.io;

import defpackage.ore;
import defpackage.qr7;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.io.SessionOutputBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ContentLengthOutputStream extends OutputStream {
    private final long contentLength;
    private final SessionOutputBuffer out;
    private long total = 0;
    private boolean closed = false;

    public ContentLengthOutputStream(SessionOutputBuffer sessionOutputBuffer, long j) {
        if (sessionOutputBuffer == null) {
            ore.p("Session output buffer may not be null");
            throw null;
        }
        if (j < 0) {
            ore.p("Content length may not be negative");
            throw null;
        }
        this.out = sessionOutputBuffer;
        this.contentLength = j;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.out.flush();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.closed) {
            qr7.k("Attempted write to closed stream.");
            return;
        }
        long j = this.total;
        long j2 = this.contentLength;
        if (j < j2) {
            long j3 = j2 - j;
            if (i2 > j3) {
                i2 = (int) j3;
            }
            this.out.write(bArr, i, i2);
            this.total += (long) i2;
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        if (this.closed) {
            qr7.k("Attempted write to closed stream.");
        } else if (this.total < this.contentLength) {
            this.out.write(i);
            this.total++;
        }
    }
}
