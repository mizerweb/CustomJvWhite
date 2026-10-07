package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n2h extends nq4 {
    public long d;
    public Long e;
    public kwg f;
    public l9b g;
    public /* synthetic */ Object h;
    public final /* synthetic */ p2h i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2h(p2h p2hVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = p2hVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.b(0L, this);
    }
}
