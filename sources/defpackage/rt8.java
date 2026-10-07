package defpackage;

import com.fasterxml.jackson.core.JsonGenerationException;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rt8 implements Closeable, Flushable {
    static {
        sa6.c(w4h.values());
        w4h.CAN_WRITE_FORMATTED_NUMBERS.h();
        w4h.CAN_WRITE_BINARY_NATIVELY.h();
    }

    public static void A(String str) throws JsonGenerationException {
        throw new JsonGenerationException(str, null, null);
    }

    public abstract void E(boolean z);

    public abstract void I();

    public abstract void K();

    public abstract void P(String str);

    public abstract void W();

    public abstract void Y();

    public final void b(ju8 ju8Var) throws IOException {
        int i = 1;
        while (true) {
            cv8 cv8VarP = ju8Var.P();
            if (cv8VarP == null) {
                return;
            }
            switch (cv8VarP.d) {
                case 1:
                    Y();
                    break;
                case 2:
                    K();
                    i--;
                    if (i != 0) {
                        continue;
                    } else {
                        return;
                    }
                    break;
                case 3:
                    W();
                    break;
                case 4:
                    I();
                    i--;
                    if (i != 0) {
                        continue;
                    } else {
                        return;
                    }
                    break;
                case 5:
                    P(ju8Var.j1());
                    continue;
                case 6:
                    y(ju8Var);
                    continue;
                case 7:
                    l(ju8Var);
                    continue;
                case 8:
                    g(ju8Var);
                    continue;
                case 9:
                    E(true);
                    continue;
                case 10:
                    E(false);
                    continue;
                case 11:
                    x0k x0kVar = (x0k) this;
                    x0kVar.D0("write a null");
                    x0kVar.I0();
                    continue;
                case 12:
                    x0k x0kVar2 = (x0k) ((pj7) this);
                    x0kVar2.D0("write a null");
                    x0kVar2.I0();
                    continue;
                default:
                    c.q(cv8VarP, "Internal error: unknown current token, ");
                    return;
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:76:0x010f  */
    public final void g(ju8 ju8Var) {
        float fX0;
        BigDecimal bigDecimalU0;
        int iM1 = ju8Var.m1();
        if (iM1 == 6) {
            int i = ju8Var.z;
            if ((i & 16) != 0) {
                bigDecimalU0 = ju8Var.U0();
            } else {
                if (i == 0) {
                    ju8Var.b1(16);
                }
                int i2 = ju8Var.z;
                if ((i2 & 16) == 0) {
                    if ((i2 & 8) != 0) {
                        String strY = ju8Var.G;
                        if (strY == null) {
                            strY = ju8Var.y();
                        }
                        ju8Var.F = kpb.a(strY, ju8Var.K(n4h.USE_FAST_BIG_NUMBER_PARSER));
                    } else if ((i2 & 4) != 0) {
                        ju8Var.F = new BigDecimal(ju8Var.V0());
                    } else if ((i2 & 2) != 0) {
                        ju8Var.F = BigDecimal.valueOf(ju8Var.B);
                    } else {
                        if ((i2 & 1) == 0) {
                            vsi.a();
                            throw null;
                        }
                        ju8Var.F = BigDecimal.valueOf(ju8Var.A);
                    }
                    ju8Var.z |= 16;
                    bigDecimalU0 = ju8Var.F;
                } else {
                    bigDecimalU0 = ju8Var.U0();
                }
            }
            x0k x0kVar = (x0k) this;
            x0kVar.D0("write a number");
            if (bigDecimalU0 == null) {
                x0kVar.I0();
                return;
            } else if (x0kVar.c) {
                x0kVar.P0(x0kVar.o0(bigDecimalU0));
                return;
            } else {
                x0kVar.S0(x0kVar.o0(bigDecimalU0));
                return;
            }
        }
        if (iM1 != 4) {
            double dK1 = ju8Var.k1();
            x0k x0kVar2 = (x0k) this;
            if (!x0kVar2.c) {
                String str = lpb.a;
                if (Double.isFinite(dK1) || !x0kVar2.r0(qt8.QUOTE_NON_NUMERIC_NUMBERS)) {
                    x0kVar2.D0("write a number");
                    x0kVar2.S0(lpb.g(dK1, x0kVar2.r0(qt8.USE_FAST_DOUBLE_WRITER)));
                    return;
                }
            }
            x0kVar2.k0(lpb.g(dK1, x0kVar2.r0(qt8.USE_FAST_DOUBLE_WRITER)));
            return;
        }
        int i3 = ju8Var.z;
        if ((i3 & 32) != 0) {
            fX0 = ju8Var.X0();
        } else {
            if (i3 == 0) {
                ju8Var.b1(32);
            }
            int i4 = ju8Var.z;
            if ((i4 & 32) == 0) {
                if ((i4 & 16) != 0) {
                    if (ju8Var.G != null) {
                        ju8Var.C = ju8Var.X0();
                    } else {
                        ju8Var.C = ju8Var.U0().floatValue();
                    }
                } else if ((i4 & 4) != 0) {
                    if (ju8Var.G != null) {
                        ju8Var.C = ju8Var.X0();
                    } else {
                        ju8Var.C = ju8Var.V0().floatValue();
                    }
                } else if ((i4 & 2) != 0) {
                    ju8Var.C = ju8Var.B;
                } else if ((i4 & 1) != 0) {
                    ju8Var.C = ju8Var.A;
                } else {
                    if ((i4 & 8) == 0) {
                        vsi.a();
                        throw null;
                    }
                    if (ju8Var.G != null) {
                        ju8Var.C = ju8Var.X0();
                    } else {
                        ju8Var.C = (float) ju8Var.W0();
                    }
                }
                ju8Var.z |= 32;
                fX0 = ju8Var.C;
            } else {
                fX0 = ju8Var.X0();
            }
        }
        x0k x0kVar3 = (x0k) this;
        if (!x0kVar3.c) {
            String str2 = lpb.a;
            if (Float.isFinite(fX0) || !x0kVar3.r0(qt8.QUOTE_NON_NUMERIC_NUMBERS)) {
                x0kVar3.D0("write a number");
                x0kVar3.S0(lpb.h(fX0, x0kVar3.r0(qt8.USE_FAST_DOUBLE_WRITER)));
                return;
            }
        }
        x0kVar3.k0(lpb.h(fX0, x0kVar3.r0(qt8.USE_FAST_DOUBLE_WRITER)));
    }

    public abstract void k0(String str);

    /* JADX WARN: Code duplicated, block: B:74:0x013c  */
    public final void l(ju8 ju8Var) {
        BigInteger bigIntegerV0;
        int iE;
        int iM1 = ju8Var.m1();
        if (iM1 == 1) {
            int i = ju8Var.z;
            int i2 = i & 1;
            if (i2 != 0) {
                iE = ju8Var.A;
            } else if (i != 0) {
                if (i2 == 0) {
                    ju8Var.g1();
                }
                iE = ju8Var.A;
            } else {
                if (ju8Var.m) {
                    ju8Var.t0("Internal error: _parseNumericValue called when parser instance closed");
                    throw null;
                }
                if (ju8Var.b != cv8.VALUE_NUMBER_INT || ju8Var.I > 9) {
                    ju8Var.b1(1);
                    if ((ju8Var.z & 1) == 0) {
                        ju8Var.g1();
                    }
                    iE = ju8Var.A;
                } else {
                    iE = ju8Var.w.e(ju8Var.H);
                    ju8Var.A = iE;
                    ju8Var.z = 1;
                }
            }
            x0k x0kVar = (x0k) this;
            x0kVar.D0("write a number");
            boolean z = x0kVar.c;
            int i3 = x0kVar.r;
            if (!z) {
                if (x0kVar.q + 11 >= i3) {
                    x0kVar.v0();
                }
                x0kVar.q = lpb.e(x0kVar.o, iE, x0kVar.q);
                return;
            }
            if (x0kVar.q + 13 >= i3) {
                x0kVar.v0();
            }
            char[] cArr = x0kVar.o;
            int i4 = x0kVar.q;
            int i5 = i4 + 1;
            x0kVar.q = i5;
            char c = x0kVar.n;
            cArr[i4] = c;
            int iE2 = lpb.e(cArr, iE, i5);
            char[] cArr2 = x0kVar.o;
            x0kVar.q = iE2 + 1;
            cArr2[iE2] = c;
            return;
        }
        if (iM1 == 2) {
            long jL1 = ju8Var.l1();
            x0k x0kVar2 = (x0k) this;
            x0kVar2.D0("write a number");
            boolean z2 = x0kVar2.c;
            int i6 = x0kVar2.r;
            if (!z2) {
                if (x0kVar2.q + 21 >= i6) {
                    x0kVar2.v0();
                }
                x0kVar2.q = lpb.f(jL1, x0kVar2.o, x0kVar2.q);
                return;
            }
            if (x0kVar2.q + 23 >= i6) {
                x0kVar2.v0();
            }
            char[] cArr3 = x0kVar2.o;
            int i7 = x0kVar2.q;
            int i8 = i7 + 1;
            x0kVar2.q = i8;
            char c2 = x0kVar2.n;
            cArr3[i7] = c2;
            int iF = lpb.f(jL1, cArr3, i8);
            char[] cArr4 = x0kVar2.o;
            x0kVar2.q = iF + 1;
            cArr4[iF] = c2;
            return;
        }
        int i9 = ju8Var.z;
        if ((i9 & 4) != 0) {
            bigIntegerV0 = ju8Var.V0();
        } else {
            if (i9 == 0) {
                ju8Var.b1(4);
            }
            int i10 = ju8Var.z;
            if ((i10 & 4) == 0) {
                if ((i10 & 16) != 0) {
                    ju8Var.E = ju8Var.T0(ju8Var.U0());
                } else if ((i10 & 2) != 0) {
                    ju8Var.E = BigInteger.valueOf(ju8Var.B);
                } else if ((i10 & 1) != 0) {
                    ju8Var.E = BigInteger.valueOf(ju8Var.A);
                } else {
                    if ((i10 & 8) == 0) {
                        vsi.a();
                        throw null;
                    }
                    if (ju8Var.G != null) {
                        ju8Var.E = ju8Var.T0(ju8Var.U0());
                    } else {
                        ju8Var.E = ju8Var.T0(BigDecimal.valueOf(ju8Var.W0()));
                    }
                }
                ju8Var.z |= 4;
                bigIntegerV0 = ju8Var.E;
            } else {
                bigIntegerV0 = ju8Var.V0();
            }
        }
        x0k x0kVar3 = (x0k) this;
        x0kVar3.D0("write a number");
        if (bigIntegerV0 == null) {
            x0kVar3.I0();
        } else if (x0kVar3.c) {
            x0kVar3.P0(bigIntegerV0.toString());
        } else {
            x0kVar3.S0(bigIntegerV0.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[PHI: r4
  0x0061: PHI (r4v6 int) = (r4v3 int), (r4v7 int) binds: [B:23:0x005d, B:21:0x005a] A[DONT_GENERATE, DONT_INLINE]] */
    public final void y(ju8 ju8Var) throws IOException {
        boolean z;
        char c;
        cv8 cv8Var = ju8Var.b;
        int i = 0;
        if (cv8Var == cv8.VALUE_STRING) {
            z = true;
        } else {
            z = cv8Var == cv8.FIELD_NAME ? ju8Var.y : false;
        }
        if (!z) {
            k0(ju8Var.y());
            return;
        }
        char[] cArrA = ju8Var.A();
        int I = ju8Var.I();
        int iE = ju8Var.E();
        x0k x0kVar = (x0k) this;
        x0kVar.D0("write a string");
        int i2 = x0kVar.q;
        int i3 = x0kVar.r;
        if (i2 >= i3) {
            x0kVar.v0();
        }
        char[] cArr = x0kVar.o;
        int i4 = x0kVar.q;
        x0kVar.q = i4 + 1;
        char c2 = x0kVar.n;
        cArr[i4] = c2;
        int[] iArr = x0kVar.g;
        CharArrayWriter charArrayWriter = x0kVar.m;
        int i5 = 32;
        int i6 = x0kVar.h;
        if (i6 != 0) {
            int i7 = iE + I;
            int iMin = Math.min(iArr.length, i6 + 1);
            while (I < i7) {
                int i8 = I;
                do {
                    c = cArrA[i8];
                    if (c < iMin) {
                        i = iArr[c];
                        if (i != 0) {
                            break;
                        } else {
                            i8++;
                        }
                    } else {
                        if (c > i6) {
                            i = -1;
                            break;
                        }
                        i8++;
                    }
                } while (i8 < i7);
                int i9 = i8 - I;
                if (i9 < i5) {
                    if (x0kVar.q + i9 > i3) {
                        x0kVar.v0();
                    }
                    if (i9 > 0) {
                        System.arraycopy(cArrA, I, x0kVar.o, x0kVar.q, i9);
                        x0kVar.q += i9;
                    }
                } else {
                    x0kVar.v0();
                    charArrayWriter.write(cArrA, I, i9);
                }
                if (i8 >= i7) {
                    break;
                }
                I = i8 + 1;
                x0kVar.u0(c, i);
                i5 = 32;
            }
        } else {
            int i10 = iE + I;
            int length = iArr.length;
            while (I < i10) {
                int i11 = I;
                do {
                    char c3 = cArrA[i11];
                    if (c3 < length && iArr[c3] != 0) {
                        break;
                    } else {
                        i11++;
                    }
                } while (i11 < i10);
                int i12 = i11 - I;
                if (i12 < 32) {
                    if (x0kVar.q + i12 > i3) {
                        x0kVar.v0();
                    }
                    if (i12 > 0) {
                        System.arraycopy(cArrA, I, x0kVar.o, x0kVar.q, i12);
                        x0kVar.q += i12;
                    }
                } else {
                    x0kVar.v0();
                    charArrayWriter.write(cArrA, I, i12);
                }
                if (i11 >= i10) {
                    break;
                }
                I = i11 + 1;
                char c4 = cArrA[i11];
                x0kVar.u0(c4, iArr[c4]);
            }
        }
        if (x0kVar.q >= i3) {
            x0kVar.v0();
        }
        char[] cArr2 = x0kVar.o;
        int i13 = x0kVar.q;
        x0kVar.q = i13 + 1;
        cArr2[i13] = c2;
    }
}
