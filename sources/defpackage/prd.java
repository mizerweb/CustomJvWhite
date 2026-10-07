package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class prd implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ srd c;

    public /* synthetic */ prd(yx6 yx6Var, srd srdVar, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = srdVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0071  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        ord ordVar;
        qrd qrdVar;
        int i = this.a;
        sbi sbiVar = sbi.a;
        srd srdVar = this.c;
        yx6 yx6Var = this.b;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                if (lq4Var instanceof ord) {
                    ordVar = (ord) lq4Var;
                    int i2 = ordVar.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        ordVar.e = i2 - Integer.MIN_VALUE;
                    } else {
                        ordVar = new ord(this, lq4Var);
                    }
                } else {
                    ordVar = new ord(this, lq4Var);
                }
                Object obj2 = ordVar.d;
                int i3 = ordVar.e;
                if (i3 == 0) {
                    ch3.d0(obj2);
                    mrd mrdVarC = srd.C(srdVar, (rt2) obj);
                    ordVar.e = 1;
                    return yx6Var.emit(mrdVarC, ordVar) == hu4Var ? hu4Var : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj2);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lq4Var instanceof qrd) {
                    qrdVar = (qrd) lq4Var;
                    int i4 = qrdVar.e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        qrdVar.e = i4 - Integer.MIN_VALUE;
                    } else {
                        qrdVar = new qrd(this, lq4Var);
                    }
                } else {
                    qrdVar = new qrd(this, lq4Var);
                }
                Object obj3 = qrdVar.d;
                int i5 = qrdVar.e;
                if (i5 == 0) {
                    ch3.d0(obj3);
                    xp0 xp0Var = (xp0) obj;
                    if (xp0Var != null) {
                        Boolean bool = xp0Var.a == srdVar.n.get() ? Boolean.TRUE : null;
                        if (bool == null) {
                            return sbiVar;
                        }
                        qrdVar.e = 1;
                        return yx6Var.emit(bool, qrdVar) == hu4Var ? hu4Var : sbiVar;
                    }
                    ore.o();
                } else {
                    if (i5 == 1) {
                        ch3.d0(obj3);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }
}
