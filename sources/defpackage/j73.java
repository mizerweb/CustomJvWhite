package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j73 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ l73 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j73(l73 l73Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = l73Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.H(this);
    }
}
