package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o43 extends mdh implements qf7 {
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o43(na9 na9Var, rt2 rt2Var, long j, long j2, lq4 lq4Var) {
        super(2, lq4Var);
        this.h = na9Var;
        this.i = rt2Var;
        this.f = j;
        this.g = j2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                long j = this.f;
                long j2 = this.g;
                return new o43(this.h, lq4Var, (x7a) obj2, j, j2);
            default:
                return new o43((na9) this.h, (rt2) obj2, this.f, this.g, lq4Var);
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
        return ((o43) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        Object obj2 = this.i;
        Object obj3 = this.h;
        switch (i) {
            case 0:
                x7a x7aVar = (x7a) obj2;
                ch3.d0(obj);
                e70 e70Var = (e70) obj3;
                y60 y60Var = e70Var.a;
                int i2 = y60Var == null ? -1 : n43.$EnumSwitchMapping$0[y60Var.ordinal()];
                if (i2 == 1) {
                    o60 o60Var = e70Var.b;
                    if (o60Var == null || o60Var.i != x7aVar.k()) {
                        return so2.I(e70Var);
                    }
                } else if (i2 == 2) {
                    d70 d70Var = e70Var.d;
                    if (d70Var == null || d70Var.a != x7aVar.k()) {
                        return so2.I(e70Var);
                    }
                } else if (i2 == 3) {
                    t60 t60Var = e70Var.g;
                    if (t60Var == null || t60Var.a != x7aVar.k()) {
                        return so2.I(e70Var);
                    }
                } else {
                    if (i2 != 4) {
                        return so2.I(e70Var);
                    }
                    j60 j60Var = e70Var.j;
                    if (j60Var == null || j60Var.a != x7aVar.k()) {
                        return so2.I(e70Var);
                    }
                }
                return null;
            default:
                ch3.d0(obj);
                qfa qfaVar = (qfa) ((na9) obj3).h.getValue();
                long j = ((rt2) obj2).a;
                toa toaVar = (toa) ((ose) qfaVar.b.c()).h();
                return new Integer((int) ((Number) ch3.G(toaVar.a, true, false, new boa(0, j, this.f, this.g, wja.DELETED, toaVar))).longValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o43(Object obj, lq4 lq4Var, x7a x7aVar, long j, long j2) {
        super(2, lq4Var);
        this.h = obj;
        this.i = x7aVar;
        this.f = j;
        this.g = j2;
    }
}
