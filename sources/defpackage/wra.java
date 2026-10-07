package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class wra extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ jsa g;
    public final /* synthetic */ List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wra(jsa jsaVar, List list, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = jsaVar;
        this.h = list;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        List list = this.h;
        jsa jsaVar = this.g;
        switch (i) {
            case 0:
                return new wra(jsaVar, list, lq4Var, 0);
            default:
                return new wra(jsaVar, list, lq4Var, 1);
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
        return ((wra) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        List list = this.h;
        hu4 hu4Var = hu4.a;
        jsa jsaVar = this.g;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    long j = jsaVar.c.a;
                    this.f = 1;
                    return jsa.G(jsaVar, j, list, this) == hu4Var ? hu4Var : sbiVar;
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
                    zv8[] zv8VarArr = jsa.Z2;
                    g4b g4bVarJ = jsaVar.b0().J(2);
                    this.f = 1;
                    obj = jsa.L(jsaVar, list, g4bVarJ, this);
                    if (obj != hu4Var) {
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
                if (((Boolean) obj).booleanValue()) {
                    return sbiVar;
                }
                lk9 lk9VarC = ((n0c) jsaVar.j).c();
                wqa wqaVar = new wqa(jsaVar, null, 2);
                this.f = 2;
                if (yab.K0(lk9VarC, wqaVar, this) != hu4Var) {
                    return sbiVar;
                }
                return hu4Var;
        }
    }
}
