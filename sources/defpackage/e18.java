package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public final class e18 implements Closeable {
    public static final Logger f = Logger.getLogger(n08.class.getName());
    public final x41 a;
    public final l31 b;
    public int c;
    public boolean d;
    public final e08 e;

    public e18(x41 x41Var) {
        this.a = x41Var;
        l31 l31Var = new l31();
        this.b = l31Var;
        this.c = 16384;
        this.e = new e08(l31Var);
    }

    public final synchronized void A(int i, ArrayList arrayList, boolean z) {
        if (this.d) {
            throw new IOException("closed");
        }
        this.e.d(arrayList);
        long j = this.b.b;
        long jMin = Math.min(this.c, j);
        int i2 = j == jMin ? 4 : 0;
        if (z) {
            i2 |= 1;
        }
        l(i, (int) jMin, 1, i2);
        this.a.X(jMin, this.b);
        if (j > jMin) {
            long j2 = j - jMin;
            while (j2 > 0) {
                long jMin2 = Math.min(this.c, j2);
                j2 -= jMin2;
                l(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                this.a.X(jMin2, this.b);
            }
        }
    }

    public final synchronized void E(int i, int i2, boolean z) {
        if (this.d) {
            throw new IOException("closed");
        }
        l(0, 8, 6, z ? 1 : 0);
        this.a.writeInt(i);
        this.a.writeInt(i2);
        this.a.flush();
    }

    public final synchronized void I(int i, int i2) {
        if (this.d) {
            throw new IOException("closed");
        }
        if (qt4.D(i2) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        l(i, 4, 3, 0);
        this.a.writeInt(qt4.D(i2));
        this.a.flush();
    }

    public final synchronized void K(int i, long j) {
        if (this.d) {
            throw new IOException("closed");
        }
        if (j == 0 || j > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        l(i, 4, 8, 0);
        this.a.writeInt((int) j);
        this.a.flush();
    }

    public final synchronized void b(dqf dqfVar) {
        try {
            if (this.d) {
                throw new IOException("closed");
            }
            int i = this.c;
            int i2 = dqfVar.a;
            if ((i2 & 32) != 0) {
                i = dqfVar.b[5];
            }
            this.c = i;
            if (((i2 & 2) != 0 ? dqfVar.b[1] : -1) != -1) {
                e08 e08Var = this.e;
                int iMin = Math.min((i2 & 2) != 0 ? dqfVar.b[1] : -1, 16384);
                int i3 = e08Var.d;
                if (i3 != iMin) {
                    if (iMin < i3) {
                        e08Var.b = Math.min(e08Var.b, iMin);
                    }
                    e08Var.c = true;
                    e08Var.d = iMin;
                    int i4 = e08Var.h;
                    if (iMin < i4) {
                        if (iMin == 0) {
                            bu7[] bu7VarArr = e08Var.e;
                            Arrays.fill(bu7VarArr, 0, bu7VarArr.length, (Object) null);
                            e08Var.f = e08Var.e.length - 1;
                            e08Var.g = 0;
                            e08Var.h = 0;
                        } else {
                            e08Var.a(i4 - iMin);
                        }
                    }
                }
            }
            l(0, 0, 4, 1);
            this.a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.d = true;
        this.a.close();
    }

    public final synchronized void flush() {
        if (this.d) {
            throw new IOException("closed");
        }
        this.a.flush();
    }

    public final synchronized void g(boolean z, int i, l31 l31Var, int i2) {
        if (this.d) {
            throw new IOException("closed");
        }
        l(i, i2, 0, z ? 1 : 0);
        if (i2 > 0) {
            this.a.X(i2, l31Var);
        }
    }

    public final void l(int i, int i2, int i3, int i4) {
        Level level = Level.FINE;
        Logger logger = f;
        if (logger.isLoggable(level)) {
            logger.fine(n08.a(false, i, i2, i3, i4));
        }
        if (i2 > this.c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            c.o(zo5.h(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = uqi.a;
        x41 x41Var = this.a;
        x41Var.writeByte((i2 >>> 16) & 255);
        x41Var.writeByte((i2 >>> 8) & 255);
        x41Var.writeByte(i2 & 255);
        x41Var.writeByte(i3 & 255);
        x41Var.writeByte(i4 & 255);
        x41Var.writeInt(i & Integer.MAX_VALUE);
    }

    public final synchronized void y(int i, byte[] bArr, int i2) {
        if (this.d) {
            throw new IOException("closed");
        }
        if (qt4.D(i2) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        l(0, bArr.length + 8, 7, 0);
        this.a.writeInt(i);
        this.a.writeInt(qt4.D(i2));
        if (bArr.length != 0) {
            this.a.write(bArr);
        }
        this.a.flush();
    }
}
