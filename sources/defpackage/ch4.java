package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ch4 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;
    public final ny8 f;
    public final ny8 g;
    public final ny8 h;

    public ch4(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5, ny8 ny8Var6, ny8 ny8Var7, ny8 ny8Var8) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
        this.f = ny8Var6;
        this.g = ny8Var7;
        this.h = ny8Var8;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0169  */
    /* JADX WARN: Code duplicated, block: B:73:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [ii4, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v5, types: [ii4, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    public final Object a(long j, nq4 nq4Var, String str, String str2) {
        bh4 bh4Var;
        String str3;
        String str4;
        ii4 ii4Var;
        long j2;
        int i;
        String str5;
        no4 no4Var;
        ii4 ii4Var2;
        hu4 hu4Var;
        ?? r14;
        boolean z;
        String str6;
        long j3;
        long j4;
        no4 no4Var2;
        ?? r15;
        int i2;
        long j5;
        rt2 rt2VarO;
        j93 j93Var;
        long jA;
        long j6 = j;
        if (nq4Var instanceof bh4) {
            bh4Var = (bh4) nq4Var;
            int i3 = bh4Var.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bh4Var.m = i3 - Integer.MIN_VALUE;
            } else {
                bh4Var = new bh4(this, nq4Var);
            }
        } else {
            bh4Var = new bh4(this, nq4Var);
        }
        bh4 bh4Var2 = bh4Var;
        Object objI = bh4Var2.k;
        int i4 = bh4Var2.m;
        sbi sbiVar = sbi.a;
        ny8 ny8Var = this.a;
        ii4 ii4Var3 = ii4.a;
        hu4 hu4Var2 = hu4.a;
        if (i4 == 0) {
            ch3.d0(objI);
            no4 no4Var3 = (no4) ny8Var.getValue();
            str3 = str;
            bh4Var2.e = str3;
            str4 = str2;
            bh4Var2.f = str4;
            bh4Var2.d = j6;
            bh4Var2.m = 1;
            objI = no4Var3.i(j6);
            if (objI != hu4Var2) {
            }
            return hu4Var2;
        }
        if (i4 == 1) {
            j6 = bh4Var2.d;
            String str7 = bh4Var2.f;
            String str8 = bh4Var2.e;
            ch3.d0(objI);
            str4 = str7;
            str3 = str8;
        } else if (i4 == 2) {
            i = bh4Var2.j;
            long j7 = bh4Var2.d;
            str5 = bh4Var2.i;
            str3 = bh4Var2.h;
            ii4Var = bh4Var2.g;
            ch3.d0(objI);
            j2 = j7;
            no4Var = (no4) ny8Var.getValue();
            bh4Var2.e = null;
            bh4Var2.f = null;
            bh4Var2.g = null;
            bh4Var2.h = str3;
            bh4Var2.i = str5;
            bh4Var2.d = j2;
            bh4Var2.j = i;
            bh4Var2.m = 3;
            ii4Var2 = ii4Var;
            hu4Var = hu4Var2;
            r14 = 0;
            z = true;
            if (no4Var.e(j2, ji4.a, ii4Var2, bh4Var2) == hu4Var) {
                return hu4Var;
            }
            str6 = str3;
            j3 = j2;
            String str9 = str5;
            pvb pvbVar = (pvb) this.c.getValue();
            j4 = j3;
            pvb.t(pvbVar, new pm4(4, pvbVar.u().a.g(), j3, null, null, str6, str9));
            ((whh) this.b.getValue()).f(c0a.s(j4));
            r15 = r14;
            if (i != 0) {
                no4Var2 = (no4) ny8Var.getValue();
                bh4Var2.e = r14;
                bh4Var2.f = r14;
                bh4Var2.g = r14;
                bh4Var2.h = r14;
                bh4Var2.i = r14;
                bh4Var2.d = j4;
                bh4Var2.j = i;
                bh4Var2.m = 4;
                if (no4Var2.d(j4, ii4Var3, bh4Var2) == hu4Var) {
                    r15 = r14;
                    return hu4Var;
                }
            }
            r15 = r14;
            long j8 = j4;
            i2 = i;
            j5 = j8;
            if (((f5d) ((wo6) this.g.getValue())).y()) {
                j93Var = (j93) this.f.getValue();
                jA = rt2VarO.A();
                bh4Var2.e = r15;
                bh4Var2.f = r15;
                bh4Var2.g = r15;
                bh4Var2.h = r15;
                bh4Var2.i = r15;
                bh4Var2.d = j5;
                bh4Var2.j = i2;
                bh4Var2.m = 5;
                if (j93Var.a(jA, z, bh4Var2) == hu4Var) {
                    return hu4Var;
                }
            }
        } else if (i4 == 3) {
            i = bh4Var2.j;
            long j9 = bh4Var2.d;
            str5 = bh4Var2.i;
            String str10 = bh4Var2.h;
            ch3.d0(objI);
            j3 = j9;
            str6 = str10;
            z = true;
            r14 = 0;
            hu4Var = hu4Var2;
            String str11 = str5;
            pvb pvbVar2 = (pvb) this.c.getValue();
            j4 = j3;
            pvb.t(pvbVar2, new pm4(4, pvbVar2.u().a.g(), j3, null, null, str6, str11));
            ((whh) this.b.getValue()).f(c0a.s(j4));
            r15 = r14;
            if (i != 0) {
                no4Var2 = (no4) ny8Var.getValue();
                bh4Var2.e = r14;
                bh4Var2.f = r14;
                bh4Var2.g = r14;
                bh4Var2.h = r14;
                bh4Var2.i = r14;
                bh4Var2.d = j4;
                bh4Var2.j = i;
                bh4Var2.m = 4;
                if (no4Var2.d(j4, ii4Var3, bh4Var2) == hu4Var) {
                    r15 = r14;
                    return hu4Var;
                }
            }
            r15 = r14;
            long j10 = j4;
            i2 = i;
            j5 = j10;
            if (((f5d) ((wo6) this.g.getValue())).y()) {
                j93Var = (j93) this.f.getValue();
                jA = rt2VarO.A();
                bh4Var2.e = r15;
                bh4Var2.f = r15;
                bh4Var2.g = r15;
                bh4Var2.h = r15;
                bh4Var2.i = r15;
                bh4Var2.d = j5;
                bh4Var2.j = i2;
                bh4Var2.m = 5;
                if (j93Var.a(jA, z, bh4Var2) == hu4Var) {
                    return hu4Var;
                }
            }
        } else if (i4 == 4) {
            i = bh4Var2.j;
            j4 = bh4Var2.d;
            ch3.d0(objI);
            z = true;
            r15 = 0;
            hu4Var = hu4Var2;
            r15 = r14;
            long j11 = j4;
            i2 = i;
            j5 = j11;
            if (((f5d) ((wo6) this.g.getValue())).y() && (rt2VarO = ((xn3) this.e.getValue()).o(j5)) != null) {
                j93Var = (j93) this.f.getValue();
                jA = rt2VarO.A();
                bh4Var2.e = r15;
                bh4Var2.f = r15;
                bh4Var2.g = r15;
                bh4Var2.h = r15;
                bh4Var2.i = r15;
                bh4Var2.d = j5;
                bh4Var2.j = i2;
                bh4Var2.m = 5;
                if (j93Var.a(jA, z, bh4Var2) == hu4Var) {
                    return hu4Var;
                }
            }
        } else {
            if (i4 != 5) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j5 = bh4Var2.d;
            ch3.d0(objI);
        }
        ((bl8) this.h.getValue()).a(c0a.s(j5));
        ((t51) this.d.getValue()).c(new so4(j5));
        return sbiVar;
        vg4 vg4Var = (vg4) objI;
        int i5 = (vg4Var != null ? vg4Var.a.b.i : null) == ii4Var3 ? 1 : 0;
        ii4 ii4Var4 = i5 != 0 ? ii4Var3 : null;
        gm0.n(ch4.class.getName(), "add, id = " + j6);
        fi4 fi4VarP = vg4Var != null ? vg4Var.p() : null;
        if ((str3 == null || str3.length() == 0) && (str4 == null || str4.length() == 0)) {
            str3 = fi4VarP != null ? fi4VarP.a : null;
            str4 = fi4VarP != null ? fi4VarP.b : null;
        } else if (str3 == null || str3.length() == 0) {
            str3 = fi4VarP != null ? fi4VarP.a : null;
        }
        no4 no4Var4 = (no4) ny8Var.getValue();
        bh4Var2.e = null;
        bh4Var2.f = null;
        bh4Var2.g = ii4Var4;
        bh4Var2.h = str3;
        bh4Var2.i = str4;
        bh4Var2.d = j6;
        bh4Var2.j = i5;
        bh4Var2.m = 2;
        no4Var4.getClass();
        Object objB = no4Var4.b(j6, new z92(str3, str4, 5), bh4Var2);
        if (objB != hu4Var2) {
            objB = sbiVar;
        }
        if (objB != hu4Var2) {
            int i6 = i5;
            ii4Var = ii4Var4;
            j2 = j6;
            i = i6;
            str5 = str4;
            no4Var = (no4) ny8Var.getValue();
            bh4Var2.e = null;
            bh4Var2.f = null;
            bh4Var2.g = null;
            bh4Var2.h = str3;
            bh4Var2.i = str5;
            bh4Var2.d = j2;
            bh4Var2.j = i;
            bh4Var2.m = 3;
            ii4Var2 = ii4Var;
            hu4Var = hu4Var2;
            r14 = 0;
            z = true;
            if (no4Var.e(j2, ji4.a, ii4Var2, bh4Var2) == hu4Var) {
                return hu4Var;
            }
            str6 = str3;
            j3 = j2;
            String str12 = str5;
            pvb pvbVar3 = (pvb) this.c.getValue();
            j4 = j3;
            pvb.t(pvbVar3, new pm4(4, pvbVar3.u().a.g(), j3, null, null, str6, str12));
            ((whh) this.b.getValue()).f(c0a.s(j4));
            r15 = r14;
            if (i != 0) {
                no4Var2 = (no4) ny8Var.getValue();
                bh4Var2.e = r14;
                bh4Var2.f = r14;
                bh4Var2.g = r14;
                bh4Var2.h = r14;
                bh4Var2.i = r14;
                bh4Var2.d = j4;
                bh4Var2.j = i;
                bh4Var2.m = 4;
                if (no4Var2.d(j4, ii4Var3, bh4Var2) == hu4Var) {
                    r15 = r14;
                    return hu4Var;
                }
            }
            r15 = r14;
            long j12 = j4;
            i2 = i;
            j5 = j12;
            if (((f5d) ((wo6) this.g.getValue())).y()) {
                j93Var = (j93) this.f.getValue();
                jA = rt2VarO.A();
                bh4Var2.e = r15;
                bh4Var2.f = r15;
                bh4Var2.g = r15;
                bh4Var2.h = r15;
                bh4Var2.i = r15;
                bh4Var2.d = j5;
                bh4Var2.j = i2;
                bh4Var2.m = 5;
                if (j93Var.a(jA, z, bh4Var2) == hu4Var) {
                    return hu4Var;
                }
            }
            ((bl8) this.h.getValue()).a(c0a.s(j5));
            ((t51) this.d.getValue()).c(new so4(j5));
            return sbiVar;
        }
        return hu4Var2;
    }
}
