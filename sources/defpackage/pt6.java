package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pt6 extends mdh implements cf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ zt6 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pt6(zt6 zt6Var, lq4 lq4Var, int i) {
        super(1, lq4Var);
        this.e = i;
        this.g = zt6Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        int i = this.e;
        zt6 zt6Var = this.g;
        switch (i) {
            case 0:
                return new pt6(zt6Var, lq4Var, 0);
            case 1:
                return new pt6(zt6Var, lq4Var, 1);
            default:
                return new pt6(zt6Var, lq4Var, 2);
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((pt6) create(lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        zt6 zt6Var = this.g;
        hu4 hu4Var = hu4.a;
        lq4 lq4Var = null;
        switch (i) {
            case 0:
                ifh ifhVar = zt6Var.i;
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                    } else {
                        if (i2 != 2) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    return sbi.a;
                }
                ch3.d0(obj);
                ppe ppeVar = (ppe) ifhVar.getValue();
                this.f = 1;
                obj = ppeVar.a(this);
                if (obj == hu4Var) {
                    return hu4Var;
                }
                ppe ppeVar2 = (ppe) ifhVar.getValue();
                qc5 qc5Var = new qc5(zt6Var, lq4Var, 14);
                this.f = 2;
                if (pol.b((fd4) obj, ppeVar2, qc5Var, this) == hu4Var) {
                    return hu4Var;
                }
                return sbi.a;
            case 1:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                ppe ppeVar3 = (ppe) zt6Var.i.getValue();
                this.f = 1;
                Object objA = ppeVar3.a(this);
                return objA == hu4Var ? hu4Var : objA;
            default:
                int i4 = this.f;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                uii uiiVar = zt6Var.t;
                this.f = 1;
                Object objA2 = uiiVar.a(this);
                return objA2 == hu4Var ? hu4Var : objA2;
        }
    }
}
