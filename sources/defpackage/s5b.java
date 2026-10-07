package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class s5b extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ x5b e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5b(x5b x5bVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = x5bVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.d(null, this);
    }
}
