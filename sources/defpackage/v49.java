package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class v49 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ c59 g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v49(c59 c59Var, String str, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = c59Var;
        this.h = str;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        String str = this.h;
        c59 c59Var = this.g;
        switch (i) {
            case 0:
                return new v49(c59Var, str, lq4Var, 0);
            default:
                return new v49(c59Var, str, lq4Var, 1);
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
        return ((v49) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i = this.e;
        String str = this.h;
        c59 c59Var = this.g;
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
                o24 o24Var = new o24(((sy4) c59Var.p.getValue()).n, 11, str);
                this.f = 1;
                Object objP = e9i.P(o24Var, this);
                return objP == hu4Var ? hu4Var : objP;
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
                ul7 ul7Var = (ul7) c59Var.r.getValue();
                this.f = 1;
                Object objA = ul7Var.a(str, this);
                return objA == hu4Var ? hu4Var : objA;
        }
    }
}
