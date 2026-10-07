package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class h6i extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ j6i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h6i(Object obj, lq4 lq4Var, j6i j6iVar, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = obj;
        this.h = j6iVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        j6i j6iVar = this.h;
        switch (i) {
            case 0:
                return new h6i(this.g, lq4Var, j6iVar, 0);
            case 1:
                h6i h6iVar = new h6i(j6iVar, lq4Var);
                h6iVar.g = obj;
                return h6iVar;
            default:
                return new h6i(this.g, lq4Var, j6iVar, 2);
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
            case 1:
                break;
        }
        return ((h6i) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        j6i j6iVar = this.h;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                zv8[] zv8VarArr = j6i.y;
                pvb pvbVarF = j6iVar.F();
                vsb vsbVar = new vsb((String) null);
                this.f = 1;
                Object objD = pvbVarF.D(vsbVar, this);
                return objD == hu4Var ? hu4Var : objD;
            case 1:
                gu4 gu4Var = (gu4) this.g;
                int i3 = this.f;
                try {
                    if (i3 == 0) {
                        ch3.d0(obj);
                        h6i h6iVar = new h6i(gu4Var, null, j6iVar, 0);
                        this.g = null;
                        this.f = 1;
                        obj = lvb.J0(500L, h6iVar, this);
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
                    break;
                } catch (Throwable th) {
                    obj = new poe(th);
                }
                return new roe(obj);
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
                zv8[] zv8VarArr2 = j6i.y;
                pvb pvbVarF2 = j6iVar.F();
                vsb vsbVar2 = new vsb((String) null);
                this.f = 1;
                Object objD2 = pvbVarF2.D(vsbVar2, this);
                return objD2 == hu4Var ? hu4Var : objD2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6i(j6i j6iVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 1;
        this.h = j6iVar;
    }
}
