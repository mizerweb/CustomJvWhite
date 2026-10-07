package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l80 extends nq4 {
    public long d;
    public long e;
    public String f;
    public ns5 g;
    public cf7 h;
    public af7 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ m80 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l80(m80 m80Var, nq4 nq4Var) {
        super(nq4Var);
        this.k = m80Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.e(0L, null, 0L, null, null, null, this);
    }
}
