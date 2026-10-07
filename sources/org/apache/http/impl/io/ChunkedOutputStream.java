package org.apache.http.impl.io;

import defpackage.np0;
import defpackage.qr7;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.io.SessionOutputBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ChunkedOutputStream extends OutputStream {
    private byte[] cache;
    private int cachePosition;
    private boolean closed;
    private final SessionOutputBuffer out;
    private boolean wroteLastChunk;

    public ChunkedOutputStream(SessionOutputBuffer sessionOutputBuffer, int i) throws IOException {
        this.cachePosition = 0;
        this.wroteLastChunk = false;
        this.closed = false;
        this.cache = new byte[i];
        this.out = sessionOutputBuffer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        finish();
        this.out.flush();
    }

    public void finish() throws IOException {
        if (this.wroteLastChunk) {
            return;
        }
        flushCache();
        writeClosingChunk();
        this.wroteLastChunk = true;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        flushCache();
        this.out.flush();
    }

    public void flushCache() throws IOException {
        int i = this.cachePosition;
        if (i > 0) {
            this.out.writeLine(Integer.toHexString(i));
            this.out.write(this.cache, 0, this.cachePosition);
            this.out.writeLine("");
            this.cachePosition = 0;
        }
    }

    public void flushCacheWithAppend(byte[] bArr, int i, int i2) throws IOException {
        this.out.writeLine(Integer.toHexString(this.cachePosition + i2));
        this.out.write(this.cache, 0, this.cachePosition);
        this.out.write(bArr, i, i2);
        this.out.writeLine("");
        this.cachePosition = 0;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.closed) {
            qr7.k("Attempted write to closed stream.");
            return;
        }
        byte[] bArr2 = this.cache;
        int length = bArr2.length;
        int i3 = this.cachePosition;
        if (i2 >= length - i3) {
            flushCacheWithAppend(bArr, i, i2);
        } else {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.cachePosition += i2;
        }
    }

    public void writeClosingChunk() throws IOException {
        this.out.writeLine("0");
        this.out.writeLine("");
    }

    public ChunkedOutputStream(SessionOutputBuffer sessionOutputBuffer) throws IOException {
        this(sessionOutputBuffer, np0.q);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        if (!this.closed) {
            byte[] bArr = this.cache;
            int i2 = this.cachePosition;
            bArr[i2] = (byte) i;
            int i3 = i2 + 1;
            this.cachePosition = i3;
            if (i3 == bArr.length) {
                flushCache();
                return;
            }
            return;
        }
        qr7.k("Attempted write to closed stream.");
    }
}
