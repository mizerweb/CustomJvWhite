package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class p72 extends nq4 {
    public njd d;
    public /* synthetic */ Object e;
    public final /* synthetic */ q72 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p72(q72 q72Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = q72Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.f(null, this);
    }
}
