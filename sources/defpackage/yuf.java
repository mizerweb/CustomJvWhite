package defpackage;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class yuf extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ gvf g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yuf(gvf gvfVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = gvfVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        gvf gvfVar = this.g;
        switch (i) {
            case 0:
                return new yuf(gvfVar, lq4Var, 0);
            case 1:
                return new yuf(gvfVar, lq4Var, 1);
            case 2:
                return new yuf(gvfVar, lq4Var, 2);
            default:
                return new yuf(gvfVar, lq4Var, 3);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((yuf) create((vjd) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 1:
                return ((yuf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            case 2:
                return ((yuf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((yuf) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        hu4 hu4Var = hu4.a;
        gvf gvfVar = this.g;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return gvf.D(gvfVar, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i2 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
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
                zv8[] zv8VarArr = gvf.C;
                utd utdVar = (utd) gvfVar.n.getValue();
                long jT = ((s7f) gvfVar.F()).t();
                this.f = 1;
                Object objB = utdVar.b(jT, this);
                return objB == hu4Var ? hu4Var : objB;
            case 2:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    return gvf.D(gvfVar, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i4 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i5 = this.f;
                if (i5 == 0) {
                    ch3.d0(obj);
                    xdj xdjVar = (xdj) gvfVar.m.getValue();
                    long jT2 = ((s7f) gvfVar.F()).t();
                    this.f = 1;
                    obj = ch3.I(this, xdjVar.a, true, false, new jqh(jT2, 2));
                    if (obj == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i5 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return Boolean.valueOf(!((Collection) obj).isEmpty());
        }
    }
}
