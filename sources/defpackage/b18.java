package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes2.dex */
public final class b18 implements mdg {
    public final long a;
    public boolean b;
    public final l31 c = new l31();
    public final l31 d = new l31();
    public boolean e;
    public final /* synthetic */ d18 f;

    public b18(d18 d18Var, long j, boolean z) {
        this.f = d18Var;
        this.a = j;
        this.b = z;
    }

    @Override // defpackage.mdg
    public final long S(long j, l31 l31Var) throws Throwable {
        int i;
        Throwable streamResetException;
        boolean z;
        long jS;
        do {
            d18 d18Var = this.f;
            synchronized (d18Var) {
                d18Var.k.i();
                try {
                    synchronized (d18Var) {
                        i = d18Var.m;
                    }
                } catch (Throwable th) {
                    d18Var.k.l();
                    throw th;
                }
            }
            if (i != 0 && !this.b) {
                streamResetException = d18Var.n;
                if (streamResetException == null) {
                    synchronized (d18Var) {
                        streamResetException = new StreamResetException(d18Var.m);
                    }
                }
                throw th;
            }
            streamResetException = null;
            if (this.e) {
                throw new IOException("stream closed");
            }
            l31 l31Var2 = this.d;
            long j2 = l31Var2.b;
            z = false;
            if (j2 > 0) {
                jS = l31Var2.S(Math.min(PlaybackStateCompat.ACTION_PLAY_FROM_URI, j2), l31Var);
                long j3 = d18Var.c + jS;
                d18Var.c = j3;
                long j4 = j3 - d18Var.d;
                if (streamResetException == null && j4 >= d18Var.b.p.a() / 2) {
                    d18Var.b.W(d18Var.a, j4);
                    d18Var.d = d18Var.c;
                }
            } else {
                if (!this.b && streamResetException == null) {
                    try {
                        d18Var.wait();
                        z = true;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                jS = -1;
            }
            d18Var.k.l();
        } while (z);
        if (jS != -1) {
            return jS;
        }
        if (streamResetException == null) {
            return -1L;
        }
        throw streamResetException;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j;
        d18 d18Var = this.f;
        synchronized (d18Var) {
            this.e = true;
            l31 l31Var = this.d;
            j = l31Var.b;
            l31Var.skip(j);
            d18Var.notifyAll();
        }
        if (j > 0) {
            d18 d18Var2 = this.f;
            byte[] bArr = uqi.a;
            d18Var2.b.I(j);
        }
        this.f.a();
    }

    @Override // defpackage.mdg
    public final xsh m() {
        return this.f.k;
    }
}
