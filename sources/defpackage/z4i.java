package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z4i extends nq4 {
    public gbd d;
    public String e;
    public String[] f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public final /* synthetic */ nub j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4i(nub nubVar, nq4 nq4Var) {
        super(nq4Var);
        this.j = nubVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return nub.d(this.j, null, 0, this);
    }
}
