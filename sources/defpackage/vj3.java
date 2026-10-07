package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class vj3 extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ fk3 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj3(Object obj, lq4 lq4Var, fk3 fk3Var) {
        super(2, lq4Var);
        this.g = obj;
        this.h = fk3Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        fk3 fk3Var = this.h;
        switch (i) {
            case 0:
                vj3 vj3Var = new vj3(fk3Var, lq4Var);
                vj3Var.g = obj;
                return vj3Var;
            default:
                return new vj3(this.g, lq4Var, fk3Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((vj3) create((l48) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((vj3) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        fk3 fk3Var = this.h;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                l48 l48Var = (l48) this.g;
                int i2 = this.f;
                sbi sbiVar = sbi.a;
                if (i2 == 0) {
                    ch3.d0(obj);
                    mjg mjgVar = fk3Var.E;
                    jj3 jj3Var = new jj3(ij3.c, "", l48Var, r66.a, false, false, false);
                    this.g = null;
                    this.f = 1;
                    mjgVar.getClass();
                    mjgVar.j(null, jj3Var);
                    if (sbiVar == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
            default:
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
                f9f f9fVar = (f9f) this.g;
                i9f i9fVar = fk3Var.f;
                this.f = 1;
                Object objD = i9fVar.d(f9fVar, this);
                return objD == hu4Var ? hu4Var : objD;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj3(fk3 fk3Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = fk3Var;
    }
}
