package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class dm4 {
    public final ny8 a;
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;
    public final ny8 e;

    public dm4(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, ny8 ny8Var4, ny8 ny8Var5) {
        this.a = ny8Var;
        this.b = ny8Var2;
        this.c = ny8Var3;
        this.d = ny8Var4;
        this.e = ny8Var5;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x014e  */
    /* JADX WARN: Code duplicated, block: B:68:0x0153  */
    /* JADX WARN: Code duplicated, block: B:70:0x0157  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    public final Object a(long j, nq4 nq4Var, String str, String str2) {
        cm4 cm4Var;
        String str3;
        String str4;
        fi4 fi4Var;
        String str5;
        long j2 = j;
        String str6 = str;
        String str7 = str2;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof cm4) {
            cm4Var = (cm4) nq4Var;
            int i = cm4Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                cm4Var.l = i - Integer.MIN_VALUE;
            } else {
                cm4Var = new cm4(this, nq4Var);
            }
        } else {
            cm4Var = new cm4(this, nq4Var);
        }
        Object objI = cm4Var.j;
        hu4 hu4Var = hu4.a;
        int i2 = cm4Var.l;
        if (i2 == 0) {
            ch3.d0(objI);
            String name = dm4.class.getName();
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, name, ewi.d(j2, "rename, id = ", " => ", gm0.c() ? zo5.p(str6, " ", str7) : "***** *****"), null);
                }
            }
            no4 no4Var = (no4) this.a.getValue();
            cm4Var.e = str6;
            cm4Var.f = str7;
            cm4Var.d = j2;
            cm4Var.l = 1;
            objI = no4Var.i(j2);
            if (objI != hu4Var) {
            }
            return hu4Var;
        }
        if (i2 == 1) {
            j2 = cm4Var.d;
            String str8 = cm4Var.f;
            String str9 = cm4Var.e;
            ch3.d0(objI);
            str7 = str8;
            str6 = str9;
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = cm4Var.d;
            str4 = cm4Var.i;
            str3 = cm4Var.h;
            fi4Var = cm4Var.g;
            ch3.d0(objI);
        }
        String str10 = str4;
        String str11 = str3;
        ((bl8) this.e.getValue()).a(c0a.s(j2));
        ((t51) this.d.getValue()).c(new so4(j2));
        pvb pvbVar = (pvb) this.c.getValue();
        if (fi4Var != null) {
            str5 = fi4Var.a;
        } else {
            str5 = null;
        }
        pvb.t(pvbVar, new pm4(5, pvbVar.u().a.g(), j2, str5, fi4Var != null ? fi4Var.b : null, str11, str10));
        ((whh) this.b.getValue()).f(c0a.s(j2));
        ((t51) this.d.getValue()).c(new so4(j2));
        return sbiVar;
        vg4 vg4Var = (vg4) objI;
        if (vg4Var == null) {
            gm0.Y(dm4.class.getName(), "Early return in invoke cuz of contactSync is null");
            return sbiVar;
        }
        fi4 fi4Var2 = (fi4) ww3.t1(vg4Var.q());
        fi4 fi4VarP = vg4Var.p();
        if ((str6 == null || str6.length() == 0) && (str7 == null || str7.length() == 0)) {
            str3 = fi4VarP != null ? fi4VarP.a : null;
            str4 = fi4VarP != null ? fi4VarP.b : null;
        } else if (str6 == null || str6.length() == 0) {
            str4 = str7;
            str3 = fi4VarP != null ? fi4VarP.a : null;
        } else {
            String str12 = str7;
            str3 = str6;
            str4 = str12;
        }
        no4 no4Var2 = (no4) this.a.getValue();
        cm4Var.e = null;
        cm4Var.f = null;
        cm4Var.g = fi4Var2;
        cm4Var.h = str3;
        cm4Var.i = str4;
        cm4Var.d = j2;
        cm4Var.l = 2;
        no4Var2.getClass();
        Object objB = no4Var2.b(j2, new z92(str3, str4, 5), cm4Var);
        if (objB != hu4Var) {
            objB = sbiVar;
        }
        if (objB != hu4Var) {
            fi4Var = fi4Var2;
            String str13 = str4;
            String str14 = str3;
            ((bl8) this.e.getValue()).a(c0a.s(j2));
            ((t51) this.d.getValue()).c(new so4(j2));
            pvb pvbVar2 = (pvb) this.c.getValue();
            if (fi4Var != null) {
                str5 = fi4Var.a;
            } else {
                str5 = null;
            }
            pvb.t(pvbVar2, new pm4(5, pvbVar2.u().a.g(), j2, str5, fi4Var != null ? fi4Var.b : null, str14, str13));
            ((whh) this.b.getValue()).f(c0a.s(j2));
            ((t51) this.d.getValue()).c(new so4(j2));
            return sbiVar;
        }
        return hu4Var;
    }
}
