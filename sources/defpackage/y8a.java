package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class y8a extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ z8a g;
    public final /* synthetic */ x8a h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8a(z8a z8aVar, x8a x8aVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = z8aVar;
        this.h = x8aVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        x8a x8aVar = this.h;
        z8a z8aVar = this.g;
        switch (i) {
            case 0:
                return new y8a(z8aVar, x8aVar, lq4Var, 0);
            default:
                return new y8a(z8aVar, x8aVar, lq4Var, 1);
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
        return ((y8a) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        x8a x8aVar = this.h;
        z8a z8aVar = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    pzf pzfVar = z8aVar.a;
                    this.f = 1;
                    return pzfVar.emit(x8aVar, this) == hu4Var ? hu4Var : sbiVar;
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
                    pzf pzfVar2 = z8aVar.a;
                    this.f = 1;
                    return pzfVar2.emit(x8aVar, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
