package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class a18 implements kag {
    public final boolean a;
    public final l31 b = new l31();
    public boolean c;
    public final /* synthetic */ d18 d;

    public a18(d18 d18Var, boolean z) {
        this.d = d18Var;
        this.a = z;
    }

    @Override // defpackage.kag
    public final void X(long j, l31 l31Var) throws SocketTimeoutException {
        byte[] bArr = uqi.a;
        l31 l31Var2 = this.b;
        l31Var2.X(j, l31Var);
        while (l31Var2.b >= PlaybackStateCompat.ACTION_PREPARE) {
            b(false);
        }
    }

    public final void b(boolean z) throws SocketTimeoutException {
        long jMin;
        boolean z2;
        d18 d18Var = this.d;
        synchronized (d18Var) {
            d18Var.l.i();
            while (d18Var.e >= d18Var.f && !this.a && !this.c) {
                try {
                    synchronized (d18Var) {
                        int i = d18Var.m;
                        if (i != 0) {
                            break;
                        }
                        try {
                            d18Var.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    d18Var.l.l();
                    throw th;
                }
            }
            d18Var.l.l();
            d18Var.b();
            jMin = Math.min(d18Var.f - d18Var.e, this.b.b);
            d18Var.e += jMin;
            z2 = z && jMin == this.b.b;
        }
        this.d.l.i();
        try {
            d18 d18Var2 = this.d;
            d18Var2.b.K(d18Var2.a, z2, this.b, jMin);
        } finally {
            this.d.l.l();
        }
    }

    @Override // defpackage.kag, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws SocketTimeoutException {
        boolean z;
        d18 d18Var = this.d;
        byte[] bArr = uqi.a;
        synchronized (d18Var) {
            if (this.c) {
                return;
            }
            synchronized (d18Var) {
                z = d18Var.m == 0;
            }
            d18 d18Var2 = this.d;
            if (!d18Var2.j.a) {
                if (this.b.b > 0) {
                    while (this.b.b > 0) {
                        b(true);
                    }
                } else if (z) {
                    d18Var2.b.K(d18Var2.a, true, null, 0L);
                }
            }
            synchronized (this.d) {
                this.c = true;
            }
            this.d.b.flush();
            this.d.a();
        }
    }

    @Override // defpackage.kag, java.io.Flushable
    public final void flush() throws SocketTimeoutException {
        d18 d18Var = this.d;
        byte[] bArr = uqi.a;
        synchronized (d18Var) {
            d18Var.b();
        }
        while (this.b.b > 0) {
            b(false);
            this.d.b.flush();
        }
    }

    @Override // defpackage.kag
    public final xsh m() {
        return this.d.l;
    }
}
