package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: classes2.dex */
public final class d18 {
    public final int a;
    public final w08 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque g;
    public boolean h;
    public final b18 i;
    public final a18 j;
    public final c18 k;
    public final c18 l;
    public int m;
    public IOException n;

    public d18(int i, w08 w08Var, boolean z, boolean z2, hu7 hu7Var) {
        this.a = i;
        this.b = w08Var;
        this.f = w08Var.q.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.g = arrayDeque;
        this.i = new b18(this, w08Var.p.a(), z2);
        this.j = new a18(this, z);
        this.k = new c18(this);
        this.l = new c18(this);
        if (hu7Var == null) {
            if (g()) {
                return;
            }
            ore.k("remotely-initiated streams should have headers");
            throw null;
        }
        if (g()) {
            ore.k("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(hu7Var);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    public final void a() {
        boolean z;
        boolean zH;
        byte[] bArr = uqi.a;
        synchronized (this) {
            try {
                b18 b18Var = this.i;
                if (b18Var.b || !b18Var.e) {
                    z = false;
                } else {
                    a18 a18Var = this.j;
                    if (a18Var.a || a18Var.c) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                zH = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(9, null);
        } else {
            if (zH) {
                return;
            }
            this.b.y(this.a);
        }
    }

    public final void b() throws IOException {
        a18 a18Var = this.j;
        if (a18Var.c) {
            qr7.k("stream closed");
            return;
        }
        if (a18Var.a) {
            qr7.k("stream finished");
            return;
        }
        int i = this.m;
        if (i != 0) {
            IOException iOException = this.n;
            if (iOException == null) {
                throw new StreamResetException(i);
            }
        }
    }

    public final void c(int i, IOException iOException) {
        if (d(i, iOException)) {
            this.b.w.I(this.a, i);
        }
    }

    public final boolean d(int i, IOException iOException) {
        byte[] bArr = uqi.a;
        synchronized (this) {
            if (this.m != 0) {
                return false;
            }
            this.m = i;
            this.n = iOException;
            notifyAll();
            if (this.i.b && this.j.a) {
                return false;
            }
            this.b.y(this.a);
            return true;
        }
    }

    public final void e(int i) {
        if (d(i, null)) {
            this.b.P(this.a, i);
        }
    }

    public final a18 f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.j;
    }

    public final boolean g() {
        boolean z = (this.a & 1) == 1;
        this.b.getClass();
        return true == z;
    }

    public final synchronized boolean h() {
        try {
            if (this.m != 0) {
                return false;
            }
            b18 b18Var = this.i;
            if (b18Var.b || b18Var.e) {
                a18 a18Var = this.j;
                if ((a18Var.a || a18Var.c) && this.h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void i(hu7 hu7Var, boolean z) {
        boolean zH;
        byte[] bArr = uqi.a;
        synchronized (this) {
            try {
                if (this.h && z) {
                    this.i.getClass();
                } else {
                    this.h = true;
                    this.g.add(hu7Var);
                }
                if (z) {
                    this.i.b = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.b.y(this.a);
    }
}
