package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class asa extends mdh implements qf7 {
    public l9b e;
    public jsa f;
    public long g;
    public boolean h;
    public boolean i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ jsa l;
    public final /* synthetic */ long m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public asa(jsa jsaVar, long j, boolean z, boolean z2, lq4 lq4Var) {
        super(2, lq4Var);
        this.l = jsaVar;
        this.m = j;
        this.n = z;
        this.o = z2;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        asa asaVar = new asa(this.l, this.m, this.n, this.o, lq4Var);
        asaVar.k = obj;
        return asaVar;
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((asa) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        jsa jsaVar;
        long j;
        boolean z;
        boolean z2;
        l9b l9bVar;
        gu4 gu4Var = (gu4) this.k;
        int i = this.j;
        if (i == 0) {
            ch3.d0(obj);
            jsaVar = this.l;
            l9b l9bVar2 = jsaVar.v2;
            this.k = gu4Var;
            this.e = l9bVar2;
            this.f = jsaVar;
            j = this.m;
            this.g = j;
            z = this.n;
            this.h = z;
            z2 = this.o;
            this.i = z2;
            this.j = 1;
            Object objB = l9bVar2.b(this);
            hu4 hu4Var = hu4.a;
            if (objB == hu4Var) {
                return hu4Var;
            }
            l9bVar = l9bVar2;
        } else {
            if (i != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = this.i;
            z = this.h;
            j = this.g;
            jsaVar = this.f;
            l9bVar = this.e;
            ch3.d0(obj);
        }
        long j2 = j;
        jsa jsaVar2 = jsaVar;
        boolean z3 = z2;
        boolean z4 = z;
        try {
            sgg sggVar = jsaVar2.r2;
            if (sggVar == null || !sggVar.isActive()) {
                jsaVar2.r2 = yab.i0(gu4Var, ((n0c) jsaVar2.j).b(), 0, new zra(jsaVar2, j2, z4, z3, null), 2);
            }
            return sbi.a;
        } finally {
            l9bVar.g(null);
        }
    }
}
