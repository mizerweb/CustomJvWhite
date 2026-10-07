package org.apache.http.impl.io;

import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.ore;
import defpackage.qr7;
import java.io.IOException;
import java.io.InputStream;
import org.apache.http.io.SessionInputBuffer;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class ContentLengthInputStream extends InputStream {
    private static final int BUFFER_SIZE = 2048;
    private long contentLength;
    private SessionInputBuffer in;
    private long pos = 0;
    private boolean closed = false;

    public ContentLengthInputStream(SessionInputBuffer sessionInputBuffer, long j) {
        this.in = null;
        if (sessionInputBuffer == null) {
            ore.p("Input stream may not be null");
            throw null;
        }
        if (j < 0) {
            ore.p("Content length may not be negative");
            throw null;
        }
        this.in = sessionInputBuffer;
        this.contentLength = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        try {
            do {
            } while (read(new byte[2048]) >= 0);
        } finally {
            this.closed = true;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.closed) {
            qr7.k("Attempted read from closed stream.");
            return 0;
        }
        long j = this.pos;
        long j2 = this.contentLength;
        if (j >= j2) {
            return -1;
        }
        if (((long) i2) + j > j2) {
            i2 = (int) (j2 - j);
        }
        int i3 = this.in.read(bArr, i, i2);
        this.pos += (long) i3;
        return i3;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        int i;
        if (j <= 0) {
            return 0L;
        }
        byte[] bArr = new byte[2048];
        long jMin = Math.min(j, this.contentLength - this.pos);
        long j2 = 0;
        while (jMin > 0 && (i = read(bArr, 0, (int) Math.min(PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH, jMin))) != -1) {
            long j3 = i;
            j2 += j3;
            jMin -= j3;
        }
        this.pos += j2;
        return j2;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.closed) {
            long j = this.pos;
            if (j >= this.contentLength) {
                return -1;
            }
            this.pos = j + 1;
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
