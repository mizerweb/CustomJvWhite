package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class k80 extends nq4 {
    public long d;
    public long e;
    public String f;
    public ns5 g;
    public cf7 h;
    public af7 i;
    public sfa j;
    public b60 k;
    public /* synthetic */ Object l;
    public final /* synthetic */ m80 m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k80(m80 m80Var, nq4 nq4Var) {
        super(nq4Var);
        this.m = m80Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(0L, this, null, null, null, null);
    }
}
