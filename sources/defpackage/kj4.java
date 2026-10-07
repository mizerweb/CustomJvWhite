package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class kj4 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ nj4 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj4(nj4 nj4Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = nj4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(0L, false, this);
    }
}
