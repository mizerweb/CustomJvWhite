package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class j83 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ t83 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j83(t83 t83Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = t83Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(this);
    }
}
