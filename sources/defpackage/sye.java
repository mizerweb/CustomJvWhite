package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class sye {
    public final qf a;
    public final int b;
    public final nmc c;
    public n21 d;
    public n21 e;
    public n21 f;
    public long g;

    public sye(qf qfVar) {
        this.a = qfVar;
        int iQ = qfVar.q();
        this.b = iQ;
        this.c = new nmc(32);
        n21 n21Var = new n21(0L, iQ);
        this.d = n21Var;
        this.e = n21Var;
        this.f = n21Var;
    }

    public static n21 c(n21 n21Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= n21Var.b) {
            n21Var = (n21) n21Var.d;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (n21Var.b - j));
            pf pfVar = (pf) n21Var.c;
            byteBuffer.put(pfVar.a, ((int) (j - n21Var.a)) + pfVar.b, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == n21Var.b) {
                n21Var = (n21) n21Var.d;
            }
        }
        return n21Var;
    }

    public static n21 d(n21 n21Var, long j, byte[] bArr, int i) {
        while (j >= n21Var.b) {
            n21Var = (n21) n21Var.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (n21Var.b - j));
            pf pfVar = (pf) n21Var.c;
            System.arraycopy(pfVar.a, ((int) (j - n21Var.a)) + pfVar.b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == n21Var.b) {
                n21Var = (n21) n21Var.d;
            }
        }
        return n21Var;
    }

    public static n21 e(n21 n21Var, u55 u55Var, zg2 zg2Var, nmc nmcVar) {
        if (u55Var.d(1073741824)) {
            long j = zg2Var.b;
            int iH = 1;
            nmcVar.K(1);
            n21 n21VarD = d(n21Var, j, nmcVar.a, 1);
            long j2 = j + 1;
            byte b = nmcVar.a[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            ty4 ty4Var = u55Var.c;
            byte[] bArr = ty4Var.a;
            if (bArr == null) {
                ty4Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            n21Var = d(n21VarD, j2, ty4Var.a, i);
            long j3 = j2 + ((long) i);
            if (z) {
                nmcVar.K(2);
                n21Var = d(n21Var, j3, nmcVar.a, 2);
                j3 += 2;
                iH = nmcVar.H();
            }
            int[] iArr = ty4Var.d;
            if (iArr == null || iArr.length < iH) {
                iArr = new int[iH];
            }
            int[] iArr2 = ty4Var.e;
            if (iArr2 == null || iArr2.length < iH) {
                iArr2 = new int[iH];
            }
            if (z) {
                int i2 = iH * 6;
                nmcVar.K(i2);
                n21Var = d(n21Var, j3, nmcVar.a, i2);
                j3 += (long) i2;
                nmcVar.N(0);
                for (int i3 = 0; i3 < iH; i3++) {
                    iArr[i3] = nmcVar.H();
                    iArr2[i3] = nmcVar.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = zg2Var.a - ((int) (j3 - zg2Var.b));
            }
            jyh jyhVar = (jyh) zg2Var.c;
            String str = vqi.a;
            byte[] bArr2 = jyhVar.b;
            byte[] bArr3 = ty4Var.a;
            int i4 = jyhVar.a;
            int i5 = jyhVar.c;
            int i6 = jyhVar.d;
            ty4Var.f = iH;
            ty4Var.d = iArr;
            ty4Var.e = iArr2;
            ty4Var.b = bArr2;
            ty4Var.a = bArr3;
            ty4Var.c = i4;
            ty4Var.g = i5;
            ty4Var.h = i6;
            MediaCodec.CryptoInfo cryptoInfo = ty4Var.i;
            cryptoInfo.numSubSamples = iH;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i4;
            v2a v2aVar = ty4Var.j;
            v2aVar.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) v2aVar.c;
            pattern.set(i5, i6);
            ((MediaCodec.CryptoInfo) v2aVar.b).setPattern(pattern);
            long j4 = zg2Var.b;
            int i7 = (int) (j3 - j4);
            zg2Var.b = j4 + ((long) i7);
            zg2Var.a -= i7;
        }
        if (!u55Var.d(268435456)) {
            u55Var.s(zg2Var.a);
            return c(n21Var, zg2Var.b, u55Var.d, zg2Var.a);
        }
        nmcVar.K(4);
        n21 n21VarD2 = d(n21Var, zg2Var.b, nmcVar.a, 4);
        int iE = nmcVar.E();
        zg2Var.b += 4;
        zg2Var.a -= 4;
        u55Var.s(iE);
        n21 n21VarC = c(n21VarD2, zg2Var.b, u55Var.d, iE);
        zg2Var.b += (long) iE;
        int i8 = zg2Var.a - iE;
        zg2Var.a = i8;
        ByteBuffer byteBuffer = u55Var.g;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            u55Var.g = ByteBuffer.allocate(i8);
        } else {
            u55Var.g.clear();
        }
        return c(n21VarC, zg2Var.b, u55Var.g, zg2Var.a);
    }

    public final void a(long j) {
        n21 n21Var;
        if (j == -1) {
            return;
        }
        while (true) {
            n21Var = this.d;
            if (j < n21Var.b) {
                break;
            }
            this.a.k((pf) n21Var.c);
            n21 n21Var2 = this.d;
            n21Var2.c = null;
            n21 n21Var3 = (n21) n21Var2.d;
            n21Var2.d = null;
            this.d = n21Var3;
        }
        if (this.e.a < n21Var.a) {
            this.e = n21Var;
        }
    }

    public final int b(int i) {
        n21 n21Var = this.f;
        if (((pf) n21Var.c) == null) {
            pf pfVarG = this.a.g();
            n21 n21Var2 = new n21(this.f.b, this.b);
            n21Var.c = pfVarG;
            n21Var.d = n21Var2;
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }
}
