package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class yzi extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ ki1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzi(ki1 ki1Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = ki1Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
