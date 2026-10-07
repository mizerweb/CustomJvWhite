package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public final class yfa extends OutputStream {
    public final wki a;
    public final MessageDigest b;

    public yfa(wki wkiVar, MessageDigest messageDigest) {
        this.a = wkiVar;
        this.b = messageDigest;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.a.write(i);
        this.b.update((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.write(bArr, i, i2);
        this.b.update(bArr, i, i2);
    }
}
