package defpackage;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes3.dex */
public final class w3c extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ x3c g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3c(x3c x3cVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = x3cVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        x3c x3cVar = this.g;
        switch (i) {
            case 0:
                return new w3c(x3cVar, lq4Var, 0);
            default:
                return new w3c(x3cVar, lq4Var, 1);
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
                ((w3c) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
                return hu4.a;
            default:
                return ((w3c) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        x3c x3cVar = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    x3c.a(x3cVar, this);
                    return hu4Var;
                }
                if (i2 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                throw new KotlinNothingValueException();
            default:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    if (x3cVar.c(new v3c(1, null), this) == hu4Var) {
                        return hu4Var;
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
