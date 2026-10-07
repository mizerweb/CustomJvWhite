package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fgh extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgh(nub nubVar, af7 af7Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = nubVar;
        this.h = af7Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                fgh fghVar = new fgh((hgh) obj2, lq4Var);
                fghVar.g = obj;
                return fghVar;
            default:
                return new fgh((nub) this.g, (af7) obj2, lq4Var);
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
        return ((fgh) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                hgh hghVar = (hgh) obj2;
                gu4 gu4Var = (gu4) this.g;
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                vo8[] vo8VarArr = {yab.i0(gu4Var, null, 0, new egh(hghVar, null, 1), 3), yab.i0(gu4Var, null, 0, new egh(hghVar, null, 2), 3)};
                this.g = null;
                this.f = 1;
                return ch3.v(vo8VarArr, this) == hu4Var ? hu4Var : sbiVar;
            default:
                af7 af7Var = (af7) obj2;
                int i3 = this.f;
                try {
                    if (i3 == 0) {
                        ch3.d0(obj);
                        nub nubVar = (nub) this.g;
                        this.f = 1;
                        obj = nub.b(nubVar, this);
                        if (obj == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        if (i3 != 1) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    af7Var.invoke();
                    return sbiVar;
                } catch (Throwable th) {
                    af7Var.invoke();
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgh(hgh hghVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = hghVar;
    }
}
