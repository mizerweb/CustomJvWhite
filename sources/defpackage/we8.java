package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class we8 extends nq4 {
    public ye8 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ye8 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we8(ye8 ye8Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = ye8Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return ye8.h(this.f, this);
    }
}
