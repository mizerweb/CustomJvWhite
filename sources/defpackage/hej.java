package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hej extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public boolean f;
    public int g;
    public final /* synthetic */ rej h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hej(lq4 lq4Var, rej rejVar, boolean z) {
        super(2, lq4Var);
        this.h = rejVar;
        this.f = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        rej rejVar = this.h;
        switch (i) {
            case 0:
                return new hej(lq4Var, rejVar, this.f);
            default:
                return new hej(rejVar, lq4Var);
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
        return ((hej) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        switch (this.e) {
            case 0:
                sbi sbiVar = sbi.a;
                hu4 hu4Var = hu4.a;
                int i = this.g;
                if (i == 0) {
                    ch3.d0(obj);
                    es8 es8Var = this.h.p;
                    lx0 lx0Var = es8Var instanceof lx0 ? (lx0) es8Var : null;
                    if (lx0Var == null) {
                        es8 es8Var2 = this.h.p;
                        if (es8Var2 != null) {
                            es8Var2.b(new za9());
                        }
                        this.h.p = null;
                    } else if (this.f) {
                        lx0Var.a(sbiVar);
                        pzf pzfVar = this.h.l;
                        zdj zdjVar = zdj.a;
                        this.g = 1;
                        if (pzfVar.emit(zdjVar, this) == hu4Var) {
                            return hu4Var;
                        }
                    } else {
                        lx0Var.b(new xej());
                    }
                    return sbiVar;
                }
                if (i != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                this.h.p = null;
                return sbiVar;
            default:
                rej rejVar = this.h;
                hu4 hu4Var2 = hu4.a;
                int i2 = this.g;
                if (i2 == 0) {
                    ch3.d0(obj);
                    boolean zG = rejVar.g();
                    xdj xdjVarF = rejVar.f();
                    long j = rejVar.a;
                    long j2 = rejVar.b;
                    this.f = zG;
                    this.g = 1;
                    Object objA = xdjVarF.a(j, j2, this);
                    if (objA == hu4Var2) {
                        return hu4Var2;
                    }
                    obj = objA;
                    z = zG;
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = this.f;
                    ch3.d0(obj);
                }
                sej sejVar = (sej) obj;
                boolean z2 = sejVar != null && sejVar.e;
                boolean z3 = sejVar != null && sejVar.f;
                String str = sejVar != null ? sejVar.d : null;
                return new ox0(z, z2, z3, !(str == null || str.length() == 0));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hej(rej rejVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = rejVar;
    }
}
