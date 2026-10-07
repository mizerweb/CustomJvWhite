package defpackage;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final byte[] a = "0123456789abcdef".getBytes(pt2.a);

    public static final String a(long j, l31 l31Var) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (l31Var.y(j2) == 13) {
                String strK = l31Var.K(j2, pt2.a);
                l31Var.skip(2L);
                return strK;
            }
        }
        String strK2 = l31Var.K(j, pt2.a);
        l31Var.skip(1L);
        return strK2;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0095 A[LOOP:0: B:8:0x0019->B:49:0x0095, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x0094 A[SYNTHETIC] */
    public static final int b(l31 l31Var, chc chcVar, boolean z) {
        int i;
        int i2;
        int i3;
        fcf fcfVar;
        int i4;
        fcf fcfVar2 = l31Var.a;
        if (fcfVar2 == null) {
            return z ? -2 : -1;
        }
        byte[] bArr = fcfVar2.a;
        int i5 = fcfVar2.b;
        int i6 = fcfVar2.c;
        int[] iArr = chcVar.b;
        fcf fcfVar3 = fcfVar2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int i10 = iArr[i8];
            int i11 = i8 + 2;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (fcfVar3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            fcfVar3 = fcfVar3.f;
                            int i16 = fcfVar3.b;
                            byte[] bArr2 = fcfVar3.a;
                            i2 = fcfVar3.c;
                            if (fcfVar3 == fcfVar2) {
                                i3 = i16;
                                bArr = bArr2;
                                fcfVar3 = null;
                            } else {
                                i3 = i16;
                                bArr = bArr2;
                            }
                        } else {
                            i2 = i6;
                            i3 = i13;
                        }
                        if (i >= 0) {
                            return i;
                        }
                        int i17 = i2;
                        i8 = -i;
                        i5 = i3;
                        i6 = i17;
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i18 = (i10 * (-1)) + i11;
            while (true) {
                int i19 = i5 + 1;
                int i20 = i11 + 1;
                if ((bArr[i5] & 255) == iArr[i11]) {
                    boolean z2 = i20 == i18;
                    if (i19 == i6) {
                        fcf fcfVar4 = fcfVar3.f;
                        i3 = fcfVar4.b;
                        byte[] bArr3 = fcfVar4.a;
                        i4 = fcfVar4.c;
                        if (fcfVar4 != fcfVar2) {
                            fcfVar = fcfVar4;
                            bArr = bArr3;
                        } else {
                            if (!z2) {
                                break loop0;
                            }
                            bArr = bArr3;
                            fcfVar = null;
                        }
                    } else {
                        fcfVar = fcfVar3;
                        i4 = i6;
                        i3 = i19;
                    }
                    if (z2) {
                        i = iArr[i20];
                        int i21 = i4;
                        fcfVar3 = fcfVar;
                        i2 = i21;
                        break;
                    }
                    i5 = i3;
                    i6 = i4;
                    fcfVar3 = fcfVar;
                    i11 = i20;
                }
                return i7;
            }
            if (i >= 0) {
                return i;
            }
            int i110 = i2;
            i8 = -i;
            i5 = i3;
            i6 = i110;
        }
        if (z) {
            return -2;
        }
        return i7;
    }
}
