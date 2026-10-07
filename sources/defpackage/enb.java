package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class enb extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ gnb g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ enb(gnb gnbVar, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = gnbVar;
        this.h = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new enb(this.g, this.h, lq4Var, 0);
            default:
                return new enb(this.g, this.h, lq4Var, 1);
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
        return ((enb) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        gnb gnbVar = this.g;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    hua huaVar = (hua) gnbVar.h.getValue();
                    this.f = 1;
                    Object objA = huaVar.r.a(this, new tta(huaVar, this.h, -1L));
                    if (objA != hu4Var) {
                        objA = sbiVar;
                    }
                    if (objA == hu4Var) {
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
                if (i3 == 0) {
                    ch3.d0(obj);
                    hua huaVar2 = (hua) gnbVar.h.getValue();
                    this.f = 1;
                    Object objA2 = huaVar2.r.a(this, new tta(huaVar2, this.h, -1L));
                    if (objA2 != hu4Var) {
                        objA2 = sbiVar;
                    }
                    if (objA2 == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
        }
    }
}
