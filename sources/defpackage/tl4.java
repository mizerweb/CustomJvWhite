package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tl4 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ vl4 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl4(vl4 vl4Var, nq4 nq4Var) {
        super(nq4Var);
        this.e = vl4Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.v(0, this);
    }
}
