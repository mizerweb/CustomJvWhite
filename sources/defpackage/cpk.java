package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cpk {
    public static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static void a() {
        li9 li9Var = li9.d;
    }

    public static boolean b(int i, boolean z) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z) {
            return true;
        }
        for (int i2 = 0; i2 < 29; i2++) {
            if (a[i2] == i) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x016d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0170 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:94:0x0161  */
    /* JADX WARN: Code duplicated, block: B:96:0x0164  */
    /* JADX WARN: Code duplicated, block: B:98:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x016a  */
    /* JADX WARN: Multi-variable type inference failed */
    public static mcg c(kj6 kj6Var, boolean z, boolean z2) {
        mcg mcgVar;
        int i;
        long jU;
        int i2;
        long j;
        int i3;
        int[] iArr;
        long length = kj6Var.getLength();
        long j2 = -1;
        int i4 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j3 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        if (i4 != 0 && length <= PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j3 = length;
        }
        int i5 = (int) j3;
        nmc nmcVar = new nmc(64);
        int i6 = 0;
        int i7 = 0;
        boolean z3 = false;
        while (true) {
            if (i7 < i5) {
                nmcVar.K(8);
                boolean z4 = true;
                if (kj6Var.m(nmcVar.a, i6, 8, true)) {
                    long jC = nmcVar.C();
                    int iM = nmcVar.m();
                    if (jC == 1) {
                        j2 = j2;
                        kj6Var.u(8, nmcVar.a, 8);
                        i2 = 16;
                        nmcVar.M(16);
                        jU = nmcVar.u();
                    } else {
                        j2 = j2;
                        if (jC == 0) {
                            long length2 = kj6Var.getLength();
                            if (length2 != j2) {
                                jC = (length2 - kj6Var.y()) + 8;
                            }
                        }
                        jU = jC;
                        i2 = 8;
                    }
                    long j4 = i2;
                    if (jU < j4) {
                        mcgVar = null;
                        if (iM != 1718773093 || i2 != 8) {
                            return new a40(iM, i2, jU);
                        }
                        jU = j4;
                    } else {
                        mcgVar = null;
                    }
                    int i8 = i7 + i2;
                    if (iM == 1836019574) {
                        i5 += (int) jU;
                        if (i4 != 0 && i5 > length) {
                            i5 = (int) length;
                        }
                        i7 = i8;
                        i6 = 0;
                    } else {
                        if (iM == 1953653099 || iM == 1835297121 || iM == 1835626086) {
                            j = length;
                            i3 = 0;
                            i7 = i8;
                        } else if (iM == 1836019558 || iM == 1836475768) {
                            i = 1;
                        } else {
                            if (iM == 1835295092) {
                                z3 = true;
                            }
                            if (iM != 1937007212 || jU <= 1000000) {
                                j = length;
                                if ((((long) i8) + jU) - j4 < i5) {
                                    int i9 = (int) (jU - j4);
                                    i7 = i8 + i9;
                                    if (iM != 1718909296) {
                                        i3 = 0;
                                        if (i9 != 0) {
                                            kj6Var.z(i9);
                                        }
                                    } else {
                                        if (i9 < 8) {
                                            return new a40(iM, 8, i9);
                                        }
                                        nmcVar.K(i9);
                                        i3 = 0;
                                        kj6Var.u(0, nmcVar.a, i9);
                                        int iM2 = nmcVar.m();
                                        if (b(iM2, z2)) {
                                            z3 = true;
                                        }
                                        nmcVar.O(4);
                                        int iA = nmcVar.a() / 4;
                                        if (!z3 && iA > 0) {
                                            iArr = new int[iA];
                                            int i10 = 0;
                                            while (true) {
                                                if (i10 >= iA) {
                                                    z4 = z3;
                                                    break;
                                                }
                                                int iM3 = nmcVar.m();
                                                iArr[i10] = iM3;
                                                if (b(iM3, z2)) {
                                                    break;
                                                }
                                                i10++;
                                            }
                                        } else {
                                            z4 = z3;
                                            iArr = mcgVar;
                                        }
                                        if (!z4) {
                                            return new mf(iM2, iArr);
                                        }
                                        z3 = z4;
                                    }
                                }
                            }
                            i = 0;
                        }
                        i6 = i3;
                        length = j;
                    }
                }
                if (!z3) {
                    return ou7.i;
                }
                if (z != i) {
                    return i != 0 ? sc8.c : sc8.d;
                }
                return mcgVar;
            }
            mcgVar = null;
            i = i6;
            if (!z3) {
                return ou7.i;
            }
            if (z != i) {
                if (i != 0) {
                }
            }
            return mcgVar;
        }
    }
}
