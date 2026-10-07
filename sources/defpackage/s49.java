package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s49 extends nq4 {
    public njd d;
    public /* synthetic */ Object e;
    public final /* synthetic */ c59 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s49(c59 c59Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = c59Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.i(null, null, this);
    }
}
