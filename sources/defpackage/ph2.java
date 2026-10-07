package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ph2 extends nq4 {
    public String d;
    public gc2 e;
    public pb0 f;
    public int g;
    public long h;
    public /* synthetic */ Object i;
    public final /* synthetic */ d0c j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph2(d0c d0cVar, nq4 nq4Var) {
        super(nq4Var);
        this.j = d0cVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return this.j.i(null, 0, 0L, null, null, this);
    }
}
