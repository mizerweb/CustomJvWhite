package androidx.datastore.preferences.protobuf;

import defpackage.c0a;
import defpackage.c71;
import defpackage.g2m;
import defpackage.ldi;
import defpackage.np0;
import defpackage.ore;
import defpackage.rqi;
import defpackage.tu3;
import defpackage.wj8;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends tu3 {
    public final FileInputStream c;
    public final byte[] d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j = Integer.MAX_VALUE;

    public b(FileInputStream fileInputStream) {
        Charset charset = wj8.a;
        this.c = fileInputStream;
        this.d = new byte[np0.r];
        this.e = 0;
        this.g = 0;
        this.i = 0;
    }

    @Override // defpackage.tu3
    public final int A() {
        return I();
    }

    @Override // defpackage.tu3
    public final long B() {
        return J();
    }

    @Override // defpackage.tu3
    public final boolean C(int i) throws InvalidProtocolBufferException {
        int iZ;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            int i4 = this.e - this.g;
            byte[] bArr = this.d;
            if (i4 >= 10) {
                while (i3 < 10) {
                    int i5 = this.g;
                    this.g = i5 + 1;
                    if (bArr[i5] < 0) {
                        i3++;
                    }
                }
                throw InvalidProtocolBufferException.c();
            }
            while (i3 < 10) {
                if (this.g == this.e) {
                    M(1);
                }
                int i6 = this.g;
                this.g = i6 + 1;
                if (bArr[i6] < 0) {
                    i3++;
                }
            }
            throw InvalidProtocolBufferException.c();
            return true;
        }
        if (i2 == 1) {
            N(8);
            return true;
        }
        if (i2 == 2) {
            N(I());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            N(4);
            return true;
        }
        do {
            iZ = z();
            if (iZ == 0) {
                break;
            }
        } while (C(iZ));
        a(((i >>> 3) << 3) | 4);
        return true;
    }

    public final byte[] D(int i) throws IOException {
        byte[] bArrE = E(i);
        if (bArrE != null) {
            return bArrE;
        }
        int i2 = this.g;
        int i3 = this.e;
        int length = i3 - i2;
        this.i += i3;
        this.g = 0;
        this.e = 0;
        ArrayList<byte[]> arrayListF = F(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListF) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] E(int i) throws IOException {
        if (i == 0) {
            return wj8.b;
        }
        if (i < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i2 = this.i;
        int i3 = this.g;
        int i4 = i2 + i3 + i;
        if (i4 - Integer.MAX_VALUE > 0) {
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.j;
        if (i4 > i5) {
            N((i5 - i2) - i3);
            throw InvalidProtocolBufferException.f();
        }
        int i6 = this.e - i3;
        int i7 = i - i6;
        FileInputStream fileInputStream = this.c;
        if (i7 >= 4096 && i7 > fileInputStream.available()) {
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.d, this.g, bArr, 0, i6);
        this.i += this.e;
        this.g = 0;
        this.e = 0;
        while (i6 < i) {
            int i8 = fileInputStream.read(bArr, i6, i - i6);
            if (i8 == -1) {
                throw InvalidProtocolBufferException.f();
            }
            this.i += i8;
            i6 += i8;
        }
        return bArr;
    }

    public final ArrayList F(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, np0.r);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.c.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw InvalidProtocolBufferException.f();
                }
                this.i += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final int G() throws InvalidProtocolBufferException {
        int i = this.g;
        if (this.e - i < 4) {
            M(4);
            i = this.g;
        }
        this.g = i + 4;
        byte[] bArr = this.d;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public final long H() throws InvalidProtocolBufferException {
        int i = this.g;
        if (this.e - i < 8) {
            M(8);
            i = this.g;
        }
        this.g = i + 8;
        byte[] bArr = this.d;
        return ((((long) bArr[i + 1]) & 255) << 8) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    public final int I() {
        int i;
        int i2 = this.g;
        int i3 = this.e;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.d;
            byte b = bArr[i2];
            if (b >= 0) {
                this.g = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << 14) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << 21);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.g = i5;
                return i;
            }
        }
        return (int) K();
    }

    public final long J() {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.g;
        int i2 = this.e;
        if (i2 != i) {
            int i3 = i + 1;
            byte[] bArr = this.d;
            byte b = bArr[i];
            if (b >= 0) {
                this.g = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << 14) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << 21);
                        if (i9 < 0) {
                            j4 = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j4 = j2 ^ j7;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                        j = j4;
                    }
                }
                this.g = i4;
                return j;
            }
        }
        return K();
    }

    public final long K() throws InvalidProtocolBufferException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            if (this.g == this.e) {
                M(1);
            }
            int i2 = this.g;
            this.g = i2 + 1;
            byte b = this.d[i2];
            j |= ((long) (b & 127)) << i;
            if ((b & 128) == 0) {
                return j;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    public final void L() {
        int i = this.e + this.f;
        this.e = i;
        int i2 = this.i + i;
        int i3 = this.j;
        if (i2 <= i3) {
            this.f = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f = i4;
        this.e = i - i4;
    }

    public final void M(int i) throws InvalidProtocolBufferException {
        if (O(i)) {
            return;
        }
        if (i <= (Integer.MAX_VALUE - this.i) - this.g) {
            throw InvalidProtocolBufferException.f();
        }
        throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void N(int i) throws InvalidProtocolBufferException {
        int i2 = this.e;
        int i3 = this.g;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.g = i3 + i;
            return;
        }
        FileInputStream fileInputStream = this.c;
        if (i < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i5 = this.i;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.j;
        if (i7 > i8) {
            N((i8 - i5) - i3);
            throw InvalidProtocolBufferException.f();
        }
        this.i = i6;
        this.e = 0;
        this.g = 0;
        while (i4 < i) {
            long j = i - i4;
            try {
                long jSkip = fileInputStream.skip(j);
                if (jSkip < 0 || jSkip > j) {
                    throw new IllegalStateException(fileInputStream.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                }
                if (jSkip == 0) {
                    break;
                } else {
                    i4 += (int) jSkip;
                }
            } catch (Throwable th) {
                this.i += i4;
                L();
                throw th;
            }
        }
        this.i += i4;
        L();
        if (i4 >= i) {
            return;
        }
        int i9 = this.e;
        int i10 = i9 - this.g;
        this.g = i9;
        M(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.e;
            if (i11 <= i12) {
                this.g = i11;
                return;
            } else {
                i10 += i12;
                this.g = i12;
                M(1);
            }
        }
    }

    public final boolean O(int i) throws IOException {
        int i2 = this.g;
        int i3 = i2 + i;
        int i4 = this.e;
        if (i3 <= i4) {
            ore.k(c0a.k(i, "refillBuffer() called when ", " bytes were already available in buffer"));
            return false;
        }
        int i5 = this.i;
        if (i <= (Integer.MAX_VALUE - i5) - i2 && i5 + i2 + i <= this.j) {
            byte[] bArr = this.d;
            if (i2 > 0) {
                if (i4 > i2) {
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.i += i2;
                this.e -= i2;
                this.g = 0;
            }
            int i6 = this.e;
            int iMin = Math.min(bArr.length - i6, (Integer.MAX_VALUE - this.i) - i6);
            FileInputStream fileInputStream = this.c;
            int i7 = fileInputStream.read(bArr, i6, iMin);
            if (i7 == 0 || i7 < -1 || i7 > bArr.length) {
                throw new IllegalStateException(fileInputStream.getClass() + "#read(byte[]) returned invalid result: " + i7 + "\nThe InputStream implementation is buggy.");
            }
            if (i7 > 0) {
                this.e += i7;
                L();
                if (this.e >= i) {
                    return true;
                }
                return O(i);
            }
        }
        return false;
    }

    @Override // defpackage.tu3
    public final void a(int i) throws InvalidProtocolBufferException {
        if (this.h != i) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // defpackage.tu3
    public final int c() {
        return this.i + this.g;
    }

    @Override // defpackage.tu3
    public final boolean d() {
        return this.g == this.e && !O(1);
    }

    @Override // defpackage.tu3
    public final void i(int i) {
        this.j = i;
        L();
    }

    @Override // defpackage.tu3
    public final int j(int i) throws InvalidProtocolBufferException {
        if (i < 0) {
            throw InvalidProtocolBufferException.d();
        }
        int i2 = this.i + this.g + i;
        int i3 = this.j;
        if (i2 > i3) {
            throw InvalidProtocolBufferException.f();
        }
        this.j = i2;
        L();
        return i3;
    }

    @Override // defpackage.tu3
    public final boolean k() {
        return J() != 0;
    }

    @Override // defpackage.tu3
    public final c71 l() throws IOException {
        int I = I();
        int i = this.e;
        int i2 = this.g;
        int i3 = i - i2;
        byte[] bArr = this.d;
        if (I <= i3 && I > 0) {
            c71 c71VarA = c71.a(i2, bArr, I);
            this.g += I;
            return c71VarA;
        }
        if (I == 0) {
            return c71.c;
        }
        byte[] bArrE = E(I);
        if (bArrE != null) {
            return c71.a(0, bArrE, bArrE.length);
        }
        int i4 = this.g;
        int i5 = this.e;
        int length = i5 - i4;
        this.i += i5;
        this.g = 0;
        this.e = 0;
        ArrayList<byte[]> arrayListF = F(I - length);
        byte[] bArr2 = new byte[I];
        System.arraycopy(bArr, i4, bArr2, 0, length);
        for (byte[] bArr3 : arrayListF) {
            System.arraycopy(bArr3, 0, bArr2, length, bArr3.length);
            length += bArr3.length;
        }
        c71 c71Var = c71.c;
        return new c71(bArr2);
    }

    @Override // defpackage.tu3
    public final double m() {
        return Double.longBitsToDouble(H());
    }

    @Override // defpackage.tu3
    public final int n() {
        return I();
    }

    @Override // defpackage.tu3
    public final int o() {
        return G();
    }

    @Override // defpackage.tu3
    public final long p() {
        return H();
    }

    @Override // defpackage.tu3
    public final float q() {
        return Float.intBitsToFloat(G());
    }

    @Override // defpackage.tu3
    public final int r() {
        return I();
    }

    @Override // defpackage.tu3
    public final long s() {
        return J();
    }

    @Override // defpackage.tu3
    public final int t() {
        return G();
    }

    @Override // defpackage.tu3
    public final long u() {
        return H();
    }

    @Override // defpackage.tu3
    public final int v() {
        int I = I();
        return (-(I & 1)) ^ (I >>> 1);
    }

    @Override // defpackage.tu3
    public final long w() {
        long J = J();
        return (-(J & 1)) ^ (J >>> 1);
    }

    @Override // defpackage.tu3
    public final String x() throws InvalidProtocolBufferException {
        int I = I();
        byte[] bArr = this.d;
        if (I > 0) {
            int i = this.e;
            int i2 = this.g;
            if (I <= i - i2) {
                String str = new String(bArr, i2, I, wj8.a);
                this.g += I;
                return str;
            }
        }
        if (I == 0) {
            return "";
        }
        if (I > this.e) {
            return new String(D(I), wj8.a);
        }
        M(I);
        String str2 = new String(bArr, this.g, I, wj8.a);
        this.g += I;
        return str2;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x0134 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x0148 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x011d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x014a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f A[LOOP:2: B:27:0x0066->B:30:0x006f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0098  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:60:0x0117  */
    /* JADX WARN: Code duplicated, block: B:64:0x0124  */
    /* JADX WARN: Code duplicated, block: B:66:0x0128 A[LOOP:5: B:63:0x0122->B:66:0x0128, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x0138  */
    /* JADX WARN: Code duplicated, block: B:76:0x014e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0166  */
    /* JADX WARN: Code duplicated, block: B:91:0x007b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x007d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x00ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00d1 A[SYNTHETIC] */
    @Override // defpackage.tu3
    public final String y() throws IOException {
        int i;
        int i2;
        byte b;
        int i3;
        byte b2;
        int i4;
        int i5;
        byte bF;
        int i6;
        byte bF2;
        int I = I();
        int i7 = this.g;
        int i8 = this.e;
        int i9 = i8 - i7;
        byte[] bArrD = this.d;
        if (I <= i9 && I > 0) {
            this.g = i7 + I;
        } else {
            if (I == 0) {
                return "";
            }
            if (I <= i8) {
                M(I);
                this.g = I;
            } else {
                bArrD = D(I);
            }
            i7 = 0;
        }
        switch (rqi.a.a) {
            case 0:
                if ((i7 | I | ((bArrD.length - i7) - I)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArrD.length), Integer.valueOf(i7), Integer.valueOf(I)));
                }
                int i10 = i7 + I;
                char[] cArr = new char[I];
                int i11 = 0;
                while (i7 < i10) {
                    byte b3 = bArrD[i7];
                    if (b3 < 0) {
                        i = i11;
                        while (i7 < i10) {
                            i2 = i7 + 1;
                            b = bArrD[i7];
                            if (b >= 0) {
                                i3 = i + 1;
                                cArr[i] = (char) b;
                                while (i2 < i10) {
                                    b2 = bArrD[i2];
                                    if (b2 >= 0) {
                                        i2++;
                                        cArr[i3] = (char) b2;
                                        i3++;
                                    } else {
                                        i = i3;
                                        i7 = i2;
                                    }
                                }
                                i = i3;
                                i7 = i2;
                            } else if (b < -32) {
                                if (i2 < i10) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                i7 += 2;
                                g2m.b(b, bArrD[i2], cArr, i);
                                i++;
                            } else if (b < -16) {
                                if (i2 < i10 - 1) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                int i12 = i7 + 2;
                                i7 += 3;
                                g2m.c(b, bArrD[i2], bArrD[i12], cArr, i);
                                i++;
                            } else {
                                if (i2 < i10 - 2) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                byte b4 = bArrD[i2];
                                int i13 = i7 + 3;
                                byte b5 = bArrD[i7 + 2];
                                i7 += 4;
                                g2m.a(b, b4, b5, bArrD[i13], cArr, i);
                                i += 2;
                            }
                        }
                        return new String(cArr, 0, i);
                    }
                    i7++;
                    cArr[i11] = (char) b3;
                    i11++;
                }
                i = i11;
                while (i7 < i10) {
                    i2 = i7 + 1;
                    b = bArrD[i7];
                    if (b >= 0) {
                        i3 = i + 1;
                        cArr[i] = (char) b;
                        while (i2 < i10) {
                            b2 = bArrD[i2];
                            if (b2 >= 0) {
                                i2++;
                                cArr[i3] = (char) b2;
                                i3++;
                            } else {
                                i = i3;
                                i7 = i2;
                            }
                        }
                        i = i3;
                        i7 = i2;
                    } else if (b < -32) {
                        if (i2 < i10) {
                            throw InvalidProtocolBufferException.a();
                        }
                        i7 += 2;
                        g2m.b(b, bArrD[i2], cArr, i);
                        i++;
                    } else if (b < -16) {
                        if (i2 < i10 - 1) {
                            throw InvalidProtocolBufferException.a();
                        }
                        int i14 = i7 + 2;
                        i7 += 3;
                        g2m.c(b, bArrD[i2], bArrD[i14], cArr, i);
                        i++;
                    } else {
                        if (i2 < i10 - 2) {
                            throw InvalidProtocolBufferException.a();
                        }
                        byte b6 = bArrD[i2];
                        int i15 = i7 + 3;
                        byte b7 = bArrD[i7 + 2];
                        i7 += 4;
                        g2m.a(b, b6, b7, bArrD[i15], cArr, i);
                        i += 2;
                    }
                }
                return new String(cArr, 0, i);
            default:
                if ((i7 | I | ((bArrD.length - i7) - I)) < 0) {
                    throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArrD.length), Integer.valueOf(i7), Integer.valueOf(I)));
                }
                int i16 = i7 + I;
                char[] cArr2 = new char[I];
                int i17 = 0;
                while (i7 < i16) {
                    byte bF3 = ldi.f(i7, bArrD);
                    if (bF3 < 0) {
                        i4 = i17;
                        while (i7 < i16) {
                            i5 = i7 + 1;
                            bF = ldi.f(i7, bArrD);
                            if (bF >= 0) {
                                i6 = i4 + 1;
                                cArr2[i4] = (char) bF;
                                while (i5 < i16) {
                                    bF2 = ldi.f(i5, bArrD);
                                    if (bF2 >= 0) {
                                        i5++;
                                        cArr2[i6] = (char) bF2;
                                        i6++;
                                    } else {
                                        i4 = i6;
                                        i7 = i5;
                                    }
                                }
                                i4 = i6;
                                i7 = i5;
                            } else if (bF < -32) {
                                if (i5 < i16) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                i7 += 2;
                                g2m.b(bF, ldi.f(i5, bArrD), cArr2, i4);
                                i4++;
                            } else if (bF < -16) {
                                if (i5 < i16 - 1) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                int i18 = i7 + 2;
                                i7 += 3;
                                g2m.c(bF, ldi.f(i5, bArrD), ldi.f(i18, bArrD), cArr2, i4);
                                i4++;
                            } else {
                                if (i5 < i16 - 2) {
                                    throw InvalidProtocolBufferException.a();
                                }
                                byte bF4 = ldi.f(i5, bArrD);
                                int i19 = i7 + 3;
                                byte bF5 = ldi.f(i7 + 2, bArrD);
                                i7 += 4;
                                g2m.a(bF, bF4, bF5, ldi.f(i19, bArrD), cArr2, i4);
                                i4 += 2;
                            }
                        }
                        return new String(cArr2, 0, i4);
                    }
                    i7++;
                    cArr2[i17] = (char) bF3;
                    i17++;
                }
                i4 = i17;
                while (i7 < i16) {
                    i5 = i7 + 1;
                    bF = ldi.f(i7, bArrD);
                    if (bF >= 0) {
                        i6 = i4 + 1;
                        cArr2[i4] = (char) bF;
                        while (i5 < i16) {
                            bF2 = ldi.f(i5, bArrD);
                            if (bF2 >= 0) {
                                i5++;
                                cArr2[i6] = (char) bF2;
                                i6++;
                            } else {
                                i4 = i6;
                                i7 = i5;
                            }
                        }
                        i4 = i6;
                        i7 = i5;
                    } else if (bF < -32) {
                        if (i5 < i16) {
                            throw InvalidProtocolBufferException.a();
                        }
                        i7 += 2;
                        g2m.b(bF, ldi.f(i5, bArrD), cArr2, i4);
                        i4++;
                    } else if (bF < -16) {
                        if (i5 < i16 - 1) {
                            throw InvalidProtocolBufferException.a();
                        }
                        int i110 = i7 + 2;
                        i7 += 3;
                        g2m.c(bF, ldi.f(i5, bArrD), ldi.f(i110, bArrD), cArr2, i4);
                        i4++;
                    } else {
                        if (i5 < i16 - 2) {
                            throw InvalidProtocolBufferException.a();
                        }
                        byte bF6 = ldi.f(i5, bArrD);
                        int i111 = i7 + 3;
                        byte bF7 = ldi.f(i7 + 2, bArrD);
                        i7 += 4;
                        g2m.a(bF, bF6, bF7, ldi.f(i111, bArrD), cArr2, i4);
                        i4 += 2;
                    }
                }
                return new String(cArr2, 0, i4);
        }
    }

    @Override // defpackage.tu3
    public final int z() throws InvalidProtocolBufferException {
        if (d()) {
            this.h = 0;
            return 0;
        }
        int I = I();
        this.h = I;
        if ((I >>> 3) != 0) {
            return I;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }
}
