package defpackage;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ip6 {
    public static final double a = Math.cos(0.7853981633974483d);
    public static final double b = Math.sin(0.7853981633974483d);
    public static volatile jrc[] c = new jrc[20];
    public static volatile jrc[] d = new jrc[20];

    public static int a(int i) {
        if (i <= 9728) {
            return 19;
        }
        if (i <= 18432) {
            return 18;
        }
        if (i <= 69632) {
            return 17;
        }
        if (i <= 262144) {
            return 16;
        }
        if (i <= 983040) {
            return 15;
        }
        if (i <= 3670016) {
            return 14;
        }
        if (i <= 13631488) {
            return 13;
        }
        if (i <= 25165824) {
            return 12;
        }
        if (i <= 92274688) {
            return 11;
        }
        if (i <= 335544320) {
            return 10;
        }
        return i <= 1207959552 ? 9 : 8;
    }

    public static jrc b(int i) {
        if (i == 1) {
            jrc jrcVar = new jrc(1);
            jrcVar.y(0, 1.0d);
            jrcVar.p(0, 0.0d);
            return jrcVar;
        }
        jrc jrcVar2 = new jrc(i);
        jrcVar2.B(1.0d, 0.0d, 0);
        int i2 = i / 2;
        jrcVar2.B(a, b, i2);
        double d2 = 1.5707963267948966d / ((double) i);
        int i3 = 1;
        while (i3 < i2) {
            double d3 = ((double) i3) * d2;
            double dCos = Math.cos(d3);
            double dSin = Math.sin(d3);
            jrcVar2.B(dCos, dSin, i3);
            int i4 = i3;
            jrcVar2.B(dSin, dCos, i - i4);
            i3 = i4 + 1;
        }
        return jrcVar2;
    }

    public static void c(jrc jrcVar, jrc[] jrcVarArr) {
        int i = jrcVar.b;
        double[] dArr = (double[]) jrcVar.d;
        int iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i);
        while (iNumberOfLeadingZeros >= 2) {
            jrc jrcVar2 = jrcVarArr[iNumberOfLeadingZeros - 2];
            int i2 = 1 << iNumberOfLeadingZeros;
            int i3 = 0;
            while (i3 < i) {
                int i4 = 0;
                while (true) {
                    int i5 = i2 / 4;
                    if (i4 < i5) {
                        double dX = jrcVar2.x(i4);
                        double dO = jrcVar2.o(i4);
                        double d2 = (dX * dX) + ((-dO) * dO);
                        double d3 = 2.0d * dX * dO;
                        int i6 = i3 + i4;
                        int i7 = i5 + i6;
                        double[] dArr2 = dArr;
                        int i8 = (i2 / 2) + i6;
                        int i9 = iNumberOfLeadingZeros;
                        int i10 = ((i2 * 3) / 4) + i6;
                        double dX2 = jrcVar.x(i7) + dArr2[jrcVar.z(i6)];
                        double dO2 = jrcVar.o(i7) + dArr2[jrcVar.q(i6)];
                        double dX3 = jrcVar.x(i8) + dX2;
                        double dO3 = jrcVar.o(i8) + dO2;
                        jrc jrcVar3 = jrcVar2;
                        double dX4 = jrcVar.x(i10) + dX3;
                        int i11 = i3;
                        double dO4 = jrcVar.o(i10) + dO3;
                        double dO5 = jrcVar.o(i7) + dArr2[jrcVar.z(i6)];
                        double dX5 = dArr2[jrcVar.q(i6)] - jrcVar.x(i7);
                        double dX6 = dO5 - jrcVar.x(i8);
                        double dO6 = dX5 - jrcVar.o(i8);
                        double dO7 = dX6 - jrcVar.o(i10);
                        double dX7 = jrcVar.x(i10) + dO6;
                        double d4 = (dO7 * dX) + (dX7 * dO);
                        double d5 = ((-dO7) * dO) + (dX7 * dX);
                        double dX8 = dArr2[jrcVar.z(i6)] - jrcVar.x(i7);
                        double dO8 = dArr2[jrcVar.q(i6)] - jrcVar.o(i7);
                        double dX9 = jrcVar.x(i8) + dX8;
                        double dO9 = jrcVar.o(i8) + dO8;
                        double dX10 = dX9 - jrcVar.x(i10);
                        double dO10 = dO9 - jrcVar.o(i10);
                        double d6 = (dX10 * d2) + (dO10 * d3);
                        double d7 = ((-dX10) * d3) + (dO10 * d2);
                        double dO11 = dArr2[jrcVar.z(i6)] - jrcVar.o(i7);
                        double dX11 = jrcVar.x(i7) + dArr2[jrcVar.q(i6)];
                        double dX12 = dO11 - jrcVar.x(i8);
                        double dO12 = dX11 - jrcVar.o(i8);
                        double dO13 = jrcVar.o(i10) + dX12;
                        double dX13 = dO12 - jrcVar.x(i10);
                        int i12 = i;
                        jrcVar.y(i6, dX4);
                        jrcVar.p(i6, dO4);
                        jrcVar.y(i7, d4);
                        jrcVar.p(i7, d5);
                        jrcVar.y(i8, d6);
                        jrcVar.p(i8, d7);
                        jrcVar.y(i10, (dO13 * dX) + ((-dX13) * dO));
                        jrcVar.p(i10, (dO13 * dO) + (dX13 * dX));
                        i4++;
                        i = i12;
                        jrcVar2 = jrcVar3;
                        dArr = dArr2;
                        iNumberOfLeadingZeros = i9;
                        i3 = i11;
                        i2 = i2;
                    }
                }
                i3 += i2;
            }
            iNumberOfLeadingZeros -= 2;
        }
        int i13 = i;
        double[] dArr3 = dArr;
        if (iNumberOfLeadingZeros > 0) {
            for (int i14 = 0; i14 < i13; i14 += 2) {
                double d8 = dArr3[jrcVar.z(i14)];
                double d9 = dArr3[jrcVar.q(i14)];
                int i15 = i14 + 1;
                double d10 = dArr3[jrcVar.z(i15)];
                double d11 = dArr3[jrcVar.q(i15)];
                int iZ = jrcVar.z(i14);
                dArr3[iZ] = dArr3[iZ] + d10;
                int iQ = jrcVar.q(i14);
                dArr3[iQ] = dArr3[iQ] + d11;
                jrcVar.y(i15, d8 - d10);
                jrcVar.p(i15, d9 - d11);
            }
        }
    }

    public static void d(jrc jrcVar, jrc jrcVar2, jrc jrcVar3, int i, double d2) {
        double dSqrt = Math.sqrt(3.0d) * ((double) i) * (-0.5d);
        for (int i2 = 0; i2 < jrcVar.b; i2++) {
            double dX = jrcVar3.x(i2) + jrcVar2.x(i2) + jrcVar.x(i2);
            double dO = jrcVar3.o(i2) + jrcVar2.o(i2) + jrcVar.o(i2);
            double dO2 = (jrcVar3.o(i2) - jrcVar2.o(i2)) * dSqrt;
            double dX2 = (jrcVar2.x(i2) - jrcVar3.x(i2)) * dSqrt;
            double dX3 = (jrcVar3.x(i2) + jrcVar2.x(i2)) * 0.5d;
            double dO3 = (jrcVar3.o(i2) + jrcVar2.o(i2)) * 0.5d;
            double dX4 = (jrcVar.x(i2) - dX3) + dO2;
            double dO4 = (jrcVar.o(i2) + dX2) - dO3;
            double dX5 = (jrcVar.x(i2) - dX3) - dO2;
            double dO5 = (jrcVar.o(i2) - dX2) - dO3;
            jrcVar.y(i2, dX * d2);
            jrcVar.p(i2, dO * d2);
            jrcVar2.y(i2, dX4 * d2);
            jrcVar2.p(i2, dO4 * d2);
            jrcVar3.y(i2, dX5 * d2);
            jrcVar3.p(i2, dO5 * d2);
        }
    }

    public static void e(jrc jrcVar, jrc[] jrcVarArr, jrc jrcVar2) {
        int i;
        int i2 = jrcVar.b;
        int i3 = i2 / 3;
        int i4 = 0;
        jrc jrcVar3 = new jrc(jrcVar, 0, i3);
        int i5 = i3 * 2;
        jrc jrcVar4 = new jrc(jrcVar, i3, i5);
        jrc jrcVar5 = new jrc(jrcVar, i5, i2);
        d(jrcVar3, jrcVar4, jrcVar5, 1, 1.0d);
        hp6 hp6Var = new hp6();
        while (true) {
            i = i2 / 4;
            if (i4 >= i) {
                break;
            }
            hp6Var.a = jrcVar2.x(i4);
            hp6Var.b = jrcVar2.o(i4);
            jrcVar4.t(i4, hp6Var);
            jrcVar5.t(i4, hp6Var);
            jrcVar5.t(i4, hp6Var);
            i4++;
        }
        for (int i6 = i; i6 < i3; i6++) {
            int i7 = i6 - i;
            hp6Var.a = jrcVar2.x(i7);
            hp6Var.b = jrcVar2.o(i7);
            jrcVar4.u(i6, hp6Var);
            jrcVar5.u(i6, hp6Var);
            jrcVar5.u(i6, hp6Var);
        }
        c(jrcVar3, jrcVarArr);
        c(jrcVar4, jrcVarArr);
        c(jrcVar5, jrcVarArr);
    }

    public static BigInteger f(jrc jrcVar, int i, int i2) {
        jrc jrcVar2 = jrcVar;
        int i3 = i2;
        long j = i3;
        int iMin = (int) Math.min(jrcVar2.b, (2147483648L / j) + 1);
        int i4 = (int) ((((((long) iMin) * j) + 31) * 8) / 32);
        byte[] bArr = new byte[i4];
        int i5 = 1;
        int i6 = (1 << i3) - 1;
        int i7 = 32 - i3;
        int i8 = (i4 * 8) - i3;
        int i9 = 0;
        int i10 = i4 - 4;
        int iMin2 = Math.min(Math.max(0, i8 >> 3), i10);
        long j2 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 <= i5) {
            int i13 = i9;
            while (i13 < iMin) {
                long jRound = Math.round(((double[]) jrcVar2.d)[(i13 << 1) + i11]) + j2;
                long j3 = jRound >> i3;
                int iMin3 = Math.min(Math.max(i9, i8 >> 3), i10);
                i12 = (int) (((jRound & ((long) i6)) << ((i7 - i8) + (iMin3 << 3))) | ((long) (i12 >>> ((iMin2 - iMin3) << 3))));
                bArr[iMin3] = (byte) (i12 >>> 24);
                bArr[iMin3 + 1] = (byte) (i12 >>> 16);
                bArr[iMin3 + 2] = (byte) (i12 >>> 8);
                bArr[iMin3 + 3] = (byte) i12;
                i8 -= i2;
                i13++;
                jrcVar2 = jrcVar;
                i3 = i2;
                iMin2 = iMin3;
                j2 = j3;
                i9 = 0;
            }
            i11++;
            jrcVar2 = jrcVar;
            i3 = i2;
            i5 = 1;
            i9 = 0;
        }
        return new BigInteger(i, bArr);
    }

    public static jrc[] g(int i) {
        jrc[] jrcVarArr = new jrc[i + 1];
        while (i >= 0) {
            if (i < 20) {
                if (c[i] == null) {
                    c[i] = b(1 << i);
                }
                jrcVarArr[i] = c[i];
            } else {
                jrcVarArr[i] = b(1 << i);
            }
            i -= 2;
        }
        return jrcVarArr;
    }

    public static jrc h(int i) {
        if (i >= 20) {
            return b(3 << i);
        }
        if (d[i] == null) {
            d[i] = b(3 << i);
        }
        return d[i];
    }

    public static void i(jrc jrcVar, jrc[] jrcVarArr) {
        int i;
        int i2 = jrcVar.b;
        double[] dArr = (double[]) jrcVar.d;
        int iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(i2);
        int i3 = 1;
        if (iNumberOfLeadingZeros % 2 != 0) {
            for (int i4 = 0; i4 < i2; i4 += 2) {
                int i5 = i4 + 1;
                double d2 = dArr[jrcVar.z(i5)];
                double d3 = dArr[jrcVar.q(i5)];
                double d4 = dArr[jrcVar.z(i4)];
                double d5 = dArr[jrcVar.q(i4)];
                int iZ = jrcVar.z(i4);
                dArr[iZ] = dArr[iZ] + d2;
                int iQ = jrcVar.q(i4);
                dArr[iQ] = dArr[iQ] + d3;
                jrcVar.y(i5, d4 - d2);
                jrcVar.p(i5, d5 - d3);
            }
            i = 2;
        } else {
            i = 1;
        }
        while (i <= iNumberOfLeadingZeros) {
            jrc jrcVar2 = jrcVarArr[i - 1];
            int i6 = i3 << (i + 1);
            int i7 = 0;
            while (i7 < i2) {
                int i8 = 0;
                while (true) {
                    int i9 = i6 / 4;
                    if (i8 < i9) {
                        double dX = jrcVar2.x(i8);
                        double dO = jrcVar2.o(i8);
                        double d6 = (dX * dX) + ((-dO) * dO);
                        double d7 = 2.0d * dX * dO;
                        double[] dArr2 = dArr;
                        int i10 = i7 + i8;
                        int i11 = i9 + i10;
                        int i12 = i;
                        int i13 = (i6 / 2) + i10;
                        int i14 = ((i6 * 3) / 4) + i10;
                        double d8 = dArr2[jrcVar.z(i10)];
                        double d9 = dArr2[jrcVar.q(i10)];
                        double d10 = dArr2[jrcVar.z(i11)];
                        double d11 = dArr2[jrcVar.q(i11)];
                        int i15 = i6;
                        double d12 = (d10 * dX) + ((-d11) * dO);
                        double d13 = (d10 * dO) + (d11 * dX);
                        double d14 = dArr2[jrcVar.z(i13)];
                        double d15 = dArr2[jrcVar.q(i13)];
                        double d16 = (d14 * d6) + ((-d15) * d7);
                        double d17 = (d14 * d7) + (d15 * d6);
                        double d18 = dArr2[jrcVar.z(i14)];
                        double d19 = dArr2[jrcVar.q(i14)];
                        double d20 = (d18 * dX) + (d19 * dO);
                        double d21 = ((-d18) * dO) + (d19 * dX);
                        double d22 = d9 + d13 + d17 + d21;
                        double d23 = (d9 + d12) - d17;
                        jrcVar.y(i10, d8 + d12 + d16 + d20);
                        jrcVar.p(i10, d22);
                        jrcVar.y(i11, ((d8 - d13) - d16) + d21);
                        jrcVar.p(i11, d23 - d20);
                        jrcVar.y(i13, ((d8 - d12) + d16) - d20);
                        jrcVar.p(i13, ((d9 - d13) + d17) - d21);
                        jrcVar.y(i14, ((d8 + d13) - d16) - d21);
                        jrcVar.p(i14, ((d9 - d12) - d17) + d20);
                        i8++;
                        dArr = dArr2;
                        jrcVar2 = jrcVar2;
                        i = i12;
                        i6 = i15;
                        i7 = i7;
                        iNumberOfLeadingZeros = iNumberOfLeadingZeros;
                    }
                }
                i7 += i6;
            }
            i += 2;
            i3 = 1;
        }
        double[] dArr3 = dArr;
        int i16 = iNumberOfLeadingZeros;
        for (int i17 = 0; i17 < i2; i17++) {
            int iZ2 = jrcVar.z(i17);
            int iQ2 = jrcVar.q(i17);
            double d24 = dArr3[iZ2];
            double d25 = dArr3[iQ2];
            long j = (((long) (-i16)) + 1023) << 52;
            dArr3[iZ2] = Double.longBitsToDouble(j) * d24;
            dArr3[iQ2] = Double.longBitsToDouble(j) * d25;
        }
    }

    public static void j(jrc jrcVar, jrc[] jrcVarArr, jrc jrcVar2) {
        int i;
        int i2 = jrcVar.b;
        int i3 = i2 / 3;
        jrc jrcVar3 = new jrc(jrcVar, 0, i3);
        int i4 = i3 * 2;
        jrc jrcVar4 = new jrc(jrcVar, i3, i4);
        int i5 = 0;
        jrc jrcVar5 = new jrc(jrcVar, i4, i2);
        i(jrcVar3, jrcVarArr);
        i(jrcVar4, jrcVarArr);
        i(jrcVar5, jrcVarArr);
        hp6 hp6Var = new hp6();
        while (true) {
            i = i2 / 4;
            if (i5 >= i) {
                break;
            }
            hp6Var.a = jrcVar2.x(i5);
            hp6Var.b = jrcVar2.o(i5);
            jrcVar4.r(i5, hp6Var);
            jrcVar5.r(i5, hp6Var);
            jrcVar5.r(i5, hp6Var);
            i5++;
        }
        for (int i6 = i; i6 < i3; i6++) {
            int i7 = i6 - i;
            hp6Var.a = jrcVar2.x(i7);
            hp6Var.b = jrcVar2.o(i7);
            jrcVar4.s(i6, hp6Var);
            jrcVar5.s(i6, hp6Var);
            jrcVar5.s(i6, hp6Var);
        }
        d(jrcVar3, jrcVar4, jrcVar5, -1, 0.3333333333333333d);
    }

    public static BigInteger k(BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger2.signum() == 0 || bigInteger.signum() == 0) {
            return BigInteger.ZERO;
        }
        if (bigInteger2 == bigInteger) {
            if (bigInteger2.signum() == 0) {
                return BigInteger.ZERO;
            }
            if (bigInteger2.bitLength() < 33220) {
                return bigInteger2.multiply(bigInteger2);
            }
            byte[] byteArray = bigInteger2.toByteArray();
            int length = byteArray.length * 8;
            int iA = a(length);
            int i = ((length + iA) - 1) / iA;
            int i2 = i + 1;
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
            int i3 = 32 - iNumberOfLeadingZeros;
            int i4 = 1 << i3;
            int i5 = (i4 * 3) / 4;
            if (i2 >= i5) {
                jrc jrcVarL = l(i4, byteArray, iA);
                jrc[] jrcVarArrG = g(i3);
                jrcVarL.l(jrcVarArrG[i3]);
                c(jrcVarL, jrcVarArrG);
                jrcVarL.C();
                i(jrcVarL, jrcVarArrG);
                jrcVarL.k(jrcVarArrG[i3]);
                return f(jrcVarL, 1, iA);
            }
            jrc jrcVarL2 = l(i5, byteArray, iA);
            int i6 = 30 - iNumberOfLeadingZeros;
            jrc[] jrcVarArrG2 = g(i6);
            jrc jrcVarH = h(i6);
            jrc jrcVarH2 = h(28 - iNumberOfLeadingZeros);
            jrcVarL2.l(jrcVarH);
            e(jrcVarL2, jrcVarArrG2, jrcVarH2);
            jrcVarL2.C();
            j(jrcVarL2, jrcVarArrG2, jrcVarH2);
            jrcVarL2.k(jrcVarH);
            return f(jrcVarL2, 1, iA);
        }
        int iBitLength = bigInteger.bitLength();
        int iBitLength2 = bigInteger2.bitLength();
        if (((long) iBitLength) + ((long) iBitLength2) > 2147483648L) {
            throw new ArithmeticException("BigInteger would overflow supported range");
        }
        if (iBitLength <= 1920 || iBitLength2 <= 1920 || (iBitLength <= 33220 && iBitLength2 <= 33220)) {
            return bigInteger.multiply(bigInteger2);
        }
        int iSignum = bigInteger2.signum() * bigInteger.signum();
        if (bigInteger.signum() < 0) {
            bigInteger = bigInteger.negate();
        }
        byte[] byteArray2 = bigInteger.toByteArray();
        if (bigInteger2.signum() < 0) {
            bigInteger2 = bigInteger2.negate();
        }
        byte[] byteArray3 = bigInteger2.toByteArray();
        int iMax = Math.max(byteArray2.length, byteArray3.length) * 8;
        int iA2 = a(iMax);
        int i7 = ((iMax + iA2) - 1) / iA2;
        int i8 = i7 + 1;
        int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(i7);
        int i9 = 32 - iNumberOfLeadingZeros2;
        int i10 = 1 << i9;
        int i11 = (i10 * 3) / 4;
        if (i8 >= i11 || i9 <= 3) {
            jrc[] jrcVarArrG3 = g(i9);
            jrc jrcVarL3 = l(i10, byteArray2, iA2);
            jrcVarL3.l(jrcVarArrG3[i9]);
            c(jrcVarL3, jrcVarArrG3);
            jrc jrcVarL4 = l(i10, byteArray3, iA2);
            jrcVarL4.l(jrcVarArrG3[i9]);
            c(jrcVarL4, jrcVarArrG3);
            jrcVarL3.v(jrcVarL4);
            i(jrcVarL3, jrcVarArrG3);
            jrcVarL3.k(jrcVarArrG3[i9]);
            return f(jrcVarL3, iSignum, iA2);
        }
        int i12 = 30 - iNumberOfLeadingZeros2;
        jrc[] jrcVarArrG4 = g(i12);
        jrc jrcVarH3 = h(i12);
        jrc jrcVarH4 = h(28 - iNumberOfLeadingZeros2);
        jrc jrcVarL5 = l(i11, byteArray2, iA2);
        jrcVarL5.l(jrcVarH3);
        e(jrcVarL5, jrcVarArrG4, jrcVarH4);
        jrc jrcVarL6 = l(i11, byteArray3, iA2);
        jrcVarL6.l(jrcVarH3);
        e(jrcVarL6, jrcVarArrG4, jrcVarH4);
        jrcVarL5.v(jrcVarL6);
        j(jrcVarL5, jrcVarArrG4, jrcVarH4);
        jrcVarL5.k(jrcVarH3);
        return f(jrcVarL5, iSignum, iA2);
    }

    public static jrc l(int i, byte[] bArr, int i2) {
        jrc jrcVar = new jrc(i);
        if (bArr.length < 4) {
            byte[] bArr2 = new byte[4];
            System.arraycopy(bArr, 0, bArr2, 4 - bArr.length, bArr.length);
            bArr = bArr2;
        }
        int i3 = 1 << i2;
        int i4 = i3 / 2;
        int i5 = i3 - 1;
        int i6 = 32 - i2;
        int length = (bArr.length * 8) - i2;
        int i7 = 0;
        int i8 = 0;
        while (length > (-i2)) {
            int iMin = Math.min(Math.max(0, length >> 3), bArr.length - 4);
            int i9 = ((((bArr[iMin + 3] & 255) | ((((bArr[iMin] & 255) << 24) | ((bArr[iMin + 1] & 255) << 16)) | ((bArr[iMin + 2] & 255) << 8))) >>> ((i6 - length) + (iMin << 3))) & i5) + i7;
            i7 = (i4 - i9) >>> 31;
            jrcVar.y(i8, i9 - ((-i7) & i3));
            i8++;
            length -= i2;
        }
        if (i7 > 0) {
            jrcVar.y(i8, i7);
        }
        return jrcVar;
    }
}
