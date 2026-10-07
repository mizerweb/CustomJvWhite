package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.time.Duration;
import java.time.Instant;
import one.video.calls.sdk_private.bJ;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class wak extends uak {
    public final pak a;
    public volatile boolean b;
    public volatile boolean c;
    public volatile Thread d;
    public long g;
    public final long h;
    public long i;
    public long j;
    public volatile boolean k;
    public final Object f = new Object();
    public volatile long l = -1;
    public final rak e = new rak();

    public wak(pak pakVar, long j, ku8 ku8Var) {
        this.a = pakVar;
        this.j = j;
        this.g = j;
        this.h = (long) (j * 0.1f);
    }

    @Override // defpackage.uak
    public final long a() {
        return this.i;
    }

    @Override // java.io.InputStream
    public final int available() {
        rak rakVar = this.e;
        long j = rakVar.c - rakVar.d;
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j;
    }

    @Override // defpackage.uak
    public final long b(t8k t8kVar) throws bJ {
        long jMax;
        if (this.l >= 0 && t8kVar.f() > this.l) {
            throw new bJ(7);
        }
        if (this.l >= 0 && t8kVar.f && t8kVar.f() != this.l) {
            throw new bJ(7);
        }
        if (t8kVar.f) {
            this.l = t8kVar.f();
        }
        if (this.k || this.b || this.c) {
            return 0L;
        }
        synchronized (this.f) {
            try {
                if (t8kVar.f() > this.j) {
                    int i = this.a.a;
                    throw new bJ(4);
                }
                this.e.c(t8kVar);
                jMax = Long.max(0L, t8kVar.f() - this.i);
                this.i = Long.max(this.i, t8kVar.f());
                this.f.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        return jMax;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        g(0L);
    }

    @Override // defpackage.uak
    public final void g(long j) {
        rak rakVar = this.e;
        if (rakVar.e < 0 || rakVar.c != rakVar.e) {
            pak pakVar = this.a;
            z7k z7kVar = pakVar.b;
            int i = pakVar.a;
            k5k k5kVar = new k5k(1);
            k5kVar.b = i;
            k5kVar.c = j;
            z7kVar.h(k5kVar, new vak(this, 1), true);
        }
        this.b = true;
        rak rakVar2 = this.e;
        rakVar2.g = true;
        rakVar2.a.clear();
        rakVar2.b.clear();
        Thread thread = this.d;
        if (thread != null) {
            thread.interrupt();
        }
        this.a.f();
    }

    @Override // defpackage.uak
    public final long l(long j) throws bJ {
        if (this.l >= 0 && j != this.l) {
            throw new bJ(7);
        }
        long j2 = this.i;
        if (j < j2) {
            throw new bJ(7);
        }
        long j3 = j - j2;
        if (this.l < 0) {
            this.l = j;
        }
        if (!this.k && !this.b && !this.c) {
            this.c = true;
            this.a.b((int) (this.l - this.e.d));
            rak rakVar = this.e;
            rakVar.g = true;
            rakVar.a.clear();
            rakVar.b.clear();
            Thread thread = this.d;
            if (thread != null) {
                thread.interrupt();
            }
            this.a.f();
        }
        return j3;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        String str;
        if (i2 == 0) {
            return 0;
        }
        Instant instantNow = Instant.now();
        long jMax = Long.MAX_VALUE;
        while (!this.k && !this.b && !this.c) {
            synchronized (this.f) {
                try {
                    this.d = Thread.currentThread();
                    int iA = this.e.a(ByteBuffer.wrap(bArr, i, i2));
                    if (iA > 0) {
                        this.j += (long) iA;
                        this.a.b(iA);
                        long j = this.j;
                        if (j - this.g > this.h) {
                            pak pakVar = this.a;
                            pakVar.b.h(new k5k(pakVar.a, j), new vak(this, 0), true);
                            this.g = this.j;
                        }
                        this.d = null;
                        return iA;
                    }
                    if (iA < 0) {
                        this.a.f();
                        this.d = null;
                        return -1;
                    }
                    try {
                        this.f.wait(jMax);
                    } catch (InterruptedException unused) {
                    }
                    this.d = null;
                    rak rakVar = this.e;
                    if (rakVar.c - rakVar.d == 0) {
                        long millis = Duration.between(instantNow, Instant.now()).toMillis();
                        if (millis > BuildConfig.MAX_TIME_TO_UPLOAD) {
                            throw new SocketTimeoutException("Read timeout on stream " + this.a.a + "; read up to " + this.e.d);
                        }
                        jMax = Long.max(1L, BuildConfig.MAX_TIME_TO_UPLOAD - millis);
                    }
                } catch (Throwable th) {
                    this.d = null;
                    throw th;
                }
            }
        }
        if (this.k) {
            str = "Connection closed";
        } else {
            str = this.b ? "Stream closed" : "Stream reset by peer";
        }
        throw new IOException(str);
    }

    @Override // defpackage.uak
    public final void y() {
        this.k = true;
        Thread thread = this.d;
        if (thread != null) {
            thread.interrupt();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int i = read(bArr, 0, 1);
        if (i == 1) {
            return bArr[0] & 255;
        }
        if (i < 0) {
            return -1;
        }
        hs4.b();
        return 0;
    }
}
