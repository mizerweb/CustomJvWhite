package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qgf {
    public final String a = qgf.class.getName();
    public final ny8 b;
    public final ny8 c;
    public final ny8 d;

    public qgf(ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3) {
        this.b = ny8Var;
        this.c = ny8Var2;
        this.d = ny8Var3;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:37:0x010a  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object a(long j, String str, g61 g61Var, c61 c61Var, nq4 nq4Var) {
        pgf pgfVar;
        g61 g61Var2;
        String str2;
        c61 c61Var2;
        sfa sfaVar;
        g61 g61Var3;
        String str3;
        String str4;
        a4c a4cVar;
        pvb pvbVar;
        String str5;
        j61 j61Var;
        je9 je9Var;
        long j2 = j;
        sbi sbiVar = sbi.a;
        if (nq4Var instanceof pgf) {
            pgfVar = (pgf) nq4Var;
            int i = pgfVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                pgfVar.k = i - Integer.MIN_VALUE;
            } else {
                pgfVar = new pgf(this, nq4Var);
            }
        } else {
            pgfVar = new pgf(this, nq4Var);
        }
        Object objF = pgfVar.i;
        hu4 hu4Var = hu4.a;
        int i2 = pgfVar.k;
        if (i2 == 0) {
            ch3.d0(objF);
            sua suaVar = (sua) this.d.getValue();
            pgfVar.e = str;
            g61Var2 = g61Var;
            pgfVar.f = g61Var2;
            pgfVar.g = c61Var;
            pgfVar.d = j2;
            pgfVar.k = 1;
            objF = suaVar.f(j2, pgfVar);
            if (objF != hu4Var) {
                str2 = str;
                c61Var2 = c61Var;
            }
            return hu4Var;
        }
        if (i2 == 1) {
            j2 = pgfVar.d;
            c61Var2 = pgfVar.g;
            g61Var2 = pgfVar.f;
            str2 = pgfVar.e;
            ch3.d0(objF);
        } else {
            if (i2 != 2) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j2 = pgfVar.d;
            sfaVar = pgfVar.h;
            c61Var2 = pgfVar.g;
            g61Var3 = pgfVar.f;
            str3 = pgfVar.e;
            ch3.d0(objF);
        }
        ((t51) this.c.getValue()).c(new kfi(sfaVar.h, sfaVar.a, false));
        str4 = this.a;
        a4cVar = gm0.f;
        if (a4cVar != null) {
            je9Var = je9.d;
            if (a4cVar.b(je9Var)) {
                StringBuilder sbQ = qv1.q("Msg keyboard, sendCallback: callbackId:", str3, "|payload:", c61Var2.e, "|msgId:");
                sbQ.append(j2);
                sbQ.append("|btnP:");
                sbQ.append(g61Var3);
                a4cVar.c(je9Var, str4, sbQ.toString(), null);
            }
        }
        pvbVar = (pvb) this.b.getValue();
        str5 = c61Var2.e;
        j61Var = c61Var2.b;
        if (pvbVar.k(j2)) {
            pvb.t(pvbVar, new p4b(pvbVar.u().a.g(), str3, str5, System.currentTimeMillis(), j2, g61Var3, j61Var));
            return sbiVar;
        }
        return sbiVar;
        sfa sfaVar2 = (sfa) objF;
        if (g61Var2 != null && sfaVar2 != null) {
            sua suaVar2 = (sua) this.d.getValue();
            bad badVar = new bad(str2, 7, g61Var2);
            pgfVar.e = str2;
            pgfVar.f = g61Var2;
            pgfVar.g = c61Var2;
            pgfVar.h = sfaVar2;
            pgfVar.d = j2;
            pgfVar.k = 2;
            ((ose) suaVar2.a).C(j2, new nua(badVar, suaVar2));
            if (sbiVar != hu4Var) {
                sfaVar = sfaVar2;
                g61Var3 = g61Var2;
                str3 = str2;
                ((t51) this.c.getValue()).c(new kfi(sfaVar.h, sfaVar.a, false));
                str4 = this.a;
                a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        StringBuilder sbQ2 = qv1.q("Msg keyboard, sendCallback: callbackId:", str3, "|payload:", c61Var2.e, "|msgId:");
                        sbQ2.append(j2);
                        sbQ2.append("|btnP:");
                        sbQ2.append(g61Var3);
                        a4cVar.c(je9Var, str4, sbQ2.toString(), null);
                    }
                }
                pvbVar = (pvb) this.b.getValue();
                str5 = c61Var2.e;
                j61Var = c61Var2.b;
                if (pvbVar.k(j2)) {
                    pvb.t(pvbVar, new p4b(pvbVar.u().a.g(), str3, str5, System.currentTimeMillis(), j2, g61Var3, j61Var));
                    return sbiVar;
                }
            }
            return hu4Var;
        }
        String str6 = this.a;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null) {
            je9 je9Var2 = je9.f;
            if (a4cVar2.b(je9Var2)) {
                a4cVar2.c(je9Var2, str6, "Msg keyboard, fail sendCallback btnP:" + g61Var2 + "|msgExist:" + (sfaVar2 != null), null);
            }
        }
        return sbiVar;
    }
}
