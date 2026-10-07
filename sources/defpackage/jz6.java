package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class jz6 extends mdh implements vf7 {
    public int e;
    public /* synthetic */ Throwable f;
    public /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ qf7 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jz6(long j, qf7 qf7Var, lq4 lq4Var) {
        super(4, lq4Var);
        this.h = j;
        this.i = qf7Var;
    }

    @Override // defpackage.vf7
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        jz6 jz6Var = new jz6(this.h, this.i, (lq4) obj4);
        jz6Var.f = (Throwable) obj2;
        jz6Var.g = jLongValue;
        return jz6Var.invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            ch3.d0(obj);
            Throwable th = this.f;
            if (this.g < this.h) {
                this.e = 1;
                obj = this.i.invoke(th, this);
                hu4 hu4Var = hu4.a;
                if (obj == hu4Var) {
                    return hu4Var;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        boolean z = ((Boolean) obj).booleanValue();
        return Boolean.valueOf(z);
    }
}
