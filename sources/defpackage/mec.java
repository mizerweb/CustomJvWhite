package defpackage;

import androidx.media3.decoder.DecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes2.dex */
public final class mec implements w7h, s55 {
    public final q6g a;
    public final u55[] e;
    public final v55[] f;
    public int g;
    public int h;
    public u55 i;
    public SubtitleDecoderException j;
    public boolean k;
    public boolean l;
    public final d8h n;
    public final Object b = new Object();
    public long m = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public mec(d8h d8hVar) {
        boolean z;
        a8h[] a8hVarArr = new a8h[2];
        po2[] po2VarArr = new po2[2];
        this.e = a8hVarArr;
        this.g = a8hVarArr.length;
        int i = 0;
        while (true) {
            z = true;
            if (i >= this.g) {
                break;
            }
            this.e[i] = new a8h(1);
            i++;
        }
        this.f = po2VarArr;
        this.h = po2VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = new po2(this, z ? 1 : 0);
        }
        q6g q6gVar = new q6g(this, 0);
        this.a = q6gVar;
        q6gVar.start();
        int i3 = this.g;
        u55[] u55VarArr = this.e;
        lvb.b0(i3 == u55VarArr.length);
        for (u55 u55Var : u55VarArr) {
            u55Var.s(1024);
        }
        this.n = d8hVar;
    }

    @Override // defpackage.w7h
    public final void a(long j) {
    }

    @Override // defpackage.s55
    public final Object b() {
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.j;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
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
    public final void c(a8h a8hVar) {
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.j;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                }
                lvb.R(a8hVar == this.i);
                this.c.addLast(a8hVar);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
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
                SubtitleDecoderException subtitleDecoderException = this.j;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
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

    public final DecoderException f(u55 u55Var, v55 v55Var, boolean z) {
        a8h a8hVar = (a8h) u55Var;
        po2 po2Var = (po2) v55Var;
        try {
            ByteBuffer byteBuffer = a8hVar.d;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            d8h d8hVar = this.n;
            if (z) {
                d8hVar.reset();
            }
            po2Var.s(a8hVar.f, d8hVar.h(0, bArrArray, iLimit), a8hVar.i);
            po2Var.c = false;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

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

    public final boolean g() {
        boolean z;
        SubtitleDecoderException subtitleDecoderException;
        DecoderException decoderExceptionF;
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
                    decoderExceptionF = f(u55Var, v55Var, z2);
                } catch (OutOfMemoryError e) {
                    subtitleDecoderException = new SubtitleDecoderException("Unexpected decode error", e);
                    decoderExceptionF = subtitleDecoderException;
                } catch (RuntimeException e2) {
                    subtitleDecoderException = new SubtitleDecoderException("Unexpected decode error", e2);
                    decoderExceptionF = subtitleDecoderException;
                }
                if (decoderExceptionF != null) {
                    synchronized (this.b) {
                        this.j = (SubtitleDecoderException) decoderExceptionF;
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

    @Override // defpackage.s55
    public final void release() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        this.a.interrupt();
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
