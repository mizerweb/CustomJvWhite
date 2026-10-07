package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rkl {
    /* JADX WARN: Code duplicated, block: B:189:0x028c  */
    /* JADX WARN: Code duplicated, block: B:206:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:208:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:210:0x02de  */
    /* JADX WARN: Code duplicated, block: B:233:0x0370  */
    /* JADX WARN: Code duplicated, block: B:235:0x038c  */
    /* JADX WARN: Code duplicated, block: B:237:0x0391  */
    /* JADX WARN: Code duplicated, block: B:241:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:251:0x0422  */
    /* JADX WARN: Code duplicated, block: B:409:0x0698  */
    /* JADX WARN: Code duplicated, block: B:412:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:413:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:416:0x06ac  */
    /* JADX WARN: Code duplicated, block: B:417:0x06af  */
    /* JADX WARN: Code duplicated, block: B:419:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:421:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:424:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:426:0x06c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:436:0x06e3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0114  */
    public static void a(ig4 ig4Var, b29 b29Var, ArrayList arrayList, int i) {
        int i2;
        vo2[] vo2VarArr;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        hg4 hg4Var;
        b29 b29Var2;
        hg4 hg4Var2;
        adg adgVar;
        of4 of4Var;
        adg adgVar2;
        hg4 hg4Var3;
        int i6;
        of4[] of4VarArr;
        of4 of4Var2;
        adg adgVar3;
        int i7;
        of4[] of4VarArr2;
        int i8;
        of4 of4Var3;
        of4 of4Var4;
        adg adgVar4;
        of4 of4Var5;
        adg adgVar5;
        int size;
        ArrayList arrayList2;
        int i9;
        int i10;
        float f;
        int i11;
        adg adgVar6;
        adg adgVar7;
        adg adgVar8;
        adg adgVar9;
        ow owVarL;
        float f2;
        of4 of4Var6;
        hg4 hg4Var4;
        int i12;
        int i13;
        hg4 hg4Var5;
        ig4 ig4Var2 = ig4Var;
        if (i == 0) {
            i2 = ig4Var2.y0;
            vo2VarArr = ig4Var2.B0;
            i3 = 0;
        } else {
            i2 = ig4Var2.z0;
            vo2VarArr = ig4Var2.A0;
            i3 = 2;
        }
        int i14 = i2;
        vo2[] vo2VarArr2 = vo2VarArr;
        int i15 = 0;
        while (i15 < i14) {
            vo2 vo2Var = vo2VarArr2[i15];
            boolean z4 = vo2Var.q;
            hg4 hg4Var6 = vo2Var.a;
            of4[] of4VarArr3 = hg4Var6.P;
            int i16 = 3;
            int i17 = 8;
            float f3 = 0.0f;
            if (z4) {
                i4 = i15;
            } else {
                int i18 = vo2Var.l;
                int i19 = i18 * 2;
                hg4 hg4Var7 = hg4Var6;
                hg4 hg4Var8 = hg4Var7;
                boolean z5 = false;
                while (!z5) {
                    vo2Var.i++;
                    hg4[] hg4VarArr = hg4Var7.l0;
                    of4[] of4VarArr4 = hg4Var7.P;
                    hg4VarArr[i18] = null;
                    hg4Var7.k0[i18] = null;
                    if (hg4Var7.f0 != i17) {
                        hg4Var7.h(i18);
                        of4VarArr4[i19].d();
                        int i20 = i19 + 1;
                        of4VarArr4[i20].d();
                        of4VarArr4[i19].d();
                        of4VarArr4[i20].d();
                        if (vo2Var.b == null) {
                            vo2Var.b = hg4Var7;
                        }
                        vo2Var.d = hg4Var7;
                        int i21 = hg4Var7.o0[i18];
                        if (i21 == i16) {
                            int i22 = hg4Var7.t[i18];
                            if (i22 == 0 || i22 == i16 || i22 == 2) {
                                vo2Var.j++;
                                float f4 = hg4Var7.j0[i18];
                                if (f4 > 0.0f) {
                                    vo2Var.k += f4;
                                }
                                i13 = i18;
                                if (hg4Var7.f0 != 8 && i21 == 3 && (i22 == 0 || i22 == 3)) {
                                    if (f4 < 0.0f) {
                                        vo2Var.n = true;
                                    } else {
                                        vo2Var.o = true;
                                    }
                                    if (vo2Var.h == null) {
                                        vo2Var.h = new ArrayList();
                                    }
                                    vo2Var.h.add(hg4Var7);
                                }
                                if (vo2Var.f == null) {
                                    vo2Var.f = hg4Var7;
                                }
                                hg4 hg4Var9 = vo2Var.g;
                                if (hg4Var9 != null) {
                                    hg4Var9.k0[i13] = hg4Var7;
                                }
                                vo2Var.g = hg4Var7;
                            } else {
                                i15 = i15;
                                i13 = i18;
                            }
                            if (i13 == 0) {
                                if (hg4Var7.r == 0 && hg4Var7.u == 0) {
                                    int i23 = hg4Var7.v;
                                }
                            } else if (hg4Var7.s == 0 && hg4Var7.x == 0) {
                                int i24 = hg4Var7.y;
                            }
                        } else {
                            i15 = i15;
                            i13 = i18;
                        }
                    } else {
                        i15 = i15;
                        i13 = i18;
                    }
                    hg4 hg4Var10 = hg4Var8;
                    if (hg4Var10 != hg4Var7) {
                        hg4Var10.l0[i13] = hg4Var7;
                    }
                    of4 of4Var7 = of4VarArr4[i19 + 1].f;
                    if (of4Var7 != null) {
                        hg4Var5 = of4Var7.d;
                        of4 of4Var8 = hg4Var5.P[i19].f;
                        if (of4Var8 == null || of4Var8.d != hg4Var7) {
                            hg4Var5 = null;
                        }
                    } else {
                        hg4Var5 = null;
                    }
                    if (hg4Var5 == null) {
                        hg4Var5 = hg4Var7;
                        z5 = true;
                    }
                    hg4Var8 = hg4Var7;
                    i18 = i13;
                    i16 = 3;
                    i17 = 8;
                    hg4Var7 = hg4Var5;
                    i15 = i15;
                }
                i4 = i15;
                int i25 = i18;
                hg4 hg4Var11 = vo2Var.b;
                if (hg4Var11 != null) {
                    hg4Var11.P[i19].d();
                }
                hg4 hg4Var12 = vo2Var.d;
                if (hg4Var12 != null) {
                    hg4Var12.P[i19 + 1].d();
                }
                vo2Var.c = hg4Var7;
                if (i25 == 0 && vo2Var.m) {
                    vo2Var.e = hg4Var7;
                } else {
                    vo2Var.e = hg4Var6;
                }
                vo2Var.p = vo2Var.o && vo2Var.n;
            }
            vo2Var.q = true;
            if (arrayList == 0 || arrayList.contains(hg4Var6)) {
                hg4 hg4Var13 = vo2Var.c;
                hg4 hg4Var14 = vo2Var.b;
                hg4 hg4Var15 = vo2Var.d;
                hg4 hg4Var16 = vo2Var.e;
                float f5 = vo2Var.k;
                int[] iArr = ig4Var2.o0;
                of4[] of4VarArr5 = ig4Var2.P;
                boolean z6 = iArr[i] == 2;
                if (i == 0) {
                    int i26 = hg4Var16.h0;
                    boolean z7 = i26 == 0;
                    boolean z8 = i26 == 1;
                    z = i26 == 2;
                    z3 = z8;
                    z2 = z7;
                } else {
                    int i27 = hg4Var16.i0;
                    boolean z9 = i27 == 0;
                    boolean z10 = i27 == 1;
                    z = i27 == 2;
                    z2 = z9;
                    z3 = z10;
                }
                boolean z11 = false;
                while (!z11) {
                    of4[] of4VarArr6 = hg4Var6.P;
                    int[] iArr2 = hg4Var6.o0;
                    of4 of4Var9 = of4VarArr6[i3];
                    int i28 = z ? 1 : 4;
                    int iD = of4Var9.d();
                    boolean z12 = z6;
                    boolean z13 = z;
                    boolean z14 = iArr2[i] == 3 && hg4Var6.t[i] == 0;
                    of4 of4Var10 = of4Var9.f;
                    if (of4Var10 != null && hg4Var6 != hg4Var6) {
                        iD = of4Var10.d() + iD;
                    }
                    int i29 = iD;
                    if (z13 && hg4Var6 != hg4Var6 && hg4Var6 != hg4Var14) {
                        i28 = 8;
                    }
                    hg4 hg4Var17 = hg4Var6;
                    of4 of4Var11 = of4Var9.f;
                    if (of4Var11 != null) {
                        boolean z15 = z14;
                        adg adgVar10 = of4Var9.i;
                        adg adgVar11 = of4Var11.i;
                        if (hg4Var6 == hg4Var14) {
                            b29Var.f(adgVar10, adgVar11, i29, 6);
                        } else {
                            b29Var.f(adgVar10, adgVar11, i29, 8);
                        }
                        if (z15 && !z13) {
                            i28 = 5;
                        }
                        b29Var.e(of4Var9.i, of4Var9.f.i, i29, (hg4Var6 == hg4Var14 && z13 && hg4Var6.R[i]) ? 5 : i28);
                    }
                    if (z12) {
                        if (hg4Var6.f0 == 8 || iArr2[i] != 3) {
                            i12 = 0;
                        } else {
                            i12 = 0;
                            b29Var.f(of4VarArr6[i3 + 1].i, of4VarArr6[i3].i, 0, 5);
                        }
                        b29Var.f(of4VarArr6[i3].i, of4VarArr5[i3].i, i12, 8);
                    }
                    of4 of4Var12 = of4VarArr6[i3 + 1].f;
                    if (of4Var12 != null) {
                        hg4Var4 = of4Var12.d;
                        of4 of4Var13 = hg4Var4.P[i3].f;
                        if (of4Var13 == null || of4Var13.d != hg4Var6) {
                            hg4Var4 = null;
                        }
                    } else {
                        hg4Var4 = null;
                    }
                    if (hg4Var4 != null) {
                        hg4Var6 = hg4Var4;
                    } else {
                        z11 = true;
                    }
                    hg4Var6 = hg4Var17;
                    z6 = z12;
                    z = z13;
                }
                boolean z16 = z6;
                boolean z17 = z;
                if (hg4Var15 != null) {
                    int i30 = i3 + 1;
                    if (hg4Var13.P[i30].f != null) {
                        of4 of4Var14 = hg4Var15.P[i30];
                        if (hg4Var15.o0[i] == 3 && hg4Var15.t[i] == 0 && !z17) {
                            of4 of4Var15 = of4Var14.f;
                            if (of4Var15.d == ig4Var2) {
                                b29Var.e(of4Var14.i, of4Var15.i, -of4Var14.d(), 5);
                            } else if (z17) {
                                of4Var6 = of4Var14.f;
                                if (of4Var6.d == ig4Var2) {
                                    b29Var.e(of4Var14.i, of4Var6.i, -of4Var14.d(), 4);
                                }
                            }
                        } else if (z17) {
                            of4Var6 = of4Var14.f;
                            if (of4Var6.d == ig4Var2) {
                                b29Var.e(of4Var14.i, of4Var6.i, -of4Var14.d(), 4);
                            }
                        }
                        b29Var.g(of4Var14.i, hg4Var13.P[i30].f.i, -of4Var14.d(), 6);
                    }
                }
                if (z16) {
                    int i31 = i3 + 1;
                    adg adgVar12 = of4VarArr5[i31].i;
                    of4 of4Var16 = hg4Var13.P[i31];
                    b29Var.f(adgVar12, of4Var16.i, of4Var16.d(), 8);
                }
                ArrayList arrayList3 = vo2Var.h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (vo2Var.n && !vo2Var.p) {
                        f5 = vo2Var.j;
                    }
                    hg4 hg4Var18 = null;
                    float f6 = 0.0f;
                    int i32 = 0;
                    while (i32 < size) {
                        hg4 hg4Var19 = (hg4) arrayList3.get(i32);
                        float[] fArr = hg4Var19.j0;
                        of4[] of4VarArr7 = hg4Var19.P;
                        float f7 = fArr[i];
                        if (f7 >= f3) {
                            arrayList2 = arrayList3;
                            i9 = size;
                            if (f7 == f3) {
                                b29Var.e(of4VarArr7[i3 + 1].i, of4VarArr7[i3].i, 0, 8);
                                i10 = i14;
                                f = f3;
                                f6 = f6;
                                i11 = i32;
                            } else {
                                float f8 = f6;
                                if (hg4Var18 != null) {
                                    of4[] of4VarArr8 = hg4Var18.P;
                                    adgVar6 = of4VarArr8[i3].i;
                                    int i33 = i3 + 1;
                                    adgVar7 = of4VarArr8[i33].i;
                                    adgVar8 = of4VarArr7[i3].i;
                                    adgVar9 = of4VarArr7[i33].i;
                                    owVarL = b29Var.l();
                                    f2 = f3;
                                    owVarL.b = f2;
                                    f = f2;
                                    if (f5 != f2 || f8 == f7) {
                                        i11 = i32;
                                        i10 = i14;
                                        owVarL.d.g(adgVar6, 1.0f);
                                        owVarL.d.g(adgVar7, -1.0f);
                                        owVarL.d.g(adgVar9, 1.0f);
                                        owVarL.d.g(adgVar8, -1.0f);
                                    } else {
                                        cw cwVar = owVarL.d;
                                        if (f8 == f) {
                                            i11 = i32;
                                            cwVar.g(adgVar6, 1.0f);
                                            owVarL.d.g(adgVar7, -1.0f);
                                            i10 = i14;
                                        } else {
                                            i11 = i32;
                                            i10 = i14;
                                            if (f7 == f3) {
                                                cwVar.g(adgVar8, 1.0f);
                                                owVarL.d.g(adgVar9, -1.0f);
                                            } else {
                                                float f9 = (f8 / f5) / (f7 / f5);
                                                cwVar.g(adgVar6, 1.0f);
                                                owVarL.d.g(adgVar7, -1.0f);
                                                owVarL.d.g(adgVar9, f9);
                                                owVarL.d.g(adgVar8, -f9);
                                            }
                                        }
                                    }
                                    b29Var.c(owVarL);
                                } else {
                                    i10 = i14;
                                    f = f3;
                                    i11 = i32;
                                }
                                f6 = f7;
                                hg4Var18 = hg4Var19;
                            }
                        } else {
                            if (vo2Var.p) {
                                arrayList2 = arrayList3;
                                i9 = size;
                                b29Var.e(of4VarArr7[i3 + 1].i, of4VarArr7[i3].i, 0, 4);
                            } else {
                                f7 = 1.0f;
                                arrayList2 = arrayList3;
                                i9 = size;
                                if (f7 == f3) {
                                    b29Var.e(of4VarArr7[i3 + 1].i, of4VarArr7[i3].i, 0, 8);
                                } else {
                                    float f10 = f6;
                                    if (hg4Var18 != null) {
                                        of4[] of4VarArr9 = hg4Var18.P;
                                        adgVar6 = of4VarArr9[i3].i;
                                        int i34 = i3 + 1;
                                        adgVar7 = of4VarArr9[i34].i;
                                        adgVar8 = of4VarArr7[i3].i;
                                        adgVar9 = of4VarArr7[i34].i;
                                        owVarL = b29Var.l();
                                        f2 = f3;
                                        owVarL.b = f2;
                                        f = f2;
                                        if (f5 != f2) {
                                            i11 = i32;
                                            i10 = i14;
                                            owVarL.d.g(adgVar6, 1.0f);
                                            owVarL.d.g(adgVar7, -1.0f);
                                            owVarL.d.g(adgVar9, 1.0f);
                                            owVarL.d.g(adgVar8, -1.0f);
                                        } else {
                                            i11 = i32;
                                            i10 = i14;
                                            owVarL.d.g(adgVar6, 1.0f);
                                            owVarL.d.g(adgVar7, -1.0f);
                                            owVarL.d.g(adgVar9, 1.0f);
                                            owVarL.d.g(adgVar8, -1.0f);
                                        }
                                        b29Var.c(owVarL);
                                    } else {
                                        i10 = i14;
                                        f = f3;
                                        i11 = i32;
                                    }
                                    f6 = f7;
                                    hg4Var18 = hg4Var19;
                                }
                            }
                            i10 = i14;
                            f = f3;
                            f6 = f6;
                            i11 = i32;
                        }
                        i32 = i11 + 1;
                        i14 = i10;
                        arrayList3 = arrayList2;
                        size = i9;
                        f3 = f;
                    }
                }
                i5 = i14;
                if (hg4Var14 == null || !(hg4Var14 == hg4Var15 || z17)) {
                    hg4Var = hg4Var15;
                    if (z2 && hg4Var14 != null) {
                        int i35 = vo2Var.j;
                        boolean z18 = i35 > 0 && vo2Var.i == i35;
                        hg4 hg4Var20 = hg4Var14;
                        hg4 hg4Var21 = hg4Var20;
                        while (true) {
                            of4[] of4VarArr10 = hg4Var21.P;
                            if (hg4Var20 == null) {
                                break;
                            }
                            of4[] of4VarArr11 = hg4Var20.P;
                            hg4 hg4Var22 = hg4Var20.l0[i];
                            while (true) {
                                if (hg4Var22 == null) {
                                    i6 = 8;
                                    break;
                                }
                                i6 = 8;
                                if (hg4Var22.f0 != 8) {
                                    break;
                                } else {
                                    hg4Var22 = hg4Var22.l0[i];
                                }
                            }
                            if (hg4Var22 != null || hg4Var20 == hg4Var) {
                                of4 of4Var17 = of4VarArr11[i3];
                                adg adgVar13 = of4Var17.i;
                                of4 of4Var18 = of4Var17.f;
                                adg adgVar14 = of4Var18 != null ? of4Var18.i : null;
                                if (hg4Var21 != hg4Var20) {
                                    adgVar14 = of4VarArr10[i3 + 1].i;
                                } else if (hg4Var20 == hg4Var14) {
                                    of4 of4Var19 = of4VarArr3[i3].f;
                                    adgVar14 = of4Var19 != null ? of4Var19.i : null;
                                }
                                int iD2 = of4Var17.d();
                                int i36 = i3 + 1;
                                int iD3 = of4VarArr11[i36].d();
                                if (hg4Var22 != null) {
                                    of4Var2 = hg4Var22.P[i3];
                                    of4VarArr = of4VarArr10;
                                    adgVar3 = of4Var2.i;
                                } else {
                                    of4VarArr = of4VarArr10;
                                    of4Var2 = hg4Var13.P[i36].f;
                                    adgVar3 = of4Var2 != null ? of4Var2.i : null;
                                }
                                adg adgVar15 = of4VarArr11[i36].i;
                                if (of4Var2 != null) {
                                    iD3 += of4Var2.d();
                                }
                                int iD4 = of4VarArr[i36].d() + iD2;
                                if (adgVar13 == null || adgVar14 == null || adgVar3 == null || adgVar15 == null) {
                                    i7 = 8;
                                } else {
                                    if (hg4Var20 == hg4Var14) {
                                        iD4 = hg4Var14.P[i3].d();
                                    }
                                    int i37 = iD4;
                                    if (hg4Var20 == hg4Var) {
                                        iD3 = hg4Var.P[i36].d();
                                    }
                                    i7 = 8;
                                    b29Var.b(adgVar13, adgVar14, i37, 0.5f, adgVar3, adgVar15, iD3, z18 ? 8 : 5);
                                }
                            } else {
                                i7 = i6;
                            }
                            if (hg4Var20.f0 != i7) {
                                hg4Var21 = hg4Var20;
                            }
                            hg4Var20 = hg4Var22;
                            hg4Var21 = hg4Var21;
                        }
                    } else {
                        int i38 = 8;
                        if (z3 && hg4Var14 != null) {
                            int i39 = vo2Var.j;
                            boolean z19 = i39 > 0 && vo2Var.i == i39;
                            hg4 hg4Var23 = hg4Var14;
                            hg4 hg4Var24 = hg4Var23;
                            while (true) {
                                of4[] of4VarArr12 = hg4Var23.P;
                                if (hg4Var24 == null) {
                                    break;
                                }
                                of4[] of4VarArr13 = hg4Var24.P;
                                hg4 hg4Var25 = hg4Var24.l0[i];
                                while (hg4Var25 != null && hg4Var25.f0 == i38) {
                                    hg4Var25 = hg4Var25.l0[i];
                                }
                                if (hg4Var24 == hg4Var14 || hg4Var24 == hg4Var || hg4Var25 == null) {
                                    hg4Var2 = hg4Var23;
                                } else {
                                    if (hg4Var25 == hg4Var) {
                                        hg4Var25 = null;
                                    }
                                    of4 of4Var20 = of4VarArr13[i3];
                                    adg adgVar16 = of4Var20.i;
                                    int i40 = i3 + 1;
                                    adg adgVar17 = of4VarArr12[i40].i;
                                    int iD5 = of4Var20.d();
                                    int iD6 = of4VarArr13[i40].d();
                                    if (hg4Var25 != null) {
                                        of4Var = hg4Var25.P[i3];
                                        adgVar = of4Var.i;
                                        hg4Var2 = hg4Var23;
                                        of4 of4Var21 = of4Var.f;
                                        adgVar2 = of4Var21 != null ? of4Var21.i : null;
                                    } else {
                                        hg4Var2 = hg4Var23;
                                        of4 of4Var22 = hg4Var.P[i3];
                                        adgVar = of4Var22 != null ? of4Var22.i : null;
                                        adg adgVar18 = of4VarArr13[i40].i;
                                        of4Var = of4Var22;
                                        adgVar2 = adgVar18;
                                    }
                                    if (of4Var != null) {
                                        iD6 += of4Var.d();
                                    }
                                    int iD7 = of4VarArr12[i40].d() + iD5;
                                    hg4 hg4Var26 = hg4Var25;
                                    int i41 = iD6;
                                    int i42 = z19 ? 8 : 4;
                                    if (adgVar16 == null || adgVar17 == null || adgVar == null || adgVar2 == null) {
                                        hg4Var3 = hg4Var26;
                                    } else {
                                        adg adgVar19 = adgVar;
                                        hg4Var3 = hg4Var26;
                                        b29Var.b(adgVar16, adgVar17, iD7, 0.5f, adgVar19, adgVar2, i41, i42);
                                    }
                                    hg4Var25 = hg4Var3;
                                }
                                if (hg4Var24.f0 != 8) {
                                    hg4Var2 = hg4Var24;
                                }
                                hg4Var24 = hg4Var25;
                                i38 = 8;
                                hg4Var23 = hg4Var2;
                            }
                            b29Var2 = b29Var;
                            of4 of4Var23 = hg4Var14.P[i3];
                            of4 of4Var24 = of4VarArr3[i3].f;
                            int i43 = i3 + 1;
                            of4 of4Var25 = hg4Var.P[i43];
                            of4 of4Var26 = hg4Var13.P[i43].f;
                            if (of4Var24 != null) {
                                if (hg4Var14 != hg4Var) {
                                    b29Var2.e(of4Var23.i, of4Var24.i, of4Var23.d(), 5);
                                } else if (of4Var26 != null) {
                                    b29Var2.b(of4Var23.i, of4Var24.i, of4Var23.d(), 0.5f, of4Var25.i, of4Var26.i, of4Var25.d(), 5);
                                }
                            }
                            if (of4Var26 != null && hg4Var14 != hg4Var) {
                                b29Var2.e(of4Var25.i, of4Var26.i, -of4Var25.d(), 5);
                            }
                        }
                        if ((z2 || z3) && hg4Var14 != null && hg4Var14 != hg4Var) {
                            of4VarArr2 = hg4Var14.P;
                            of4 of4Var27 = of4VarArr2[i3];
                            if (hg4Var == null) {
                                hg4Var = hg4Var14;
                            }
                            of4[] of4VarArr14 = hg4Var.P;
                            i8 = i3 + 1;
                            of4Var3 = of4VarArr14[i8];
                            of4Var4 = of4Var27.f;
                            if (of4Var4 != null) {
                                adgVar4 = of4Var4.i;
                            } else {
                                adgVar4 = null;
                            }
                            of4Var5 = of4Var3.f;
                            if (of4Var5 != null) {
                                adgVar5 = of4Var5.i;
                            } else {
                                adgVar5 = null;
                            }
                            if (hg4Var13 != hg4Var) {
                                of4 of4Var28 = hg4Var13.P[i8].f;
                                adgVar5 = of4Var28 != null ? of4Var28.i : null;
                            }
                            if (hg4Var14 == hg4Var) {
                                of4Var3 = of4VarArr2[i8];
                            }
                            if (adgVar4 == null && adgVar5 != null) {
                                b29Var2.b(of4Var27.i, adgVar4, of4Var27.d(), 0.5f, adgVar5, of4Var3.i, of4VarArr14[i8].d(), 5);
                            }
                        }
                    }
                } else {
                    of4 of4Var29 = of4VarArr3[i3];
                    int i44 = i3 + 1;
                    of4 of4Var30 = hg4Var13.P[i44];
                    of4 of4Var31 = of4Var29.f;
                    adg adgVar20 = of4Var31 != null ? of4Var31.i : null;
                    of4 of4Var32 = of4Var30.f;
                    adg adgVar21 = of4Var32 != null ? of4Var32.i : null;
                    of4 of4Var33 = hg4Var14.P[i3];
                    if (hg4Var15 != null) {
                        of4Var30 = hg4Var15.P[i44];
                    }
                    if (adgVar20 == null || adgVar21 == null) {
                        hg4Var = hg4Var15;
                    } else {
                        float f11 = i == 0 ? hg4Var16.c0 : hg4Var16.d0;
                        int iD8 = of4Var33.d();
                        int iD9 = of4Var30.d();
                        adg adgVar22 = of4Var33.i;
                        adg adgVar23 = of4Var30.i;
                        adg adgVar24 = adgVar20;
                        hg4Var = hg4Var15;
                        b29Var.b(adgVar22, adgVar24, iD8, f11, adgVar21, adgVar23, iD9, 7);
                    }
                }
                b29Var2 = b29Var;
                if (z2) {
                    of4VarArr2 = hg4Var14.P;
                    of4 of4Var210 = of4VarArr2[i3];
                    if (hg4Var == null) {
                        hg4Var = hg4Var14;
                    }
                    of4[] of4VarArr15 = hg4Var.P;
                    i8 = i3 + 1;
                    of4Var3 = of4VarArr15[i8];
                    of4Var4 = of4Var210.f;
                    if (of4Var4 != null) {
                        adgVar4 = of4Var4.i;
                    } else {
                        adgVar4 = null;
                    }
                    of4Var5 = of4Var3.f;
                    if (of4Var5 != null) {
                        adgVar5 = of4Var5.i;
                    } else {
                        adgVar5 = null;
                    }
                    if (hg4Var13 != hg4Var) {
                        of4 of4Var211 = hg4Var13.P[i8].f;
                        adgVar5 = of4Var211 != null ? of4Var211.i : null;
                    }
                    if (hg4Var14 == hg4Var) {
                        of4Var3 = of4VarArr2[i8];
                    }
                    if (adgVar4 == null) {
                    }
                } else {
                    of4VarArr2 = hg4Var14.P;
                    of4 of4Var212 = of4VarArr2[i3];
                    if (hg4Var == null) {
                        hg4Var = hg4Var14;
                    }
                    of4[] of4VarArr16 = hg4Var.P;
                    i8 = i3 + 1;
                    of4Var3 = of4VarArr16[i8];
                    of4Var4 = of4Var212.f;
                    if (of4Var4 != null) {
                        adgVar4 = of4Var4.i;
                    } else {
                        adgVar4 = null;
                    }
                    of4Var5 = of4Var3.f;
                    if (of4Var5 != null) {
                        adgVar5 = of4Var5.i;
                    } else {
                        adgVar5 = null;
                    }
                    if (hg4Var13 != hg4Var) {
                        of4 of4Var213 = hg4Var13.P[i8].f;
                        adgVar5 = of4Var213 != null ? of4Var213.i : null;
                    }
                    if (hg4Var14 == hg4Var) {
                        of4Var3 = of4VarArr2[i8];
                    }
                    if (adgVar4 == null) {
                    }
                }
            } else {
                i5 = i14;
            }
            i15 = i4 + 1;
            ig4Var2 = ig4Var;
            i14 = i5;
        }
    }

    public static bp2 b(Context context) {
        t09 t09Var;
        e89 e89VarG;
        tw5 tw5Var = iid.b.a;
        synchronized (tw5Var.a) {
            Object obj = jq4.a;
            int iF = Build.VERSION.SDK_INT >= 34 ? v4.f(context) : 0;
            LinkedHashMap linkedHashMap = r09.a;
            synchronized (linkedHashMap) {
                try {
                    Integer numValueOf = Integer.valueOf(iF);
                    Object t09Var2 = linkedHashMap.get(numValueOf);
                    if (t09Var2 == null) {
                        t09Var2 = new t09();
                        linkedHashMap.put(numValueOf, t09Var2);
                    }
                    t09Var = (t09) t09Var2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            tw5Var.e = t09Var;
            e89VarG = (lg7) tw5Var.b;
            if (e89VarG == null) {
                ri2 ri2Var = new ri2(context, null);
                bp2 bp2VarJ = o9b.j(o9b.j(lg7.c((e89) tw5Var.c), new oo6(14, new nv4(24, ri2Var)), zjl.a()), new due(new oo6(15, new os1(tw5Var, ri2Var, context, 9))), zjl.a());
                tw5Var.b = bp2VarJ;
                o9b.a(bp2VarJ, new uik(16, tw5Var), zjl.a());
                e89VarG = o9b.g(bp2VarJ);
            }
        }
        return o9b.j(e89VarG, new due(new ahc(4, new pyb(29))), zjl.a());
    }
}
