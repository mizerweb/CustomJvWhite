package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n3i extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ x3i h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3i(x3i x3iVar, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.h = x3iVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        x3i x3iVar = this.h;
        switch (i) {
            case 0:
                n3i n3iVar = new n3i(x3iVar, lq4Var, 0);
                n3iVar.g = obj;
                return n3iVar;
            default:
                n3i n3iVar2 = new n3i(x3iVar, lq4Var, 1);
                n3iVar2.g = obj;
                return n3iVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((n3i) create((if8) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((n3i) create((te8) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        x3i x3iVar = this.h;
        hu4 hu4Var = hu4.a;
        switch (i) {
            case 0:
                if8 if8Var = (if8) this.g;
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
                if (!(if8Var instanceof gf8) || ((gf8) if8Var).j == 1) {
                    return sbiVar;
                }
                p41 p41Var = x3iVar.s;
                p3i p3iVar = new p3i(true, 1);
                this.g = null;
                this.f = 1;
                return p41Var.a(this, p3iVar) == hu4Var ? hu4Var : sbiVar;
            default:
                te8 te8Var = (te8) this.g;
                int i3 = this.f;
                if (i3 == 0) {
                    ch3.d0(obj);
                    this.g = null;
                    this.f = 1;
                    return x3iVar.f(te8Var, this) == hu4Var ? hu4Var : sbiVar;
                }
                if (i3 == 1) {
                    ch3.d0(obj);
                    return sbiVar;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
