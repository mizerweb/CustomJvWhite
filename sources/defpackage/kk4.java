package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kk4 extends mdh implements qf7 {
    public final /* synthetic */ int e = 1;
    public /* synthetic */ Object f;
    public final /* synthetic */ pk4 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk4(Object obj, lq4 lq4Var, pk4 pk4Var) {
        super(2, lq4Var);
        this.f = obj;
        this.g = pk4Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        pk4 pk4Var = this.g;
        switch (i) {
            case 0:
                kk4 kk4Var = new kk4(pk4Var, lq4Var);
                kk4Var.f = obj;
                return kk4Var;
            default:
                return new kk4(this.f, lq4Var, pk4Var);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                ((kk4) create((ssc) obj, (lq4) obj2)).invokeSuspend(sbiVar);
                return sbiVar;
            default:
                return ((kk4) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbiVar);
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                ssc sscVar = (ssc) this.f;
                ch3.d0(obj);
                String str = this.g.o;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.d;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, "Contact permission was changed, isGranted = " + sscVar + ". Make reload", null);
                    }
                }
                this.g.a();
                return sbi.a;
            default:
                ch3.d0(obj);
                return pk4.f(this.g, (vg4) this.f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk4(pk4 pk4Var, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = pk4Var;
    }
}
