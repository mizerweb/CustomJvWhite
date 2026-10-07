package defpackage;

import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes3.dex */
public final class lyd extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ q8e h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lyd(q8e q8eVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = q8eVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        q8e q8eVar = this.h;
        switch (i) {
            case 0:
                lyd lydVar = new lyd(q8eVar, lq4Var, 0);
                lydVar.g = obj;
                return lydVar;
            default:
                lyd lydVar2 = new lyd(q8eVar, lq4Var, 1);
                lydVar2.g = obj;
                return lydVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        yx6 yx6Var = (yx6) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                ((lyd) create(yx6Var, lq4Var)).invokeSuspend(sbiVar);
                break;
            default:
                ((lyd) create(yx6Var, lq4Var)).invokeSuspend(sbiVar);
                break;
        }
        return hu4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        q8e q8eVar = this.h;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                yx6 yx6Var = (yx6) this.g;
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    sfe sfeVar = new sfe();
                    sfeVar.a = true;
                    kyd kydVar = new kyd(sfeVar, q8eVar, yx6Var, 0);
                    this.g = null;
                    this.f = 1;
                    if (q8eVar.a.collect(kydVar, this) == hu4Var) {
                        return hu4Var;
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
                yx6 yx6Var2 = (yx6) this.g;
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    sfe sfeVar2 = new sfe();
                    sfeVar2.a = true;
                    kyd kydVar2 = new kyd(sfeVar2, q8eVar, yx6Var2, 1);
                    this.g = null;
                    this.f = 1;
                    if (q8eVar.a.collect(kydVar2, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                throw new KotlinNothingValueException();
        }
    }
}
