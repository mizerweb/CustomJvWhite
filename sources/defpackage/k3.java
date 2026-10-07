package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k3 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ m3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(m3 m3Var, lq4 lq4Var) {
        super(lq4Var);
        this.e = m3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        this.e.collect(null, this);
        return hu4.a;
    }
}
