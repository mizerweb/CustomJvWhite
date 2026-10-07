package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class zra extends mdh implements qf7 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ jsa g;
    public final /* synthetic */ long h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zra(jsa jsaVar, long j, boolean z, boolean z2, lq4 lq4Var) {
        super(2, lq4Var);
        this.g = jsaVar;
        this.h = j;
        this.i = z;
        this.j = z2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        zra zraVar = new zra(this.g, this.h, this.i, this.j, lq4Var);
        zraVar.f = obj;
        return zraVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((zra) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        zra zraVar;
        gu4 gu4Var = (gu4) this.f;
        int i = this.e;
        sbi sbiVar = sbi.a;
        jsa jsaVar = this.g;
        if (i == 0) {
            ch3.d0(obj);
            rt2 rt2Var = (rt2) jsaVar.w2.a.getValue();
            if (rt2Var != null) {
                l93 l93Var = (l93) jsaVar.X.getValue();
                long j = rt2Var.a;
                long jA = rt2Var.A();
                this.f = gu4Var;
                this.e = 1;
                zraVar = this;
                Object objA = l93Var.a(j, jA, this.h, this.i, zraVar);
                hu4 hu4Var = hu4.a;
                if (objA == hu4Var) {
                    return hu4Var;
                }
            }
            return sbiVar;
        }
        if (i != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        zraVar = this;
        if (zraVar.j) {
            cqk.m(gu4Var);
            a8j.x(jsaVar.E2, bja.a);
            return sbiVar;
        }
        return sbiVar;
    }
}
