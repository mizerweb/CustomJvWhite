package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class gae extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ iae e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gae(iae iaeVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = iaeVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(this);
    }
}
