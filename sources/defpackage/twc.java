package defpackage;

import ru.ok.tamtam.messages.b;

/* JADX INFO: loaded from: classes2.dex */
public final class twc extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twc(wwc wwcVar, boolean z, boolean z2, lq4 lq4Var) {
        super(2, lq4Var);
        this.i = wwcVar;
        this.g = z;
        this.h = z2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.i;
        boolean z = this.h;
        boolean z2 = this.g;
        switch (i) {
            case 0:
                return new twc((wwc) obj2, z2, z, lq4Var);
            default:
                return new twc(z2, z, (qfi) obj2, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
        }
        return ((twc) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objD;
        int i = this.e;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        Object obj2 = this.i;
        boolean z = this.g;
        switch (i) {
            case 0:
                wwc wwcVar = (wwc) obj2;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    am7 am7Var = (am7) wwcVar.e.getValue();
                    this.f = 1;
                    objA = am7Var.a(this);
                    if (objA != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                objA = obj;
                vc9 vc9Var = (vc9) objA;
                mjg mjgVar = wwcVar.l;
                rwc rwcVarA = rwc.a((rwc) mjgVar.getValue(), vc9Var != null ? new Double(vc9Var.a) : null, vc9Var != null ? new Double(vc9Var.b) : null, null, null, null, null, false, 124);
                mjgVar.getClass();
                mjgVar.j(null, rwcVarA);
                if (vc9Var != null) {
                    a8j.x(wwcVar.o, new jwc(vc9Var.a, vc9Var.b, z ? null : new Float(14.0f), this.h));
                    return sbiVar;
                }
                this.f = 2;
                if (yab.K0(((n0c) ((xhh) wwcVar.h.getValue())).c(), new vwc(wwcVar, null, 2), this) != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
            default:
                qfi qfiVar = (qfi) obj2;
                ny8 ny8Var = qfiVar.e;
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        objD = obj;
                    } else {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                    }
                    return null;
                }
                ch3.d0(obj);
                ini iniVar = new ini();
                iniVar.w = Boolean.valueOf(z);
                iniVar.x = Boolean.valueOf(this.h);
                if (z) {
                    iniVar.o = 4;
                    iniVar.p = 4;
                    iniVar.y = 4;
                    Boolean bool = Boolean.TRUE;
                    iniVar.z = bool;
                    iniVar.A = bool;
                }
                pvb pvbVar = (pvb) qfiVar.a.getValue();
                wy2 wy2Var = new wy2(new ia4(null, new lni(iniVar), 23), 28);
                this.f = 1;
                objD = pvbVar.D(wy2Var, this);
                if (objD == hu4Var) {
                    return hu4Var;
                }
                lni lniVar = ((w94) objD).d;
                if (lniVar == null) {
                    ore.p("Required value was null.");
                    return null;
                }
                Boolean bool2 = lniVar.w;
                ((nni) qfiVar.b.getValue()).q(lniVar);
                Boolean bool3 = Boolean.FALSE;
                if (cqk.d(bool2, bool3)) {
                    xb9 xb9Var = (xb9) ((et3) qfiVar.c.getValue());
                    xb9Var.e("app.pin_" + xb9Var.t(), null);
                }
                e13 e13Var = (e13) qfiVar.f.getValue();
                e13Var.G.i(-1);
                e13Var.I.i(-1);
                ((b) qfiVar.h.getValue()).b();
                ((xn3) qfiVar.g.getValue()).t();
                ((gq0) qfiVar.i.getValue()).c();
                if (z && cqk.d(bool2, Boolean.TRUE)) {
                    da4 da4Var = (da4) ny8Var.getValue();
                    yab.i0(da4Var.b, null, 0, new ca4(da4Var, null, 1), 3);
                    return sbiVar;
                }
                if (z || !cqk.d(bool2, bool3)) {
                    ((da4) ny8Var.getValue()).a();
                    return sbiVar;
                }
                da4 da4Var2 = (da4) ny8Var.getValue();
                yab.i0(da4Var2.b, null, 0, new ca4(da4Var2, null, 0), 3);
                return sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public twc(boolean z, boolean z2, qfi qfiVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = z;
        this.h = z2;
        this.i = qfiVar;
    }
}
