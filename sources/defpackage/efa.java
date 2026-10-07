package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class efa extends nq4 {
    public q24 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ffa f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efa(ffa ffaVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = ffaVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.y(null, this);
    }
}
