package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class i01 extends nq4 {
    public long d;
    public /* synthetic */ Object e;
    public final /* synthetic */ l01 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i01(l01 l01Var, nq4 nq4Var) {
        super(nq4Var);
        this.f = l01Var;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.d(0L, this);
    }
}
