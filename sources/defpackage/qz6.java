package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qz6 extends nq4 {
    public /* synthetic */ Object d;
    public int e;
    public final /* synthetic */ jz f;
    public Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qz6(jz jzVar, lq4 lq4Var) {
        super(lq4Var);
        this.f = jzVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f.collect(null, this);
    }
}
