package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class qfj extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ sfj h;
    public final /* synthetic */ ifj i;
    public final /* synthetic */ pdj j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfj(pdj pdjVar, sfj sfjVar, ifj ifjVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = pdjVar;
        this.h = sfjVar;
        this.i = ifjVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        pdj pdjVar = this.j;
        ifj ifjVar = this.i;
        sfj sfjVar = this.h;
        switch (i) {
            case 0:
                qfj qfjVar = new qfj(pdjVar, sfjVar, ifjVar, lq4Var);
                qfjVar.g = obj;
                return qfjVar;
            default:
                qfj qfjVar2 = new qfj(sfjVar, ifjVar, pdjVar, lq4Var);
                qfjVar2.g = obj;
                return qfjVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((qfj) create((ox0) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((qfj) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        String strB;
        int i = this.e;
        sbi sbiVar = sbi.a;
        pdj pdjVar = this.j;
        hu4 hu4Var = hu4.a;
        sfj sfjVar = this.h;
        switch (i) {
            case 0:
                qs8 qs8Var = sfjVar.a;
                ifh ifhVar = sfjVar.e;
                ox0 ox0Var = (ox0) this.g;
                int i2 = this.f;
                ifj ifjVar = this.i;
                if (i2 == 0) {
                    ch3.d0(obj);
                    if (ox0Var.a) {
                        gfj gfjVar = new gfj(pdjVar.b, sfj.j, ox0Var.b, ox0Var.c, ox0Var.d, (String) ifhVar.getValue());
                        qs8Var.getClass();
                        strB = qs8Var.b(gfj.Companion.serializer(), gfjVar);
                    } else {
                        bgj bgjVar = new bgj(pdjVar.b, (String) ifhVar.getValue());
                        qs8Var.getClass();
                        strB = qs8Var.b(bgj.Companion.serializer(), bgjVar);
                    }
                    p41 p41Var = sfjVar.h;
                    fs8 fs8Var = new fs8(ifjVar.a, strB, false);
                    this.g = null;
                    this.f = 1;
                    if (p41Var.a(this, fs8Var) == hu4Var) {
                        return hu4Var;
                    }
                } else {
                    if (i2 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ch3.d0(obj);
                }
                sfj.f(sfjVar, ifjVar.a);
                return sbiVar;
            default:
                Throwable th = (Throwable) this.g;
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return sbiVar;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                ms8 ms8VarG = sfj.g(th);
                l44 l44VarH = sfjVar.h();
                p41 p41Var2 = sfjVar.h;
                String str = pdjVar.b;
                this.g = null;
                this.f = 1;
                return l44VarH.a(p41Var2, ms8VarG, this.i, str, this) == hu4Var ? hu4Var : sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfj(sfj sfjVar, ifj ifjVar, pdj pdjVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = sfjVar;
        this.i = ifjVar;
        this.j = pdjVar;
    }
}
