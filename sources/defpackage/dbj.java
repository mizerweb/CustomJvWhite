package defpackage;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class dbj extends o4h {
    public j28 n;
    public int o;
    public boolean p;
    public a3b q;
    public rai r;

    @Override // defpackage.o4h
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        a3b a3bVar = this.q;
        this.o = a3bVar != null ? a3bVar.e : 0;
    }

    @Override // defpackage.o4h
    public final long b(nmc nmcVar) {
        byte b = nmcVar.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        j28 j28Var = this.n;
        j28Var.getClass();
        boolean z = ((sc8[]) j28Var.f)[(b >> 1) & (255 >>> (8 - j28Var.b))].b;
        a3b a3bVar = (a3b) j28Var.c;
        int i = !z ? a3bVar.e : a3bVar.f;
        long j = this.p ? (this.o + i) / 4 : 0;
        byte[] bArr = nmcVar.a;
        int length = bArr.length;
        int i2 = nmcVar.c + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            nmcVar.L(bArrCopyOf.length, bArrCopyOf);
        } else {
            nmcVar.M(i2);
        }
        byte[] bArr2 = nmcVar.a;
        int i3 = nmcVar.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:166:0x03ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:168:0x03af  */
    /* JADX WARN: Type inference failed for: r1v48, types: [byte[], java.io.Serializable] */
    @Override // defpackage.o4h
    public final boolean c(nmc nmcVar, long j, ewe eweVar) throws ParserException {
        j28 j28Var;
        if (this.n != null) {
            ((b87) eweVar.b).getClass();
            return false;
        }
        a3b a3bVar = this.q;
        int i = 4;
        if (a3bVar != null) {
            rai raiVar = this.r;
            if (raiVar == null) {
                this.r = t01.h(nmcVar, true, true);
            } else {
                int i2 = nmcVar.c;
                byte[] bArr = new byte[i2];
                System.arraycopy(nmcVar.a, 0, bArr, 0, i2);
                int i3 = a3bVar.a;
                int i4 = 5;
                t01.i(5, nmcVar, false);
                int iA = nmcVar.A() + 1;
                mo2 mo2Var = new mo2(nmcVar.a);
                int i5 = 8;
                mo2Var.t(nmcVar.b * 8);
                int i6 = 0;
                while (true) {
                    int i7 = 16;
                    if (i6 < iA) {
                        int i8 = i5;
                        if (mo2Var.i(24) != 5653314) {
                            throw ParserException.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((mo2Var.d * 8) + mo2Var.e));
                        }
                        int i9 = mo2Var.i(16);
                        int i10 = mo2Var.i(24);
                        if (mo2Var.h()) {
                            mo2Var.t(i4);
                            int i11 = 0;
                            while (i11 < i10) {
                                int i12 = 0;
                                for (int i13 = i10 - i11; i13 > 0; i13 >>>= 1) {
                                    i12++;
                                }
                                i11 += mo2Var.i(i12);
                            }
                        } else {
                            boolean zH = mo2Var.h();
                            for (int i14 = 0; i14 < i10; i14++) {
                                if (!zH) {
                                    mo2Var.t(i4);
                                } else if (mo2Var.h()) {
                                    mo2Var.t(i4);
                                }
                            }
                        }
                        int i15 = mo2Var.i(4);
                        if (i15 > 2) {
                            throw ParserException.a(null, "lookup type greater than 2 not decodable: " + i15);
                        }
                        if (i15 == 1 || i15 == 2) {
                            mo2Var.t(32);
                            mo2Var.t(32);
                            int i16 = mo2Var.i(4) + 1;
                            mo2Var.t(1);
                            mo2Var.t((int) ((i15 == 1 ? i9 != 0 ? (long) Math.floor(Math.pow(i10, 1.0d / ((double) i9))) : 0L : ((long) i10) * ((long) i9)) * ((long) i16)));
                        }
                        i6++;
                        i5 = i8;
                        i4 = 5;
                    } else {
                        int i17 = i5;
                        int i18 = 6;
                        int i19 = mo2Var.i(6) + 1;
                        for (int i20 = 0; i20 < i19; i20++) {
                            if (mo2Var.i(16) != 0) {
                                throw ParserException.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i21 = 1;
                        int i22 = mo2Var.i(6) + 1;
                        int i23 = 0;
                        while (true) {
                            int i24 = 3;
                            if (i23 >= i22) {
                                int i25 = mo2Var.i(i18) + 1;
                                int i26 = 0;
                                while (i26 < i25) {
                                    if (mo2Var.i(16) > 2) {
                                        throw ParserException.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    mo2Var.t(24);
                                    mo2Var.t(24);
                                    mo2Var.t(24);
                                    int i27 = mo2Var.i(i18) + 1;
                                    int i28 = 8;
                                    mo2Var.t(8);
                                    int[] iArr = new int[i27];
                                    for (int i29 = 0; i29 < i27; i29++) {
                                        iArr[i29] = ((mo2Var.h() ? mo2Var.i(5) : 0) * 8) + mo2Var.i(3);
                                    }
                                    int i30 = 0;
                                    while (i30 < i27) {
                                        int i31 = 0;
                                        while (i31 < i28) {
                                            if ((iArr[i30] & (1 << i31)) != 0) {
                                                mo2Var.t(i28);
                                            }
                                            i31++;
                                            i28 = 8;
                                        }
                                        i30++;
                                        i28 = 8;
                                    }
                                    i26++;
                                    i18 = 6;
                                }
                                int i32 = mo2Var.i(i18) + 1;
                                for (int i33 = 0; i33 < i32; i33++) {
                                    int i34 = mo2Var.i(16);
                                    if (i34 != 0) {
                                        lvb.k0("VorbisUtil", "mapping type other than 0 not supported: " + i34);
                                    } else {
                                        int i35 = mo2Var.h() ? mo2Var.i(4) + 1 : 1;
                                        if (mo2Var.h()) {
                                            int i36 = mo2Var.i(8) + 1;
                                            for (int i37 = 0; i37 < i36; i37++) {
                                                int i38 = i3 - 1;
                                                int i39 = 0;
                                                for (int i40 = i38; i40 > 0; i40 >>>= 1) {
                                                    i39++;
                                                }
                                                mo2Var.t(i39);
                                                int i41 = 0;
                                                while (i38 > 0) {
                                                    i41++;
                                                    i38 >>>= 1;
                                                }
                                                mo2Var.t(i41);
                                            }
                                        }
                                        if (mo2Var.i(2) != 0) {
                                            throw ParserException.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i35 > 1) {
                                            for (int i42 = 0; i42 < i3; i42++) {
                                                mo2Var.t(4);
                                            }
                                        }
                                        for (int i43 = 0; i43 < i35; i43++) {
                                            mo2Var.t(8);
                                            mo2Var.t(8);
                                            mo2Var.t(8);
                                        }
                                    }
                                }
                                int i44 = mo2Var.i(6);
                                int i45 = i44 + 1;
                                sc8[] sc8VarArr = new sc8[i45];
                                for (int i46 = 0; i46 < i45; i46++) {
                                    boolean zH2 = mo2Var.h();
                                    mo2Var.i(16);
                                    mo2Var.i(16);
                                    mo2Var.i(8);
                                    sc8VarArr[i46] = new sc8(zH2, 3);
                                }
                                if (!mo2Var.h()) {
                                    throw ParserException.a(null, "framing bit after modes not set as expected");
                                }
                                int i47 = 0;
                                while (i44 > 0) {
                                    i47++;
                                    i44 >>>= 1;
                                }
                                j28Var = new j28(a3bVar, raiVar, bArr, sc8VarArr, i47);
                                break;
                            }
                            int i48 = mo2Var.i(i7);
                            if (i48 == 0) {
                                int i49 = i17;
                                mo2Var.t(i49);
                                mo2Var.t(16);
                                mo2Var.t(16);
                                mo2Var.t(6);
                                mo2Var.t(i49);
                                int i50 = mo2Var.i(4) + 1;
                                int i51 = 0;
                                while (i51 < i50) {
                                    mo2Var.t(i49);
                                    i51++;
                                    i49 = 8;
                                }
                            } else {
                                if (i48 != i21) {
                                    throw ParserException.a(null, "floor type greater than 1 not decodable: " + i48);
                                }
                                int i52 = mo2Var.i(5);
                                int[] iArr2 = new int[i52];
                                int i53 = -1;
                                for (int i54 = 0; i54 < i52; i54++) {
                                    int i55 = mo2Var.i(i);
                                    iArr2[i54] = i55;
                                    if (i55 > i53) {
                                        i53 = i55;
                                    }
                                }
                                int i56 = i53 + 1;
                                int[] iArr3 = new int[i56];
                                int i57 = 0;
                                while (i57 < i56) {
                                    iArr3[i57] = mo2Var.i(i24) + 1;
                                    int i58 = mo2Var.i(2);
                                    int i59 = i17;
                                    if (i58 > 0) {
                                        mo2Var.t(i59);
                                    }
                                    int[] iArr4 = iArr3;
                                    int i60 = 0;
                                    for (int i61 = 1; i60 < (i61 << i58); i61 = 1) {
                                        mo2Var.t(i59);
                                        i60++;
                                        i59 = 8;
                                    }
                                    i57++;
                                    iArr3 = iArr4;
                                    i17 = 8;
                                    i24 = 3;
                                }
                                int[] iArr5 = iArr3;
                                mo2Var.t(2);
                                int i62 = mo2Var.i(4);
                                int i63 = 0;
                                int i64 = 0;
                                for (int i65 = 0; i65 < i52; i65++) {
                                    i63 += iArr5[iArr2[i65]];
                                    while (i64 < i63) {
                                        mo2Var.t(i62);
                                        i64++;
                                    }
                                }
                            }
                            i23++;
                            i17 = 8;
                            i18 = 6;
                            i = 4;
                            i7 = 16;
                            i21 = 1;
                        }
                    }
                }
            }
            this.n = j28Var;
            if (j28Var == null) {
                return true;
            }
            a3b a3bVar2 = (a3b) j28Var.c;
            ArrayList arrayList = new ArrayList();
            arrayList.add((byte[]) a3bVar2.g);
            arrayList.add((byte[]) j28Var.e);
            lwa lwaVarG = t01.g(c98.o((String[]) ((rai) j28Var.d).a));
            a87 a87Var = new a87();
            a87Var.l = uya.n("audio/ogg");
            a87Var.m = uya.n("audio/vorbis");
            a87Var.h = a3bVar2.d;
            a87Var.i = a3bVar2.c;
            a87Var.E = a3bVar2.a;
            a87Var.F = a3bVar2.b;
            a87Var.p = arrayList;
            a87Var.k = lwaVarG;
            eweVar.b = new b87(a87Var);
            return true;
        }
        t01.i(1, nmcVar, false);
        nmcVar.s();
        int iA2 = nmcVar.A();
        int iS = nmcVar.s();
        int iO = nmcVar.o();
        if (iO <= 0) {
            iO = -1;
        }
        int iO2 = nmcVar.o();
        int i66 = iO2 > 0 ? iO2 : -1;
        nmcVar.o();
        int iA3 = nmcVar.A();
        int iPow = (int) Math.pow(2.0d, iA3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iA3 & 240) >> 4);
        nmcVar.A();
        ?? CopyOf = Arrays.copyOf(nmcVar.a, nmcVar.c);
        a3b a3bVar3 = new a3b();
        a3bVar3.a = iA2;
        a3bVar3.b = iS;
        a3bVar3.c = iO;
        a3bVar3.d = i66;
        a3bVar3.e = iPow;
        a3bVar3.f = iPow2;
        a3bVar3.g = CopyOf;
        this.q = a3bVar3;
        j28Var = null;
        this.n = j28Var;
        if (j28Var == null) {
            return true;
        }
        a3b a3bVar4 = (a3b) j28Var.c;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((byte[]) a3bVar4.g);
        arrayList2.add((byte[]) j28Var.e);
        lwa lwaVarG2 = t01.g(c98.o((String[]) ((rai) j28Var.d).a));
        a87 a87Var2 = new a87();
        a87Var2.l = uya.n("audio/ogg");
        a87Var2.m = uya.n("audio/vorbis");
        a87Var2.h = a3bVar4.d;
        a87Var2.i = a3bVar4.c;
        a87Var2.E = a3bVar4.a;
        a87Var2.F = a3bVar4.b;
        a87Var2.p = arrayList2;
        a87Var2.k = lwaVarG2;
        eweVar.b = new b87(a87Var2);
        return true;
    }

    @Override // defpackage.o4h
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
