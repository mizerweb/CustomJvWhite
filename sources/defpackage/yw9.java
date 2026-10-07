package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yw9 extends mdh implements tf7 {
    public final /* synthetic */ int e = 0;
    public /* synthetic */ long f;
    public /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw9(jsa jsaVar, long j, lq4 lq4Var) {
        super(3, lq4Var);
        this.g = jsaVar;
        this.f = j;
    }

    @Override // defpackage.tf7
    public final Object i(Object obj, Object obj2, Object obj3) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        switch (i) {
            case 0:
                long jLongValue = ((Number) obj2).longValue();
                yw9 yw9Var = new yw9(3, (lq4) obj3);
                yw9Var.g = (rw9) obj;
                yw9Var.f = jLongValue;
                return yw9Var.invokeSuspend(sbiVar);
            default:
                new yw9((jsa) this.g, this.f, (lq4) obj3).invokeSuspend(sbiVar);
                return sbiVar;
        }
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                rw9 rw9Var = (rw9) this.g;
                long j = this.f;
                ch3.d0(obj);
                Object obj2 = null;
                if (cqk.d(rw9Var, pw9.a) || cqk.d(rw9Var, ow9.a)) {
                    return null;
                }
                if (!(rw9Var instanceof qw9)) {
                    ore.o();
                    return null;
                }
                for (Object obj3 : ((qw9) rw9Var).a) {
                    if (((kb9) obj3).a == j) {
                        obj2 = obj3;
                        return (kb9) obj2;
                    }
                }
                return (kb9) obj2;
            default:
                ch3.d0(obj);
                ((jsa) this.g).H2.n(this.f);
                return sbi.a;
        }
    }

    public /* synthetic */ yw9(int i, lq4 lq4Var) {
        super(i, lq4Var);
    }
}
