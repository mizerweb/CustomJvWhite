package org.apache.http.impl.io;

import defpackage.ore;
import defpackage.qr7;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.MalformedChunkCodingException;
import org.apache.http.io.SessionInputBuffer;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.ExceptionUtils;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ChunkedInputStream extends InputStream {
    private final CharArrayBuffer buffer;
    private int chunkSize;
    private SessionInputBuffer in;
    private int pos;
    private boolean bof = true;
    private boolean eof = false;
    private boolean closed = false;
    private Header[] footers = new Header[0];

    public ChunkedInputStream(SessionInputBuffer sessionInputBuffer) {
        if (sessionInputBuffer == null) {
            ore.p("Session input buffer may not be null");
            throw null;
        }
        this.in = sessionInputBuffer;
        this.pos = 0;
        this.buffer = new CharArrayBuffer(16);
    }

    public static void exhaustInputStream(InputStream inputStream) throws IOException {
        while (inputStream.read(new byte[1024]) >= 0) {
        }
    }

    private int getChunkSize() throws IOException {
        if (!this.bof) {
            int i = this.in.read();
            int i2 = this.in.read();
            if (i != 13 || i2 != 10) {
                throw new MalformedChunkCodingException("CRLF expected at end of chunk");
            }
        }
        this.buffer.clear();
        if (this.in.readLine(this.buffer) == -1) {
            throw new MalformedChunkCodingException("Chunked stream ended unexpectedly");
        }
        int iIndexOf = this.buffer.indexOf(59);
        if (iIndexOf < 0) {
            iIndexOf = this.buffer.length();
        }
        try {
            return Integer.parseInt(this.buffer.substringTrimmed(0, iIndexOf), 16);
        } catch (NumberFormatException unused) {
            throw new MalformedChunkCodingException("Bad chunk header");
        }
    }

    private void nextChunk() throws IOException {
        int chunkSize = getChunkSize();
        this.chunkSize = chunkSize;
        if (chunkSize < 0) {
            throw new MalformedChunkCodingException("Negative chunk size");
        }
        this.bof = false;
        this.pos = 0;
        if (chunkSize == 0) {
            this.eof = true;
            parseTrailerHeaders();
        }
    }

    private void parseTrailerHeaders() throws IOException {
        try {
            this.footers = AbstractMessageParser.parseHeaders(this.in, -1, -1, null);
        } catch (HttpException e) {
            MalformedChunkCodingException malformedChunkCodingException = new MalformedChunkCodingException("Invalid footer: " + e.getMessage());
            ExceptionUtils.initCause(malformedChunkCodingException, e);
            throw malformedChunkCodingException;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        try {
            if (!this.eof) {
                exhaustInputStream(this);
            }
        } finally {
            this.eof = true;
            this.closed = true;
        }
    }

    public Header[] getFooters() {
        return (Header[]) this.footers.clone();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.closed) {
            qr7.k("Attempted read from closed stream.");
            return 0;
        }
        if (this.eof) {
            return -1;
        }
        if (this.pos >= this.chunkSize) {
            nextChunk();
            if (this.eof) {
                return -1;
            }
        }
        int i3 = this.in.read(bArr, i, Math.min(i2, this.chunkSize - this.pos));
        this.pos += i3;
        return i3;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.closed) {
            if (this.eof) {
                return -1;
            }
            if (this.pos >= this.chunkSize) {
                nextChunk();
                if (this.eof) {
                    return -1;
                }
            }
            this.pos++;
            return this.in.read();
        }
        qr7.k("Attempted read from closed stream.");
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }
}
