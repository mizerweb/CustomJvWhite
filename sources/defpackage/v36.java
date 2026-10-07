package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes4.dex */
public final class v36 implements t36 {
    public InputStream a;
    public final ZipEntry b;
    public final ZipFile c;
    public final long d;
    public boolean e = true;
    public long f = 0;

    public v36(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        this.c = zipFile;
        this.b = zipEntry;
        this.d = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.a = inputStream;
        if (inputStream != null) {
            return;
        }
        o75.i(zipEntry.getName(), "'s InputStream is null");
        throw null;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.a;
        if (inputStream != null) {
            inputStream.close();
            this.e = false;
        }
    }

    @Override // defpackage.t36
    public final int d0(long j, ByteBuffer byteBuffer) throws IOException {
        if (this.a == null) {
            qr7.k("InputStream is null");
            return 0;
        }
        int iRemaining = byteBuffer.remaining();
        long j2 = this.d;
        long j3 = j2 - j;
        if (j3 <= 0) {
            return -1;
        }
        int i = (int) j3;
        if (iRemaining > i) {
            iRemaining = i;
        }
        InputStream inputStream = this.a;
        ZipEntry zipEntry = this.b;
        if (inputStream == null) {
            o75.i(zipEntry.getName(), "'s InputStream is null");
            return 0;
        }
        long j4 = this.f;
        if (j != j4) {
            if (j > j2) {
                j = j2;
            }
            if (j >= j4) {
                inputStream.skip(j - j4);
            } else {
                inputStream.close();
                InputStream inputStream2 = this.c.getInputStream(zipEntry);
                this.a = inputStream2;
                if (inputStream2 == null) {
                    o75.i(zipEntry.getName(), "'s InputStream is null");
                    return 0;
                }
                inputStream2.skip(j);
            }
            this.f = j;
        }
        if (byteBuffer.hasArray()) {
            this.a.read(byteBuffer.array(), 0, iRemaining);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        } else {
            byte[] bArr = new byte[iRemaining];
            this.a.read(bArr, 0, iRemaining);
            byteBuffer.put(bArr, 0, iRemaining);
        }
        this.f += (long) iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.e;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return d0(this.f, byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
