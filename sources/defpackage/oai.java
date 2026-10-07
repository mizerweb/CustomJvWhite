package defpackage;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class oai extends ju8 {
    public final v61 t1;
    public int[] u1;
    public boolean v1;
    public InputStream w1;
    public byte[] x1;
    public final boolean y1;

    public oai(l38 l38Var, int i, InputStream inputStream, v61 v61Var, byte[] bArr, int i2, int i3, int i4, boolean z) {
        super(i, l38Var);
        this.u1 = new int[16];
        this.w1 = inputStream;
        this.t1 = v61Var;
        this.x1 = bArr;
        this.n = i2;
        this.o = i3;
        this.r = i2 - i4;
        this.p = (-i2) + i4;
        this.y1 = z;
    }

    public static final int I1(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    @Override // defpackage.iu8
    public final char[] A() throws StreamConstraintsException {
        cv8 cv8Var = this.b;
        if (cv8Var == null) {
            return null;
        }
        int i = cv8Var.d;
        if (i != 5) {
            if (i != 6) {
                if (i != 7 && i != 8) {
                    return cv8Var.b;
                }
            } else if (this.v1) {
                this.v1 = false;
                x1();
            }
            return this.w.k();
        }
        if (!this.y) {
            String str = this.u.j;
            int length = str.length();
            char[] cArr = this.x;
            if (cArr == null) {
                l38 l38Var = this.l;
                if (l38Var.m != null) {
                    ore.k("Trying to call same allocXxx() method second time");
                    return null;
                }
                char[] cArrA = l38Var.e.a(3, length);
                l38Var.m = cArrA;
                this.x = cArrA;
            } else if (cArr.length < length) {
                this.x = new char[length];
            }
            str.getChars(0, length, this.x, 0);
            this.y = true;
        }
        return this.x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (r13 != 44) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        if (r12.u.h() == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        if (r12.u.j() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005e, code lost:
    
        if ((r0 & defpackage.ju8.Y) == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0060, code lost:
    
        r12.n--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        return defpackage.cv8.VALUE_NULL;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.cv8 A1(int r13) throws com.fasterxml.jackson.core.JsonParseException, com.fasterxml.jackson.core.exc.StreamConstraintsException {
        /*
            Method dump skipped, instruction units count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oai.A1(int):cv8");
    }

    public final boolean B1() throws IOException {
        byte[] bArr;
        int length;
        InputStream inputStream = this.w1;
        if (inputStream != null && (length = (bArr = this.x1).length) != 0) {
            int i = this.o;
            this.p += (long) i;
            this.r -= i;
            int i2 = inputStream.read(bArr, 0, length);
            if (i2 > 0) {
                this.n = 0;
                this.o = i2;
                return true;
            }
            this.o = 0;
            this.n = 0;
            R0();
            if (i2 == 0) {
                qr7.k(zo5.t(new StringBuilder("InputStream.read() returned 0 characters when trying to read "), this.x1.length, " bytes"));
                return false;
            }
        }
        return false;
    }

    public final void C1() {
        if (B1()) {
            return;
        }
        u0(" in " + this.b);
        throw null;
    }

    public final void D1() throws JsonParseException {
        int i;
        int i2 = this.n;
        if (i2 + 4 < this.o) {
            byte[] bArr = this.x1;
            int i3 = i2 + 1;
            if (bArr[i2] == 97) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 115) {
                        int i6 = i2 + 4;
                        if (bArr[i5] == 101 && ((i = bArr[i6] & 255) < 48 || (i | 32) == 125)) {
                            this.n = i6;
                            return;
                        }
                    }
                }
            }
        }
        G1(1, "false");
    }

    @Override // defpackage.iu8
    public final int E() throws StreamConstraintsException {
        cv8 cv8Var = this.b;
        if (cv8Var == null) {
            return 0;
        }
        int i = cv8Var.d;
        if (i == 5) {
            return this.u.j.length();
        }
        if (i != 6) {
            if (i != 7 && i != 8) {
                return cv8Var.b.length;
            }
        } else if (this.v1) {
            this.v1 = false;
            x1();
        }
        return this.w.m();
    }

    public final void E1() throws JsonParseException {
        int i;
        int i2 = this.n;
        if (i2 + 3 < this.o) {
            byte[] bArr = this.x1;
            int i3 = i2 + 1;
            if (bArr[i2] == 117) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 108 && ((i = bArr[i5] & 255) < 48 || (i | 32) == 125)) {
                        this.n = i5;
                        return;
                    }
                }
            }
        }
        G1(1, "null");
    }

    public final void F1(int i, String str) throws JsonParseException {
        int length = str.length();
        if (this.n + length >= this.o) {
            G1(i, str);
            return;
        }
        while (this.x1[this.n] == str.charAt(i)) {
            int i2 = this.n + 1;
            this.n = i2;
            i++;
            if (i >= length) {
                int i3 = this.x1[i2] & 255;
                if (i3 < 48 || i3 == 93 || i3 == 125 || !Character.isJavaIdentifierPart((char) r1(i3))) {
                    return;
                }
                S1(str.substring(0, i), f1());
                throw null;
            }
        }
        S1(str.substring(0, i), f1());
        throw null;
    }

    public final void G1(int i, String str) throws JsonParseException {
        int i2;
        int i3;
        int length = str.length();
        do {
            if ((this.n >= this.o && !B1()) || this.x1[this.n] != str.charAt(i)) {
                S1(str.substring(0, i), f1());
                throw null;
            }
            i2 = this.n + 1;
            this.n = i2;
            i++;
        } while (i < length);
        if ((i2 < this.o || B1()) && (i3 = this.x1[this.n] & 255) >= 48 && i3 != 93 && i3 != 125 && Character.isJavaIdentifierPart((char) r1(i3))) {
            S1(str.substring(0, i), f1());
            throw null;
        }
    }

    public final void H1() throws JsonParseException {
        int i;
        int i2 = this.n;
        if (i2 + 3 < this.o) {
            byte[] bArr = this.x1;
            int i3 = i2 + 1;
            if (bArr[i2] == 114) {
                int i4 = i2 + 2;
                if (bArr[i3] == 117) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 101 && ((i = bArr[i5] & 255) < 48 || (i | 32) == 125)) {
                        this.n = i5;
                        return;
                    }
                }
            }
        }
        G1(1, "true");
    }

    @Override // defpackage.iu8
    public final int I() throws StreamConstraintsException {
        cv8 cv8Var = this.b;
        if (cv8Var != null) {
            int i = cv8Var.d;
            if (i != 6) {
                if (i == 7 || i == 8) {
                }
            } else if (this.v1) {
                this.v1 = false;
                x1();
            }
            int i2 = this.w.c;
            if (i2 >= 0) {
                return i2;
            }
        }
        return 0;
    }

    public final cv8 J1(char[] cArr, int i, int i2, boolean z, int i3) throws StreamConstraintsException {
        char[] cArrI;
        int i4;
        int i5;
        boolean z2;
        int i6 = i2;
        f8e f8eVar = this.w;
        int i7 = 0;
        if (i6 == 46) {
            cArrI = cArr;
            int i8 = i;
            if (i8 >= cArrI.length) {
                cArrI = f8eVar.i();
                i8 = 0;
            }
            int i9 = i8 + 1;
            cArrI[i8] = (char) i6;
            int i10 = 0;
            while (true) {
                if (this.n >= this.o && !B1()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this.x1;
                int i11 = this.n;
                this.n = i11 + 1;
                i6 = bArr[i11] & 255;
                if (i6 < 48 || i6 > 57) {
                    z2 = false;
                    break;
                }
                i10++;
                if (i9 >= cArrI.length) {
                    cArrI = f8eVar.i();
                    i9 = 0;
                }
                cArrI[i9] = (char) i6;
                i9++;
            }
            if (i10 == 0 && !uu8.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.b.a(this.a)) {
                z0(i6, "Decimal point not followed by a digit");
                throw null;
            }
            int i12 = i10;
            i4 = i9;
            i5 = i12;
        } else {
            cArrI = cArr;
            i4 = i;
            i5 = 0;
            z2 = false;
        }
        if ((i6 | 32) == 101) {
            if (i4 >= cArrI.length) {
                cArrI = f8eVar.i();
                i4 = 0;
            }
            int i13 = i4 + 1;
            cArrI[i4] = (char) i6;
            if (this.n >= this.o) {
                C1();
            }
            byte[] bArr2 = this.x1;
            int i14 = this.n;
            this.n = i14 + 1;
            i6 = bArr2[i14] & 255;
            if (i6 == 45 || i6 == 43) {
                if (i13 >= cArrI.length) {
                    cArrI = f8eVar.i();
                    i13 = 0;
                }
                int i15 = i13 + 1;
                cArrI[i13] = (char) i6;
                if (this.n >= this.o) {
                    C1();
                }
                byte[] bArr3 = this.x1;
                int i16 = this.n;
                this.n = i16 + 1;
                i6 = bArr3[i16] & 255;
                i13 = i15;
            }
            int i17 = 0;
            while (true) {
                if (i6 >= 48 && i6 <= 57) {
                    i17++;
                    if (i13 >= cArrI.length) {
                        cArrI = f8eVar.i();
                        i13 = 0;
                    }
                    int i18 = i13 + 1;
                    cArrI[i13] = (char) i6;
                    if (this.n >= this.o && !B1()) {
                        z2 = true;
                        i7 = i17;
                        i4 = i18;
                        break;
                    }
                    byte[] bArr4 = this.x1;
                    int i19 = this.n;
                    this.n = i19 + 1;
                    i6 = bArr4[i19] & 255;
                    i13 = i18;
                } else {
                    i7 = i17;
                    i4 = i13;
                    break;
                }
            }
            if (i7 == 0) {
                z0(i6, "Exponent indicator not followed by a digit");
                throw null;
            }
        }
        if (!z2) {
            this.n--;
            if (this.u.j()) {
                e2(i6);
            }
        }
        f8eVar.i = i4;
        return p1(i3, i5, i7, z);
    }

    public final cv8 K1(boolean z) {
        if (!uu8.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.b.a(this.a)) {
            return A1(46);
        }
        char[] cArrG = this.w.g();
        int i = 0;
        if (z) {
            cArrG[0] = '-';
            i = 1;
        }
        return J1(cArrG, i, 46, z, 0);
    }

    public final cv8 L1(int i, int i2, boolean z, char[] cArr) throws StreamConstraintsException {
        int i3 = i2;
        char[] cArrI = cArr;
        while (true) {
            int i4 = i;
            int i5 = this.n;
            int i6 = this.o;
            f8e f8eVar = this.w;
            if (i5 >= i6 && !B1()) {
                f8eVar.i = i4;
                return q1(i3, z);
            }
            byte[] bArr = this.x1;
            int i7 = this.n;
            this.n = i7 + 1;
            int i8 = bArr[i7] & 255;
            if (i8 > 57 || i8 < 48) {
                if (i8 == 46 || (i8 | 32) == 101) {
                    return J1(cArrI, i4, i8, z, i3);
                }
                this.n = i7;
                f8eVar.i = i4;
                if (this.u.j()) {
                    e2(this.x1[this.n] & 255);
                }
                return q1(i3, z);
            }
            if (i4 >= cArrI.length) {
                i4 = 0;
                cArrI = f8eVar.i();
            }
            i = i4 + 1;
            cArrI[i4] = (char) i8;
            i3++;
        }
    }

    public final cv8 M1(boolean z) throws JsonParseException {
        f8e f8eVar = this.w;
        char[] cArrG = f8eVar.g();
        int i = 1;
        int i2 = 0;
        if (z) {
            cArrG[0] = '-';
            i2 = 1;
        }
        if (this.n >= this.o) {
            C1();
        }
        byte[] bArr = this.x1;
        int i3 = this.n;
        this.n = i3 + 1;
        int iD2 = bArr[i3] & 255;
        if (iD2 <= 48) {
            if (iD2 != 48) {
                return iD2 == 46 ? K1(z) : z1(iD2, z, true);
            }
            iD2 = d2();
        } else if (iD2 > 57) {
            return z1(iD2, z, true);
        }
        int i4 = i2 + 1;
        cArrG[i2] = (char) iD2;
        int iMin = Math.min(this.o, (this.n + cArrG.length) - i4);
        while (true) {
            int i5 = this.n;
            if (i5 >= iMin) {
                return L1(i4, i, z, cArrG);
            }
            byte[] bArr2 = this.x1;
            this.n = i5 + 1;
            int i6 = bArr2[i5] & 255;
            if (i6 < 48 || i6 > 57) {
                if (i6 == 46 || (i6 | 32) == 101) {
                    return J1(cArrG, i4, i6, z, i);
                }
                this.n = i5;
                f8eVar.i = i4;
                if (this.u.j()) {
                    e2(i6);
                }
                return q1(i, z);
            }
            i++;
            cArrG[i4] = (char) i6;
            i4++;
        }
    }

    public final cv8 N1(int i) throws JsonParseException {
        f8e f8eVar = this.w;
        char[] cArrG = f8eVar.g();
        if (i == 48) {
            i = d2();
        }
        cArrG[0] = (char) i;
        int i2 = 1;
        int iMin = Math.min(this.o, (this.n + cArrG.length) - 1);
        int i3 = 1;
        while (true) {
            int i4 = this.n;
            if (i4 >= iMin) {
                return L1(i2, i3, false, cArrG);
            }
            byte[] bArr = this.x1;
            this.n = i4 + 1;
            int i5 = bArr[i4] & 255;
            if (i5 < 48 || i5 > 57) {
                if (i5 == 46 || (i5 | 32) == 101) {
                    return J1(cArrG, i2, i5, false, i3);
                }
                this.n = i4;
                f8eVar.i = i2;
                if (this.u.j()) {
                    e2(i5);
                }
                return q1(i3, false);
            }
            i3++;
            cArrG[i2] = (char) i5;
            i2++;
        }
    }

    public final void O1(int i) {
        if (i < 32) {
            D0(i);
            throw null;
        }
        P1(i);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:404:0x073f  */
    /* JADX WARN: Code duplicated, block: B:405:0x0745  */
    /* JADX WARN: Code duplicated, block: B:407:0x074d  */
    /* JADX WARN: Code duplicated, block: B:409:0x0755  */
    /* JADX WARN: Code duplicated, block: B:411:0x0759  */
    /* JADX WARN: Code duplicated, block: B:417:0x076a  */
    /* JADX WARN: Code duplicated, block: B:418:0x076c  */
    /* JADX WARN: Code duplicated, block: B:420:0x0770  */
    /* JADX WARN: Code duplicated, block: B:422:0x0778  */
    /* JADX WARN: Code duplicated, block: B:430:0x078b A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:431:0x0790  */
    /* JADX WARN: Code duplicated, block: B:432:0x0792  */
    /* JADX WARN: Code duplicated, block: B:434:0x0796  */
    /* JADX WARN: Code duplicated, block: B:436:0x079d  */
    /* JADX WARN: Code duplicated, block: B:438:0x07a7  */
    /* JADX WARN: Code duplicated, block: B:440:0x07ab  */
    /* JADX WARN: Code duplicated, block: B:445:0x07b9  */
    /* JADX WARN: Code duplicated, block: B:446:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:448:0x07bf  */
    /* JADX WARN: Code duplicated, block: B:450:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:457:0x07d9 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:458:0x07de  */
    /* JADX WARN: Code duplicated, block: B:461:0x07e7  */
    /* JADX WARN: Code duplicated, block: B:463:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:465:0x07f4  */
    /* JADX WARN: Code duplicated, block: B:467:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:469:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:471:0x0800  */
    /* JADX WARN: Code duplicated, block: B:473:0x0804  */
    /* JADX WARN: Code duplicated, block: B:475:0x0808  */
    /* JADX WARN: Code duplicated, block: B:477:0x080c  */
    /* JADX WARN: Code duplicated, block: B:479:0x0810  */
    /* JADX WARN: Code duplicated, block: B:480:0x0813  */
    /* JADX WARN: Code duplicated, block: B:481:0x0818  */
    /* JADX WARN: Code duplicated, block: B:482:0x081d  */
    /* JADX WARN: Code duplicated, block: B:483:0x0822  */
    /* JADX WARN: Code duplicated, block: B:484:0x0827  */
    /* JADX WARN: Code duplicated, block: B:485:0x082a  */
    /* JADX WARN: Code duplicated, block: B:486:0x0830  */
    /* JADX WARN: Code duplicated, block: B:487:0x0836  */
    /* JADX WARN: Code duplicated, block: B:488:0x083c  */
    /* JADX WARN: Code duplicated, block: B:489:0x083f  */
    /* JADX WARN: Code duplicated, block: B:491:0x0849  */
    /* JADX WARN: Code duplicated, block: B:492:0x084e  */
    @Override // defpackage.iu8
    public final cv8 P() throws JsonParseException, StreamConstraintsException {
        int iB2;
        boolean z;
        int i;
        int i2;
        boolean z2;
        String strL2;
        int i3;
        int i4;
        String strL3;
        int i5;
        byte[] bArr;
        byte b;
        int iU1;
        int i6;
        byte b2;
        byte b3;
        cv8 cv8VarA1;
        int i7;
        int i8 = this.a;
        if (this.b == cv8.FIELD_NAME) {
            this.y = false;
            cv8 cv8Var = this.v;
            this.v = null;
            if (cv8Var == cv8.START_ARRAY) {
                h1(this.s, this.t);
            } else if (cv8Var == cv8.START_OBJECT) {
                i1(this.s, this.t);
            }
            this.b = cv8Var;
            return cv8Var;
        }
        this.z = 0;
        if (this.v1) {
            this.v1 = false;
            byte[] bArr2 = this.x1;
            while (true) {
                int i9 = this.n;
                int i10 = this.o;
                if (i9 >= i10) {
                    C1();
                    i9 = this.n;
                    i10 = this.o;
                }
                while (true) {
                    if (i9 >= i10) {
                        this.n = i9;
                        break;
                    }
                    int i11 = i9 + 1;
                    int i12 = bArr2[i9] & 255;
                    int i13 = ju8.s1[i12];
                    if (i13 != 0) {
                        this.n = i11;
                        if (i12 != 34) {
                            if (i13 == 1) {
                                s1();
                                break;
                            }
                            if (i13 == 2) {
                                X1();
                                break;
                            }
                            if (i13 == 3) {
                                Y1();
                                break;
                            }
                            if (i13 == 4) {
                                Z1();
                                break;
                            }
                            if (i12 < 32) {
                                e1(i12, "string value");
                                break;
                            }
                            O1(i12);
                            throw null;
                        }
                        break;
                    }
                    i9 = i11;
                }
            }
        }
        if (this.n < this.o || B1()) {
            byte[] bArr3 = this.x1;
            int i14 = this.n;
            int i15 = i14 + 1;
            this.n = i15;
            iB2 = bArr3[i14] & 255;
            if (iB2 <= 32) {
                if (iB2 != 32) {
                    if (iB2 == 10) {
                        this.q++;
                        this.r = i15;
                    } else if (iB2 == 13) {
                        T1();
                    } else if (iB2 != 9 && !a1(iB2)) {
                        D0(iB2);
                        throw null;
                    }
                }
                while (true) {
                    int i16 = this.n;
                    if (i16 >= this.o) {
                        iB2 = b2();
                        break;
                    }
                    byte[] bArr4 = this.x1;
                    int i17 = i16 + 1;
                    this.n = i17;
                    int i18 = bArr4[i16] & 255;
                    if (i18 > 32) {
                        if (i18 != 47 && i18 != 35) {
                            iB2 = i18;
                            break;
                        }
                        this.n = i16;
                        iB2 = b2();
                        break;
                    }
                    if (i18 != 32) {
                        if (i18 == 10) {
                            this.q++;
                            this.r = i17;
                        } else if (i18 == 13) {
                            T1();
                        } else if (i18 != 9 && !a1(i18)) {
                            D0(i18);
                            throw null;
                        }
                    }
                }
            } else if (iB2 == 47 || iB2 == 35) {
                this.n = i14;
                iB2 = b2();
            }
        } else {
            k0();
            iB2 = -1;
        }
        if (iB2 < 0) {
            close();
            this.b = null;
            return null;
        }
        if (iB2 == 93) {
            c2();
            if (!this.u.h()) {
                d1('}', 93);
                throw null;
            }
            this.u = this.u.g;
            cv8 cv8Var2 = cv8.END_ARRAY;
            this.b = cv8Var2;
            return cv8Var2;
        }
        if (iB2 == 125) {
            c2();
            if (!this.u.i()) {
                d1(']', 125);
                throw null;
            }
            this.u = this.u.g;
            cv8 cv8Var3 = cv8.END_OBJECT;
            this.b = cv8Var3;
            return cv8Var3;
        }
        tu8 tu8Var = this.u;
        int i19 = tu8Var.c + 1;
        tu8Var.c = i19;
        if (tu8Var.b != 0 && i19 > 0) {
            if (iB2 != 44) {
                x0(iB2, "was expecting comma to separate " + this.u.p() + " entries");
                throw null;
            }
            while (true) {
                int i20 = this.n;
                if (i20 >= this.o) {
                    iB2 = a2();
                    break;
                }
                byte[] bArr5 = this.x1;
                int i21 = i20 + 1;
                this.n = i21;
                int i22 = bArr5[i20] & 255;
                if (i22 > 32) {
                    if (i22 != 47 && i22 != 35) {
                        iB2 = i22;
                        break;
                    }
                    this.n = i20;
                    iB2 = a2();
                    break;
                }
                if (i22 != 32) {
                    if (i22 == 10) {
                        this.q++;
                        this.r = i21;
                    } else if (i22 == 13) {
                        T1();
                    } else if (i22 != 9) {
                        D0(i22);
                        throw null;
                    }
                }
            }
            if ((ju8.J & i8) != 0 && (iB2 == 93 || iB2 == 125)) {
                if (iB2 == 125) {
                    c2();
                    if (!this.u.i()) {
                        d1(']', 125);
                        throw null;
                    }
                    this.u = this.u.g;
                    cv8 cv8Var4 = cv8.END_OBJECT;
                    this.b = cv8Var4;
                    return cv8Var4;
                }
                c2();
                if (!this.u.h()) {
                    d1('}', 93);
                    throw null;
                }
                this.u = this.u.g;
                cv8 cv8Var5 = cv8.END_ARRAY;
                this.b = cv8Var5;
                return cv8Var5;
            }
        }
        if (!this.u.i()) {
            c2();
            if (iB2 == 34) {
                this.v1 = true;
                cv8 cv8Var6 = cv8.VALUE_STRING;
                this.b = cv8Var6;
                return cv8Var6;
            }
            if (iB2 == 43) {
                if (uu8.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.b.a(i8)) {
                    cv8 cv8VarM1 = M1(false);
                    this.b = cv8VarM1;
                    return cv8VarM1;
                }
                cv8 cv8VarA2 = A1(iB2);
                this.b = cv8VarA2;
                return cv8VarA2;
            }
            if (iB2 == 91) {
                h1(this.s, this.t);
                cv8 cv8Var7 = cv8.START_ARRAY;
                this.b = cv8Var7;
                return cv8Var7;
            }
            if (iB2 == 102) {
                D1();
                cv8 cv8Var8 = cv8.VALUE_FALSE;
                this.b = cv8Var8;
                return cv8Var8;
            }
            if (iB2 == 110) {
                E1();
                cv8 cv8Var9 = cv8.VALUE_NULL;
                this.b = cv8Var9;
                return cv8Var9;
            }
            if (iB2 == 116) {
                H1();
                cv8 cv8Var10 = cv8.VALUE_TRUE;
                this.b = cv8Var10;
                return cv8Var10;
            }
            if (iB2 == 123) {
                i1(this.s, this.t);
                cv8 cv8Var11 = cv8.START_OBJECT;
                this.b = cv8Var11;
                return cv8Var11;
            }
            if (iB2 == 45) {
                cv8 cv8VarM2 = M1(true);
                this.b = cv8VarM2;
                return cv8VarM2;
            }
            if (iB2 == 46) {
                cv8 cv8VarK1 = K1(false);
                this.b = cv8VarK1;
                return cv8VarK1;
            }
            switch (iB2) {
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    cv8 cv8VarN1 = N1(iB2);
                    this.b = cv8VarN1;
                    return cv8VarN1;
                default:
                    cv8 cv8VarA3 = A1(iB2);
                    this.b = cv8VarA3;
                    return cv8VarA3;
            }
        }
        int i23 = this.n;
        int[] iArr = ju8.r1;
        String strG2 = "";
        if (iB2 != 34) {
            v61 v61Var = this.t1;
            if (iB2 != 39 || (i8 & ju8.n1) == 0) {
                z = false;
                if ((ju8.o1 & i8) == 0) {
                    x0((char) r1(iB2), "was expecting double-quote to start field name");
                    throw null;
                }
                int[] iArr2 = lt2.h;
                if (iArr2[iB2] != 0) {
                    x0(iB2, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
                    throw null;
                }
                int[] iArrY0 = this.u1;
                int i24 = 0;
                int i25 = 0;
                int i26 = 0;
                while (true) {
                    if (i24 < 4) {
                        i24++;
                        iB2 |= i26 << 8;
                    } else {
                        if (i25 >= iArrY0.length) {
                            iArrY0 = Y0(iArrY0.length, iArrY0);
                            this.u1 = iArrY0;
                        }
                        iArrY0[i25] = i26;
                        i25++;
                        i24 = 1;
                    }
                    i26 = iB2;
                    if (this.n >= this.o && !B1()) {
                        cv8 cv8Var12 = cv8.NOT_AVAILABLE;
                        u0(" in field name");
                        throw null;
                    }
                    byte[] bArr6 = this.x1;
                    int i27 = this.n;
                    iB2 = bArr6[i27] & 255;
                    if (iArr2[iB2] != 0) {
                        if (i24 > 0) {
                            if (i25 >= iArrY0.length) {
                                int[] iArrY1 = Y0(iArrY0.length, iArrY0);
                                this.u1 = iArrY1;
                                iArrY0 = iArrY1;
                            }
                            iArrY0[i25] = i26;
                            i25++;
                        }
                        strG2 = v61Var.m(i25, iArrY0);
                        if (strG2 != null) {
                            break;
                        }
                        strG2 = f2(i25, i24, iArrY0);
                        break;
                    }
                    this.n = i27 + 1;
                }
            } else {
                if (i23 >= this.o && !B1()) {
                    cv8 cv8Var13 = cv8.NOT_AVAILABLE;
                    u0(": was expecting closing ''' for field name");
                    throw null;
                }
                byte[] bArr7 = this.x1;
                int i28 = this.n;
                z = false;
                this.n = i28 + 1;
                int iS1 = bArr7[i28] & 255;
                if (iS1 != 39) {
                    int[] iArrY2 = this.u1;
                    int i29 = 0;
                    int i30 = 0;
                    int i31 = 0;
                    for (int i32 = 39; iS1 != i32; i32 = 39) {
                        if (iArr[iS1] != 0 && iS1 != 34) {
                            if (iS1 != 92) {
                                e1(iS1, SdkMetricStatEvent.NAME_KEY);
                            } else {
                                iS1 = s1();
                            }
                            if (iS1 > 127) {
                                if (i29 >= 4) {
                                    if (i30 >= iArrY2.length) {
                                        iArrY2 = Y0(iArrY2.length, iArrY2);
                                        this.u1 = iArrY2;
                                    }
                                    iArrY2[i30] = i31;
                                    i30++;
                                    i29 = 0;
                                    i31 = 0;
                                }
                                if (iS1 < 2048) {
                                    i7 = (i31 << 8) | (iS1 >> 6) | 192;
                                    i29++;
                                } else {
                                    int i33 = (i31 << 8) | (iS1 >> 12) | 224;
                                    int i34 = i29 + 1;
                                    if (i34 >= 4) {
                                        if (i30 >= iArrY2.length) {
                                            iArrY2 = Y0(iArrY2.length, iArrY2);
                                            this.u1 = iArrY2;
                                        }
                                        iArrY2[i30] = i33;
                                        i30++;
                                        i33 = 0;
                                        i34 = 0;
                                    }
                                    i7 = (i33 << 8) | ((iS1 >> 6) & 63) | np0.m;
                                    i29 = i34 + 1;
                                }
                                i31 = i7;
                                iS1 = (iS1 & 63) | np0.m;
                            }
                        }
                        if (i29 < 4) {
                            i29++;
                            iS1 |= i31 << 8;
                        } else {
                            if (i30 >= iArrY2.length) {
                                iArrY2 = Y0(iArrY2.length, iArrY2);
                                this.u1 = iArrY2;
                            }
                            iArrY2[i30] = i31;
                            i30++;
                            i29 = 1;
                        }
                        i31 = iS1;
                        if (this.n >= this.o && !B1()) {
                            cv8 cv8Var14 = cv8.NOT_AVAILABLE;
                            u0(" in field name");
                            throw null;
                        }
                        byte[] bArr8 = this.x1;
                        int i35 = this.n;
                        this.n = i35 + 1;
                        iS1 = bArr8[i35] & 255;
                    }
                    if (i29 > 0) {
                        if (i30 >= iArrY2.length) {
                            int[] iArrY3 = Y0(iArrY2.length, iArrY2);
                            this.u1 = iArrY3;
                            iArrY2 = iArrY3;
                        }
                        iArrY2[i30] = I1(i31, i29);
                        i30++;
                    }
                    strG2 = v61Var.m(i30, iArrY2);
                    if (strG2 == null) {
                        strG2 = f2(i30, i29, iArrY2);
                    }
                }
            }
        } else {
            z = false;
            int i36 = i23 + 13;
            int i37 = this.o;
            if (i36 <= i37) {
                byte[] bArr9 = this.x1;
                int i38 = i23 + 1;
                this.n = i38;
                int i39 = bArr9[i23] & 255;
                if (iArr[i39] != 0) {
                    i = 2;
                    i2 = 3;
                    if (i39 != 34) {
                        z2 = false;
                        strL2 = l2(0, 0, i39, 0, this.u1);
                    }
                    this.u.q(strL2);
                    this.b = cv8.FIELD_NAME;
                    i5 = this.n;
                    if (i5 + 4 >= this.o) {
                        iU1 = U1(z2);
                    } else {
                        bArr = this.x1;
                        b = bArr[i5];
                        if (b == 58) {
                            int i40 = i5 + 1;
                            this.n = i40;
                            b2 = bArr[i40];
                            if (b2 > 32) {
                                if (b2 != 47) {
                                }
                                iU1 = U1(true);
                            } else if (b2 != 32) {
                                int i41 = i5 + 2;
                                this.n = i41;
                                b3 = bArr[i41];
                                if (b3 > 32) {
                                    iU1 = U1(true);
                                } else {
                                    iU1 = U1(true);
                                }
                            } else {
                                int i42 = i5 + 2;
                                this.n = i42;
                                b3 = bArr[i42];
                                if (b3 > 32) {
                                    iU1 = U1(true);
                                } else {
                                    iU1 = U1(true);
                                }
                            }
                        } else {
                            if (b != 32) {
                                int i43 = i5 + 1;
                                this.n = i43;
                                b = bArr[i43];
                            } else {
                                int i44 = i5 + 1;
                                this.n = i44;
                                b = bArr[i44];
                            }
                            if (b == 58) {
                                i6 = this.n;
                                int i45 = i6 + 1;
                                this.n = i45;
                                b2 = bArr[i45];
                                if (b2 > 32) {
                                    if (b2 != 47) {
                                    }
                                    iU1 = U1(true);
                                } else if (b2 != 32) {
                                    int i46 = i6 + 2;
                                    this.n = i46;
                                    b3 = bArr[i46];
                                    if (b3 > 32) {
                                        iU1 = U1(true);
                                    } else {
                                        iU1 = U1(true);
                                    }
                                } else {
                                    int i47 = i6 + 2;
                                    this.n = i47;
                                    b3 = bArr[i47];
                                    if (b3 > 32) {
                                        iU1 = U1(true);
                                    } else {
                                        iU1 = U1(true);
                                    }
                                }
                            } else {
                                iU1 = U1(z2);
                            }
                        }
                    }
                    c2();
                    if (iU1 == 34) {
                        this.v1 = true;
                        this.v = cv8.VALUE_STRING;
                        return this.b;
                    }
                    if (iU1 != 43) {
                        if (iU1 != 91) {
                            cv8VarA1 = cv8.START_ARRAY;
                        } else if (iU1 != 102) {
                            D1();
                            cv8VarA1 = cv8.VALUE_FALSE;
                        } else if (iU1 != 110) {
                            E1();
                            cv8VarA1 = cv8.VALUE_NULL;
                        } else if (iU1 != 116) {
                            H1();
                            cv8VarA1 = cv8.VALUE_TRUE;
                        } else if (iU1 != 123) {
                            cv8VarA1 = cv8.START_OBJECT;
                        } else if (iU1 != 45) {
                            cv8VarA1 = M1(true);
                        } else if (iU1 != 46) {
                            switch (iU1) {
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                case 54:
                                case 55:
                                case 56:
                                case 57:
                                    cv8VarA1 = N1(iU1);
                                    break;
                                default:
                                    cv8VarA1 = A1(iU1);
                                    break;
                            }
                        } else {
                            cv8VarA1 = K1(z2);
                        }
                    } else if (uu8.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.b.a(i8)) {
                        cv8VarA1 = M1(z2);
                    } else {
                        cv8VarA1 = A1(iU1);
                    }
                    this.v = cv8VarA1;
                    return this.b;
                }
                int i48 = i23 + 2;
                this.n = i48;
                int i49 = bArr9[i38] & 255;
                if (iArr[i49] == 0) {
                    int i50 = i49 | (i39 << 8);
                    int i51 = i23 + 3;
                    this.n = i51;
                    int i52 = bArr9[i48] & 255;
                    if (iArr[i52] == 0) {
                        int i53 = (i50 << 8) | i52;
                        int i54 = i23 + 4;
                        this.n = i54;
                        int i55 = bArr9[i51] & 255;
                        if (iArr[i55] == 0) {
                            int i56 = (i53 << 8) | i55;
                            int i57 = i23 + 5;
                            this.n = i57;
                            int i58 = bArr9[i54] & 255;
                            if (iArr[i58] == 0) {
                                int i59 = i23 + 6;
                                this.n = i59;
                                int i60 = bArr9[i57] & 255;
                                if (iArr[i60] == 0) {
                                    int i61 = (i58 << 8) | i60;
                                    int i62 = i23 + 7;
                                    this.n = i62;
                                    int i63 = bArr9[i59] & 255;
                                    if (iArr[i63] == 0) {
                                        i = 2;
                                        int i64 = (i61 << 8) | i63;
                                        int i65 = i23 + 8;
                                        this.n = i65;
                                        int i66 = bArr9[i62] & 255;
                                        if (iArr[i66] == 0) {
                                            i3 = 3;
                                            int i67 = (i64 << 8) | i66;
                                            int i68 = i23 + 9;
                                            this.n = i68;
                                            int i69 = bArr9[i65] & 255;
                                            if (iArr[i69] == 0) {
                                                int i70 = i23 + 10;
                                                this.n = i70;
                                                int i71 = bArr9[i68] & 255;
                                                if (iArr[i71] == 0) {
                                                    int i72 = (i69 << 8) | i71;
                                                    int i73 = i23 + 11;
                                                    this.n = i73;
                                                    int i74 = bArr9[i70] & 255;
                                                    if (iArr[i74] == 0) {
                                                        int i75 = (i72 << 8) | i74;
                                                        int i76 = i23 + 12;
                                                        this.n = i76;
                                                        int i77 = bArr9[i73] & 255;
                                                        if (iArr[i77] == 0) {
                                                            int i78 = (i75 << 8) | i77;
                                                            this.n = i36;
                                                            int i79 = bArr9[i76] & 255;
                                                            if (iArr[i79] == 0) {
                                                                int[] iArr3 = this.u1;
                                                                iArr3[0] = i56;
                                                                iArr3[1] = i67;
                                                                iArr3[2] = i78;
                                                                int i80 = i79;
                                                                int i81 = 3;
                                                                while (true) {
                                                                    int i82 = this.n;
                                                                    int i83 = i82 + 4;
                                                                    if (i83 > this.o) {
                                                                        strG2 = l2(i81, 0, i80, 0, this.u1);
                                                                        break;
                                                                    }
                                                                    int i84 = i82 + 1;
                                                                    this.n = i84;
                                                                    int i85 = bArr9[i82] & 255;
                                                                    if (iArr[i85] != 0) {
                                                                        int[] iArr4 = this.u1;
                                                                        if (i85 != 34) {
                                                                            strG2 = l2(i81, i80, i85, 1, iArr4);
                                                                            break;
                                                                        }
                                                                        strG2 = j2(i81, i80, 1, iArr4);
                                                                        break;
                                                                    }
                                                                    int i86 = (i80 << 8) | i85;
                                                                    int i87 = i82 + 2;
                                                                    this.n = i87;
                                                                    int i88 = bArr9[i84] & 255;
                                                                    if (iArr[i88] != 0) {
                                                                        int[] iArr5 = this.u1;
                                                                        if (i88 != 34) {
                                                                            strG2 = l2(i81, i86, i88, 2, iArr5);
                                                                            break;
                                                                        }
                                                                        strG2 = j2(i81, i86, 2, iArr5);
                                                                        break;
                                                                    }
                                                                    int i89 = (i86 << 8) | i88;
                                                                    int i90 = i82 + 3;
                                                                    this.n = i90;
                                                                    int i91 = bArr9[i87] & 255;
                                                                    if (iArr[i91] != 0) {
                                                                        int[] iArr6 = this.u1;
                                                                        if (i91 != 34) {
                                                                            strG2 = l2(i81, i89, i91, 3, iArr6);
                                                                            break;
                                                                        }
                                                                        strG2 = j2(i81, i89, 3, iArr6);
                                                                        break;
                                                                    }
                                                                    int i92 = (i89 << 8) | i91;
                                                                    this.n = i83;
                                                                    int i93 = bArr9[i90] & 255;
                                                                    int i94 = iArr[i93];
                                                                    int[] iArr7 = this.u1;
                                                                    if (i94 != 0) {
                                                                        if (i93 != 34) {
                                                                            strG2 = l2(i81, i92, i93, 4, iArr7);
                                                                            break;
                                                                        }
                                                                        strG2 = j2(i81, i92, 4, iArr7);
                                                                        break;
                                                                    }
                                                                    if (i81 >= iArr7.length) {
                                                                        this.u1 = Y0(i81, iArr7);
                                                                    }
                                                                    this.u1[i81] = i92;
                                                                    i80 = i93;
                                                                    i81++;
                                                                }
                                                            } else {
                                                                strG2 = i79 == 34 ? i2(i56, i67, i78, 4) : m2(i56, i67, i78, i79, 4);
                                                            }
                                                        } else {
                                                            strG2 = i77 == 34 ? i2(i56, i67, i75, 3) : m2(i56, i67, i75, i77, 3);
                                                        }
                                                    } else {
                                                        strG2 = i74 == 34 ? i2(i56, i67, i72, 2) : m2(i56, i67, i72, i74, 2);
                                                    }
                                                } else {
                                                    strG2 = i71 == 34 ? i2(i56, i67, i69, 1) : m2(i56, i67, i69, i71, 1);
                                                }
                                            } else if (i69 == 34) {
                                                strG2 = h2(i56, i67, 4);
                                            } else {
                                                int[] iArr8 = this.u1;
                                                iArr8[0] = i56;
                                                strG2 = l2(1, i67, i69, 4, iArr8);
                                            }
                                        } else if (i66 == 34) {
                                            strG2 = h2(i56, i64, 3);
                                            i2 = 3;
                                        } else {
                                            int[] iArr9 = this.u1;
                                            iArr9[0] = i56;
                                            i4 = 3;
                                            strG2 = l2(1, i64, i66, 3, iArr9);
                                            i2 = i4;
                                        }
                                    } else {
                                        if (i63 == 34) {
                                            strL3 = h2(i56, i61, 2);
                                            i = 2;
                                        } else {
                                            int[] iArr10 = this.u1;
                                            iArr10[0] = i56;
                                            strL3 = l2(1, i61, i63, 2, iArr10);
                                            i = 2;
                                        }
                                        strL2 = strL3;
                                        z2 = false;
                                    }
                                } else if (i60 == 34) {
                                    strG2 = h2(i56, i58, 1);
                                } else {
                                    int[] iArr11 = this.u1;
                                    iArr11[0] = i56;
                                    strG2 = l2(1, i58, i60, 1, iArr11);
                                }
                                i2 = 3;
                                this.u.q(strL2);
                                this.b = cv8.FIELD_NAME;
                                i5 = this.n;
                                if (i5 + 4 >= this.o) {
                                    iU1 = U1(z2);
                                } else {
                                    bArr = this.x1;
                                    b = bArr[i5];
                                    if (b == 58) {
                                        int i410 = i5 + 1;
                                        this.n = i410;
                                        b2 = bArr[i410];
                                        if (b2 > 32) {
                                            if (b2 != 47 || b2 == 35) {
                                                iU1 = U1(true);
                                            } else {
                                                this.n = i5 + i;
                                                iU1 = b2;
                                            }
                                        } else if (b2 != 32 || b2 == 9) {
                                            int i411 = i5 + 2;
                                            this.n = i411;
                                            b3 = bArr[i411];
                                            if (b3 > 32 || b3 == 47 || b3 == 35) {
                                                iU1 = U1(true);
                                            } else {
                                                this.n = i5 + i2;
                                                iU1 = b3;
                                            }
                                        } else {
                                            iU1 = U1(true);
                                        }
                                    } else {
                                        if (b != 32 || b == 9) {
                                            int i412 = i5 + 1;
                                            this.n = i412;
                                            b = bArr[i412];
                                        }
                                        if (b == 58) {
                                            i6 = this.n;
                                            int i413 = i6 + 1;
                                            this.n = i413;
                                            b2 = bArr[i413];
                                            if (b2 > 32) {
                                                if (b2 != 47 || b2 == 35) {
                                                    iU1 = U1(true);
                                                } else {
                                                    this.n = i6 + i;
                                                    iU1 = b2;
                                                }
                                            } else if (b2 != 32 || b2 == 9) {
                                                int i414 = i6 + 2;
                                                this.n = i414;
                                                b3 = bArr[i414];
                                                if (b3 > 32 || b3 == 47 || b3 == 35) {
                                                    iU1 = U1(true);
                                                } else {
                                                    this.n = i6 + i2;
                                                    iU1 = b3;
                                                }
                                            } else {
                                                iU1 = U1(true);
                                            }
                                        } else {
                                            iU1 = U1(z2);
                                        }
                                    }
                                }
                                c2();
                                if (iU1 == 34) {
                                    this.v1 = true;
                                    this.v = cv8.VALUE_STRING;
                                    return this.b;
                                }
                                if (iU1 != 43) {
                                    if (iU1 != 91) {
                                        cv8VarA1 = cv8.START_ARRAY;
                                    } else if (iU1 != 102) {
                                        D1();
                                        cv8VarA1 = cv8.VALUE_FALSE;
                                    } else if (iU1 != 110) {
                                        E1();
                                        cv8VarA1 = cv8.VALUE_NULL;
                                    } else if (iU1 != 116) {
                                        H1();
                                        cv8VarA1 = cv8.VALUE_TRUE;
                                    } else if (iU1 != 123) {
                                        cv8VarA1 = cv8.START_OBJECT;
                                    } else if (iU1 != 45) {
                                        cv8VarA1 = M1(true);
                                    } else if (iU1 != 46) {
                                        switch (iU1) {
                                            case 48:
                                            case 49:
                                            case 50:
                                            case 51:
                                            case 52:
                                            case 53:
                                            case 54:
                                            case 55:
                                            case 56:
                                            case 57:
                                                cv8VarA1 = N1(iU1);
                                                break;
                                            default:
                                                cv8VarA1 = A1(iU1);
                                                break;
                                        }
                                    } else {
                                        cv8VarA1 = K1(z2);
                                    }
                                } else if (uu8.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.b.a(i8)) {
                                    cv8VarA1 = M1(z2);
                                } else {
                                    cv8VarA1 = A1(iU1);
                                }
                                this.v = cv8VarA1;
                                return this.b;
                            }
                            i = 2;
                            i3 = 3;
                            strG2 = i58 == 34 ? g2(i56, 4) : l2(0, i56, i58, 4, this.u1);
                            i2 = i3;
                        } else {
                            i = 2;
                            i3 = 3;
                            if (i55 == 34) {
                                strG2 = g2(i53, 3);
                                i2 = i3;
                            } else {
                                i4 = 3;
                                strG2 = l2(0, i53, i55, 3, this.u1);
                                i2 = i4;
                            }
                        }
                    } else {
                        i = 2;
                        i2 = 3;
                        strG2 = i52 == 34 ? g2(i50, 2) : l2(0, i50, i52, 2, this.u1);
                    }
                } else {
                    i = 2;
                    i2 = 3;
                    strG2 = i49 == 34 ? g2(i39, 1) : l2(0, i39, i49, 1, this.u1);
                }
                strL2 = strG2;
                z2 = false;
                this.u.q(strL2);
                this.b = cv8.FIELD_NAME;
                i5 = this.n;
                if (i5 + 4 >= this.o) {
                    iU1 = U1(z2);
                } else {
                    bArr = this.x1;
                    b = bArr[i5];
                    if (b == 58) {
                        int i415 = i5 + 1;
                        this.n = i415;
                        b2 = bArr[i415];
                        if (b2 > 32) {
                            if (b2 != 47) {
                            }
                            iU1 = U1(true);
                        } else if (b2 != 32) {
                            int i416 = i5 + 2;
                            this.n = i416;
                            b3 = bArr[i416];
                            if (b3 > 32) {
                                iU1 = U1(true);
                            } else {
                                iU1 = U1(true);
                            }
                        } else {
                            int i417 = i5 + 2;
                            this.n = i417;
                            b3 = bArr[i417];
                            if (b3 > 32) {
                                iU1 = U1(true);
                            } else {
                                iU1 = U1(true);
                            }
                        }
                    } else {
                        if (b != 32) {
                            int i418 = i5 + 1;
                            this.n = i418;
                            b = bArr[i418];
                        } else {
                            int i419 = i5 + 1;
                            this.n = i419;
                            b = bArr[i419];
                        }
                        if (b == 58) {
                            i6 = this.n;
                            int i4110 = i6 + 1;
                            this.n = i4110;
                            b2 = bArr[i4110];
                            if (b2 > 32) {
                                if (b2 != 47) {
                                }
                                iU1 = U1(true);
                            } else if (b2 != 32) {
                                int i4111 = i6 + 2;
                                this.n = i4111;
                                b3 = bArr[i4111];
                                if (b3 > 32) {
                                    iU1 = U1(true);
                                } else {
                                    iU1 = U1(true);
                                }
                            } else {
                                int i4112 = i6 + 2;
                                this.n = i4112;
                                b3 = bArr[i4112];
                                if (b3 > 32) {
                                    iU1 = U1(true);
                                } else {
                                    iU1 = U1(true);
                                }
                            }
                        } else {
                            iU1 = U1(z2);
                        }
                    }
                }
                c2();
                if (iU1 == 34) {
                    this.v1 = true;
                    this.v = cv8.VALUE_STRING;
                    return this.b;
                }
                if (iU1 != 43) {
                    if (iU1 != 91) {
                        cv8VarA1 = cv8.START_ARRAY;
                    } else if (iU1 != 102) {
                        D1();
                        cv8VarA1 = cv8.VALUE_FALSE;
                    } else if (iU1 != 110) {
                        E1();
                        cv8VarA1 = cv8.VALUE_NULL;
                    } else if (iU1 != 116) {
                        H1();
                        cv8VarA1 = cv8.VALUE_TRUE;
                    } else if (iU1 != 123) {
                        cv8VarA1 = cv8.START_OBJECT;
                    } else if (iU1 != 45) {
                        cv8VarA1 = M1(true);
                    } else if (iU1 != 46) {
                        switch (iU1) {
                            case 48:
                            case 49:
                            case 50:
                            case 51:
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                            case 56:
                            case 57:
                                cv8VarA1 = N1(iU1);
                                break;
                            default:
                                cv8VarA1 = A1(iU1);
                                break;
                        }
                    } else {
                        cv8VarA1 = K1(z2);
                    }
                } else if (uu8.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.b.a(i8)) {
                    cv8VarA1 = M1(z2);
                } else {
                    cv8VarA1 = A1(iU1);
                }
                this.v = cv8VarA1;
                return this.b;
            }
            if (i23 >= i37 && !B1()) {
                cv8 cv8Var15 = cv8.NOT_AVAILABLE;
                u0(": was expecting closing '\"' for name");
                throw null;
            }
            byte[] bArr10 = this.x1;
            int i95 = this.n;
            this.n = i95 + 1;
            int i96 = bArr10[i95] & 255;
            if (i96 != 34) {
                strG2 = l2(0, 0, i96, 0, this.u1);
            }
        }
        strL2 = strG2;
        z2 = z;
        i = 2;
        i2 = 3;
        this.u.q(strL2);
        this.b = cv8.FIELD_NAME;
        i5 = this.n;
        if (i5 + 4 >= this.o) {
            iU1 = U1(z2);
        } else {
            bArr = this.x1;
            b = bArr[i5];
            if (b == 58) {
                int i4113 = i5 + 1;
                this.n = i4113;
                b2 = bArr[i4113];
                if (b2 > 32) {
                    if (b2 != 47) {
                    }
                    iU1 = U1(true);
                } else if (b2 != 32) {
                    int i4114 = i5 + 2;
                    this.n = i4114;
                    b3 = bArr[i4114];
                    if (b3 > 32) {
                        iU1 = U1(true);
                    } else {
                        iU1 = U1(true);
                    }
                } else {
                    int i4115 = i5 + 2;
                    this.n = i4115;
                    b3 = bArr[i4115];
                    if (b3 > 32) {
                        iU1 = U1(true);
                    } else {
                        iU1 = U1(true);
                    }
                }
            } else {
                if (b != 32) {
                    int i4116 = i5 + 1;
                    this.n = i4116;
                    b = bArr[i4116];
                } else {
                    int i4117 = i5 + 1;
                    this.n = i4117;
                    b = bArr[i4117];
                }
                if (b == 58) {
                    i6 = this.n;
                    int i4118 = i6 + 1;
                    this.n = i4118;
                    b2 = bArr[i4118];
                    if (b2 > 32) {
                        if (b2 != 47) {
                        }
                        iU1 = U1(true);
                    } else if (b2 != 32) {
                        int i4119 = i6 + 2;
                        this.n = i4119;
                        b3 = bArr[i4119];
                        if (b3 > 32) {
                            iU1 = U1(true);
                        } else {
                            iU1 = U1(true);
                        }
                    } else {
                        int i41110 = i6 + 2;
                        this.n = i41110;
                        b3 = bArr[i41110];
                        if (b3 > 32) {
                            iU1 = U1(true);
                        } else {
                            iU1 = U1(true);
                        }
                    }
                } else {
                    iU1 = U1(z2);
                }
            }
        }
        c2();
        if (iU1 == 34) {
            this.v1 = true;
            this.v = cv8.VALUE_STRING;
            return this.b;
        }
        if (iU1 != 43) {
            if (iU1 != 91) {
                cv8VarA1 = cv8.START_ARRAY;
            } else if (iU1 != 102) {
                D1();
                cv8VarA1 = cv8.VALUE_FALSE;
            } else if (iU1 != 110) {
                E1();
                cv8VarA1 = cv8.VALUE_NULL;
            } else if (iU1 != 116) {
                H1();
                cv8VarA1 = cv8.VALUE_TRUE;
            } else if (iU1 != 123) {
                cv8VarA1 = cv8.START_OBJECT;
            } else if (iU1 != 45) {
                cv8VarA1 = M1(true);
            } else if (iU1 != 46) {
                switch (iU1) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        cv8VarA1 = N1(iU1);
                        break;
                    default:
                        cv8VarA1 = A1(iU1);
                        break;
                }
            } else {
                cv8VarA1 = K1(z2);
            }
        } else if (uu8.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.b.a(i8)) {
            cv8VarA1 = M1(z2);
        } else {
            cv8VarA1 = A1(iU1);
        }
        this.v = cv8VarA1;
        return this.b;
    }

    public final void P1(int i) {
        t0("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
        throw null;
    }

    public final void Q1(int i) {
        t0("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
        throw null;
    }

    @Override // defpackage.ju8
    public final void R0() throws IOException {
        if (this.w1 != null) {
            if (this.l.d || gu8.AUTO_CLOSE_SOURCE.a(this.a)) {
                this.w1.close();
            }
            this.w1 = null;
        }
    }

    public final void R1(int i, int i2) {
        this.n = i2;
        Q1(i);
        throw null;
    }

    public final void S1(String str, String str2) throws JsonParseException {
        int length;
        StringBuilder sb = new StringBuilder(str);
        do {
            if (this.n < this.o || B1()) {
                byte[] bArr = this.x1;
                int i = this.n;
                this.n = i + 1;
                char cR1 = (char) r1(bArr[i]);
                if (Character.isJavaIdentifierPart(cR1)) {
                    sb.append(cR1);
                    length = sb.length();
                    this.l.i.getClass();
                }
            }
            throw new JsonParseException(this, "Unrecognized token '" + ((Object) sb) + "': was expecting " + str2);
        } while (length < 256);
        sb.append("...");
        throw new JsonParseException(this, "Unrecognized token '" + ((Object) sb) + "': was expecting " + str2);
    }

    public final void T1() {
        if (this.n < this.o || B1()) {
            byte[] bArr = this.x1;
            int i = this.n;
            if (bArr[i] == 10) {
                this.n = i + 1;
            }
        }
        this.q++;
        this.r = this.n;
    }

    public final int U1(boolean z) {
        while (true) {
            if (this.n >= this.o && !B1()) {
                u0(" within/between " + this.u.p() + " entries");
                throw null;
            }
            byte[] bArr = this.x1;
            int i = this.n;
            int i2 = i + 1;
            this.n = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 == 47) {
                    V1();
                } else if (i3 == 35 && (this.a & ju8.q1) != 0) {
                    W1();
                } else {
                    if (z) {
                        return i3;
                    }
                    if (i3 != 58) {
                        x0(i3, "was expecting a colon to separate field name and value");
                        throw null;
                    }
                    z = true;
                }
            } else if (i3 == 32) {
                continue;
            } else if (i3 == 10) {
                this.q++;
                this.r = i2;
            } else if (i3 == 13) {
                T1();
            } else if (i3 != 9) {
                D0(i3);
                throw null;
            }
        }
    }

    public final void V1() {
        if ((this.a & ju8.p1) == 0) {
            x0(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        }
        if (this.n >= this.o && !B1()) {
            u0(" in a comment");
            throw null;
        }
        byte[] bArr = this.x1;
        int i = this.n;
        this.n = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 == 47) {
            W1();
            return;
        }
        if (i2 != 42) {
            x0(i2, "was expecting either '*' or '/' for a comment");
            throw null;
        }
        int[] iArr = lt2.i;
        while (true) {
            if (this.n >= this.o && !B1()) {
                break;
            }
            byte[] bArr2 = this.x1;
            int i3 = this.n;
            int i4 = i3 + 1;
            this.n = i4;
            int i5 = bArr2[i3] & 255;
            int i6 = iArr[i5];
            if (i6 != 0) {
                if (i6 == 2) {
                    X1();
                } else if (i6 == 3) {
                    Y1();
                } else if (i6 == 4) {
                    Z1();
                } else if (i6 == 10) {
                    this.q++;
                    this.r = i4;
                } else if (i6 == 13) {
                    T1();
                } else {
                    if (i6 != 42) {
                        O1(i5);
                        throw null;
                    }
                    if (i4 >= this.o && !B1()) {
                        break;
                    }
                    byte[] bArr3 = this.x1;
                    int i7 = this.n;
                    if (bArr3[i7] == 47) {
                        this.n = i7 + 1;
                        return;
                    }
                }
            }
        }
        u0(" in a comment");
        throw null;
    }

    @Override // defpackage.pmc
    public final xt8 W() {
        int i = this.n - 1;
        return new xt8(S0(), this.p + ((long) i), -1L, this.q, (i - this.r) + 1);
    }

    public final void W1() {
        int[] iArr = lt2.i;
        while (true) {
            if (this.n >= this.o && !B1()) {
                return;
            }
            byte[] bArr = this.x1;
            int i = this.n;
            int i2 = i + 1;
            this.n = i2;
            int i3 = bArr[i] & 255;
            int i4 = iArr[i3];
            if (i4 != 0) {
                if (i4 == 2) {
                    X1();
                } else if (i4 == 3) {
                    Y1();
                } else if (i4 == 4) {
                    Z1();
                } else if (i4 == 10) {
                    this.q++;
                    this.r = i2;
                    return;
                } else if (i4 == 13) {
                    T1();
                    return;
                } else if (i4 != 42 && i4 < 0) {
                    O1(i3);
                    throw null;
                }
            }
        }
    }

    public final void X1() {
        if (this.n >= this.o) {
            C1();
        }
        byte[] bArr = this.x1;
        int i = this.n;
        int i2 = i + 1;
        this.n = i2;
        byte b = bArr[i];
        if ((b & 192) == 128) {
            return;
        }
        R1(b & 255, i2);
        throw null;
    }

    public final void Y1() {
        if (this.n >= this.o) {
            C1();
        }
        byte[] bArr = this.x1;
        int i = this.n;
        int i2 = i + 1;
        this.n = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            R1(b & 255, i2);
            throw null;
        }
        if (i2 >= this.o) {
            C1();
        }
        byte[] bArr2 = this.x1;
        int i3 = this.n;
        int i4 = i3 + 1;
        this.n = i4;
        byte b2 = bArr2[i3];
        if ((b2 & 192) == 128) {
            return;
        }
        R1(b2 & 255, i4);
        throw null;
    }

    public final void Z1() {
        if (this.n >= this.o) {
            C1();
        }
        byte[] bArr = this.x1;
        int i = this.n;
        int i2 = i + 1;
        this.n = i2;
        byte b = bArr[i];
        if ((b & 192) != 128) {
            R1(b & 255, i2);
            throw null;
        }
        if (i2 >= this.o) {
            C1();
        }
        byte[] bArr2 = this.x1;
        int i3 = this.n;
        int i4 = i3 + 1;
        this.n = i4;
        byte b2 = bArr2[i3];
        if ((b2 & 192) != 128) {
            R1(b2 & 255, i4);
            throw null;
        }
        if (i4 >= this.o) {
            C1();
        }
        byte[] bArr3 = this.x1;
        int i5 = this.n;
        int i6 = i5 + 1;
        this.n = i6;
        byte b3 = bArr3[i5];
        if ((b3 & 192) == 128) {
            return;
        }
        R1(b3 & 255, i6);
        throw null;
    }

    public final int a2() throws JsonParseException {
        while (true) {
            if (this.n >= this.o && !B1()) {
                throw new JsonParseException(this, "Unexpected end-of-input within/between " + this.u.p() + " entries");
            }
            byte[] bArr = this.x1;
            int i = this.n;
            int i2 = i + 1;
            this.n = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 == 47) {
                    V1();
                } else {
                    if (i3 != 35 || (this.a & ju8.q1) == 0) {
                        return i3;
                    }
                    W1();
                }
            } else if (i3 == 32) {
                continue;
            } else if (i3 == 10) {
                this.q++;
                this.r = i2;
            } else if (i3 == 13) {
                T1();
            } else if (i3 != 9) {
                D0(i3);
                throw null;
            }
        }
    }

    public final int b2() {
        while (true) {
            if (this.n >= this.o && !B1()) {
                k0();
                return -1;
            }
            byte[] bArr = this.x1;
            int i = this.n;
            int i2 = i + 1;
            this.n = i2;
            int i3 = bArr[i] & 255;
            if (i3 > 32) {
                if (i3 == 47) {
                    V1();
                } else {
                    if (i3 != 35 || (this.a & ju8.q1) == 0) {
                        return i3;
                    }
                    W1();
                }
            } else if (i3 == 32) {
                continue;
            } else if (i3 == 10) {
                this.q++;
                this.r = i2;
            } else if (i3 == 13) {
                T1();
            } else if (i3 != 9) {
                D0(i3);
                throw null;
            }
        }
    }

    @Override // defpackage.ju8
    public final void c1() {
        byte[] bArr;
        byte[] bArr2;
        super.c1();
        v61 v61Var = this.t1;
        v61 v61Var2 = v61Var.a;
        if (v61Var2 != null && !v61Var.o) {
            u61 u61Var = new u61(v61Var);
            AtomicReference atomicReference = v61Var2.b;
            u61 u61Var2 = (u61) atomicReference.get();
            int i = u61Var2.b;
            int i2 = u61Var.b;
            if (i2 != i) {
                if (i2 > 6000) {
                    u61Var = new u61(64, 4, new int[np0.o], new String[np0.m], 448, np0.o);
                }
                while (!atomicReference.compareAndSet(u61Var2, u61Var) && atomicReference.get() == u61Var2) {
                }
            }
            v61Var.o = true;
        }
        if (!this.y1 || (bArr = this.x1) == null || bArr == (bArr2 = pmc.c)) {
            return;
        }
        this.x1 = bArr2;
        this.l.b(bArr);
    }

    public final void c2() {
        this.s = this.q;
        this.t = this.n - this.r;
    }

    public final int d2() throws JsonParseException {
        if (this.n < this.o || B1()) {
            byte[] bArr = this.x1;
            int i = this.n;
            int i2 = bArr[i] & 255;
            if (i2 >= 48 && i2 <= 57) {
                if ((this.a & ju8.K) == 0) {
                    throw new JsonParseException(this, "Invalid numeric value: Leading zeroes not allowed");
                }
                this.n = i + 1;
                if (i2 == 48) {
                    do {
                        if (this.n >= this.o && !B1()) {
                            return i2;
                        }
                        byte[] bArr2 = this.x1;
                        int i3 = this.n;
                        i2 = bArr2[i3] & 255;
                        if (i2 >= 48 && i2 <= 57) {
                            this.n = i3 + 1;
                        }
                    } while (i2 == 48);
                }
                return i2;
            }
        }
        return 48;
    }

    public final void e2(int i) {
        int i2 = this.n;
        int i3 = i2 + 1;
        this.n = i3;
        if (i != 9) {
            if (i == 10) {
                this.q++;
                this.r = i3;
            } else if (i == 13) {
                this.n = i2;
            } else {
                if (i == 32) {
                    return;
                }
                x0(i, "Expected space separating root-level values");
                throw null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f2  */
    public final String f2(int i, int i2, int[] iArr) throws StreamConstraintsException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int length;
        int i8;
        int i9 = ((i << 2) - 4) + i2;
        sa6.d(i9);
        int i10 = 3;
        if (i2 < 4) {
            int i11 = i - 1;
            i3 = iArr[i11];
            iArr[i11] = i3 << ((4 - i2) << 3);
        } else {
            i3 = 0;
        }
        f8e f8eVar = this.w;
        char[] cArrG = f8eVar.g();
        int i12 = 0;
        int i13 = 0;
        while (i12 < i9) {
            int i14 = iArr[i12 >> 2] >> ((3 - (i12 & 3)) << i10);
            int i15 = i14 & 255;
            int i16 = i12 + 1;
            int i17 = i10;
            if (i15 > 127) {
                if ((i14 & 224) == 192) {
                    i4 = i14 & 31;
                    i5 = 1;
                } else if ((i14 & 240) == 224) {
                    i4 = i14 & 15;
                    i5 = 2;
                } else {
                    if ((i14 & 248) != 240) {
                        P1(i15);
                        throw null;
                    }
                    i4 = i14 & 7;
                    i5 = i17;
                }
                if (i16 + i5 > i9) {
                    cv8 cv8Var = cv8.NOT_AVAILABLE;
                    u0(" in field name");
                    throw null;
                }
                int i18 = iArr[i16 >> 2] >> ((3 - (i16 & 3)) << 3);
                int i19 = i12 + 2;
                if ((i18 & 192) != 128) {
                    Q1(i18);
                    throw null;
                }
                int i20 = (i4 << 6) | (i18 & 63);
                if (i5 > 1) {
                    int i21 = iArr[i19 >> 2] >> ((3 - (i19 & 3)) << 3);
                    int i22 = i12 + 3;
                    if ((i21 & 192) != 128) {
                        Q1(i21);
                        throw null;
                    }
                    i20 = (i20 << 6) | (i21 & 63);
                    i7 = 2;
                    if (i5 > 2) {
                        int i23 = iArr[i22 >> 2] >> ((3 - (i22 & 3)) << 3);
                        int i24 = i12 + 4;
                        if ((i23 & 192) != 128) {
                            Q1(i23 & 255);
                            throw null;
                        }
                        i15 = (i20 << 6) | (i23 & 63);
                        i6 = i24;
                        i7 = 2;
                    } else {
                        i6 = i22;
                    }
                    if (i5 > i7) {
                        int i25 = i15 - 65536;
                        if (i13 >= cArrG.length) {
                            char[] cArr = f8eVar.h;
                            length = cArr.length;
                            i8 = (length >> 1) + length;
                            if (i8 > 65536) {
                                i8 = (length >> 2) + length;
                            }
                            cArrG = Arrays.copyOf(cArr, i8);
                            f8eVar.h = cArrG;
                        }
                        cArrG[i13] = (char) ((i25 >> 10) + 55296);
                        i15 = (i25 & 1023) | 56320;
                        i12 = i6;
                        i13++;
                    } else {
                        i12 = i6;
                    }
                } else {
                    i6 = i19;
                    i7 = 2;
                }
                i15 = i20;
                if (i5 > i7) {
                    int i26 = i15 - 65536;
                    if (i13 >= cArrG.length) {
                        char[] cArr2 = f8eVar.h;
                        length = cArr2.length;
                        i8 = (length >> 1) + length;
                        if (i8 > 65536) {
                            i8 = (length >> 2) + length;
                        }
                        cArrG = Arrays.copyOf(cArr2, i8);
                        f8eVar.h = cArrG;
                    }
                    cArrG[i13] = (char) ((i26 >> 10) + 55296);
                    i15 = (i26 & 1023) | 56320;
                    i12 = i6;
                    i13++;
                } else {
                    i12 = i6;
                }
            } else {
                i12 = i16;
            }
            if (i13 >= cArrG.length) {
                char[] cArr3 = f8eVar.h;
                int length2 = cArr3.length;
                int i27 = (length2 >> 1) + length2;
                if (i27 > 65536) {
                    i27 = (length2 >> 2) + length2;
                }
                char[] cArrCopyOf = Arrays.copyOf(cArr3, i27);
                f8eVar.h = cArrCopyOf;
                cArrG = cArrCopyOf;
            }
            cArrG[i13] = (char) i15;
            i13++;
            i10 = i17;
        }
        String str = new String(cArrG, 0, i13);
        if (i2 < 4) {
            iArr[i - 1] = i3;
        }
        return this.t1.f(str, iArr, i);
    }

    public final String g2(int i, int i2) {
        int iI1 = I1(i, i2);
        String strJ = this.t1.j(iI1);
        if (strJ != null) {
            return strJ;
        }
        int[] iArr = this.u1;
        iArr[0] = iI1;
        return f2(1, i2, iArr);
    }

    public final String h2(int i, int i2, int i3) {
        int iI1 = I1(i2, i3);
        String strK = this.t1.k(i, iI1);
        if (strK != null) {
            return strK;
        }
        int[] iArr = this.u1;
        iArr[0] = i;
        iArr[1] = iI1;
        return f2(2, i3, iArr);
    }

    public final String i2(int i, int i2, int i3, int i4) {
        int iI1 = I1(i3, i4);
        String strL = this.t1.l(i, i2, iI1);
        if (strL != null) {
            return strL;
        }
        int[] iArr = this.u1;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = I1(iI1, i4);
        return f2(3, i4, iArr);
    }

    public final String j2(int i, int i2, int i3, int[] iArr) throws StreamConstraintsException {
        if (i >= iArr.length) {
            iArr = Y0(iArr.length, iArr);
            this.u1 = iArr;
        }
        int i4 = i + 1;
        iArr[i] = I1(i2, i3);
        String strM = this.t1.m(i4, iArr);
        return strM == null ? f2(i4, i3, iArr) : strM;
    }

    public final int k2() {
        if (this.n >= this.o) {
            C1();
        }
        byte[] bArr = this.x1;
        int i = this.n;
        this.n = i + 1;
        return bArr[i] & 255;
    }

    @Override // defpackage.iu8
    public final xt8 l() {
        return new xt8(S0(), this.p + ((long) this.n), -1L, this.q, (this.n - this.r) + 1);
    }

    public final String l2(int i, int i2, int i3, int i4, int[] iArr) throws StreamConstraintsException {
        while (true) {
            if (ju8.r1[i3] != 0) {
                if (i3 == 34) {
                    if (i4 > 0) {
                        if (i >= iArr.length) {
                            int[] iArrY0 = Y0(iArr.length, iArr);
                            this.u1 = iArrY0;
                            iArr = iArrY0;
                        }
                        iArr[i] = I1(i2, i4);
                        i++;
                    }
                    String strM = this.t1.m(i, iArr);
                    return strM == null ? f2(i, i4, iArr) : strM;
                }
                if (i3 != 92) {
                    e1(i3, SdkMetricStatEvent.NAME_KEY);
                } else {
                    i3 = s1();
                }
                if (i3 > 127) {
                    int i5 = 0;
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            int[] iArrY1 = Y0(iArr.length, iArr);
                            this.u1 = iArrY1;
                            iArr = iArrY1;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i4 = 0;
                    }
                    if (i3 < 2048) {
                        i2 = (i2 << 8) | (i3 >> 6) | 192;
                        i4++;
                    } else {
                        int i6 = (i2 << 8) | (i3 >> 12) | 224;
                        int i7 = i4 + 1;
                        if (i7 >= 4) {
                            if (i >= iArr.length) {
                                int[] iArrY2 = Y0(iArr.length, iArr);
                                this.u1 = iArrY2;
                                iArr = iArrY2;
                            }
                            iArr[i] = i6;
                            i++;
                            i7 = 0;
                        } else {
                            i5 = i6;
                        }
                        i2 = (i5 << 8) | ((i3 >> 6) & 63) | np0.m;
                        i4 = i7 + 1;
                    }
                    i3 = (i3 & 63) | np0.m;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = Y0(iArr.length, iArr);
                    this.u1 = iArr;
                }
                iArr[i] = i2;
                i2 = i3;
                i++;
                i4 = 1;
            }
            if (this.n >= this.o && !B1()) {
                cv8 cv8Var = cv8.NOT_AVAILABLE;
                u0(" in field name");
                throw null;
            }
            byte[] bArr = this.x1;
            int i8 = this.n;
            this.n = i8 + 1;
            i3 = bArr[i8] & 255;
        }
    }

    public final String m2(int i, int i2, int i3, int i4, int i5) {
        int[] iArr = this.u1;
        iArr[0] = i;
        iArr[1] = i2;
        return l2(2, i3, i4, i5, iArr);
    }

    public final int r1(int i) {
        int i2;
        char c;
        int i3 = i & 255;
        if (i3 <= 127) {
            return i3;
        }
        if ((i & 224) == 192) {
            i2 = i & 31;
            c = 1;
        } else if ((i & 240) == 224) {
            i2 = i & 15;
            c = 2;
        } else {
            if ((i & 248) != 240) {
                P1(i & 255);
                throw null;
            }
            i2 = i & 7;
            c = 3;
        }
        int iK2 = k2();
        if ((iK2 & 192) != 128) {
            Q1(iK2 & 255);
            throw null;
        }
        int i4 = (i2 << 6) | (iK2 & 63);
        if (c <= 1) {
            return i4;
        }
        int iK3 = k2();
        if ((iK3 & 192) != 128) {
            Q1(iK3 & 255);
            throw null;
        }
        int i5 = (i4 << 6) | (iK3 & 63);
        if (c <= 2) {
            return i5;
        }
        int iK4 = k2();
        if ((iK4 & 192) == 128) {
            return (i5 << 6) | (iK4 & 63);
        }
        Q1(iK4 & 255);
        throw null;
    }

    public final char s1() {
        if (this.n >= this.o && !B1()) {
            cv8 cv8Var = cv8.NOT_AVAILABLE;
            u0(" in character escape sequence");
            throw null;
        }
        byte[] bArr = this.x1;
        int i = this.n;
        this.n = i + 1;
        byte b = bArr[i];
        if (b == 34 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            char cR1 = (char) r1(b);
            Z0(cR1);
            return cR1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.n >= this.o && !B1()) {
                cv8 cv8Var2 = cv8.NOT_AVAILABLE;
                u0(" in character escape sequence");
                throw null;
            }
            byte[] bArr2 = this.x1;
            int i4 = this.n;
            this.n = i4 + 1;
            int i5 = bArr2[i4] & 255;
            int i6 = lt2.l[i5];
            if (i6 < 0) {
                x0(i5, "expected a hex-digit for character escape sequence");
                throw null;
            }
            i2 = (i2 << 4) | i6;
        }
        return (char) i2;
    }

    public final int t1(int i) {
        if (this.n >= this.o) {
            C1();
        }
        byte[] bArr = this.x1;
        int i2 = this.n;
        int i3 = i2 + 1;
        this.n = i3;
        byte b = bArr[i2];
        if ((b & 192) == 128) {
            return ((i & 31) << 6) | (b & 63);
        }
        R1(b & 255, i3);
        throw null;
    }

    public final int u1(int i) {
        if (this.n >= this.o) {
            C1();
        }
        int i2 = i & 15;
        byte[] bArr = this.x1;
        int i3 = this.n;
        int i4 = i3 + 1;
        this.n = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            R1(b & 255, i4);
            throw null;
        }
        int i5 = (i2 << 6) | (b & 63);
        if (i4 >= this.o) {
            C1();
        }
        byte[] bArr2 = this.x1;
        int i6 = this.n;
        int i7 = i6 + 1;
        this.n = i7;
        byte b2 = bArr2[i6];
        if ((b2 & 192) == 128) {
            return (i5 << 6) | (b2 & 63);
        }
        R1(b2 & 255, i7);
        throw null;
    }

    public final int v1(int i) {
        int i2 = i & 15;
        byte[] bArr = this.x1;
        int i3 = this.n;
        int i4 = i3 + 1;
        this.n = i4;
        byte b = bArr[i3];
        if ((b & 192) != 128) {
            R1(b & 255, i4);
            throw null;
        }
        int i5 = (i2 << 6) | (b & 63);
        int i6 = i3 + 2;
        this.n = i6;
        byte b2 = bArr[i4];
        if ((b2 & 192) == 128) {
            return (i5 << 6) | (b2 & 63);
        }
        R1(b2 & 255, i6);
        throw null;
    }

    public final int w1(int i) {
        if (this.n >= this.o) {
            C1();
        }
        byte[] bArr = this.x1;
        int i2 = this.n;
        int i3 = i2 + 1;
        this.n = i3;
        byte b = bArr[i2];
        if ((b & 192) != 128) {
            R1(b & 255, i3);
            throw null;
        }
        int i4 = ((i & 7) << 6) | (b & 63);
        if (i3 >= this.o) {
            C1();
        }
        byte[] bArr2 = this.x1;
        int i5 = this.n;
        int i6 = i5 + 1;
        this.n = i6;
        byte b2 = bArr2[i5];
        if ((b2 & 192) != 128) {
            R1(b2 & 255, i6);
            throw null;
        }
        int i7 = (i4 << 6) | (b2 & 63);
        if (i6 >= this.o) {
            C1();
        }
        byte[] bArr3 = this.x1;
        int i8 = this.n;
        int i9 = i8 + 1;
        this.n = i9;
        byte b3 = bArr3[i8];
        if ((b3 & 192) == 128) {
            return ((i7 << 6) | (b3 & 63)) - 65536;
        }
        R1(b3 & 255, i9);
        throw null;
    }

    public final void x1() throws StreamConstraintsException {
        int i = this.n;
        if (i >= this.o) {
            C1();
            i = this.n;
        }
        f8e f8eVar = this.w;
        char[] cArrG = f8eVar.g();
        int iMin = Math.min(this.o, cArrG.length + i);
        byte[] bArr = this.x1;
        int i2 = 0;
        while (i < iMin) {
            int i3 = bArr[i] & 255;
            if (ju8.s1[i3] != 0) {
                if (i3 != 34) {
                    break;
                }
                this.n = i + 1;
                f8eVar.i = i2;
                return;
            }
            i++;
            cArrG[i2] = (char) i3;
            i2++;
        }
        this.n = i;
        y1(i2, cArrG);
    }

    @Override // defpackage.iu8
    public final String y() throws StreamConstraintsException {
        cv8 cv8Var = this.b;
        cv8 cv8Var2 = cv8.VALUE_STRING;
        f8e f8eVar = this.w;
        if (cv8Var != cv8Var2) {
            if (cv8Var == null) {
                return null;
            }
            int i = cv8Var.d;
            if (i != 5) {
                return (i == 6 || i == 7 || i == 8) ? f8eVar.f() : cv8Var.a;
            }
            return this.u.j;
        }
        if (!this.v1) {
            return f8eVar.f();
        }
        this.v1 = false;
        int i2 = this.n;
        if (i2 >= this.o) {
            C1();
            i2 = this.n;
        }
        char[] cArrG = f8eVar.g();
        int iMin = Math.min(this.o, cArrG.length + i2);
        byte[] bArr = this.x1;
        int i3 = 0;
        while (i2 < iMin) {
            int i4 = bArr[i2] & 255;
            if (ju8.s1[i4] != 0) {
                if (i4 != 34) {
                    break;
                }
                this.n = i2 + 1;
                f8eVar.i = i3;
                if (f8eVar.g > 0) {
                    return f8eVar.f();
                }
                f8eVar.o(i3);
                String str = i3 == 0 ? "" : new String(f8eVar.h, 0, i3);
                f8eVar.j = str;
                return str;
            }
            i2++;
            cArrG[i3] = (char) i4;
            i3++;
        }
        this.n = i2;
        y1(i3, cArrG);
        return f8eVar.f();
    }

    public final void y1(int i, char[] cArr) throws StreamConstraintsException {
        byte[] bArr = this.x1;
        while (true) {
            int i2 = this.n;
            if (i2 >= this.o) {
                C1();
                i2 = this.n;
            }
            int length = cArr.length;
            int i3 = 0;
            f8e f8eVar = this.w;
            if (i >= length) {
                cArr = f8eVar.i();
                i = 0;
            }
            int i4 = this.o;
            int length2 = (cArr.length - i) + i2;
            if (length2 < 0) {
                length2 = Integer.MAX_VALUE;
            }
            int iMin = Math.min(i4, length2);
            while (true) {
                if (i2 >= iMin) {
                    this.n = i2;
                    break;
                }
                int i5 = i2 + 1;
                int iS1 = bArr[i2] & 255;
                int i6 = ju8.s1[iS1];
                if (i6 != 0) {
                    this.n = i5;
                    if (iS1 != 34) {
                        if (i6 == 1) {
                            iS1 = s1();
                        } else if (i6 == 2) {
                            iS1 = t1(iS1);
                        } else if (i6 == 3) {
                            iS1 = this.o - i5 >= 2 ? v1(iS1) : u1(iS1);
                        } else if (i6 == 4) {
                            int iW1 = w1(iS1);
                            int i7 = i + 1;
                            cArr[i] = (char) ((iW1 >> 10) | 55296);
                            if (i7 >= cArr.length) {
                                cArr = f8eVar.i();
                                i = 0;
                            } else {
                                i = i7;
                            }
                            iS1 = (iW1 & 1023) | 56320;
                        } else {
                            if (iS1 >= 32) {
                                O1(iS1);
                                throw null;
                            }
                            e1(iS1, "string value");
                        }
                        if (i >= cArr.length) {
                            cArr = f8eVar.i();
                        } else {
                            i3 = i;
                        }
                        i = i3 + 1;
                        cArr[i3] = (char) iS1;
                        break;
                    }
                    f8eVar.i = i;
                    return;
                }
                cArr[i] = (char) iS1;
                i2 = i5;
                i++;
            }
        }
    }

    public final cv8 z1(int i, boolean z, boolean z2) throws JsonParseException {
        String str;
        int i2 = this.a;
        if (i == 73) {
            if (this.n >= this.o && !B1()) {
                v0(cv8.VALUE_NUMBER_FLOAT);
                throw null;
            }
            byte[] bArr = this.x1;
            int i3 = this.n;
            this.n = i3 + 1;
            i = bArr[i3];
            if (i == 78) {
                str = z ? "-INF" : "+INF";
            } else if (i == 110) {
                str = z ? "-Infinity" : "+Infinity";
            }
            F1(3, str);
            if ((i2 & ju8.X) != 0) {
                return o1(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            throw new JsonParseException(this, c0a.o("Non-standard token '", str, "': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow"));
        }
        if (uu8.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.b.a(i2) || z) {
            z0(i, z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
            throw null;
        }
        z0(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        throw null;
    }
}
