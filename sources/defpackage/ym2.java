package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class ym2 extends nq4 {
    public wfe d;
    public wfe e;
    public /* synthetic */ Object f;
    public final /* synthetic */ zm2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym2(zm2 zm2Var, nq4 nq4Var) {
        super(nq4Var);
        this.g = zm2Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return zm2.i(this.g, this);
    }
}
