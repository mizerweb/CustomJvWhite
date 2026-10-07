package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class x85 extends mdh implements qf7 {
    public int e;
    public /* synthetic */ boolean f;
    public final /* synthetic */ y85 g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x85(int i, lq4 lq4Var, y85 y85Var) {
        super(2, lq4Var);
        this.g = y85Var;
        this.h = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        x85 x85Var = new x85(this.h, lq4Var, this.g);
        x85Var.f = ((Boolean) obj).booleanValue();
        return x85Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((x85) create(bool, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z = this.f;
        int i = this.e;
        sbi sbiVar = sbi.a;
        if (i != 0) {
            if (i == 1) {
                ch3.d0(obj);
                return sbiVar;
            }
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        if (z) {
            er3 er3Var = y85.N1;
            y85 y85Var = this.g;
            lk9 lk9VarC = ((n0c) y85Var.W()).c();
            ht1 ht1Var = new ht1(this.h, null, y85Var);
            this.f = z;
            this.e = 1;
            Object objK0 = yab.K0(lk9VarC, ht1Var, this);
            hu4 hu4Var = hu4.a;
            if (objK0 == hu4Var) {
                return hu4Var;
            }
        }
        return sbiVar;
    }
}
