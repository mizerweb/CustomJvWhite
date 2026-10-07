package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class iv0 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ mv0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv0(mv0 mv0Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = mv0Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return mv0.a(this.e, this);
    }
}
