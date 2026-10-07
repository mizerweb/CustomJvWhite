package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class lse extends nq4 {
    public h8b d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ose f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lse(ose oseVar, nq4 nq4Var) {
        super(nq4Var);
        this.f = oseVar;
    }

    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.v(null, this);
    }
}
