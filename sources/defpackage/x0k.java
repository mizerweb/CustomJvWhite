package defpackage;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class x0k extends st8 {
    public static final char[] t = (char[]) lt2.a.clone();
    public static final char[] u = (char[]) lt2.b.clone();
    public final CharArrayWriter m;
    public final char n;
    public char[] o;
    public int p;
    public int q;
    public final int r;
    public char[] s;

    public x0k(l38 l38Var, int i, CharArrayWriter charArrayWriter, char c) {
        int[] iArrCopyOf;
        super(i, l38Var);
        this.m = charArrayWriter;
        if (l38Var.l != null) {
            ore.k("Trying to call same allocXxx() method second time");
            throw null;
        }
        char[] cArrA = l38Var.e.a(1, 0);
        l38Var.l = cArrA;
        this.o = cArrA;
        this.r = cArrA.length;
        this.n = c;
        boolean zR0 = r0(lv8.ESCAPE_FORWARD_SLASHES.c);
        if (c != '\"' || zR0) {
            if (c == '\"') {
                iArrCopyOf = zR0 ? lt2.k : lt2.j;
            } else {
                kt2 kt2Var = kt2.c;
                int[][] iArr = kt2Var.a;
                int[][] iArr2 = kt2Var.b;
                if (zR0) {
                    iArrCopyOf = iArr2[c];
                    if (iArrCopyOf == null) {
                        iArrCopyOf = iArr[c];
                        if (iArrCopyOf == null) {
                            iArrCopyOf = Arrays.copyOf(lt2.j, np0.m);
                            if (iArrCopyOf[c] == 0) {
                                iArrCopyOf[c] = -1;
                            }
                            iArr[c] = iArrCopyOf;
                        }
                        iArrCopyOf[47] = 47;
                        iArr2[c] = iArrCopyOf;
                    }
                } else {
                    iArrCopyOf = iArr[c];
                    if (iArrCopyOf == null) {
                        iArrCopyOf = Arrays.copyOf(lt2.j, np0.m);
                        if (iArrCopyOf[c] == 0) {
                            iArrCopyOf[c] = -1;
                        }
                        iArr[c] = iArrCopyOf;
                    }
                }
            }
            this.g = iArrCopyOf;
        }
    }

    public final void D0(String str) {
        oif oifVar;
        char c;
        kv8 kv8Var = this.d;
        int i = kv8Var.b;
        if (i != 2) {
            int i2 = kv8Var.c;
            if (i != 1) {
                int i3 = i2 + 1;
                kv8Var.c = i3;
                if (i3 == 0 || (oifVar = this.i) == null) {
                    return;
                }
                S0(oifVar.a);
                return;
            }
            kv8Var.c = i2 + 1;
            if (i2 < 0) {
                return;
            } else {
                c = ',';
            }
        } else {
            if (!kv8Var.k) {
                rt8.A("Can not " + str + ", expecting field name (context: " + kv8Var.p() + ")");
                throw null;
            }
            kv8Var.k = false;
            kv8Var.c++;
            c = ':';
        }
        if (this.q >= this.r) {
            v0();
        }
        char[] cArr = this.o;
        int i4 = this.q;
        this.q = i4 + 1;
        cArr[i4] = c;
    }

    @Override // defpackage.rt8
    public final void E(boolean z) {
        int i;
        D0("write a boolean value");
        if (this.q + 5 >= this.r) {
            v0();
        }
        int i2 = this.q;
        char[] cArr = this.o;
        if (z) {
            cArr[i2] = 't';
            cArr[i2 + 1] = 'r';
            cArr[i2 + 2] = 'u';
            i = i2 + 3;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            cArr[i2 + 1] = 'a';
            cArr[i2 + 2] = 'l';
            cArr[i2 + 3] = 's';
            i = i2 + 4;
            cArr[i] = 'e';
        }
        this.q = i + 1;
    }

    @Override // defpackage.rt8
    public final void I() throws JsonGenerationException {
        if (!this.d.h()) {
            rt8.A("Current context not Array but ".concat(this.d.p()));
            throw null;
        }
        if (this.q >= this.r) {
            v0();
        }
        char[] cArr = this.o;
        int i = this.q;
        this.q = i + 1;
        cArr[i] = ']';
        this.d = this.d.g;
    }

    public final void I0() {
        if (this.q + 4 >= this.r) {
            v0();
        }
        int i = this.q;
        char[] cArr = this.o;
        cArr[i] = 'n';
        cArr[i + 1] = 'u';
        cArr[i + 2] = 'l';
        cArr[i + 3] = 'l';
        this.q = i + 4;
    }

    @Override // defpackage.rt8
    public final void K() throws JsonGenerationException {
        if (!this.d.i()) {
            rt8.A("Current context not Object but ".concat(this.d.p()));
            throw null;
        }
        if (this.q >= this.r) {
            v0();
        }
        char[] cArr = this.o;
        int i = this.q;
        this.q = i + 1;
        cArr[i] = '}';
        this.d = this.d.g;
    }

    @Override // defpackage.rt8
    public final void P(String str) throws IOException {
        char c;
        kv8 kv8Var = this.d;
        if (kv8Var.b != 2 || kv8Var.k) {
            c = 4;
        } else {
            kv8Var.k = true;
            kv8Var.j = str;
            ljf ljfVar = kv8Var.h;
            if (ljfVar != null && ljfVar.N(str)) {
                throw new JsonGenerationException(c0a.o("Duplicate field '", str, "'"), null, null);
            }
            c = kv8Var.c < 0 ? (char) 0 : (char) 1;
        }
        if (c == 4) {
            rt8.A("Can not write a field name, expecting a value");
            throw null;
        }
        boolean z = c == 1;
        int i = this.q + 1;
        int i2 = this.r;
        if (i >= i2) {
            v0();
        }
        if (z) {
            char[] cArr = this.o;
            int i3 = this.q;
            this.q = i3 + 1;
            cArr[i3] = ',';
        }
        if (this.j) {
            R0(str);
            return;
        }
        char[] cArr2 = this.o;
        int i4 = this.q;
        this.q = i4 + 1;
        char c2 = this.n;
        cArr2[i4] = c2;
        R0(str);
        if (this.q >= i2) {
            v0();
        }
        char[] cArr3 = this.o;
        int i5 = this.q;
        this.q = i5 + 1;
        cArr3[i5] = c2;
    }

    public final void P0(String str) {
        int i = this.q;
        int i2 = this.r;
        if (i >= i2) {
            v0();
        }
        char[] cArr = this.o;
        int i3 = this.q;
        this.q = i3 + 1;
        char c = this.n;
        cArr[i3] = c;
        S0(str);
        if (this.q >= i2) {
            v0();
        }
        char[] cArr2 = this.o;
        int i4 = this.q;
        this.q = i4 + 1;
        cArr2[i4] = c;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b A[PHI: r16
  0x004b: PHI (r16v3 int) = (r16v0 int), (r16v4 int) binds: [B:18:0x0046, B:16:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x0068 A[LOOP:2: B:13:0x0039->B:28:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:90:0x004f A[EDGE_INSN: B:90:0x004f->B:22:0x004f BREAK  A[LOOP:2: B:13:0x0039->B:28:0x0068], SYNTHETIC] */
    public final void R0(String str) throws IOException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        char[] cArr;
        char c;
        char[] cArr2;
        int i6;
        char c2;
        int length = str.length();
        int i7 = this.h;
        CharArrayWriter charArrayWriter = this.m;
        int i8 = this.r;
        if (length <= i8) {
            if (this.q + length > i8) {
                v0();
            }
            str.getChars(0, length, this.o, this.q);
            int i9 = this.q;
            int[] iArr = this.g;
            if (i7 == 0) {
                int i10 = i9 + length;
                int length2 = iArr.length;
                while (this.q < i10) {
                    do {
                        char[] cArr3 = this.o;
                        int i11 = this.q;
                        char c3 = cArr3[i11];
                        if (c3 >= length2 || iArr[c3] == 0) {
                            i = i11 + 1;
                            this.q = i;
                        } else {
                            int i12 = this.p;
                            int i13 = i11 - i12;
                            if (i13 > 0) {
                                charArrayWriter.write(cArr3, i12, i13);
                            }
                            char[] cArr4 = this.o;
                            int i14 = this.q;
                            this.q = i14 + 1;
                            char c4 = cArr4[i14];
                            z0(c4, iArr[c4]);
                        }
                    } while (i < i10);
                    return;
                }
                return;
            }
            int i15 = i9 + length;
            int iMin = Math.min(iArr.length, i7 + 1);
            while (this.q < i15) {
                do {
                    char[] cArr5 = this.o;
                    int i16 = this.q;
                    char c5 = cArr5[i16];
                    if (c5 < iMin) {
                        i2 = iArr[c5];
                        if (i2 != 0) {
                            i3 = this.p;
                            i4 = i16 - i3;
                            if (i4 > 0) {
                                charArrayWriter.write(cArr5, i3, i4);
                            }
                            this.q++;
                            z0(c5, i2);
                        }
                        i5 = i16 + 1;
                        this.q = i5;
                    } else {
                        if (c5 > i7) {
                            i2 = -1;
                            i3 = this.p;
                            i4 = i16 - i3;
                            if (i4 > 0) {
                                charArrayWriter.write(cArr5, i3, i4);
                            }
                            this.q++;
                            z0(c5, i2);
                        }
                        i5 = i16 + 1;
                        this.q = i5;
                    }
                } while (i5 < i15);
                return;
            }
            return;
        }
        v0();
        int length3 = str.length();
        int i17 = 0;
        while (true) {
            int i18 = i17 + i8 > length3 ? length3 - i17 : i8;
            int i19 = i17 + i18;
            str.getChars(i17, i19, this.o, 0);
            int[] iArr2 = this.g;
            if (i7 != 0) {
                int iMin2 = Math.min(iArr2.length, i7 + 1);
                int i20 = 0;
                int iX0 = 0;
                int i21 = 0;
                while (i20 < i18) {
                    while (true) {
                        cArr2 = this.o;
                        i6 = i21;
                        c2 = cArr2[i20];
                        if (c2 < iMin2) {
                            i6 = iArr2[c2];
                            if (i6 != 0) {
                                break;
                            }
                            i20++;
                            if (i20 >= i18) {
                                break;
                            } else {
                                i21 = i6;
                            }
                        } else {
                            if (c2 > i7) {
                                i6 = -1;
                                break;
                            }
                            i20++;
                            if (i20 >= i18) {
                                break;
                                break;
                            }
                            i21 = i6;
                        }
                    }
                    int i22 = i20 - iX0;
                    if (i22 > 0) {
                        charArrayWriter.write(cArr2, iX0, i22);
                        if (i20 >= i18) {
                            break;
                        }
                    }
                    int i23 = i20 + 1;
                    int i24 = i6;
                    iX0 = x0(this.o, i23, i18, c2, i24);
                    i20 = i23;
                    i21 = i24;
                }
            } else {
                int length4 = iArr2.length;
                int i25 = 0;
                int iX1 = 0;
                while (i25 < i18) {
                    do {
                        cArr = this.o;
                        c = cArr[i25];
                        if (c < length4 && iArr2[c] != 0) {
                            break;
                        } else {
                            i25++;
                        }
                    } while (i25 < i18);
                    int i26 = i25 - iX1;
                    if (i26 > 0) {
                        charArrayWriter.write(cArr, iX1, i26);
                        if (i25 >= i18) {
                            break;
                        }
                    }
                    int i27 = i25 + 1;
                    iX1 = x0(this.o, i27, i18, c, iArr2[c]);
                    i25 = i27;
                }
            }
            if (i19 >= length3) {
                return;
            } else {
                i17 = i19;
            }
        }
    }

    public final void S0(String str) {
        int length = str.length();
        int i = this.q;
        int i2 = this.r;
        int i3 = i2 - i;
        if (i3 == 0) {
            v0();
            i3 = i2 - this.q;
        }
        if (i3 >= length) {
            str.getChars(0, length, this.o, this.q);
            this.q += length;
            return;
        }
        int i4 = this.q;
        int i5 = i2 - i4;
        str.getChars(0, i5, this.o, i4);
        this.q += i5;
        v0();
        int length2 = str.length() - i5;
        while (true) {
            char[] cArr = this.o;
            if (length2 <= i2) {
                str.getChars(i5, i5 + length2, cArr, 0);
                this.p = 0;
                this.q = length2;
                return;
            } else {
                int i6 = i5 + i2;
                str.getChars(i5, i6, cArr, 0);
                this.p = 0;
                this.q = i2;
                v0();
                length2 -= i2;
                i5 = i6;
            }
        }
    }

    @Override // defpackage.rt8
    public final void W() throws StreamConstraintsException {
        D0("start an array");
        kv8 kv8Var = this.d;
        kv8 kv8Var2 = kv8Var.i;
        if (kv8Var2 == null) {
            ljf ljfVar = kv8Var.h;
            kv8Var2 = new kv8(1, kv8Var, ljfVar != null ? new ljf((Closeable) ljfVar.c) : null);
            kv8Var.i = kv8Var2;
        } else {
            kv8Var2.b = 1;
            kv8Var2.c = -1;
            kv8Var2.j = null;
            kv8Var2.k = false;
            ljf ljfVar2 = kv8Var2.h;
            if (ljfVar2 != null) {
                ljfVar2.b = null;
                ljfVar2.d = null;
                ljfVar2.e = null;
            }
        }
        this.d = kv8Var2;
        int i = kv8Var2.d;
        this.f.getClass();
        if (i > 1000) {
            throw new StreamConstraintsException(String.format("Document nesting depth (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i), 1000, "`StreamWriteConstraints.getMaxNestingDepth()`"));
        }
        if (this.q >= this.r) {
            v0();
        }
        char[] cArr = this.o;
        int i2 = this.q;
        this.q = i2 + 1;
        cArr[i2] = '[';
    }

    @Override // defpackage.rt8
    public final void Y() throws StreamConstraintsException {
        D0("start an object");
        kv8 kv8Var = this.d;
        kv8 kv8Var2 = kv8Var.i;
        if (kv8Var2 == null) {
            ljf ljfVar = kv8Var.h;
            kv8Var2 = new kv8(2, kv8Var, ljfVar != null ? new ljf((Closeable) ljfVar.c) : null);
            kv8Var.i = kv8Var2;
        } else {
            kv8Var2.b = 2;
            kv8Var2.c = -1;
            kv8Var2.j = null;
            kv8Var2.k = false;
            ljf ljfVar2 = kv8Var2.h;
            if (ljfVar2 != null) {
                ljfVar2.b = null;
                ljfVar2.d = null;
                ljfVar2.e = null;
            }
        }
        this.d = kv8Var2;
        int i = kv8Var2.d;
        this.f.getClass();
        if (i > 1000) {
            throw new StreamConstraintsException(String.format("Document nesting depth (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i), 1000, "`StreamWriteConstraints.getMaxNestingDepth()`"));
        }
        if (this.q >= this.r) {
            v0();
        }
        char[] cArr = this.o;
        int i2 = this.q;
        this.q = i2 + 1;
        cArr[i2] = '{';
    }

    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    @Override // defpackage.pj7, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        super.close();
        try {
            if (this.o != null && r0(qt8.AUTO_CLOSE_JSON_CONTENT)) {
                while (true) {
                    kv8 kv8Var = this.d;
                    if (!kv8Var.h()) {
                        if (!kv8Var.i()) {
                            break;
                        } else {
                            K();
                        }
                    } else {
                        I();
                    }
                }
            }
            v0();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        this.p = 0;
        this.q = 0;
        l38 l38Var = this.b;
        CharArrayWriter charArrayWriter = this.m;
        if (charArrayWriter != null) {
            try {
                if (l38Var.d || r0(qt8.AUTO_CLOSE_TARGET)) {
                    charArrayWriter.close();
                } else if (r0(qt8.FLUSH_PASSED_TO_STREAM)) {
                    charArrayWriter.flush();
                }
            } catch (IOException e2) {
                e = e2;
                if (e != null) {
                    e.addSuppressed(e);
                }
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                if (e != null) {
                    e.addSuppressed(e);
                }
                throw e;
            }
        }
        char[] cArr = this.o;
        if (cArr != null) {
            this.o = null;
            char[] cArr2 = l38Var.l;
            if (cArr != cArr2 && cArr.length < cArr2.length) {
                ore.p("Trying to release buffer smaller than original");
                return;
            } else {
                l38Var.l = null;
                l38Var.e.b(1, cArr);
            }
        }
        if (e != null) {
            throw e;
        }
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        v0();
        CharArrayWriter charArrayWriter = this.m;
        if (charArrayWriter == null || !r0(qt8.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        charArrayWriter.flush();
    }

    @Override // defpackage.rt8
    public final void k0(String str) {
        D0("write a string");
        if (str == null) {
            I0();
            return;
        }
        int i = this.q;
        int i2 = this.r;
        if (i >= i2) {
            v0();
        }
        char[] cArr = this.o;
        int i3 = this.q;
        this.q = i3 + 1;
        char c = this.n;
        cArr[i3] = c;
        R0(str);
        if (this.q >= i2) {
            v0();
        }
        char[] cArr2 = this.o;
        int i4 = this.q;
        this.q = i4 + 1;
        cArr2[i4] = c;
    }

    public final char[] t0() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u', 0, 0, 0, 0};
        this.s = cArr;
        return cArr;
    }

    public final void u0(char c, int i) {
        int i2;
        int i3 = this.r;
        if (i >= 0) {
            if (this.q + 2 > i3) {
                v0();
            }
            char[] cArr = this.o;
            int i4 = this.q;
            int i5 = i4 + 1;
            this.q = i5;
            cArr[i4] = '\\';
            this.q = i4 + 2;
            cArr[i5] = (char) i;
            return;
        }
        if (i == -2) {
            throw null;
        }
        if (this.q + 5 >= i3) {
            v0();
        }
        int i6 = this.q;
        char[] cArr2 = this.o;
        char[] cArr3 = this.k ? t : u;
        cArr2[i6] = '\\';
        int i7 = i6 + 2;
        cArr2[i6 + 1] = 'u';
        if (c > 255) {
            int i8 = c >> '\b';
            int i9 = i6 + 3;
            cArr2[i7] = cArr3[(i8 & 255) >> 4];
            i2 = i6 + 4;
            cArr2[i9] = cArr3[i8 & 15];
            c = (char) (c & 255);
        } else {
            int i10 = i6 + 3;
            cArr2[i7] = '0';
            i2 = i6 + 4;
            cArr2[i10] = '0';
        }
        cArr2[i2] = cArr3[c >> 4];
        cArr2[i2 + 1] = cArr3[c & 15];
        this.q = i2 + 2;
    }

    public final void v0() {
        int i = this.q;
        int i2 = this.p;
        int i3 = i - i2;
        if (i3 > 0) {
            this.p = 0;
            this.q = 0;
            this.m.write(this.o, i2, i3);
        }
    }

    public final int x0(char[] cArr, int i, int i2, char c, int i3) throws IOException {
        int i4;
        CharArrayWriter charArrayWriter = this.m;
        if (i3 >= 0) {
            if (i > 1 && i < i2) {
                int i5 = i - 2;
                cArr[i5] = '\\';
                cArr[i - 1] = (char) i3;
                return i5;
            }
            char[] cArrT0 = this.s;
            if (cArrT0 == null) {
                cArrT0 = t0();
            }
            cArrT0[1] = (char) i3;
            charArrayWriter.write(cArrT0, 0, 2);
            return i;
        }
        if (i3 == -2) {
            throw null;
        }
        char[] cArr2 = this.k ? t : u;
        if (i <= 5 || i >= i2) {
            char[] cArrT1 = this.s;
            if (cArrT1 == null) {
                cArrT1 = t0();
            }
            this.p = this.q;
            if (c <= 255) {
                cArrT1[6] = cArr2[c >> 4];
                cArrT1[7] = cArr2[c & 15];
                charArrayWriter.write(cArrT1, 2, 6);
                return i;
            }
            int i6 = c >> '\b';
            cArrT1[10] = cArr2[(i6 & 255) >> 4];
            cArrT1[11] = cArr2[i6 & 15];
            cArrT1[12] = cArr2[(c & 255) >> 4];
            cArrT1[13] = cArr2[c & 15];
            charArrayWriter.write(cArrT1, 8, 6);
            return i;
        }
        cArr[i - 6] = '\\';
        int i7 = i - 4;
        cArr[i - 5] = 'u';
        if (c > 255) {
            int i8 = c >> '\b';
            int i9 = i - 3;
            cArr[i7] = cArr2[(i8 & 255) >> 4];
            i4 = i - 2;
            cArr[i9] = cArr2[i8 & 15];
            c = (char) (c & 255);
        } else {
            int i10 = i - 3;
            cArr[i7] = '0';
            i4 = i - 2;
            cArr[i10] = '0';
        }
        cArr[i4] = cArr2[c >> 4];
        cArr[i4 + 1] = cArr2[c & 15];
        return i4 - 4;
    }

    public final void z0(char c, int i) throws IOException {
        int i2;
        CharArrayWriter charArrayWriter = this.m;
        if (i >= 0) {
            int i3 = this.q;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.p = i4;
                char[] cArr = this.o;
                cArr[i4] = '\\';
                cArr[i3 - 1] = (char) i;
                return;
            }
            char[] cArrT0 = this.s;
            if (cArrT0 == null) {
                cArrT0 = t0();
            }
            this.p = this.q;
            cArrT0[1] = (char) i;
            charArrayWriter.write(cArrT0, 0, 2);
            return;
        }
        if (i == -2) {
            throw null;
        }
        char[] cArr2 = this.k ? t : u;
        int i5 = this.q;
        if (i5 < 6) {
            char[] cArrT1 = this.s;
            if (cArrT1 == null) {
                cArrT1 = t0();
            }
            this.p = this.q;
            if (c <= 255) {
                cArrT1[6] = cArr2[c >> 4];
                cArrT1[7] = cArr2[c & 15];
                charArrayWriter.write(cArrT1, 2, 6);
                return;
            } else {
                int i6 = c >> '\b';
                cArrT1[10] = cArr2[(i6 & 255) >> 4];
                cArrT1[11] = cArr2[i6 & 15];
                cArrT1[12] = cArr2[(c & 255) >> 4];
                cArrT1[13] = cArr2[c & 15];
                charArrayWriter.write(cArrT1, 8, 6);
                return;
            }
        }
        char[] cArr3 = this.o;
        int i7 = i5 - 6;
        this.p = i7;
        cArr3[i7] = '\\';
        cArr3[i5 - 5] = 'u';
        if (c > 255) {
            int i8 = c >> '\b';
            cArr3[i5 - 4] = cArr2[(i8 & 255) >> 4];
            i2 = i5 - 3;
            cArr3[i2] = cArr2[i8 & 15];
            c = (char) (c & 255);
        } else {
            cArr3[i5 - 4] = '0';
            i2 = i5 - 3;
            cArr3[i2] = '0';
        }
        cArr3[i2 + 1] = cArr2[c >> 4];
        cArr3[i2 + 2] = cArr2[c & 15];
    }
}
