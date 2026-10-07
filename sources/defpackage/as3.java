package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class as3 extends nq4 {
    public q24 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ bs3 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as3(bs3 bs3Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = bs3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(null, 0L, 0, 0L, 0, 0L, null, this);
    }
}
