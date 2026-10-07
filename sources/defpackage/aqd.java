package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aqd implements yx6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx6 b;
    public final /* synthetic */ dqd c;

    public /* synthetic */ aqd(yx6 yx6Var, dqd dqdVar, int i) {
        this.a = i;
        this.b = yx6Var;
        this.c = dqdVar;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // defpackage.yx6
    public final Object emit(Object obj, lq4 lq4Var) {
        zpd zpdVar;
        bqd bqdVar;
        int i = this.a;
        sbi sbiVar = sbi.a;
        yx6 yx6Var = this.b;
        hu4 hu4Var = hu4.a;
        dqd dqdVar = this.c;
        Object obj2 = null;
        switch (i) {
            case 0:
                if (lq4Var instanceof zpd) {
                    zpdVar = (zpd) lq4Var;
                    int i2 = zpdVar.e;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        zpdVar.e = i2 - Integer.MIN_VALUE;
                    } else {
                        zpdVar = new zpd(this, lq4Var);
                    }
                } else {
                    zpdVar = new zpd(this, lq4Var);
                }
                Object obj3 = zpdVar.d;
                int i3 = zpdVar.e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj3);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj3);
                zv8[] zv8VarArr = dqd.B;
                dqdVar.B((rt2) obj);
                zpdVar.e = 1;
                return yx6Var.emit(sbiVar, zpdVar) == hu4Var ? hu4Var : sbiVar;
            default:
                if (lq4Var instanceof bqd) {
                    bqdVar = (bqd) lq4Var;
                    int i4 = bqdVar.e;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        bqdVar.e = i4 - Integer.MIN_VALUE;
                    } else {
                        bqdVar = new bqd(this, lq4Var);
                    }
                } else {
                    bqdVar = new bqd(this, lq4Var);
                }
                Object obj4 = bqdVar.d;
                int i5 = bqdVar.e;
                if (i5 == 0) {
                    ch3.d0(obj4);
                    xp0 xp0Var = (xp0) obj;
                    if (xp0Var != null) {
                        long j = xp0Var.a;
                        if (j == dqdVar.t.get()) {
                            obj2 = vv4.a;
                        } else if (j == dqdVar.u.get()) {
                            obj2 = tv4.a;
                        }
                        if (obj2 == null) {
                            return sbiVar;
                        }
                        bqdVar.e = 1;
                        return yx6Var.emit(obj2, bqdVar) == hu4Var ? hu4Var : sbiVar;
                    }
                    ore.o();
                } else {
                    if (i5 == 1) {
                        ch3.d0(obj4);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }
}
