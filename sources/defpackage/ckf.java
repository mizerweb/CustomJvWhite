package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ckf extends nq4 {
    public gu4 d;
    public long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ dkf g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckf(dkf dkfVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = dkfVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.C(null, this);
    }
}
