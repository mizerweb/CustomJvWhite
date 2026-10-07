package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k2h extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ p2h g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2h(p2h p2hVar, long j, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = p2hVar;
        this.h = j;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        switch (this.e) {
            case 0:
                return new k2h(this.g, this.h, lq4Var, 0);
            default:
                return new k2h(this.g, this.h, lq4Var, 1);
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
        return ((k2h) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        p2h p2hVar = this.g;
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
                aj5 aj5Var = p2hVar.a;
                this.f = 1;
                Object objL = aj5Var.l(this.h, this);
                return objL == hu4Var ? hu4Var : objL;
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
                aj5 aj5Var2 = p2hVar.a;
                this.f = 1;
                Object objJ = aj5Var2.j(this.h, false, 0L, this);
                return objJ == hu4Var ? hu4Var : objJ;
        }
    }
}
