package org.apache.http.impl.io;

import defpackage.ore;
import defpackage.qr7;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.io.SessionOutputBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class IdentityOutputStream extends OutputStream {
    private boolean closed = false;
    private final SessionOutputBuffer out;

    public IdentityOutputStream(SessionOutputBuffer sessionOutputBuffer) {
        if (sessionOutputBuffer != null) {
            this.out = sessionOutputBuffer;
        } else {
            ore.p("Session output buffer may not be null");
            throw null;
        }
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
        } else {
            this.out.write(bArr, i, i2);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        if (!this.closed) {
            this.out.write(i);
        } else {
            qr7.k("Attempted write to closed stream.");
        }
    }
}
