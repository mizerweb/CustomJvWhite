package defpackage;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.exc.StreamConstraintsException;
import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ju8 extends pmc {
    public static final int J = gu8.ALLOW_TRAILING_COMMA.b;
    public static final int K = gu8.ALLOW_NUMERIC_LEADING_ZEROS.b;
    public static final int X = gu8.ALLOW_NON_NUMERIC_NUMBERS.b;
    public static final int Y = gu8.ALLOW_MISSING_VALUES.b;
    public static final int Z = gu8.ALLOW_RS_CONTROL_CHAR.b;
    public static final int n1 = gu8.ALLOW_SINGLE_QUOTES.b;
    public static final int o1 = gu8.ALLOW_UNQUOTED_FIELD_NAMES.b;
    public static final int p1 = gu8.ALLOW_COMMENTS.b;
    public static final int q1 = gu8.ALLOW_YAML_COMMENTS.b;
    public static final int[] r1 = lt2.e;
    public static final int[] s1 = lt2.f;
    public int A;
    public long B;
    public float C;
    public double D;
    public BigInteger E;
    public BigDecimal F;
    public String G;
    public boolean H;
    public int I;
    public final l38 l;
    public boolean m;
    public int n;
    public int o;
    public long p;
    public int q;
    public int r;
    public int s;
    public int t;
    public tu8 u;
    public cv8 v;
    public final f8e w;
    public char[] x;
    public boolean y;
    public int z;

    public ju8(int i, l38 l38Var) {
        sa6 sa6Var = l38Var.g;
        this.a = i;
        this.q = 1;
        this.s = 1;
        this.z = 0;
        this.l = l38Var;
        this.w = new f8e(sa6Var, l38Var.e);
        this.u = new tu8(null, 0, gu8.STRICT_DUPLICATE_DETECTION.a(i) ? new ljf(this) : null, 0, 1, 0);
    }

    public abstract void R0();

    public final ep4 S0() {
        return gu8.INCLUDE_SOURCE_IN_LOCATION.a(this.a) ? this.l.a : ep4.d;
    }

    public final BigInteger T0(BigDecimal bigDecimal) throws StreamConstraintsException {
        int iScale = bigDecimal.scale();
        if (Math.abs(iScale) <= 100000) {
            return bigDecimal.toBigInteger();
        }
        sa6.b("BigDecimal scale (%d) magnitude exceeds the maximum allowed (%d)", Integer.valueOf(iScale), Integer.valueOf(BuildConfig.FILE_LENGTH_TO_UPLOAD));
        throw null;
    }

    public final BigDecimal U0() {
        BigDecimal bigDecimal = this.F;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        String str = this.G;
        if (str == null) {
            ore.k("cannot get BigDecimal from current parser state");
            return null;
        }
        try {
            BigDecimal bigDecimalA = kpb.a(str, K(n4h.USE_FAST_BIG_NUMBER_PARSER));
            this.F = bigDecimalA;
            this.G = null;
            return bigDecimalA;
        } catch (NumberFormatException e) {
            throw new JsonParseException("Malformed numeric value (" + pmc.r0(this.G) + ")", l(), e);
        }
    }

    public final BigInteger V0() {
        BigInteger bigInteger = this.E;
        if (bigInteger != null) {
            return bigInteger;
        }
        String str = this.G;
        if (str == null) {
            ore.k("cannot get BigInteger from current parser state");
            return null;
        }
        try {
            BigInteger bigIntegerB = kpb.b(str, K(n4h.USE_FAST_BIG_NUMBER_PARSER));
            this.E = bigIntegerB;
            this.G = null;
            return bigIntegerB;
        } catch (NumberFormatException e) {
            throw new JsonParseException("Malformed numeric value (" + pmc.r0(this.G) + ")", l(), e);
        }
    }

    public final double W0() throws JsonParseException {
        String str = this.G;
        if (str != null) {
            try {
                this.D = kpb.d(str, K(n4h.USE_FAST_DOUBLE_PARSER));
                this.G = null;
            } catch (NumberFormatException e) {
                throw new JsonParseException("Malformed numeric value (" + pmc.r0(this.G) + ")", l(), e);
            }
        }
        return this.D;
    }

    public final float X0() {
        String str = this.G;
        if (str != null) {
            try {
                this.C = kpb.f(str, K(n4h.USE_FAST_DOUBLE_PARSER));
                this.G = null;
            } catch (NumberFormatException e) {
                throw new JsonParseException("Malformed numeric value (" + pmc.r0(this.G) + ")", l(), e);
            }
        }
        return this.C;
    }

    public final int[] Y0(int i, int[] iArr) throws StreamConstraintsException {
        sa6.d(iArr.length << 2);
        int length = iArr.length + i;
        if (length >= 0) {
            return Arrays.copyOf(iArr, length);
        }
        ore.p("Unable to grow array to longer than `Integer.MAX_VALUE`");
        return null;
    }

    public final void Z0(char c) {
        gu8 gu8Var = gu8.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER;
        int i = this.a;
        if (gu8Var.a(i)) {
            return;
        }
        if (c != '\'' || !gu8.ALLOW_SINGLE_QUOTES.a(i)) {
            throw iu8.b("Unrecognized character escape ".concat(pmc.Y(c)), W());
        }
    }

    public final boolean a1(int i) {
        return i == 30 && (this.a & Z) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b3, code lost:
    
        if (r15 < 0) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b1(int r18) {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju8.b1(int):void");
    }

    public void c1() {
        char[] cArr;
        f8e f8eVar = this.w;
        f8eVar.c = -1;
        f8eVar.i = 0;
        f8eVar.d = 0;
        f8eVar.b = null;
        f8eVar.k = null;
        if (f8eVar.f) {
            f8eVar.c();
        }
        x31 x31Var = f8eVar.a;
        if (x31Var != null && (cArr = f8eVar.h) != null) {
            f8eVar.h = null;
            x31Var.b(2, cArr);
        }
        char[] cArr2 = this.x;
        if (cArr2 != null) {
            this.x = null;
            l38 l38Var = this.l;
            char[] cArr3 = l38Var.m;
            if (cArr2 != cArr3 && cArr2.length < cArr3.length) {
                ore.p("Trying to release buffer smaller than original");
            } else {
                l38Var.m = null;
                l38Var.e.b(3, cArr2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        l38 l38Var = this.l;
        if (this.m) {
            return;
        }
        this.n = Math.max(this.n, this.o);
        this.m = true;
        try {
            R0();
        } finally {
            c1();
            l38Var.close();
        }
    }

    public final void d1(char c, int i) {
        tu8 tu8Var = this.u;
        if (!tu8Var.j()) {
            throw iu8.b(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i), Character.valueOf(c), tu8Var.p(), new xt8(S0(), -1L, -1L, tu8Var.k, tu8Var.l)), W());
        }
        throw iu8.b("Unexpected close marker '" + ((char) i) + "': no open " + (i == 125 ? "Object" : "Array") + " to close", W());
    }

    public final void e1(int i, String str) {
        if (!gu8.ALLOW_UNQUOTED_CONTROL_CHARS.a(this.a) || i > 32) {
            throw iu8.b("Illegal unquoted character (" + pmc.Y((char) i) + "): has to be escaped using backslash to be included in " + str, W());
        }
    }

    public final String f1() {
        return gu8.ALLOW_NON_NUMERIC_NUMBERS.a(this.a) ? "(JSON String, Number (or 'NaN'/'+INF'/'-INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    public final void g1() {
        int i = this.z;
        if ((i & 2) != 0) {
            long j = this.B;
            int i2 = (int) j;
            if (i2 != j) {
                throw new InputCoercionException(String.format("Numeric value (%s) out of range of int (%d - %s)", pmc.o0(y()), Integer.MIN_VALUE, Integer.MAX_VALUE), l(), null);
            }
            this.A = i2;
        } else if ((i & 4) != 0) {
            BigInteger bigIntegerV0 = V0();
            if (pmc.d.compareTo(bigIntegerV0) > 0 || pmc.e.compareTo(bigIntegerV0) < 0) {
                throw new InputCoercionException(String.format("Numeric value (%s) out of range of int (%d - %s)", pmc.o0(y()), Integer.MIN_VALUE, Integer.MAX_VALUE), l(), null);
            }
            this.A = bigIntegerV0.intValue();
        } else if ((i & 8) != 0) {
            double dW0 = W0();
            if (dW0 < -2.147483648E9d || dW0 > 2.147483647E9d) {
                throw new InputCoercionException(String.format("Numeric value (%s) out of range of int (%d - %s)", pmc.o0(y()), Integer.MIN_VALUE, Integer.MAX_VALUE), l(), null);
            }
            this.A = (int) dW0;
        } else {
            if ((i & 16) == 0) {
                vsi.a();
                throw null;
            }
            BigDecimal bigDecimalU0 = U0();
            if (pmc.j.compareTo(bigDecimalU0) > 0 || pmc.k.compareTo(bigDecimalU0) < 0) {
                throw new InputCoercionException(String.format("Numeric value (%s) out of range of int (%d - %s)", pmc.o0(y()), Integer.MIN_VALUE, Integer.MAX_VALUE), l(), null);
            }
            this.A = bigDecimalU0.intValue();
        }
        this.z |= 1;
    }

    public final void h1(int i, int i2) {
        tu8 tu8Var = this.u;
        tu8 tu8Var2 = tu8Var.i;
        if (tu8Var2 == null) {
            int i3 = 1 + tu8Var.d;
            ljf ljfVar = tu8Var.h;
            tu8Var2 = new tu8(tu8Var, i3, ljfVar == null ? null : new ljf((Closeable) ljfVar.c), 1, i, i2);
            tu8Var.i = tu8Var2;
        } else {
            tu8Var2.b = 1;
            tu8Var2.c = -1;
            tu8Var2.k = i;
            tu8Var2.l = i2;
            tu8Var2.j = null;
            ljf ljfVar2 = tu8Var2.h;
            if (ljfVar2 != null) {
                ljfVar2.b = null;
                ljfVar2.d = null;
                ljfVar2.e = null;
            }
        }
        this.u = tu8Var2;
        int i4 = tu8Var2.d;
        if (i4 <= 1000) {
            return;
        }
        sa6.b("Document nesting depth (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i4), 1000, sa6.a("getMaxNestingDepth"));
        throw null;
    }

    public final void i1(int i, int i2) {
        tu8 tu8Var = this.u;
        tu8 tu8Var2 = tu8Var.i;
        if (tu8Var2 == null) {
            int i3 = tu8Var.d + 1;
            ljf ljfVar = tu8Var.h;
            tu8Var2 = new tu8(tu8Var, i3, ljfVar == null ? null : new ljf((Closeable) ljfVar.c), 2, i, i2);
            tu8Var.i = tu8Var2;
        } else {
            tu8Var2.b = 2;
            tu8Var2.c = -1;
            tu8Var2.k = i;
            tu8Var2.l = i2;
            tu8Var2.j = null;
            ljf ljfVar2 = tu8Var2.h;
            if (ljfVar2 != null) {
                ljfVar2.b = null;
                ljfVar2.d = null;
                ljfVar2.e = null;
            }
        }
        this.u = tu8Var2;
        int i4 = tu8Var2.d;
        if (i4 <= 1000) {
            return;
        }
        sa6.b("Document nesting depth (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i4), 1000, sa6.a("getMaxNestingDepth"));
        throw null;
    }

    public final String j1() {
        tu8 tu8Var;
        cv8 cv8Var = this.b;
        return ((cv8Var == cv8.START_OBJECT || cv8Var == cv8.START_ARRAY) && (tu8Var = this.u.g) != null) ? tu8Var.j : this.u.j;
    }

    @Override // defpackage.pmc
    public final void k0() {
        if (this.u.j()) {
            return;
        }
        String str = this.u.h() ? "Array" : "Object";
        tu8 tu8Var = this.u;
        ep4 ep4VarS0 = S0();
        tu8Var.getClass();
        u0(": expected close marker for " + str + " (start marker at " + new xt8(ep4VarS0, -1L, -1L, tu8Var.k, tu8Var.l) + ")");
        throw null;
    }

    public final double k1() {
        int i = this.z;
        if ((i & 8) == 0) {
            if (i == 0) {
                b1(8);
            }
            int i2 = this.z;
            if ((i2 & 8) == 0) {
                if ((i2 & 16) != 0) {
                    if (this.G != null) {
                        this.D = W0();
                    } else {
                        this.D = U0().doubleValue();
                    }
                } else if ((i2 & 4) != 0) {
                    if (this.G != null) {
                        this.D = W0();
                    } else {
                        this.D = V0().doubleValue();
                    }
                } else if ((i2 & 2) != 0) {
                    this.D = this.B;
                } else if ((i2 & 1) != 0) {
                    this.D = this.A;
                } else {
                    if ((i2 & 32) == 0) {
                        vsi.a();
                        throw null;
                    }
                    if (this.G != null) {
                        this.D = W0();
                    } else {
                        this.D = X0();
                    }
                }
                this.z |= 8;
                return this.D;
            }
        }
        return W0();
    }

    public final long l1() {
        int i = this.z;
        if ((i & 2) == 0) {
            if (i == 0) {
                b1(2);
            }
            int i2 = this.z;
            if ((i2 & 2) == 0) {
                if ((i2 & 1) != 0) {
                    this.B = this.A;
                } else if ((i2 & 4) != 0) {
                    BigInteger bigIntegerV0 = V0();
                    if (pmc.f.compareTo(bigIntegerV0) > 0 || pmc.g.compareTo(bigIntegerV0) < 0) {
                        P0(y());
                        throw null;
                    }
                    this.B = bigIntegerV0.longValue();
                } else if ((i2 & 8) != 0) {
                    double dW0 = W0();
                    if (dW0 < -9.223372036854776E18d || dW0 > 9.223372036854776E18d) {
                        P0(y());
                        throw null;
                    }
                    this.B = (long) dW0;
                } else {
                    if ((i2 & 16) == 0) {
                        vsi.a();
                        throw null;
                    }
                    BigDecimal bigDecimalU0 = U0();
                    if (pmc.h.compareTo(bigDecimalU0) > 0 || pmc.i.compareTo(bigDecimalU0) < 0) {
                        P0(y());
                        throw null;
                    }
                    this.B = bigDecimalU0.longValue();
                }
                this.z |= 2;
            }
        }
        return this.B;
    }

    public final int m1() {
        if (this.z == 0) {
            b1(0);
        }
        cv8 cv8Var = this.b;
        cv8 cv8Var2 = cv8.VALUE_NUMBER_INT;
        int i = this.z;
        if (cv8Var == cv8Var2) {
            if ((i & 1) != 0) {
                return 1;
            }
            return (i & 2) != 0 ? 2 : 3;
        }
        if ((i & 16) != 0) {
            return 6;
        }
        return (i & 32) != 0 ? 4 : 5;
    }

    public final Number n1() {
        if (this.z == 0) {
            b1(0);
        }
        cv8 cv8Var = this.b;
        cv8 cv8Var2 = cv8.VALUE_NUMBER_INT;
        int i = this.z;
        if (cv8Var == cv8Var2) {
            if ((i & 1) != 0) {
                return Integer.valueOf(this.A);
            }
            if ((i & 2) != 0) {
                return Long.valueOf(this.B);
            }
            if ((i & 4) != 0) {
                return V0();
            }
            vsi.a();
            throw null;
        }
        if ((i & 16) != 0) {
            return U0();
        }
        if ((i & 32) != 0) {
            return Float.valueOf(X0());
        }
        if ((i & 8) != 0) {
            return Double.valueOf(W0());
        }
        vsi.a();
        throw null;
    }

    public final cv8 o1(String str, double d) throws StreamConstraintsException {
        f8e f8eVar = this.w;
        f8eVar.b = null;
        f8eVar.c = -1;
        f8eVar.d = 0;
        f8eVar.o(str.length());
        f8eVar.j = str;
        f8eVar.k = null;
        if (f8eVar.f) {
            f8eVar.c();
        }
        f8eVar.i = 0;
        this.D = d;
        this.z = 8;
        this.G = null;
        return cv8.VALUE_NUMBER_FLOAT;
    }

    public final cv8 p1(int i, int i2, int i3, boolean z) {
        int i4 = i2 + i + i3;
        if (i4 > 1000) {
            sa6.b("Number value length (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i4), 1000, sa6.a("getMaxNumberLength"));
            throw null;
        }
        this.H = z;
        this.I = i;
        this.z = 0;
        this.G = null;
        return cv8.VALUE_NUMBER_FLOAT;
    }

    public final cv8 q1(int i, boolean z) {
        if (i > 1000) {
            sa6.b("Number value length (%d) exceeds the maximum allowed (%d, from %s)", Integer.valueOf(i), 1000, sa6.a("getMaxNumberLength"));
            throw null;
        }
        this.H = z;
        this.I = i;
        this.z = 0;
        this.G = null;
        return cv8.VALUE_NUMBER_INT;
    }
}
