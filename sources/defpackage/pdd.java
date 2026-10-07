package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class pdd extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ qf7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdd(qf7 qf7Var, Object obj, lq4 lq4Var) {
        super(2, lq4Var);
        this.e = 2;
        this.h = qf7Var;
        this.g = obj;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        qf7 qf7Var = this.h;
        switch (i) {
            case 0:
                pdd pddVar = new pdd(qf7Var, lq4Var, 0);
                pddVar.g = obj;
                return pddVar;
            case 1:
                pdd pddVar2 = new pdd(qf7Var, lq4Var, 1);
                pddVar2.g = obj;
                return pddVar2;
            default:
                return new pdd(qf7Var, this.g, lq4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((pdd) create((x8b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((pdd) create((x8b) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((pdd) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        qf7 qf7Var = this.h;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    x8b x8bVar = (x8b) this.g;
                    this.f = 1;
                    obj = qf7Var.invoke(x8bVar, this);
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                x8b x8bVar2 = (x8b) obj;
                x8bVar2.b.set(true);
                return x8bVar2;
            case 1:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    x8b x8bVar3 = new x8b(new LinkedHashMap(Collections.unmodifiableMap(((x8b) this.g).a)), false);
                    this.g = x8bVar3;
                    this.f = 1;
                    return qf7Var.invoke(x8bVar3, this) == hu4Var ? hu4Var : x8bVar3;
                }
                if (i3 != 1) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                x8b x8bVar4 = (x8b) this.g;
                ch3.d0(obj);
                return x8bVar4;
            default:
                int i4 = this.f;
                if (i4 != 0) {
                    if (i4 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                Object obj2 = this.g;
                this.f = 1;
                Object objInvoke = qf7Var.invoke(obj2, this);
                return objInvoke == hu4Var ? hu4Var : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pdd(qf7 qf7Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = qf7Var;
    }
}
