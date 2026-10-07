package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class mm0 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ nm0 g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mm0(nm0 nm0Var, boolean z, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = nm0Var;
        this.h = z;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new mm0(this.g, this.h, lq4Var, 0);
            default:
                return new mm0(this.g, this.h, lq4Var, 1);
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
        return ((mm0) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        boolean z = this.h;
        nm0 nm0Var = this.g;
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
                this.f = 1;
                zv8[] zv8VarArr = nm0.i;
                nm0Var.getClass();
                Object objK = cqk.k(new km0(nm0Var, z, true, null), this);
                return objK == hu4Var ? hu4Var : objK;
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
                this.f = 1;
                zv8[] zv8VarArr2 = nm0.i;
                nm0Var.getClass();
                Object objK2 = cqk.k(new km0(nm0Var, !z, false, null), this);
                return objK2 == hu4Var ? hu4Var : objK2;
        }
    }
}
