package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class fvf extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ gvf g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fvf(gvf gvfVar, int i, lq4 lq4Var, int i2) {
        super(2, lq4Var);
        this.e = i2;
        this.g = gvfVar;
        this.h = i;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        int i2 = this.h;
        gvf gvfVar = this.g;
        switch (i) {
            case 0:
                return new fvf(gvfVar, i2, lq4Var, 0);
            default:
                return new fvf(gvfVar, i2, lq4Var, 1);
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
        return ((fvf) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        hu4 hu4Var = hu4.a;
        gvf gvfVar = this.g;
        int i2 = this.h;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    zv8[] zv8VarArr = gvf.C;
                    if (nbh.c(gvfVar.E().d.getString("app.privacy.chats.invite", "ALL")) != i2) {
                        gvfVar.E().e("app.privacy.chats.invite", nbh.k(i2));
                        pvb pvbVar = (pvb) gvfVar.e.getValue();
                        ini iniVar = new ini();
                        iniVar.o = i2;
                        pvbVar.q(new lni(iniVar));
                        this.f = 1;
                        if (gvf.D(gvfVar, this) == hu4Var) {
                            return hu4Var;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
            default:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    zv8[] zv8VarArr2 = gvf.C;
                    if (nbh.c(gvfVar.E().d.getString("app.privacy.incoming.call", "ALL")) != i2) {
                        gvfVar.E().e("app.privacy.incoming.call", nbh.k(i2));
                        pvb pvbVar2 = (pvb) gvfVar.e.getValue();
                        ini iniVar2 = new ini();
                        iniVar2.p = i2;
                        pvbVar2.q(new lni(iniVar2));
                        this.f = 1;
                        if (gvf.D(gvfVar, this) == hu4Var) {
                            return hu4Var;
                        }
                    }
                } else {
                    if (i4 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
        }
    }
}
