package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import java.util.zip.Deflater;

/* JADX INFO: loaded from: classes2.dex */
public final class qtj implements Closeable {
    public final x41 a;
    public final Random b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final l31 g;
    public boolean h;
    public tfa i;
    public final l31 f = new l31();
    public final byte[] j = new byte[4];
    public final e31 k = new e31();

    public qtj(x41 x41Var, Random random, boolean z, boolean z2, long j) {
        this.a = x41Var;
        this.b = random;
        this.c = z;
        this.d = z2;
        this.e = j;
        this.g = x41Var.getBuffer();
    }

    public final void b(int i, d71 d71Var) throws IOException {
        if (this.h) {
            qr7.k("closed");
            return;
        }
        int iA = d71Var.a();
        if (iA > 125) {
            ore.p("Payload size must be less than or equal to 125");
            return;
        }
        int i2 = i | np0.m;
        l31 l31Var = this.g;
        l31Var.t0(i2);
        l31Var.t0(iA | np0.m);
        Random random = this.b;
        byte[] bArr = this.j;
        random.nextBytes(bArr);
        l31Var.k0(bArr.length, bArr);
        if (iA > 0) {
            long j = l31Var.b;
            l31Var.o0(d71Var);
            e31 e31Var = this.k;
            l31Var.E(e31Var);
            e31Var.g(j);
            e51.b(e31Var, bArr);
            e31Var.close();
        }
        this.a.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        tfa tfaVar = this.i;
        if (tfaVar != null) {
            tfaVar.close();
        }
    }

    public final void g(d71 d71Var) throws IOException {
        int i;
        if (this.h) {
            qr7.k("closed");
            return;
        }
        l31 l31Var = this.f;
        l31Var.o0(d71Var);
        if (!this.c || d71Var.a.length < this.e) {
            i = 129;
        } else {
            tfa tfaVar = this.i;
            if (tfaVar == null) {
                tfaVar = new tfa(this.d, 0);
                this.i = tfaVar;
            }
            ig5 ig5Var = (ig5) tfaVar.e;
            l31 l31Var2 = tfaVar.c;
            if (l31Var2.b != 0) {
                ore.p("Failed requirement.");
                return;
            }
            if (tfaVar.b) {
                ((Deflater) tfaVar.d).reset();
            }
            ig5Var.X(l31Var.b, l31Var);
            ig5Var.flush();
            d71 d71Var2 = ufa.a;
            long j = l31Var2.b;
            byte[] bArr = d71Var2.a;
            long length = j - ((long) bArr.length);
            int length2 = bArr.length;
            if (length < 0 || length2 < 0 || j - length < length2 || bArr.length < length2) {
                l31Var2.t0(0);
                break;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= length2) {
                    long j2 = l31Var2.b - 4;
                    e31 e31VarE = l31Var2.E(gm0.b);
                    try {
                        e31VarE.b(j2);
                        e31VarE.close();
                        break;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            rx8.n(e31VarE, th);
                            throw th2;
                        }
                    }
                }
                if (l31Var2.y(((long) i2) + length) != d71Var2.a[i2]) {
                    l31Var2.t0(0);
                    break;
                }
                i2++;
            }
            l31Var.X(l31Var2.b, l31Var2);
            i = 193;
        }
        long j3 = l31Var.b;
        l31 l31Var3 = this.g;
        l31Var3.t0(i);
        if (j3 <= 125) {
            l31Var3.t0(((int) j3) | np0.m);
        } else if (j3 <= 65535) {
            l31Var3.t0(254);
            l31Var3.x0((int) j3);
        } else {
            l31Var3.t0(255);
            fcf fcfVarY = l31Var3.Y(8);
            byte[] bArr2 = fcfVarY.a;
            int i3 = fcfVarY.c;
            bArr2[i3] = (byte) ((j3 >>> 56) & 255);
            bArr2[i3 + 1] = (byte) ((j3 >>> 48) & 255);
            bArr2[i3 + 2] = (byte) ((j3 >>> 40) & 255);
            bArr2[i3 + 3] = (byte) ((j3 >>> 32) & 255);
            bArr2[i3 + 4] = (byte) ((j3 >>> 24) & 255);
            bArr2[i3 + 5] = (byte) ((j3 >>> 16) & 255);
            bArr2[i3 + 6] = (byte) ((j3 >>> 8) & 255);
            bArr2[i3 + 7] = (byte) (j3 & 255);
            fcfVarY.c = i3 + 8;
            l31Var3.b += 8;
        }
        Random random = this.b;
        byte[] bArr3 = this.j;
        random.nextBytes(bArr3);
        l31Var3.k0(bArr3.length, bArr3);
        if (j3 > 0) {
            e31 e31Var = this.k;
            l31Var.E(e31Var);
            e31Var.g(0L);
            e51.b(e31Var, bArr3);
            e31Var.close();
        }
        l31Var3.X(j3, l31Var);
        this.a.w();
    }
}
