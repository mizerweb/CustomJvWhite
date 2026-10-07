package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class do3 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ eo3 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do3(eo3 eo3Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = eo3Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return eo3.j(this.e, this);
    }
}
