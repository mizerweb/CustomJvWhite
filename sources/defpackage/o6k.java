package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class o6k extends nq4 {
    public Object d;
    public l9b e;
    public /* synthetic */ Object f;
    public final /* synthetic */ n7k g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6k(n7k n7kVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = n7kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(this);
    }
}
