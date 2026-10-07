package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class u3i extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public final /* synthetic */ x3i g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u3i(x3i x3iVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.g = x3iVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        x3i x3iVar = this.g;
        switch (i) {
            case 0:
                return new u3i(x3iVar, lq4Var, 0);
            case 1:
                return new u3i(x3iVar, lq4Var, 1);
            case 2:
                return new u3i(x3iVar, lq4Var, 2);
            default:
                return new u3i(x3iVar, lq4Var, 3);
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
        return ((u3i) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        boolean z = false;
        sbi sbiVar = sbi.a;
        x3i x3iVar = this.g;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                p41 p41Var = x3iVar.s;
                p3i p3iVar = new p3i(false, 2);
                this.f = 1;
                return p41Var.a(this, p3iVar) == hu4Var ? hu4Var : sbiVar;
            case 1:
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    zv8[] zv8VarArr = x3i.w;
                    onf onfVar = (onf) x3iVar.h.getValue();
                    this.f = 1;
                    if (upl.a(onfVar, 3, this) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i3 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                if (((Boolean) ((e5d) x3iVar.c.getValue()).O5.a(e5d.S6[354]).i()).booleanValue()) {
                    if8 if8Var = (if8) ((bf8) x3iVar.r.getValue()).i.a.getValue();
                    if ((if8Var instanceof gf8) && ((gf8) if8Var).j != 1) {
                        z = true;
                    }
                }
                x3iVar.s.c(new p3i(z, 1));
                return sbiVar;
            case 2:
                int i4 = this.f;
                if (i4 == 0) {
                    ch3.d0(obj);
                    p41 p41Var2 = x3iVar.s;
                    this.f = 1;
                    return p41Var2.a(this, q3i.a) == hu4Var ? hu4Var : sbiVar;
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
                    p41 p41Var3 = x3iVar.s;
                    this.f = 1;
                    return p41Var3.a(this, r3i.a) == hu4Var ? hu4Var : sbiVar;
                }
                if (i5 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
