package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class zpj extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ dqj h;
    public final /* synthetic */ xpj i;
    public final /* synthetic */ kkj j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpj(dqj dqjVar, kkj kkjVar, xpj xpjVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = dqjVar;
        this.j = kkjVar;
        this.i = xpjVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        kkj kkjVar = this.j;
        xpj xpjVar = this.i;
        dqj dqjVar = this.h;
        switch (i) {
            case 0:
                zpj zpjVar = new zpj(dqjVar, kkjVar, xpjVar, lq4Var);
                zpjVar.g = obj;
                return zpjVar;
            default:
                zpj zpjVar2 = new zpj(dqjVar, xpjVar, kkjVar, lq4Var);
                zpjVar2.g = obj;
                return zpjVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((zpj) create((pqj) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((zpj) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        kkj kkjVar = this.j;
        hu4 hu4Var = hu4.a;
        dqj dqjVar = this.h;
        switch (i) {
            case 0:
                pqj pqjVar = (pqj) this.g;
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
                qs8 qs8Var = dqjVar.a;
                nkj nkjVar = new nkj(kkjVar.a, pqjVar);
                qs8Var.getClass();
                String strB = qs8Var.b(nkj.Companion.serializer(), nkjVar);
                p41 p41Var = dqjVar.f;
                fs8 fs8Var = new fs8(this.i.a, strB, false);
                this.g = null;
                this.f = 1;
                return p41Var.a(this, fs8Var) == hu4Var ? hu4Var : sbiVar;
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
                ms8 ms8VarF = dqj.f(th);
                l44 l44VarG = dqjVar.g();
                p41 p41Var2 = dqjVar.f;
                String str = kkjVar.a;
                this.g = null;
                this.f = 1;
                return l44VarG.a(p41Var2, ms8VarF, this.i, str, this) == hu4Var ? hu4Var : sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zpj(dqj dqjVar, xpj xpjVar, kkj kkjVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = dqjVar;
        this.i = xpjVar;
        this.j = kkjVar;
    }
}
