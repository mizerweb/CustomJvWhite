package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class w08 implements Closeable {
    public static final dqf z;
    public final p08 a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final String c;
    public int d;
    public int e;
    public boolean f;
    public final pkh g;
    public final fkh h;
    public final fkh i;
    public final fkh j;
    public final zpe k;
    public long l;
    public long m;
    public long n;
    public long o;
    public final dqf p;
    public dqf q;
    public long r;
    public long s;
    public long t;
    public long u;
    public final Socket v;
    public final e18 w;
    public final gb3 x;
    public final LinkedHashSet y;

    static {
        dqf dqfVar = new dqf();
        dqfVar.c(7, 65535);
        dqfVar.c(5, 16384);
        z = dqfVar;
    }

    public w08(js8 js8Var) {
        this.a = (p08) js8Var.f;
        String str = (String) js8Var.c;
        this.c = str == null ? null : str;
        this.e = 3;
        pkh pkhVar = (pkh) js8Var.a;
        this.g = pkhVar;
        this.h = pkhVar.e();
        this.i = pkhVar.e();
        this.j = pkhVar.e();
        this.k = zpe.m;
        dqf dqfVar = new dqf();
        dqfVar.c(7, 16777216);
        this.p = dqfVar;
        dqf dqfVar2 = z;
        this.q = dqfVar2;
        this.u = dqfVar2.a();
        Socket socket = (Socket) js8Var.b;
        this.v = socket == null ? null : socket;
        x41 x41Var = (x41) js8Var.e;
        this.w = new e18(x41Var == null ? null : x41Var);
        y41 y41Var = (y41) js8Var.d;
        this.x = new gb3(this, new z08(y41Var != null ? y41Var : null));
        this.y = new LinkedHashSet();
    }

    public static void E(w08 w08Var) {
        int i;
        pkh pkhVar = pkh.h;
        e18 e18Var = w08Var.w;
        synchronized (e18Var) {
            try {
                if (e18Var.d) {
                    throw new IOException("closed");
                }
                Logger logger = e18.f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(uqi.i(">> CONNECTION " + n08.a.h(), new Object[0]));
                }
                e18Var.a.N(n08.a);
                e18Var.a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
        e18 e18Var2 = w08Var.w;
        dqf dqfVar = w08Var.p;
        synchronized (e18Var2) {
            try {
                if (e18Var2.d) {
                    throw new IOException("closed");
                }
                e18Var2.l(0, Integer.bitCount(dqfVar.a) * 6, 4, 0);
                int i2 = 0;
                while (true) {
                    boolean z2 = true;
                    if (i2 >= 10) {
                        break;
                    }
                    if (((1 << i2) & dqfVar.a) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        if (i2 != 4) {
                            i = i2 != 7 ? i2 : 4;
                        } else {
                            i = 3;
                        }
                        e18Var2.a.writeShort(i);
                        e18Var2.a.writeInt(dqfVar.b[i2]);
                    }
                    i2++;
                }
                e18Var2.a.flush();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        int iA = w08Var.p.a();
        if (iA != 65535) {
            w08Var.w.K(0, iA - 65535);
        }
        pkhVar.e().c(new u08(1, w08Var.x, w08Var.c), 0L);
    }

    public final void A(int i) {
        synchronized (this.w) {
            synchronized (this) {
                if (this.f) {
                    return;
                }
                this.f = true;
                this.w.y(this.d, uqi.a, i);
            }
        }
    }

    public final synchronized void I(long j) {
        long j2 = this.r + j;
        this.r = j2;
        long j3 = j2 - this.s;
        if (j3 >= this.p.a() / 2) {
            W(0, j3);
            this.s += j3;
        }
    }

    public final void K(int i, boolean z2, l31 l31Var, long j) {
        long j2;
        long j3;
        int iMin;
        long j4;
        if (j == 0) {
            this.w.g(z2, i, l31Var, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j2 = this.t;
                            j3 = this.u;
                            if (j2 >= j3) {
                                if (!this.b.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j, j3 - j2), this.w.c);
                j4 = iMin;
                this.t += j4;
            }
            j -= j4;
            this.w.g(z2 && j == 0, i, l31Var, iMin);
        }
    }

    public final void P(int i, int i2) {
        this.h.c(new r08(this.c + '[' + i + "] writeSynReset", this, i, i2, 1), 0L);
    }

    public final void W(int i, long j) {
        this.h.c(new v08(this.c + '[' + i + "] windowUpdate", this, i, j), 0L);
    }

    public final void b(int i, int i2, IOException iOException) {
        int i3;
        Object[] array;
        byte[] bArr = uqi.a;
        try {
            A(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.b.isEmpty()) {
                array = null;
            } else {
                array = this.b.values().toArray(new d18[0]);
                this.b.clear();
            }
        }
        d18[] d18VarArr = (d18[]) array;
        if (d18VarArr != null) {
            for (d18 d18Var : d18VarArr) {
                try {
                    d18Var.c(i2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.w.close();
        } catch (IOException unused3) {
        }
        try {
            this.v.close();
        } catch (IOException unused4) {
        }
        this.h.e();
        this.i.e();
        this.j.e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b(1, 9, null);
    }

    public final void flush() {
        this.w.flush();
    }

    public final synchronized d18 g(int i) {
        return (d18) this.b.get(Integer.valueOf(i));
    }

    public final synchronized boolean l(long j) {
        if (this.f) {
            return false;
        }
        return this.n >= this.m || j < this.o;
    }

    public final synchronized d18 y(int i) {
        d18 d18Var;
        d18Var = (d18) this.b.remove(Integer.valueOf(i));
        notifyAll();
        return d18Var;
    }
}
