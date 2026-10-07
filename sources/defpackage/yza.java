package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class yza extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ a0b g;
    public final /* synthetic */ List h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yza(a0b a0bVar, List list, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = a0bVar;
        this.h = list;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        List list = this.h;
        a0b a0bVar = this.g;
        switch (i) {
            case 0:
                return new yza(a0bVar, list, lq4Var, 0);
            case 1:
                return new yza(a0bVar, list, lq4Var, 1);
            case 2:
                return new yza(a0bVar, list, lq4Var, 2);
            default:
                return new yza(a0bVar, list, lq4Var, 3);
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
            case 1:
                break;
            case 2:
                break;
        }
        return ((yza) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        lw5 lw5Var = lw5.SECONDS;
        List list = this.h;
        a0b a0bVar = this.g;
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
                ghb ghbVar = ew5.b;
                long jO = qe7.O(2, lw5Var);
                this.f = 1;
                Object objI = a0b.i(a0bVar, list, jO, this);
                return objI == hu4Var ? hu4Var : objI;
            case 1:
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
                ghb ghbVar2 = ew5.b;
                long jO2 = qe7.O(3, lw5Var);
                this.f = 1;
                Object objI2 = a0b.i(a0bVar, list, jO2, this);
                return objI2 == hu4Var ? hu4Var : objI2;
            case 2:
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
                ghb ghbVar3 = ew5.b;
                long jO3 = qe7.O(3, lw5Var);
                this.f = 1;
                Object objI3 = a0b.i(a0bVar, list, jO3, this);
                return objI3 == hu4Var ? hu4Var : objI3;
            default:
                int i5 = this.f;
                if (i5 != 0) {
                    if (i5 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                ghb ghbVar4 = ew5.b;
                long jP = qe7.P(1000L, lw5Var);
                this.f = 1;
                Object objI4 = a0b.i(a0bVar, list, jP, this);
                return objI4 == hu4Var ? hu4Var : objI4;
        }
    }
}
