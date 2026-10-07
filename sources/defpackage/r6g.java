package defpackage;

import androidx.media3.decoder.DecoderException;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r6g implements s55 {
    public final q6g a;
    public final u55[] e;
    public final v55[] f;
    public int g;
    public int h;
    public u55 i;
    public DecoderException j;
    public boolean k;
    public boolean l;
    public final Object b = new Object();
    public long m = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public r6g(u55[] u55VarArr, v55[] v55VarArr) {
        this.e = u55VarArr;
        this.g = u55VarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = f();
        }
        this.f = v55VarArr;
        this.h = v55VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = g();
        }
        q6g q6gVar = new q6g(this, 1);
        this.a = q6gVar;
        q6gVar.start();
    }

    @Override // defpackage.s55
    public final void d(long j) {
        synchronized (this.b) {
            try {
                lvb.b0(this.g == this.e.length || this.k);
                this.m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.s55
    public final Object e() {
        u55 u55Var;
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                lvb.b0(this.i == null);
                int i = this.g;
                if (i == 0) {
                    u55Var = null;
                } else {
                    u55[] u55VarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    u55Var = u55VarArr[i2];
                }
                this.i = u55Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return u55Var;
    }

    public abstract u55 f();

    @Override // defpackage.s55
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                u55 u55Var = this.i;
                if (u55Var != null) {
                    u55Var.q();
                    u55[] u55VarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    u55VarArr[i] = u55Var;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    u55 u55Var2 = (u55) this.c.removeFirst();
                    u55Var2.q();
                    u55[] u55VarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    u55VarArr2[i2] = u55Var2;
                }
                while (!this.d.isEmpty()) {
                    ((v55) this.d.removeFirst()).r();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract v55 g();

    public abstract DecoderException h(Throwable th);

    public abstract DecoderException i(u55 u55Var, v55 v55Var, boolean z);

    public final boolean j() {
        boolean z;
        DecoderException decoderExceptionH;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        break;
                    }
                    this.b.wait();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.l) {
                return false;
            }
            u55 u55Var = (u55) this.c.removeFirst();
            v55[] v55VarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            v55 v55Var = v55VarArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (u55Var.d(4)) {
                v55Var.a(4);
            } else {
                v55Var.b = u55Var.f;
                if (u55Var.d(134217728)) {
                    v55Var.a(134217728);
                }
                long j = u55Var.f;
                synchronized (this.b) {
                    long j2 = this.m;
                    z = j2 == -9223372036854775807L || j >= j2;
                }
                if (!z) {
                    v55Var.c = true;
                }
                try {
                    decoderExceptionH = i(u55Var, v55Var, z2);
                } catch (OutOfMemoryError e) {
                    decoderExceptionH = h(e);
                } catch (RuntimeException e2) {
                    decoderExceptionH = h(e2);
                }
                if (decoderExceptionH != null) {
                    synchronized (this.b) {
                        this.j = decoderExceptionH;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k || v55Var.c) {
                        v55Var.r();
                    } else {
                        this.d.addLast(v55Var);
                    }
                    u55Var.q();
                    u55[] u55VarArr = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    u55VarArr[i2] = u55Var;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        }
    }

    public /* bridge */ sx0 k() {
        return (sx0) b();
    }

    @Override // defpackage.s55
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final v55 b() {
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (v55) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.s55
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void c(u55 u55Var) {
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                lvb.R(u55Var == this.i);
                this.c.addLast(u55Var);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(v55 v55Var) {
        synchronized (this.b) {
            v55Var.q();
            v55[] v55VarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            v55VarArr[i] = v55Var;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    @Override // defpackage.s55
    public final void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
