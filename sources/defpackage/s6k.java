package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s6k extends nq4 {
    public g7k d;
    public /* synthetic */ Object e;
    public final /* synthetic */ g7k f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6k(g7k g7kVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = g7kVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.e(this);
    }
}
