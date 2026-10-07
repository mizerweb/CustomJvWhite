package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* JADX INFO: loaded from: classes3.dex */
public final class ge0 {
    public final ny8 a;
    public final ny8 b;
    public final String c = ge0.class.getName();

    public ge0(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(String str, nq4 nq4Var) {
        fe0 fe0Var;
        Object poeVar;
        Object obj;
        yhh yhhVar;
        be0 be0Var = be0.a;
        if (nq4Var instanceof fe0) {
            fe0Var = (fe0) nq4Var;
            int i = fe0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                fe0Var.f = i - Integer.MIN_VALUE;
            } else {
                fe0Var = new fe0(this, nq4Var);
            }
        } else {
            fe0Var = new fe0(this, nq4Var);
        }
        Object objD = fe0Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = fe0Var.f;
        try {
            if (i2 == 0) {
                ch3.d0(objD);
                pvb pvbVar = (pvb) this.a.getValue();
                vsb vsbVar = new vsb(kfc.J3, 15);
                vsbVar.h("qrLink", str);
                fe0Var.f = 1;
                objD = pvbVar.D(vsbVar, fe0Var);
                if (objD == hu4Var) {
                    return hu4Var;
                }
            } else {
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(objD);
            }
            poeVar = (kih) objD;
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        if (!(poeVar instanceof poe)) {
            poeVar = de0.a;
        }
        Throwable thA = roe.a(poeVar);
        if (thA != null) {
            String str2 = this.c;
            a4c a4cVar = gm0.f;
            if (a4cVar != null) {
                je9 je9Var = je9.d;
                if (a4cVar.b(je9Var)) {
                    a4cVar.c(je9Var, str2, zo5.r("authQr failed with error= ", thA.getCause()), null);
                }
            }
            TamErrorException tamErrorException = thA instanceof TamErrorException ? (TamErrorException) thA : null;
            String str3 = (tamErrorException == null || (yhhVar = tamErrorException.a) == null) ? null : yhhVar.b;
            if (cqk.d(str3, "qr_link.invalid")) {
                yd0 yd0Var = (yd0) this.b.getValue();
                yd0Var.getClass();
                yd0.a(yd0Var, 4, 5, null, 4);
                obj = zd0.a;
            } else if (cqk.d(str3, "track.not.found")) {
                obj = ae0.a;
            } else {
                yd0 yd0Var2 = (yd0) this.b.getValue();
                yd0Var2.getClass();
                yd0.a(yd0Var2, 4, 2, null, 4);
                poeVar = be0Var;
            }
            poeVar = obj;
        }
        return poeVar instanceof poe ? be0Var : poeVar;
    }
}
