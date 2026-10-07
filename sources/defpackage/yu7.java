package defpackage;

import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class yu7 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final int m;
    public final String n;
    public final ljf o;

    public yu7(List list, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, ljf ljfVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = f;
        this.m = i11;
        this.n = str;
        this.o = ljfVar;
    }

    public static yu7 a(nmc nmcVar, boolean z, ljf ljfVar) {
        boolean z2;
        ww6 ww6VarK;
        int i = 4;
        try {
            if (z) {
                nmcVar.O(4);
            } else {
                nmcVar.O(21);
            }
            int iA = nmcVar.A() & 3;
            int iA2 = nmcVar.A();
            int i2 = nmcVar.b;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                z2 = true;
                if (i4 >= iA2) {
                    break;
                }
                nmcVar.O(1);
                int iH = nmcVar.H();
                for (int i6 = 0; i6 < iH; i6++) {
                    int iH2 = nmcVar.H();
                    i5 += iH2 + 4;
                    nmcVar.O(iH2);
                }
                i4++;
            }
            nmcVar.N(i2);
            byte[] bArr = new byte[i5];
            ljf ljfVar2 = ljfVar;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            float f = 1.0f;
            String strA = null;
            int i17 = 0;
            int i18 = 0;
            while (i17 < iA2) {
                int iA3 = nmcVar.A() & 63;
                int iH3 = nmcVar.H();
                int i19 = i3;
                ljf ljfVarM = ljfVar2;
                while (i19 < iH3) {
                    boolean z3 = z2;
                    int iH4 = nmcVar.H();
                    int i20 = iA;
                    System.arraycopy(xsg.a, i3, bArr, i18, i);
                    int i21 = i18 + 4;
                    System.arraycopy(nmcVar.a, nmcVar.b, bArr, i21, iH4);
                    if (iA3 == 32 && i19 == 0) {
                        ljfVarM = xsg.m(i21, bArr, i21 + iH4);
                    } else {
                        if (iA3 == 33 && i19 == 0) {
                            lab labVarL = xsg.l(bArr, i21, i21 + iH4, ljfVarM);
                            i7 = labVarL.a + 1;
                            i8 = labVarL.h;
                            int i22 = labVarL.i;
                            i10 = labVarL.d + 8;
                            i11 = labVarL.e + 8;
                            int i23 = labVarL.l;
                            i9 = i22;
                            int i24 = labVarL.m;
                            int i25 = labVarL.n;
                            float f2 = labVarL.j;
                            int i26 = labVarL.k;
                            jab jabVar = labVarL.b;
                            if (jabVar != null) {
                                strA = qu3.a(jabVar.a, jabVar.b, jabVar.c, jabVar.d, jabVar.e, jabVar.f);
                            }
                            i16 = i26;
                            f = f2;
                            i14 = i25;
                            i13 = i24;
                            i12 = i23;
                        } else if (iA3 == 39 && i19 == 0 && (ww6VarK = xsg.k(i21, bArr, i21 + iH4)) != null && ljfVarM != null) {
                            i3 = 0;
                            i15 = ww6VarK.b == ((iab) ((c98) ljfVarM.b).get(0)).b ? 4 : 5;
                        }
                        i3 = 0;
                    }
                    i18 = i21 + iH4;
                    nmcVar.O(iH4);
                    i19++;
                    z2 = z3;
                    iA = i20;
                    i = 4;
                }
                i17++;
                ljfVar2 = ljfVarM;
                i = 4;
            }
            return new yu7(i5 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iA + 1, i7, i8, i9, i10, i11, i12, i13, i14, i15, f, i16, strA, ljfVar2);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing".concat(z ? "L-HEVC config" : "HEVC config"));
        }
    }
}
