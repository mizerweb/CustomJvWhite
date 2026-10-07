package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a7k extends nq4 {
    public g7k d;
    public String e;
    public /* synthetic */ Object f;
    public final /* synthetic */ g7k g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7k(g7k g7kVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = g7kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, this);
    }
}
