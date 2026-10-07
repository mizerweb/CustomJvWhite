package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yz6 extends nq4 {
    public /* synthetic */ Object d;
    public final /* synthetic */ iz e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz6(iz izVar, lq4 lq4Var) {
        super(lq4Var);
        this.e = izVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
