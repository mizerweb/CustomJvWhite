package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class g08 extends InputStream {
    public static final /* synthetic */ int l = 0;
    public final DataInputStream a;
    public boolean b;
    public int j;
    public int c = 0;
    public int d = 4;
    public int e = 0;
    public int f = 0;
    public byte[] g = new byte[65536];
    public int h = 0;
    public int i = 0;
    public final int k = 2;

    public g08(DataInputStream dataInputStream) {
        this.a = dataInputStream;
    }

    public final int A() throws IOException {
        DataInputStream dataInputStream = this.a;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        E(2);
        byte[] bArr = this.g;
        int i3 = this.i;
        int i4 = i3 + 1;
        this.i = i4;
        bArr[i3] = (byte) i;
        this.i = i3 + 2;
        bArr[i4] = (byte) i2;
        this.e -= 2;
        this.c += 2;
        return (i << 8) | i2;
    }

    public final void E(int i) {
        int i2 = this.i + i;
        byte[] bArr = this.g;
        if (i2 > bArr.length) {
            byte[] bArr2 = new byte[(int) (((double) bArr.length) * 1.5d)];
            byte[] bArr3 = this.g;
            System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
            this.g = bArr2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:65:0x0107  */
    /* JADX WARN: Code duplicated, block: B:67:0x0116  */
    public final boolean I() throws IOException {
        long jY;
        int i = 0;
        this.h = 0;
        this.i = 0;
        int i2 = this.e;
        DataInputStream dataInputStream = this.a;
        if (i2 == 0) {
            int i3 = dataInputStream.read();
            if (i3 == -1) {
                return false;
            }
            E(1);
            byte[] bArr = this.g;
            int i4 = this.i;
            this.i = i4 + 1;
            bArr[i4] = (byte) i3;
            this.c++;
            W();
            int iW = W();
            if (i3 != 12 && i3 != 28) {
                this.d = this.c + iW;
                return true;
            }
            this.d = this.c;
            this.e = iW;
            return true;
        }
        if (i2 < 0) {
            ore.p(zo5.t(new StringBuilder("Heap parsing reached "), this.e, " heap length"));
            return false;
        }
        int iL = l();
        if (iL == 144) {
            Y(this.j);
        } else if (iL != 195) {
            int i5 = 4;
            if (iL == 254) {
                Y(this.j + 4);
            } else if (iL != 255) {
                switch (iL) {
                    case 1:
                        Y(this.j * 2);
                        break;
                    case 2:
                    case 3:
                    case 8:
                        Y(this.j + 8);
                        break;
                    case 4:
                    case 6:
                        Y(this.j + 4);
                        break;
                    case 5:
                    case 7:
                        Y(this.j);
                        break;
                    default:
                        switch (iL) {
                            case 32:
                                Y((this.j * 7) + 8);
                                int iA = A();
                                for (int i6 = 0; i6 < iA; i6++) {
                                    Y(2);
                                    x();
                                }
                                int iA2 = A();
                                for (int i7 = 0; i7 < iA2; i7++) {
                                    Y(this.j);
                                    x();
                                }
                                Y((this.j + 1) * A());
                                break;
                            case 33:
                                Y((this.j * 2) + 4);
                                Y(y());
                                break;
                            case 34:
                            case vg8.l /* 35 */:
                                y();
                                if (this.j == 8) {
                                    y();
                                }
                                y();
                                int iY = y();
                                if (iL == 35) {
                                    jY = l();
                                } else {
                                    jY = y();
                                    if (this.j == 8) {
                                        jY = (jY << 32) | ((long) y());
                                    }
                                }
                                switch ((int) jY) {
                                    case 4:
                                    case 8:
                                        i5 = 1;
                                        break;
                                    case 5:
                                    case 9:
                                        i5 = 2;
                                        break;
                                    case 6:
                                    case 10:
                                        break;
                                    case 7:
                                    case 11:
                                        i5 = 8;
                                        break;
                                    default:
                                        i5 = 0;
                                        break;
                                }
                                boolean z = i5 == 0;
                                if (z) {
                                    i5 = this.j;
                                }
                                int i8 = i5 * iY;
                                if (z) {
                                    i = i8;
                                } else {
                                    boolean z2 = this.b;
                                    if (this.k == 2) {
                                        if (!z2) {
                                            int i9 = i8;
                                            while (i9 > 0) {
                                                int iSkipBytes = dataInputStream.skipBytes(i9);
                                                if (iSkipBytes == -1) {
                                                    c.n();
                                                    return false;
                                                }
                                                this.c += iSkipBytes;
                                                i9 -= iSkipBytes;
                                            }
                                        }
                                    } else if (z2) {
                                        this.f = i8;
                                    } else {
                                        i = i8;
                                    }
                                }
                                this.e -= i8;
                                break;
                            default:
                                switch (iL) {
                                    case 137:
                                    case 138:
                                    case 139:
                                    case 140:
                                    case 141:
                                        Y(this.j);
                                        break;
                                    case 142:
                                        Y(this.j + 8);
                                        break;
                                    default:
                                        StringBuilder sbY = zo5.y(iL, "Type ", " is not supported! ");
                                        sbY.append(this.c);
                                        throw new IllegalArgumentException(sbY.toString());
                                }
                                break;
                        }
                        break;
                }
            } else {
                Y(this.j);
            }
        } else {
            Y(this.j + 9);
        }
        this.d = this.c + i;
        return true;
    }

    public final int K(int i, byte[] bArr, int i2) {
        int iMin = Math.min(i2, this.i - this.h);
        System.arraycopy(this.g, this.h, bArr, i, iMin);
        this.h += iMin;
        return iMin;
    }

    public final void P() throws IOException {
        byte b;
        DataInputStream dataInputStream = this.a;
        this.b = dataInputStream.readByte() == 67;
        byte[] bArr = this.g;
        int i = this.i;
        if (this.k == 2) {
            this.i = i + 1;
            bArr[i] = 67;
        } else {
            this.i = i + 1;
            bArr[i] = 74;
        }
        do {
            b = dataInputStream.readByte();
            byte[] bArr2 = this.g;
            int i2 = this.i;
            this.i = i2 + 1;
            bArr2[i2] = b;
        } while (b != 0);
        this.j = W();
        dataInputStream.readFully(this.g, this.i, 8);
        int i3 = this.i + 8;
        this.i = i3;
        this.c = i3;
        this.d = i3;
    }

    public final int W() throws IOException {
        E(4);
        this.a.readFully(this.g, this.i, 4);
        byte[] bArr = this.g;
        int i = this.i;
        int i2 = i + 1;
        this.i = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.i = i4;
        int i5 = bArr[i2] & 255;
        int i6 = i + 3;
        this.i = i6;
        int i7 = bArr[i4] & 255;
        this.i = i + 4;
        int i8 = bArr[i6] & 255;
        this.c += 4;
        return (i3 << 24) | (i5 << 16) | (i7 << 8) | i8;
    }

    public final void Y(int i) throws IOException {
        E(i);
        this.a.readFully(this.g, this.i, i);
        this.i += i;
        this.c += i;
        this.e -= i;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    public final int l() throws IOException {
        int i = this.a.read();
        E(1);
        byte[] bArr = this.g;
        int i2 = this.i;
        this.i = i2 + 1;
        bArr[i2] = (byte) i;
        this.e--;
        this.c++;
        return i;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.c;
        if (i == 0) {
            P();
            byte[] bArr = this.g;
            int i2 = this.h;
            this.h = i2 + 1;
            return bArr[i2];
        }
        int i3 = this.i;
        int i4 = this.h;
        if (i3 > i4) {
            byte[] bArr2 = this.g;
            this.h = i4 + 1;
            return bArr2[i4];
        }
        int i5 = this.f;
        if (i5 > 0) {
            this.f = i5 - 1;
            return -2;
        }
        if (this.d > i) {
            int i6 = this.a.read();
            if (i6 != -1) {
                this.c++;
            }
            return i6;
        }
        if (!I()) {
            return -1;
        }
        byte[] bArr3 = this.g;
        int i7 = this.h;
        this.h = i7 + 1;
        return bArr3[i7];
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x0035  */
    /* JADX WARN: Code duplicated, block: B:23:0x0037  */
    /* JADX WARN: Code duplicated, block: B:24:0x003a  */
    /* JADX WARN: Code duplicated, block: B:25:0x003c  */
    public final void x() throws IOException {
        int iL = l();
        int i = 2;
        if (iL == 2) {
            i = this.j;
        } else if (iL == 70) {
            i = 4;
        } else if (iL == 76) {
            i = this.j;
        } else if (iL != 83) {
            if (iL == 73) {
                i = 4;
            } else if (iL == 74) {
                i = 8;
            } else if (iL == 90) {
                i = 1;
            } else {
                if (iL != 91) {
                    switch (iL) {
                        case 4:
                        case 8:
                            i = 1;
                            break;
                        case 5:
                        case 9:
                            break;
                        case 6:
                        case 10:
                            i = 4;
                            break;
                        case 7:
                        case 11:
                            i = 8;
                            break;
                        default:
                            switch (iL) {
                                case 66:
                                    i = 1;
                                    break;
                                case 67:
                                    break;
                                case 68:
                                    i = 8;
                                    break;
                                default:
                                    ore.p(c0a.k(iL, "Signature type ", " is not supported"));
                                    break;
                            }
                            break;
                    }
                    return;
                }
                i = this.j;
            }
        }
        Y(i);
    }

    public final int y() {
        this.e -= 4;
        return W();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.c;
        if (i3 == 0) {
            P();
            return K(i, bArr, i2);
        }
        if (this.i > this.h) {
            return K(i, bArr, i2);
        }
        int i4 = this.f;
        if (i4 > 0) {
            int iMin = Math.min(i2, i4);
            Arrays.fill(bArr, i, i + iMin, (byte) -2);
            this.f -= iMin;
            return iMin;
        }
        int i5 = this.d;
        if (i5 > i3) {
            int i6 = this.a.read(bArr, i, Math.min(i2, i5 - i3));
            if (i6 != -1) {
                this.c += i6;
            }
            return i6;
        }
        if (I()) {
            return K(i, bArr, i2);
        }
        return -1;
    }
}
