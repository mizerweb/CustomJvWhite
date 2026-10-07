package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class t5b extends nq4 {
    public c79 d;
    public c79 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ x5b g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5b(x5b x5bVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = x5bVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.f(null, this);
    }
}
