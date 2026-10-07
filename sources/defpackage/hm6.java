package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hm6 extends nq4 {
    public long d;
    public int e;
    public int f;
    public em6 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ um6 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hm6(um6 um6Var, nq4 nq4Var) {
        super(nq4Var);
        this.i = um6Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return um6.a(this.i, 0L, this);
    }
}
