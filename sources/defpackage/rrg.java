package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class rrg extends nq4 {
    public l9b d;
    public /* synthetic */ Object e;
    public final /* synthetic */ asg f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rrg(asg asgVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = asgVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.b(this);
    }
}
