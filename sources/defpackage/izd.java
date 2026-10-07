package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class izd extends nq4 {
    public syd d;
    public die e;
    public long f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ kzd i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izd(kzd kzdVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = kzdVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.e(null, null, 0L, this);
    }
}
