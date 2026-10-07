package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ovi {
    public final evi a;

    public ovi(evi eviVar) {
        this.a = eviVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(xui xuiVar, nq4 nq4Var) {
        nvi nviVar;
        if (nq4Var instanceof nvi) {
            nviVar = (nvi) nq4Var;
            int i = nviVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                nviVar.f = i - Integer.MIN_VALUE;
            } else {
                nviVar = new nvi(this, nq4Var);
            }
        } else {
            nviVar = new nvi(this, nq4Var);
        }
        Object objI = nviVar.d;
        int i2 = nviVar.f;
        if (i2 == 0) {
            ch3.d0(objI);
            String str = xuiVar.a;
            fvi fviVar = xuiVar.b;
            y0e y0eVar = fviVar.a;
            float f = fviVar.b;
            float f2 = fviVar.c;
            boolean z = fviVar.e;
            nviVar.f = 1;
            objI = ch3.I(nviVar, this.a.a, true, false, new dvi(str, y0eVar, f, f2, z, 1));
            hu4 hu4Var = hu4.a;
            if (objI == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objI);
        }
        yui yuiVar = (yui) objI;
        if (yuiVar == null) {
            return null;
        }
        a70 a70Var = yuiVar.a;
        a70 a70Var2 = new a70(1);
        a70Var2.a = a70Var.a;
        a70Var2.b = a70Var.b;
        a70Var2.c = a70Var.c;
        a70Var2.e = a70Var.e;
        fvi fviVar2 = new fvi(a70Var2);
        wze wzeVar = new wze(10);
        wzeVar.b = (String) a70Var.d;
        wzeVar.c = fviVar2;
        return new wui(new xui(wzeVar), yuiVar.b, yuiVar.c, yuiVar.d, yuiVar.e, 16777184);
    }

    public final Object b(wui wuiVar, nq4 nq4Var) {
        xui xuiVar = wuiVar.a;
        if (xuiVar == null) {
            ore.k("Required value was null.");
            return null;
        }
        yui yuiVar = new yui();
        a70 a70Var = new a70();
        a70Var.d = xuiVar.a;
        fvi fviVar = xuiVar.b;
        a70Var.a = fviVar.a;
        a70Var.b = fviVar.b;
        a70Var.c = fviVar.c;
        a70Var.e = fviVar.e;
        yuiVar.a = a70Var;
        yuiVar.c = wuiVar.c;
        yuiVar.d = wuiVar.d;
        yuiVar.e = wuiVar.e;
        yuiVar.b = wuiVar.b;
        evi eviVar = this.a;
        Object objI = ch3.I(nq4Var, eviVar.a, false, true, new bad(eviVar, 28, yuiVar));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }

    public final Object c(xui xuiVar, nq4 nq4Var) {
        String str = xuiVar.a;
        fvi fviVar = xuiVar.b;
        Object objI = ch3.I(nq4Var, this.a.a, false, true, new dvi(str, fviVar.a, fviVar.b, fviVar.c, fviVar.e, 0));
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        if (objI != hu4Var) {
            objI = sbiVar;
        }
        return objI == hu4Var ? objI : sbiVar;
    }
}
