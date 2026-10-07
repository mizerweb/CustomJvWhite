package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ry4 extends nq4 {
    public long d;
    public long e;
    public vy2 f;
    public sy4 g;
    public j9b h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ sy4 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry4(sy4 sy4Var, nq4 nq4Var) {
        super(nq4Var);
        this.l = sy4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.p(0L, null, this);
    }
}
