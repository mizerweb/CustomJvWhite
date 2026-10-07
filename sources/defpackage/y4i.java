package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y4i extends nq4 {
    public gbd d;
    public String e;
    public String[] f;
    public int g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ nub k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4i(nub nubVar, nq4 nq4Var) {
        super(nq4Var);
        this.k = nubVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return nub.c(this.k, null, 0, this);
    }
}
