package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class g6i extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ j6i e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6i(j6i j6iVar, nq4 nq4Var) {
        super(nq4Var);
        this.e = j6iVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return j6i.C(this.e, this);
    }
}
