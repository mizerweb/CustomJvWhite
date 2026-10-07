package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class irj extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public int f;
    public /* synthetic */ Object g;
    public final /* synthetic */ krj h;
    public final /* synthetic */ frj i;
    public final /* synthetic */ brj j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irj(brj brjVar, krj krjVar, frj frjVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.j = brjVar;
        this.h = krjVar;
        this.i = frjVar;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        brj brjVar = this.j;
        frj frjVar = this.i;
        krj krjVar = this.h;
        switch (i) {
            case 0:
                irj irjVar = new irj(brjVar, krjVar, frjVar, lq4Var);
                irjVar.g = obj;
                return irjVar;
            default:
                irj irjVar2 = new irj(krjVar, frjVar, brjVar, lq4Var);
                irjVar2.g = obj;
                return irjVar2;
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                return ((irj) create((String) obj, (lq4) obj2)).invokeSuspend(sbiVar);
            default:
                return ((irj) create((Throwable) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        brj brjVar = this.j;
        hu4 hu4Var = hu4.a;
        krj krjVar = this.h;
        switch (i) {
            case 0:
                String str = (String) this.g;
                int i2 = this.f;
                frj frjVar = this.i;
                if (i2 == 0) {
                    ch3.d0(obj);
                    erj erjVar = new erj(brjVar.b, brjVar.c, str);
                    p41 p41Var = krjVar.e;
                    String str2 = frjVar.a;
                    qs8 qs8Var = krjVar.a;
                    qs8Var.getClass();
                    fs8 fs8Var = new fs8(str2, qs8Var.b(erj.Companion.serializer(), erjVar), false);
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
                krj.f(krjVar, frjVar.a);
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
                ms8 ms8VarG = krj.g(th);
                l44 l44VarH = krjVar.h();
                p41 p41Var2 = krjVar.e;
                String str3 = brjVar.b;
                this.g = null;
                this.f = 1;
                return l44VarH.a(p41Var2, ms8VarG, this.i, str3, this) == hu4Var ? hu4Var : sbiVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irj(krj krjVar, frj frjVar, brj brjVar, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = krjVar;
        this.i = frjVar;
        this.j = brjVar;
    }
}
