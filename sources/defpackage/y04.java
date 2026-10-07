package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class y04 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ a14 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y04(a14 a14Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = a14Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(this);
    }
}
