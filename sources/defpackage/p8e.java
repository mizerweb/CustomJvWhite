package defpackage;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.io.IOException;
import java.io.Reader;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class p8e extends ju8 {
    public Reader t1;
    public char[] u1;
    public final boolean v1;
    public final ot2 w1;
    public final int x1;
    public boolean y1;

    public p8e(l38 l38Var, int i, Reader reader, ot2 ot2Var) {
        super(i, l38Var);
        this.t1 = reader;
        if (l38Var.k != null) {
            ore.k("Trying to call same allocXxx() method second time");
            throw null;
        }
        char[] cArrA = l38Var.e.a(0, 0);
        l38Var.k = cArrA;
        this.u1 = cArrA;
        this.n = 0;
        this.o = 0;
        this.w1 = ot2Var;
        this.x1 = ot2Var.d;
        this.v1 = true;
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
            } else if (this.y1) {
                this.y1 = false;
                t1();
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

    public final String A1(int i, int i2, int i3) throws StreamConstraintsException {
        char[] cArr = this.u1;
        int i4 = this.n - i;
        f8e f8eVar = this.w;
        f8eVar.l(cArr, i, i4);
        char[] cArrJ = f8eVar.j();
        int i5 = f8eVar.i;
        while (true) {
            if (this.n >= this.o && !w1()) {
                cv8 cv8Var = cv8.NOT_AVAILABLE;
                u0(" in field name");
                throw null;
            }
            char[] cArr2 = this.u1;
            int i6 = this.n;
            this.n = i6 + 1;
            char cS1 = cArr2[i6];
            if (cS1 <= '\\') {
                if (cS1 == '\\') {
                    cS1 = s1();
                } else if (cS1 <= i3) {
                    if (cS1 == i3) {
                        f8eVar.i = i5;
                        char[] cArrK = f8eVar.k();
                        int i7 = f8eVar.c;
                        return this.w1.b(cArrK, i7 >= 0 ? i7 : 0, f8eVar.m(), i2);
                    }
                    if (cS1 < ' ') {
                        e1(cS1, SdkMetricStatEvent.NAME_KEY);
                    }
                }
            }
            i2 = (i2 * 33) + cS1;
            int i8 = i5 + 1;
            cArrJ[i5] = cS1;
            if (i8 >= cArrJ.length) {
                cArrJ = f8eVar.i();
                i5 = 0;
            } else {
                i5 = i8;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004b A[EDGE_INSN: B:21:0x004b->B:47:0x0091 BREAK  A[LOOP:0: B:34:0x006b->B:148:?]] */
    public final cv8 B1(int i, boolean z) throws JsonParseException, StreamConstraintsException {
        int i2;
        char cL1;
        boolean z2;
        boolean z3;
        int i3;
        char cL2;
        char cL3;
        char c;
        int i4 = this.a;
        this.n = z ? i + 1 : i;
        f8e f8eVar = this.w;
        char[] cArrG = f8eVar.g();
        boolean z4 = true;
        if (z) {
            cArrG[0] = '-';
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i5 = this.n;
        if (i5 < this.o) {
            char[] cArr = this.u1;
            this.n = i5 + 1;
            cL1 = cArr[i5];
        } else {
            cv8 cv8Var = cv8.NOT_AVAILABLE;
            cL1 = L1("No digit following sign");
        }
        if (cL1 == '0') {
            int i6 = this.n;
            int i7 = this.o;
            if ((i6 < i7 && ((c = this.u1[i6]) < '0' || c > '9')) || (i6 >= i7 && !w1())) {
                cL1 = '0';
                break;
            }
            char[] cArr2 = this.u1;
            int i8 = this.n;
            cL1 = cArr2[i8];
            if (cL1 < '0' || cL1 > '9') {
                cL1 = '0';
                break;
            }
            if ((ju8.K & i4) == 0) {
                throw new JsonParseException(this, "Invalid numeric value: Leading zeroes not allowed");
            }
            this.n = i8 + 1;
            if (cL1 == '0') {
                do {
                    if (this.n >= this.o && !w1()) {
                        break;
                    }
                    char[] cArr3 = this.u1;
                    int i9 = this.n;
                    cL1 = cArr3[i9];
                    if (cL1 < '0' || cL1 > '9') {
                        cL1 = '0';
                        break;
                    }
                    this.n = i9 + 1;
                } while (cL1 == '0');
            }
        }
        int i10 = 0;
        while (true) {
            if (cL1 >= '0' && cL1 <= '9') {
                i10++;
                if (i2 >= cArrG.length) {
                    cArrG = f8eVar.i();
                    i2 = 0;
                }
                int i11 = i2 + 1;
                cArrG[i2] = cL1;
                if (this.n >= this.o && !w1()) {
                    cL1 = 0;
                    i2 = i11;
                    z2 = true;
                    break;
                }
                char[] cArr4 = this.u1;
                int i12 = this.n;
                this.n = i12 + 1;
                cL1 = cArr4[i12];
                i2 = i11;
            } else {
                z2 = false;
                break;
            }
        }
        if (i10 == 0 && (cL1 != '.' || !uu8.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.b.a(i4))) {
            return u1(cL1, z, false);
        }
        int i13 = -1;
        if (cL1 == '.') {
            if (i2 >= cArrG.length) {
                cArrG = f8eVar.i();
                i2 = 0;
            }
            cArrG[i2] = cL1;
            i2++;
            i3 = 0;
            while (true) {
                z3 = z4;
                if (this.n >= this.o && !w1()) {
                    z2 = z3;
                    break;
                }
                char[] cArr5 = this.u1;
                int i14 = this.n;
                this.n = i14 + 1;
                cL1 = cArr5[i14];
                if (cL1 < '0' || cL1 > '9') {
                    break;
                }
                i3++;
                if (i2 >= cArrG.length) {
                    cArrG = f8eVar.i();
                    i2 = 0;
                }
                cArrG[i2] = cL1;
                i2++;
                z4 = z3;
            }
            if (i3 == 0 && !uu8.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.b.a(i4)) {
                z0(cL1, "Decimal point not followed by a digit");
                throw null;
            }
        } else {
            z3 = true;
            i3 = -1;
        }
        if ((cL1 | ' ') == 101) {
            if (i2 >= cArrG.length) {
                cArrG = f8eVar.i();
                i2 = 0;
            }
            int i15 = i2 + 1;
            cArrG[i2] = cL1;
            int i16 = this.n;
            if (i16 < this.o) {
                char[] cArr6 = this.u1;
                this.n = i16 + 1;
                cL2 = cArr6[i16];
            } else {
                cv8 cv8Var2 = cv8.NOT_AVAILABLE;
                cL2 = L1("expected a digit for number exponent");
            }
            if (cL2 == '-' || cL2 == '+') {
                if (i15 >= cArrG.length) {
                    cArrG = f8eVar.i();
                    i15 = 0;
                }
                int i17 = i15 + 1;
                cArrG[i15] = cL2;
                int i18 = this.n;
                if (i18 < this.o) {
                    char[] cArr7 = this.u1;
                    this.n = i18 + 1;
                    cL3 = cArr7[i18];
                } else {
                    cv8 cv8Var3 = cv8.NOT_AVAILABLE;
                    cL3 = L1("expected a digit for number exponent");
                }
                cL1 = cL3;
                i15 = i17;
            } else {
                cL1 = cL2;
            }
            int i19 = 0;
            while (true) {
                if (cL1 <= '9' && cL1 >= '0') {
                    i19++;
                    if (i15 >= cArrG.length) {
                        cArrG = f8eVar.i();
                        i15 = 0;
                    }
                    int i20 = i15 + 1;
                    cArrG[i15] = cL1;
                    if (this.n >= this.o && !w1()) {
                        i2 = i20;
                        z2 = z3;
                        break;
                    }
                    char[] cArr8 = this.u1;
                    int i21 = this.n;
                    this.n = i21 + 1;
                    cL1 = cArr8[i21];
                    i15 = i20;
                } else {
                    i2 = i15;
                    break;
                }
            }
            i13 = i19;
            if (i13 == 0) {
                z0(cL1, "Exponent indicator not followed by a digit");
                throw null;
            }
        }
        int i22 = i13;
        if (!z2) {
            this.n--;
            if (this.u.j()) {
                K1(cL1);
            }
        }
        f8eVar.i = i2;
        return (i3 >= 0 || i22 >= 0) ? p1(i10, i3, i22, z) : q1(i10, z);
    }

    public final cv8 C1(boolean z) {
        int i = this.n;
        int i2 = z ? i - 1 : i;
        int i3 = this.o;
        if (i >= i3) {
            return B1(i2, z);
        }
        int i4 = i + 1;
        char c = this.u1[i];
        int i5 = 1;
        if (c <= '9') {
            char c2 = '0';
            if (c >= '0') {
                if (c == '0') {
                    return B1(i2, z);
                }
                while (i4 < i3) {
                    char c3 = c2;
                    int i6 = i5;
                    int i7 = i4 + 1;
                    char c4 = this.u1[i4];
                    if (c4 < c3 || c4 > '9') {
                        if (c4 == '.' || (c4 | ' ') == 101) {
                            this.n = i7;
                            return y1(z, c4, i2, i7, i6);
                        }
                        this.n = i4;
                        if (this.u.j()) {
                            K1(c4);
                        }
                        this.w.l(this.u1, i2, i4 - i2);
                        return q1(i6, z);
                    }
                    int i8 = i6 + 1;
                    i4 = i7;
                    c2 = c3;
                    i5 = i8;
                }
                return B1(i2, z);
            }
        }
        this.n = i4;
        return c == '.' ? z1(z) : u1(c, z, true);
    }

    public final void D1(String str, String str2) throws JsonParseException {
        int length;
        StringBuilder sb = new StringBuilder(str);
        do {
            if (this.n < this.o || w1()) {
                char c = this.u1[this.n];
                if (Character.isJavaIdentifierPart(c)) {
                    this.n++;
                    sb.append(c);
                    length = sb.length();
                    this.l.i.getClass();
                }
            }
            throw new JsonParseException(this, "Unrecognized token '" + ((Object) sb) + "': was expecting " + str2);
        } while (length < 256);
        sb.append("...");
        throw new JsonParseException(this, "Unrecognized token '" + ((Object) sb) + "': was expecting " + str2);
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
        } else if (this.y1) {
            this.y1 = false;
            t1();
        }
        return this.w.m();
    }

    public final int E1() throws JsonParseException {
        while (true) {
            if (this.n >= this.o && !w1()) {
                throw new JsonParseException(this, "Unexpected end-of-input within/between " + this.u.p() + " entries");
            }
            char[] cArr = this.u1;
            int i = this.n;
            int i2 = i + 1;
            this.n = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    H1();
                } else {
                    if (c != '#' || (this.a & ju8.q1) == 0) {
                        return c;
                    }
                    I1();
                }
            } else if (c >= ' ') {
                continue;
            } else if (c == '\n') {
                this.q++;
                this.r = i2;
            } else if (c == '\r') {
                F1();
            } else if (c != '\t') {
                D0(c);
                throw null;
            }
        }
    }

    public final void F1() {
        if (this.n < this.o || w1()) {
            char[] cArr = this.u1;
            int i = this.n;
            if (cArr[i] == '\n') {
                this.n = i + 1;
            }
        }
        this.q++;
        this.r = this.n;
    }

    public final int G1(boolean z) {
        while (true) {
            if (this.n >= this.o && !w1()) {
                u0(" within/between " + this.u.p() + " entries");
                throw null;
            }
            char[] cArr = this.u1;
            int i = this.n;
            int i2 = i + 1;
            this.n = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    H1();
                } else if (c == '#' && (this.a & ju8.q1) != 0) {
                    I1();
                } else {
                    if (z) {
                        return c;
                    }
                    if (c != ':') {
                        x0(c, "was expecting a colon to separate field name and value");
                        throw null;
                    }
                    z = true;
                }
            } else if (c >= ' ') {
                continue;
            } else if (c == '\n') {
                this.q++;
                this.r = i2;
            } else if (c == '\r') {
                F1();
            } else if (c != '\t') {
                D0(c);
                throw null;
            }
        }
    }

    public final void H1() {
        if ((this.a & ju8.p1) == 0) {
            x0(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
            throw null;
        }
        if (this.n >= this.o && !w1()) {
            u0(" in a comment");
            throw null;
        }
        char[] cArr = this.u1;
        int i = this.n;
        this.n = i + 1;
        char c = cArr[i];
        if (c == '/') {
            I1();
            return;
        }
        if (c != '*') {
            x0(c, "was expecting either '*' or '/' for a comment");
            throw null;
        }
        while (true) {
            if (this.n >= this.o && !w1()) {
                break;
            }
            char[] cArr2 = this.u1;
            int i2 = this.n;
            int i3 = i2 + 1;
            this.n = i3;
            char c2 = cArr2[i2];
            if (c2 <= '*') {
                if (c2 == '*') {
                    if (i3 >= this.o && !w1()) {
                        break;
                    }
                    char[] cArr3 = this.u1;
                    int i4 = this.n;
                    if (cArr3[i4] == '/') {
                        this.n = i4 + 1;
                        return;
                    }
                } else if (c2 >= ' ') {
                    continue;
                } else if (c2 == '\n') {
                    this.q++;
                    this.r = i3;
                } else if (c2 == '\r') {
                    F1();
                } else if (c2 != '\t') {
                    D0(c2);
                    throw null;
                }
            }
        }
        u0(" in a comment");
        throw null;
    }

    @Override // defpackage.iu8
    public final int I() throws StreamConstraintsException {
        cv8 cv8Var = this.b;
        if (cv8Var != null) {
            int i = cv8Var.d;
            if (i != 6) {
                if (i == 7 || i == 8) {
                }
            } else if (this.y1) {
                this.y1 = false;
                t1();
            }
            int i2 = this.w.c;
            if (i2 >= 0) {
                return i2;
            }
        }
        return 0;
    }

    public final void I1() {
        while (true) {
            if (this.n >= this.o && !w1()) {
                return;
            }
            char[] cArr = this.u1;
            int i = this.n;
            int i2 = i + 1;
            this.n = i2;
            char c = cArr[i];
            if (c < ' ') {
                if (c == '\n') {
                    this.q++;
                    this.r = i2;
                    return;
                } else if (c == '\r') {
                    F1();
                    return;
                } else if (c != '\t') {
                    D0(c);
                    throw null;
                }
            }
        }
    }

    public final int J1() {
        while (true) {
            if (this.n >= this.o && !w1()) {
                k0();
                return -1;
            }
            char[] cArr = this.u1;
            int i = this.n;
            int i2 = i + 1;
            this.n = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    H1();
                } else {
                    if (c != '#' || (this.a & ju8.q1) == 0) {
                        return c;
                    }
                    I1();
                }
            } else if (c == ' ') {
                continue;
            } else if (c == '\n') {
                this.q++;
                this.r = i2;
            } else if (c == '\r') {
                F1();
            } else if (c != '\t') {
                D0(c);
                throw null;
            }
        }
    }

    public final void K1(int i) {
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

    public final char L1(String str) {
        if (this.n >= this.o && !w1()) {
            u0(str);
            throw null;
        }
        char[] cArr = this.u1;
        int i = this.n;
        this.n = i + 1;
        return cArr[i];
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0272  */
    /* JADX WARN: Code duplicated, block: B:171:0x0292  */
    /* JADX WARN: Code duplicated, block: B:174:0x0299  */
    /* JADX WARN: Code duplicated, block: B:176:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:180:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:185:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:205:0x030c  */
    /* JADX WARN: Code duplicated, block: B:235:0x0365  */
    /* JADX WARN: Code duplicated, block: B:249:0x039d  */
    /* JADX WARN: Code duplicated, block: B:250:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:321:0x0497  */
    /* JADX WARN: Code duplicated, block: B:337:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:355:0x0500  */
    /* JADX WARN: Code duplicated, block: B:403:0x0279 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:? A[LOOP:5: B:158:0x0247->B:404:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:406:0x02b2 A[EDGE_INSN: B:406:0x02b2->B:182:0x02b2 BREAK  A[LOOP:6: B:169:0x028c->B:251:0x03a4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x02b2 A[EDGE_INSN: B:407:0x02b2->B:182:0x02b2 BREAK  A[LOOP:6: B:169:0x028c->B:251:0x03a4], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iu8
    public final cv8 P() throws Throwable {
        int iJ1;
        int i;
        Throwable th;
        int i2;
        cv8 cv8VarC1;
        char c;
        char c2;
        char c3;
        int i3;
        char[] cArrJ;
        int i4;
        int length;
        char c4;
        int i5;
        int i6;
        String strB;
        int i7;
        boolean z;
        int iG1;
        int iG2;
        int iG3;
        int iE1;
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
        char c5 = ' ';
        if (this.y1) {
            this.y1 = false;
            int i9 = this.n;
            int i10 = this.o;
            char[] cArr = this.u1;
            while (true) {
                if (i9 >= i10) {
                    this.n = i9;
                    if (!w1()) {
                        cv8 cv8Var2 = cv8.NOT_AVAILABLE;
                        u0(": was expecting closing quote for a string value");
                        throw null;
                    }
                    i9 = this.n;
                    i10 = this.o;
                }
                int i11 = i9 + 1;
                char c6 = cArr[i9];
                if (c6 <= '\\') {
                    if (c6 == '\\') {
                        this.n = i11;
                        s1();
                        i9 = this.n;
                        i10 = this.o;
                    } else if (c6 <= '\"') {
                        if (c6 == '\"') {
                            this.n = i11;
                            break;
                        }
                        if (c6 < ' ') {
                            this.n = i11;
                            e1(c6, "string value");
                        }
                    }
                }
                i9 = i11;
            }
        }
        int i12 = 1;
        if (this.n < this.o || w1()) {
            char[] cArr2 = this.u1;
            int i13 = this.n;
            int i14 = i13 + 1;
            this.n = i14;
            char c7 = cArr2[i13];
            iJ1 = c7;
            if (c7 <= ' ') {
                if (c7 != ' ') {
                    if (c7 == '\n') {
                        this.q++;
                        this.r = i14;
                    } else if (c7 == '\r') {
                        F1();
                    } else if (c7 != '\t' && !a1(c7)) {
                        D0(c7);
                        throw null;
                    }
                }
                while (true) {
                    int i15 = this.n;
                    if (i15 >= this.o) {
                        iJ1 = J1();
                        break;
                    }
                    char[] cArr3 = this.u1;
                    int i16 = i15 + 1;
                    this.n = i16;
                    char c8 = cArr3[i15];
                    if (c8 > ' ') {
                        if (c8 != '/' && c8 != '#') {
                            iJ1 = c8;
                            break;
                        }
                        this.n = i15;
                        iJ1 = J1();
                        break;
                    }
                    if (c8 != ' ') {
                        if (c8 == '\n') {
                            this.q++;
                            this.r = i16;
                        } else if (c8 == '\r') {
                            F1();
                        } else if (c8 != '\t' && !a1(c8)) {
                            D0(c8);
                            throw null;
                        }
                    }
                }
            } else if (c7 == '/' || c7 == '#') {
                this.n = i13;
                iJ1 = J1();
            }
        } else {
            k0();
            iJ1 = -1;
        }
        if (iJ1 < 0) {
            close();
            this.b = null;
            return null;
        }
        if ((iJ1 | 32) == 125) {
            r1(iJ1);
            return this.b;
        }
        tu8 tu8Var = this.u;
        int i17 = tu8Var.c + 1;
        tu8Var.c = i17;
        if (tu8Var.b != 0 && i17 > 0) {
            if (iJ1 != 44) {
                x0(iJ1, "was expecting comma to separate " + this.u.p() + " entries");
                throw null;
            }
            while (true) {
                int i18 = this.n;
                if (i18 >= this.o) {
                    iE1 = E1();
                    break;
                }
                char[] cArr4 = this.u1;
                int i19 = i18 + 1;
                this.n = i19;
                char c9 = cArr4[i18];
                if (c9 > ' ') {
                    if (c9 != '/' && c9 != '#') {
                        iE1 = c9;
                        break;
                    }
                    this.n = i18;
                    iE1 = E1();
                    break;
                }
                if (c9 < ' ') {
                    if (c9 == '\n') {
                        this.q++;
                        this.r = i19;
                    } else if (c9 == '\r') {
                        F1();
                    } else if (c9 != '\t') {
                        D0(c9);
                        throw null;
                    }
                }
            }
            i = iE1;
            if ((ju8.J & i8) != 0 && ((iE1 == true ? 1 : 0) | 32) == 125) {
                i = iE1;
                r1(iE1 == true ? 1 : 0);
                return this.b;
            }
        }
        i = iE1;
        i = iJ1;
        i = iJ1;
        boolean zI = this.u.i();
        f8e f8eVar = this.w;
        if (zI) {
            int i20 = this.n;
            ot2 ot2Var = this.w1;
            th = null;
            int[] iArr = ju8.r1;
            int i21 = this.x1;
            if (i == 34) {
                while (true) {
                    if (i20 < this.o) {
                        char[] cArr5 = this.u1;
                        char c10 = cArr5[i20];
                        i3 = i12;
                        if (c10 >= iArr.length || iArr[c10] == 0) {
                            i21 = (i21 * 33) + c10;
                            i20++;
                            i12 = i3;
                        } else if (c10 == '\"') {
                            int i22 = this.n;
                            this.n = i20 + 1;
                            strB = ot2Var.b(cArr5, i22, i20 - i22, i21);
                            break;
                        }
                    } else {
                        i3 = i12;
                    }
                    int i23 = this.n;
                    this.n = i20;
                    strB = A1(i23, i21, 34);
                    break;
                }
            }
            i3 = 1;
            if (i == 39 && (ju8.n1 & i8) != 0) {
                int i24 = this.o;
                if (i20 >= i24) {
                    int i25 = this.n;
                    this.n = i20;
                    strB = A1(i25, i21, 39);
                    break;
                }
                int length2 = iArr.length;
                while (true) {
                    char[] cArr6 = this.u1;
                    char c11 = cArr6[i20];
                    if (c11 != '\'') {
                        if (c11 >= length2 || iArr[c11] == 0) {
                            i21 = (i21 * 33) + c11;
                            i20++;
                            if (i20 >= i24) {
                            }
                        }
                        int i26 = this.n;
                        this.n = i20;
                        strB = A1(i26, i21, 39);
                        break;
                    }
                    int i27 = this.n;
                    this.n = i20 + 1;
                    strB = ot2Var.b(cArr6, i27, i20 - i27, i21);
                    break;
                }
            }
            if ((ju8.o1 & i8) == 0) {
                x0(i == true ? 1 : 0, "was expecting double-quote to start field name");
                throw null;
            }
            int[] iArr2 = lt2.g;
            int length3 = iArr2.length;
            if (!(i < length3 ? iArr2[i == true ? 1 : 0] == 0 : Character.isJavaIdentifierPart(i == true ? (char) 1 : (char) 0))) {
                x0(i == true ? 1 : 0, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
                throw null;
            }
            int i28 = this.n;
            int i29 = this.o;
            if (i28 < i29) {
                while (true) {
                    char[] cArr7 = this.u1;
                    char c12 = cArr7[i28];
                    if (c12 < length3) {
                        if (iArr2[c12] != 0) {
                            int i30 = this.n - 1;
                            this.n = i28;
                            strB = ot2Var.b(cArr7, i30, i28 - i30, i21);
                        } else {
                            i21 = (i21 * 33) + c12;
                            i28++;
                            if (i28 >= i29) {
                                int i31 = this.n - 1;
                                this.n = i28;
                                f8eVar.l(this.u1, i31, i28 - i31);
                                cArrJ = f8eVar.j();
                                i4 = f8eVar.i;
                                length = iArr2.length;
                                while (true) {
                                    if (this.n < this.o && !w1()) {
                                        break;
                                    }
                                    c4 = this.u1[this.n];
                                    if (c4 < length) {
                                        if (iArr2[c4] != 0) {
                                            break;
                                        }
                                        this.n++;
                                        i21 = (i21 * 33) + c4;
                                        i5 = i4 + 1;
                                        cArrJ[i4] = c4;
                                        if (i5 >= cArrJ.length) {
                                            cArrJ = f8eVar.i();
                                            i4 = 0;
                                        } else {
                                            i4 = i5;
                                        }
                                        c5 = ' ';
                                        i3 = 1;
                                    } else {
                                        if (!Character.isJavaIdentifierPart(c4)) {
                                            break;
                                        }
                                        this.n++;
                                        i21 = (i21 * 33) + c4;
                                        i5 = i4 + 1;
                                        cArrJ[i4] = c4;
                                        if (i5 >= cArrJ.length) {
                                            cArrJ = f8eVar.i();
                                            i4 = 0;
                                        } else {
                                            i4 = i5;
                                        }
                                        c5 = ' ';
                                        i3 = 1;
                                    }
                                }
                                f8eVar.i = i4;
                                char[] cArrK = f8eVar.k();
                                i6 = f8eVar.c;
                                if (i6 < 0) {
                                    i6 = 0;
                                }
                                strB = ot2Var.b(cArrK, i6, f8eVar.m(), i21);
                            }
                        }
                    } else if (Character.isJavaIdentifierPart(c12)) {
                        i21 = (i21 * 33) + c12;
                        i28++;
                        if (i28 >= i29) {
                            int i32 = this.n - 1;
                            this.n = i28;
                            f8eVar.l(this.u1, i32, i28 - i32);
                            cArrJ = f8eVar.j();
                            i4 = f8eVar.i;
                            length = iArr2.length;
                            while (true) {
                                if (this.n < this.o) {
                                    c4 = this.u1[this.n];
                                    if (c4 < length) {
                                        if (iArr2[c4] != 0) {
                                            break;
                                            break;
                                        }
                                        this.n++;
                                        i21 = (i21 * 33) + c4;
                                        i5 = i4 + 1;
                                        cArrJ[i4] = c4;
                                        if (i5 >= cArrJ.length) {
                                            cArrJ = f8eVar.i();
                                            i4 = 0;
                                        } else {
                                            i4 = i5;
                                        }
                                        c5 = ' ';
                                        i3 = 1;
                                    } else {
                                        if (!Character.isJavaIdentifierPart(c4)) {
                                            break;
                                            break;
                                        }
                                        this.n++;
                                        i21 = (i21 * 33) + c4;
                                        i5 = i4 + 1;
                                        cArrJ[i4] = c4;
                                        if (i5 >= cArrJ.length) {
                                            cArrJ = f8eVar.i();
                                            i4 = 0;
                                        } else {
                                            i4 = i5;
                                        }
                                        c5 = ' ';
                                        i3 = 1;
                                    }
                                } else {
                                    c4 = this.u1[this.n];
                                    if (c4 < length) {
                                        if (iArr2[c4] != 0) {
                                            break;
                                            break;
                                        }
                                        this.n++;
                                        i21 = (i21 * 33) + c4;
                                        i5 = i4 + 1;
                                        cArrJ[i4] = c4;
                                        if (i5 >= cArrJ.length) {
                                            cArrJ = f8eVar.i();
                                            i4 = 0;
                                        } else {
                                            i4 = i5;
                                        }
                                        c5 = ' ';
                                        i3 = 1;
                                    } else {
                                        if (!Character.isJavaIdentifierPart(c4)) {
                                            break;
                                            break;
                                        }
                                        this.n++;
                                        i21 = (i21 * 33) + c4;
                                        i5 = i4 + 1;
                                        cArrJ[i4] = c4;
                                        if (i5 >= cArrJ.length) {
                                            cArrJ = f8eVar.i();
                                            i4 = 0;
                                        } else {
                                            i4 = i5;
                                        }
                                        c5 = ' ';
                                        i3 = 1;
                                    }
                                }
                            }
                            f8eVar.i = i4;
                            char[] cArrK2 = f8eVar.k();
                            i6 = f8eVar.c;
                            if (i6 < 0) {
                                i6 = 0;
                            }
                            strB = ot2Var.b(cArrK2, i6, f8eVar.m(), i21);
                        }
                    } else {
                        int i33 = this.n - 1;
                        this.n = i28;
                        strB = ot2Var.b(this.u1, i33, i28 - i33, i21);
                    }
                }
            } else {
                int i34 = this.n - 1;
                this.n = i28;
                f8eVar.l(this.u1, i34, i28 - i34);
                cArrJ = f8eVar.j();
                i4 = f8eVar.i;
                length = iArr2.length;
                while (true) {
                    if (this.n < this.o) {
                        c4 = this.u1[this.n];
                        if (c4 < length) {
                            if (iArr2[c4] != 0) {
                                break;
                                break;
                            }
                            this.n++;
                            i21 = (i21 * 33) + c4;
                            i5 = i4 + 1;
                            cArrJ[i4] = c4;
                            if (i5 >= cArrJ.length) {
                                cArrJ = f8eVar.i();
                                i4 = 0;
                            } else {
                                i4 = i5;
                            }
                            c5 = ' ';
                            i3 = 1;
                        } else {
                            if (!Character.isJavaIdentifierPart(c4)) {
                                break;
                                break;
                            }
                            this.n++;
                            i21 = (i21 * 33) + c4;
                            i5 = i4 + 1;
                            cArrJ[i4] = c4;
                            if (i5 >= cArrJ.length) {
                                cArrJ = f8eVar.i();
                                i4 = 0;
                            } else {
                                i4 = i5;
                            }
                            c5 = ' ';
                            i3 = 1;
                        }
                    } else {
                        c4 = this.u1[this.n];
                        if (c4 < length) {
                            if (iArr2[c4] != 0) {
                                break;
                                break;
                            }
                            this.n++;
                            i21 = (i21 * 33) + c4;
                            i5 = i4 + 1;
                            cArrJ[i4] = c4;
                            if (i5 >= cArrJ.length) {
                                cArrJ = f8eVar.i();
                                i4 = 0;
                            } else {
                                i4 = i5;
                            }
                            c5 = ' ';
                            i3 = 1;
                        } else {
                            if (!Character.isJavaIdentifierPart(c4)) {
                                break;
                                break;
                            }
                            this.n++;
                            i21 = (i21 * 33) + c4;
                            i5 = i4 + 1;
                            cArrJ[i4] = c4;
                            if (i5 >= cArrJ.length) {
                                cArrJ = f8eVar.i();
                                i4 = 0;
                            } else {
                                i4 = i5;
                            }
                            c5 = ' ';
                            i3 = 1;
                        }
                    }
                }
                f8eVar.i = i4;
                char[] cArrK3 = f8eVar.k();
                i6 = f8eVar.c;
                if (i6 < 0) {
                    i6 = 0;
                }
                strB = ot2Var.b(cArrK3, i6, f8eVar.m(), i21);
            }
            this.u.q(strB);
            this.b = cv8.FIELD_NAME;
            int i35 = this.n;
            if (i35 + 4 >= this.o) {
                iG3 = G1(false);
            } else {
                char[] cArr8 = this.u1;
                char c13 = cArr8[i35];
                if (c13 == ':') {
                    int i36 = i35 + 1;
                    this.n = i36;
                    char c14 = cArr8[i36];
                    if (c14 <= c5) {
                        if (c14 == c5 || c14 == '\t') {
                            int i37 = i35 + 2;
                            this.n = i37;
                            char c15 = cArr8[i37];
                            if (c15 <= c5) {
                                z = true;
                                iG1 = G1(true);
                            } else if (c15 == '/' || c15 == '#') {
                                z = true;
                                iG1 = G1(true);
                            } else {
                                this.n = i35 + 3;
                                i7 = c15;
                                iG2 = i7;
                            }
                        } else {
                            z = true;
                            iG1 = G1(true);
                        }
                        iG2 = iG1;
                    } else if (c14 == '/' || c14 == '#') {
                        iG2 = G1(i3);
                    } else {
                        this.n = i35 + 2;
                        iG3 = c14;
                    }
                } else {
                    int i38 = i3;
                    if (c13 == c5 || c13 == '\t') {
                        int i39 = i35 + i38;
                        this.n = i39;
                        c13 = cArr8[i39];
                    }
                    if (c13 == ':') {
                        int i40 = this.n;
                        int i41 = i40 + 1;
                        this.n = i41;
                        char c16 = cArr8[i41];
                        if (c16 > c5) {
                            if (c16 == '/' || c16 == '#') {
                                iG2 = G1(true);
                            } else {
                                this.n = i40 + 2;
                                i7 = c16;
                                iG2 = i7;
                            }
                        } else if (c16 == c5 || c16 == '\t') {
                            int i42 = i40 + 2;
                            this.n = i42;
                            char c17 = cArr8[i42];
                            if (c17 <= c5) {
                                iG2 = G1(true);
                            } else if (c17 == '/' || c17 == '#') {
                                iG2 = G1(true);
                            } else {
                                this.n = i40 + 3;
                                i7 = c17;
                                iG2 = i7;
                            }
                        } else {
                            iG2 = G1(true);
                        }
                    } else {
                        iG2 = G1(false);
                    }
                }
                i2 = iG2;
            }
            iG2 = iG3;
            i2 = iG2;
        } else {
            th = null;
            i2 = i;
        }
        int i43 = this.n;
        int i44 = this.q;
        this.s = i44;
        int i45 = i43 - this.r;
        this.t = i45;
        if (i2 == 34) {
            this.y1 = true;
            cv8VarC1 = cv8.VALUE_STRING;
        } else if (i2 == 43) {
            cv8VarC1 = uu8.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.b.a(i8) ? C1(false) : v1(i2);
        } else if (i2 == 91) {
            if (!zI) {
                h1(i44, i45);
            }
            cv8VarC1 = cv8.START_ARRAY;
        } else if (i2 == 102) {
            int i46 = i43 + 4;
            if (i46 < this.o) {
                char[] cArr9 = this.u1;
                if (cArr9[i43] == 'a' && cArr9[i43 + 1] == 'l' && cArr9[i43 + 2] == 's' && cArr9[i43 + 3] == 'e' && ((c = cArr9[i46]) < '0' || c == ']' || c == '}')) {
                    this.n = i46;
                } else {
                    x1(1, "false");
                }
            } else {
                x1(1, "false");
            }
            cv8VarC1 = cv8.VALUE_FALSE;
        } else if (i2 == 110) {
            int i47 = i43 + 3;
            if (i47 < this.o) {
                char[] cArr10 = this.u1;
                if (cArr10[i43] == 'u' && cArr10[i43 + 1] == 'l' && cArr10[i43 + 2] == 'l' && ((c2 = cArr10[i47]) < '0' || c2 == ']' || c2 == '}')) {
                    this.n = i47;
                } else {
                    x1(1, "null");
                }
            } else {
                x1(1, "null");
            }
            cv8VarC1 = cv8.VALUE_NULL;
        } else if (i2 == 116) {
            int i48 = i43 + 3;
            if (i48 < this.o) {
                char[] cArr11 = this.u1;
                if (cArr11[i43] == 'r' && cArr11[i43 + 1] == 'u' && cArr11[i43 + 2] == 'e' && ((c3 = cArr11[i48]) < '0' || c3 == ']' || c3 == '}')) {
                    this.n = i48;
                } else {
                    x1(1, "true");
                }
            } else {
                x1(1, "true");
            }
            cv8VarC1 = cv8.VALUE_TRUE;
        } else if (i2 == 123) {
            if (!zI) {
                i1(i44, i45);
            }
            cv8VarC1 = cv8.START_OBJECT;
        } else {
            if (i2 == 125) {
                x0(i2, "expected a value");
                throw th;
            }
            if (i2 == 45) {
                cv8VarC1 = C1(true);
            } else if (i2 != 46) {
                switch (i2) {
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
                        int i49 = i43;
                        int i50 = i49 - 1;
                        int i51 = this.o;
                        if (i2 == 48) {
                            cv8VarC1 = B1(i50, false);
                        } else {
                            int i52 = 1;
                            while (true) {
                                if (i49 >= i51) {
                                    this.n = i50;
                                    cv8VarC1 = B1(i50, false);
                                } else {
                                    int i53 = i49 + 1;
                                    char c18 = this.u1[i49];
                                    if (c18 >= '0' && c18 <= '9') {
                                        i52++;
                                        i49 = i53;
                                    } else if (c18 == '.' || (c18 | ' ') == 101) {
                                        this.n = i53;
                                        cv8VarC1 = y1(false, c18, i50, i53, i52);
                                    } else {
                                        this.n = i49;
                                        if (this.u.j()) {
                                            K1(c18);
                                        }
                                        f8eVar.l(this.u1, i50, i49 - i50);
                                        cv8VarC1 = q1(i52, false);
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        cv8VarC1 = v1(i2);
                        break;
                }
            } else {
                cv8VarC1 = z1(false);
            }
        }
        if (zI) {
            this.v = cv8VarC1;
            return this.b;
        }
        this.b = cv8VarC1;
        return cv8VarC1;
    }

    @Override // defpackage.ju8
    public final void R0() throws IOException {
        if (this.t1 != null) {
            if (this.l.d || gu8.AUTO_CLOSE_SOURCE.a(this.a)) {
                this.t1.close();
            }
            this.t1 = null;
        }
    }

    @Override // defpackage.pmc
    public final xt8 W() {
        int i = this.n - 1;
        return new xt8(S0(), -1L, this.p + ((long) i), this.q, (i - this.r) + 1);
    }

    @Override // defpackage.ju8
    public final void c1() {
        char[] cArr;
        ot2 ot2Var;
        super.c1();
        ot2 ot2Var2 = this.w1;
        if (!ot2Var2.m && (ot2Var = ot2Var2.a) != null && ot2Var2.f) {
            nt2 nt2Var = new nt2(ot2Var2);
            AtomicReference atomicReference = ot2Var.b;
            nt2 nt2Var2 = (nt2) atomicReference.get();
            int i = nt2Var2.a;
            int i2 = nt2Var.a;
            if (i2 != i) {
                if (i2 > 12000) {
                    nt2Var = new nt2(new String[64], new mt2[32]);
                }
                while (!atomicReference.compareAndSet(nt2Var2, nt2Var) && atomicReference.get() == nt2Var2) {
                }
            }
            ot2Var2.m = true;
        }
        if (!this.v1 || (cArr = this.u1) == null) {
            return;
        }
        this.u1 = null;
        l38 l38Var = this.l;
        char[] cArr2 = l38Var.k;
        if (cArr != cArr2 && cArr.length < cArr2.length) {
            ore.p("Trying to release buffer smaller than original");
        } else {
            l38Var.k = null;
            l38Var.e.b(0, cArr);
        }
    }

    @Override // defpackage.iu8
    public final xt8 l() {
        int i = (this.n - this.r) + 1;
        return new xt8(S0(), -1L, ((long) this.n) + this.p, this.q, i);
    }

    public final void r1(int i) {
        if (i == 93) {
            int i2 = this.n;
            this.s = this.q;
            this.t = i2 - this.r;
            if (!this.u.h()) {
                d1('}', i);
                throw null;
            }
            this.u = this.u.g;
            this.b = cv8.END_ARRAY;
        }
        if (i == 125) {
            int i3 = this.n;
            this.s = this.q;
            this.t = i3 - this.r;
            if (!this.u.i()) {
                d1(']', i);
                throw null;
            }
            this.u = this.u.g;
            this.b = cv8.END_OBJECT;
        }
    }

    public final char s1() {
        if (this.n >= this.o && !w1()) {
            cv8 cv8Var = cv8.NOT_AVAILABLE;
            u0(" in character escape sequence");
            throw null;
        }
        char[] cArr = this.u1;
        int i = this.n;
        this.n = i + 1;
        char c = cArr[i];
        if (c == '\"' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            Z0(c);
            return c;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.n >= this.o && !w1()) {
                cv8 cv8Var2 = cv8.NOT_AVAILABLE;
                u0(" in character escape sequence");
                throw null;
            }
            char[] cArr2 = this.u1;
            int i4 = this.n;
            this.n = i4 + 1;
            char c2 = cArr2[i4];
            int i5 = lt2.l[c2 & 255];
            if (i5 < 0) {
                x0(c2, "expected a hex-digit for character escape sequence");
                throw null;
            }
            i2 = (i2 << 4) | i5;
        }
        return (char) i2;
    }

    public final void t1() throws StreamConstraintsException {
        int i = this.n;
        int i2 = this.o;
        int[] iArr = ju8.r1;
        f8e f8eVar = this.w;
        if (i < i2) {
            int length = iArr.length;
            do {
                char[] cArr = this.u1;
                char c = cArr[i];
                if (c < length && iArr[c] != 0) {
                    if (c != '\"') {
                        break;
                    }
                    int i3 = this.n;
                    f8eVar.l(cArr, i3, i - i3);
                    this.n = i + 1;
                    return;
                }
                i++;
            } while (i < i2);
        }
        char[] cArr2 = this.u1;
        int i4 = this.n;
        int i5 = i - i4;
        f8eVar.b = null;
        f8eVar.c = -1;
        f8eVar.d = 0;
        f8eVar.j = null;
        f8eVar.k = null;
        if (f8eVar.f) {
            f8eVar.c();
        } else if (f8eVar.h == null) {
            f8eVar.h = f8eVar.b(i5);
        }
        f8eVar.g = 0;
        f8eVar.i = 0;
        if (f8eVar.c >= 0) {
            f8eVar.n(i5);
        }
        f8eVar.j = null;
        f8eVar.k = null;
        char[] cArr3 = f8eVar.h;
        int length2 = cArr3.length;
        int i6 = f8eVar.i;
        int i7 = length2 - i6;
        if (i7 >= i5) {
            System.arraycopy(cArr2, i4, cArr3, i6, i5);
            f8eVar.i += i5;
        } else {
            int i8 = f8eVar.g + i6 + i5;
            if (i8 < 0) {
                i8 = Integer.MAX_VALUE;
            }
            f8eVar.o(i8);
            if (i7 > 0) {
                System.arraycopy(cArr2, i4, cArr3, f8eVar.i, i7);
                i4 += i7;
                i5 -= i7;
            }
            do {
                f8eVar.h();
                int iMin = Math.min(f8eVar.h.length, i5);
                System.arraycopy(cArr2, i4, f8eVar.h, 0, iMin);
                f8eVar.i += iMin;
                i4 += iMin;
                i5 -= iMin;
            } while (i5 > 0);
        }
        this.n = i;
        char[] cArrJ = f8eVar.j();
        int i9 = f8eVar.i;
        int length3 = iArr.length;
        while (true) {
            if (this.n >= this.o && !w1()) {
                cv8 cv8Var = cv8.NOT_AVAILABLE;
                u0(": was expecting closing quote for a string value");
                throw null;
            }
            char[] cArr4 = this.u1;
            int i10 = this.n;
            this.n = i10 + 1;
            char cS1 = cArr4[i10];
            if (cS1 < length3 && iArr[cS1] != 0) {
                if (cS1 == '\"') {
                    f8eVar.i = i9;
                    return;
                } else if (cS1 == '\\') {
                    cS1 = s1();
                } else if (cS1 < ' ') {
                    e1(cS1, "string value");
                }
            }
            if (i9 >= cArrJ.length) {
                cArrJ = f8eVar.i();
                i9 = 0;
            }
            cArrJ[i9] = cS1;
            i9++;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r12v0 ??, r12v1 ??, r12v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final defpackage.cv8 u1(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r12v0 ??, r12v1 ??, r12v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    public final cv8 v1(int i) throws JsonParseException, StreamConstraintsException {
        int i2 = this.a;
        if (i != 39) {
            int i3 = ju8.X;
            if (i == 73) {
                x1(1, "Infinity");
                if ((i2 & i3) != 0) {
                    return o1("Infinity", Double.POSITIVE_INFINITY);
                }
                t0("Non-standard token 'Infinity': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
                throw null;
            }
            if (i == 78) {
                x1(1, "NaN");
                if ((i2 & i3) != 0) {
                    return o1("NaN", Double.NaN);
                }
                t0("Non-standard token 'NaN': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
                throw null;
            }
            if (i != 93) {
                if (i == 43) {
                    if (this.n >= this.o && !w1()) {
                        v0(cv8.VALUE_NUMBER_INT);
                        throw null;
                    }
                    char[] cArr = this.u1;
                    int i4 = this.n;
                    this.n = i4 + 1;
                    return u1(cArr[i4], false, true);
                }
                if (i == 44) {
                    if (!this.u.j() && (i2 & ju8.Y) != 0) {
                        this.n--;
                        return cv8.VALUE_NULL;
                    }
                }
            } else if (this.u.h()) {
                if (!this.u.j()) {
                    this.n--;
                    return cv8.VALUE_NULL;
                }
            }
        } else if ((i2 & ju8.n1) != 0) {
            f8e f8eVar = this.w;
            char[] cArrG = f8eVar.g();
            int i5 = f8eVar.i;
            while (true) {
                if (this.n >= this.o && !w1()) {
                    cv8 cv8Var = cv8.NOT_AVAILABLE;
                    u0(": was expecting closing quote for a string value");
                    throw null;
                }
                char[] cArr2 = this.u1;
                int i6 = this.n;
                this.n = i6 + 1;
                char cS1 = cArr2[i6];
                if (cS1 <= '\\') {
                    if (cS1 == '\\') {
                        cS1 = s1();
                    } else if (cS1 <= '\'') {
                        if (cS1 == '\'') {
                            f8eVar.i = i5;
                            return cv8.VALUE_STRING;
                        }
                        if (cS1 < ' ') {
                            e1(cS1, "string value");
                        }
                    }
                }
                if (i5 >= cArrG.length) {
                    cArrG = f8eVar.i();
                    i5 = 0;
                }
                cArrG[i5] = cS1;
                i5++;
            }
        }
        if (!Character.isJavaIdentifierStart(i)) {
            x0(i, "expected a valid value ".concat(f1()));
            throw null;
        }
        D1("" + ((char) i), f1());
        throw null;
    }

    public final boolean w1() throws IOException {
        Reader reader = this.t1;
        if (reader != null) {
            int i = this.o;
            this.p += (long) i;
            this.r -= i;
            char[] cArr = this.u1;
            int i2 = reader.read(cArr, 0, cArr.length);
            if (i2 > 0) {
                this.n = 0;
                this.o = i2;
                return true;
            }
            this.o = 0;
            this.n = 0;
            R0();
            if (i2 == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this.o);
            }
        }
        return false;
    }

    public final void x1(int i, String str) throws JsonParseException {
        int i2;
        char c;
        int length = str.length();
        if (this.n + length < this.o) {
            while (this.u1[this.n] == str.charAt(i)) {
                int i3 = this.n + 1;
                this.n = i3;
                i++;
                if (i >= length) {
                    char c2 = this.u1[i3];
                    if (c2 < '0' || c2 == ']' || c2 == '}' || !Character.isJavaIdentifierPart(c2)) {
                        return;
                    }
                    D1(str.substring(0, i), f1());
                    throw null;
                }
            }
            D1(str.substring(0, i), f1());
            throw null;
        }
        int length2 = str.length();
        do {
            if ((this.n >= this.o && !w1()) || this.u1[this.n] != str.charAt(i)) {
                D1(str.substring(0, i), f1());
                throw null;
            }
            i2 = this.n + 1;
            this.n = i2;
            i++;
        } while (i < length2);
        if ((i2 < this.o || w1()) && (c = this.u1[this.n]) >= '0' && c != ']' && c != '}' && Character.isJavaIdentifierPart(c)) {
            D1(str.substring(0, i), f1());
            throw null;
        }
    }

    @Override // defpackage.iu8
    public final String y() throws StreamConstraintsException {
        cv8 cv8Var = this.b;
        cv8 cv8Var2 = cv8.VALUE_STRING;
        f8e f8eVar = this.w;
        if (cv8Var == cv8Var2) {
            if (this.y1) {
                this.y1 = false;
                t1();
            }
            return f8eVar.f();
        }
        if (cv8Var == null) {
            return null;
        }
        int i = cv8Var.d;
        if (i != 5) {
            return (i == 6 || i == 7 || i == 8) ? f8eVar.f() : cv8Var.a;
        }
        return this.u.j;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r12v0 ??, r12v1 ??, r12v13 ??, r12v2 ??, r12v7 ??, r12v6 ??, r12v5 ??, r12v10 ??, r12v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final defpackage.cv8 y1(boolean r11, 
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r12v0 ??, r12v1 ??, r12v13 ??, r12v2 ??, r12v7 ??, r12v6 ??, r12v5 ??, r12v10 ??, r12v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r12v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    public final cv8 z1(boolean z) {
        if (!uu8.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.b.a(this.a)) {
            return v1(46);
        }
        int i = this.n;
        int i2 = i - 1;
        if (z) {
            i2 = i - 2;
        }
        return y1(z, 46, i2, i, 0);
    }

    public p8e(l38 l38Var, int i, ot2 ot2Var, char[] cArr, int i2) {
        super(i, l38Var);
        this.t1 = null;
        this.u1 = cArr;
        this.n = 0;
        this.o = i2;
        this.r = 0;
        this.p = 0L;
        this.w1 = ot2Var;
        this.x1 = ot2Var.d;
        this.v1 = true;
    }
}
