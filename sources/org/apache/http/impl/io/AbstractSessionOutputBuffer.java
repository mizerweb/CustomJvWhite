package org.apache.http.impl.io;

import defpackage.ore;
import java.io.IOException;
import java.io.OutputStream;
import org.apache.http.io.HttpTransportMetrics;
import org.apache.http.io.SessionOutputBuffer;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.ByteArrayBuffer;
import org.apache.http.util.CharArrayBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class AbstractSessionOutputBuffer implements SessionOutputBuffer {
    private static final byte[] CRLF = {13, 10};
    private static final int MAX_CHUNK = 256;
    private ByteArrayBuffer buffer;
    private HttpTransportMetricsImpl metrics;
    private OutputStream outstream;
    private String charset = "US-ASCII";
    private boolean ascii = true;

    @Override // org.apache.http.io.SessionOutputBuffer
    public void flush() throws IOException {
        flushBuffer();
        this.outstream.flush();
    }

    public void flushBuffer() throws IOException {
        int length = this.buffer.length();
        if (length > 0) {
            this.outstream.write(this.buffer.buffer(), 0, length);
            this.buffer.clear();
            this.metrics.incrementBytesTransferred(length);
        }
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public HttpTransportMetrics getMetrics() {
        return this.metrics;
    }

    public void init(OutputStream outputStream, int i, HttpParams httpParams) {
        if (outputStream == null) {
            ore.p("Input stream may not be null");
            return;
        }
        if (i <= 0) {
            ore.p("Buffer size may not be negative or zero");
            return;
        }
        if (httpParams == null) {
            ore.p("HTTP parameters may not be null");
            return;
        }
        this.outstream = outputStream;
        this.buffer = new ByteArrayBuffer(i);
        String httpElementCharset = HttpProtocolParams.getHttpElementCharset(httpParams);
        this.charset = httpElementCharset;
        this.ascii = httpElementCharset.equalsIgnoreCase("US-ASCII") || this.charset.equalsIgnoreCase(HTTP.ASCII);
        this.metrics = new HttpTransportMetricsImpl();
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (bArr == null) {
            return;
        }
        if (i2 > 256 || i2 > this.buffer.capacity()) {
            flushBuffer();
            this.outstream.write(bArr, i, i2);
            this.metrics.incrementBytesTransferred(i2);
        } else {
            if (i2 > this.buffer.capacity() - this.buffer.length()) {
                flushBuffer();
            }
            this.buffer.append(bArr, i, i2);
        }
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void writeLine(CharArrayBuffer charArrayBuffer) throws IOException {
        if (charArrayBuffer == null) {
            return;
        }
        if (this.ascii) {
            int length = charArrayBuffer.length();
            int i = 0;
            while (length > 0) {
                int iMin = Math.min(this.buffer.capacity() - this.buffer.length(), length);
                if (iMin > 0) {
                    this.buffer.append(charArrayBuffer, i, iMin);
                }
                if (this.buffer.isFull()) {
                    flushBuffer();
                }
                i += iMin;
                length -= iMin;
            }
        } else {
            write(charArrayBuffer.toString().getBytes(this.charset));
        }
        write(CRLF);
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void write(byte[] bArr) throws IOException {
        if (bArr == null) {
            return;
        }
        write(bArr, 0, bArr.length);
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void write(int i) throws IOException {
        if (this.buffer.isFull()) {
            flushBuffer();
        }
        this.buffer.append(i);
    }

    @Override // org.apache.http.io.SessionOutputBuffer
    public void writeLine(String str) throws IOException {
        if (str == null) {
            return;
        }
        if (str.length() > 0) {
            write(str.getBytes(this.charset));
        }
        write(CRLF);
    }
}
