package defpackage;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* JADX INFO: loaded from: classes2.dex */
public final class nai extends Reader {
    public final l38 a;
    public InputStream b;
    public byte[] c;
    public int d;
    public int e;
    public final boolean f;
    public char g = 0;
    public int h;
    public int i;
    public final boolean j;
    public char[] k;

    public nai(l38 l38Var, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        this.a = l38Var;
        this.b = inputStream;
        this.c = bArr;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.j = inputStream != null;
    }

    public final void b(int i) throws CharConversionException {
        throw new CharConversionException(zo5.t(qv1.p("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ", i, ", needed 4, at char #", this.h, ", byte #"), this.i + i, ")"));
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            this.b = null;
            byte[] bArr = this.c;
            if (bArr != null) {
                this.c = null;
                l38 l38Var = this.a;
                if (l38Var != null) {
                    l38Var.b(bArr);
                }
            }
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr;
        byte[] bArr2;
        int i5;
        int i6;
        byte[] bArr3 = this.c;
        if (bArr3 == null) {
            return -1;
        }
        if (i2 < 1) {
            return i2;
        }
        if (i < 0 || (i3 = i + i2) > cArr.length) {
            throw new ArrayIndexOutOfBoundsException(String.format("read(buf,%d,%d), cbuf[%d]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(cArr.length)));
        }
        char c = this.g;
        if (c != 0) {
            i4 = i + 1;
            cArr[i] = c;
            this.g = (char) 0;
        } else {
            int i7 = this.e;
            int i8 = this.d;
            int i9 = i7 - i8;
            if (i9 < 4) {
                InputStream inputStream = this.b;
                if (inputStream != null) {
                    this.i = (i7 - i9) + this.i;
                    l38 l38Var = this.a;
                    boolean z = this.j;
                    if (i9 > 0) {
                        if (i8 > 0) {
                            System.arraycopy(bArr3, i8, bArr3, 0, i9);
                            this.d = 0;
                        }
                        this.e = i9;
                    } else {
                        this.d = 0;
                        int i10 = inputStream.read(bArr3);
                        if (i10 < 1) {
                            this.e = 0;
                            if (i10 >= 0) {
                                qr7.k("Strange I/O stream, returned 0 bytes on read");
                                return 0;
                            }
                            if (z && (bArr = this.c) != null) {
                                this.c = null;
                                if (l38Var != null) {
                                    l38Var.b(bArr);
                                }
                            }
                        } else {
                            this.e = i10;
                        }
                    }
                    while (true) {
                        int i11 = this.e;
                        if (i11 >= 4) {
                            break;
                        }
                        InputStream inputStream2 = this.b;
                        byte[] bArr4 = this.c;
                        int i12 = inputStream2.read(bArr4, i11, bArr4.length - i11);
                        if (i12 < 1) {
                            if (i12 >= 0) {
                                qr7.k("Strange I/O stream, returned 0 bytes on read");
                                return 0;
                            }
                            if (z && (bArr2 = this.c) != null) {
                                this.c = null;
                                if (l38Var != null) {
                                    l38Var.b(bArr2);
                                }
                            }
                            b(this.e);
                            throw null;
                        }
                        this.e += i12;
                    }
                }
                if (i9 == 0) {
                    return -1;
                }
                b(this.e - this.d);
                throw null;
            }
            i4 = i;
        }
        int i13 = this.e - 4;
        while (i4 < i3) {
            int i14 = this.d;
            if (i14 > i13) {
                break;
            }
            byte[] bArr5 = this.c;
            if (this.f) {
                i5 = (bArr5[i14] << 8) | (bArr5[i14 + 1] & 255);
                i6 = (bArr5[i14 + 3] & 255) | ((bArr5[i14 + 2] & 255) << 8);
            } else {
                int i15 = (bArr5[i14] & 255) | ((bArr5[i14 + 1] & 255) << 8);
                i5 = (bArr5[i14 + 3] << 8) | (bArr5[i14 + 2] & 255);
                i6 = i15;
            }
            this.d = i14 + 4;
            if (i5 != 0) {
                int i16 = 65535 & i5;
                int i17 = i6 | ((i16 - 1) << 16);
                if (i16 > 16) {
                    int i18 = i4 - i;
                    String str = String.format(" (above 0x%08x)", 1114111);
                    int i19 = (this.i + this.d) - 1;
                    int i20 = this.h + i18;
                    StringBuilder sb = new StringBuilder("Invalid UTF-32 character 0x");
                    sb.append(Integer.toHexString(i17));
                    sb.append(str);
                    sb.append(" at char #");
                    sb.append(i20);
                    throw new CharConversionException(qv1.o(sb, ", byte #", i19, ")"));
                }
                int i21 = i4 + 1;
                cArr[i4] = (char) ((i17 >> 10) + 55296);
                int i22 = (i17 & 1023) | 56320;
                if (i21 >= i3) {
                    this.g = (char) i17;
                    i4 = i21;
                    break;
                }
                i6 = i22;
                i4 = i21;
            }
            cArr[i4] = (char) i6;
            i4++;
        }
        int i23 = i4 - i;
        this.h += i23;
        return i23;
    }

    @Override // java.io.Reader
    public final int read() {
        if (this.k == null) {
            this.k = new char[1];
        }
        if (read(this.k, 0, 1) < 1) {
            return -1;
        }
        return this.k[0];
    }
}
