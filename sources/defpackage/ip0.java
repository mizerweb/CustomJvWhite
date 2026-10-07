package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ip0 extends mdh implements qf7 {
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ jp0 j;
    public final /* synthetic */ ym4 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip0(jp0 jp0Var, ym4 ym4Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = jp0Var;
        this.k = ym4Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        ip0 ip0Var = new ip0(this.j, this.k, lq4Var);
        ip0Var.i = obj;
        return ip0Var;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((ip0) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        gu4 gu4Var = (gu4) this.i;
        int i = this.h;
        lq4 lq4Var = null;
        jp0 jp0Var = this.j;
        if (i == 0) {
            ch3.d0(obj);
            ny8 ny8Var = jp0Var.a;
            ny8 ny8Var2 = jp0Var.a;
            ny8 ny8Var3 = jp0Var.d;
            boolean z4 = !((wsc) ny8Var.getValue()).c(wsc.g);
            boolean z5 = !((wsc) ny8Var2.getValue()).e();
            boolean z6 = !((wsc) ny8Var2.getValue()).c(wsc.i);
            xf5[] xf5VarArr = {yab.h(gu4Var, ((n0c) ((xhh) ny8Var3.getValue())).b(), 0, new m5(jp0Var, lq4Var, 8), 2), yab.h(gu4Var, ((n0c) ((xhh) ny8Var3.getValue())).b(), 0, new jhc(jp0Var, lq4Var, 10), 2), yab.h(gu4Var, ((n0c) ((xhh) ny8Var3.getValue())).a(), 0, new jhc(this.k, lq4Var, 11), 2)};
            this.i = null;
            this.e = z4;
            this.f = z5;
            this.g = z6;
            this.h = 1;
            Object objA = new dl0(xf5VarArr).a(this);
            hu4 hu4Var = hu4.a;
            if (objA == hu4Var) {
                return hu4Var;
            }
            obj = objA;
            z = z4;
            z2 = z6;
            z3 = z5;
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = this.g;
            z3 = this.f;
            z = this.e;
            ch3.d0(obj);
        }
        List list = (List) obj;
        ((Boolean) list.get(0)).booleanValue();
        ((Boolean) list.get(1)).booleanValue();
        ((Boolean) list.get(2)).booleanValue();
        jp0Var.e = z;
        jp0Var.g = z3;
        jp0Var.f = z2;
        return sbi.a;
    }
}
