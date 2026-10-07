package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class ge1 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ pe1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge1(pe1 pe1Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = pe1Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.e(null, null, this);
    }
}
