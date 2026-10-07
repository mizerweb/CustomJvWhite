package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hf9 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ if9 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hf9(if9 if9Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = if9Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(0L, null, 0, null, false, false, this);
    }
}
