package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class gb8 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ rb8 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gb8(int i, lq4 lq4Var, rb8 rb8Var) {
        super(2, lq4Var);
        this.e = i;
        this.g = rb8Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        rb8 rb8Var = this.g;
        switch (i) {
            case 0:
                return new gb8(0, lq4Var, rb8Var);
            case 1:
                return new gb8(1, lq4Var, rb8Var);
            default:
                return new gb8(2, lq4Var, rb8Var);
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
        }
        return ((gb8) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, InvocationTargetException {
        int i = this.e;
        rb8 rb8Var = this.g;
        hu4 hu4Var = hu4.a;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = null;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    rb8Var.l.setValue(null);
                    gm0.n(rb8.u, "cancel prefetchJob");
                    sgg sggVar = rb8Var.o;
                    if (sggVar != null) {
                        sggVar.b(null);
                    }
                    rb8Var.o = null;
                    rb8Var.e();
                    sgg sggVar2 = rb8Var.o;
                    if (sggVar2 != null) {
                        this.f = 1;
                        if (sggVar2.g(this) == hu4Var) {
                            return hu4Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                return sbiVar;
            case 1:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    String str = rb8.u;
                    Object objK = cqk.k(new wd9(rb8Var, lq4Var, 7), this);
                    if (objK != hu4Var) {
                        objK = sbiVar;
                    }
                    if (objK == hu4Var) {
                        return hu4Var;
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
                    this.f = 1;
                    String str2 = rb8.u;
                    Object objK2 = cqk.k(new vq(rb8Var, lq4Var, 28), this);
                    if (objK2 != hu4Var) {
                        objK2 = sbiVar;
                    }
                    if (objK2 == hu4Var) {
                        return hu4Var;
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
