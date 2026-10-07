package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class f24 extends mdh implements cf7 {
    public final /* synthetic */ int e = 0;
    public int f;
    public final /* synthetic */ q24 g;
    public final /* synthetic */ long h;
    public final /* synthetic */ Long i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f24(g24 g24Var, q24 q24Var, long j, dz3 dz3Var, Long l, lq4 lq4Var) {
        super(1, lq4Var);
        this.j = g24Var;
        this.g = q24Var;
        this.h = j;
        this.k = dz3Var;
        this.i = l;
    }

    @Override // defpackage.mq0
    public final lq4 create(lq4 lq4Var) {
        int i = this.e;
        Object obj = this.k;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                Long l = this.i;
                return new f24((g24) obj2, this.g, this.h, (dz3) obj, l, lq4Var);
            default:
                long j = this.h;
                Long l2 = this.i;
                return new f24((l34) obj2, this.g, (gda) obj, j, l2, lq4Var);
        }
    }

    @Override // defpackage.cf7
    public final Object invoke(Object obj) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        lq4 lq4Var = (lq4) obj;
        switch (i) {
            case 0:
                break;
        }
        return ((f24) create(lq4Var)).invokeSuspend(sbiVar);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        Object obj2 = this.k;
        Object obj3 = this.j;
        hu4 hu4Var = hu4.a;
        Long l = null;
        switch (i) {
            case 0:
                int i2 = this.f;
                if (i2 == 0) {
                    ch3.d0(obj);
                    this.f = 1;
                    Object objG = g24.g((g24) obj3, this.g, this.h, (dz3) obj2, this.i, this);
                    return objG == hu4Var ? hu4Var : objG;
                }
                if (i2 == 1) {
                    ch3.d0(obj);
                    return obj;
                }
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                int i3 = this.f;
                if (i3 != 0) {
                    if (i3 == 1) {
                        ch3.d0(obj);
                        return obj;
                    }
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ch3.d0(obj);
                ki8 ki8Var = (ki8) ((l34) obj3).d.getValue();
                gda gdaVar = (gda) obj2;
                Long l2 = this.i;
                if (l2 != null && l2.longValue() >= 0) {
                    l = l2;
                }
                v7e v7eVar = new v7e(l);
                this.f = 1;
                Object objB = ki8.b(ki8Var, this.g, gdaVar, this.h, false, v7eVar, this, 24);
                return objB == hu4Var ? hu4Var : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f24(l34 l34Var, q24 q24Var, gda gdaVar, long j, Long l, lq4 lq4Var) {
        super(1, lq4Var);
        this.j = l34Var;
        this.g = q24Var;
        this.k = gdaVar;
        this.h = j;
        this.i = l;
    }
}
