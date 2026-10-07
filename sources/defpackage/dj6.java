package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dj6 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ ej6 g;
    public final /* synthetic */ lc8 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dj6(ej6 ej6Var, lc8 lc8Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = ej6Var;
        this.h = lc8Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        lc8 lc8Var = this.h;
        ej6 ej6Var = this.g;
        switch (i) {
            case 0:
                return new dj6(ej6Var, lc8Var, lq4Var, 0);
            default:
                return new dj6(ej6Var, lc8Var, lq4Var, 1);
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
        return ((dj6) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        boolean z = false;
        z = false;
        lc8 lc8Var = this.h;
        hu4 hu4Var = hu4.a;
        ej6 ej6Var = this.g;
        byte b = 0;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    sua suaVar = (sua) ej6Var.f.getValue();
                    long j = lc8Var.c;
                    this.f = 1;
                    obj = suaVar.f(j, this);
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
                sfa sfaVar = (sfa) obj;
                h60 h60VarQ = sfaVar != null ? sfaVar.q() : null;
                if ((h60VarQ != null ? h60VarQ.a : 0) == 4 && h60VarQ.b == ej6Var.c) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                    } else {
                        if (i3 != 2) {
                            ore.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ch3.d0(obj);
                    }
                    return sbi.a;
                }
                ch3.d0(obj);
                xt4 xt4VarB = ((n0c) ej6Var.a).b();
                dj6 dj6Var = new dj6(ej6Var, lc8Var, b == true ? 1 : 0, z ? 1 : 0);
                this.f = 1;
                obj = yab.K0(xt4VarB, dj6Var, this);
                if (obj == hu4Var) {
                    return hu4Var;
                }
                if (((Boolean) obj).booleanValue()) {
                    pzf pzfVar = ej6Var.d;
                    this.f = 2;
                    if (pzfVar.emit(cj6.a, this) == hu4Var) {
                        return hu4Var;
                    }
                }
                return sbi.a;
        }
    }
}
