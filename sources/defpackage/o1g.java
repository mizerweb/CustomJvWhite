package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o1g extends nq4 {
    public rt2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ p1g f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1g(p1g p1gVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = p1gVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return p1g.a(this.f, null, this);
    }
}
