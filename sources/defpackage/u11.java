package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u11 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ w11 g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u11(int i, long j, w11 w11Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = i;
        this.g = w11Var;
        this.h = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new u11(0, this.h, this.g, lq4Var);
            default:
                return new u11(1, this.h, this.g, lq4Var);
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
        return ((u11) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        w11 w11Var = this.g;
        long j = this.h;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return w11.C(w11Var, j, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i2 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    p2h p2hVar = w11Var.z;
                    this.f = 1;
                    if (p2hVar.c(j, this) != hu4Var) {
                    }
                    return hu4Var;
                }
                if (i3 != 1) {
                    if (i3 == 2) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                this.f = 2;
                if (w11.C(w11Var, j, this) != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
        }
    }
}
