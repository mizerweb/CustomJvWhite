package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class h8i extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ k8i g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8i(k8i k8iVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = k8iVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        k8i k8iVar = this.g;
        switch (i) {
            case 0:
                return new h8i(k8iVar, lq4Var, 0);
            default:
                return new h8i(k8iVar, lq4Var, 1);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((h8i) create((vjd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((h8i) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        hu4 hu4Var = hu4.a;
        k8i k8iVar = this.g;
        switch (i) {
            case 0:
                ny8 ny8Var = k8iVar.d;
                int i2 = this.f;
                sbi sbiVar = sbi.a;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    Object objK0 = yab.K0(((n0c) ((xhh) ny8Var.getValue())).a(), new xra(k8iVar, null, 28), this);
                    if (objK0 != hu4Var) {
                        objK0 = sbiVar;
                    }
                    if (objK0 == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                zv8[] zv8VarArr = k8i.o;
                vjd vjdVar = (vjd) ((utd) k8iVar.g.getValue()).c(((s7f) ((et3) k8iVar.f.getValue())).t()).getValue();
                if (vjdVar == null || !vjdVar.c.contains(tsd.SECOND_FACTOR_HAS_EMAIL)) {
                    gm0.Y(k8i.class.getName(), "Early return in loadDetails cuz of profile == null || !profile.hasTwoFAEmail()");
                } else {
                    k8iVar.n.B(k8iVar, k8i.o[1], yab.h0(k8iVar.b, ((n0c) ((xhh) ny8Var.getValue())).b(), 2, new j8i(k8iVar, (lq4) null, 2)));
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
                zv8[] zv8VarArr2 = k8i.o;
                utd utdVar = (utd) k8iVar.g.getValue();
                long jT = ((s7f) ((et3) k8iVar.f.getValue())).t();
                this.f = 1;
                Object objB = utdVar.b(jT, this);
                return objB == hu4Var ? hu4Var : objB;
        }
    }
}
