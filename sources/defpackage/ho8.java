package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ho8 extends h0 {
    public static BigDecimal f(int i, CharSequence charSequence) {
        int i2;
        char c;
        boolean z;
        int i3;
        int i4;
        long j;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z2;
        CharSequence charSequence2 = charSequence;
        int i9 = 0;
        char cA = h0.a(0, i, charSequence2);
        boolean z3 = true;
        boolean z4 = cA == '-';
        if (z4 || cA == '+') {
            cA = h0.a(1, i, charSequence2);
            if (cA == 0) {
                throw new NumberFormatException("illegal syntax");
            }
            i2 = 1;
        } else {
            i2 = 0;
        }
        int iMin = Math.min(i - 8, 1073741824);
        int i10 = i2;
        while (true) {
            c = '0';
            if (i10 >= iMin) {
                break;
            }
            boolean z5 = true;
            for (int i11 = 0; i11 < 8; i11++) {
                z5 &= '0' == charSequence2.charAt(i11 + i10);
            }
            if (!z5) {
                break;
            }
            i10 += 8;
        }
        while (i10 < i && charSequence2.charAt(i10) == '0') {
            i10++;
        }
        int i12 = i10;
        while (i12 < iMin) {
            boolean zB = true;
            for (int i13 = i9; i13 < 8; i13++) {
                zB &= kxl.b(charSequence2.charAt(i13 + i12));
            }
            if (!zB) {
                break;
            }
            i12 += 8;
            i9 = 0;
        }
        while (i12 < i) {
            cA = charSequence2.charAt(i12);
            if (!kxl.b(cA)) {
                break;
            }
            i12++;
        }
        if (cA == '.') {
            i3 = i12 + 1;
            while (true) {
                if (i3 >= iMin) {
                    z = z3;
                    break;
                }
                boolean z6 = z3;
                int i14 = 0;
                while (i14 < 8) {
                    boolean z7 = z3;
                    z6 &= '0' == charSequence2.charAt(i14 + i3) ? z7 : false;
                    i14++;
                    z3 = z7;
                }
                z = z3;
                if (!z6) {
                    break;
                }
                i3 += 8;
                z3 = z;
            }
            while (i3 < i && charSequence2.charAt(i3) == '0') {
                i3++;
            }
            int i15 = i3;
            while (i15 < iMin) {
                boolean zB2 = z;
                int i16 = 0;
                while (i16 < 8) {
                    zB2 &= kxl.b(charSequence2.charAt(i16 + i15));
                    i16++;
                    c = c;
                }
                char c2 = c;
                if (!zB2) {
                    break;
                }
                i15 += 8;
                c = c2;
            }
            while (i15 < i) {
                cA = charSequence2.charAt(i15);
                if (!kxl.b(cA)) {
                    break;
                }
                i15++;
            }
            int i17 = i12;
            i12 = i15;
            i4 = i17;
        } else {
            z = true;
            i3 = -1;
            i4 = -1;
        }
        long j2 = 0;
        if (i4 < 0) {
            i6 = i12 - i10;
            j = 0;
            i7 = i12;
            i5 = i7;
        } else {
            j = (i4 - i12) + 1;
            i5 = i4;
            i6 = i10 == i4 ? i12 - i3 : (i12 - i10) - 1;
            i7 = i3;
        }
        if ((cA | ' ') == 101) {
            int i18 = i12 + 1;
            char cA2 = h0.a(i18, i, charSequence2);
            boolean z8 = cA2 == '-' ? z : false;
            if (z8 || cA2 == '+') {
                i18 = i12 + 2;
                cA2 = h0.a(i18, i, charSequence2);
            }
            char cA3 = (char) (cA2 - '0');
            z2 = cA3 >= '\n' ? z : false;
            do {
                if (j2 < 2147483647L) {
                    j2 = (j2 * 10) + ((long) cA3);
                }
                i18++;
                charSequence2 = charSequence;
                cA3 = (char) (h0.a(i18, i, charSequence2) - '0');
            } while (cA3 < '\n');
            if (z8) {
                j2 = -j2;
            }
            j += j2;
            i8 = i18;
        } else {
            i8 = i12;
            z2 = false;
            i12 = i;
        }
        long j3 = j;
        h0.d(((i2 == i5 && i5 == i12) ? z : false) | z2, i8, i, i6, j3);
        return h(charSequence2, i10, i5, i7, i12, z4, (int) j3);
    }

    /* JADX WARN: Failed to calculate best type for var: r1v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v4 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static java.math.BigDecimal g(char[] r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ho8.g(char[], int, int):java.math.BigDecimal");
    }

    public static BigDecimal h(CharSequence charSequence, int i, int i2, int i3, int i4, boolean z, int i5) {
        BigInteger bigIntegerNegate;
        BigInteger bigIntegerB;
        int i6 = (i4 - i2) - 1;
        int i7 = i4 - i3;
        int i8 = i2 - i;
        TreeMap treeMapC = null;
        if (i8 <= 0) {
            bigIntegerNegate = BigInteger.ZERO;
        } else if (i8 > 400) {
            treeMapC = hl6.c();
            hl6.d(treeMapC, i, i2);
            bigIntegerNegate = yfl.c(charSequence, i, i2, treeMapC);
        } else {
            bigIntegerNegate = yfl.b(i, i2, charSequence);
        }
        if (i6 > 0) {
            if (i7 > 400) {
                if (treeMapC == null) {
                    treeMapC = hl6.c();
                }
                hl6.d(treeMapC, i3, i4);
                bigIntegerB = yfl.c(charSequence, i3, i4, treeMapC);
            } else {
                bigIntegerB = yfl.b(i3, i4, charSequence);
            }
            if (bigIntegerNegate.signum() != 0) {
                bigIntegerB = ip6.k(bigIntegerNegate, hl6.a(treeMapC, i6)).add(bigIntegerB);
            }
            bigIntegerNegate = bigIntegerB;
        }
        if (z) {
            bigIntegerNegate = bigIntegerNegate.negate();
        }
        return new BigDecimal(bigIntegerNegate, -i5);
    }

    public static BigDecimal i(char[] cArr, int i, int i2, int i3, int i4, boolean z, int i5) {
        BigInteger bigIntegerNegate;
        BigInteger bigIntegerB;
        int i6 = (i4 - i2) - 1;
        int i7 = i4 - i3;
        int i8 = i2 - i;
        TreeMap treeMapC = null;
        if (i8 <= 0) {
            bigIntegerNegate = BigInteger.ZERO;
        } else if (i8 > 400) {
            treeMapC = hl6.c();
            hl6.d(treeMapC, i, i2);
            bigIntegerNegate = vfl.c(cArr, i, i2, treeMapC);
        } else {
            bigIntegerNegate = vfl.b(cArr, i, i2);
        }
        if (i6 > 0) {
            if (i7 > 400) {
                if (treeMapC == null) {
                    treeMapC = hl6.c();
                }
                hl6.d(treeMapC, i3, i4);
                bigIntegerB = vfl.c(cArr, i3, i4, treeMapC);
            } else {
                bigIntegerB = vfl.b(cArr, i3, i4);
            }
            if (bigIntegerNegate.signum() != 0) {
                bigIntegerB = ip6.k(bigIntegerNegate, hl6.a(treeMapC, i6)).add(bigIntegerB);
            }
            bigIntegerNegate = bigIntegerB;
        }
        if (z) {
            bigIntegerNegate = bigIntegerNegate.negate();
        }
        return new BigDecimal(bigIntegerNegate, -i5);
    }
}
