package defpackage;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes2.dex */
public final class ib2 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ kb2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib2(kb2 kb2Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = kb2Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        kb2 kb2Var = this.g;
        switch (i) {
            case 0:
                return new ib2(kb2Var, lq4Var, 0);
            case 1:
                return new ib2(kb2Var, lq4Var, 1);
            default:
                return new ib2(kb2Var, lq4Var, 2);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((ib2) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return hu4Var;
            case 1:
                ((ib2) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return hu4Var;
            default:
                return ((ib2) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        iaj iajVar;
        zm2 zm2Var;
        Object objCollect;
        switch (this.e) {
            case 0:
                hu4 hu4Var = hu4.a;
                int i = this.f;
                if (i == 0) {
                    ch3.d0(obj);
                    kb2 kb2Var = this.g;
                    r8e r8eVar = kb2Var.f.g;
                    hb2 hb2Var = new hb2(kb2Var, 0);
                    this.f = 1;
                    if (r8eVar.a.collect(hb2Var, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                throw new KotlinNothingValueException();
            case 1:
                hu4 hu4Var2 = hu4.a;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    kb2 kb2Var2 = this.g;
                    q8e q8eVar = kb2Var2.f.i;
                    hb2 hb2Var2 = new hb2(kb2Var2, 1);
                    this.f = 1;
                    if (q8eVar.a.collect(hb2Var2, this) == hu4Var2) {
                        return hu4Var2;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                throw new KotlinNothingValueException();
            default:
                hu4 hu4Var3 = hu4.a;
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    kb2 kb2Var3 = this.g;
                    this.f = 1;
                    wfe wfeVar = new wfe();
                    synchronized (kb2Var3.p) {
                        iajVar = kb2Var3.x;
                        zm2Var = kb2Var3.y;
                        wfeVar.a = zm2Var;
                    }
                    if (iajVar == null || zm2Var == null || (objCollect = iajVar.i.collect(new he(wfeVar, 13, kb2Var3), this)) != hu4Var3) {
                        objCollect = sbi.a;
                    }
                    if (objCollect == hu4Var3) {
                        return hu4Var3;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbi.a;
        }
    }
}
