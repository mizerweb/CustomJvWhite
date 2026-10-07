package defpackage;

import androidx.media3.common.ParserException;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class sf implements jj6 {
    public static final int[] s = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] t = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] u;
    public static final byte[] v;
    public final byte[] a;
    public final int b;
    public final nm5 c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public long h;
    public int i;
    public int j;
    public long k;
    public lj6 l;
    public kyh m;
    public kyh n;
    public xbf o;
    public boolean p;
    public long q;
    public boolean r;

    static {
        String str = vqi.a;
        Charset charset = StandardCharsets.UTF_8;
        u = "#!AMR\n".getBytes(charset);
        v = "#!AMR-WB\n".getBytes(charset);
    }

    public sf(int i) {
        this.b = (i & 2) != 0 ? i | 1 : i;
        this.a = new byte[1];
        this.i = -1;
        nm5 nm5Var = new nm5();
        this.c = nm5Var;
        this.n = nm5Var;
    }

    @Override // defpackage.jj6
    public final void A(lj6 lj6Var) {
        this.l = lj6Var;
        kyh kyhVarG = lj6Var.G(0, 1);
        this.m = kyhVarG;
        this.n = kyhVarG;
        lj6Var.D();
    }

    public final int a(kj6 kj6Var) throws ParserException {
        boolean z;
        kj6Var.q();
        byte[] bArr = this.a;
        kj6Var.u(0, bArr, 1);
        byte b = bArr[0];
        if ((b & 131) > 0) {
            throw ParserException.a(null, "Invalid padding bits for frame header " + ((int) b));
        }
        int i = (b >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z = this.d) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
            return z ? t[i] : s[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.d ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw ParserException.a(null, sb.toString());
    }

    @Override // defpackage.jj6
    public final boolean b(kj6 kj6Var) {
        return c(kj6Var);
    }

    public final boolean c(kj6 kj6Var) {
        kj6Var.q();
        byte[] bArr = u;
        byte[] bArr2 = new byte[bArr.length];
        kj6Var.u(0, bArr2, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.d = false;
            kj6Var.E(bArr.length);
            return true;
        }
        kj6Var.q();
        byte[] bArr3 = v;
        byte[] bArr4 = new byte[bArr3.length];
        kj6Var.u(0, bArr4, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.d = true;
        kj6Var.E(bArr3.length);
        return true;
    }

    @Override // defpackage.jj6
    public final void g(long j, long j2) {
        this.e = 0L;
        this.f = 0;
        this.g = 0;
        this.q = j2;
        xbf xbfVar = this.o;
        if (!(xbfVar instanceof ad8)) {
            if (j == 0 || !(xbfVar instanceof if4)) {
                this.k = 0L;
                return;
            } else {
                if4 if4Var = (if4) xbfVar;
                this.k = (Math.max(0L, j - if4Var.b) * 8000000) / ((long) if4Var.e);
                return;
            }
        }
        ad8 ad8Var = (ad8) xbfVar;
        bi9 bi9Var = ad8Var.b;
        long jC = bi9Var.a == 0 ? -9223372036854775807L : bi9Var.c(vqi.c(ad8Var.a, j));
        this.k = jC;
        if (Math.abs(this.q - jC) < 20000) {
            return;
        }
        this.p = true;
        this.n = this.c;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00ee A[PHI: r10
  0x00ee: PHI (r10v1 kj6) = (r10v0 kj6), (r10v4 kj6) binds: [B:53:0x00ec, B:56:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:61:0x0106  */
    @Override // defpackage.jj6
    public final int l(kj6 kj6Var, s8 s8Var) throws ParserException {
        kj6 kj6Var2;
        int i;
        int i2;
        int iC;
        int i3;
        this.m.getClass();
        String str = vqi.a;
        if (kj6Var.getPosition() == 0 && !c(kj6Var)) {
            throw ParserException.a(null, "Could not find AMR header.");
        }
        if (!this.r) {
            this.r = true;
            boolean z = this.d;
            String str2 = z ? "audio/amr-wb" : "audio/amr";
            String str3 = z ? "audio/amr-wb" : "audio/3gpp";
            int i4 = z ? 16000 : 8000;
            int i5 = z ? t[8] : s[7];
            kyh kyhVar = this.m;
            a87 a87Var = new a87();
            a87Var.l = uya.n(str2);
            a87Var.m = uya.n(str3);
            a87Var.n = i5;
            a87Var.E = 1;
            a87Var.F = i4;
            ewi.n(a87Var, kyhVar);
        }
        if (this.g == 0) {
            try {
                int iA = a(kj6Var);
                this.f = iA;
                this.g = iA;
                if (this.i == -1) {
                    this.h = kj6Var.getPosition();
                    this.i = this.f;
                }
                if (this.i == this.f) {
                    this.j++;
                }
                xbf xbfVar = this.o;
                if (xbfVar instanceof ad8) {
                    ad8 ad8Var = (ad8) xbfVar;
                    long j = this.k + this.e + 20000;
                    long position = kj6Var.getPosition() + ((long) this.f);
                    bi9 bi9Var = ad8Var.b;
                    int i6 = bi9Var.a;
                    if (i6 == 0 || j - bi9Var.c(i6 - 1) >= 100000) {
                        bi9 bi9Var2 = ad8Var.a;
                        bi9 bi9Var3 = ad8Var.b;
                        if (bi9Var3.a == 0 && j > 0) {
                            bi9Var2.a(0L);
                            bi9Var3.a(0L);
                        }
                        bi9Var2.a(position);
                        bi9Var3.a(j);
                    }
                    if (this.p && Math.abs(this.q - j) < 20000) {
                        this.p = false;
                        this.n = this.m;
                    }
                }
                kj6Var2 = kj6Var;
                iC = this.n.c(kj6Var2, this.g, true);
                if (iC == -1) {
                    i = -1;
                } else {
                    i3 = this.g - iC;
                    this.g = i3;
                    if (i3 <= 0) {
                        this.n.a(this.k + this.e, 1, this.f, 0, null);
                        this.e += 20000;
                    }
                    i = 0;
                }
            } catch (EOFException unused) {
                kj6Var2 = kj6Var;
            }
        } else {
            kj6Var2 = kj6Var;
            iC = this.n.c(kj6Var2, this.g, true);
            if (iC == -1) {
                i = -1;
            } else {
                i3 = this.g - iC;
                this.g = i3;
                if (i3 <= 0) {
                    this.n.a(this.k + this.e, 1, this.f, 0, null);
                    this.e += 20000;
                }
                i = 0;
            }
        }
        long length = kj6Var2.getLength();
        if (this.o == null) {
            int i7 = this.b;
            if ((i7 & 4) != 0) {
                this.o = new ad8(-9223372036854775807L, new long[]{this.h}, new long[]{0});
            } else if ((i7 & 1) == 0 || !((i2 = this.i) == -1 || i2 == this.f)) {
                this.o = new vk0(-9223372036854775807L);
            } else if (this.j >= 20 || i == -1) {
                if4 if4Var = new if4(length, this.h, (int) ((((long) i2) * 8000000) / 20000), i2, (i7 & 2) != 0, true);
                this.o = if4Var;
                this.m.e(if4Var.f);
            }
            xbf xbfVar2 = this.o;
            if (xbfVar2 != null) {
                this.l.r(xbfVar2);
            }
        }
        if (i == -1) {
            xbf xbfVar3 = this.o;
            if (xbfVar3 instanceof ad8) {
                long j2 = this.k + this.e;
                ((ad8) xbfVar3).c = j2;
                this.l.r(xbfVar3);
                this.m.e(j2);
            }
        }
        return i;
    }

    @Override // defpackage.jj6
    public final void release() {
    }
}
