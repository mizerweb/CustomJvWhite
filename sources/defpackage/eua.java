package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class eua extends nq4 {
    public kmb d;
    public qlb e;
    public /* synthetic */ Object f;
    public final /* synthetic */ hua g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eua(hua huaVar, nq4 nq4Var) {
        super(nq4Var);
        this.g = huaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.t(null, this);
    }
}
