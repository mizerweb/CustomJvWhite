package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class nlj extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ qlj h;
    public final /* synthetic */ klj i;
    public final /* synthetic */ glj j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nlj(glj gljVar, qlj qljVar, klj kljVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = gljVar;
        this.h = qljVar;
        this.i = kljVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        glj gljVar = this.j;
        klj kljVar = this.i;
        qlj qljVar = this.h;
        switch (i) {
            case 0:
                nlj nljVar = new nlj(gljVar, qljVar, kljVar, lq4Var);
                nljVar.g = obj;
                return nljVar;
            default:
                nlj nljVar2 = new nlj(qljVar, kljVar, gljVar, lq4Var);
                nljVar2.g = obj;
                return nljVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((nlj) create((ugb) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((nlj) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        glj gljVar = this.j;
        hu4 hu4Var = hu4.a;
        qlj qljVar = this.h;
        switch (i) {
            case 0:
                ugb ugbVar = (ugb) this.g;
                int i2 = this.f;
                klj kljVar = this.i;
                if (i2 == 0) {
                    ch3.d0(obj);
                    jlj jljVar = new jlj(gljVar.b, ugbVar.a, ugbVar.b);
                    qs8 qs8Var = qljVar.a;
                    qs8Var.getClass();
                    String strB = qs8Var.b(jlj.Companion.serializer(), jljVar);
                    p41 p41Var = qljVar.e;
                    fs8 fs8Var = new fs8(kljVar.a, strB, false);
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
                qlj.g(qljVar, kljVar.a);
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
                ms8 ms8VarF = qlj.f(qljVar, th);
                l44 l44VarH = qljVar.h();
                p41 p41Var2 = qljVar.e;
                String str = gljVar.b;
                this.g = null;
                this.f = 1;
                return l44VarH.a(p41Var2, ms8VarF, this.i, str, this) == hu4Var ? hu4Var : sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nlj(qlj qljVar, klj kljVar, glj gljVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = qljVar;
        this.i = kljVar;
        this.j = gljVar;
    }
}
