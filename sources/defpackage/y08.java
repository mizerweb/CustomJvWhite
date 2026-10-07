package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class y08 implements mdg {
    public final y41 a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public y08(y41 y41Var) {
        this.a = y41Var;
    }

    @Override // defpackage.mdg
    public final long S(long j, l31 l31Var) throws IOException {
        int i;
        int i2;
        do {
            int i3 = this.e;
            y41 y41Var = this.a;
            if (i3 == 0) {
                y41Var.skip(this.f);
                this.f = 0;
                if ((this.c & 4) == 0) {
                    i = this.d;
                    int iT = uqi.t(y41Var);
                    this.e = iT;
                    this.b = iT;
                    int i4 = y41Var.readByte() & 255;
                    this.c = y41Var.readByte() & 255;
                    Logger logger = z08.d;
                    if (logger.isLoggable(Level.FINE)) {
                        d71 d71Var = n08.a;
                        logger.fine(n08.a(true, this.d, this.b, i4, this.c));
                    }
                    i2 = y41Var.readInt() & Integer.MAX_VALUE;
                    this.d = i2;
                    if (i4 != 9) {
                        throw new IOException(i4 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jS = y41Var.S(Math.min(PlaybackStateCompat.ACTION_PLAY_FROM_URI, i3), l31Var);
                if (jS != -1) {
                    this.e -= (int) jS;
                    return jS;
                }
            }
            return -1L;
        } while (i2 == i);
        qr7.k("TYPE_CONTINUATION streamId changed");
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.mdg
    public final xsh m() {
        return this.a.m();
    }
}
