package defpackage;

import android.media.AudioDeviceInfo;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;

/* JADX INFO: loaded from: classes2.dex */
public final class pa0 {
    public final Object a;
    public Object b;
    public Object c;
    public boolean d;
    public int e;
    public int f;
    public boolean g;
    public int h;

    public pa0(l38 l38Var, InputStream inputStream) {
        this.g = true;
        this.a = l38Var;
        this.b = inputStream;
        if (l38Var.j != null) {
            ore.k("Trying to call same allocXxx() method second time");
            throw null;
        }
        x31 x31Var = l38Var.e;
        x31Var.getClass();
        int i = x31.c[0];
        i = i <= 0 ? 0 : i;
        byte[] bArr = (byte[]) x31Var.a.getAndSet(0, null);
        bArr = (bArr == null || bArr.length < i) ? new byte[i] : bArr;
        l38Var.j = bArr;
        this.c = bArr;
        this.e = 0;
        this.f = 0;
        this.d = true;
    }

    public static void d(String str) throws CharConversionException {
        throw new CharConversionException(c0a.o("Unsupported UCS-4 endianness (", str, ") detected"));
    }

    public pa0 a() {
        return new pa0(this);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x010c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x010e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0111  */
    /* JADX WARN: Code duplicated, block: B:69:0x0115  */
    /* JADX WARN: Code duplicated, block: B:70:0x0117  */
    /* JADX WARN: Code duplicated, block: B:71:0x0119  */
    /* JADX WARN: Code duplicated, block: B:73:0x011f  */
    /* JADX WARN: Code duplicated, block: B:75:0x0123  */
    /* JADX WARN: Code duplicated, block: B:76:0x0125  */
    /* JADX WARN: Code duplicated, block: B:77:0x0127 A[PHI: r5 r18 r20
  0x0127: PHI (r5v17 boolean) = (r5v16 boolean), (r5v19 boolean) binds: [B:42:0x00b9, B:63:0x010a] A[DONT_GENERATE, DONT_INLINE]
  0x0127: PHI (r18v4 char) = (r18v3 char), (r18v6 char) binds: [B:42:0x00b9, B:63:0x010a] A[DONT_GENERATE, DONT_INLINE]
  0x0127: PHI (r20v4 char) = (r20v3 char), (r20v6 char) binds: [B:42:0x00b9, B:63:0x010a] A[DONT_GENERATE, DONT_INLINE]] */
    public ju8 b(int i, v61 v61Var, ot2 ot2Var, int i2) throws CharConversionException {
        boolean z;
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        char c3;
        String str;
        Reader inputStreamReader;
        boolean z2;
        int i6;
        l38 l38Var = (l38) this.a;
        byte[] bArr = (byte[]) this.c;
        int i7 = this.e;
        if (!mw7.a(5, i2)) {
            z = false;
            c = '\b';
            c2 = 16;
            i3 = 1;
        } else if (c(4)) {
            int i8 = this.e;
            c2 = 16;
            c = '\b';
            int i9 = i8 + 2;
            int i10 = i8 + 3;
            int i11 = ((bArr[i9] & 255) << 8) | (bArr[i8] << 24) | ((bArr[i8 + 1] & 255) << 16) | (bArr[i10] & 255);
            if (i11 == -16842752) {
                d("3412");
                throw null;
            }
            if (i11 == -131072) {
                this.e = i8 + 4;
                this.h = 4;
                this.g = false;
            } else if (i11 == 65279) {
                this.g = true;
                this.e = i8 + 4;
                this.h = 4;
            } else {
                if (i11 == 65534) {
                    d("2143");
                    throw null;
                }
                int i12 = i11 >>> 16;
                if (i12 == 65279) {
                    this.e = i9;
                    this.h = 2;
                    this.g = true;
                } else if (i12 == 65534) {
                    this.e = i9;
                    this.h = 2;
                    this.g = false;
                } else if ((i11 >>> 8) == 15711167) {
                    this.e = i10;
                    this.h = 1;
                    this.g = true;
                } else {
                    if ((i11 >> 8) == 0) {
                        this.g = true;
                    } else if ((16777215 & i11) == 0) {
                        this.g = false;
                    } else {
                        if (((-16711681) & i11) == 0) {
                            d("3412");
                            throw null;
                        }
                        if ((i11 & (-65281)) == 0) {
                            d("2143");
                            throw null;
                        }
                        if ((i12 & 65280) == 0) {
                            this.g = true;
                        } else {
                            if ((i12 & 255) == 0) {
                                this.g = false;
                            } else {
                                z = false;
                            }
                            i3 = 1;
                            l38Var.c = i3;
                        }
                        this.h = 2;
                    }
                    this.h = 4;
                }
            }
            z = false;
            i6 = this.h;
            if (i6 != 1) {
                i3 = 1;
            } else if (i6 != 2) {
                if (i6 == 4) {
                    int i13 = vsi.a;
                    ore.q("Internal error: this code path should never get executed");
                    return null;
                }
                if (this.g) {
                    i3 = 4;
                } else {
                    i3 = 5;
                }
            } else if (this.g) {
                i3 = 2;
            } else {
                i3 = 3;
            }
            l38Var.c = i3;
        } else {
            c = '\b';
            c2 = 16;
            if (c(2)) {
                int i14 = this.e;
                int i15 = (bArr[i14 + 1] & 255) | ((bArr[i14] & 255) << 8);
                if ((i15 & 65280) == 0) {
                    this.g = true;
                    z = false;
                } else {
                    if ((i15 & 255) == 0) {
                        z = false;
                        this.g = false;
                    }
                    i3 = 1;
                    l38Var.c = i3;
                }
                this.h = 2;
                i6 = this.h;
                if (i6 != 1) {
                    i3 = 1;
                } else if (i6 != 2) {
                    if (i6 == 4) {
                        int i16 = vsi.a;
                        ore.q("Internal error: this code path should never get executed");
                        return null;
                    }
                    if (this.g) {
                        i3 = 4;
                    } else {
                        i3 = 5;
                    }
                } else if (this.g) {
                    i3 = 2;
                } else {
                    i3 = 3;
                }
                l38Var.c = i3;
            }
            z = false;
            i3 = 1;
            l38Var.c = i3;
        }
        int i17 = this.e - i7;
        if (i3 == 1 && mw7.a(2, i2)) {
            return new oai(l38Var, i, (InputStream) this.b, new v61(v61Var, v61Var.c, (u61) v61Var.b.get(), mw7.a(1, i2), mw7.a(3, i2)), (byte[]) this.c, this.e, this.f, i17, this.d);
        }
        boolean z3 = z;
        int i18 = l38Var.c;
        if (i18 == 1) {
            i4 = 5;
            i5 = 4;
            c3 = c;
        } else if (i18 == 2 || i18 == 3) {
            i4 = 5;
            i5 = 4;
            c3 = c2;
        } else {
            i5 = 4;
            i4 = 5;
            if (i18 != 4 && i18 != 5) {
                throw null;
            }
            c3 = ' ';
        }
        if (i18 == 1) {
            str = "UTF-8";
        } else if (i18 == 2) {
            str = "UTF-16BE";
        } else if (i18 == 3) {
            str = "UTF-16LE";
        } else if (i18 == i5) {
            str = "UTF-32BE";
        } else {
            if (i18 != i4) {
                throw null;
            }
            str = "UTF-32LE";
        }
        if (c3 == c || c3 == c2) {
            InputStream xcaVar = (InputStream) this.b;
            if (xcaVar == null) {
                int i19 = this.f - this.e;
                if (i19 <= 8192) {
                    inputStreamReader = new StringReader(new String(bArr, this.e, i19, str));
                } else {
                    xcaVar = new ByteArrayInputStream(bArr, this.e, this.f);
                }
            } else if (this.e < this.f) {
                xcaVar = new xca(l38Var, xcaVar, (byte[]) this.c, this.e, this.f);
            }
            inputStreamReader = new InputStreamReader(xcaVar, str);
        } else {
            if (c3 != ' ') {
                int i20 = vsi.a;
                ore.q("Internal error: this code path should never get executed");
                return null;
            }
            InputStream inputStream = (InputStream) this.b;
            byte[] bArr2 = (byte[]) this.c;
            int i21 = this.e;
            int i22 = this.f;
            int i23 = l38Var.c;
            if (i23 == 1) {
                z2 = z3;
            } else {
                if (i23 != 2) {
                    if (i23 != 3) {
                        if (i23 != 4) {
                            if (i23 != 5) {
                                throw null;
                            }
                        }
                    }
                    z2 = z3;
                }
                z2 = true;
            }
            inputStreamReader = new nai(l38Var, inputStream, bArr2, i21, i22, z2);
        }
        return new p8e(l38Var, i, inputStreamReader, ot2Var.c());
    }

    public boolean c(int i) throws IOException {
        int i2;
        int i3 = this.f - this.e;
        while (i3 < i) {
            InputStream inputStream = (InputStream) this.b;
            if (inputStream == null) {
                i2 = -1;
            } else {
                byte[] bArr = (byte[]) this.c;
                int i4 = this.f;
                i2 = inputStream.read(bArr, i4, bArr.length - i4);
            }
            if (i2 < 1) {
                return false;
            }
            this.f += i2;
            i3 += i2;
        }
        return true;
    }

    public void e(p70 p70Var) {
        this.b = p70Var;
    }

    public void f(int i) {
        this.e = i;
    }

    public void g(boolean z) {
        this.d = z;
    }

    public void h(boolean z) {
        this.g = z;
    }

    public void i() {
        this.h = -1;
    }

    public void j(AudioDeviceInfo audioDeviceInfo) {
        this.c = audioDeviceInfo;
    }

    public void k(int i) {
        this.f = i;
    }

    public pa0(pa0 pa0Var) {
        this.a = (b87) pa0Var.a;
        this.b = (p70) pa0Var.b;
        this.c = (AudioDeviceInfo) pa0Var.c;
        this.d = pa0Var.d;
        this.e = pa0Var.e;
        this.f = pa0Var.f;
        this.g = pa0Var.g;
        this.h = pa0Var.h;
    }

    public pa0(b87 b87Var) {
        this.a = b87Var;
        this.b = p70.i;
        this.e = 0;
        this.f = -1;
        this.h = -1;
    }
}
