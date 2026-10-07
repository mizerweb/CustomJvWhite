package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tjf extends nq4 {
    public wjf d;
    public gu4 e;
    public Long f;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ wjf i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjf(wjf wjfVar, nq4 nq4Var) {
        super(nq4Var);
        this.i = wjfVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return wjf.E(this.i, null, this);
    }
}
