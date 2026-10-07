package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class t8e extends InputStream {
    public final /* synthetic */ u8e a;

    public t8e(u8e u8eVar) {
        this.a = u8eVar;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        u8e u8eVar = this.a;
        if (!u8eVar.c) {
            return (int) Math.min(u8eVar.b.b, 2147483647L);
        }
        qr7.k("closed");
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        u8e u8eVar = this.a;
        l31 l31Var = u8eVar.b;
        if (u8eVar.c) {
            qr7.k("closed");
            return 0;
        }
        gm0.g(bArr.length, i, i2);
        if (l31Var.b == 0 && u8eVar.a.S(PlaybackStateCompat.ACTION_PLAY_FROM_URI, l31Var) == -1) {
            return -1;
        }
        return l31Var.read(bArr, i, i2);
    }

    public final String toString() {
        return this.a + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        u8e u8eVar = this.a;
        l31 l31Var = u8eVar.b;
        if (u8eVar.c) {
            qr7.k("closed");
            return 0;
        }
        if (l31Var.b == 0 && u8eVar.a.S(PlaybackStateCompat.ACTION_PLAY_FROM_URI, l31Var) == -1) {
            return -1;
        }
        return l31Var.readByte() & 255;
    }
}
