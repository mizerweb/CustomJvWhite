package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import kotlin.collections.a;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class l31 implements y41, x41, Cloneable, ByteChannel {
    public fcf a;
    public long b;

    public final long A(byte b, long j, long j2) {
        fcf fcfVar;
        long j3 = 0;
        if (0 > j || j > j2) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(this.b);
            qt4.z(j, " fromIndex=", " toIndex=", sb);
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j4 = this.b;
        if (j2 > j4) {
            j2 = j4;
        }
        if (j == j2 || (fcfVar = this.a) == null) {
            return -1L;
        }
        if (j4 - j < j) {
            while (j4 > j) {
                fcfVar = fcfVar.g;
                j4 -= (long) (fcfVar.c - fcfVar.b);
            }
            while (j4 < j2) {
                byte[] bArr = fcfVar.a;
                int iMin = (int) Math.min(fcfVar.c, (((long) fcfVar.b) + j2) - j4);
                for (int i = (int) ((((long) fcfVar.b) + j) - j4); i < iMin; i++) {
                    if (bArr[i] == b) {
                        return ((long) (i - fcfVar.b)) + j4;
                    }
                }
                j4 += (long) (fcfVar.c - fcfVar.b);
                fcfVar = fcfVar.f;
                j = j4;
            }
            return -1L;
        }
        while (true) {
            long j5 = ((long) (fcfVar.c - fcfVar.b)) + j3;
            if (j5 > j) {
                break;
            }
            fcfVar = fcfVar.f;
            j3 = j5;
        }
        while (j3 < j2) {
            byte[] bArr2 = fcfVar.a;
            int iMin2 = (int) Math.min(fcfVar.c, (((long) fcfVar.b) + j2) - j3);
            for (int i2 = (int) ((((long) fcfVar.b) + j) - j3); i2 < iMin2; i2++) {
                if (bArr2[i2] == b) {
                    return ((long) (i2 - fcfVar.b)) + j3;
                }
            }
            j3 += (long) (fcfVar.c - fcfVar.b);
            fcfVar = fcfVar.f;
            j = j3;
        }
        return -1L;
    }

    @Override // defpackage.x41
    public final /* bridge */ /* synthetic */ x41 A0(long j) {
        u0(j);
        return this;
    }

    public final void D0(int i) {
        String str;
        if (i < 128) {
            t0(i);
            return;
        }
        if (i < 2048) {
            fcf fcfVarY = Y(2);
            byte[] bArr = fcfVarY.a;
            int i2 = fcfVarY.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | np0.m);
            fcfVarY.c = i2 + 2;
            this.b += 2;
            return;
        }
        if (55296 <= i && i < 57344) {
            t0(63);
            return;
        }
        if (i < 65536) {
            fcf fcfVarY2 = Y(3);
            byte[] bArr2 = fcfVarY2.a;
            int i3 = fcfVarY2.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | np0.m);
            bArr2[i3 + 2] = (byte) ((i & 63) | np0.m);
            fcfVarY2.c = i3 + 3;
            this.b += 3;
            return;
        }
        if (i <= 1114111) {
            fcf fcfVarY3 = Y(4);
            byte[] bArr3 = fcfVarY3.a;
            int i4 = fcfVarY3.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | np0.m);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | np0.m);
            bArr3[i4 + 3] = (byte) ((i & 63) | np0.m);
            fcfVarY3.c = i4 + 4;
            this.b += 4;
            return;
        }
        StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
        if (i != 0) {
            char[] cArr = p90.b;
            int i5 = 0;
            char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
            while (i5 < 8 && cArr2[i5] == '0') {
                i5++;
            }
            e9i.s(i5, 8, 8);
            str = new String(cArr2, i5, 8 - i5);
        } else {
            str = "0";
        }
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    public final e31 E(e31 e31Var) {
        byte[] bArr = b.a;
        if (e31Var == gm0.b) {
            e31Var = new e31();
        }
        if (e31Var.a != null) {
            ore.k("already attached to a buffer");
            return null;
        }
        e31Var.a = this;
        e31Var.b = true;
        return e31Var;
    }

    public final byte[] I(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            c.o(zo5.j(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            c.n();
            return null;
        }
        byte[] bArr = new byte[(int) j];
        readFully(bArr);
        return bArr;
    }

    public final String K(long j, Charset charset) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            c.o(zo5.j(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            c.n();
            return null;
        }
        if (j == 0) {
            return "";
        }
        fcf fcfVar = this.a;
        int i = fcfVar.b;
        if (((long) i) + j > fcfVar.c) {
            return new String(I(j), charset);
        }
        int i2 = (int) j;
        String str = new String(fcfVar.a, i, i2, charset);
        int i3 = fcfVar.b + i2;
        fcfVar.b = i3;
        this.b -= j;
        if (i3 == fcfVar.c) {
            this.a = fcfVar.a();
            vcf.a(fcfVar);
        }
        return str;
    }

    @Override // defpackage.y41
    public final int K0(chc chcVar) throws EOFException {
        int iB = b.b(this, chcVar, false);
        if (iB == -1) {
            return -1;
        }
        skip(chcVar.a[iB].a());
        return iB;
    }

    @Override // defpackage.x41
    public final x41 L(String str) {
        z0(0, str.length(), str);
        return this;
    }

    @Override // defpackage.x41
    public final /* bridge */ /* synthetic */ x41 N(d71 d71Var) {
        o0(d71Var);
        return this;
    }

    @Override // defpackage.y41
    public final long N0() throws EOFException {
        int i;
        if (this.b == 0) {
            c.n();
            return 0L;
        }
        int i2 = 0;
        boolean z = false;
        long j = 0;
        do {
            fcf fcfVar = this.a;
            byte[] bArr = fcfVar.a;
            int i3 = fcfVar.b;
            int i4 = fcfVar.c;
            while (i3 < i4) {
                byte b = bArr[i3];
                if (b >= 48 && b <= 57) {
                    i = b - 48;
                } else if (b >= 97 && b <= 102) {
                    i = b - 87;
                } else {
                    if (b < 65 || b > 70) {
                        z = true;
                        if (i2 != 0) {
                            break;
                        }
                        char[] cArr = p90.b;
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]})));
                    }
                    i = b - 55;
                }
                if (((-1152921504606846976L) & j) != 0) {
                    l31 l31Var = new l31();
                    l31Var.u0(j);
                    l31Var.t0(b);
                    throw new NumberFormatException("Number too large: ".concat(l31Var.P()));
                }
                j = (j << 4) | ((long) i);
                i3++;
                i2++;
            }
            if (i3 == i4) {
                this.a = fcfVar.a();
                vcf.a(fcfVar);
            } else {
                fcfVar.b = i3;
            }
            if (z) {
                break;
            }
        } while (this.a != null);
        this.b -= (long) i2;
        return j;
    }

    public final String P() {
        return K(this.b, pt2.a);
    }

    @Override // defpackage.y41
    public final InputStream Q0() {
        return new g31(this);
    }

    @Override // defpackage.y41
    public final String R() {
        return j(BuildConfig.MAX_TIME_TO_UPLOAD);
    }

    @Override // defpackage.mdg
    public final long S(long j, l31 l31Var) {
        if (j < 0) {
            c.o(zo5.j(j, "byteCount < 0: "));
            return 0L;
        }
        long j2 = this.b;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        l31Var.X(j, this);
        return j;
    }

    public final d71 W(int i) {
        if (i == 0) {
            return d71.d;
        }
        gm0.g(this.b, 0L, i);
        fcf fcfVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = fcfVar.c;
            int i6 = fcfVar.b;
            if (i5 == i6) {
                c.e("s.limit == s.pos");
                return null;
            }
            i3 += i5 - i6;
            i4++;
            fcfVar = fcfVar.f;
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[i4 * 2];
        fcf fcfVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            bArr[i7] = fcfVar2.a;
            i2 += fcfVar2.c - fcfVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = fcfVar2.b;
            fcfVar2.d = true;
            i7++;
            fcfVar2 = fcfVar2.f;
        }
        return new wcf(bArr, iArr);
    }

    @Override // defpackage.kag
    public final void X(long j, l31 l31Var) {
        fcf fcfVarB;
        if (l31Var == this) {
            ore.p("source == this");
            return;
        }
        gm0.g(l31Var.b, 0L, j);
        while (j > 0) {
            fcf fcfVar = l31Var.a;
            int i = fcfVar.c - fcfVar.b;
            if (j < i) {
                fcf fcfVar2 = this.a;
                fcf fcfVar3 = fcfVar2 != null ? fcfVar2.g : null;
                if (fcfVar3 != null && fcfVar3.e) {
                    if ((((long) fcfVar3.c) + j) - ((long) (fcfVar3.d ? 0 : fcfVar3.b)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                        fcfVar.d(fcfVar3, (int) j);
                        l31Var.b -= j;
                        this.b += j;
                        return;
                    }
                }
                int i2 = (int) j;
                if (i2 <= 0 || i2 > i) {
                    ore.p("byteCount out of range");
                    return;
                }
                if (i2 >= 1024) {
                    fcfVarB = fcfVar.c();
                } else {
                    fcfVarB = vcf.b();
                    byte[] bArr = fcfVar.a;
                    byte[] bArr2 = fcfVarB.a;
                    int i3 = fcfVar.b;
                    a.R0(bArr, i3, bArr2, i3 + i2);
                }
                fcfVarB.c = fcfVarB.b + i2;
                fcfVar.b += i2;
                fcfVar.g.b(fcfVarB);
                l31Var.a = fcfVarB;
            }
            fcf fcfVar4 = l31Var.a;
            long j2 = fcfVar4.c - fcfVar4.b;
            l31Var.a = fcfVar4.a();
            fcf fcfVar5 = this.a;
            if (fcfVar5 == null) {
                this.a = fcfVar4;
                fcfVar4.g = fcfVar4;
                fcfVar4.f = fcfVar4;
            } else {
                fcfVar5.g.b(fcfVar4);
                fcf fcfVar6 = fcfVar4.g;
                if (fcfVar6 == fcfVar4) {
                    ore.k("cannot compact");
                    return;
                } else if (fcfVar6.e) {
                    int i4 = fcfVar4.c - fcfVar4.b;
                    if (i4 <= (8192 - fcfVar6.c) + (fcfVar6.d ? 0 : fcfVar6.b)) {
                        fcfVar4.d(fcfVar6, i4);
                        fcfVar4.a();
                        vcf.a(fcfVar4);
                    }
                }
            }
            l31Var.b -= j2;
            this.b += j2;
            j -= j2;
        }
    }

    public final fcf Y(int i) {
        if (i < 1 || i > 8192) {
            ore.p("unexpected capacity");
            return null;
        }
        fcf fcfVar = this.a;
        if (fcfVar == null) {
            fcf fcfVarB = vcf.b();
            this.a = fcfVarB;
            fcfVarB.g = fcfVarB;
            fcfVarB.f = fcfVarB;
            return fcfVarB;
        }
        fcf fcfVar2 = fcfVar.g;
        if (fcfVar2.c + i <= 8192 && fcfVar2.e) {
            return fcfVar2;
        }
        fcf fcfVarB2 = vcf.b();
        fcfVar2.b(fcfVarB2);
        return fcfVarB2;
    }

    public final void b(l31 l31Var, long j, long j2) {
        long j3 = j;
        gm0.g(this.b, j3, j2);
        if (j2 == 0) {
            return;
        }
        l31Var.b += j2;
        fcf fcfVar = this.a;
        while (true) {
            long j4 = fcfVar.c - fcfVar.b;
            if (j3 < j4) {
                break;
            }
            j3 -= j4;
            fcfVar = fcfVar.f;
        }
        long j5 = j2;
        while (j5 > 0) {
            fcf fcfVarC = fcfVar.c();
            int i = fcfVarC.b + ((int) j3);
            fcfVarC.b = i;
            fcfVarC.c = Math.min(i + ((int) j5), fcfVarC.c);
            fcf fcfVar2 = l31Var.a;
            if (fcfVar2 == null) {
                fcfVarC.g = fcfVarC;
                fcfVarC.f = fcfVarC;
                l31Var.a = fcfVarC;
            } else {
                fcfVar2.g.b(fcfVarC);
            }
            j5 -= (long) (fcfVarC.c - fcfVarC.b);
            fcfVar = fcfVar.f;
            j3 = 0;
        }
    }

    @Override // defpackage.y41
    public final void c0(long j) throws EOFException {
        if (this.b >= j) {
            return;
        }
        c.n();
    }

    public final Object clone() {
        l31 l31Var = new l31();
        if (this.b == 0) {
            return l31Var;
        }
        fcf fcfVar = this.a;
        fcf fcfVarC = fcfVar.c();
        l31Var.a = fcfVarC;
        fcfVarC.g = fcfVarC;
        fcfVarC.f = fcfVarC;
        for (fcf fcfVar2 = fcfVar.f; fcfVar2 != fcfVar; fcfVar2 = fcfVar2.f) {
            fcfVarC.g.b(fcfVar2.c());
        }
        l31Var.b = this.b;
        return l31Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.kag
    public final void close() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l31)) {
            return false;
        }
        long j = this.b;
        l31 l31Var = (l31) obj;
        if (j != l31Var.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        fcf fcfVar = this.a;
        fcf fcfVar2 = l31Var.a;
        int i = fcfVar.b;
        int i2 = fcfVar2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long jMin = Math.min(fcfVar.c - i, fcfVar2.c - i2);
            long j3 = 0;
            while (j3 < jMin) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (fcfVar.a[i] != fcfVar2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == fcfVar.c) {
                fcfVar = fcfVar.f;
                i = fcfVar.b;
            }
            if (i2 == fcfVar2.c) {
                fcfVar2 = fcfVar2.f;
                i2 = fcfVar2.b;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // defpackage.y41
    public final d71 f0(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            c.o(zo5.j(j, "byteCount: "));
            return null;
        }
        if (this.b < j) {
            c.n();
            return null;
        }
        if (j < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return new d71(I(j));
        }
        d71 d71VarW = W((int) j);
        skip(j);
        return d71VarW;
    }

    @Override // defpackage.x41, defpackage.kag, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.x41
    public final l31 getBuffer() {
        return this;
    }

    public final int hashCode() {
        fcf fcfVar = this.a;
        if (fcfVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = fcfVar.c;
            for (int i3 = fcfVar.b; i3 < i2; i3++) {
                i = (i * 31) + fcfVar.a[i3];
            }
            fcfVar = fcfVar.f;
        } while (fcfVar != this.a);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // defpackage.y41
    public final String j(long j) throws EOFException {
        if (j < 0) {
            c.o(zo5.j(j, "limit < 0: "));
            return null;
        }
        long j2 = BuildConfig.MAX_TIME_TO_UPLOAD;
        if (j != BuildConfig.MAX_TIME_TO_UPLOAD) {
            j2 = j + 1;
        }
        long j3 = j2;
        long jA = A((byte) 10, 0L, j3);
        if (jA != -1) {
            return b.a(jA, this);
        }
        if (j3 < this.b && y(j3 - 1) == 13 && y(j3) == 10) {
            return b.a(j3, this);
        }
        l31 l31Var = new l31();
        b(l31Var, 0L, Math.min(32L, this.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.b, j) + " content=" + l31Var.f0(l31Var.b).h() + (char) 8230);
    }

    public final void k0(int i, byte[] bArr) {
        long j = i;
        gm0.g(bArr.length, 0L, j);
        int i2 = 0;
        while (i2 < i) {
            fcf fcfVarY = Y(1);
            int iMin = Math.min(i - i2, 8192 - fcfVarY.c);
            int i3 = i2 + iMin;
            System.arraycopy(bArr, i2, fcfVarY.a, fcfVarY.c, i3 - i2);
            fcfVarY.c += iMin;
            i2 = i3;
        }
        this.b += j;
    }

    public final boolean l() {
        return this.b == 0;
    }

    @Override // defpackage.mdg
    public final xsh m() {
        return xsh.d;
    }

    @Override // defpackage.y41
    public final byte[] n0() {
        return I(this.b);
    }

    public final void o0(d71 d71Var) {
        d71Var.q(this, d71Var.a());
    }

    @Override // defpackage.y41
    public final void q0(long j, l31 l31Var) throws EOFException {
        long j2 = this.b;
        if (j2 >= j) {
            l31Var.X(j, this);
        } else {
            l31Var.X(j2, this);
            c.n();
        }
    }

    public final void r0(mdg mdgVar) {
        while (mdgVar.S(PlaybackStateCompat.ACTION_PLAY_FROM_URI, this) != -1) {
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        gm0.g(bArr.length, i, i2);
        fcf fcfVar = this.a;
        if (fcfVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, fcfVar.c - fcfVar.b);
        byte[] bArr2 = fcfVar.a;
        int i3 = fcfVar.b;
        System.arraycopy(bArr2, i3, bArr, i, (i3 + iMin) - i3);
        int i4 = fcfVar.b + iMin;
        fcfVar.b = i4;
        this.b -= (long) iMin;
        if (i4 == fcfVar.c) {
            this.a = fcfVar.a();
            vcf.a(fcfVar);
        }
        return iMin;
    }

    @Override // defpackage.y41
    public final byte readByte() {
        long j = this.b;
        if (j == 0) {
            c.n();
            return (byte) 0;
        }
        fcf fcfVar = this.a;
        int i = fcfVar.b;
        int i2 = fcfVar.c;
        int i3 = i + 1;
        byte b = fcfVar.a[i];
        this.b = j - 1;
        if (i3 != i2) {
            fcfVar.b = i3;
            return b;
        }
        this.a = fcfVar.a();
        vcf.a(fcfVar);
        return b;
    }

    @Override // defpackage.y41
    public final void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int i2 = read(bArr, i, bArr.length - i);
            if (i2 == -1) {
                c.n();
                return;
            }
            i += i2;
        }
    }

    @Override // defpackage.y41
    public final int readInt() throws EOFException {
        long j = this.b;
        if (j < 4) {
            c.n();
            return 0;
        }
        fcf fcfVar = this.a;
        int i = fcfVar.b;
        int i2 = fcfVar.c;
        if (i2 - i < 4) {
            return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
        }
        byte[] bArr = fcfVar.a;
        int i3 = i + 3;
        int i4 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24) | ((bArr[i + 2] & 255) << 8);
        int i5 = i + 4;
        int i6 = (bArr[i3] & 255) | i4;
        this.b = j - 4;
        if (i5 != i2) {
            fcfVar.b = i5;
            return i6;
        }
        this.a = fcfVar.a();
        vcf.a(fcfVar);
        return i6;
    }

    @Override // defpackage.y41
    public final long readLong() throws EOFException {
        long j = this.b;
        if (j < 8) {
            c.n();
            return 0L;
        }
        fcf fcfVar = this.a;
        int i = fcfVar.b;
        int i2 = fcfVar.c;
        if (i2 - i < 8) {
            return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
        }
        byte[] bArr = fcfVar.a;
        int i3 = i + 7;
        long j2 = ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24) | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8);
        int i4 = i + 8;
        long j3 = j2 | (((long) bArr[i3]) & 255);
        this.b = j - 8;
        if (i4 != i2) {
            fcfVar.b = i4;
            return j3;
        }
        this.a = fcfVar.a();
        vcf.a(fcfVar);
        return j3;
    }

    @Override // defpackage.y41
    public final short readShort() throws EOFException {
        long j = this.b;
        if (j < 2) {
            c.n();
            return (short) 0;
        }
        fcf fcfVar = this.a;
        int i = fcfVar.b;
        int i2 = fcfVar.c;
        if (i2 - i < 2) {
            return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
        }
        byte[] bArr = fcfVar.a;
        int i3 = i + 1;
        int i4 = (bArr[i] & 255) << 8;
        int i5 = i + 2;
        int i6 = (bArr[i3] & 255) | i4;
        this.b = j - 2;
        if (i5 == i2) {
            this.a = fcfVar.a();
            vcf.a(fcfVar);
        } else {
            fcfVar.b = i5;
        }
        return (short) i6;
    }

    @Override // defpackage.y41
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            fcf fcfVar = this.a;
            if (fcfVar == null) {
                c.n();
                return;
            }
            int iMin = (int) Math.min(j, fcfVar.c - fcfVar.b);
            long j2 = iMin;
            this.b -= j2;
            j -= j2;
            int i = fcfVar.b + iMin;
            fcfVar.b = i;
            if (i == fcfVar.c) {
                this.a = fcfVar.a();
                vcf.a(fcfVar);
            }
        }
    }

    public final void t0(int i) {
        fcf fcfVarY = Y(1);
        byte[] bArr = fcfVarY.a;
        int i2 = fcfVarY.c;
        fcfVarY.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    public final String toString() {
        long j = this.b;
        if (j <= 2147483647L) {
            return W((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.b).toString());
    }

    public final void u0(long j) {
        if (j == 0) {
            t0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        fcf fcfVarY = Y(i);
        byte[] bArr = fcfVarY.a;
        int i2 = fcfVarY.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        fcfVarY.c += i;
        this.b += (long) i;
    }

    public final void v0(int i) {
        fcf fcfVarY = Y(4);
        byte[] bArr = fcfVarY.a;
        int i2 = fcfVarY.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        fcfVarY.c = i2 + 4;
        this.b += 4;
    }

    @Override // defpackage.x41
    public final x41 w() {
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            fcf fcfVarY = Y(1);
            int iMin = Math.min(i, 8192 - fcfVarY.c);
            byteBuffer.get(fcfVarY.a, fcfVarY.c, iMin);
            i -= iMin;
            fcfVarY.c += iMin;
        }
        this.b += (long) iRemaining;
        return iRemaining;
    }

    @Override // defpackage.x41
    public final /* bridge */ /* synthetic */ x41 writeByte(int i) {
        t0(i);
        return this;
    }

    @Override // defpackage.x41
    public final /* bridge */ /* synthetic */ x41 writeInt(int i) {
        v0(i);
        return this;
    }

    @Override // defpackage.x41
    public final /* bridge */ /* synthetic */ x41 writeShort(int i) {
        x0(i);
        return this;
    }

    public final void x0(int i) {
        fcf fcfVarY = Y(2);
        byte[] bArr = fcfVarY.a;
        int i2 = fcfVarY.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        fcfVarY.c = i2 + 2;
        this.b += 2;
    }

    public final byte y(long j) {
        gm0.g(this.b, j, 1L);
        fcf fcfVar = this.a;
        fcfVar.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                fcfVar = fcfVar.g;
                j2 -= (long) (fcfVar.c - fcfVar.b);
            }
            return fcfVar.a[(int) ((((long) fcfVar.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = fcfVar.c;
            int i2 = fcfVar.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return fcfVar.a[(int) ((((long) i2) + j) - j3)];
            }
            fcfVar = fcfVar.f;
            j3 = j4;
        }
    }

    @Override // defpackage.y41
    public final String y0(Charset charset) {
        return K(this.b, charset);
    }

    public final void z0(int i, int i2, String str) {
        char cCharAt;
        if (i < 0) {
            c.o(zo5.h(i, "beginIndex < 0: "));
            return;
        }
        if (i2 < i) {
            c.o(qt4.l("endIndex < beginIndex: ", i2, i, " < "));
            return;
        }
        if (i2 > str.length()) {
            StringBuilder sbY = zo5.y(i2, "endIndex > string.length: ", " > ");
            sbY.append(str.length());
            throw new IllegalArgumentException(sbY.toString().toString());
        }
        while (i < i2) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 < 128) {
                fcf fcfVarY = Y(1);
                byte[] bArr = fcfVarY.a;
                int i3 = fcfVarY.c - i;
                int iMin = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) cCharAt2;
                while (true) {
                    i = i4;
                    if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt;
                }
                int i5 = fcfVarY.c;
                int i6 = (i3 + i) - i5;
                fcfVarY.c = i5 + i6;
                this.b += (long) i6;
            } else {
                if (cCharAt2 < 2048) {
                    fcf fcfVarY2 = Y(2);
                    byte[] bArr2 = fcfVarY2.a;
                    int i7 = fcfVarY2.c;
                    bArr2[i7] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i7 + 1] = (byte) ((cCharAt2 & '?') | np0.m);
                    fcfVarY2.c = i7 + 2;
                    this.b += 2;
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    fcf fcfVarY3 = Y(3);
                    byte[] bArr3 = fcfVarY3.a;
                    int i8 = fcfVarY3.c;
                    bArr3[i8] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i8 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | np0.m);
                    bArr3[i8 + 2] = (byte) ((cCharAt2 & '?') | np0.m);
                    fcfVarY3.c = i8 + 3;
                    this.b += 3;
                } else {
                    int i9 = i + 1;
                    char cCharAt3 = i9 < i2 ? str.charAt(i9) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        t0(63);
                        i = i9;
                    } else {
                        int i10 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        fcf fcfVarY4 = Y(4);
                        byte[] bArr4 = fcfVarY4.a;
                        int i11 = fcfVarY4.c;
                        bArr4[i11] = (byte) ((i10 >> 18) | 240);
                        bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | np0.m);
                        bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | np0.m);
                        bArr4[i11 + 3] = (byte) ((i10 & 63) | np0.m);
                        fcfVarY4.c = i11 + 4;
                        this.b += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // defpackage.x41
    public final x41 write(byte[] bArr) {
        k0(bArr.length, bArr);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        fcf fcfVar = this.a;
        if (fcfVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), fcfVar.c - fcfVar.b);
        byteBuffer.put(fcfVar.a, fcfVar.b, iMin);
        int i = fcfVar.b + iMin;
        fcfVar.b = i;
        this.b -= (long) iMin;
        if (i == fcfVar.c) {
            this.a = fcfVar.a();
            vcf.a(fcfVar);
        }
        return iMin;
    }
}
